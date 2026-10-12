package br.com.quadramanaira

import android.Manifest
import android.annotation.SuppressLint
import android.app.Application
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.content.pm.PackageManager
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

const val CHANNEL = "quadra"

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Repo.app = this
        // Debug sem google-services.json: conecta no Firebase Emulator do PC (10.0.2.2 = host do emulador Android).
        // No release sem config o Firebase não sobe e o app mostra a tela de configuração (falha fechada).
        if (FirebaseApp.getApps(this).isEmpty() && BuildConfig.DEBUG) {
            FirebaseApp.initializeApp(
                this,
                FirebaseOptions.Builder()
                    .setProjectId("demo-quadra")
                    .setApplicationId("1:000000000000:android:0000000000000000")
                    .setApiKey("demo-key")
                    .build(),
            )
            FirebaseAuth.getInstance().useEmulator("10.0.2.2", 9099)
            FirebaseFirestore.getInstance().useEmulator("10.0.2.2", 8080)
        }
        getSystemService(NotificationManager::class.java).createNotificationChannel(
            NotificationChannel(CHANNEL, "Quadra de Manaíra", NotificationManager.IMPORTANCE_HIGH).apply {
                description = "Jogos, lembretes, mensagens e aniversários"
            },
        )
    }
}

/** Com o app em segundo plano o sistema mostra o push sozinho; aqui cuidamos do app aberto e do token. */
@SuppressLint("MissingFirebaseInstanceTokenRefresh") // FCM 26 entrega o token em onRegistered; o lint ainda pede o onNewToken antigo
class PushService : FirebaseMessagingService() {
    override fun onRegistered(token: String) = Repo.onToken(token)

    override fun onMessageReceived(message: RemoteMessage) {
        val n = message.notification ?: return
        if (checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) return
        val open = PendingIntent.getActivity(
            this, 0,
            Intent(this, MainActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        val notification = Notification.Builder(this, CHANNEL)
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle(n.title)
            .setContentText(n.body)
            .setStyle(Notification.BigTextStyle().bigText(n.body))
            .setAutoCancel(true)
            .setContentIntent(open)
            .build()
        // A tag vem do servidor (id do jogo, da conversa...): a mesma notificação é atualizada em vez de duplicar.
        getSystemService(NotificationManager::class.java).notify(n.tag ?: message.messageId, 0, notification)
    }
}
