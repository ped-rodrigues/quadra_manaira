package com.example.ui.screens;
public final class CalendarScreenKt$CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$21$lambda$20$lambda$19$lambda$18$$inlined$items$default$4 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function4 {
    final synthetic java.util.List $items;
    final synthetic androidx.compose.runtime.State $selectedDate$delegate$inlined;
    final synthetic com.example.ui.viewmodel.QuadraViewModel $viewModel$inlined;

    public CalendarScreenKt$CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$21$lambda$20$lambda$19$lambda$18$$inlined$items$default$4(java.util.List p1, com.example.ui.viewmodel.QuadraViewModel p2, androidx.compose.runtime.State p3)
    {
        this.$items = p1;
        this.$viewModel$inlined = p2;
        this.$selectedDate$delegate$inlined = p3;
        super(4);
        return;
    }

    public bridge synthetic Object invoke(Object p5, Object p6, Object p7, Object p8)
    {
        this.invoke(((androidx.compose.foundation.lazy.LazyItemScope) p5), ((Number) p6).intValue(), ((androidx.compose.runtime.Composer) p7), ((Number) p8).intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.lazy.LazyItemScope p33, int p34, androidx.compose.runtime.Composer p35, int p36)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p35, "C152@7074L22:LazyDsl.kt#428nma");
        int v3_0 = p36;
        if ((p36 & 6) == 0) {
            String v5_1;
            if (!p35.changed(p33)) {
                v5_1 = 2;
            } else {
                v5_1 = 4;
            }
            v3_0 = (p36 | v5_1);
        }
        if ((p36 & 48) == 0) {
            String v5_4;
            if (!p35.changed(p34)) {
                v5_4 = 16;
            } else {
                v5_4 = 32;
            }
            v3_0 |= v5_4;
        }
        if (((v3_0 & 147) == 146) && (p35.getSkipping())) {
            p35.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-632812321, v3_0, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
            }
            int v14_2;
            String v5_11 = ((kotlin.Triple) this.$items.get(p34));
            p35.startReplaceGroup(484384566);
            androidx.compose.runtime.ComposerKt.sourceInformation(p35, "C*175@7852L41,176@7924L1111,165@7183L1852:CalendarScreen.kt#2thlc2");
            androidx.compose.ui.graphics.Shape v9_4 = ((String) v5_11.component1());
            long v10_2 = ((String) v5_11.component2());
            String v5_13 = ((String) v5_11.component3());
            boolean v11_2 = kotlin.jvm.internal.Intrinsics.areEqual(com.example.ui.screens.CalendarScreenKt.access$CalendarScreen$lambda$3(this.$selectedDate$delegate$inlined), v9_4);
            if (!v11_2) {
                v14_2 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            } else {
                v14_2 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
            }
            long v12_12;
            String v1_19 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 1));
            if (!v11_2) {
                v12_12 = androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.Color.Companion.getLightGray-0d7_KjU(), 1056964608, 0, 0, 0, 14, 0);
            } else {
                v12_12 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
            }
            String v1_2;
            androidx.compose.foundation.BorderStroke v16_0 = androidx.compose.foundation.BorderStrokeKt.BorderStroke-cXLIe8U(v1_19, v12_12);
            if (!v11_2) {
                v1_2 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 1));
            } else {
                v1_2 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 4));
            }
            int v19_0 = v1_2;
            androidx.compose.ui.Modifier v22_0 = androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 62)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p35, 569836373, "CC(remember):CalendarScreen.kt#9igjgp");
            kotlin.jvm.functions.Function2 v17_0 = (p35.changedInstance(this.$viewModel$inlined) | p35.changed(v9_4));
            String v1_10 = p35.rememberedValue();
            if ((v17_0 != null) || (v1_10 == androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v1_10 = ((kotlin.jvm.functions.Function0) new com.example.ui.screens.CalendarScreenKt$CalendarScreen$2$1$1$2$1$2$1$1$1$1(this.$viewModel$inlined, v9_4));
                p35.updateRememberedValue(v1_10);
            }
            kotlin.jvm.functions.Function0 v26_1 = ((kotlin.jvm.functions.Function0) v1_10);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p35);
            String v1_13 = androidx.compose.foundation.ClickableKt.clickable-XHw0xAI$default(v22_0, 0, 0, 0, v26_1, 7, 0);
            androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(v1_13, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 14)))), v14_2, 0, 0, v19_0, v16_0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1784188401, 1, new com.example.ui.screens.CalendarScreenKt$CalendarScreen$2$1$1$2$1$2$1$1$2(v11_2, v5_13, v10_2), p35, 54)), p35, 12582912, 24);
            p35.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return;
    }
}
