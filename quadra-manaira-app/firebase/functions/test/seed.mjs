// Dados de exemplo no Firebase Emulator (nunca no projeto real): `npm run seed` com os emuladores ligados.
// Contas: ana@teste.com e bia@teste.com, senha quadra123, e-mail já confirmado.
process.env.FIREBASE_AUTH_EMULATOR_HOST ??= "127.0.0.1:9099";
process.env.FIRESTORE_EMULATOR_HOST ??= "127.0.0.1:8080";

import { initializeApp } from "firebase-admin/app";
import { getAuth } from "firebase-admin/auth";
import { Timestamp, getFirestore } from "firebase-admin/firestore";

initializeApp({ projectId: "demo-quadra" });
const auth = getAuth();
const db = getFirestore();

const people = [
  { uid: "ana", name: "Ana Lima", email: "ana@teste.com", birth: "14/03/1998", sport: "VOLEI_PRAIA", avatar: "🏐" },
  { uid: "bia", name: "Bia Souza", email: "bia@teste.com", birth: "02/11/2001", sport: "FUTEBOL", avatar: "⚽" },
];

const day = (plus) => new Date(Date.now() - 3 * 3600_000 + plus * 86400_000).toISOString().slice(0, 10); // America/Recife
const at = (date, time) => Timestamp.fromDate(new Date(`${date}T${time}:00-03:00`));
const ago = (min) => Timestamp.fromMillis(Date.now() - min * 60_000);

const batch = db.batch();
for (const p of people) {
  await auth.deleteUser(p.uid).catch(() => {});
  await auth.createUser({ uid: p.uid, email: p.email, password: "quadra123", emailVerified: true, displayName: p.name });
  batch.set(db.doc(`users/${p.uid}`), {
    name: p.name, nameLower: p.name.toLowerCase(), birthDayMonth: p.birth.slice(0, 5), sport: p.sport, avatar: p.avatar, createdAt: ago(9000),
  });
  batch.set(db.doc(`users/${p.uid}/private/data`), { email: p.email, birthDate: p.birth });
}

const games = [
  ["g1", day(0), "17:00", "18:30", "VOLEI_PRAIA", people[0], "Dupla contra dupla, chega mais"],
  ["g2", day(0), "19:00", "20:00", "FUTEBOL", people[1], ""],
  ["g3", day(1), "06:30", "07:30", "GINASTICA", people[0], "Funcional na areia"],
  ["g4", day(2), "18:00", "21:00", "BASQUETE", people[1], "Racha 3x3"],
];
for (const [id, date, start, end, sport, p, notes] of games) {
  batch.set(db.doc(`bookings/${id}`), {
    date, startTime: start, endTime: end, startAt: at(date, start), sport, organizerId: p.uid, organizerName: p.name,
    notes, status: "CONFIRMED", reminderSent: false, createdAt: ago(120),
  });
  for (let m = +start.slice(0, 2) * 60 + +start.slice(3); m < +end.slice(0, 2) * 60 + +end.slice(3); m += 30) {
    const t = `${String(m / 60 | 0).padStart(2, "0")}:${String(m % 60).padStart(2, "0")}`;
    batch.set(db.doc(`slots/${date}_${t}`), { bookingId: id, organizerId: p.uid, date });
  }
}

batch.set(db.doc("posts/p1"), {
  authorId: "bia", authorName: "Bia Souza", authorAvatar: "⚽", sport: "FUTEBOL",
  text: "Falta um pro futebol das 19h hoje. Quem cola?", likesCount: 1, createdAt: ago(35),
});
batch.set(db.doc("posts/p1/likes/ana"), { uid: "ana", createdAt: ago(30) });
batch.set(db.doc("posts/p2"), {
  authorId: "ana", authorName: "Ana Lima", authorAvatar: "🏐", sport: "VOLEI_PRAIA",
  text: "Rede nova na areia! Ficou ótima pro vôlei de fim de tarde.", likesCount: 0, createdAt: ago(300),
});

batch.set(db.doc("conversations/ana_bia"), {
  participants: ["ana", "bia"], names: { ana: "Ana Lima", bia: "Bia Souza" },
  lastMessage: "Fechado, levo a bola!", lastSenderId: "bia", lastAt: ago(10), unread: { ana: 1, bia: 0 },
});
batch.set(db.doc("conversations/ana_bia/messages/m1"), { senderId: "ana", receiverId: "bia", text: "Bora no vôlei às 17h?", createdAt: ago(15) });
batch.set(db.doc("conversations/ana_bia/messages/m2"), { senderId: "bia", receiverId: "ana", text: "Fechado, levo a bola!", createdAt: ago(10) });
batch.set(db.doc("users/ana/notifications/n1"), {
  type: "BOOKING", title: "Novo jogo na quadra", message: "Bia Souza agendou futebol hoje às 19:00.", createdAt: ago(120), read: false,
});

await batch.commit();
console.log("Pronto: ana@teste.com / bia@teste.com, senha quadra123");
