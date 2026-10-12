package br.com.quadramanaira.data.model

enum class Sport(val label: String, val emoji: String) {
    FUTEBOL("Futebol", "⚽"),
    BASQUETE("Basquete", "🏀"),
    VOLEI_PRAIA("Vôlei de Praia", "🏐"),
    GINASTICA("Ginástica", "🤸");

    companion object {
        fun from(value: String?): Sport = entries.firstOrNull { it.name == value } ?: FUTEBOL
    }
}

/** Avatares pré-definidos (o app original usava avatar_1..avatar_5). */
object Avatars {
    val all = listOf("🏄", "⚽", "🏐", "🏀", "🤸")
    fun from(value: String?): String = value?.takeIf { it in all } ?: all.first()
}

data class UserProfile(
    val id: String,
    val name: String,
    val email: String,
    /** dd/MM/yyyy; vazio quando o cadastro veio do Google e ainda não foi completado. */
    val birthDate: String,
    val sport: Sport,
    val avatar: String,
    /** Ids de atletas que eu bloqueei (só preenchido no meu próprio perfil). */
    val blocked: Set<String> = emptySet(),
) {
    val isComplete: Boolean get() = name.isNotBlank() && birthDate.isNotBlank()
}

enum class BookingStatus { CONFIRMED, CANCELLED }

data class Booking(
    val id: String,
    /** yyyy-MM-dd */
    val date: String,
    /** HH:mm */
    val startTime: String,
    /** HH:mm */
    val endTime: String,
    val sport: Sport,
    val organizerId: String,
    val organizerName: String,
    val notes: String,
    val status: BookingStatus,
)

data class Post(
    val id: String,
    val authorId: String,
    val authorName: String,
    val authorAvatar: String,
    val sport: Sport,
    val text: String,
    val likesCount: Long,
    val createdAt: Long,
    val likedByMe: Boolean = false,
)

data class Conversation(
    val id: String,
    val participants: List<String>,
    val names: Map<String, String>,
    val lastMessage: String,
    val lastAt: Long,
    val unread: Map<String, Long>,
) {
    fun otherId(me: String): String = participants.firstOrNull { it != me } ?: me
    fun otherName(me: String): String = names[otherId(me)] ?: "Atleta"
    fun unreadFor(me: String): Long = unread[me] ?: 0
}

data class ChatMessage(
    val id: String,
    val senderId: String,
    val text: String,
    val createdAt: Long,
)

enum class NotificationType { BOOKING, CHAT, ALERT_24H, BIRTHDAY, SYSTEM;
    companion object {
        fun from(value: String?): NotificationType = entries.firstOrNull { it.name == value } ?: SYSTEM
    }
}

data class AppNotification(
    val id: String,
    val type: NotificationType,
    val title: String,
    val message: String,
    val createdAt: Long,
    val read: Boolean,
)

data class Weather(
    val temperatureC: Double,
    val windKmh: Double,
    val humidity: Int,
    val condition: String,
    val isDay: Boolean,
)
