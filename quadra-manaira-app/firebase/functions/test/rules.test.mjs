// Testes das regras do Firestore no emulador: `npm run test:rules` (precisa de Java 11+ no PATH).
import { readFileSync } from "node:fs";
import { after, before, beforeEach, test } from "node:test";
import { assertFails, assertSucceeds, initializeTestEnvironment } from "@firebase/rules-unit-testing";
import { doc, getDoc, increment, serverTimestamp, setDoc, Timestamp, updateDoc, writeBatch, addDoc, collection } from "firebase/firestore";

const ANA = "ana0000000000000000000000001";
const BIA = "bia0000000000000000000000002";
let env;

before(async () => {
  env = await initializeTestEnvironment({
    projectId: "demo-quadra",
    firestore: { rules: readFileSync(new URL("../../firestore.rules", import.meta.url), "utf8") },
  });
});
after(() => env.cleanup());

beforeEach(async () => {
  await env.clearFirestore();
  await env.withSecurityRulesDisabled(async (ctx) => {
    const db = ctx.firestore();
    for (const [uid, name] of [[ANA, "Ana"], [BIA, "Bia"]]) {
      await setDoc(doc(db, `users/${uid}`), { name, nameLower: name.toLowerCase(), birthDayMonth: "", sport: "FUTEBOL", avatar: "⚽" });
    }
    await setDoc(doc(db, "posts/p1"), { authorId: BIA, authorName: "Bia", authorAvatar: "⚽", sport: "FUTEBOL", text: "oi", likesCount: 0 });
  });
});

const as = (uid) => env.authenticatedContext(uid, { email: `${uid}@x.com` }).firestore();
const profile = (name = "Ana") => ({ name, nameLower: name.toLowerCase(), birthDayMonth: "01/02", sport: "BASQUETE", avatar: "🏀" });

/** Agendamento + blocos num lote só, como o app faz. */
function book(db, id, start, end, slots, extra = {}) {
  const b = writeBatch(db);
  b.set(doc(db, `bookings/${id}`), {
    date: "2030-01-10", startTime: start, endTime: end, startAt: Timestamp.now(), sport: "FUTEBOL",
    organizerId: ANA, organizerName: "Ana", notes: "", status: "CONFIRMED", reminderSent: false, createdAt: serverTimestamp(), ...extra,
  });
  for (const s of slots) b.set(doc(db, `slots/2030-01-10_${s}`), { bookingId: id, organizerId: ANA, date: "2030-01-10" });
  return b.commit();
}

test("perfil: só o dono escreve, com campos válidos", async () => {
  await assertSucceeds(setDoc(doc(as(ANA), `users/${ANA}`), profile()));
  await assertFails(setDoc(doc(as(ANA), `users/${BIA}`), profile("Bia")));
  await assertFails(setDoc(doc(as(ANA), `users/${ANA}`), { ...profile(), avatar: "💀" }));
  await assertFails(setDoc(doc(as(ANA), `users/${ANA}`), { ...profile(), admin: true }));
});

test("dados privados: só o dono lê, e o e-mail tem de ser o do login", async () => {
  await assertSucceeds(setDoc(doc(as(ANA), `users/${ANA}/private/data`), { email: `${ANA}@x.com`, birthDate: "01/02/2000" }));
  await assertFails(setDoc(doc(as(ANA), `users/${ANA}/private/data`), { email: "outro@x.com", birthDate: "" }));
  await assertSucceeds(getDoc(doc(as(ANA), `users/${ANA}/private/data`)));
  await assertFails(getDoc(doc(as(BIA), `users/${ANA}/private/data`)));
});

test("agenda: jogo com todos os blocos passa; conflito e jogo sem blocos não", async () => {
  await assertSucceeds(book(as(ANA), "b1", "18:00", "19:30", ["18:00", "18:30", "19:00"]));
  await assertFails(book(as(ANA), "b2", "19:00", "20:00", ["19:00", "19:30"])); // 19:00 já é do b1
  await assertFails(book(as(ANA), "b3", "20:00", "21:00", ["20:00"])); // faltou o bloco 20:30
  await assertFails(book(as(ANA), "b4", "06:00", "09:30", ["06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00"])); // > 3 h
  await assertFails(book(as(ANA), "b5", "10:00", "10:30", ["10:00"], { organizerName: "Bia" })); // nome falso
  await assertFails(book(as(ANA), "b6", "05:30", "06:30", ["05:30", "06:00"])); // antes de abrir
});

test("agenda: só o organizador cancela, e só muda o status", async () => {
  await book(as(ANA), "b1", "18:00", "19:00", ["18:00", "18:30"]);
  await assertFails(updateDoc(doc(as(BIA), "bookings/b1"), { status: "CANCELLED" }));
  await assertFails(updateDoc(doc(as(ANA), "bookings/b1"), { status: "CANCELLED", notes: "x" }));
  await assertSucceeds(updateDoc(doc(as(ANA), "bookings/b1"), { status: "CANCELLED" }));
  await assertFails(setDoc(doc(as(BIA), "slots/2030-01-10_18:00"), { bookingId: "b1", organizerId: BIA, date: "2030-01-10" }));
});

test("mural: curtida e contador andam juntos", async () => {
  const db = as(ANA);
  const like = (n) => writeBatch(db).set(doc(db, `posts/p1/likes/${ANA}`), { uid: ANA, createdAt: serverTimestamp() }).update(doc(db, "posts/p1"), { likesCount: increment(n) }).commit();
  await assertFails(like(2));
  await assertFails(setDoc(doc(db, `posts/p1/likes/${ANA}`), { uid: ANA })); // curtida sem contador
  await assertSucceeds(like(1));
  await assertFails(like(1)); // curtir duas vezes
  await assertFails(updateDoc(doc(db, "posts/p1"), { text: "editado" }));
  await assertFails(addDoc(collection(db, "posts"), { authorId: ANA, authorName: "Bia", authorAvatar: "⚽", sport: "FUTEBOL", text: "x", likesCount: 0 }));
  await assertSucceeds(addDoc(collection(db, "posts"), { authorId: ANA, authorName: "Ana", authorAvatar: "⚽", sport: "FUTEBOL", text: "x", likesCount: 0, createdAt: serverTimestamp() }));
});

test("conversas: mensagem em nome próprio, contadores honestos e bloqueio", async () => {
  const conv = `${ANA}_${BIA}`;
  const send = (db, from, to, unread = { [to]: increment(1) }, names = { [ANA]: "Ana", [BIA]: "Bia" }) => writeBatch(db)
    .set(doc(db, `conversations/${conv}`), { participants: [ANA, BIA], names, lastMessage: "oi", lastSenderId: from, lastAt: serverTimestamp(), unread }, { merge: true })
    .set(doc(db, `conversations/${conv}/messages/m${Math.random()}`), { senderId: from, receiverId: to, text: "oi", createdAt: serverTimestamp() })
    .commit();
  await assertSucceeds(send(as(ANA), ANA, BIA));
  await assertFails(send(as(ANA), BIA, ANA)); // fingindo ser a Bia
  await assertFails(send(as(ANA), ANA, BIA, { [BIA]: increment(5) })); // inflando não lidas
  await assertFails(send(as(ANA), ANA, BIA, undefined, { [ANA]: "Ana", [BIA]: "Chata" })); // nome falso
  await assertFails(getDoc(doc(as("intruso00000000000000000000x"), `conversations/${conv}`)));
  await assertSucceeds(updateDoc(doc(as(BIA), `conversations/${conv}`), { [`unread.${BIA}`]: 0 }));

  await env.withSecurityRulesDisabled((ctx) => setDoc(doc(ctx.firestore(), `users/${BIA}/private/data`), { email: "", birthDate: "", blocked: [ANA] }));
  await assertFails(send(as(ANA), ANA, BIA)); // Bia bloqueou a Ana
});

test("tokens, alertas e denúncias", async () => {
  await assertSucceeds(setDoc(doc(as(ANA), `users/${ANA}/tokens/t1`), { platform: "ios", broadcasts: false, createdAt: serverTimestamp() }));
  await assertFails(setDoc(doc(as(ANA), `users/${ANA}/tokens/t2`), { platform: "web", broadcasts: true }));
  await assertFails(setDoc(doc(as(BIA), `users/${ANA}/tokens/t3`), { platform: "ios", broadcasts: true }));

  await assertFails(setDoc(doc(as(ANA), `users/${ANA}/notifications/n1`), { title: "fake", read: false }));
  await env.withSecurityRulesDisabled((ctx) => setDoc(doc(ctx.firestore(), `users/${ANA}/notifications/n1`), { title: "x", read: false }));
  await assertSucceeds(updateDoc(doc(as(ANA), `users/${ANA}/notifications/n1`), { read: true }));
  await assertFails(updateDoc(doc(as(ANA), `users/${ANA}/notifications/n1`), { title: "y" }));

  const report = { reporterId: ANA, type: "POST", targetId: "p1", targetUserId: BIA, text: "spam", createdAt: serverTimestamp() };
  await assertSucceeds(setDoc(doc(as(ANA), "reports/r1"), report));
  await assertFails(getDoc(doc(as(ANA), "reports/r1")));
  await assertFails(setDoc(doc(as(ANA), "reports/r2"), { ...report, reporterId: BIA }));
});

test("sem login não lê nada", async () => {
  const anon = env.unauthenticatedContext().firestore();
  await assertFails(getDoc(doc(anon, `users/${ANA}`)));
  await assertFails(getDoc(doc(anon, "posts/p1")));
  await assertFails(setDoc(doc(anon, "reports/r1"), { reporterId: "", type: "POST", targetId: "x", targetUserId: "y", text: "" }));
});

