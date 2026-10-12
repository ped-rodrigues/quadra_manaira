package br.com.quadramanaira.push

import android.Manifest
import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import br.com.quadramanaira.MainActivity
import br.com.quadramanaira.R

object Notifications {

    private fun prefs(context: Context) = context.getSharedPreferences("quadra_prefs", Context.MODE_PRIVATE)

    /** Avisos gerais (novos jogos, cancelamentos, aniversários). Desligado = só meus jogos e mensagens. */
    fun broadcastsEnabled(context: Context): Boolean = prefs(context).getBoolean("broadcasts", true)

    fun setBroadcastsEnabled(context: Context, enabled: Boolean) {
        prefs(context).edit().putBoolean("broadcasts", enabled).apply()
    }

    fun createChannel(context: Context) {
        val channel = NotificationChannel(
            context.getString(R.string.notification_channel_id),
            "Quadra de Manaíra",
            NotificationManager.IMPORTANCE_HIGH,
        ).apply {
            description = "Agendamentos, lembretes de jogo, mensagens e aniversários da comunidade"
        }
        context.getSystemService(NotificationManager::class.java).createNotificationChannel(channel)
    }

    /**
     * Mostra uma notificação local. O [key] vem do servidor (id do agendamento, da conversa...),
     * então a mesma notificação é atualizada em vez de duplicada (corrige F6).
     */
    @SuppressLint("MissingPermission") // permissão verificada logo abaixo
    fun show(context: Context, key: String, title: String, body: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU &&
            ContextCompat.checkSelfPermission(context, Manifest.permission.POST_NOTIFICATIONS) !=
            PackageManager.PERMISSION_GRANTED
        ) return

        val intent = Intent(context, MainActivity::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
        val pending = PendingIntent.getActivity(
            context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        val notification = NotificationCompat.Builder(context, context.getString(R.string.notification_channel_id))
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle(title)
            .setContentText(body)
            .setStyle(NotificationCompat.BigTextStyle().bigText(body))
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)
            .setContentIntent(pending)
            .build()
        try {
            NotificationManagerCompat.from(context).notify(key, 0, notification)
        } catch (_: SecurityException) {
            // Usuário revogou a permissão de notificação.
        }
    }
}
