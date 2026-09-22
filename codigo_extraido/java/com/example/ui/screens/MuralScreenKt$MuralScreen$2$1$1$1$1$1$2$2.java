package com.example.ui.screens;
final class MuralScreenKt$MuralScreen$2$1$1$1$1$1$2$2 implements kotlin.jvm.functions.Function2 {
    final synthetic com.example.data.model.MuralPostEntity $post;

    MuralScreenKt$MuralScreen$2$1$1$1$1$1$2$2(com.example.data.model.MuralPostEntity p1)
    {
        this.$post = p1;
        return;
    }

    public bridge synthetic Object invoke(Object p3, Object p4)
    {
        this.invoke(((androidx.compose.runtime.Composer) p3), ((Number) p4).intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.runtime.Composer p10, int p11)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p10, "C199@9021L335:MuralScreen.kt#2thlc2");
        if (((p11 & 3) == 2) && (p10.getSkipping())) {
            p10.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1713357211, p11, -1, "com.example.ui.screens.MuralScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MuralScreen.kt:199)");
            }
            androidx.compose.ui.graphics.Color$Companion v0_8;
            if (!this.$post.isLikedByMe()) {
                v0_8 = androidx.compose.material.icons.filled.FavoriteBorderKt.getFavoriteBorder(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            } else {
                v0_8 = androidx.compose.material.icons.filled.FavoriteKt.getFavorite(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            }
            String v2_1;
            androidx.compose.ui.graphics.vector.ImageVector v1_2 = v0_8;
            if (!this.$post.isLikedByMe()) {
                v2_1 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            } else {
                v2_1 = androidx.compose.ui.graphics.ColorKt.Color(4293212469);
            }
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v1_2, "Curtir", 0, v2_1, p10, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return;
    }
}
