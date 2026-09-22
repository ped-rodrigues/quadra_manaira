package br.com.quadramanaira.data.repository

import br.com.quadramanaira.data.model.Avatars
import br.com.quadramanaira.data.model.Post
import br.com.quadramanaira.data.model.Sport
import br.com.quadramanaira.data.model.UserProfile
import br.com.quadramanaira.util.UserMessageException
import br.com.quadramanaira.util.asFlow
import br.com.quadramanaira.util.millis
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.tasks.await

/**
 * Mural compartilhado.
 * Curtidas por usuário em `posts/{id}/likes/{uid}` (corrige B3: antes era um único campo
 * `isLikedByMe` por post, igual para todo mundo).
 */
class MuralRepository(private val db: FirebaseFirestore) {

    private val postsCol get() = db.collection("posts")

    fun posts(myUid: String): Flow<List<Post>> {
        val posts = postsCol.orderBy("createdAt", Query.Direction.DESCENDING).limit(100).asFlow()
        val myLikes = db.collectionGroup("likes").whereEqualTo("uid", myUid).asFlow()
            .map { snap -> snap.documents.mapNotNull { it.reference.parent.parent?.id }.toSet() }
        return combine(posts, myLikes) { snap, liked ->
            snap.documents.map { doc ->
                Post(
                    id = doc.id,
                    authorId = doc.getString("authorId").orEmpty(),
                    authorName = doc.getString("authorName").orEmpty(),
                    authorAvatar = Avatars.from(doc.getString("authorAvatar")),
                    sport = Sport.from(doc.getString("sport")),
                    text = doc.getString("text").orEmpty(),
                    likesCount = doc.getLong("likesCount") ?: 0,
                    createdAt = doc.millis("createdAt"),
                    likedByMe = doc.id in liked,
                )
            }
        }
    }

    suspend fun publish(author: UserProfile, text: String, sport: Sport): Result<Unit> = runCatching {
        val clean = text.trim()
        if (clean.isEmpty()) throw UserMessageException("Escreva alguma coisa pra publicar.")
        if (clean.length > 1000) throw UserMessageException("Máximo de 1000 caracteres.")
        postsCol.add(
            mapOf(
                "authorId" to author.id,
                "authorName" to author.name,
                "authorAvatar" to author.avatar,
                "sport" to sport.name,
                "text" to clean,
                "likesCount" to 0L,
                "createdAt" to FieldValue.serverTimestamp(),
            )
        ).await()
    }

    /** Cria/remove a curtida e ajusta o contador no mesmo lote; as regras validam o par. */
    suspend fun toggleLike(post: Post, myUid: String): Result<Unit> = runCatching {
        val postRef = postsCol.document(post.id)
        val likeRef = postRef.collection("likes").document(myUid)
        val batch = db.batch()
        if (post.likedByMe) {
            batch.delete(likeRef)
            batch.update(postRef, "likesCount", FieldValue.increment(-1))
        } else {
            batch.set(likeRef, mapOf("uid" to myUid, "createdAt" to FieldValue.serverTimestamp()))
            batch.update(postRef, "likesCount", FieldValue.increment(1))
        }
        batch.commit().await()
    }

    suspend fun delete(post: Post): Result<Unit> = runCatching {
        postsCol.document(post.id).delete().await()
    }
}
