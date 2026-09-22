package br.com.quadramanaira.data.repository

import br.com.quadramanaira.data.model.ChatMessage
import br.com.quadramanaira.data.model.Conversation
import br.com.quadramanaira.data.model.UserProfile
import br.com.quadramanaira.util.UserMessageException
import br.com.quadramanaira.util.asFlow
import br.com.quadramanaira.util.millis
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.SetOptions
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.tasks.await

/**
 * Chat privado entre dois atletas.
 * `conversations/{uidA_uidB}` guarda o resumo e o contador de não lidas por usuário (corrige B7);
 * as mensagens ficam em `conversations/{id}/messages`.
 * A notificação push vai para o destinatário via Cloud Function (corrige F4).
 */
class ChatRepository(private val db: FirebaseFirestore) {

    private val conversationsCol get() = db.collection("conversations")

    fun conversationId(a: String, b: String): String = listOf(a, b).sorted().joinToString("_")

    fun conversations(myUid: String): Flow<List<Conversation>> =
        conversationsCol
            .whereArrayContains("participants", myUid)
            .orderBy("lastAt", Query.Direction.DESCENDING)
            .asFlow()
            .map { snap ->
                snap.documents.map { doc ->
                    @Suppress("UNCHECKED_CAST")
                    Conversation(
                        id = doc.id,
                        participants = (doc.get("participants") as? List<String>).orEmpty(),
                        names = (doc.get("names") as? Map<String, String>).orEmpty(),
                        lastMessage = doc.getString("lastMessage").orEmpty(),
                        lastAt = doc.millis("lastAt"),
                        unread = (doc.get("unread") as? Map<String, Long>).orEmpty(),
                    )
                }
            }

    fun messages(conversationId: String): Flow<List<ChatMessage>> =
        conversationsCol.document(conversationId).collection("messages")
            .orderBy("createdAt", Query.Direction.ASCENDING)
            .limitToLast(200)
            .asFlow()
            .map { snap ->
                snap.documents.map {
                    ChatMessage(
                        id = it.id,
                        senderId = it.getString("senderId").orEmpty(),
                        text = it.getString("text").orEmpty(),
                        createdAt = it.millis("createdAt"),
                    )
                }
            }

    suspend fun send(me: UserProfile, other: UserProfile, text: String): Result<Unit> = runCatching {
        val clean = text.trim()
        if (clean.isEmpty()) return@runCatching
        if (clean.length > 2000) throw UserMessageException("Mensagem muito longa.")
        val convId = conversationId(me.id, other.id)
        val convRef = conversationsCol.document(convId)
        val msgRef = convRef.collection("messages").document()

        val batch = db.batch()
        batch.set(
            convRef,
            mapOf(
                "participants" to listOf(me.id, other.id).sorted(),
                "names" to mapOf(me.id to me.name, other.id to other.name),
                "lastMessage" to clean.take(120),
                "lastSenderId" to me.id,
                "lastAt" to FieldValue.serverTimestamp(),
                "unread" to mapOf(other.id to FieldValue.increment(1)),
            ),
            SetOptions.merge(),
        )
        batch.set(
            msgRef,
            mapOf(
                "senderId" to me.id,
                "receiverId" to other.id,
                "text" to clean,
                "createdAt" to FieldValue.serverTimestamp(),
            )
        )
        batch.commit().await()
    }

    /** Zera o contador de não lidas ao abrir a conversa. */
    suspend fun markRead(conversationId: String, myUid: String) {
        runCatching {
            conversationsCol.document(conversationId).update("unread.$myUid", 0).await()
        }
    }
}
