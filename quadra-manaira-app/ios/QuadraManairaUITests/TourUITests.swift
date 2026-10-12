import XCTest

/// Passeio pelo app no simulador, contra o Firebase Emulator com os dados de `npm run seed` (o CI liga os dois).
/// Entra como Ana e fotografa cada tela; as fotos saem como anexos do resultado do teste.
final class TourUITests: XCTestCase {
    func testTour() {
        let app = XCUIApplication()
        app.launch()

        let email = app.textFields["voce@email.com"]
        XCTAssertTrue(email.waitForExistence(timeout: 30))
        shot(app, "1-login")
        email.tap()
        email.typeText("ana@teste.com")
        let password = app.secureTextFields["Sua senha"]
        password.tap()
        password.typeText("quadra123")
        app.buttons["Entrar"].tap()

        // Depois do login o app pede permissão de notificação.
        let alert = XCUIApplication(bundleIdentifier: "com.apple.springboard").alerts.firstMatch
        if alert.waitForExistence(timeout: 10) { alert.buttons.element(boundBy: 1).tap() }

        let tabs = app.tabBars.firstMatch
        XCTAssertTrue(tabs.buttons["Agenda"].waitForExistence(timeout: 30))
        sleep(3) // clima e jogos chegando
        shot(app, "2-agenda")

        app.buttons["Agendar"].tap()
        sleep(1)
        shot(app, "3-agendar")
        app.swipeDown(velocity: .fast)
        sleep(1)

        for (i, tab) in ["Mural", "Conversas", "Alertas", "Perfil"].enumerated() {
            tabs.buttons[tab].tap()
            sleep(2)
            shot(app, "\(i + 4)-\(tab.lowercased())")
            if tab == "Conversas", app.staticTexts["Bia Souza"].exists {
                app.staticTexts["Bia Souza"].tap()
                sleep(2)
                shot(app, "5b-conversa")
                app.navigationBars.buttons.firstMatch.tap()
            }
        }
    }

    private func shot(_ app: XCUIApplication, _ name: String) {
        let a = XCTAttachment(screenshot: app.screenshot())
        a.name = name
        a.lifetime = .keepAlways
        add(a)
    }
}
