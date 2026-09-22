package com.example.ui.screens;
public final class CalendarScreenKt$CalendarScreen$lambda$32$lambda$31$lambda$30$$inlined$items$default$4 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function4 {
    final synthetic android.content.Context $context$inlined;
    final synthetic androidx.compose.runtime.State $currentUser$delegate$inlined;
    final synthetic java.util.List $items;
    final synthetic com.example.ui.viewmodel.QuadraViewModel $viewModel$inlined;

    public CalendarScreenKt$CalendarScreen$lambda$32$lambda$31$lambda$30$$inlined$items$default$4(java.util.List p1, androidx.compose.runtime.State p2, com.example.ui.viewmodel.QuadraViewModel p3, android.content.Context p4)
    {
        this.$items = p1;
        this.$currentUser$delegate$inlined = p2;
        this.$viewModel$inlined = p3;
        this.$context$inlined = p4;
        super(4);
        return;
    }

    public bridge synthetic Object invoke(Object p5, Object p6, Object p7, Object p8)
    {
        this.invoke(((androidx.compose.foundation.lazy.LazyItemScope) p5), ((Number) p6).intValue(), ((androidx.compose.runtime.Composer) p7), ((Number) p8).intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.lazy.LazyItemScope p28, int p29, androidx.compose.runtime.Composer p30, int p31)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p30, "C152@7074L22:LazyDsl.kt#428nma");
        int v3_0 = p31;
        if ((p31 & 6) == 0) {
            androidx.compose.foundation.lazy.LazyItemScope v6_1;
            if (!p30.changed(p28)) {
                v6_1 = 2;
            } else {
                v6_1 = 4;
            }
            v3_0 = (p31 | v6_1);
        }
        if ((p31 & 48) == 0) {
            androidx.compose.foundation.lazy.LazyItemScope v6_4;
            if (!p30.changed(p29)) {
                v6_4 = 16;
            } else {
                v6_4 = 32;
            }
            v3_0 |= v6_4;
        }
        if (((v3_0 & 147) == 146) && (p30.getSkipping())) {
            p30.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-632812321, v3_0, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
            }
            androidx.compose.ui.Modifier v10_11;
            com.example.data.model.BookingEntity v9_1 = ((com.example.data.model.BookingEntity) this.$items.get(p29));
            p30.startReplaceGroup(-114369773);
            androidx.compose.runtime.ComposerKt.sourceInformation(p30, "C*276@12701L134,279@12886L38,283@13093L6156,274@12590L6659:CalendarScreen.kt#2thlc2");
            androidx.compose.ui.Modifier v10_10 = com.example.ui.screens.CalendarScreenKt.access$CalendarScreen$lambda$4(this.$currentUser$delegate$inlined);
            if (v10_10 == null) {
                v10_11 = 0;
            } else {
                v10_11 = v10_10.getId();
            }
            androidx.compose.ui.Modifier v10_17;
            if (kotlin.jvm.internal.Intrinsics.areEqual(v10_11, v9_1.getOrganizerId())) {
                v10_17 = 1;
            } else {
                androidx.compose.ui.Modifier v10_15;
                androidx.compose.ui.Modifier v10_14 = com.example.ui.screens.CalendarScreenKt.access$CalendarScreen$lambda$4(this.$currentUser$delegate$inlined);
                if (v10_14 == null) {
                    v10_15 = 0;
                } else {
                    v10_15 = v10_14.getName();
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v10_15, v9_1.getOrganizerName())) {
                    v10_17 = 0;
                }
            }
            androidx.compose.material3.CardElevation v13_9;
            int v23 = v10_17;
            boolean v24 = kotlin.jvm.internal.Intrinsics.areEqual(v9_1.getStatus(), "CANCELLED");
            androidx.compose.ui.graphics.Shape v25_1 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            if (!v24) {
                v13_9 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            } else {
                v13_9 = androidx.compose.ui.graphics.ColorKt.Color(4294963440);
            }
            androidx.compose.ui.Modifier v5_1 = 0;
            androidx.compose.material3.CardColors v20_1 = androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(v13_9, 0, 0, 0, p30, (androidx.compose.material3.CardDefaults.$stable << 12), 14);
            kotlin.jvm.functions.Function3 v15_4 = androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(((float) 2)), 0, 0, 0, 0, 0, p30, ((androidx.compose.material3.CardDefaults.$stable << 18) | 6), 62);
            androidx.compose.runtime.Composer v16_3 = p30;
            androidx.compose.ui.Modifier v5_2 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, v5_1), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)), 0, 2, v5_1);
            androidx.compose.material3.CardKt.Card(v5_2, ((androidx.compose.ui.graphics.Shape) v25_1), v20_1, v15_4, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-188841829, 1, new com.example.ui.screens.CalendarScreenKt$CalendarScreen$2$1$1$5$1(v9_1, v24, v23, this.$viewModel$inlined, this.$context$inlined, this.$currentUser$delegate$inlined), v16_3, 54)), v16_3, 196614, 16);
            p30.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return;
    }
}
