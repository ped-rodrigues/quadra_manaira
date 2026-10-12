import SwiftUI

extension View {
    /// Campo de texto no estilo do app: fundo de painel, canto arredondado e traço fino.
    func field() -> some View {
        padding(14)
            .background(Palette.painel, in: RoundedRectangle(cornerRadius: 12, style: .continuous))
            .overlay(RoundedRectangle(cornerRadius: 12, style: .continuous).stroke(Palette.traco))
    }
}

/// dd/mm/aaaa com as barras inseridas sozinhas.
func formatBirth(_ s: String) -> String {
    var r = ""
    for (i, c) in s.filter(\.isNumber).prefix(8).enumerated() {
        if i == 2 || i == 4 { r.append("/") }
        r.append(c)
    }
    return r
}

struct Labeled<Content: View>: View {
    let label: String
    @ViewBuilder var content: Content
    var body: some View {
        VStack(alignment: .leading, spacing: 6) {
            Text(label).font(.subheadline.weight(.medium)).foregroundStyle(Palette.apagado)
            content
        }
    }
}

struct BirthField: View {
    @Binding var text: String
    var body: some View {
        Labeled(label: "Data de nascimento") {
            TextField("dd/mm/aaaa", text: $text)
                .keyboardType(.numberPad)
                .field()
                .onChange(of: text) { _, new in
                    let f = formatBirth(new)
                    if f != new { text = f }
                }
        }
    }
}

struct AuthView: View {
    @State private var registering = false

    var body: some View {
        ScrollView {
            VStack(spacing: 0) {
                // A foto já traz o letreiro "Quadra de Manaíra"; no cadastro ela encolhe para dar espaço ao formulário.
                Image("Capa")
                    .resizable()
                    .aspectRatio(contentMode: .fill)
                    .frame(height: registering ? 150 : 230, alignment: .top)
                    .clipped()
                    .accessibilityLabel("Quadra de Manaíra na orla")
                VStack(alignment: .leading, spacing: 14) {
                    if registering { RegisterForm { registering = false } } else { LoginForm { registering = true } }
                }
                .padding(20)
            }
            .animation(.snappy, value: registering)
        }
        .ignoresSafeArea(edges: .top)
        .background(Palette.concreto)
        .scrollDismissesKeyboard(.interactively)
    }
}

private struct LoginForm: View {
    let onRegister: () -> Void
    @State private var email = ""
    @State private var password = ""
    @State private var busy = Busy()
    @State private var resetting = false

    var body: some View {
        Text("Veja os horários livres, agende seu jogo e combine com a galera.").foregroundStyle(Palette.apagado)
        Labeled(label: "E-mail") {
            TextField("voce@email.com", text: $email).keyboardType(.emailAddress).textContentType(.username)
                .textInputAutocapitalization(.never).autocorrectionDisabled().field()
        }
        Labeled(label: "Senha") {
            SecureField("Sua senha", text: $password).textContentType(.password).field()
        }
        ErrorText(text: busy.error)
        BigButton(title: "Entrar", busy: busy.running) { busy.run { try await Repo.login(email, password) } }
        Button("Esqueci a senha") { resetting = true }.frame(maxWidth: .infinity)
        Button("Primeira vez aqui? Criar conta", action: onRegister).frame(maxWidth: .infinity).padding(.top, 4)
            .sheet(isPresented: $resetting) { ResetSheet(email: email) }
    }
}

private struct ResetSheet: View {
    @State var email: String
    @State private var busy = Busy()
    @State private var sent = false
    @Environment(\.dismiss) private var dismiss

    var body: some View {
        VStack(alignment: .leading, spacing: 14) {
            Text("Criar nova senha").font(.placar(28))
            if sent {
                Text("Enviamos o link para \(email.trimmed). Se não chegar em alguns minutos, olhe o spam.")
                BigButton(title: "Fechar") { dismiss() }
            } else {
                Text("Mandamos um link para o e-mail da sua conta.")
                TextField("voce@email.com", text: $email).keyboardType(.emailAddress)
                    .textInputAutocapitalization(.never).autocorrectionDisabled().field()
                ErrorText(text: busy.error)
                BigButton(title: "Enviar link", busy: busy.running) {
                    busy.run { try await Repo.resetPassword(email); sent = true }
                }
            }
            Spacer()
        }
        .padding(24)
        .presentationDetents([.medium])
    }
}

private struct RegisterForm: View {
    let onBack: () -> Void
    @State private var name = ""
    @State private var email = ""
    @State private var password = ""
    @State private var birth = ""
    @State private var sport = Sport.FUTEBOL
    @State private var avatar = AVATARS[0]
    @State private var busy = Busy()

    var body: some View {
        Text("Criar conta").font(.placar(30))
        Labeled(label: "Nome") { TextField("Como a galera te chama", text: $name).textContentType(.name).field() }
        Labeled(label: "E-mail") {
            TextField("voce@email.com", text: $email).keyboardType(.emailAddress).textContentType(.username)
                .textInputAutocapitalization(.never).autocorrectionDisabled().field()
        }
        Labeled(label: "Senha (mínimo 6 caracteres)") { SecureField("Crie uma senha", text: $password).textContentType(.newPassword).field() }
        BirthField(text: $birth)
        SportAndAvatar(sport: $sport, avatar: $avatar)
        ErrorText(text: busy.error)
        BigButton(title: "Criar conta", busy: busy.running) {
            busy.run { try await Repo.register(name: name, email: email, password: password, birth: birth, sport: sport, avatar: avatar) }
        }
        Button("Já tenho conta", action: onBack).frame(maxWidth: .infinity)
    }
}

struct SportAndAvatar: View {
    @Binding var sport: Sport
    @Binding var avatar: String
    var body: some View {
        Labeled(label: "Esporte que você mais joga") { SportChips(selected: $sport) }
        Labeled(label: "Avatar") { Chips(options: AVATARS, selected: $avatar) { $0 } }
    }
}

/// Cadastro interrompido: pede o que falta antes de entrar.
struct CompleteProfileView: View {
    let partial: Profile?
    var body: some View {
        ScrollView {
            VStack(alignment: .leading, spacing: 14) {
                Text("Falta pouco").font(.placar(34))
                Text("Complete seu perfil para agendar e conversar com a galera.")
                ProfileForm(initial: partial, saveLabel: "Entrar na comunidade")
                Button("Sair") { Task { await Repo.logout() } }
            }
            .padding(20)
        }
        .background(Palette.concreto)
    }
}

struct ProfileForm: View {
    var saveLabel: String
    var onSaved: () -> Void = {}
    @State private var name: String
    @State private var birth: String
    @State private var sport: Sport
    @State private var avatar: String
    @State private var busy = Busy()

    init(initial: Profile?, saveLabel: String, onSaved: @escaping () -> Void = {}) {
        self.saveLabel = saveLabel
        self.onSaved = onSaved
        _name = State(initialValue: initial?.name ?? "")
        _birth = State(initialValue: initial?.birthDate ?? "")
        _sport = State(initialValue: initial?.sport ?? .FUTEBOL)
        _avatar = State(initialValue: initial?.avatar ?? AVATARS[0])
    }

    var body: some View {
        VStack(alignment: .leading, spacing: 14) {
            Labeled(label: "Nome") { TextField("Como a galera te chama", text: $name).field() }
            BirthField(text: $birth)
            SportAndAvatar(sport: $sport, avatar: $avatar)
            ErrorText(text: busy.error)
            BigButton(title: saveLabel, busy: busy.running) {
                busy.run {
                    try await Repo.saveProfile(name: name, birth: birth, sport: sport, avatar: avatar)
                    onSaved()
                }
            }
        }
    }
}
