package com.example.ui.screens;
public final class ProfileScreenKt$ProfileScreen$lambda$37$lambda$36$$inlined$items$default$4 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function4 {
    final synthetic java.util.List $items;
    final synthetic com.example.ui.viewmodel.QuadraViewModel $viewModel$inlined;

    public ProfileScreenKt$ProfileScreen$lambda$37$lambda$36$$inlined$items$default$4(java.util.List p1, com.example.ui.viewmodel.QuadraViewModel p2)
    {
        this.$items = p1;
        this.$viewModel$inlined = p2;
        super(4);
        return;
    }

    public bridge synthetic Object invoke(Object p5, Object p6, Object p7, Object p8)
    {
        this.invoke(((androidx.compose.foundation.lazy.LazyItemScope) p5), ((Number) p6).intValue(), ((androidx.compose.runtime.Composer) p7), ((Number) p8).intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.lazy.LazyItemScope p23, int p24, androidx.compose.runtime.Composer p25, int p26)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p25, "C152@7074L22:LazyDsl.kt#428nma");
        int v3_0 = p26;
        if ((p26 & 6) == 0) {
            boolean v5_2;
            if (!p25.changed(p23)) {
                v5_2 = 2;
            } else {
                v5_2 = 4;
            }
            v3_0 = (p26 | v5_2);
        }
        if ((p26 & 48) == 0) {
            boolean v5_5;
            if (!p25.changed(p24)) {
                v5_5 = 16;
            } else {
                v5_5 = 32;
            }
            v3_0 |= v5_5;
        }
        if (((v3_0 & 147) == 146) && (p25.getSkipping())) {
            p25.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-632812321, v3_0, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
            }
            boolean v5_12 = ((com.example.data.model.UserEntity) this.$items.get(p24));
            p25.startReplaceGroup(1561829203);
            androidx.compose.runtime.ComposerKt.sourceInformation(p25, "C*324@14412L40,325@14495L38,327@14600L1967,322@14317L2250:ProfileScreen.kt#2thlc2");
            androidx.compose.foundation.shape.RoundedCornerShape v21 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.material3.CardColors v18_1 = androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 0, 0, 0, p25, ((androidx.compose.material3.CardDefaults.$stable << 12) | 6), 14);
            androidx.compose.material3.CardElevation v11_5 = androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(((float) 1)), 0, 0, 0, 0, 0, p25, ((androidx.compose.material3.CardDefaults.$stable << 18) | 6), 62);
            androidx.compose.ui.Modifier v8_8 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.material3.CardKt.Card(v8_8, ((androidx.compose.ui.graphics.Shape) p25), v18_1, v11_5, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(374925460, 1, new com.example.ui.screens.ProfileScreenKt$ProfileScreen$1$1$6$1(this.$viewModel$inlined, v5_12), p25, 54)), p25, 196614, 16);
            p25.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return;
    }
}
