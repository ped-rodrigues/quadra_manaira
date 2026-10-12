/**
 * Cloud Functions da Quadra de Manaíra.
 *
 * - Push de novo agendamento / cancelamento (para todos, via tópico "quadra")
 * - Push de mensagem privada para o DESTINATÁRIO (corrige F4)
 * - Lembrete de verdade 24h antes do jogo (corrige F3)
 * - Aniversariantes do dia (corrige F2)
 * - Limpeza: curtidas de post apagado, agendamentos antigos, dados de conta excluída
 *
 * Requer o plano Blaze do Firebase (tem cota gratuita; o uso deste app cabe nela).
 */
import { initializeApp } from "firebase-admin/app";
import { FieldValue, Timestamp, getFirestore } from "firebase-admin/firestore";
import { getMessaging } from "firebase-admin/messaging";
import { setGlobalOptions } from "firebase-functions/v2";
import { onDocumentCreated, onDocumentDeleted, onDocumentUpdated } from "firebase-functions/v2/firestore";
import * as authV1 from "firebase-functions/v1"; // gatilho de exclusão de usuário só existe na v1
import { onSchedule } from "firebase-functions/v2/scheduler";
import * as logger from "firebase-functions/logger";

initializeApp();
setGlobalOptions({ region: "southamerica-east1", maxInstances: 5 });

const db = getFirestore();
const messaging = getMessaging();

const TOPIC_ALL = "quadra";
const TIME_ZONE = "America/Recife";
const CHANNEL_ID = "quadra_manaira";

const SPORTS: Record<string, string> = {
  FUTEBOL: "Futebol",
  BASQUETE: "Basquete",
  VOLEI_PRAIA: "Vôlei de Praia",
  GINASTICA: "Ginástica",
};

type NotificationType = "BOOKING" | "CHAT" | "ALERT_24H" | "BIRTHDAY" | "SYSTEM";

function formatDate(isoDate: string): string {
  const [, month, day] = isoDate.split("-");
  return `${day}/${month}`;
}

function androidConfig(key: string) {
  return {
    priority: "high" as const,
    notification: { channelId: CHANNEL_ID, tag: key },
  };
}

/** Grava no histórico do usuário e envia push para todos os aparelhos dele. */
async function notifyUser(uid: string, type: NotificationType, title: string, body: string, key: string) {
  await db.collection("users").doc(uid).collection("notifications").add({
    type,
    title,
    message: body,
    read: false,
    createdAt: FieldValue.serverTimestamp(),
  });

  const tokensSnap = await db.collection("users").doc(uid).collection("tokens").get();
  const tokens = tokensSnap.docs.map((d) => d.id);
  if (tokens.length === 0) return;

  const response = await messaging.sendEachForMulticast({
    tokens,
    notification: { title, body },
    data: { type, key, title, body },
    android: androidConfig(key),
  });

  // Remove tokens de aparelhos que desinstalaram o app ou trocaram de token.
  const invalid = response.responses
    .map((r, i) => ({ r, token: tokens[i] }))
    .filter(({ r }) =>
      !r.success &&
      ["messaging/registration-token-not-registered", "messaging/invalid-registration-token"]
        .includes(r.error?.code ?? ""))
    .map(({ token }) => token);
  await Promise.all(invalid.map((t) => db.collection("users").doc(uid).collection("tokens").doc(t).delete()));
}

/**
 * Aviso geral pelo tópico. Vai só com `data` (sem `notification`) para o app sempre decidir se mostra:
 * ele esconde o aviso de quem causou o evento (`excludeUid`, que já recebe o aviso pessoal)
 * e de quem silenciou os avisos gerais nas configurações.
 */
async function notifyAll(type: NotificationType, title: string, body: string, key: string, excludeUid = "") {
  await messaging.send({
    topic: TOPIC_ALL,
    data: { type, key, title, body, excludeUid },
    android: { priority: "high" },
  });
}

function todayIso(): string {
  // "en-CA" formata como yyyy-MM-dd.
  return new Intl.DateTimeFormat("en-CA", { timeZone: TIME_ZONE }).format(new Date());
}

// ---------- Agendamentos ----------

export const onBookingCreated = onDocumentCreated("bookings/{bookingId}", async (event) => {
  const b = event.data?.data();
  if (!b) return;
  const sport = SPORTS[b.sport] ?? b.sport;
  const when = `${formatDate(b.date)} às ${b.startTime}`;

  await notifyUser(
    b.organizerId, "BOOKING", "✅ Jogo agendado",
    `Seu jogo de ${sport} em ${when} está confirmado. Você recebe um lembrete 24h antes.`,
    `booking_${event.params.bookingId}`,
  );
  await notifyAll(
    "BOOKING", "📅 Novo agendamento na quadra",
    `${b.organizerName} agendou ${sport} em ${when}. Confira na Agenda!`,
    `booking_${event.params.bookingId}`,
    b.organizerId,
  );
});

export const onBookingUpdated = onDocumentUpdated("bookings/{bookingId}", async (event) => {
  const before = event.data?.before.data();
  const after = event.data?.after.data();
  if (!before || !after) return;
  if (before.status === "CANCELLED" || after.status !== "CANCELLED") return;

  const sport = SPORTS[after.sport] ?? after.sport;
  await notifyAll(
    "BOOKING", "❌ Agendamento cancelado",
    `O jogo de ${sport} em ${formatDate(after.date)} às ${after.startTime} foi cancelado. Horário liberado!`,
    `booking_${event.params.bookingId}`,
    after.organizerId,
  );
});

// ---------- Chat ----------

export const onMessageCreated = onDocumentCreated("conversations/{convId}/messages/{messageId}", async (event) => {
  const m = event.data?.data();
  if (!m) return;
  const sender = await db.collection("users").doc(m.senderId).get();
  const senderName = (sender.get("name") as string | undefined) ?? "Atleta";
  const preview = String(m.text).slice(0, 100);

  await notifyUser(m.receiverId, "CHAT", `💬 Nova mensagem de ${senderName}`, preview, `chat_${event.params.convId}`);
});

// ---------- Lembrete 24h antes ----------

export const bookingReminders = onSchedule({ schedule: "every 15 minutes", timeZone: TIME_ZONE }, async () => {
  const now = Date.now();
  const snap = await db.collection("bookings")
    .where("reminderSent", "==", false)
    .where("startAt", "<=", Timestamp.fromMillis(now + 24 * 60 * 60 * 1000))
    .get();

  for (const doc of snap.docs) {
    const b = doc.data();
    const startAt = (b.startAt as Timestamp).toMillis();
    // Jogos que já passaram ou cancelados só são marcados, sem notificar.
    if (b.status === "CONFIRMED" && startAt > now) {
      const sport = SPORTS[b.sport] ?? b.sport;
      await notifyUser(
        b.organizerId, "ALERT_24H", "⏰ Lembrete: jogo amanhã!",
        `Faltam menos de 24h para o seu jogo de ${sport} na Quadra de Manaíra (${formatDate(b.date)} às ${b.startTime}). Prepare seu material!`,
        `reminder_${doc.id}`,
      );
    }
    await doc.ref.update({ reminderSent: true });
  }
  logger.info(`Lembretes processados: ${snap.size}`);
});

// ---------- Aniversários ----------

export const birthdays = onSchedule({ schedule: "0 8 * * *", timeZone: TIME_ZONE }, async () => {
  const today = new Intl.DateTimeFormat("pt-BR", { timeZone: TIME_ZONE, day: "2-digit", month: "2-digit" })
    .format(new Date()); // "dd/MM"
  const snap = await db.collection("users").where("birthDayMonth", "==", today).get();

  for (const doc of snap.docs) {
    const name = doc.get("name") as string;
    const sport = SPORTS[doc.get("sport") as string] ?? "";
    await notifyUser(
      doc.id, "BIRTHDAY", "🎉 Feliz aniversário!",
      `A comunidade da Quadra de Manaíra deseja um ótimo dia, ${name}!`,
      `birthday_${doc.id}`,
    );
    await notifyAll(
      "BIRTHDAY", "🎂 Aniversário na comunidade!",
      `Hoje é aniversário de ${name}${sport ? ` (${sport})` : ""}! Dê os parabéns pelo chat.`,
      `birthday_${doc.id}`,
      doc.id,
    );
  }
  logger.info(`Aniversariantes hoje (${today}): ${snap.size}`);
});

// ---------- Limpeza ----------

/** Post apagado: remove as curtidas que ficariam órfãs em `posts/{id}/likes`. */
export const onPostDeleted = onDocumentDeleted("posts/{postId}", async (event) => {
  await db.recursiveDelete(db.collection("posts").doc(event.params.postId).collection("likes"));
});

/** Todo dia 1º, apaga agendamentos e blocos de horário de datas que já passaram. */
export const monthlyCleanup = onSchedule({ schedule: "0 4 1 * *", timeZone: TIME_ZONE }, async () => {
  const today = todayIso();
  const writer = db.bulkWriter();
  let count = 0;
  for (const col of ["bookings", "slots"]) {
    const snap = await db.collection(col).where("date", "<", today).get();
    snap.docs.forEach((d) => writer.delete(d.ref));
    count += snap.size;
  }
  await writer.close();
  logger.info(`Limpeza: ${count} documentos antigos apagados`);
});

// ---------- Exclusão de conta ----------

/**
 * O app apaga o usuário do Auth (exige login recente); aqui apagamos os dados dele (LGPD / Play Store):
 * posts, curtidas, conversas, agendamentos e o perfil com tokens, notificações e dados privados.
 * Jogos futuros são cancelados (o aviso de "horário liberado" sai pelo onBookingUpdated).
 */
export const onUserDeleted = authV1.region("southamerica-east1").auth.user().onDelete(async (user) => {
  const uid = user.uid;
  const today = todayIso();

  const posts = await db.collection("posts").where("authorId", "==", uid).get();
  for (const p of posts.docs) await db.recursiveDelete(p.ref);

  const likes = await db.collectionGroup("likes").where("uid", "==", uid).get();
  for (const like of likes.docs) {
    await like.ref.delete();
    await like.ref.parent.parent?.update({ likesCount: FieldValue.increment(-1) }).catch(() => undefined);
  }

  const conversations = await db.collection("conversations").where("participants", "array-contains", uid).get();
  for (const c of conversations.docs) await db.recursiveDelete(c.ref);

  const bookings = await db.collection("bookings").where("organizerId", "==", uid).get();
  for (const b of bookings.docs) {
    const slots = await db.collection("slots").where("bookingId", "==", b.id).get();
    await Promise.all(slots.docs.map((s) => s.ref.delete()));
    if (b.get("status") === "CONFIRMED" && b.get("date") >= today) {
      await b.ref.update({ status: "CANCELLED", organizerName: "Conta excluída", notes: "" });
    } else {
      await b.ref.delete();
    }
  }

  await db.recursiveDelete(db.collection("users").doc(uid));
  logger.info(`Conta ${uid} excluída: ${posts.size} posts, ${likes.size} curtidas, ` +
    `${conversations.size} conversas, ${bookings.size} agendamentos`);
});
