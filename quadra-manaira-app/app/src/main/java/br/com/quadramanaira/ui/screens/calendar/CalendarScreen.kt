package br.com.quadramanaira.ui.screens.calendar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MenuAnchorType
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import br.com.quadramanaira.data.model.Booking
import br.com.quadramanaira.data.model.Sport
import br.com.quadramanaira.data.model.UserProfile
import br.com.quadramanaira.data.model.Weather
import br.com.quadramanaira.ui.components.EmptyState
import br.com.quadramanaira.ui.components.LoadingBox
import br.com.quadramanaira.ui.components.SportSelector
import br.com.quadramanaira.util.DateUtils
import java.time.LocalDate
import java.util.Locale

@Composable
fun CalendarScreen(vm: CalendarViewModel, me: UserProfile, contentPadding: PaddingValues) {
    val bookings by vm.bookings.collectAsStateWithLifecycle()
    val selected by vm.selectedDate.collectAsStateWithLifecycle()
    val weather by vm.weather.collectAsStateWithLifecycle()
    val weatherError by vm.weatherError.collectAsStateWithLifecycle()
    val message by vm.message.collectAsStateWithLifecycle()
    val saving by vm.saving.collectAsStateWithLifecycle()
    val snackbar = remember { SnackbarHostState() }
    var showNew by remember { mutableStateOf(false) }
    var toCancel by remember { mutableStateOf<Booking?>(null) }

    LaunchedEffect(message) {
        message?.let { snackbar.showSnackbar(it); vm.messageShown() }
    }

    Scaffold(
        modifier = Modifier.padding(contentPadding),
        contentWindowInsets = WindowInsets(0, 0, 0, 0),
        snackbarHost = { SnackbarHost(snackbar) },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = { showNew = true },
                icon = { Icon(Icons.Default.Add, null) },
                text = { Text("Agendar") },
            )
        },
    ) { padding ->
        Column(Modifier.padding(padding).fillMaxSize()) {
            WeatherCard(weather, weatherError, vm::refreshWeather)
            DateStrip(selected, bookings.orEmpty(), vm::selectDate)
            Text(
                DateUtils.longDate(selected),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            )
            val list = bookings
            when {
                list == null -> LoadingBox()
                else -> {
                    val ofDay = list.filter { it.date == selected.format(DateUtils.ISO_DATE) }
                    if (ofDay.isEmpty()) {
                        EmptyState("Nenhum jogo agendado para esta data.\nAproveite a quadra livre e seja o primeiro a agendar!")
                    } else {
                        LazyColumn(
                            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 88.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                        ) {
                            items(ofDay, key = { it.id }) { booking ->
                                BookingCard(booking, isMine = booking.organizerId == me.id, onCancel = { toCancel = booking })
                            }
                        }
                    }
                }
            }
        }
    }

    if (showNew) {
        NewBookingDialog(
            date = selected,
            saving = saving,
            onConfirm = { start, end, sport, notes ->
                vm.create(me, start, end, sport, notes) { ok -> if (ok) showNew = false }
            },
            onDismiss = { showNew = false },
        )
    }
    toCancel?.let { booking ->
        AlertDialog(
            onDismissRequest = { toCancel = null },
            title = { Text("Cancelar agendamento?") },
            text = { Text("${booking.sport.label} às ${booking.startTime}. O horário fica livre para outros atletas.") },
            confirmButton = { TextButton(onClick = { vm.cancel(booking); toCancel = null }) { Text("Cancelar jogo") } },
            dismissButton = { TextButton(onClick = { toCancel = null }) { Text("Voltar") } },
        )
    }
}

@Composable
private fun WeatherCard(weather: Weather?, error: Boolean, onRefresh: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer),
    ) {
        Row(Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
            Column(Modifier.weight(1f)) {
                Text("🌊 Praia de Manaíra", style = MaterialTheme.typography.labelLarge)
                when {
                    weather != null -> {
                        Text(
                            String.format(Locale.US, "%.0f°C • %s", weather.temperatureC, weather.condition),
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                        )
                        Text(
                            String.format(Locale.US, "Vento %.0f km/h • Umidade %d%%", weather.windKmh, weather.humidity),
                            style = MaterialTheme.typography.bodySmall,
                        )
                    }
                    error -> Text("Clima indisponível (sem conexão)", style = MaterialTheme.typography.bodyMedium)
                    else -> Text("Carregando clima...", style = MaterialTheme.typography.bodyMedium)
                }
            }
            IconButton(onClick = onRefresh) { Icon(Icons.Default.Refresh, "Atualizar clima") }
        }
    }
}

@Composable
private fun DateStrip(selected: LocalDate, bookings: List<Booking>, onSelect: (LocalDate) -> Unit) {
    val today = DateUtils.today()
    val days = remember(today) { (0L until 14L).map { today.plusDays(it) } }
    val busyDates = remember(bookings) { bookings.map { it.date }.toSet() }
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(days) { day ->
            val isSelected = day == selected
            Card(
                onClick = { onSelect(day) },
                colors = CardDefaults.cardColors(
                    containerColor = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surfaceVariant,
                    contentColor = if (isSelected) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurfaceVariant,
                ),
            ) {
                Column(
                    Modifier.padding(horizontal = 14.dp, vertical = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(if (day == today) "Hoje" else DateUtils.weekday(day), style = MaterialTheme.typography.labelSmall)
                    Text(day.dayOfMonth.toString(), style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                    Text(if (day.format(DateUtils.ISO_DATE) in busyDates) "●" else " ", style = MaterialTheme.typography.labelSmall)
                }
            }
        }
    }
}

@Composable
private fun BookingCard(booking: Booking, isMine: Boolean, onCancel: () -> Unit) {
    Card(Modifier.fillMaxWidth()) {
        Row(Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
            Text(booking.sport.emoji, style = MaterialTheme.typography.headlineMedium)
            Spacer(Modifier.width(12.dp))
            Column(Modifier.weight(1f)) {
                Text(
                    "${booking.startTime} – ${booking.endTime} • ${booking.sport.label}",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                )
                Text("Organizado por: ${booking.organizerName}", style = MaterialTheme.typography.bodySmall)
                if (booking.notes.isNotBlank()) {
                    Text("Obs.: ${booking.notes}", style = MaterialTheme.typography.bodySmall)
                }
            }
            if (isMine) TextButton(onClick = onCancel) { Text("Cancelar") }
        }
    }
}

@Composable
private fun NewBookingDialog(
    date: LocalDate,
    saving: Boolean,
    onConfirm: (start: String, end: String, sport: Sport, notes: String) -> Unit,
    onDismiss: () -> Unit,
) {
    var start by remember { mutableStateOf("18:00") }
    var end by remember { mutableStateOf("19:30") }
    var sport by remember { mutableStateOf(Sport.FUTEBOL) }
    var notes by remember { mutableStateOf("") }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Agendar ${DateUtils.longDate(date)}") },
        text = {
            Column(
                Modifier.verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    TimeDropdown("Início", start, DateUtils.timeOptions.dropLast(1), { start = it }, Modifier.weight(1f))
                    TimeDropdown("Fim", end, DateUtils.timeOptions.drop(1), { end = it }, Modifier.weight(1f))
                }
                Text("Modalidade", style = MaterialTheme.typography.labelLarge)
                SportSelector(sport, { sport = it })
                OutlinedTextField(
                    value = notes,
                    onValueChange = { if (it.length <= 300) notes = it },
                    label = { Text("Observações (opcional)") },
                    placeholder = { Text("Ex.: partida aberta para duplas") },
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        },
        confirmButton = {
            TextButton(onClick = { onConfirm(start, end, sport, notes) }, enabled = !saving) {
                Text(if (saving) "Agendando..." else "Agendar")
            }
        },
        dismissButton = { TextButton(onClick = onDismiss) { Text("Fechar") } },
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TimeDropdown(
    label: String,
    value: String,
    options: List<String>,
    onSelect: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    var expanded by remember { mutableStateOf(false) }
    ExposedDropdownMenuBox(expanded = expanded, onExpandedChange = { expanded = it }, modifier = modifier) {
        OutlinedTextField(
            value = value,
            onValueChange = {},
            readOnly = true,
            label = { Text(label) },
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded) },
            modifier = Modifier.menuAnchor(MenuAnchorType.PrimaryNotEditable),
        )
        ExposedDropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            options.forEach { option ->
                DropdownMenuItem(text = { Text(option) }, onClick = { onSelect(option); expanded = false })
            }
        }
    }
}
