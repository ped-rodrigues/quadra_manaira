package br.com.quadramanaira.data.remote

import br.com.quadramanaira.data.model.Weather
import br.com.quadramanaira.util.QuadraInfo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

/** Clima atual na quadra via Open-Meteo (gratuito, sem chave). */
class WeatherService {

    suspend fun current(): Result<Weather> = withContext(Dispatchers.IO) {
        runCatching {
            val url = URL(
                "https://api.open-meteo.com/v1/forecast" +
                    "?latitude=${QuadraInfo.LAT}&longitude=${QuadraInfo.LNG}" +
                    "&current=temperature_2m,relative_humidity_2m,wind_speed_10m,weather_code,is_day" +
                    "&timezone=America%2FRecife"
            )
            val conn = (url.openConnection() as HttpURLConnection).apply {
                connectTimeout = 5000
                readTimeout = 5000
            }
            try {
                val body = conn.inputStream.bufferedReader().use { it.readText() }
                val current = JSONObject(body).getJSONObject("current")
                Weather(
                    temperatureC = current.getDouble("temperature_2m"),
                    windKmh = current.getDouble("wind_speed_10m"),
                    humidity = current.optInt("relative_humidity_2m"),
                    condition = describe(current.getInt("weather_code"), current.optInt("is_day", 1) == 1),
                    isDay = current.optInt("is_day", 1) == 1,
                )
            } finally {
                conn.disconnect()
            }
        }
    }

    /** Códigos WMO: https://open-meteo.com/en/docs */
    private fun describe(code: Int, isDay: Boolean): String = when (code) {
        0 -> if (isDay) "Céu limpo" else "Noite estrelada"
        1, 2 -> "Parcialmente nublado"
        3 -> "Nublado"
        45, 48 -> "Névoa marítima"
        51, 53, 55, 56, 57 -> "Garoa"
        61, 63, 65, 66, 67 -> "Chuva"
        80, 81, 82 -> "Pancadas de chuva"
        95, 96, 99 -> "Trovoadas"
        else -> "Tempo variável"
    }
}
