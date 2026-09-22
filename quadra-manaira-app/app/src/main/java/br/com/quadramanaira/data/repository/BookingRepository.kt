package br.com.quadramanaira.data.repository

import br.com.quadramanaira.data.model.Booking
import br.com.quadramanaira.data.model.BookingStatus
import br.com.quadramanaira.data.model.Sport
import br.com.quadramanaira.data.model.UserProfile
import br.com.quadramanaira.util.DateUtils
import br.com.quadramanaira.util.UserMessageException
import br.com.quadramanaira.util.asFlow
import com.google.firebase.Timestamp
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.tasks.await
import java.time.Duration
import java.time.LocalDate
import java.time.LocalTime
import java.util.Date

/**
 * Agendamentos compartilhados entre todos os usuários.
 *
 * Conflito de horário (corrige B8): cada agendamento ocupa blocos de 30 min em `slots/{data}_{HH:mm}`.
 * Os blocos são criados na mesma transação do agendamento, e as regras do Firestore proíbem
 * sobrescrever um bloco existente. Assim dois aparelhos não conseguem reservar o mesmo horário.
 */
class BookingRepository(private val db: FirebaseFirestore) {

    private val bookingsCol get() = db.collection("bookings")
    private val slotsCol get() = db.collection("slots")

    /** Agendamentos confirmados de hoje em diante, ordenados por data e hora. */
    fun upcoming(): Flow<List<Booking>> =
        bookingsCol
            .whereGreaterThanOrEqualTo("date", DateUtils.today().format(DateUtils.ISO_DATE))
            .orderBy("date", Query.Direction.ASCENDING)
            .asFlow()
            .map { snap ->
                snap.documents.map { it.toBooking() }
                    .filter { it.status == BookingStatus.CONFIRMED }
                    .sortedWith(compareBy({ it.date }, { it.startTime }))
            }

    suspend fun create(
        organizer: UserProfile,
        date: LocalDate,
        startTime: String,
        endTime: String,
        sport: Sport,
        notes: String,
    ): Result<Unit> = runCatching {
        validate(date, startTime, endTime)
        val dateKey = date.format(DateUtils.ISO_DATE)
        val slots = DateUtils.slotsBetween(startTime, endTime)
        val slotRefs = slots.map { slotsCol.document("${dateKey}_$it") }
        val bookingRef = bookingsCol.document()
        val startAt = date.atTime(LocalTime.parse(startTime, DateUtils.TIME)).atZone(DateUtils.ZONE).toInstant()

        db.runTransaction { tx ->
            // Todas as leituras antes das escritas (exigência do Firestore).
            slotRefs.forEach { ref ->
                if (tx.get(ref).exists()) {
                    throw UserMessageException("Horário ocupado: já existe jogo às ${ref.id.substringAfter('_')}.")
                }
            }
            tx.set(
                bookingRef,
                mapOf(
                    "date" to dateKey,
                    "startTime" to startTime,
                    "endTime" to endTime,
                    "startAt" to Timestamp(Date.from(startAt)),
                    "sport" to sport.name,
                    "organizerId" to organizer.id,
                    "organizerName" to organizer.name,
                    "notes" to notes.trim().take(300),
                    "status" to BookingStatus.CONFIRMED.name,
                    "reminderSent" to false,
                    "createdAt" to FieldValue.serverTimestamp(),
                )
            )
            slotRefs.forEach { ref ->
                tx.set(ref, mapOf("bookingId" to bookingRef.id, "organizerId" to organizer.id, "date" to dateKey))
            }
        }.await()
    }

    /** Só o organizador cancela (garantido também pelas regras). Libera os blocos de horário. */
    suspend fun cancel(booking: Booking): Result<Unit> = runCatching {
        val batch = db.batch()
        batch.update(bookingsCol.document(booking.id), "status", BookingStatus.CANCELLED.name)
        DateUtils.slotsBetween(booking.startTime, booking.endTime).forEach {
            batch.delete(slotsCol.document("${booking.date}_$it"))
        }
        batch.commit().await()
    }

    private fun validate(date: LocalDate, startTime: String, endTime: String) {
        val start = LocalTime.parse(startTime, DateUtils.TIME)
        val end = LocalTime.parse(endTime, DateUtils.TIME)
        if (!end.isAfter(start)) throw UserMessageException("O horário de término precisa ser depois do início.")
        if (start.isBefore(DateUtils.OPENING) || end.isAfter(DateUtils.CLOSING)) {
            throw UserMessageException("A quadra funciona das 06:00 às 22:00.")
        }
        if (Duration.between(start, end).toMinutes() > DateUtils.MAX_BOOKING_MINUTES) {
            throw UserMessageException("Cada agendamento pode ter no máximo 3 horas.")
        }
        if (date.atTime(start).isBefore(DateUtils.now())) {
            throw UserMessageException("Não dá pra agendar num horário que já passou.")
        }
    }
}

private fun DocumentSnapshot.toBooking() = Booking(
    id = id,
    date = getString("date").orEmpty(),
    startTime = getString("startTime").orEmpty(),
    endTime = getString("endTime").orEmpty(),
    sport = Sport.from(getString("sport")),
    organizerId = getString("organizerId").orEmpty(),
    organizerName = getString("organizerName").orEmpty(),
    notes = getString("notes").orEmpty(),
    status = if (getString("status") == BookingStatus.CANCELLED.name) BookingStatus.CANCELLED else BookingStatus.CONFIRMED,
)
