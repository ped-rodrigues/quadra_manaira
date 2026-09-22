package br.com.quadramanaira

import android.app.Application
import android.content.Context
import br.com.quadramanaira.data.remote.WeatherService
import br.com.quadramanaira.data.repository.AuthRepository
import br.com.quadramanaira.data.repository.BookingRepository
import br.com.quadramanaira.data.repository.ChatRepository
import br.com.quadramanaira.data.repository.MuralRepository
import br.com.quadramanaira.data.repository.NotificationRepository
import br.com.quadramanaira.data.repository.UserRepository
import br.com.quadramanaira.push.Notifications
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.messaging.FirebaseMessaging
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

class QuadraApp : Application() {
    lateinit var container: AppContainer
        private set

    override fun onCreate() {
        super.onCreate()
        container = AppContainer(this)
        Notifications.createChannel(this)
    }
}

/**
 * Dependências do app (injeção manual).
 * Se o google-services.json ainda não foi adicionado, o Firebase não inicializa:
 * [repos] fica nulo e o app mostra a tela de configuração.
 */
class AppContainer(context: Context) {
    val appScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    val weatherService = WeatherService()

    val repos: Repos? =
        if (FirebaseApp.getApps(context).isEmpty()) null
        else Repos.create(context.applicationContext)
}

class Repos(
    val auth: AuthRepository,
    val users: UserRepository,
    val bookings: BookingRepository,
    val mural: MuralRepository,
    val chat: ChatRepository,
    val notifications: NotificationRepository,
) {
    companion object {
        fun create(context: Context): Repos {
            val db = FirebaseFirestore.getInstance()
            val auth = FirebaseAuth.getInstance()
            val users = UserRepository(auth, db, FirebaseMessaging.getInstance())
            return Repos(
                auth = AuthRepository(context, auth, db, users),
                users = users,
                bookings = BookingRepository(db),
                mural = MuralRepository(db),
                chat = ChatRepository(db),
                notifications = NotificationRepository(db),
            )
        }
    }
}
