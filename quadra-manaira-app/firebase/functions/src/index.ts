/**
 * Cloud Functions da Quadra de Manaíra (precisa do plano Blaze; o uso do app cabe na cota grátis).
 *
 * - Push de jogo novo / cancelado para a comunidade, menos para quem fez a ação
 * - Push de mensagem para quem recebeu
 * - Lembrete 24 h antes do jogo e aniversariantes do dia
 * - Limpeza: curtidas de post apagado, jogos antigos e dados de conta excluída
 */
import { initializeApp } from "firebase-admin/app";
import { FieldValue, Timestamp, getFirestore } from "firebase-admin/firestore";
import { getMessaging, type Message } from "firebase-admin/messaging";
import { setGlobalOptions } from "firebase-functions/v2";
import { onDocumentCreated, onDocumentDeleted, onDocumentUpdated } from "firebase-functions/v2/firestore";
import { onSchedule } from "firebase-functions/v2/scheduler";
import * as v1 from "firebase-functions/v1"; // o gatilho de conta excluída só existe na v1
import * as logger from "firebase-functions/logger";

initializeApp();
setGlobalOptions({ region: "southamerica-east1", maxInstances: 5 });

const db = getFirestore();
const TIME_ZONE = "America/Recife";
const SPORTS: Record<string, string> = {
  FUTEBOL: "Futebol",
  BASQUETE: "Basquete",
  VOLEI_PRAIA: "Vôlei de praia",
  GINASTICA: "Ginástica",
};
const sport = (s: string) => SPORTS[s] ?? s;
const dayMonth = (iso: string) => `${iso.slice(8, 10)}/${iso.slice(5, 7)}`;
const todayIso = () => new Intl.DateTimeFormat("en-CA", { timeZone: TIME_ZONE }).format(new Date()); // yyyy-MM-dd

type Kind = "BOOKING" | "CHAT" | "ALERT_24H" | "BIRTHDAY";
type Token = { uid: string; token: string };

/** Mesma notificação nos dois sistemas; `key` faz a nova substituir a antiga em vez de empilhar. */
function message(token: string, title: string, body: string, key: string): Message {
  return {
    token,
    notification: { title, body },
    android: { priority: "high", notification: { channelId: "quadra", tag: key } },
    apns: { headers: { "apns-collapse-id": key.slice(0, 64) }, payload: { aps: { sound: "default" } } },
  };
}

/** Envia e apaga do Firestore os tokens de aparelhos que desinstalaram o app. */
async function send(tokens: Token[], title: string, body: string, key: string) {
  for (let i = 0; i < tokens.length; i += 500) {
    const batch = tokens.slice(i, i + 500);
    const res = await getMessaging().sendEach(batch.map((t) => message(t.token, title, body, key)));
    await Promise.all(res.responses.map((r, j) => {
      const code = r.error?.code ?? "";
      if (r.success || !code.includes("registration-token-not-registered") && !code.includes("invalid-registration-token")) return;
      return db.doc(`users/${batch[j].uid}/tokens/${batch[j].token}`).delete();
    }));
  }
}

/** Grava no histórico da pessoa e manda push para os aparelhos dela. */
async function notifyUser(uid: string, kind: Kind, title: string, body: string, key: string) {
  await db.collection(`users/${uid}/notifications`).add({
    type: kind, title, message: body, read: false, createdAt: FieldValue.serverTimestamp(),
  });
  const snap = await db.collection(`users/${uid}/tokens`).get();
  await send(snap.docs.map((d) => ({ uid, token: d.id })), title, body, key);
}

/**
 * Aviso geral: todos os aparelhos com `broadcasts` ligado, menos os de quem causou o evento.
 * ponytail: lê todos os tokens a cada aviso; ok até alguns milhares de aparelhos, depois trocar por tópicos.
 */
async function notifyAll(title: string, body: string, key: string, exceptUid: string) {
  const snap = await db.collectionGroup("tokens").get();
  const tokens = snap.docs
    .filter((d) => d.get("broadcasts") !== false)
    .map((d) => ({ uid: d.ref.parent.parent!.id, token: d.id }))
    .filter((t) => t.uid !== exceptUid);
  await send(tokens, title, body, key);
}

// ---------- Agenda ----------

export const onBookingCreated = onDocumentCreated("bookings/{id}", async (event) => {
  const b = event.data?.data();
  if (!b) return;
  const when = `${dayMonth(b.date)} às ${b.startTime}`;
  const key = `booking_${event.params.id}`;
  await notifyUser(b.organizerId, "BOOKING", "Jogo agendado",
    `${sport(b.sport)} em ${when} está confirmado. Você recebe um lembrete 24 h antes.`, key);
  await notifyAll("Jogo novo na quadra", `${b.organizerName} marcou ${sport(b.sport)} em ${when}.`, key, b.organizerId);
});

export const onBookingUpdated = onDocumentUpdated("bookings/{id}", async (event) => {
  const before = event.data?.before.data();
  const after = event.data?.after.data();
  if (!before || !after || before.status === "CANCELLED" || after.status !== "CANCELLED") return;
  await notifyAll("Horário liberado",
    `O jogo de ${sport(after.sport)} em ${dayMonth(after.date)} às ${after.startTime} foi cancelado.`,
    `booking_${event.params.id}`, after.organizerId);
});

// ---------- Conversas ----------

export const onMessageCreated = onDocumentCreated("conversations/{convId}/messages/{id}", async (event) => {
  const m = event.data?.data();
  if (!m) return;
  const sender = await db.doc(`users/${m.senderId}`).get();
  await notifyUser(m.receiverId, "CHAT", `Mensagem de ${sender.get("name") ?? "alguém da quadra"}`,
    String(m.text).slice(0, 100), `chat_${event.params.convId}`);
});

// ---------- Lembrete 24 h antes ----------

export const bookingReminders = onSchedule({ schedule: "every 15 minutes", timeZone: TIME_ZONE }, async () => {
  const now = Date.now();
  const snap = await db.collection("bookings")
    .where("reminderSent", "==", false)
    .where("startAt", "<=", Timestamp.fromMillis(now + 24 * 3600 * 1000))
    .get();
  for (const doc of snap.docs) {
    const b = doc.data();
    // Jogo cancelado ou que já passou só é marcado, sem aviso.
    if (b.status === "CONFIRMED" && (b.startAt as Timestamp).toMillis() > now) {
      await notifyUser(b.organizerId, "ALERT_24H", "Seu jogo é amanhã",
        `${sport(b.sport)} na Quadra de Manaíra, ${dayMonth(b.date)} às ${b.startTime}.`, `reminder_${doc.id}`);
    }
    await doc.ref.update({ reminderSent: true });
  }
  logger.info(`Lembretes processados: ${snap.size}`);
});

// ---------- Aniversários ----------

export const birthdays = onSchedule({ schedule: "0 8 * * *", timeZone: TIME_ZONE }, async () => {
  const today = dayMonth(todayIso());
  const snap = await db.collection("users").where("birthDayMonth", "==", today).get();
  for (const doc of snap.docs) {
    const name = doc.get("name") as string;
    await notifyUser(doc.id, "BIRTHDAY", "Feliz aniversário!", `A galera da Quadra de Manaíra deseja um ótimo dia, ${name}.`, `birthday_${doc.id}`);
    await notifyAll("Aniversário na quadra", `Hoje é aniversário de ${name}. Mande os parabéns pelo app.`, `birthday_${doc.id}`, doc.id);
  }
  logger.info(`Aniversariantes de ${today}: ${snap.size}`);
});

// ---------- Limpeza ----------

/** Post apagado: remove as curtidas que ficariam órfãs. */
export const onPostDeleted = onDocumentDeleted("posts/{id}", async (event) => {
  await db.recursiveDelete(db.collection(`posts/${event.params.id}/likes`));
});

/** Todo dia 1º: apaga jogos e blocos de horário de datas passadas. */
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

/**
 * Conta excluída pelo app (LGPD e regra das lojas): apaga posts, curtidas, conversas, jogos e o perfil.
 * Jogos futuros viram cancelados, e o aviso de horário liberado sai pelo onBookingUpdated.
 */
export const onUserDeleted = v1.region("southamerica-east1").auth.user().onDelete(async (user) => {
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

  await db.recursiveDelete(db.doc(`users/${uid}`));
  logger.info(`Conta ${uid} excluída: ${posts.size} posts, ${likes.size} curtidas, ${conversations.size} conversas, ${bookings.size} jogos`);
});
