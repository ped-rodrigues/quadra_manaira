package com.example.ui.screens;
public final class NotificationsScreenKt$NotificationsScreen$lambda$27$lambda$26$$inlined$items$default$4 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function4 {
    final synthetic java.util.List $items;

    public NotificationsScreenKt$NotificationsScreen$lambda$27$lambda$26$$inlined$items$default$4(java.util.List p2)
    {
        this.$items = p2;
        super(4);
        return;
    }

    public bridge synthetic Object invoke(Object p5, Object p6, Object p7, Object p8)
    {
        this.invoke(((androidx.compose.foundation.lazy.LazyItemScope) p5), ((Number) p6).intValue(), ((androidx.compose.runtime.Composer) p7), ((Number) p8).intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.lazy.LazyItemScope p24, int p25, androidx.compose.runtime.Composer p26, int p27)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p26, "C152@7074L22:LazyDsl.kt#428nma");
        int v2_0 = p27;
        if ((p27 & 6) == 0) {
            com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$lambda$27$lambda$26$$inlined$items$default$4 v4_1;
            if (!p26.changed(p24)) {
                v4_1 = 2;
            } else {
                v4_1 = 4;
            }
            v2_0 = (p27 | v4_1);
        }
        if ((p27 & 48) == 0) {
            com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$lambda$27$lambda$26$$inlined$items$default$4 v4_4;
            if (!p26.changed(p25)) {
                v4_4 = 16;
            } else {
                v4_4 = 32;
            }
            v2_0 |= v4_4;
        }
        if (((v2_0 & 147) == 146) && (p26.getSkipping())) {
            p26.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-632812321, v2_0, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
            }
            androidx.compose.ui.Modifier v8_0;
            com.example.data.model.NotificationEntity v5_4 = ((com.example.data.model.NotificationEntity) this.$items.get(p25));
            p26.startReplaceGroup(-208323772);
            androidx.compose.runtime.ComposerKt.sourceInformation(p26, "C*252@12178L127,255@12352L38,257@12465L2490,250@12075L2880:NotificationsScreen.kt#2thlc2");
            androidx.compose.ui.Modifier v8_11 = v5_4.getType();
            switch (v8_11.hashCode()) {
                case 2067288:
                    if (v8_11.equals("CHAT")) {
                        v8_0 = new kotlin.Pair(androidx.compose.material.icons.filled.ChatKt.getChat(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4281236786)));
                    } else {
                        v8_0 = new kotlin.Pair(androidx.compose.material.icons.filled.NotificationsKt.getNotifications(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4278220697)));
                    }
                    break;
                case 782668857:
                    if (!v8_11.equals("BOOKING")) {
                    } else {
                        v8_0 = new kotlin.Pair(androidx.compose.material.icons.filled.CalendarTodayKt.getCalendarToday(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4278223759)));
                    }
                    break;
                case 1325434051:
                    if (v8_11.equals("ALERT_24H")) {
                        v8_0 = new kotlin.Pair(androidx.compose.material.icons.filled.AlarmKt.getAlarm(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4285143962)));
                    }
                    break;
                case 1852002941:
                    if (v8_11.equals("BIRTHDAY")) {
                        v8_0 = new kotlin.Pair(androidx.compose.material.icons.filled.CakeKt.getCake(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4293284096)));
                    }
                    break;
                default:
            }
            androidx.compose.material3.CardColors v10_10;
            androidx.compose.foundation.shape.RoundedCornerShape v21 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.ui.graphics.Shape v9_9 = v8_0;
            if (!v5_4.isRead()) {
                v10_10 = androidx.compose.ui.graphics.ColorKt.Color(4293983732);
            } else {
                v10_10 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            }
            boolean v0_1 = v9_9;
            androidx.compose.material3.CardColors v18_1 = androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(v10_10, 0, 0, 0, p26, (androidx.compose.material3.CardDefaults.$stable << 12), 14);
            androidx.compose.material3.CardElevation v11_4 = androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(((float) 1)), 0, 0, 0, 0, 0, p26, ((androidx.compose.material3.CardDefaults.$stable << 18) | 6), 62);
            androidx.compose.ui.Modifier vtmp40 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.material3.CardKt.Card(vtmp40, ((androidx.compose.ui.graphics.Shape) v21), v18_1, v11_4, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1468607992, 1, new com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$1$1$3$1(v0_1, v5_4), p26, 54)), p26, 196614, 16);
            p26.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return;
    }
}
