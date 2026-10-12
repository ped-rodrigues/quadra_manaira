@testable import QuadraManaira
import XCTest

final class LogicTests: XCTestCase {
    private let day = "2030-01-10"
    private let before = Quadra.date("2030-01-09")!

    func testSlotsCobremOIntervaloSemOFim() {
        XCTAssertEqual(slots("18:00", "19:30"), ["18:00", "18:30", "19:00"])
        XCTAssertEqual(slots("21:30", "22:00"), ["21:30"])
    }

    func testAgendamento() {
        XCTAssertNil(bookingError(day: day, start: "06:00", end: "09:00", now: before))
        XCTAssertNotNil(bookingError(day: day, start: "05:30", end: "07:00", now: before)) // antes de abrir
        XCTAssertNotNil(bookingError(day: day, start: "21:00", end: "22:30", now: before)) // depois de fechar
        XCTAssertNotNil(bookingError(day: day, start: "08:00", end: "11:30", now: before)) // mais de 3h
        XCTAssertNotNil(bookingError(day: day, start: "08:00", end: "08:00", now: before)) // vazio
        XCTAssertNotNil(bookingError(day: day, start: "08:15", end: "09:00", now: before)) // fora da grade
        let quaseOito = Quadra.calendar.date(from: DateComponents(year: 2030, month: 1, day: 10, hour: 8, minute: 1))!
        XCTAssertNotNil(bookingError(day: day, start: "08:00", end: "09:00", now: quaseOito)) // já passou
    }

    func testSobreposicao() {
        XCTAssertTrue(overlaps(600, 660, 630, 700))
        XCTAssertFalse(overlaps(600, 660, 660, 700)) // encostar não é conflito
    }

    func testNascimento() {
        let today = Quadra.date("2026-10-11")!
        XCTAssertNil(birthError("29/02/2000", today: today))
        XCTAssertNotNil(birthError("29/02/2001", today: today)) // não existe
        XCTAssertNotNil(birthError("12/10/2026", today: today)) // futuro
        XCTAssertNotNil(birthError("1/2/2000", today: today))
        XCTAssertEqual(formatBirth("15032000"), "15/03/2000")
        XCTAssertEqual(formatBirth("15/03/20001"), "15/03/2000")
    }

    func testEncaixeNaAgenda() {
        let ocupado = [Booking(id: "b", date: day, start: "18:00", end: "19:00", sport: .FUTEBOL, organizerId: "x", organizerName: "X", notes: "")]
        XCTAssertTrue(fitsSlot(day: day, start: 17 * 60, duration: 60, bookings: ocupado, now: before))
        XCTAssertFalse(fitsSlot(day: day, start: 17 * 60 + 30, duration: 60, bookings: ocupado, now: before))
        XCTAssertFalse(fitsSlot(day: day, start: 21 * 60 + 30, duration: 60, bookings: [], now: before))
    }

    func testSenha() {
        XCTAssertNil(passwordError("quadra123"))
        XCTAssertNotNil(passwordError("quadra1")) // curta
        XCTAssertNotNil(passwordError("quadraquadra")) // sem número
        XCTAssertNotNil(passwordError("QUADRA123")) // sem minúscula
    }
}
