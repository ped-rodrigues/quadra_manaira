package br.com.quadramanaira

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Test
import java.time.LocalDate

class LogicTest {
    private val day = LocalDate.of(2030, 1, 10)
    private val before = day.minusDays(1).atTime(12, 0)

    @Test fun slotsCobremOIntervaloSemOFim() {
        assertEquals(listOf("18:00", "18:30", "19:00"), slots("18:00", "19:30"))
        assertEquals(listOf("21:30"), slots("21:30", "22:00"))
    }

    @Test fun agendamentoValido() = assertNull(bookingError(day, "06:00", "09:00", before))

    @Test fun agendamentoInvalido() {
        assertNotNull(bookingError(day, "05:30", "07:00", before)) // antes de abrir
        assertNotNull(bookingError(day, "21:00", "22:30", before)) // depois de fechar
        assertNotNull(bookingError(day, "08:00", "11:30", before)) // mais de 3h
        assertNotNull(bookingError(day, "08:00", "08:00", before)) // vazio
        assertNotNull(bookingError(day, "08:15", "09:00", before)) // fora da grade de 30 min
        assertNotNull(bookingError(day, "08:00", "09:00", day.atTime(8, 1))) // já passou
    }

    @Test fun sobreposicao() {
        assert(overlaps(600, 660, 630, 700))
        assert(!overlaps(600, 660, 660, 700)) // encostar não é conflito
    }

    @Test fun nascimento() {
        val today = LocalDate.of(2026, 10, 11)
        assertNull(birthError("29/02/2000", today))
        assertNotNull(birthError("29/02/2001", today)) // não existe
        assertNotNull(birthError("12/10/2026", today)) // futuro
        assertNotNull(birthError("1/2/2000", today))
    }

    @Test fun senha() {
        assertNull(passwordError("quadra123"))
        assertNotNull(passwordError("quadra1")) // curta
        assertNotNull(passwordError("quadraquadra")) // sem número
        assertNotNull(passwordError("QUADRA123")) // sem minúscula
    }
}
