import SwiftUI

struct ConversationsView: View {
    let me: Profile
    let conversations: [Conversation]?
    @State private var athletes: [Profile]?

    var body: some View {
        let byId = Dictionary((athletes ?? []).map { ($0.id, $0) }, uniquingKeysWith: { a, _ in a })
        NavigationStack {
            List {
                Section {
                    if let conversations {
                        if conversations.isEmpty {
                            Text("Nenhuma conversa ainda. Escolha alguém da lista abaixo para combinar um jogo.").foregroundStyle(Palette.apagado)
                        }
                        ForEach(conversations) { c in
                            NavigationLink(value: c.otherId) {
                                HStack(spacing: 12) {
                                    AvatarView(emoji: byId[c.otherId]?.avatar ?? AVATARS[0])
                                    VStack(alignment: .leading, spacing: 2) {
                                        Text(c.otherName).fontWeight(c.unread > 0 ? .bold : .semibold)
                                        Text(c.lastMessage).lineLimit(1).foregroundStyle(Palette.apagado)
                                    }
                                    Spacer()
                                    VStack(alignment: .trailing, spacing: 4) {
                                        Text(ago(c.lastAt)).font(.caption2).foregroundStyle(Palette.apagado)
                                        if c.unread > 0 {
                                            Text(c.unread > 9 ? "9+" : "\(c.unread)").font(.caption2.bold())
                                                .padding(.horizontal, 6).padding(.vertical, 2)
                                                .background(Palette.linha, in: Capsule()).foregroundStyle(Palette.tinta)
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        ProgressView()
                    }
                }
                Section("Quem joga na quadra") {
                    let others = athletes?.filter { $0.id != me.id }
                    if let others {
                        if others.isEmpty { Text("Você é a primeira pessoa aqui. Compartilhe o app com a galera pelo Perfil.").foregroundStyle(Palette.apagado) }
                        ForEach(others) { u in
                            NavigationLink(value: u.id) {
                                HStack(spacing: 12) {
                                    AvatarView(emoji: u.avatar, size: 40)
                                    VStack(alignment: .leading) {
                                        Text(u.name)
                                        Text(me.blocked.contains(u.id) ? "Bloqueado" : "\(u.sport.emoji) \(u.sport.label)")
                                            .font(.footnote).foregroundStyle(Palette.apagado)
                                    }
                                }
                            }
                        }
                    } else {
                        ProgressView()
                    }
                }
            }
            .scrollContentBackground(.hidden)
            .background(Palette.concreto)
            .navigationTitle("Conversas")
            .navigationDestination(for: String.self) { otherId in
                ChatView(me: me, otherId: otherId, unread: conversations?.first { $0.otherId == otherId }?.unread ?? 0)
            }
        }
        .task { for await a in Repo.athletes() { athletes = a } }
    }
}

struct ChatView: View {
    let me: Profile
    let otherId: String
    let unread: Int
    @State private var other: Profile?
    @State private var messages: [Message] = []
    @State private var text = ""
    @State private var busy = Busy()
    @State private var confirmReport = false
    @State private var toast: String?

    private var convId: String { Repo.conversationId(me.id, otherId) }
    private var blocked: Bool { me.blocked.contains(otherId) }
    private var name: String { other?.name ?? "Conversa" }

    var body: some View {
        ScrollViewReader { proxy in
            ScrollView {
                LazyVStack(spacing: 6) {
                    if messages.isEmpty { EmptyText(text: "Mande um oi para \(name) e combinem o próximo jogo.") }
                    ForEach(messages) { m in Bubble(m: m, mine: m.senderId == me.id).id(m.id) }
                }
                .padding(12)
            }
            .defaultScrollAnchor(.bottom)
            .onChange(of: messages.last?.id) { _, id in
                guard let id else { return }
                withAnimation(.snappy) { proxy.scrollTo(id, anchor: .bottom) }
            }
        }
        .background(Palette.concreto)
        .safeAreaInset(edge: .bottom) {
            VStack(alignment: .leading, spacing: 4) {
                ErrorText(text: busy.error)
                if blocked {
                    Text("Você bloqueou \(name). Desbloqueie pelo menu para conversar.").foregroundStyle(Palette.apagado)
                } else {
                    HStack(spacing: 8) {
                        TextField("Mensagem", text: $text, axis: .vertical).lineLimit(1...4).field()
                        Button {
                            guard let o = other else { return }
                            let t = text
                            text = ""
                            busy.run {
                                do { try await Repo.send(me: me, other: o, text: t) } catch { text = t; throw error }
                            }
                        } label: {
                            Image(systemName: "paperplane.fill").padding(12)
                                .foregroundStyle(.white).background(Palette.mar, in: Circle())
                        }
                        .disabled(text.trimmed.isEmpty || other == nil)
                        .accessibilityLabel("Enviar")
                    }
                }
            }
            .padding(10)
            .background(.bar)
        }
        .navigationTitle(name)
        .navigationBarTitleDisplayMode(.inline)
        .toolbar {
            Menu {
                Button("Denunciar conversa") { confirmReport = true }
                Button(blocked ? "Desbloquear \(name)" : "Bloquear \(name)", role: blocked ? nil : .destructive) {
                    busy.run { try await Repo.setBlocked(myUid: me.id, otherId: otherId, blocked: !blocked) }
                }
            } label: { Image(systemName: "ellipsis.circle") }
            .disabled(other == nil)
            .accessibilityLabel("Opções da conversa")
        }
        .confirmationDialog("Denunciar conversa?", isPresented: $confirmReport, titleVisibility: .visible) {
            Button("Denunciar", role: .destructive) {
                let evidence = messages.filter { $0.senderId == otherId }.suffix(20).map(\.text).joined(separator: "\n")
                busy.run {
                    try await Repo.report(myUid: me.id, type: "CHAT", targetId: convId, targetUserId: otherId, text: evidence)
                    toast = "Denúncia enviada."
                }
            }
        } message: { Text("As últimas mensagens de \(name) vão para a administração da quadra.") }
        .toast($toast)
        .task(id: otherId) { for await p in Repo.profile(otherId) { other = p } }
        .task(id: convId) { for await m in Repo.messages(convId) { messages = m } }
        // Com a conversa aberta, mensagem nova já chega lida.
        .task(id: unread) { if unread > 0 { await Repo.markRead(convId, myUid: me.id) } }
    }
}

private struct Bubble: View {
    let m: Message
    let mine: Bool
    var body: some View {
        HStack {
            if mine { Spacer(minLength: 60) }
            VStack(alignment: .trailing, spacing: 2) {
                Text(m.text)
                Text(ago(m.createdAt)).font(.caption2).opacity(0.7)
            }
            .padding(.horizontal, 14).padding(.vertical, 8)
            .foregroundStyle(mine ? .white : .primary)
            .background(mine ? Palette.mar : Palette.painel,
                        in: UnevenRoundedRectangle(topLeadingRadius: 18, bottomLeadingRadius: mine ? 18 : 4,
                                                   bottomTrailingRadius: mine ? 4 : 18, topTrailingRadius: 18))
            if !mine { Spacer(minLength: 60) }
        }
        .transition(.move(edge: .bottom).combined(with: .opacity))
    }
}
