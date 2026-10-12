import XCTest

/// Passeio pelo app no simulador, contra o Firebase Emulator com os dados de `npm run seed` (o CI liga os dois).
/// Entra como Ana e fotografa cada tela; as fotos saem como anexos do resultado do teste.
final class TourUITests: XCTestCase {
    func testTour() {
        continueAfterFailure = false
        let app = XCUIApplication()
        app.launchArguments = ["-FIRDebugEnabled"] // logs do Firebase no log do simulador (o CI guarda)
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

        let tabs = app.tabBars.firstMatch
        let entered = tabs.buttons["Agenda"].waitForExistence(timeout: 30)
        shot(app, "2-depois-do-login")
        XCTAssertTrue(entered)

        // Depois do login o iOS oferece guardar a senha e o app pede permissão de notificação (chegam com atraso).
        let notNow = app.buttons["Not Now"]
        if notNow.waitForExistence(timeout: 10) { notNow.tap() }
        let alert = XCUIApplication(bundleIdentifier: "com.apple.springboard").alerts.firstMatch
        if alert.waitForExistence(timeout: 3) { alert.buttons.element(boundBy: 1).tap() }
        sleep(3) // clima e jogos chegando
        shot(app, "2b-agenda")

        app.buttons["Agendar"].tap()
        sleep(1)
        shot(app, "3-agendar")
        app.swipeDown(velocity: .fast)
        sleep(1)

        for (i, tab) in ["Mural", "Conversas", "Alertas", "Perfil"].enumerated() {
            tabs.buttons[tab].tap()
            sleep(2)
            shot(app, "\(i + 4)-\(tab.lowercased())")
            let bia = app.staticTexts["Bia Souza"].firstMatch // aparece na conversa e na lista de atletas
            if tab == "Conversas", bia.exists {
                bia.tap()
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
