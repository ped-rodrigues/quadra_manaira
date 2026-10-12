import SwiftUI

// MARK: - Alertas

struct AlertsView: View {
    let me: Profile
    let alerts: [Alert]?

    var body: some View {
        NavigationStack {
            Group {
                if let alerts {
                    if alerts.isEmpty {
                        EmptyText(text: "Aqui aparecem seus jogos, o lembrete 24 h antes, mensagens novas e os aniversários da galera.")
                            .frame(maxHeight: .infinity)
                    } else {
                        List(alerts) { a in
                            Button { Task { await Repo.markAlertsRead(me.id, ids: [a.id]) } } label: {
                                HStack(alignment: .top, spacing: 12) {
                                    Text(icon(a.type)).font(.title2).accessibilityHidden(true)
                                    VStack(alignment: .leading, spacing: 2) {
                                        Text(a.title).fontWeight(a.read ? .regular : .bold)
                                        Text(a.message).foregroundStyle(Palette.apagado)
                                        Text(ago(a.createdAt)).font(.caption2).foregroundStyle(Palette.apagado)
                                    }
                                }
                            }
                            .buttonStyle(.plain)
                            .listRowBackground(a.read ? Palette.painel : Palette.destaque)
                        }
                        .scrollContentBackground(.hidden)
                    }
                } else {
                    ProgressView().frame(maxHeight: .infinity)
                }
            }
            .frame(maxWidth: .infinity)
            .background(Palette.concreto)
            .navigationTitle("Alertas")
            .toolbar {
                if alerts?.contains(where: { !$0.read }) == true {
                    Button("Marcar todos como lidos") {
                        Task { await Repo.markAlertsRead(me.id, ids: alerts?.filter { !$0.read }.map(\.id) ?? []) }
                    }
                }
            }
        }
    }

    private func icon(_ type: String) -> String {
        switch type {
        case "BOOKING": "📅"
        case "CHAT": "💬"
        case "ALERT_24H": "⏰"
        case "BIRTHDAY": "🎉"
        default: "🔔"
        }
    }
}

// MARK: - Perfil

struct ProfileView: View {
    let me: Profile
    @State private var editing = false
    @State private var broadcasts = Repo.broadcasts
    @State private var confirmDelete = false
    @State private var busy = Busy()

    var body: some View {
        NavigationStack {
            ScrollView {
                VStack(alignment: .leading, spacing: 12) {
                    Panel {
                        if editing {
                            ProfileForm(initial: me, saveLabel: "Salvar") { withAnimation(.snappy) { editing = false } }
                            Button("Cancelar") { withAnimation(.snappy) { editing = false } }.frame(maxWidth: .infinity)
                        } else {
                            HStack(spacing: 16) {
                                AvatarView(emoji: me.avatar, size: 64)
                                VStack(alignment: .leading, spacing: 2) {
                                    Text(me.name).font(.placar(26))
                                    Text(me.email).font(.footnote).foregroundStyle(Palette.apagado)
                                    Text("\(me.sport.emoji) \(me.sport.label)").font(.footnote)
                                }
                            }
                            Button("Editar perfil") { withAnimation(.snappy) { editing = true } }
                                .buttonStyle(.bordered).frame(maxWidth: .infinity)
                        }
                    }
                    Panel {
                        NavigationLink("Como chegar na quadra") { LocalView() }
                        Divider()
                        ShareLink("Compartilhar o app", item: Quadra.site, message: Text(Quadra.shareText))
                        Divider()
                        Toggle(isOn: $broadcasts) {
                            VStack(alignment: .leading, spacing: 2) {
                                Text("Avisos gerais da quadra")
                                Text("Jogos novos, cancelamentos e aniversários. Desligado, você só recebe os seus jogos e mensagens.")
                                    .font(.footnote).foregroundStyle(Palette.apagado)
                            }
                        }
                        .onChange(of: broadcasts) { _, on in Task { await Repo.setBroadcasts(on) } }
                    }
                    ErrorText(text: busy.error)
                    Button("Sair da conta") { Task { await Repo.logout() } }.frame(maxWidth: .infinity).padding(.top, 8)
                    Button("Excluir minha conta", role: .destructive) { confirmDelete = true }.frame(maxWidth: .infinity)
                    Text("Quadra de Manaíra, versão \(Bundle.main.infoDictionary?["CFBundleShortVersionString"] as? String ?? "")")
                        .font(.caption2).foregroundStyle(Palette.apagado).frame(maxWidth: .infinity).padding(.top, 8)
                }
                .padding(16)
            }
            .background(Palette.concreto)
            .navigationTitle("Perfil")
            .alert("Excluir sua conta?", isPresented: $confirmDelete) {
                Button("Excluir conta", role: .destructive) { busy.run { try await Repo.deleteAccount() } }
                Button("Cancelar", role: .cancel) {}
            } message: {
                Text("Apagamos seu perfil, publicações, curtidas, conversas e agendamentos. Jogos futuros são cancelados. Não dá para desfazer.")
            }
        }
    }
}

// MARK: - Localização

struct LocalView: View {
    var body: some View {
        ScrollView {
            VStack(alignment: .leading, spacing: 14) {
                Image("Capa").resizable().aspectRatio(contentMode: .fit)
                    .accessibilityLabel("Foto da quadra na orla de Manaíra")
                VStack(alignment: .leading, spacing: 14) {
                    Text(Quadra.name).font(.placar(32))
                    Text(Quadra.address).foregroundStyle(Palette.apagado)
                    Link(destination: URL(string: "https://maps.apple.com/?daddr=\(Quadra.lat),\(Quadra.lng)&q=Quadra%20de%20Mana%C3%ADra")!) {
                        Text("Abrir rota no mapa").fontWeight(.semibold).frame(maxWidth: .infinity, minHeight: 52)
                            .foregroundStyle(.white).background(Palette.mar, in: RoundedRectangle(cornerRadius: 14, style: .continuous))
                    }
                    ShareLink(item: Quadra.site, message: Text(Quadra.shareText)) {
                        Text("Compartilhar o app").frame(maxWidth: .infinity, minHeight: 44)
                    }
                    .buttonStyle(.bordered)
                    Text("O que tem lá").font(.placar(22)).padding(.top, 8)
                    ForEach(Quadra.infrastructure, id: \.0) { title, desc in
                        HStack(alignment: .top, spacing: 12) {
                            // Traço amarelo, como as linhas da quadra.
                            Rectangle().fill(Palette.linha).frame(width: 4)
                            VStack(alignment: .leading, spacing: 2) {
                                Text(title).fontWeight(.semibold)
                                Text(desc).foregroundStyle(Palette.apagado)
                            }
                        }
                        .fixedSize(horizontal: false, vertical: true)
                    }
                }
                .padding(.horizontal, 20)
            }
            .padding(.bottom, 24)
        }
        .background(Palette.concreto)
        .navigationBarTitleDisplayMode(.inline)
    }
}
