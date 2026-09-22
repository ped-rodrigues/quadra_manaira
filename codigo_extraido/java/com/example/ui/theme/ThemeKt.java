package com.example.ui.theme;
public final class ThemeKt {
    private static final androidx.compose.material3.ColorScheme DarkColorScheme;
    private static final androidx.compose.material3.ColorScheme LightColorScheme;

    static ThemeKt()
    {
        long v1_0 = com.example.ui.theme.ColorKt.getDarkPrimary();
        long v11_0 = com.example.ui.theme.ColorKt.getDarkSecondary();
        long v19_1 = com.example.ui.theme.ColorKt.getManaíraAmber();
        long v27_0 = com.example.ui.theme.ColorKt.getDarkBackground();
        com.example.ui.theme.ThemeKt.DarkColorScheme = androidx.compose.material3.ColorSchemeKt.darkColorScheme-C-Xl9yA$default(v1_0, 0, 0, 0, 0, v11_0, 0, 0, 0, v19_1, 0, 0, 0, v27_0, 0, androidx.compose.ui.graphics.ColorKt.Color(4280166715), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -41506, 15, 0);
        long v1_1 = com.example.ui.theme.ColorKt.getManaíraCyan();
        long v11_1 = com.example.ui.theme.ColorKt.getManaíraDarkBlue();
        long v19_0 = com.example.ui.theme.ColorKt.getManaíraAmber();
        long v27_1 = com.example.ui.theme.ColorKt.getManaíraSand();
        com.example.ui.theme.ThemeKt.LightColorScheme = androidx.compose.material3.ColorSchemeKt.lightColorScheme-C-Xl9yA$default(v1_1, 0, 0, 0, 0, v11_1, 0, 0, 0, v19_0, 0, 0, 0, v27_1, 0, androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -41506, 15, 0);
        return;
    }

    public static final void MyApplicationTheme(boolean p12, boolean p13, kotlin.jvm.functions.Function2 p14, androidx.compose.runtime.Composer p15, int p16, int p17)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "content");
        androidx.compose.runtime.Composer v9 = p15.startRestartGroup(548420513);
        androidx.compose.runtime.ComposerKt.sourceInformation(v9, "C(MyApplicationTheme)P(1,2)49@1440L84:Theme.kt#75kw8w");
        int v15_1 = p16;
        if ((p16 & 6) == 0) {
            if (((p17 & 1) != 0) || (!v9.changed(p12))) {
                boolean v1_4 = 2;
            } else {
                v1_4 = 4;
            }
            v15_1 = (p16 | v1_4);
        }
        boolean v1_5 = (p17 & 2);
        if (!v1_5) {
            if ((p16 & 48) == 0) {
                int v2_3;
                if (!v9.changed(p13)) {
                    v2_3 = 16;
                } else {
                    v2_3 = 32;
                }
                v15_1 |= v2_3;
            }
        } else {
            v15_1 |= 48;
        }
        if ((p16 & 384) == 0) {
            int v2_6;
            if (!v9.changedInstance(p14)) {
                v2_6 = 128;
            } else {
                v2_6 = 256;
            }
            v15_1 |= v2_6;
        }
        if (((v15_1 & 147) == 146) && (v9.getSkipping())) {
            v9.skipToGroupEnd();
            boolean v1_2 = p12;
            int v2_0 = p13;
        } else {
            v9.startDefaults();
            androidx.compose.runtime.ComposerKt.sourceInformation(v9, "33@974L21");
            if (((p16 & 1) != 0) && (!v9.getDefaultsInvalid())) {
                v9.skipToGroupEnd();
                if ((p17 & 1) != 0) {
                    v15_1 &= -15;
                }
            } else {
                if ((p17 & 1) != 0) {
                    p12 = androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(v9, 0);
                    v15_1 &= -15;
                }
                if (v1_5) {
                    p13 = 1;
                }
            }
            v9.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(548420513, v15_1, -1, "com.example.ui.theme.MyApplicationTheme (Theme.kt:37)");
            }
            androidx.compose.material3.ColorScheme v5_2;
            if ((p13 == 0) || (android.os.Build$VERSION.SDK_INT < 31)) {
                if (!p12) {
                    v9.startReplaceGroup(-1248848431);
                    v9.endReplaceGroup();
                    v5_2 = com.example.ui.theme.ThemeKt.LightColorScheme;
                } else {
                    v9.startReplaceGroup(-1248849392);
                    v9.endReplaceGroup();
                    v5_2 = com.example.ui.theme.ThemeKt.DarkColorScheme;
                }
            } else {
                boolean v1_1;
                v9.startReplaceGroup(-59786128);
                androidx.compose.runtime.ComposerKt.sourceInformation(v9, "41@1255L7");
                int v2_15 = v9;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_15, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                androidx.compose.material3.ColorScheme v5_1 = v2_15.consume(((androidx.compose.runtime.CompositionLocal) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v2_15);
                boolean v0_2 = ((android.content.Context) v5_1);
                if (!p12) {
                    v1_1 = androidx.compose.material3.DynamicTonalPaletteKt.dynamicLightColorScheme(v0_2);
                } else {
                    v1_1 = androidx.compose.material3.DynamicTonalPaletteKt.dynamicDarkColorScheme(v0_2);
                }
                v9.endReplaceGroup();
                v5_2 = v1_1;
            }
            androidx.compose.material3.MaterialThemeKt.MaterialTheme(v5_2, 0, com.example.ui.theme.TypeKt.getTypography(), p14, v9, (((v15_1 << 3) & 7168) | 384), 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            v1_2 = p12;
            v2_0 = p13;
        }
        boolean v12_1 = v9.endRestartGroup();
        if (v12_1) {
            v12_1.updateScope(new com.example.ui.theme.ThemeKt$$ExternalSyntheticLambda0(v1_2, v2_0, p14, p16, p17));
        }
        return;
    }

    static final kotlin.Unit MyApplicationTheme$lambda$0(boolean p7, boolean p8, kotlin.jvm.functions.Function2 p9, int p10, int p11, androidx.compose.runtime.Composer p12, int p13)
    {
        com.example.ui.theme.ThemeKt.MyApplicationTheme(p7, p8, p9, p12, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p10 | 1)), p11);
        return kotlin.Unit.INSTANCE;
    }
}
