package br.com.quadramanaira.util

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.time.format.ResolverStyle
import java.util.Locale

object DateUtils {
    /** Fuso da quadra (João Pessoa, sem horário de verão). */
    val ZONE: ZoneId = ZoneId.of("America/Recife")
    private val PT_BR = Locale("pt", "BR")

    val ISO_DATE: DateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE
    val TIME: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm")
    private val BIRTH: DateTimeFormatter =
        DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT)
    private val DAY_MONTH: DateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM")
    private val WEEKDAY: DateTimeFormatter = DateTimeFormatter.ofPattern("EEE", PT_BR)
    private val LONG_DATE: DateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM", PT_BR)
    private val DATE_TIME: DateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM 'às' HH:mm", PT_BR)

    /** Horário de funcionamento da quadra e granularidade dos agendamentos. */
    val OPENING: LocalTime = LocalTime.of(6, 0)
    val CLOSING: LocalTime = LocalTime.of(22, 0)
    const val SLOT_MINUTES = 30L
    const val MAX_BOOKING_MINUTES = 180L

    fun today(): LocalDate = LocalDate.now(ZONE)
    fun now(): LocalDateTime = LocalDateTime.now(ZONE)

    /** Horários possíveis de início/fim: 06:00, 06:30 ... 22:00. */
    val timeOptions: List<String> = generateSequence(OPENING) { it.plusMinutes(SLOT_MINUTES) }
        .takeWhile { !it.isAfter(CLOSING) }
        .map { it.format(TIME) }
        .toList()

    /** Blocos de 30 min ocupados por um agendamento: [start, end). */
    fun slotsBetween(start: String, end: String): List<String> {
        val s = LocalTime.parse(start, TIME)
        val e = LocalTime.parse(end, TIME)
        return generateSequence(s) { it.plusMinutes(SLOT_MINUTES) }
            .takeWhile { it.isBefore(e) }
            .map { it.format(TIME) }
            .toList()
    }

    fun parseBirthDate(value: String): LocalDate? = try {
        LocalDate.parse(value.trim(), BIRTH)
    } catch (_: DateTimeParseException) {
        null
    }

    /** "dd/MM" do aniversário, usado para buscar aniversariantes do dia. */
    fun birthDayMonth(birthDate: String): String = parseBirthDate(birthDate)?.format(DAY_MONTH) ?: ""

    fun weekday(date: LocalDate): String = date.format(WEEKDAY).replace(".", "").replaceFirstChar { it.uppercase() }
    fun longDate(date: LocalDate): String = date.format(LONG_DATE).replaceFirstChar { it.uppercase() }
    fun dateTime(millis: Long): String =
        java.time.Instant.ofEpochMilli(millis).atZone(ZONE).format(DATE_TIME)
}
