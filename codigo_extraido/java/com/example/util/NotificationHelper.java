package com.example.util;
public final class NotificationHelper {
    public static final int $stable = 0;
    public static final String CHANNEL_ID = "quadra_manaira_fcm_channel";
    public static final String CHANNEL_NAME = "Quadra de Mana\xedra - Notifica\xe7\xf5es";
    public static final com.example.util.NotificationHelper$Companion Companion;
    private final android.content.Context context;
    private final com.example.data.local.NotificationDao notificationDao;

    static NotificationHelper()
    {
        com.example.util.NotificationHelper.Companion = new com.example.util.NotificationHelper$Companion(0);
        com.example.util.NotificationHelper.$stable = 8;
        return;
    }

    public NotificationHelper(android.content.Context p2, com.example.data.local.NotificationDao p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "notificationDao");
        this.context = p2;
        this.notificationDao = p3;
        this.createNotificationChannel();
        return;
    }

    public static final synthetic com.example.data.local.NotificationDao access$getNotificationDao$p(com.example.util.NotificationHelper p1)
    {
        return p1.notificationDao;
    }

    private final void createNotificationChannel()
    {
        if (android.os.Build$VERSION.SDK_INT >= 26) {
            android.app.NotificationChannel v1_1 = new android.app.NotificationChannel("quadra_manaira_fcm_channel", ((CharSequence) "Quadra de Mana\u00edra - Notifica\u00e7\u00f5es"), 4);
            android.app.NotificationManager v2_0 = v1_1;
            v2_0.setDescription("Alertas de agendamentos, aniversariantes, mensagens e jogos na Quadra de Mana\u00edra");
            v2_0.enableVibration(1);
            android.app.NotificationManager v2_2 = this.context.getSystemService("notification");
            kotlin.jvm.internal.Intrinsics.checkNotNull(v2_2, "null cannot be cast to non-null type android.app.NotificationManager");
            ((android.app.NotificationManager) v2_2).createNotificationChannel(v1_1);
        }
        return;
    }

    public final void dispatchNotification(String p9, String p10, String p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "message");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(((kotlin.coroutines.CoroutineContext) kotlinx.coroutines.Dispatchers.getIO())), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.util.NotificationHelper$dispatchNotification$1(this, p9, p10, p11, 0)), 3, 0);
        if (android.os.Build$VERSION.SDK_INT >= 33) {
            if (androidx.core.content.ContextCompat.checkSelfPermission(this.context, "android.permission.POST_NOTIFICATIONS") != 0) {
                return;
            }
        }
        android.content.Intent v1_4 = new android.content.Intent(this.context, com.example.MainActivity);
        v1_4.setFlags(268468224);
        SecurityException v0_19 = new androidx.core.app.NotificationCompat$Builder(this.context, "quadra_manaira_fcm_channel").setSmallIcon(17301659).setContentTitle(((CharSequence) p10)).setContentText(((CharSequence) p11)).setStyle(((androidx.core.app.NotificationCompat$Style) new androidx.core.app.NotificationCompat$BigTextStyle().bigText(((CharSequence) p11)))).setPriority(1).setAutoCancel(1).setContentIntent(android.app.PendingIntent.getActivity(this.context, 0, v1_4, 201326592));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_19, "setContentIntent(...)");
        androidx.core.app.NotificationCompat$Builder v4_14 = v0_19;
        try {
            SecurityException v0_21 = androidx.core.app.NotificationManagerCompat.from(this.context);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_21, "from(...)");
            v0_21.notify(kotlin.random.Random.Default.nextInt(1000, 99999), v4_14.build());
        } catch (SecurityException v0) {
        }
        return;
    }

    public final void notify24HourReminder(String p4, String p5, String p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "sport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "time");
        this.dispatchNotification("ALERT_24H", "\u23f0 Lembrete de 24h - Jogo Amanh\u00e3!", new StringBuilder().append("Faltam 24h para o seu jogo de ").append(p4).append(" na Quadra de Mana\u00edra (").append(p5).append(" \u00e0s ").append(p6).append("). Prepare seu material esportivo!").toString());
        return;
    }

    public final void notifyBirthday(String p4, String p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "userName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "sport");
        this.dispatchNotification("BIRTHDAY", "\u1f389 Anivers\u00e1rio na Comunidade!", new StringBuilder().append("Hoje \u00e9 o anivers\u00e1rio de ").append(p4).append(" (").append(p5).append(")! D\u00ea os parab\u00e9ns pelo chat da Quadra de Mana\u00edra.").toString());
        return;
    }

    public final void notifyBookingChanged(boolean p5, String p6, String p7, String p8)
    {
        String v0_3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "sport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "time");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "organizer");
        if (!p5) {
            v0_3 = "\u2705 Novo Agendamento na Quadra";
        } else {
            v0_3 = "\u274c Agendamento Cancelado";
        }
        String v1_3;
        if (!p5) {
            v1_3 = new StringBuilder().append(p8).append(" agendou um jogo de ").append(p6).append(" \u00e0s ").append(p7).append(". Confira na aba Calend\u00e1rio!").toString();
        } else {
            v1_3 = new StringBuilder().append("O jogo de ").append(p6).append(" \u00e0s ").append(p7).append(" foi cancelado por ").append(p8).append(". Hor\u00e1rio liberado!").toString();
        }
        this.dispatchNotification("BOOKING", v0_3, v1_3);
        return;
    }

    public final void notifyPrivateMessage(String p4, String p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "senderName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "previewText");
        this.dispatchNotification("CHAT", new StringBuilder().append("\u1f4ac Nova Mensagem de ").append(p4).toString(), p5);
        return;
    }
}
