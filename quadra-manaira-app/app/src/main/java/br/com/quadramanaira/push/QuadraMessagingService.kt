package br.com.quadramanaira.push

import br.com.quadramanaira.QuadraApp
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import kotlinx.coroutines.launch

/**
 * Recebe push do Firebase Cloud Messaging.
 * Com o app em segundo plano o Android mostra a notificação sozinho;
 * aqui tratamos o caso do app aberto e a renovação de token.
 */
class QuadraMessagingService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        val container = (application as QuadraApp).container
        val repos = container.repos ?: return
        val uid = repos.auth.currentUid ?: return
        container.appScope.launch {
            runCatching { repos.users.saveToken(uid, token) }
        }
    }

    override fun onMessageReceived(message: RemoteMessage) {
        val title = message.notification?.title ?: message.data["title"] ?: return
        val body = message.notification?.body ?: message.data["body"].orEmpty()
        val key = message.data["key"] ?: message.messageId ?: title
        Notifications.show(this, key, title, body)
    }
}
