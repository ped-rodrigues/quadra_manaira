package br.com.quadramanaira.ui.screens.calendar

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.quadramanaira.AppContainer
import br.com.quadramanaira.Repos
import br.com.quadramanaira.data.model.Booking
import br.com.quadramanaira.data.model.Sport
import br.com.quadramanaira.data.model.UserProfile
import br.com.quadramanaira.data.model.Weather
import br.com.quadramanaira.util.DateUtils
import br.com.quadramanaira.util.toUserMessage
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.time.LocalDate

class CalendarViewModel(private val repos: Repos, private val container: AppContainer) : ViewModel() {

    val bookings: StateFlow<List<Booking>?> = repos.bookings.upcoming()
        .catch { emit(emptyList()) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), null)

    private val _selectedDate = MutableStateFlow(DateUtils.today())
    val selectedDate: StateFlow<LocalDate> = _selectedDate.asStateFlow()

    private val _weather = MutableStateFlow<Weather?>(null)
    val weather: StateFlow<Weather?> = _weather.asStateFlow()
    private val _weatherError = MutableStateFlow(false)
    val weatherError: StateFlow<Boolean> = _weatherError.asStateFlow()

    /** Mensagem de resultado (sucesso ou erro) para mostrar num Snackbar. */
    private val _message = MutableStateFlow<String?>(null)
    val message: StateFlow<String?> = _message.asStateFlow()

    private val _saving = MutableStateFlow(false)
    val saving: StateFlow<Boolean> = _saving.asStateFlow()

    init {
        refreshWeather()
    }

    fun selectDate(date: LocalDate) {
        _selectedDate.value = date
    }

    fun refreshWeather() {
        viewModelScope.launch {
            container.weatherService.current()
                .onSuccess { _weather.value = it; _weatherError.value = false }
                .onFailure { _weatherError.value = true }
        }
    }

    /** Retorna true pelo callback quando o agendamento foi criado (para fechar o diálogo). */
    fun create(me: UserProfile, start: String, end: String, sport: Sport, notes: String, onDone: (Boolean) -> Unit) {
        if (_saving.value) return
        _saving.value = true
        viewModelScope.launch {
            val result = repos.bookings.create(me, _selectedDate.value, start, end, sport, notes)
            _saving.value = false
            _message.value = result.fold(
                onSuccess = { "Jogo agendado! Você recebe um lembrete 24h antes." },
                onFailure = { it.toUserMessage() },
            )
            onDone(result.isSuccess)
        }
    }

    fun cancel(booking: Booking) {
        viewModelScope.launch {
            _message.value = repos.bookings.cancel(booking).fold(
                onSuccess = { "Agendamento cancelado. Horário liberado." },
                onFailure = { it.toUserMessage() },
            )
        }
    }

    fun messageShown() {
        _message.value = null
    }
}
