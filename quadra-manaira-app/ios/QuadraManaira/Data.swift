import FirebaseAuth
import FirebaseFirestore
import FirebaseMessaging
import Foundation

// MARK: - Modelos

enum Sport: String, CaseIterable, Identifiable {
    case FUTEBOL, BASQUETE, VOLEI_PRAIA, GINASTICA
    var id: String { rawValue }
    var label: String {
        switch self {
        case .FUTEBOL: "Futebol"
        case .BASQUETE: "Basquete"
        case .VOLEI_PRAIA: "Vôlei de praia"
        case .GINASTICA: "Ginástica"
        }
    }
    var emoji: String {
        switch self {
        case .FUTEBOL: "⚽"
        case .BASQUETE: "🏀"
        case .VOLEI_PRAIA: "🏐"
        case .GINASTICA: "🤸"
        }
    }
    static func of(_ s: String?) -> Sport { Sport(rawValue: s ?? "") ?? .FUTEBOL }
}

let AVATARS = ["🏄", "⚽", "🏐", "🏀", "🤸"]

struct Profile: Identifiable, Equatable {
    let id: String
    var name: String
    var sport: Sport
    var avatar: String
    // Só no meu próprio perfil (vêm de users/{uid}/private/data).
    var email = ""
    var birthDate = ""
    var blocked: Set<String> = []
}

struct Booking: Identifiable, Equatable {
    let id, date, start, end: String
    let sport: Sport
    let organizerId, organizerName, notes: String
}

struct Post: Identifiable, Equatable {
    let id, authorId, authorName, authorAvatar: String
    let sport: Sport
    let text: String
    let likes: Int
    let createdAt: Date
    let likedByMe: Bool
}

struct Conversation: Identifiable, Equatable {
    let id, otherId, otherName, lastMessage: String
    let lastAt: Date
    let unread: Int
}

struct Message: Identifiable, Equatable {
    let id, senderId, text: String
    let createdAt: Date
}

struct Alert: Identifiable, Equatable {
    let id, type, title, message: String
    let createdAt: Date
    let read: Bool
}

struct Weather {
    let tempC, windKmh: Int
    let condition, sunrise: String
}

enum Session: Equatable {
    case loading, signedOut
    /// Cadastro por e-mail ainda não confirmado: as regras só deixam mexer no próprio perfil.
    case unverified(String)
    /// Logado sem perfil completo (cadastro interrompido).
    case needsProfile(Profile?)
    case ready(Profile)
}

struct UserError: LocalizedError {
    let message: String
    init(_ m: String) { message = m }
    var errorDescription: String? { message }
}

// MARK: - Regras da quadra (puras, testadas em LogicTests)

enum Quadra {
    static let zone = TimeZone(identifier: "America/Recife")!
    static let open = 6 * 60, close = 22 * 60, maxMinutes = 180
    static let name = "Quadra Poliesportiva de Manaíra"
    static let lat = -7.0982, lng = -34.8315
    static let address = "Orla de Manaíra, Av. Gov. Flávio Ribeiro Coutinho com Av. João Maurício\nJoão Pessoa, PB, 58038-000"
    static let site = URL(string: "https://quadramanaira.com.br")!
    static let infrastructure = [
        ("Iluminação de LED", "A quadra funciona até as 22h com boa visibilidade."),
        ("Quadra poliesportiva", "Marcações de futsal e basquete, com areia ao lado para o vôlei."),
        ("Água por perto", "Bebedouros e quiosques no calçadão."),
        ("Acesso livre", "Espaço público e gratuito de João Pessoa."),
    ]
    static let shareText = "Bora jogar na Quadra de Manaíra? Pelo app dá pra ver os horários livres, agendar futebol, basquete, vôlei de praia ou ginástica e combinar com a galera pelo chat."

    static var calendar: Calendar {
        var c = Calendar(identifier: .gregorian)
        c.timeZone = zone
        c.locale = Locale(identifier: "pt_BR")
        return c
    }
    /// "yyyy-MM-dd" no fuso da quadra.
    static func iso(_ d: Date) -> String {
        let c = calendar.dateComponents([.year, .month, .day], from: d)
        return String(format: "%04d-%02d-%02d", c.year!, c.month!, c.day!)
    }
    static func date(_ iso: String) -> Date? {
        let p = iso.split(separator: "-").compactMap { Int($0) }
        guard p.count == 3 else { return nil }
        return calendar.date(from: DateComponents(year: p[0], month: p[1], day: p[2]))
    }
    static func nowMinutes(_ now: Date = Date()) -> Int {
        let c = calendar.dateComponents([.hour, .minute], from: now)
        return c.hour! * 60 + c.minute!
    }
}

func minutes(_ t: String) -> Int { (Int(t.prefix(2)) ?? 0) * 60 + (Int(t.suffix(2)) ?? 0) }
func hhmm(_ m: Int) -> String { String(format: "%02d:%02d", m / 60, m % 60) }

/// Blocos de 30 min ocupados por um jogo: [início, fim).
func slots(_ start: String, _ end: String) -> [String] { stride(from: minutes(start), to: minutes(end), by: 30).map(hhmm) }

func overlaps(_ s1: Int, _ e1: Int, _ s2: Int, _ e2: Int) -> Bool { s1 < e2 && s2 < e1 }

/// Mensagem de erro, ou nil se o horário é válido. O servidor confere de novo nas regras.
func bookingError(day: String, start: String, end: String, now: Date) -> String? {
    let s = minutes(start), e = minutes(end)
    if s % 30 != 0 || e % 30 != 0 { return "Escolha horários cheios ou de meia hora." }
    if e <= s { return "O fim precisa ser depois do início." }
    if s < Quadra.open || e > Quadra.close { return "A quadra funciona das 06:00 às 22:00." }
    if e - s > Quadra.maxMinutes { return "Cada agendamento pode ter até 3 horas." }
    let today = Quadra.iso(now)
    if day < today || (day == today && s < Quadra.nowMinutes(now)) { return "Esse horário já passou." }
    return nil
}

/// dd/MM/aaaa válido (rejeita 29/02 em ano comum), ou nil.
func parseBirth(_ s: String) -> DateComponents? {
    let p = s.trimmingCharacters(in: .whitespaces).split(separator: "/")
    guard p.count == 3, p[0].count == 2, p[1].count == 2, p[2].count == 4,
          let d = Int(p[0]), let m = Int(p[1]), let y = Int(p[2]) else { return nil }
    let comps = DateComponents(year: y, month: m, day: d)
    guard let date = Quadra.calendar.date(from: comps) else { return nil }
    let back = Quadra.calendar.dateComponents([.year, .month, .day], from: date)
    return back.day == d && back.month == m && back.year == y ? comps : nil
}

func birthError(_ s: String, today: Date = Date()) -> String? {
    guard let c = parseBirth(s), let date = Quadra.calendar.date(from: c) else { return "Data de nascimento inválida. Use dd/mm/aaaa." }
    return date > today || c.year! < 1900 ? "Data de nascimento inválida." : nil
}

func longDate(_ iso: String) -> String {
    guard let d = Quadra.date(iso) else { return iso }
    let f = DateFormatter()
    f.locale = Locale(identifier: "pt_BR")
    f.timeZone = Quadra.zone
    f.dateFormat = "EEEE, d 'de' MMMM"
    return f.string(from: d).capitalizedFirst
}

func weekday(_ d: Date) -> String {
    let f = DateFormatter()
    f.locale = Locale(identifier: "pt_BR")
    f.timeZone = Quadra.zone
    f.dateFormat = "EEE"
    return f.string(from: d).replacingOccurrences(of: ".", with: "").capitalizedFirst
}

func ago(_ d: Date, now: Date = Date()) -> String {
    let min = Int(now.timeIntervalSince(d) / 60)
    if min < 1 { return "agora" }
    if min < 60 { return "há \(min) min" }
    if min < 24 * 60 { return "há \(min / 60) h" }
    let f = DateFormatter()
    f.timeZone = Quadra.zone
    f.dateFormat = "dd/MM 'às' HH:mm"
    return f.string(from: d)
}

extension String {
    var capitalizedFirst: String { prefix(1).uppercased() + dropFirst() }
    var trimmed: String { trimmingCharacters(in: .whitespacesAndNewlines) }
}

// MARK: - Firebase

/// Listener do Firestore como AsyncStream: cancelar a task (sair da tela) remove o listener.
/// Erro (ex.: permissão após logout) só encerra o fluxo.
private func stream<T>(_ q: Query, _ map: @escaping ([QueryDocumentSnapshot]) -> T) -> AsyncStream<T> {
    AsyncStream { c in
        let reg = q.addSnapshotListener { snap, _ in
            if let snap { c.yield(map(snap.documents)) } else { c.finish() }
        }
        c.onTermination = { _ in reg.remove() }
    }
}

private extension DocumentSnapshot {
    func str(_ f: String) -> String { get(f) as? String ?? "" }
    func date(_ f: String) -> Date { (get(f, serverTimestampBehavior: .estimate) as? Timestamp)?.dateValue() ?? Date() }
    var profile: Profile {
        Profile(id: documentID, name: str("name"), sport: .of(get("sport") as? String),
                avatar: AVATARS.contains(str("avatar")) ? str("avatar") : AVATARS[0])
    }
}

/// Mesma política do Firebase Auth (console → Authentication → Política de senha).
func passwordError(_ p: String) -> String? {
    let ok = p.count >= 8 && p.contains(where: { ("a"..."z").contains($0) }) && p.contains(where: { ("0"..."9").contains($0) })
    return ok ? nil : "A senha precisa de 8 caracteres ou mais, com letra minúscula e número."
}

func friendly(_ error: Error) -> String {
    if let e = error as? UserError { return e.message }
    let ns = error as NSError
    if ns.domain == AuthErrorDomain, let code = AuthErrorCode(rawValue: ns.code) {
        switch code {
        case .weakPassword: return "A senha precisa de 8 caracteres ou mais, com letra minúscula e número."
        case .emailAlreadyInUse: return "Já existe uma conta com esse e-mail."
        case .userNotFound: return "Conta não encontrada. Toque em Criar conta."
        case .wrongPassword, .invalidCredential, .invalidEmail: return "E-mail ou senha incorretos."
        case .networkError: return "Sem internet. Confira a conexão e tente de novo."
        case .tooManyRequests: return "Muitas tentativas. Espere alguns minutos."
        case .keychainError: return "Não foi possível guardar o login neste aparelho. Tente de novo."
        case .requiresRecentLogin: return "Por segurança, saia, entre de novo e repita a exclusão."
        default: break
        }
    }
    if ns.domain == FirestoreErrorDomain {
        if ns.code == FirestoreErrorCode.permissionDenied.rawValue { return "Você não tem permissão para fazer isso." }
        if ns.code == FirestoreErrorCode.unavailable.rawValue { return "Servidor fora do ar. Tente de novo." }
        if let inner = ns.userInfo[NSUnderlyingErrorKey] as? UserError { return inner.message }
    }
    return error.localizedDescription
}

enum Repo {
    private static var auth: Auth { Auth.auth() }
    private static var db: Firestore { Firestore.firestore() }
    private static var users: CollectionReference { db.collection("users") }
    private static func privateDoc(_ uid: String) -> DocumentReference { users.document(uid).collection("private").document("data") }
    private static let prefs = UserDefaults.standard

    // MARK: Sessão e conta

    static func session() -> AsyncStream<Session> {
        AsyncStream { c in
            var regs: [ListenerRegistration] = []
            var key = "?"
            // Ouve o token, não só o login: é ele que muda quando o e-mail é confirmado (checkVerified).
            let authHandle = auth.addIDTokenDidChangeListener { _, user in
                let newKey = user.map { "\($0.uid)|\($0.isEmailVerified)" } ?? ""
                guard newKey != key else { return } // renovação de hora em hora: nada mudou
                key = newKey
                regs.forEach { $0.remove() }
                regs = []
                guard let user else { c.yield(.signedOut); return }
                guard user.isEmailVerified else { c.yield(.unverified(user.email ?? "")); return }
                var pub: DocumentSnapshot?, priv: DocumentSnapshot?
                func emit() {
                    guard let pub, let priv else { return }
                    guard pub.exists else { c.yield(.needsProfile(nil)); return }
                    var me = pub.profile
                    me.email = priv.get("email") as? String ?? user.email ?? ""
                    me.birthDate = priv.str("birthDate")
                    me.blocked = Set(priv.get("blocked") as? [String] ?? [])
                    c.yield(me.birthDate.isEmpty ? .needsProfile(me) : .ready(me))
                }
                regs.append(users.document(user.uid).addSnapshotListener { s, _ in pub = s ?? pub; emit() })
                regs.append(privateDoc(user.uid).addSnapshotListener { s, _ in priv = s ?? priv; emit() })
            }
            c.onTermination = { _ in
                Auth.auth().removeIDTokenDidChangeListener(authHandle)
                regs.forEach { $0.remove() }
            }
        }
    }

    static func login(_ email: String, _ password: String) async throws {
        if email.trimmed.isEmpty || password.isEmpty { throw UserError("Preencha e-mail e senha.") }
        try await auth.signIn(withEmail: email.trimmed, password: password)
    }

    static func register(name: String, email: String, password: String, birth: String, sport: Sport, avatar: String) async throws {
        try checkProfile(name, birth)
        if !email.trimmed.contains("@") || !email.trimmed.contains(".") { throw UserError("E-mail inválido.") }
        if let e = passwordError(password) { throw UserError(e) }
        let user = try await auth.createUser(withEmail: email.trimmed, password: password).user
        try await writeProfile(uid: user.uid, email: user.email ?? "", name: name.trimmed, birth: birth.trimmed, sport: sport, avatar: avatar, isNew: true)
        try? await user.sendEmailVerification() // se falhar, a tela de confirmação reenvia
    }

    static func resendVerification() async throws {
        try await auth.currentUser?.sendEmailVerification()
    }

    /// Recarrega a conta; confirmada, renova o token (as regras leem email_verified dele) e a sessão avança.
    static func checkVerified() async throws {
        guard let user = auth.currentUser else { return }
        try await user.reload()
        guard auth.currentUser?.isEmailVerified == true else {
            throw UserError("Ainda não confirmado. Abra o link do e-mail e tente de novo.")
        }
        _ = try await user.getIDTokenResult(forcingRefresh: true)
    }

    static func resetPassword(_ email: String) async throws {
        if email.trimmed.isEmpty { throw UserError("Digite o e-mail da sua conta.") }
        try await auth.sendPasswordReset(withEmail: email.trimmed)
    }

    static func logout() async {
        await unregisterDevice()
        try? auth.signOut()
    }

    /// A Cloud Function onUserDeleted apaga os dados da pessoa no Firestore.
    static func deleteAccount() async throws {
        guard let user = auth.currentUser else { throw UserError("Entre na sua conta.") }
        try await user.delete()
        try? await Messaging.messaging().unregister()
        prefs.removeObject(forKey: "token")
    }

    private static func checkProfile(_ name: String, _ birth: String) throws {
        if !(2...60).contains(name.trimmed.count) { throw UserError("Informe seu nome (2 a 60 letras).") }
        if let e = birthError(birth) { throw UserError(e) }
    }

    static func saveProfile(name: String, birth: String, sport: Sport, avatar: String) async throws {
        guard let user = auth.currentUser else { throw UserError("Entre na sua conta.") }
        try checkProfile(name, birth)
        try await writeProfile(uid: user.uid, email: user.email ?? "", name: name.trimmed, birth: birth.trimmed, sport: sport, avatar: avatar, isNew: false)
    }

    private static func writeProfile(uid: String, email: String, name: String, birth: String, sport: Sport, avatar: String, isNew: Bool) async throws {
        let c = parseBirth(birth)
        var pub: [String: Any] = [
            "name": name, "nameLower": name.lowercased(),
            "birthDayMonth": c.map { String(format: "%02d/%02d", $0.day!, $0.month!) } ?? "",
            "sport": sport.rawValue, "avatar": AVATARS.contains(avatar) ? avatar : AVATARS[0],
        ]
        if isNew { pub["createdAt"] = FieldValue.serverTimestamp() }
        let batch = db.batch()
        batch.setData(pub, forDocument: users.document(uid), merge: true)
        batch.setData(["email": email, "birthDate": birth], forDocument: privateDoc(uid), merge: true)
        try await batch.commit()
    }

    static func profile(_ uid: String) -> AsyncStream<Profile?> {
        AsyncStream { c in
            let reg = users.document(uid).addSnapshotListener { s, _ in
                guard let s else { c.finish(); return }
                c.yield(s.exists ? s.profile : nil)
            }
            c.onTermination = { _ in reg.remove() }
        }
    }

    static func athletes() -> AsyncStream<[Profile]> { stream(users.order(by: "nameLower")) { $0.map(\.profile) } }

    // MARK: Agenda

    /// Jogos confirmados de hoje em diante.
    static func bookings() -> AsyncStream<[Booking]> {
        stream(db.collection("bookings").whereField("date", isGreaterThanOrEqualTo: Quadra.iso(Date()))) { docs in
            docs.filter { $0.str("status") == "CONFIRMED" }.map {
                Booking(id: $0.documentID, date: $0.str("date"), start: $0.str("startTime"), end: $0.str("endTime"),
                        sport: .of($0.get("sport") as? String), organizerId: $0.str("organizerId"),
                        organizerName: $0.str("organizerName"), notes: $0.str("notes"))
            }.sorted { ($0.date, $0.start) < ($1.date, $1.start) }
        }
    }

    /// Cada jogo ocupa blocos de 30 min em slots/{data}_{HH:mm}, criados na mesma transação.
    /// As regras proíbem sobrescrever um bloco, então dois aparelhos nunca pegam o mesmo horário.
    static func book(me: Profile, day: String, start: String, end: String, sport: Sport, notes: String) async throws {
        if let e = bookingError(day: day, start: start, end: end, now: Date()) { throw UserError(e) }
        let slotRefs = slots(start, end).map { db.collection("slots").document("\(day)_\($0)") }
        let ref = db.collection("bookings").document()
        var c = Quadra.calendar.dateComponents([.year, .month, .day], from: Quadra.date(day)!)
        c.hour = minutes(start) / 60
        c.minute = minutes(start) % 60
        let startAt = Timestamp(date: Quadra.calendar.date(from: c)!)
        _ = try await db.runTransaction { tx, errorPointer -> Any? in
            for s in slotRefs {
                do {
                    if try tx.getDocument(s).exists {
                        errorPointer?.pointee = NSError(domain: FirestoreErrorDomain, code: FirestoreErrorCode.aborted.rawValue,
                                                        userInfo: [NSUnderlyingErrorKey: UserError("Horário ocupado às \(s.documentID.suffix(5)).")])
                        return nil
                    }
                } catch {
                    errorPointer?.pointee = error as NSError
                    return nil
                }
            }
            tx.setData([
                "date": day, "startTime": start, "endTime": end, "startAt": startAt,
                "sport": sport.rawValue, "organizerId": me.id, "organizerName": me.name,
                "notes": String(notes.trimmed.prefix(300)), "status": "CONFIRMED", "reminderSent": false,
                "createdAt": FieldValue.serverTimestamp(),
            ], forDocument: ref)
            for s in slotRefs { tx.setData(["bookingId": ref.documentID, "organizerId": me.id, "date": day], forDocument: s) }
            return nil
        }
    }

    static func cancel(_ b: Booking) async throws {
        let batch = db.batch()
        batch.updateData(["status": "CANCELLED"], forDocument: db.collection("bookings").document(b.id))
        for s in slots(b.start, b.end) { batch.deleteDocument(db.collection("slots").document("\(b.date)_\(s)")) }
        try await batch.commit()
    }

    // MARK: Mural

    static func posts(_ myUid: String) -> AsyncStream<[Post]> {
        AsyncStream { c in
            var docs: [QueryDocumentSnapshot]?, liked: Set<String>?
            func emit() {
                guard let docs, let liked else { return }
                c.yield(docs.map {
                    Post(id: $0.documentID, authorId: $0.str("authorId"), authorName: $0.str("authorName"),
                         authorAvatar: $0.get("authorAvatar") as? String ?? AVATARS[0], sport: .of($0.get("sport") as? String),
                         text: $0.str("text"), likes: $0.get("likesCount") as? Int ?? 0, createdAt: $0.date("createdAt"),
                         likedByMe: liked.contains($0.documentID))
                })
            }
            let r1 = db.collection("posts").order(by: "createdAt", descending: true).limit(to: 100)
                .addSnapshotListener { s, _ in docs = s?.documents ?? docs; emit() }
            let r2 = db.collectionGroup("likes").whereField("uid", isEqualTo: myUid)
                .addSnapshotListener { s, _ in liked = Set((s?.documents ?? []).compactMap { $0.reference.parent.parent?.documentID }); emit() }
            c.onTermination = { _ in r1.remove(); r2.remove() }
        }
    }

    static func publish(me: Profile, text: String, sport: Sport) async throws {
        let clean = text.trimmed
        if clean.isEmpty { throw UserError("Escreva algo para publicar.") }
        if clean.count > 1000 { throw UserError("Use até 1000 caracteres.") }
        try await db.collection("posts").addDocument(data: [
            "authorId": me.id, "authorName": me.name, "authorAvatar": me.avatar, "sport": sport.rawValue,
            "text": clean, "likesCount": 0, "createdAt": FieldValue.serverTimestamp(),
        ])
    }

    /// Curtida e contador no mesmo lote; as regras conferem o par.
    static func toggleLike(_ p: Post, myUid: String) async throws {
        let ref = db.collection("posts").document(p.id)
        let like = ref.collection("likes").document(myUid)
        let batch = db.batch()
        if p.likedByMe {
            batch.deleteDocument(like)
            batch.updateData(["likesCount": FieldValue.increment(Int64(-1))], forDocument: ref)
        } else {
            batch.setData(["uid": myUid, "createdAt": FieldValue.serverTimestamp()], forDocument: like)
            batch.updateData(["likesCount": FieldValue.increment(Int64(1))], forDocument: ref)
        }
        try await batch.commit()
    }

    static func deletePost(_ p: Post) async throws { try await db.collection("posts").document(p.id).delete() }

    // MARK: Conversas

    static func conversationId(_ a: String, _ b: String) -> String { [a, b].sorted().joined(separator: "_") }

    static func conversations(_ myUid: String) -> AsyncStream<[Conversation]> {
        stream(db.collection("conversations").whereField("participants", arrayContains: myUid).order(by: "lastAt", descending: true)) { docs in
            docs.map { d in
                let other = d.documentID.split(separator: "_").map(String.init).first { $0 != myUid } ?? myUid
                return Conversation(id: d.documentID, otherId: other, otherName: (d.get("names") as? [String: String])?[other] ?? "Atleta",
                                    lastMessage: d.str("lastMessage"), lastAt: d.date("lastAt"),
                                    unread: (d.get("unread") as? [String: Int])?[myUid] ?? 0)
            }
        }
    }

    static func messages(_ convId: String) -> AsyncStream<[Message]> {
        stream(db.collection("conversations").document(convId).collection("messages").order(by: "createdAt").limit(toLast: 200)) { docs in
            docs.map { Message(id: $0.documentID, senderId: $0.str("senderId"), text: $0.str("text"), createdAt: $0.date("createdAt")) }
        }
    }

    static func send(me: Profile, other: Profile, text: String) async throws {
        let clean = text.trimmed
        if clean.isEmpty { return }
        if clean.count > 2000 { throw UserError("Mensagem muito longa.") }
        let conv = db.collection("conversations").document(conversationId(me.id, other.id))
        let batch = db.batch()
        batch.setData([
            "participants": [me.id, other.id].sorted(),
            "names": [me.id: me.name, other.id: other.name],
            "lastMessage": String(clean.prefix(120)), "lastSenderId": me.id, "lastAt": FieldValue.serverTimestamp(),
            "unread": [other.id: FieldValue.increment(Int64(1))],
        ], forDocument: conv, merge: true)
        batch.setData(["senderId": me.id, "receiverId": other.id, "text": clean, "createdAt": FieldValue.serverTimestamp()],
                      forDocument: conv.collection("messages").document())
        try await batch.commit()
    }

    static func markRead(_ convId: String, myUid: String) async {
        try? await db.collection("conversations").document(convId).updateData(["unread.\(myUid)": 0])
    }

    // MARK: Denúncia e bloqueio

    static func setBlocked(myUid: String, otherId: String, blocked: Bool) async throws {
        let op = blocked ? FieldValue.arrayUnion([otherId]) : FieldValue.arrayRemove([otherId])
        try await privateDoc(myUid).setData(["blocked": op], merge: true)
    }

    /// A administração lê as denúncias pelo console do Firebase (coleção reports).
    static func report(myUid: String, type: String, targetId: String, targetUserId: String, text: String) async throws {
        try await db.collection("reports").addDocument(data: [
            "reporterId": myUid, "type": type, "targetId": targetId, "targetUserId": targetUserId,
            "text": String(text.prefix(2000)), "createdAt": FieldValue.serverTimestamp(),
        ])
    }

    // MARK: Alertas e push

    private static func alertsCol(_ uid: String) -> CollectionReference { users.document(uid).collection("notifications") }

    static func alerts(_ uid: String) -> AsyncStream<[Alert]> {
        stream(alertsCol(uid).order(by: "createdAt", descending: true).limit(to: 50)) { docs in
            docs.map { Alert(id: $0.documentID, type: $0.str("type"), title: $0.str("title"), message: $0.str("message"),
                             createdAt: $0.date("createdAt"), read: $0.get("read") as? Bool ?? false) }
        }
    }

    static func markAlertsRead(_ uid: String, ids: [String]) async {
        guard !ids.isEmpty else { return }
        let batch = db.batch()
        ids.forEach { batch.updateData(["read": true], forDocument: alertsCol(uid).document($0)) }
        try? await batch.commit()
    }

    /// Avisos gerais (jogos novos, cancelamentos, aniversários). O servidor lê esta escolha no token do aparelho.
    static var broadcasts: Bool { prefs.object(forKey: "broadcasts") as? Bool ?? true }

    static func setBroadcasts(_ on: Bool) async {
        prefs.set(on, forKey: "broadcasts")
        await registerDevice()
    }

    /// O token chega pelo MessagingDelegate (App.swift); guardamos para apagá-lo no logout.
    static func onToken(_ token: String) {
        prefs.set(token, forKey: "token")
        Task { await registerDevice() }
    }

    static func registerDevice() async {
        guard let uid = auth.currentUser?.uid, let token = prefs.string(forKey: "token") else { return }
        try? await users.document(uid).collection("tokens").document(token)
            .setData(["platform": "ios", "broadcasts": broadcasts, "createdAt": FieldValue.serverTimestamp()])
    }

    private static func unregisterDevice() async {
        guard let uid = auth.currentUser?.uid, let token = prefs.string(forKey: "token") else { return }
        try? await users.document(uid).collection("tokens").document(token).delete()
    }

    // MARK: Clima (Open-Meteo, sem chave)

    static func weather() async throws -> Weather {
        struct R: Decodable {
            struct C: Decodable { let temperature_2m, wind_speed_10m: Double; let weather_code, is_day: Int }
            struct D: Decodable { let sunrise: [String] }
            let current: C
            let daily: D
        }
        let url = URL(string: "https://api.open-meteo.com/v1/forecast?latitude=\(Quadra.lat)&longitude=\(Quadra.lng)&current=temperature_2m,wind_speed_10m,weather_code,is_day&daily=sunrise&forecast_days=1&timezone=America%2FRecife")!
        let (data, _) = try await URLSession.shared.data(from: url)
        let r = try JSONDecoder().decode(R.self, from: data)
        return Weather(tempC: Int(r.current.temperature_2m.rounded()), windKmh: Int(r.current.wind_speed_10m.rounded()),
                       condition: describeWeather(r.current.weather_code, day: r.current.is_day == 1),
                       sunrise: String(r.daily.sunrise.first?.suffix(5) ?? "--:--"))
    }

    private static func describeWeather(_ code: Int, day: Bool) -> String {
        switch code {
        case 0: day ? "Céu limpo" : "Noite limpa"
        case 1, 2: "Poucas nuvens"
        case 3: "Nublado"
        case 45, 48: "Névoa"
        case 51...57: "Garoa"
        case 61...67, 80...82: "Chuva"
        case 95...99: "Trovoadas"
        default: "Tempo instável"
        }
    }
}
