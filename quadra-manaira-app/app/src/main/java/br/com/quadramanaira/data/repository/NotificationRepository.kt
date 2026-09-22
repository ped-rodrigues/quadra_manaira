package br.com.quadramanaira.data.repository

import br.com.quadramanaira.data.model.AppNotification
import br.com.quadramanaira.data.model.NotificationType
import br.com.quadramanaira.util.asFlow
import br.com.quadramanaira.util.millis
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.tasks.await

/** Histórico de notificações do usuário. Quem cria os itens são as Cloud Functions. */
class NotificationRepository(private val db: FirebaseFirestore) {

    private fun col(uid: String) = db.collection("users").document(uid).collection("notifications")

    fun notifications(uid: String): Flow<List<AppNotification>> =
        col(uid).orderBy("createdAt", Query.Direction.DESCENDING).limit(50).asFlow()
            .map { snap ->
                snap.documents.map {
                    AppNotification(
                        id = it.id,
                        type = NotificationType.from(it.getString("type")),
                        title = it.getString("title").orEmpty(),
                        message = it.getString("message").orEmpty(),
                        createdAt = it.millis("createdAt"),
                        read = it.getBoolean("read") ?: false,
                    )
                }
            }

    suspend fun markRead(uid: String, id: String) {
        runCatching { col(uid).document(id).update("read", true).await() }
    }

    suspend fun markAllRead(uid: String, items: List<AppNotification>) {
        val unread = items.filterNot { it.read }
        if (unread.isEmpty()) return
        runCatching {
            val batch = db.batch()
            unread.forEach { batch.update(col(uid).document(it.id), "read", true) }
            batch.commit().await()
        }
    }
}
