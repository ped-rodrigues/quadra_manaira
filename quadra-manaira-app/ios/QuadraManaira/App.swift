import FirebaseAuth
import FirebaseCore
import FirebaseFirestore
import FirebaseMessaging
import SwiftUI
import UserNotifications

@main
struct QuadraApp: App {
    @UIApplicationDelegateAdaptor private var delegate: AppDelegate

    var body: some Scene {
        WindowGroup {
            if AppDelegate.configured { RootView() } else { SetupView() }
        }
    }
}

final class AppDelegate: NSObject, UIApplicationDelegate, MessagingDelegate, UNUserNotificationCenterDelegate {
    static var configured = false

    func application(_ app: UIApplication, didFinishLaunchingWithOptions _: [UIApplication.LaunchOptionsKey: Any]? = nil) -> Bool {
        // Títulos grandes na fonte de placar, como no Android.
        if let font = UIFont(name: "BarlowCondensed-SemiBold", size: 36) {
            UINavigationBar.appearance().largeTitleTextAttributes = [.font: font]
        }
        if Bundle.main.path(forResource: "GoogleService-Info", ofType: "plist") != nil {
            FirebaseApp.configure()
            Self.configured = true
        } else {
            #if DEBUG
            // Debug sem GoogleService-Info.plist: usa o Firebase Emulator do Mac (firebase emulators:start).
            // No release sem config o Firebase não sobe e o app mostra a tela de configuração (falha fechada).
            let options = FirebaseOptions(googleAppID: "1:000000000000:ios:0000000000000000", gcmSenderID: "000000000000")
            options.projectID = "demo-quadra"
            options.apiKey = "A" + String(repeating: "0", count: 38) // o SDK exige o formato de chave real (39 caracteres)
            FirebaseApp.configure(options: options)
            Auth.auth().useEmulator(withHost: "localhost", port: 9099)
            Firestore.firestore().useEmulator(withHost: "localhost", port: 8080)
            Self.configured = true
            #endif
        }
        guard Self.configured else { return true }
        Messaging.messaging().delegate = self
        UNUserNotificationCenter.current().delegate = self
        return true
    }

    /// Chamado depois do login: pede permissão e registra no APNs (o Firebase liga o token do APNs ao do FCM).
    static func askForPush() {
        UNUserNotificationCenter.current().requestAuthorization(options: [.alert, .badge, .sound]) { granted, _ in
            guard granted else { return }
            DispatchQueue.main.async { UIApplication.shared.registerForRemoteNotifications() }
        }
    }

    func messaging(_: Messaging, didReceiveRegistrationToken token: String?) {
        if let token { Repo.onToken(token) }
    }

    /// Com o app aberto o iOS não mostra o push sozinho; aqui pedimos o banner.
    func userNotificationCenter(_: UNUserNotificationCenter, willPresent _: UNNotification) async -> UNNotificationPresentationOptions {
        [.banner, .sound, .list]
    }
}

struct RootView: View {
    @State private var session = Session.loading

    var body: some View {
        Group {
            switch session {
            case .loading: ProgressView().frame(maxWidth: .infinity, maxHeight: .infinity)
            case .signedOut: AuthView()
            case .unverified(let email): VerifyEmailView(email: email)
            case .needsProfile(let partial): CompleteProfileView(partial: partial)
            case .ready(let me): HomeView(me: me)
            }
        }
        .animation(.default, value: sessionKind)
        .tint(Palette.mar)
        .task { for await s in Repo.session() { session = s } }
    }

    private var sessionKind: Int {
        switch session {
        case .loading: 0
        case .signedOut: 1
        case .unverified: 2
        case .needsProfile: 3
        case .ready: 4
        }
    }
}

/// Build de release sem GoogleService-Info.plist: o app não roda sem backend, então explica o que falta.
struct SetupView: View {
    var body: some View {
        VStack(alignment: .leading, spacing: 12) {
            Text("Firebase não configurado").font(.placar(32))
            Text("Este build foi gerado sem o arquivo GoogleService-Info.plist.\n\nCrie o projeto no console do Firebase, registre o app br.com.quadramanaira, coloque o GoogleService-Info.plist em ios/QuadraManaira e compile de novo. O passo a passo está no LEIAME.md.")
        }
        .padding(24)
    }
}
