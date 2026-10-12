import SwiftUI

// Paleta tirada da própria quadra: o verde-azulado do mar de Manaíra, o amarelo das linhas pintadas
// no piso e o cinza claro do concreto. Coral só para curtir e para ações destrutivas.
enum Palette {
    static let mar = dynamic(0x0B6E69, dark: 0x4CC3BA)
    static let marFundo = Color(hex: 0x07423F)
    static let blocoMeu = Color(hex: 0x0B6E69)
    static let linha = Color(hex: 0xF5C400)
    static let tinta = Color(hex: 0x0F2A28)
    static let coral = dynamic(0xD7264F, dark: 0xFF8FA6)
    static let concreto = dynamic(0xEEF2F0, dark: 0x071C1B)
    static let painel = dynamic(0xFFFFFF, dark: 0x0F2A28)
    static let apagado = dynamic(0x41605C, dark: 0xA9C2BE)
    static let traco = dynamic(0xC9D6D3, dark: 0x2C4845)
    static let passado = dynamic(0xDDE6E3, dark: 0x1C3633)
    static let destaque = dynamic(0xFFF1B8, dark: 0x4A3D00)

    private static func dynamic(_ light: UInt32, dark: UInt32) -> Color {
        Color(UIColor { $0.userInterfaceStyle == .dark ? UIColor(hex: dark) : UIColor(hex: light) })
    }
}

extension UIColor {
    convenience init(hex: UInt32) {
        self.init(red: CGFloat(hex >> 16 & 0xFF) / 255, green: CGFloat(hex >> 8 & 0xFF) / 255, blue: CGFloat(hex & 0xFF) / 255, alpha: 1)
    }
}

extension Color {
    init(hex: UInt32) { self.init(uiColor: UIColor(hex: hex)) }
}

extension Font {
    /// Fonte condensada de placar para títulos, horários e números; acompanha o tamanho de texto do sistema.
    static func placar(_ size: CGFloat, relativeTo style: Font.TextStyle = .title) -> Font {
        .custom("BarlowCondensed-SemiBold", size: size, relativeTo: style)
    }
}

/// Bloco branco de conteúdo.
struct Panel<Content: View>: View {
    @ViewBuilder var content: Content
    var body: some View {
        VStack(alignment: .leading, spacing: 12) { content }
            .padding(16)
            .frame(maxWidth: .infinity, alignment: .leading)
            .background(Palette.painel, in: RoundedRectangle(cornerRadius: 20, style: .continuous))
    }
}

struct AvatarView: View {
    let emoji: String
    var size: CGFloat = 44
    var body: some View {
        Text(emoji)
            .font(.system(size: size * 0.5))
            .frame(width: size, height: size)
            .background(Palette.mar.opacity(0.18), in: Circle())
            .accessibilityHidden(true)
    }
}

/// Fileira de opções com uma selecionada.
struct Chips<T: Hashable>: View {
    let options: [T]
    @Binding var selected: T
    let label: (T) -> String
    var enabled: (T) -> Bool = { _ in true }

    var body: some View {
        ScrollView(.horizontal, showsIndicators: false) {
            HStack(spacing: 8) {
                ForEach(options, id: \.self) { o in
                    let on = o == selected
                    Button { selected = o } label: {
                        Text(label(o))
                            .padding(.horizontal, 14).padding(.vertical, 8)
                            .foregroundStyle(on ? .white : .primary)
                            .background(on ? Palette.mar : Palette.painel, in: Capsule())
                            .overlay(Capsule().stroke(on ? .clear : Palette.traco))
                    }
                    .buttonStyle(.plain)
                    .disabled(!enabled(o))
                    .opacity(enabled(o) ? 1 : 0.4)
                    .accessibilityAddTraits(on ? .isSelected : [])
                }
            }
        }
    }
}

struct SportChips: View {
    @Binding var selected: Sport
    var body: some View { Chips(options: Sport.allCases, selected: $selected) { "\($0.emoji) \($0.label)" } }
}

struct EmptyText: View {
    let text: String
    var body: some View {
        Text(text).multilineTextAlignment(.center).foregroundStyle(Palette.apagado)
            .frame(maxWidth: .infinity).padding(32)
    }
}

struct ErrorText: View {
    let text: String?
    var body: some View { if let text { Text(text).foregroundStyle(Palette.coral).font(.callout) } }
}

/// Roda uma ação assíncrona mostrando "ocupado" e guardando o erro já traduzido.
@Observable final class Busy {
    var running = false
    var error: String?

    func run(_ action: @escaping () async throws -> Void) {
        guard !running else { return }
        running = true
        error = nil
        Task { @MainActor in
            do { try await action() } catch { self.error = friendly(error) }
            running = false
        }
    }
}

struct BigButton: View {
    let title: String
    var busy = false
    var color = Palette.mar
    let action: () -> Void
    var body: some View {
        Button(action: action) {
            Group { if busy { ProgressView().tint(.white) } else { Text(title).fontWeight(.semibold) } }
                .frame(maxWidth: .infinity, minHeight: 52)
        }
        .foregroundStyle(.white)
        .background(color, in: RoundedRectangle(cornerRadius: 14, style: .continuous))
        .disabled(busy)
    }
}
