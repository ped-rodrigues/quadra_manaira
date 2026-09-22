package com.example.ui.screens;
public final class MessagesScreenKt$ConversationsListView$lambda$15$lambda$14$$inlined$items$default$4 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function4 {
    final synthetic java.util.List $items;
    final synthetic kotlin.jvm.functions.Function1 $onSelectAthlete$inlined;

    public MessagesScreenKt$ConversationsListView$lambda$15$lambda$14$$inlined$items$default$4(java.util.List p1, kotlin.jvm.functions.Function1 p2)
    {
        this.$items = p1;
        this.$onSelectAthlete$inlined = p2;
        super(4);
        return;
    }

    public bridge synthetic Object invoke(Object p5, Object p6, Object p7, Object p8)
    {
        this.invoke(((androidx.compose.foundation.lazy.LazyItemScope) p5), ((Number) p6).intValue(), ((androidx.compose.runtime.Composer) p7), ((Number) p8).intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.lazy.LazyItemScope p31, int p32, androidx.compose.runtime.Composer p33, int p34)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p33, "C152@7074L22:LazyDsl.kt#428nma");
        int v3_0 = p34;
        if ((p34 & 6) == 0) {
            com.example.data.model.UserEntity v5_1;
            if (!p33.changed(p31)) {
                v5_1 = 2;
            } else {
                v5_1 = 4;
            }
            v3_0 = (p34 | v5_1);
        }
        if ((p34 & 48) == 0) {
            com.example.data.model.UserEntity v5_4;
            if (!p33.changed(p32)) {
                v5_4 = 16;
            } else {
                v5_4 = 32;
            }
            v3_0 |= v5_4;
        }
        if (((v3_0 & 147) == 146) && (p33.getSkipping())) {
            p33.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-632812321, v3_0, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
            }
            int v6_0;
            int v7_2 = (v3_0 & 14);
            com.example.data.model.UserEntity v5_11 = ((com.example.data.model.UserEntity) this.$items.get(p32));
            p33.startReplaceGroup(1919597514);
            androidx.compose.runtime.ComposerKt.sourceInformation(p33, "C*152@6122L40,153@6209L38,156@6364L28,157@6411L1547,150@6019L1939:MessagesScreen.kt#2thlc2");
            androidx.compose.foundation.shape.RoundedCornerShape v22 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.material3.CardColors v19_1 = androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 0, 0, 0, p33, ((androidx.compose.material3.CardDefaults.$stable << 12) | 6), 14);
            androidx.compose.material3.CardElevation v12_5 = androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(((float) 1)), 0, 0, 0, 0, 0, p33, ((androidx.compose.material3.CardDefaults.$stable << 18) | 6), 62);
            androidx.compose.runtime.Composer v15_2 = p33;
            androidx.compose.ui.Modifier v23 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p33, 754668290, "CC(remember):MessagesScreen.kt#9igjgp");
            androidx.compose.ui.Modifier v9_1 = p33.changed(this.$onSelectAthlete$inlined);
            if (((((v7_2 & 112) ^ 48) <= 32) || (!p33.changed(v5_11))) && ((v7_2 & 48) != 32)) {
                v6_0 = 0;
            } else {
                v6_0 = 1;
            }
            boolean v1_1;
            int v6_1 = (v6_0 | v9_1);
            androidx.compose.material3.CardColors v11_0 = p33.rememberedValue();
            if ((v6_1 == 0) && (v11_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v1_1 = v11_0;
            } else {
                v1_1 = ((kotlin.jvm.functions.Function0) new com.example.ui.screens.MessagesScreenKt$ConversationsListView$1$1$1$1$1(this.$onSelectAthlete$inlined, v5_11));
                p33.updateRememberedValue(v1_1);
            }
            kotlin.jvm.functions.Function0 v27_1 = ((kotlin.jvm.functions.Function0) v1_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p33);
            androidx.compose.ui.Modifier v9_3 = androidx.compose.foundation.ClickableKt.clickable-XHw0xAI$default(v23, 0, 0, 0, v27_1, 7, 0);
            androidx.compose.material3.CardKt.Card(v9_3, ((androidx.compose.ui.graphics.Shape) v22), v19_1, v12_5, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1638751732, 1, new com.example.ui.screens.MessagesScreenKt$ConversationsListView$1$1$1$2(v5_11), v15_2, 54)), v15_2, 196608, 16);
            p33.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return;
    }
}
