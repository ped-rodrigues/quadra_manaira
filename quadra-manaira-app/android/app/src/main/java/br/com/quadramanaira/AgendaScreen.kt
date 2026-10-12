package br.com.quadramanaira

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.WindowInsets
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import kotlinx.coroutines.launch
import java.time.LocalDate
import kotlin.math.roundToInt

private val HOUR = 64.dp
private val HOURS = (Quadra.CLOSE - Quadra.OPEN) / 60

@Composable
fun AgendaScreen(me: Profile, pad: PaddingValues, onLocal: () -> Unit) {
    val bookings by remember { Repo.bookings() }.collectAsStateWithLifecycle(null)
    val today = remember { Quadra.today() }
    var day by rememberSaveable { mutableStateOf(today.toString()) }
    var newAt by remember { mutableStateOf<String?>(null) }
    var toCancel by remember { mutableStateOf<Booking?>(null) }
    val snackbar = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val date = LocalDate.parse(day)
    val ofDay = bookings.orEmpty().filter { it.date == day }

    Scaffold(
        modifier = Modifier.padding(bottom = pad.calculateBottomPadding()),
        contentWindowInsets = WindowInsets(0),
        snackbarHost = { SnackbarHost(snackbar) },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = { newAt = firstFreeStart(date, ofDay) ?: run { scope.launch { snackbar.showSnackbar("Não há horário livre neste dia.") }; null } },
                icon = { Icon(Icons.Filled.Add, null) },
                text = { Text("Agendar") },
                containerColor = MaterialTheme.colorScheme.secondary,
                contentColor = MaterialTheme.colorScheme.onSecondary,
            )
        },
    ) { inner ->
        Column(Modifier.padding(inner).fillMaxSize()) {
            WeatherBand(onLocal)
            DateStrip(today, date, bookings.orEmpty().map { it.date }.toSet()) { day = it.toString() }
            Text(longDate(date), style = MaterialTheme.typography.titleLarge, modifier = Modifier.padding(start = 20.dp, top = 12.dp, bottom = 4.dp))
            if (bookings == null) Loading()
            else DayTimeline(date, ofDay, me.id, onFree = { newAt = it }, onOpen = { if (it.organizerId == me.id) toCancel = it })
        }
    }

    newAt?.let { start ->
        BookingSheet(me, date, start, ofDay, onDismiss = { newAt = null }) {
            newAt = null
            scope.launch { snackbar.showSnackbar("Jogo agendado. Você recebe um lembrete 24 h antes.") }
        }
    }
    toCancel?.let { b ->
        AlertDialog(
            onDismissRequest = { toCancel = null },
            title = { Text("Cancelar seu jogo?") },
            text = { Text("${b.sport.label} das ${b.start} às ${b.end}. O horário fica livre para outra pessoa.") },
            confirmButton = {
                TextButton(onClick = {
                    toCancel = null
                    scope.launch {
                        val msg = runCatching { Repo.cancel(b) }.fold({ "Jogo cancelado. Horário liberado." }, { it.friendly() })
                        snackbar.showSnackbar(msg)
                    }
                }) { Text("Cancelar jogo", color = MaterialTheme.colorScheme.error) }
            },
            dismissButton = { TextButton(onClick = { toCancel = null }) { Text("Manter") } },
        )
    }
}

private fun firstFreeStart(date: LocalDate, list: List<Booking>): String? {
    val now = Quadra.now()
    return (Quadra.OPEN until Quadra.CLOSE step 30).firstOrNull { m ->
        bookingError(date, hhmm(m), hhmm(m + 30), now) == null && list.none { overlaps(m, m + 30, minutes(it.start), minutes(it.end)) }
    }?.let(::hhmm)
}

/** Faixa do mar: clima na praia agora e a hora em que o sol nasceu (João Pessoa é onde ele nasce primeiro nas Américas). */
@Composable
private fun WeatherBand(onLocal: () -> Unit) {
    var weather by remember { mutableStateOf<Weather?>(null) }
    var failed by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) { runCatching { Repo.weather() }.onSuccess { weather = it }.onFailure { failed = true } }

    Surface(color = MaterialTheme.colorScheme.primary, contentColor = MaterialTheme.colorScheme.onPrimary) {
        Row(Modifier.fillMaxWidth().statusBarsPadding().padding(start = 20.dp, end = 8.dp, top = 8.dp, bottom = 16.dp), verticalAlignment = Alignment.Bottom) {
            Column(Modifier.weight(1f)) {
                Text("Praia de Manaíra", style = MaterialTheme.typography.titleLarge)
                val w = weather
                // Altura fixa: a faixa não pula quando o clima chega.
                Box(Modifier.heightIn(min = 64.dp), contentAlignment = Alignment.BottomStart) { when {
                    w != null -> Row(verticalAlignment = Alignment.Bottom) {
                        Text("${w.tempC}°", fontFamily = Placar, fontSize = 56.sp, lineHeight = 56.sp)
                        Column(Modifier.padding(start = 12.dp, bottom = 6.dp)) {
                            Text(w.condition, fontWeight = FontWeight.SemiBold)
                            Text("Vento de ${w.windKmh} km/h. Sol nasceu às ${w.sunrise}.", style = MaterialTheme.typography.bodySmall)
                        }
                    }
                    failed -> Text("Sem dados do clima agora.", Modifier.padding(top = 8.dp))
                    else -> Text("Olhando o céu…", Modifier.padding(top = 8.dp))
                } }
            }
            IconButton(onClick = onLocal) { Icon(Icons.Outlined.Place, "Como chegar na quadra") }
        }
    }
}

@Composable
private fun DateStrip(today: LocalDate, selected: LocalDate, busy: Set<String>, onSelect: (LocalDate) -> Unit) {
    val days = remember(today) { (0L until 14L).map(today::plusDays) }
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(days) { d ->
            val on = d == selected
            Surface(
                onClick = { onSelect(d) },
                shape = RoundedCornerShape(16.dp),
                color = if (on) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surfaceContainer,
                contentColor = if (on) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurface,
            ) {
                Column(Modifier.width(54.dp).padding(vertical = 8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(if (d == today) "Hoje" else weekday(d), style = MaterialTheme.typography.labelMedium)
                    Text("${d.dayOfMonth}", fontFamily = Placar, fontSize = 26.sp, lineHeight = 28.sp)
                    // Ponto amarelo = já tem jogo marcado no dia.
                    Box(Modifier.size(6.dp).background(if (d.toString() in busy) Linha else Color.Transparent, CircleShape))
                }
            }
        }
    }
}

/**
 * O dia da quadra, das 06:00 às 22:00, desenhado como as linhas do piso. Jogos são blocos que "crescem"
 * no lugar quando o dia aparece; tocar num espaço livre abre o agendamento já naquele horário.
 */
@Composable
private fun DayTimeline(date: LocalDate, list: List<Booking>, myUid: String, onFree: (String) -> Unit, onOpen: (Booking) -> Unit) {
    val scroll = rememberScrollState()
    val density = LocalDensity.current
    val isToday = date == Quadra.today()
    val nowMin = if (isToday) Quadra.now().let { it.hour * 60 + it.minute } else -1
    val lineColor = MaterialTheme.colorScheme.outlineVariant
    val pastColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f)

    LaunchedEffect(date) {
        val target = if (isToday) (nowMin - 60).coerceIn(Quadra.OPEN, Quadra.CLOSE) else 17 * 60
        scroll.scrollTo(with(density) { ((target - Quadra.OPEN) / 60f * HOUR.toPx()).roundToInt() })
    }

    Row(Modifier.verticalScroll(scroll).padding(start = 12.dp, end = 16.dp, top = 8.dp, bottom = 96.dp).height(HOUR * HOURS)) {
        Column(Modifier.width(52.dp)) {
            for (h in Quadra.OPEN / 60 until Quadra.CLOSE / 60) {
                Text(
                    hhmm(h * 60), fontFamily = Placar, fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.height(HOUR).offset(y = (-9).dp),
                )
            }
        }
        Box(
            Modifier.weight(1f).fillMaxHeight()
                .drawBehind {
                    val hourPx = HOUR.toPx()
                    if (nowMin > Quadra.OPEN) drawRect(pastColor, size = Size(size.width, (minOf(nowMin, Quadra.CLOSE) - Quadra.OPEN) / 60f * hourPx))
                    for (h in 0..HOURS) drawLine(lineColor, Offset(0f, h * hourPx), Offset(size.width, h * hourPx), strokeWidth = 1.dp.toPx())
                }
                .pointerInput(date, list, nowMin) {
                    detectTapGestures { pos ->
                        val m = Quadra.OPEN + (pos.y / HOUR.toPx() * 60).toInt() / 30 * 30
                        if (m >= nowMin && m < Quadra.CLOSE && list.none { overlaps(m, m + 30, minutes(it.start), minutes(it.end)) }) onFree(hhmm(m))
                    }
                },
        ) {
            list.forEachIndexed { i, b -> key(b.id) { GrowingBlock(b, i, b.organizerId == myUid) { onOpen(b) } } }
            if (nowMin in Quadra.OPEN..Quadra.CLOSE) {
                // Linha amarela do "agora".
                Box(Modifier.offset(y = HOUR * ((nowMin - Quadra.OPEN) / 60f) - 1.dp).fillMaxWidth().height(2.dp).background(Linha))
            }
        }
    }
}

/** O bloco cresce de cima para baixo ao aparecer, em cascata (índice × 60 ms). */
@Composable
private fun GrowingBlock(b: Booking, index: Int, mine: Boolean, onClick: () -> Unit) {
    val shown = remember { MutableTransitionState(false).apply { targetState = true } }
    AnimatedVisibility(
        shown,
        modifier = Modifier.offset(y = HOUR * ((minutes(b.start) - Quadra.OPEN) / 60f)),
        enter = expandVertically(tween(420, delayMillis = 60 * index, easing = FastOutSlowInEasing), expandFrom = Alignment.Top) +
            fadeIn(tween(300, delayMillis = 60 * index)),
    ) {
        BookingBlock(b, mine, Modifier.height(HOUR * ((minutes(b.end) - minutes(b.start)) / 60f)), onClick)
    }
}

@Composable
private fun BookingBlock(b: Booking, mine: Boolean, modifier: Modifier, onClick: () -> Unit) {
    Row(
        modifier.fillMaxWidth().padding(vertical = 2.dp)
            .background(if (mine) Mar else MarFundo, RoundedCornerShape(12.dp))
            .clickable(enabled = mine, onClickLabel = "Cancelar jogo", onClick = onClick),
    ) {
        // Faixa amarela = jogo seu.
        Box(Modifier.width(6.dp).fillMaxHeight().background(if (mine) Linha else Color.Transparent, RoundedCornerShape(topStart = 12.dp, bottomStart = 12.dp)))
        Column(Modifier.padding(horizontal = 12.dp, vertical = 6.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("${b.sport.emoji} ${b.sport.label}", fontFamily = Placar, fontSize = 20.sp, color = Color.White, modifier = Modifier.weight(1f, fill = false))
                Text("  ${b.start}–${b.end}", fontFamily = Placar, fontSize = 16.sp, color = Color.White.copy(alpha = 0.8f))
            }
            Text(
                if (mine) "Seu jogo. Toque para cancelar." else "Com ${b.organizerName}" + if (b.notes.isNotBlank()) ". ${b.notes}" else "",
                color = Color.White.copy(alpha = 0.85f), style = MaterialTheme.typography.bodySmall, maxLines = 2, overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

private val DURATIONS = listOf(30, 60, 90, 120, 150, 180)
private fun durationLabel(m: Int) = when {
    m < 60 -> "$m min"
    m % 60 == 0 -> "${m / 60} h"
    else -> "${m / 60}h${m % 60}"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun BookingSheet(me: Profile, date: LocalDate, initialStart: String, dayBookings: List<Booking>, onDismiss: () -> Unit, onBooked: () -> Unit) {
    val scope = rememberCoroutineScope()
    val busy = rememberBusy()
    val now = remember { Quadra.now() }
    fun fits(s: Int, d: Int) = s + d <= Quadra.CLOSE && bookingError(date, hhmm(s), hhmm(s + d), now) == null &&
        dayBookings.none { overlaps(s, s + d, minutes(it.start), minutes(it.end)) }
    val starts = remember(dayBookings) { (Quadra.OPEN until Quadra.CLOSE step 30).filter { fits(it, 30) } }
    var start by remember { mutableStateOf(minutes(initialStart)) }
    var duration by remember { mutableStateOf(DURATIONS.lastOrNull { it <= 90 && fits(minutes(initialStart), it) } ?: 30) }
    var sport by remember { mutableStateOf(me.sport) }
    var notes by remember { mutableStateOf("") }
    val listState = rememberLazyListState(initialFirstVisibleItemIndex = (starts.indexOf(start) - 1).coerceAtLeast(0))

    ModalBottomSheet(onDismissRequest = onDismiss) {
        Column(Modifier.padding(horizontal = 20.dp).padding(bottom = 24.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Text("Agendar", style = MaterialTheme.typography.headlineSmall)
            Text(longDate(date), color = MaterialTheme.colorScheme.onSurfaceVariant)
            Text("Começa às", style = MaterialTheme.typography.labelLarge)
            LazyRow(state = listState, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                items(starts) { s ->
                    FilterChip(
                        selected = s == start,
                        onClick = { start = s; if (!fits(s, duration)) duration = DURATIONS.last { (it <= duration && fits(s, it)) || it == 30 } },
                        label = { Text(hhmm(s), fontFamily = Placar, fontSize = 18.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = MaterialTheme.colorScheme.primary,
                            selectedLabelColor = MaterialTheme.colorScheme.onPrimary,
                        ),
                    )
                }
            }
            Text("Duração", style = MaterialTheme.typography.labelLarge)
            Chips(DURATIONS, duration, ::durationLabel, { duration = it }, enabled = { fits(start, it) })
            Text("Modalidade", style = MaterialTheme.typography.labelLarge)
            SportChips(sport) { sport = it }
            OutlinedTextField(
                notes, { if (it.length <= 300) notes = it },
                label = { Text("Recado para a galera (opcional)") }, placeholder = { Text("Ex.: falta um para fechar o time") },
                modifier = Modifier.fillMaxWidth(),
            )
            busy.error?.let { Text(it, color = MaterialTheme.colorScheme.error) }
            Button(
                onClick = { scope.act(busy) { Repo.book(me, date, hhmm(start), hhmm(start + duration), sport, notes); onBooked() } },
                enabled = !busy.running && fits(start, duration),
                modifier = Modifier.fillMaxWidth().height(52.dp),
            ) { Text(if (busy.running) "Agendando…" else "Agendar das ${hhmm(start)} às ${hhmm(start + duration)}") }
        }
    }
}
