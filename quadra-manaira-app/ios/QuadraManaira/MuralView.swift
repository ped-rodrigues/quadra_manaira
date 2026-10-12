import SwiftUI

struct MuralView: View {
    let me: Profile
    @State private var posts: [Post]?
    @State private var toDelete: Post?
    @State private var toReport: Post?
    @State private var toast: String?

    private func attempt(_ ok: String? = nil, _ action: @escaping () async throws -> Void) {
        Task {
            do { try await action(); if let ok { toast = ok } } catch { toast = friendly(error) }
        }
    }

    var body: some View {
        NavigationStack {
            ScrollView {
                LazyVStack(spacing: 12) {
                    Composer(me: me) { toast = "Publicado no mural." }
                    let visible = posts?.filter { !me.blocked.contains($0.authorId) }
                    if let visible {
                        if visible.isEmpty {
                            EmptyText(text: "Ninguém escreveu ainda. Conte quando vai jogar ou chame gente para o racha.")
                        }
                        ForEach(visible) { p in
                            PostCard(p: p, mine: p.authorId == me.id,
                                     onLike: { attempt { try await Repo.toggleLike(p, myUid: me.id) } },
                                     onDelete: { toDelete = p },
                                     onReport: { toReport = p },
                                     onBlock: { attempt("\(p.authorName) bloqueado. Os posts somem do seu mural.") { try await Repo.setBlocked(myUid: me.id, otherId: p.authorId, blocked: true) } })
                                .transition(.opacity.combined(with: .move(edge: .top)))
                        }
                    } else {
                        ProgressView().padding(32)
                    }
                }
                .padding(16)
                .animation(.snappy, value: posts)
            }
            .background(Palette.concreto)
            .navigationTitle("Mural")
            .toast($toast)
            .confirmationDialog("Apagar publicação?", isPresented: Binding(get: { toDelete != nil }, set: { if !$0 { toDelete = nil } }), titleVisibility: .visible, presenting: toDelete) { p in
                Button("Apagar", role: .destructive) { attempt("Publicação apagada.") { try await Repo.deletePost(p) } }
            } message: { _ in Text("Ela sai do mural de todo mundo.") }
            .confirmationDialog("Denunciar publicação?", isPresented: Binding(get: { toReport != nil }, set: { if !$0 { toReport = nil } }), titleVisibility: .visible, presenting: toReport) { p in
                Button("Denunciar", role: .destructive) { attempt("Denúncia enviada.") { try await Repo.report(myUid: me.id, type: "POST", targetId: p.id, targetUserId: p.authorId, text: p.text) } }
            } message: { _ in Text("A administração da quadra vai ler e decidir se ela sai do ar.") }
        }
        .task(id: me.id) { for await p in Repo.posts(me.id) { posts = p } }
    }
}

/// Fechado é uma linha; tocar abre o campo.
private struct Composer: View {
    let me: Profile
    let onPublished: () -> Void
    @State private var open = false
    @State private var text = ""
    @State private var sport: Sport
    @State private var busy = Busy()

    init(me: Profile, onPublished: @escaping () -> Void) {
        self.me = me
        self.onPublished = onPublished
        _sport = State(initialValue: me.sport)
    }

    var body: some View {
        Panel {
            Button { withAnimation(.snappy) { open = true } } label: {
                HStack(spacing: 12) {
                    AvatarView(emoji: me.avatar, size: 40)
                    Text(open ? me.name : "Escreva para a galera")
                        .fontWeight(open ? .semibold : .regular)
                        .foregroundStyle(open ? .primary : Palette.apagado)
                    Spacer()
                }
            }
            .buttonStyle(.plain)
            if open {
                TextField("Ex.: alguém pro vôlei amanhã às 6h?", text: $text, axis: .vertical)
                    .lineLimit(3...8).field()
                    .onChange(of: text) { _, t in if t.count > 1000 { text = String(t.prefix(1000)) } }
                SportChips(selected: $sport)
                ErrorText(text: busy.error)
                HStack {
                    Spacer()
                    Button("Fechar") { withAnimation(.snappy) { open = false } }
                    Button(busy.running ? "Publicando…" : "Publicar") {
                        busy.run {
                            try await Repo.publish(me: me, text: text, sport: sport)
                            text = ""
                            withAnimation(.snappy) { open = false }
                            onPublished()
                        }
                    }
                    .buttonStyle(.borderedProminent)
                    .disabled(text.trimmed.isEmpty || busy.running)
                }
            }
        }
    }
}

private struct PostCard: View {
    let p: Post
    let mine: Bool
    let onLike: () -> Void
    let onDelete: () -> Void
    let onReport: () -> Void
    let onBlock: () -> Void

    var body: some View {
        Panel {
            HStack(spacing: 12) {
                AvatarView(emoji: p.authorAvatar, size: 40)
                VStack(alignment: .leading, spacing: 2) {
                    Text(p.authorName).fontWeight(.semibold)
                    Text("\(p.sport.emoji) \(p.sport.label), \(ago(p.createdAt))").font(.footnote).foregroundStyle(Palette.apagado)
                }
                Spacer()
                Menu {
                    if mine {
                        Button("Apagar", role: .destructive, action: onDelete)
                    } else {
                        Button("Denunciar", action: onReport)
                        Button("Bloquear \(p.authorName)", role: .destructive, action: onBlock)
                    }
                } label: {
                    Image(systemName: "ellipsis").padding(8)
                }
                .accessibilityLabel("Opções da publicação")
            }
            Text(p.text)
            Button(action: onLike) {
                HStack(spacing: 6) {
                    Image(systemName: p.likedByMe ? "heart.fill" : "heart")
                        .foregroundStyle(p.likedByMe ? Palette.coral : Palette.apagado)
                        .symbolEffect(.bounce, value: p.likedByMe)
                    Text(p.likes == 0 ? "Curtir" : p.likes == 1 ? "1 curtida" : "\(p.likes) curtidas")
                        .font(.footnote).foregroundStyle(Palette.apagado)
                }
            }
            .buttonStyle(.plain)
            .accessibilityLabel(p.likedByMe ? "Descurtir" : "Curtir")
        }
    }
}
