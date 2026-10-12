// Testes das regras do Firestore. Rodar com: npm run test:rules (sobe o emulador; precisa de Java).
import { readFileSync } from "node:fs";
import { after, beforeEach, test } from "node:test";
import { assertFails, assertSucceeds, initializeTestEnvironment } from "@firebase/rules-unit-testing";
import { doc, getDoc, increment, setDoc, updateDoc, writeBatch } from "firebase/firestore";

const env = await initializeTestEnvironment({
  projectId: "quadra-rules-test",
  firestore: { rules: readFileSync(new URL("../../firestore.rules", import.meta.url), "utf8") },
});
after(() => env.cleanup());

const A = "alice", B = "bob";
const db = (uid) => env.authenticatedContext(uid, { email: `${uid}@x.com` }).firestore();
const profile = (name) => ({ name, nameLower: name.toLowerCase(), birthDayMonth: "01/02", sport: "FUTEBOL", avatar: "⚽" });

beforeEach(async () => {
  await env.clearFirestore();
  await env.withSecurityRulesDisabled(async (ctx) => {
    const f = ctx.firestore();
    await setDoc(doc(f, "users", A), profile("Alice"));
    await setDoc(doc(f, "users", B), profile("Bob"));
    await setDoc(doc(f, "users", A, "private", "data"), { email: "alice@x.com", birthDate: "01/02/1990", blocked: [] });
  });
});

// ---------- Usuários ----------

test("perfil público não aceita e-mail nem nascimento completo", async () => {
  await assertFails(setDoc(doc(db(A), "users", A), { ...profile("Alice"), email: "alice@x.com" }));
  await assertSucceeds(setDoc(doc(db(A), "users", A), profile("Alice Silva")));
});

test("dados privados: só o dono lê e grava, com o próprio e-mail", async () => {
  await assertSucceeds(getDoc(doc(db(A), "users", A, "private", "data")));
  await assertFails(getDoc(doc(db(B), "users", A, "private", "data")));
  await assertFails(setDoc(doc(db(B), "users", B, "private", "data"), { email: "outro@x.com", birthDate: "" }));
  await assertSucceeds(setDoc(doc(db(B), "users", B, "private", "data"), { email: "bob@x.com", birthDate: "" }));
});

// ---------- Agendamentos ----------

function booking(f, id, uid, start, end, slots, date = "2030-01-10") {
  const b = writeBatch(f);
  b.set(doc(f, "bookings", id), {
    date, startTime: start, endTime: end, sport: "FUTEBOL", organizerId: uid, organizerName: "X",
    notes: "", status: "CONFIRMED", reminderSent: false,
  });
  for (const s of slots) b.set(doc(f, "slots", s), { bookingId: id, organizerId: uid, date: s.split("_")[0] });
  return b.commit();
}

test("agendamento com todos os blocos passa", async () => {
  await assertSucceeds(booking(db(A), "b1", A, "08:30", "10:00",
    ["2030-01-10_08:30", "2030-01-10_09:00", "2030-01-10_09:30"]));
});

test("agendamento que reserva só o primeiro bloco falha", async () => {
  await assertFails(booking(db(A), "b1", A, "08:00", "10:00", ["2030-01-10_08:00"]));
});

test("bloco fora do intervalo ou de outra data falha", async () => {
  await assertFails(booking(db(A), "b1", A, "08:00", "08:30", ["2030-01-10_08:00", "2030-01-10_12:00"]));
  await assertFails(booking(db(A), "b1", A, "08:00", "08:30", ["2030-01-10_08:00", "2030-01-11_08:00"]));
});

test("mais de 3h falha", async () => {
  const slots = ["08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30"].map((t) => `2030-01-10_${t}`);
  await assertFails(booking(db(A), "b1", A, "08:00", "12:00", slots));
});

test("horário já ocupado por outro não pode ser reservado", async () => {
  await assertSucceeds(booking(db(A), "b1", A, "08:00", "09:00", ["2030-01-10_08:00", "2030-01-10_08:30"]));
  await assertFails(booking(db(B), "b2", B, "08:30", "09:30", ["2030-01-10_08:30", "2030-01-10_09:00"]));
});

test("não cria agendamento em nome de outro", async () => {
  await assertFails(booking(db(B), "b1", A, "08:00", "08:30", ["2030-01-10_08:00"]));
});

// ---------- Chat ----------

const CONV = [A, B].sort().join("_");

function send(f, from, to, names, text = "oi") {
  const b = writeBatch(f);
  b.set(doc(f, "conversations", CONV), {
    participants: [A, B].sort(), names, lastMessage: text, lastSenderId: from,
    unread: { [to]: increment(1) },
  }, { merge: true });
  b.set(doc(f, "conversations", CONV, "messages", `m${Math.random()}`), { senderId: from, receiverId: to, text });
  return b.commit();
}

test("mensagem normal passa e não lidas zeram", async () => {
  await assertSucceeds(send(db(A), A, B, { [A]: "Alice", [B]: "Bob" }));
  await assertSucceeds(updateDoc(doc(db(B), "conversations", CONV), `unread.${B}`, 0));
});

test("não dá pra falsificar nomes", async () => {
  await assertFails(send(db(A), A, B, { [A]: "Admin", [B]: "Bob" }));
  await assertFails(send(db(A), A, B, { [A]: "Alice", [B]: "Bobão" }));
});

test("não dá pra mexer nas não lidas à vontade", async () => {
  await assertSucceeds(send(db(A), A, B, { [A]: "Alice", [B]: "Bob" }));
  await assertFails(updateDoc(doc(db(A), "conversations", CONV), `unread.${B}`, 50));
  await assertFails(updateDoc(doc(db(A), "conversations", CONV), `unread.${B}`, 0));
});

test("terceiro não lê a conversa", async () => {
  await assertSucceeds(send(db(A), A, B, { [A]: "Alice", [B]: "Bob" }));
  await assertFails(getDoc(doc(db("carol"), "conversations", CONV)));
});

test("bloqueado não consegue mandar mensagem", async () => {
  await assertSucceeds(send(db(B), B, A, { [A]: "Alice", [B]: "Bob" }));
  await env.withSecurityRulesDisabled((ctx) =>
    updateDoc(doc(ctx.firestore(), "users", A, "private", "data"), { blocked: [B] }));
  await assertFails(send(db(B), B, A, { [A]: "Alice", [B]: "Bob" }));
});

// ---------- Mural e denúncias ----------

test("curtir duas vezes falha", async () => {
  await env.withSecurityRulesDisabled((ctx) =>
    setDoc(doc(ctx.firestore(), "posts", "p1"), { authorId: B, text: "oi", likesCount: 0 }));
  const like = (f) => {
    const b = writeBatch(f);
    b.set(doc(f, "posts", "p1", "likes", A), { uid: A });
    b.update(doc(f, "posts", "p1"), { likesCount: increment(1) });
    return b.commit();
  };
  await assertSucceeds(like(db(A)));
  await assertFails(like(db(A)));
});

test("denúncia: cria, mas não lê", async () => {
  const r = { reporterId: A, type: "POST", targetId: "p1", targetUserId: B, text: "spam" };
  await assertSucceeds(setDoc(doc(db(A), "reports", "r1"), r));
  await assertFails(setDoc(doc(db(A), "reports", "r2"), { ...r, reporterId: B }));
  await assertFails(getDoc(doc(db(A), "reports", "r1")));
});
