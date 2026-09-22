package com.example;
public final class MainActivityKt {

    public static final void QuadraApp(com.example.ui.viewmodel.QuadraViewModel p25, androidx.compose.runtime.Composer p26, int p27)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p25, "viewModel");
        androidx.compose.runtime.Composer v15 = p26.startRestartGroup(-1802227722);
        androidx.compose.runtime.ComposerKt.sourceInformation(v15, "C(QuadraApp)97@4093L7,98@4150L16,99@4225L16,100@4283L16,101@4341L16,102@4386L32,107@4641L300,105@4523L424,118@4974L404,118@4953L425,130@5410L128,130@5384L154:MainActivity.kt#to5c3");
        boolean v3_0 = p27;
        if ((p27 & 6) == 0) {
            kotlin.jvm.functions.Function2 v4_2;
            if (!v15.changedInstance(p25)) {
                v4_2 = 2;
            } else {
                v4_2 = 4;
            }
            v3_0 = (p27 | v4_2);
        }
        if (((v3_0 & 3) == 2) && (v15.getSkipping())) {
            v15.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1802227722, v3_0, -1, "com.example.QuadraApp (MainActivity.kt:96)");
            }
            kotlin.jvm.functions.Function2 v5_6;
            kotlin.jvm.functions.Function2 v5_3 = v15;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v5_3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            int v7_19 = v5_3.consume(((androidx.compose.runtime.CompositionLocal) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v5_3);
            androidx.compose.runtime.ScopeUpdateScope v2_6 = ((android.content.Context) v7_19);
            kotlin.jvm.functions.Function2 v4_9 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p25.getCurrentScreen(), 0, v15, 0, 1);
            int v8_3 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p25.getUnreadNotificationsCount(), 0, v15, 0, 1);
            long v9_2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p25.isSyncing(), 0, v15, 0, 1);
            androidx.compose.runtime.State v10_1 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p25.getUiMessage(), 0, v15, 0, 1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v15, -1069007082, "CC(remember):MainActivity.kt#9igjgp");
            int v13_8 = v15;
            int v7_21 = v13_8.rememberedValue();
            if (v7_21 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v5_6 = v7_21;
            } else {
                v5_6 = new androidx.compose.material3.SnackbarHostState();
                v13_8.updateRememberedValue(v5_6);
            }
            boolean v3_2;
            Object v20;
            kotlin.jvm.functions.Function2 v5_7 = ((androidx.compose.material3.SnackbarHostState) v5_6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v15);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v15, -1068998654, "CC(remember):MainActivity.kt#9igjgp");
            long v11_10 = v15.changedInstance(v2_6);
            int v13_9 = v15;
            kotlin.jvm.functions.Function2 v6_0 = v13_9.rememberedValue();
            if (v11_10 != 0) {
                v20 = v3_0;
                v3_2 = new com.example.MainActivityKt$$ExternalSyntheticLambda4(v2_6);
                v13_9.updateRememberedValue(v3_2);
            } else {
                v20 = v3_0;
                if (v6_0 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                    v3_2 = v6_0;
                }
            }
            int v7_4;
            boolean v3_5 = ((kotlin.jvm.functions.Function1) v3_2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v15);
            boolean v3_6 = androidx.activity.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(((androidx.activity.result.contract.ActivityResultContract) new androidx.activity.result.contract.ActivityResultContracts$RequestPermission()), v3_5, v15, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v15, -1068987894, "CC(remember):MainActivity.kt#9igjgp");
            int v7_2 = (v15.changedInstance(v2_6) | v15.changedInstance(v3_6));
            long v11_1 = v15;
            kotlin.jvm.functions.Function3 v14_0 = v11_1.rememberedValue();
            if ((v7_2 == 0) && (v14_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v7_4 = v14_0;
            } else {
                androidx.compose.runtime.State v22 = 0;
                v7_4 = ((kotlin.jvm.functions.Function2) new com.example.MainActivityKt$QuadraApp$1$1(v2_6, v3_6, 0));
                v11_1.updateRememberedValue(v7_4);
            }
            boolean v3_8;
            int v7_8 = ((kotlin.jvm.functions.Function2) v7_4);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v15);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(kotlin.Unit.INSTANCE, v7_8, v15, 6);
            kotlin.jvm.functions.Function2 v6_3 = com.example.MainActivityKt.QuadraApp$lambda$3(v10_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v15, -1068974218, "CC(remember):MainActivity.kt#9igjgp");
            int v7_11 = (v15.changed(v10_1) | v15.changedInstance(p25));
            long v11_4 = v15;
            int v13_2 = v11_4.rememberedValue();
            if ((v7_11 == 0) && (v13_2 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v3_8 = v13_2;
            } else {
                androidx.compose.material3.SnackbarHostState v21 = v7_11;
                v3_8 = ((kotlin.jvm.functions.Function2) new com.example.MainActivityKt$QuadraApp$2$1(v10_1, v5_7, p25, 0));
                v11_4.updateRememberedValue(v3_8);
            }
            boolean v3_12 = ((kotlin.jvm.functions.Function2) v3_8);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v15);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(v6_3, v3_12, v15, 0);
            if (com.example.MainActivityKt.QuadraApp$lambda$0(v4_9) != com.example.ui.viewmodel.AppScreen.LOGIN) {
                v15.startReplaceGroup(1222022142);
                androidx.compose.runtime.ComposerKt.sourceInformation(v15, "142@5743L3391,216@9160L3990,141@5685L35,287@13161L933,140@5648L8446");
                v22 = v8_3;
                androidx.compose.runtime.State v24 = v10_1;
                androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1295666850, 1, new com.example.MainActivityKt$$ExternalSyntheticLambda5(p25, v2_6, v9_2, v8_3), v15, 54)), ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-619974241, 1, new com.example.MainActivityKt$$ExternalSyntheticLambda6(p25, v4_9), v15, 54)), ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(55718368, 1, new com.example.MainActivityKt$$ExternalSyntheticLambda7(v5_7), v15, 54)), 0, 0, 0, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(892545257, 1, new com.example.MainActivityKt$$ExternalSyntheticLambda8(v4_9, p25), v15, 54)), v15, 805309872, 497);
                v15.endReplaceGroup();
            } else {
                v15.startReplaceGroup(1221705818);
                androidx.compose.runtime.ComposerKt.sourceInformation(v15, "138@5592L34");
                com.example.ui.screens.LoginScreenKt.LoginScreen(p25, v15, (v20 & 14));
                v15.endReplaceGroup();
                v21 = v5_7;
                androidx.compose.runtime.State v23 = v9_2;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope v2_1 = v15.endRestartGroup();
        if (v2_1 != null) {
            v2_1.updateScope(new com.example.MainActivityKt$$ExternalSyntheticLambda9(p25, p27));
        }
        return;
    }

    private static final com.example.ui.viewmodel.AppScreen QuadraApp$lambda$0(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((com.example.ui.viewmodel.AppScreen) p4.getValue());
    }

    private static final int QuadraApp$lambda$1(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((Number) p4.getValue()).intValue();
    }

    private static final boolean QuadraApp$lambda$2(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((Boolean) p4.getValue()).booleanValue();
    }

    static final kotlin.Unit QuadraApp$lambda$20(com.example.ui.viewmodel.QuadraViewModel p16, android.content.Context p17, androidx.compose.runtime.State p18, androidx.compose.runtime.State p19, androidx.compose.runtime.Composer p20, int p21)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p20, "C162@6631L97,165@6760L2342,143@5761L3359:MainActivity.kt#to5c3");
        if (((p21 & 3) == 2) && (p20.getSkipping())) {
            p20.skipToGroupEnd();
            android.content.Context v13 = p17;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1295666850, p21, -1, "com.example.QuadraApp.<anonymous> (MainActivity.kt:143)");
            }
            androidx.compose.material3.TopAppBarColors v6 = androidx.compose.material3.TopAppBarDefaults.INSTANCE.topAppBarColors-zjMxDiM(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 0, 0, 0, 0, p20, ((androidx.compose.material3.TopAppBarDefaults.$stable << 15) | 6), 30);
            kotlin.Unit v0_5 = com.example.ComposableSingletons$MainActivityKt.INSTANCE.getLambda$352749082$app();
            androidx.compose.material3.AppBarKt.TopAppBar-GHTll3U(v0_5, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1916343601, 1, new com.example.MainActivityKt$$ExternalSyntheticLambda0(p16, p17, p18, p19), p20, 54)), 0, 0, v6, 0, p20, 3078, 182);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$20$lambda$19(com.example.ui.viewmodel.QuadraViewModel p17, android.content.Context p18, androidx.compose.runtime.State p19, androidx.compose.runtime.State p20, androidx.compose.foundation.layout.RowScope p21, androidx.compose.runtime.Composer p22, int p23)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p21, "$this$TopAppBar");
        androidx.compose.runtime.ComposerKt.sourceInformation(p22, "C167@6857L23,167@6882L668,167@6836L714,184@7649L53,184@7628L352,193@8083L49,193@8134L946,193@8062L1018:MainActivity.kt#to5c3");
        if (((p23 & 17) == 16) && (p22.getSkipping())) {
            p22.skipToGroupEnd();
            androidx.compose.runtime.State v13 = p20;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1916343601, p23, -1, "com.example.QuadraApp.<anonymous>.<anonymous> (MainActivity.kt:167)");
            }
            int v9_4;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p22, 934772550, "CC(remember):MainActivity.kt#9igjgp");
            boolean v2_10 = p22.changedInstance(p17);
            int v5_3 = p22.rememberedValue();
            if ((!v2_10) && (v5_3 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v9_4 = v5_3;
            } else {
                v9_4 = new com.example.MainActivityKt$$ExternalSyntheticLambda14(p17);
                p22.updateRememberedValue(v9_4);
            }
            int v9_7;
            boolean v2_13 = ((kotlin.jvm.functions.Function0) v9_4);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p22);
            androidx.compose.material3.IconButtonKt.IconButton(v2_13, 0, 0, 0, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1077541804, 1, new com.example.MainActivityKt$$ExternalSyntheticLambda15(p19), p22, 54)), p22, 196608, 30);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p22, 934797924, "CC(remember):MainActivity.kt#9igjgp");
            boolean v2_16 = p22.changedInstance(p18);
            int v5_6 = p22.rememberedValue();
            if ((!v2_16) && (v5_6 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v9_7 = v5_6;
            } else {
                v9_7 = new com.example.MainActivityKt$$ExternalSyntheticLambda16(p18);
                p22.updateRememberedValue(v9_7);
            }
            int v9_1;
            boolean v2_19 = ((kotlin.jvm.functions.Function0) v9_7);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p22);
            androidx.compose.material3.IconButtonKt.IconButton(v2_19, 0, 0, 0, 0, com.example.ComposableSingletons$MainActivityKt.INSTANCE.getLambda$-950530141$app(), p22, 196608, 30);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p22, 934811808, "CC(remember):MainActivity.kt#9igjgp");
            boolean v2_1 = p22.changedInstance(p17);
            int v5_1 = p22.rememberedValue();
            if ((!v2_1) && (v5_1 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v9_1 = v5_1;
            } else {
                v9_1 = new com.example.MainActivityKt$$ExternalSyntheticLambda17(p17);
                p22.updateRememberedValue(v9_1);
            }
            boolean v2_4 = ((kotlin.jvm.functions.Function0) v9_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p22);
            androidx.compose.material3.IconButtonKt.IconButton(v2_4, 0, 0, 0, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-940759580, 1, new com.example.MainActivityKt$$ExternalSyntheticLambda18(p20), p22, 54)), p22, 196608, 30);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$20$lambda$19$lambda$10$lambda$9(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.syncNow();
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$20$lambda$19$lambda$11(androidx.compose.runtime.State p10, androidx.compose.runtime.Composer p11, int p12)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p11, "C:MainActivity.kt#to5c3");
        if (((p12 & 3) == 2) && (p11.getSkipping())) {
            p11.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1077541804, p12, -1, "com.example.QuadraApp.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:168)");
            }
            if (!com.example.MainActivityKt.QuadraApp$lambda$2(p10)) {
                p11.startReplaceGroup(462674680);
                androidx.compose.runtime.ComposerKt.sourceInformation(p11, "175@7272L222");
                androidx.compose.ui.graphics.vector.ImageVector vtmp9 = androidx.compose.material.icons.filled.SyncKt.getSync(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
                androidx.compose.material3.IconKt.Icon-ww6aTOc(vtmp9, "Sincronizar", 0, androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), p11, 3120, 4);
                p11.endReplaceGroup();
            } else {
                p11.startReplaceGroup(462366757);
                androidx.compose.runtime.ComposerKt.sourceInformation(p11, "169@6961L241");
                String v1_4 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
                long v3_1 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 2));
                boolean v0_17 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 20)));
                androidx.compose.material3.ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(v0_17, v1_4, v3_1, 0, 0, p11, 438, 24);
                p11.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$20$lambda$19$lambda$13$lambda$12(android.content.Context p1)
    {
        com.example.util.ExternalIntentsHelper.INSTANCE.shareAppOnWhatsApp(p1);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$20$lambda$19$lambda$15$lambda$14(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.navigateTo(com.example.ui.viewmodel.AppScreen.NOTIFICATIONS);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$20$lambda$19$lambda$18(androidx.compose.runtime.State p7, androidx.compose.runtime.Composer p8, int p9)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p8, "C195@8215L512,194@8164L890:MainActivity.kt#to5c3");
        if (((p9 & 3) == 2) && (p8.getSkipping())) {
            p8.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-940759580, p9, -1, "com.example.QuadraApp.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:194)");
            }
            androidx.compose.material3.BadgeKt.BadgedBox(((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2025908332, 1, new com.example.MainActivityKt$$ExternalSyntheticLambda13(p7), p8, 54)), 0, com.example.ComposableSingletons$MainActivityKt.INSTANCE.getLambda$1790634794$app(), p8, 390, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$20$lambda$19$lambda$18$lambda$17(androidx.compose.runtime.State p11, androidx.compose.foundation.layout.BoxScope p12, androidx.compose.runtime.Composer p13, int p14)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "$this$BadgedBox");
        androidx.compose.runtime.ComposerKt.sourceInformation(p13, "C:MainActivity.kt#to5c3");
        if (((p14 & 17) == 16) && (p13.getSkipping())) {
            p13.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2025908332, p14, -1, "com.example.QuadraApp.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:196)");
            }
            kotlin.Unit v8;
            if (com.example.MainActivityKt.QuadraApp$lambda$1(p11) <= 0) {
                v8 = p13;
                p13.startReplaceGroup(946524950);
            } else {
                p13.startReplaceGroup(954746739);
                androidx.compose.runtime.ComposerKt.sourceInformation(p13, "200@8516L139,197@8316L339");
                v8 = p13;
                androidx.compose.material3.BadgeKt.Badge-eopBjH0(0, androidx.compose.ui.graphics.ColorKt.Color(4293212469), androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(453536692, 1, new com.example.MainActivityKt$$ExternalSyntheticLambda12(p11), p13, 54)), p13, 3504, 1);
            }
            v8.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16(androidx.compose.runtime.State p28, androidx.compose.foundation.layout.RowScope p29, androidx.compose.runtime.Composer p30, int p31)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p29, "$this$Badge");
        androidx.compose.runtime.ComposerKt.sourceInformation(p30, "C201@8562L51:MainActivity.kt#to5c3");
        if (((p31 & 17) == 16) && (p30.getSkipping())) {
            p30.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(453536692, p31, -1, "com.example.QuadraApp.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:201)");
            }
            boolean v1_6;
            if (com.example.MainActivityKt.QuadraApp$lambda$1(p28) <= 9) {
                v1_6 = String.valueOf(com.example.MainActivityKt.QuadraApp$lambda$1(p28));
            } else {
                v1_6 = "9+";
            }
            androidx.compose.material3.TextKt.Text--4IGK_g(v1_6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p30, 0, 0, 131070);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final String QuadraApp$lambda$3(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((String) p4.getValue());
    }

    static final kotlin.Unit QuadraApp$lambda$32(com.example.ui.viewmodel.QuadraViewModel p12, androidx.compose.runtime.State p13, androidx.compose.runtime.Composer p14, int p15)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p14, "C220@9303L3833,217@9178L3958:MainActivity.kt#to5c3");
        if (((p15 & 3) == 2) && (p14.getSkipping())) {
            p14.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-619974241, p15, -1, "com.example.QuadraApp.<anonymous> (MainActivity.kt:217)");
            }
            androidx.compose.material3.NavigationBarKt.NavigationBar-HsRjFd4(0, androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 0, androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)), 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-385461946, 1, new com.example.MainActivityKt$$ExternalSyntheticLambda10(p12, p13), p14, 54)), p14, 199728, 21);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$32$lambda$31(com.example.ui.viewmodel.QuadraViewModel p37, androidx.compose.runtime.State p38, androidx.compose.foundation.layout.RowScope p39, androidx.compose.runtime.Composer p40, int p41)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p39, "$this$NavigationBar");
        androidx.compose.runtime.ComposerKt.sourceInformation(p40, "C224@9514L43,227@9816L250,222@9390L698,237@10272L44,240@10590L250,235@10147L715,250@11038L41,253@11341L250,248@10916L697,263@11796L44,266@12103L250,261@11671L704,276@12548L39,279@12846L250,274@12428L690:MainActivity.kt#to5c3");
        int v2_4 = p41;
        if ((p41 & 6) == 0) {
            kotlin.jvm.functions.Function0 v3_2;
            if (!p40.changed(p39)) {
                v3_2 = 2;
            } else {
                v3_2 = 4;
            }
            v2_4 = (p41 | v3_2);
        }
        if (((v2_4 & 19) == 18) && (p40.getSkipping())) {
            p40.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-385461946, v2_4, -1, "com.example.QuadraApp.<anonymous>.<anonymous> (MainActivity.kt:222)");
            }
            kotlin.jvm.functions.Function2 v22_3;
            int v20 = 1;
            if (com.example.MainActivityKt.QuadraApp$lambda$0(p38) != com.example.ui.viewmodel.AppScreen.PROFILE) {
                v22_3 = 0;
            } else {
                v22_3 = 1;
            }
            int v10_9;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p40, -1061735855, "CC(remember):MainActivity.kt#9igjgp");
            kotlin.jvm.functions.Function0 v3_15 = p40.changedInstance(p37);
            kotlin.jvm.functions.Function2 v7_13 = p40.rememberedValue();
            if ((v3_15 == null) && (v7_13 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v10_9 = v7_13;
            } else {
                v10_9 = new com.example.MainActivityKt$$ExternalSyntheticLambda19(p37);
                p40.updateRememberedValue(v10_9);
            }
            kotlin.jvm.functions.Function2 v22_0;
            kotlin.jvm.functions.Function2 v23_8 = ((kotlin.jvm.functions.Function0) v10_9);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p40);
            int v28_1 = v2_4;
            androidx.compose.material3.NavigationBarKt.NavigationBarItem(p39, v22_3, v23_8, com.example.ComposableSingletons$MainActivityKt.INSTANCE.getLambda$1510134955$app(), 0, 0, com.example.ComposableSingletons$MainActivityKt.INSTANCE.getLambda$-1945964536$app(), 0, androidx.compose.material3.NavigationBarItemDefaults.INSTANCE.colors-69fazGs(androidx.compose.ui.graphics.ColorKt.Color(4278223759), androidx.compose.ui.graphics.ColorKt.Color(4278223759), androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 1041865114, 0, 0, 0, 14, 0), 0, 0, 0, 0, p40, ((androidx.compose.material3.NavigationBarItemDefaults.$stable << 21) | 438), 120), 0, p40, ((v28_1 & 14) | 1575936), 344);
            if (com.example.MainActivityKt.QuadraApp$lambda$0(p38) != com.example.ui.viewmodel.AppScreen.CALENDAR) {
                v22_0 = 0;
            } else {
                v22_0 = 1;
            }
            int v8_1;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p40, -1061711598, "CC(remember):MainActivity.kt#9igjgp");
            int v2_3 = p40.changedInstance(p37);
            int v5_1 = p40.rememberedValue();
            if ((v2_3 == 0) && (v5_1 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v8_1 = v5_1;
            } else {
                v8_1 = new com.example.MainActivityKt$$ExternalSyntheticLambda20(p37);
                p40.updateRememberedValue(v8_1);
            }
            kotlin.jvm.functions.Function2 v22_1;
            kotlin.jvm.functions.Function2 v23_1 = ((kotlin.jvm.functions.Function0) v8_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p40);
            androidx.compose.material3.NavigationBarKt.NavigationBarItem(p39, v22_0, v23_1, com.example.ComposableSingletons$MainActivityKt.INSTANCE.getLambda$1045558050$app(), 0, 0, com.example.ComposableSingletons$MainActivityKt.INSTANCE.getLambda$-256332993$app(), 0, androidx.compose.material3.NavigationBarItemDefaults.INSTANCE.colors-69fazGs(androidx.compose.ui.graphics.ColorKt.Color(4278223759), androidx.compose.ui.graphics.ColorKt.Color(4278223759), androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 1041865114, 0, 0, 0, 14, 0), 0, 0, 0, 0, p40, ((androidx.compose.material3.NavigationBarItemDefaults.$stable << 21) | 438), 120), 0, p40, ((v28_1 & 14) | 1575936), 344);
            if (com.example.MainActivityKt.QuadraApp$lambda$0(p38) != com.example.ui.viewmodel.AppScreen.MURAL) {
                v22_1 = 0;
            } else {
                v22_1 = 1;
            }
            int v8_8;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p40, -1061687089, "CC(remember):MainActivity.kt#9igjgp");
            int v2_10 = p40.changedInstance(p37);
            int v5_3 = p40.rememberedValue();
            if ((v2_10 == 0) && (v5_3 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v8_8 = v5_3;
            } else {
                v8_8 = new com.example.MainActivityKt$$ExternalSyntheticLambda1(p37);
                p40.updateRememberedValue(v8_8);
            }
            kotlin.jvm.functions.Function2 v22_2;
            kotlin.jvm.functions.Function2 v23_3 = ((kotlin.jvm.functions.Function0) v8_8);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p40);
            androidx.compose.material3.NavigationBarKt.NavigationBarItem(p39, v22_1, v23_3, com.example.ComposableSingletons$MainActivityKt.INSTANCE.getLambda$637534435$app(), 0, 0, com.example.ComposableSingletons$MainActivityKt.INSTANCE.getLambda$-664356608$app(), 0, androidx.compose.material3.NavigationBarItemDefaults.INSTANCE.colors-69fazGs(androidx.compose.ui.graphics.ColorKt.Color(4278223759), androidx.compose.ui.graphics.ColorKt.Color(4278223759), androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 1041865114, 0, 0, 0, 14, 0), 0, 0, 0, 0, p40, ((androidx.compose.material3.NavigationBarItemDefaults.$stable << 21) | 438), 120), 0, p40, ((v28_1 & 14) | 1575936), 344);
            if (com.example.MainActivityKt.QuadraApp$lambda$0(p38) != com.example.ui.viewmodel.AppScreen.MESSAGES) {
                v22_2 = 0;
            } else {
                v22_2 = 1;
            }
            int v8_15;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p40, -1061662830, "CC(remember):MainActivity.kt#9igjgp");
            int v2_17 = p40.changedInstance(p37);
            int v5_6 = p40.rememberedValue();
            if ((v2_17 == 0) && (v5_6 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v8_15 = v5_6;
            } else {
                v8_15 = new com.example.MainActivityKt$$ExternalSyntheticLambda2(p37);
                p40.updateRememberedValue(v8_15);
            }
            kotlin.jvm.functions.Function2 v23_5 = ((kotlin.jvm.functions.Function0) v8_15);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p40);
            androidx.compose.material3.NavigationBarKt.NavigationBarItem(p39, v22_2, v23_5, com.example.ComposableSingletons$MainActivityKt.INSTANCE.getLambda$229510820$app(), 0, 0, com.example.ComposableSingletons$MainActivityKt.INSTANCE.getLambda$-1072380223$app(), 0, androidx.compose.material3.NavigationBarItemDefaults.INSTANCE.colors-69fazGs(androidx.compose.ui.graphics.ColorKt.Color(4278223759), androidx.compose.ui.graphics.ColorKt.Color(4278223759), androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 1041865114, 0, 0, 0, 14, 0), 0, 0, 0, 0, p40, ((androidx.compose.material3.NavigationBarItemDefaults.$stable << 21) | 438), 120), 0, p40, ((v28_1 & 14) | 1575936), 344);
            if (com.example.MainActivityKt.QuadraApp$lambda$0(p38) != com.example.ui.viewmodel.AppScreen.MAP) {
                v20 = 0;
            }
            kotlin.jvm.functions.Function2 v7_10;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p40, -1061638771, "CC(remember):MainActivity.kt#9igjgp");
            boolean v1_21 = p40.changedInstance(p37);
            kotlin.jvm.functions.Function2 v4_10 = p40.rememberedValue();
            if ((!v1_21) && (v4_10 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v7_10 = v4_10;
            } else {
                v7_10 = new com.example.MainActivityKt$$ExternalSyntheticLambda3(p37);
                p40.updateRememberedValue(v7_10);
            }
            kotlin.jvm.functions.Function0 v21_2 = ((kotlin.jvm.functions.Function0) v7_10);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p40);
            androidx.compose.material3.NavigationBarKt.NavigationBarItem(p39, v20, v21_2, com.example.ComposableSingletons$MainActivityKt.INSTANCE.getLambda$-178512795$app(), 0, 0, com.example.ComposableSingletons$MainActivityKt.INSTANCE.getLambda$-1480403838$app(), 0, androidx.compose.material3.NavigationBarItemDefaults.INSTANCE.colors-69fazGs(androidx.compose.ui.graphics.ColorKt.Color(4278223759), androidx.compose.ui.graphics.ColorKt.Color(4278223759), androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 1041865114, 0, 0, 0, 14, 0), 0, 0, 0, 0, p40, ((androidx.compose.material3.NavigationBarItemDefaults.$stable << 21) | 438), 120), 0, p40, ((v28_1 & 14) | 1575936), 344);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$32$lambda$31$lambda$22$lambda$21(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.navigateTo(com.example.ui.viewmodel.AppScreen.PROFILE);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$32$lambda$31$lambda$24$lambda$23(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.navigateTo(com.example.ui.viewmodel.AppScreen.CALENDAR);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$32$lambda$31$lambda$26$lambda$25(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.navigateTo(com.example.ui.viewmodel.AppScreen.MURAL);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$32$lambda$31$lambda$28$lambda$27(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.navigateTo(com.example.ui.viewmodel.AppScreen.MESSAGES);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$32$lambda$31$lambda$30$lambda$29(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.navigateTo(com.example.ui.viewmodel.AppScreen.MAP);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$33(androidx.compose.material3.SnackbarHostState p9, androidx.compose.runtime.Composer p10, int p11)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p10, "C141@5687L31:MainActivity.kt#to5c3");
        if (((p11 & 3) == 2) && (p10.getSkipping())) {
            p10.skipToGroupEnd();
            androidx.compose.runtime.Composer v6 = p10;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(55718368, p11, -1, "com.example.QuadraApp.<anonymous> (MainActivity.kt:141)");
            }
            androidx.compose.material3.SnackbarHostKt.SnackbarHost(p9, 0, 0, p10, 6, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$36(androidx.compose.runtime.State p35, com.example.ui.viewmodel.QuadraViewModel p36, androidx.compose.foundation.layout.PaddingValues p37, androidx.compose.runtime.Composer p38, int p39)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p37, "innerPadding");
        androidx.compose.runtime.ComposerKt.sourceInformation(p38, "C288@13191L893:MainActivity.kt#to5c3");
        androidx.compose.runtime.Composer v2_4 = p39;
        if ((p39 & 6) == 0) {
            int v3_2;
            if (!p38.changed(p37)) {
                v3_2 = 2;
            } else {
                v3_2 = 4;
            }
            v2_4 = (p39 | v3_2);
        }
        if (((v2_4 & 19) == 18) && (p38.getSkipping())) {
            p38.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(892545257, v2_4, -1, "com.example.QuadraApp.<anonymous> (MainActivity.kt:288)");
            }
            int v3_16 = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), p37);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p38, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v11 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.Companion.getTopStart(), 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p38, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v5_3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p38, 0);
            androidx.compose.runtime.CompositionLocalMap v14_1 = p38.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v15_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p38, v3_16);
            kotlin.jvm.functions.Function0 vtmp11 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            int v17 = vtmp11;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p38, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p38.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p38.startReusableNode();
            if (!p38.getInserting()) {
                p38.useNode();
            } else {
                p38.createNode(v17);
            }
            int v1_6 = androidx.compose.runtime.Updater.constructor-impl(p38);
            androidx.compose.runtime.Updater.set-impl(v1_6, v11, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_6, v14_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            boolean v0_3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.BoxScope v20 = v1_6;
            if (v20.getInserting()) {
                Integer v23 = v3_16;
                v20.updateRememberedValue(Integer.valueOf(v5_3));
                v1_6.apply(Integer.valueOf(v5_3), v0_3);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v20.rememberedValue(), Integer.valueOf(v5_3))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v1_6, v15_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p38, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            v20 = ((androidx.compose.foundation.layout.BoxScope) androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p38, 2018539880, "C293@13409L661,293@13342L728:MainActivity.kt#to5c3");
            androidx.compose.animation.CrossfadeKt.Crossfade(com.example.MainActivityKt.QuadraApp$lambda$0(p35), 0, 0, "ScreenTransition", ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-168372769, 1, new com.example.MainActivityKt$$ExternalSyntheticLambda11(p36), p38, 54)), p38, 27648, 6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p38);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p38);
            p38.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p38);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p38);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p38);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$36$lambda$35$lambda$34(com.example.ui.viewmodel.QuadraViewModel p4, com.example.ui.viewmodel.AppScreen p5, androidx.compose.runtime.Composer p6, int p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "screen");
        androidx.compose.runtime.ComposerKt.sourceInformation(p6, "C:MainActivity.kt#to5c3");
        int v0_1 = p7;
        if ((p7 & 6) == 0) {
            boolean v1_2;
            if (!p6.changed(((Enum) p5).ordinal())) {
                v1_2 = 2;
            } else {
                v1_2 = 4;
            }
            v0_1 = (p7 | v1_2);
        }
        if (((v0_1 & 19) == 18) && (p6.getSkipping())) {
            p6.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-168372769, v0_1, -1, "com.example.QuadraApp.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:294)");
            }
            switch (com.example.MainActivityKt$WhenMappings.$EnumSwitchMapping$0[p5.ordinal()]) {
                case 1:
                    p6.startReplaceGroup(1402529185);
                    androidx.compose.runtime.ComposerKt.sourceInformation(p6, "295@13500L34");
                    com.example.ui.screens.LoginScreenKt.LoginScreen(p4, p6, 0);
                    p6.endReplaceGroup();
                    break;
                case 2:
                    p6.startReplaceGroup(1402531747);
                    androidx.compose.runtime.ComposerKt.sourceInformation(p6, "296@13580L36");
                    com.example.ui.screens.ProfileScreenKt.ProfileScreen(p4, p6, 0);
                    p6.endReplaceGroup();
                    break;
                case 3:
                    p6.startReplaceGroup(1402534404);
                    androidx.compose.runtime.ComposerKt.sourceInformation(p6, "297@13663L37");
                    com.example.ui.screens.CalendarScreenKt.CalendarScreen(p4, p6, 0);
                    p6.endReplaceGroup();
                    break;
                case 4:
                    p6.startReplaceGroup(1402536993);
                    androidx.compose.runtime.ComposerKt.sourceInformation(p6, "298@13744L34");
                    com.example.ui.screens.MuralScreenKt.MuralScreen(p4, p6, 0);
                    p6.endReplaceGroup();
                    break;
                case 5:
                    p6.startReplaceGroup(1402539588);
                    androidx.compose.runtime.ComposerKt.sourceInformation(p6, "299@13825L37");
                    com.example.ui.screens.MessagesScreenKt.MessagesScreen(p4, p6, 0);
                    p6.endReplaceGroup();
                    break;
                case 6:
                    p6.startReplaceGroup(1402542111);
                    androidx.compose.runtime.ComposerKt.sourceInformation(p6, "300@13904L32");
                    com.example.ui.screens.MapScreenKt.MapScreen(p4, p6, 0);
                    p6.endReplaceGroup();
                    break;
                case 7:
                    p6.startReplaceGroup(1402544809);
                    androidx.compose.runtime.ComposerKt.sourceInformation(p6, "301@13988L42");
                    com.example.ui.screens.NotificationsScreenKt.NotificationsScreen(p4, p6, 0);
                    p6.endReplaceGroup();
                    break;
                default:
                    p6.startReplaceGroup(1402527874);
                    p6.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$37(com.example.ui.viewmodel.QuadraViewModel p1, int p2, androidx.compose.runtime.Composer p3, int p4)
    {
        com.example.MainActivityKt.QuadraApp(p1, p3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p2 | 1)));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit QuadraApp$lambda$6$lambda$5(android.content.Context p2, boolean p3)
    {
        if (!p3) {
            android.widget.Toast.makeText(p2, ((CharSequence) "Ative as notifica\u00e7\u00f5es nas configura\u00e7\u00f5es para receber alertas de jogos e anivers\u00e1rios"), 1).show();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final synthetic String access$QuadraApp$lambda$3(androidx.compose.runtime.State p1)
    {
        return com.example.MainActivityKt.QuadraApp$lambda$3(p1);
    }
}
