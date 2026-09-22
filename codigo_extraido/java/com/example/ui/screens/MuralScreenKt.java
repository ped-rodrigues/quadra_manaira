package com.example.ui.screens;
public final class MuralScreenKt {

    public static final void MuralScreen(com.example.ui.viewmodel.QuadraViewModel p23, androidx.compose.runtime.Composer p24, int p25)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p23, "viewModel");
        androidx.compose.runtime.Composer v15 = p24.startRestartGroup(1810919698);
        androidx.compose.runtime.ComposerKt.sourceInformation(v15, "C(MuralScreen)68@2943L7,69@2989L16,70@3057L16,71@3119L16,74@3182L708,91@3897L5886,73@3141L6642:MuralScreen.kt#2thlc2");
        String v3_5 = p25;
        if ((p25 & 6) == 0) {
            int v4_7;
            if (!v15.changedInstance(p23)) {
                v4_7 = 2;
            } else {
                v4_7 = 4;
            }
            v3_5 = (p25 | v4_7);
        }
        if (((v3_5 & 3) == 2) && (v15.getSkipping())) {
            v15.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1810919698, v3_5, -1, "com.example.ui.screens.MuralScreen (MuralScreen.kt:67)");
            }
            androidx.compose.runtime.Composer v5_5 = v15;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v5_5, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object v7_2 = v5_5.consume(((androidx.compose.runtime.CompositionLocal) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v5_5);
            com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda11 v2_7 = ((android.content.Context) v7_2);
            int v4_13 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p23.getMuralPosts(), 0, v15, 0, 1);
            androidx.compose.runtime.State v18 = androidx.compose.runtime.SnapshotStateKt.collectAsState(((kotlinx.coroutines.flow.StateFlow) p23.getShowNewPostDialog()), 0, v15, 0, 1);
            androidx.compose.runtime.State v19 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p23.getCurrentUser(), 0, v15, 0, 1);
            androidx.compose.runtime.State v22 = v4_13;
            androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(0, 0, 0, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1351574553, 1, new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda7(p23), v15, 54)), 0, 0, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(216102625, 1, new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda8(v4_13, p23), v15, 54)), v15, 805330944, 495);
            if (!com.example.ui.screens.MuralScreenKt.MuralScreen$lambda$1(v18)) {
                v15.startReplaceGroup(21685904);
            } else {
                String v3_4;
                v15.startReplaceGroup(31468605);
                androidx.compose.runtime.ComposerKt.sourceInformation(v15, "222@9962L45,223@10033L264,220@9856L451");
                String v3_3 = com.example.ui.screens.MuralScreenKt.MuralScreen$lambda$2(v19);
                if (v3_3 == null) {
                    v3_4 = "V\u00f4lei de Praia";
                } else {
                    v3_4 = v3_3.getSport();
                    if (v3_4 == null) {
                    }
                }
                kotlin.jvm.functions.Function0 v11_0;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v15, 832302399, "CC(remember):MuralScreen.kt#9igjgp");
                int v4_2 = v15.changedInstance(p23);
                int v6_0 = v15;
                int v8_0 = v6_0.rememberedValue();
                if ((v4_2 == 0) && (v8_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v11_0 = v8_0;
                } else {
                    v11_0 = new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda9(p23);
                    v6_0.updateRememberedValue(v11_0);
                }
                kotlin.jvm.functions.Function3 v10_2;
                kotlin.jvm.functions.Function0 v11_2 = ((kotlin.jvm.functions.Function0) v11_0);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v15);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v15, 832304890, "CC(remember):MuralScreen.kt#9igjgp");
                int v4_6 = (v15.changedInstance(p23) | v15.changedInstance(v2_7));
                androidx.compose.runtime.Composer v5_3 = v15;
                Object v7_0 = v5_3.rememberedValue();
                if ((v4_6 == 0) && (v7_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v10_2 = v7_0;
                } else {
                    v10_2 = new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda10(p23, v2_7);
                    v5_3.updateRememberedValue(v10_2);
                }
                kotlin.jvm.functions.Function3 v10_4 = ((kotlin.jvm.functions.Function3) v10_2);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v15);
                com.example.ui.screens.MuralScreenKt.NewPostDialog(v3_4, v11_2, v10_4, v15, 0);
            }
            v15.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        boolean v1_2 = v15.endRestartGroup();
        if (v1_2) {
            v1_2.updateScope(new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda11(p23, p25));
        }
        return;
    }

    private static final java.util.List MuralScreen$lambda$0(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((java.util.List) p4.getValue());
    }

    private static final boolean MuralScreen$lambda$1(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((Boolean) p4.getValue()).booleanValue();
    }

    static final kotlin.Unit MuralScreen$lambda$11$lambda$10(com.example.ui.viewmodel.QuadraViewModel p2)
    {
        p2.getShowNewPostDialog().setValue(Boolean.valueOf(0));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit MuralScreen$lambda$13$lambda$12(com.example.ui.viewmodel.QuadraViewModel p3, android.content.Context p4, String p5, String p6, boolean p7)
    {
        int v0_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "sport");
        if (!p7) {
            v0_2 = 0;
        } else {
            v0_2 = "quadra";
        }
        p3.createPost(p5, p6, v0_2);
        android.widget.Toast.makeText(p4, ((CharSequence) "Publicado no Mural!"), 0).show();
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit MuralScreen$lambda$14(com.example.ui.viewmodel.QuadraViewModel p1, int p2, androidx.compose.runtime.Composer p3, int p4)
    {
        com.example.ui.screens.MuralScreenKt.MuralScreen(p1, p3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p2 | 1)));
        return kotlin.Unit.INSTANCE;
    }

    private static final com.example.data.model.UserEntity MuralScreen$lambda$2(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((com.example.data.model.UserEntity) p4.getValue());
    }

    static final kotlin.Unit MuralScreen$lambda$5(com.example.ui.viewmodel.QuadraViewModel p14, androidx.compose.runtime.Composer p15, int p16)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p15, "C76@3244L44,75@3196L684:MuralScreen.kt#2thlc2");
        if (((p16 & 3) == 2) && (p15.getSkipping())) {
            p15.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1351574553, p16, -1, "com.example.ui.screens.MuralScreen.<anonymous> (MuralScreen.kt:75)");
            }
            int v12_0;
            long v3 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
            long v5 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            boolean v0_7 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p15, 1783024069, "CC(remember):MuralScreen.kt#9igjgp");
            int v1_2 = p15.changedInstance(p14);
            int v8_0 = p15.rememberedValue();
            if ((v1_2 == 0) && (v8_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v12_0 = v8_0;
            } else {
                v12_0 = new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda5(p14);
                p15.updateRememberedValue(v12_0);
            }
            int v12_2 = ((kotlin.jvm.functions.Function0) v12_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p15);
            androidx.compose.material3.FloatingActionButtonKt.FloatingActionButton-X-z6DiA(v12_2, 0, ((androidx.compose.ui.graphics.Shape) v0_7), v3, v5, 0, 0, com.example.ui.screens.ComposableSingletons$MuralScreenKt.INSTANCE.getLambda$2020349851$app(), p15, 12610560, 98);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit MuralScreen$lambda$5$lambda$4$lambda$3(com.example.ui.viewmodel.QuadraViewModel p2)
    {
        p2.getShowNewPostDialog().setValue(Boolean.valueOf(1));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit MuralScreen$lambda$9(androidx.compose.runtime.State p22, com.example.ui.viewmodel.QuadraViewModel p23, androidx.compose.foundation.layout.PaddingValues p24, androidx.compose.runtime.Composer p25, int p26)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p24, "innerPadding");
        androidx.compose.runtime.ComposerKt.sourceInformation(p25, "C99@4229L5548,92@3923L5854:MuralScreen.kt#2thlc2");
        boolean v3_2 = p26;
        if ((p26 & 6) == 0) {
            int v4_2;
            if (!p25.changed(p24)) {
                v4_2 = 2;
            } else {
                v4_2 = 4;
            }
            v3_2 = (p26 | v4_2);
        }
        int v15 = v3_2;
        if (((v15 & 19) == 18) && (p25.getSkipping())) {
            p25.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(216102625, v15, -1, "com.example.ui.screens.MuralScreen.<anonymous> (MuralScreen.kt:92)");
            }
            int v13_1;
            boolean v3_12 = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.graphics.ColorKt.Color(4294441724), 0, 2, 0), p24);
            androidx.compose.foundation.layout.PaddingValues v5_4 = androidx.compose.foundation.layout.PaddingKt.PaddingValues-a9UjIt4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)), androidx.compose.ui.unit.Dp.constructor-impl(((float) 80)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p25, 1516208589, "CC(remember):MuralScreen.kt#9igjgp");
            int v4_12 = (p25.changed(p22) | p25.changedInstance(p23));
            int v9_2 = p25.rememberedValue();
            if ((v4_12 == 0) && (v9_2 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v13_1 = v9_2;
            } else {
                v13_1 = new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda6(p22, p23);
                p25.updateRememberedValue(v13_1);
            }
            kotlin.jvm.functions.Function1 v11_1 = ((kotlin.jvm.functions.Function1) v13_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p25);
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(v3_12, 0, v5_4, 0, ((androidx.compose.foundation.layout.Arrangement$Vertical) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)))), 0, 0, 0, v11_1, p25, 24960, 234);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit MuralScreen$lambda$9$lambda$8$lambda$7(androidx.compose.runtime.State p10, com.example.ui.viewmodel.QuadraViewModel p11, androidx.compose.foundation.lazy.LazyListScope p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "$this$LazyColumn");
        androidx.compose.foundation.lazy.LazyListScope.item$default(p12, 0, 0, com.example.ui.screens.ComposableSingletons$MuralScreenKt.INSTANCE.getLambda$1869936845$app(), 3, 0);
        kotlin.Unit v12_1 = com.example.ui.screens.MuralScreenKt.MuralScreen$lambda$0(p10);
        int v5_0 = v12_1.size();
        p12.items(v5_0, 0, ((kotlin.jvm.functions.Function1) new com.example.ui.screens.MuralScreenKt$MuralScreen$lambda$9$lambda$8$lambda$7$$inlined$items$default$3(((kotlin.jvm.functions.Function1) com.example.ui.screens.MuralScreenKt$MuralScreen$lambda$9$lambda$8$lambda$7$$inlined$items$default$1.INSTANCE), v12_1)), ((kotlin.jvm.functions.Function4) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-632812321, 1, new com.example.ui.screens.MuralScreenKt$MuralScreen$lambda$9$lambda$8$lambda$7$$inlined$items$default$4(v12_1, p11))));
        return kotlin.Unit.INSTANCE;
    }

    public static final void NewPostDialog(String p27, kotlin.jvm.functions.Function0 p28, kotlin.jvm.functions.Function3 p29, androidx.compose.runtime.Composer p30, int p31)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p27, "defaultSport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p28, "onDismiss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p29, "onPublish");
        int v5_1 = p30.startRestartGroup(-520692109);
        androidx.compose.runtime.ComposerKt.sourceInformation(v5_1, "C(NewPostDialog)238@10497L31,239@10554L41,240@10620L33,312@13967L366,324@14359L104,245@10802L3139,242@10659L3810:MuralScreen.kt#2thlc2");
        kotlin.jvm.functions.Function2 v6_1 = p31;
        if ((p31 & 6) == 0) {
            kotlin.jvm.functions.Function2 v7_7;
            if (!v5_1.changed(p27)) {
                v7_7 = 2;
            } else {
                v7_7 = 4;
            }
            v6_1 = (p31 | v7_7);
        }
        if ((p31 & 48) == 0) {
            kotlin.jvm.functions.Function2 v7_10;
            if (!v5_1.changedInstance(p28)) {
                v7_10 = 16;
            } else {
                v7_10 = 32;
            }
            v6_1 |= v7_10;
        }
        if ((p31 & 384) == 0) {
            kotlin.jvm.functions.Function2 v7_13;
            if (!v5_1.changedInstance(p29)) {
                v7_13 = 128;
            } else {
                v7_13 = 256;
            }
            v6_1 |= v7_13;
        }
        if (((v6_1 & 147) == 146) && (v5_1.getSkipping())) {
            v5_1.skipToGroupEnd();
            int v19 = v5_1;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-520692109, v6_1, -1, "com.example.ui.screens.NewPostDialog (MuralScreen.kt:237)");
            }
            long v13_7;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v5_1, 2126062674, "CC(remember):MuralScreen.kt#9igjgp");
            long v9_5 = v5_1;
            long v11_5 = v9_5.rememberedValue();
            if (v11_5 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v13_7 = v11_5;
            } else {
                v13_7 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default("", 0, 2, 0);
                v9_5.updateRememberedValue(v13_7);
            }
            long v15_7;
            kotlin.jvm.functions.Function2 v4_8 = ((androidx.compose.runtime.MutableState) v13_7);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v5_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v5_1, 2126064508, "CC(remember):MuralScreen.kt#9igjgp");
            kotlin.jvm.functions.Function2 v10_5 = v5_1;
            kotlin.jvm.functions.Function2 v12_4 = v10_5.rememberedValue();
            if (v12_4 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v15_7 = v12_4;
            } else {
                v15_7 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(p27, 0, 2, 0);
                v10_5.updateRememberedValue(v15_7);
            }
            int v16_0;
            int v3_0;
            long v9_1 = ((androidx.compose.runtime.MutableState) v15_7);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v5_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v5_1, 2126066612, "CC(remember):MuralScreen.kt#9igjgp");
            kotlin.jvm.functions.Function2 v10_1 = v5_1;
            kotlin.jvm.functions.Function2 v12_0 = v10_1.rememberedValue();
            if (v12_0 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v16_0 = 1;
                v3_0 = v12_0;
            } else {
                v16_0 = 1;
                v3_0 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(1), 0, 2, 0);
                v10_1.updateRememberedValue(v3_0);
            }
            int v3_2 = ((androidx.compose.runtime.MutableState) v3_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v5_1);
            long v11_0 = v16_0;
            v19 = v5_1;
            androidx.compose.runtime.MutableState v24 = v9_1;
            androidx.compose.runtime.MutableState v26 = v3_2;
            androidx.compose.material3.AndroidAlertDialog_androidKt.AlertDialog-Oix01E0(p28, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(330738363, v11_0, new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda12(p29, v4_8, v9_1, v3_2), v5_1, 54)), 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2035296707, v11_0, new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda13(p28), v5_1, 54)), 0, com.example.ui.screens.ComposableSingletons$MuralScreenKt.INSTANCE.getLambda$-106364481$app(), ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1289382016, v11_0, new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda14(v4_8, v9_1, v3_2), v5_1, 54)), 0, 0, 0, 0, 0, 0, 0, v19, (((v6_1 >> 3) & 14) | 1772592), 0, 16276);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        boolean v2_2 = v19.endRestartGroup();
        if (!v2_2) {
            int v5 = p31;
        } else {
            v2_2.updateScope(new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda15(p27, p28, p29, p31));
        }
        return;
    }

    private static final String NewPostDialog$lambda$16(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void NewPostDialog$lambda$17(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final String NewPostDialog$lambda$19(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void NewPostDialog$lambda$20(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final boolean NewPostDialog$lambda$22(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((Boolean) ((androidx.compose.runtime.State) p4).getValue()).booleanValue();
    }

    private static final void NewPostDialog$lambda$23(androidx.compose.runtime.MutableState p5, boolean p6)
    {
        int v1 = 0;
        p5.setValue(Boolean.valueOf(p6));
        return;
    }

    static final kotlin.Unit NewPostDialog$lambda$26(kotlin.jvm.functions.Function3 p17, androidx.compose.runtime.MutableState p18, androidx.compose.runtime.MutableState p19, androidx.compose.runtime.MutableState p20, androidx.compose.runtime.Composer p21, int p22)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p21, "C314@14015L155,319@14212L48,313@13981L342:MuralScreen.kt#2thlc2");
        if (((p22 & 3) == 2) && (p21.getSkipping())) {
            p21.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(330738363, p22, -1, "com.example.ui.screens.NewPostDialog.<anonymous> (MuralScreen.kt:313)");
            }
            int v7_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p21, 11988630, "CC(remember):MuralScreen.kt#9igjgp");
            boolean v1_3 = p21.changed(p17);
            int v4_0 = p21.rememberedValue();
            if ((!v1_3) && (v4_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                int v13 = p19;
                v7_0 = v4_0;
            } else {
                v7_0 = new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda0(p17, p18, p19, p20);
                p21.updateRememberedValue(v7_0);
            }
            kotlin.jvm.functions.Function0 v16_1 = ((kotlin.jvm.functions.Function0) v7_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p21);
            androidx.compose.material3.ButtonKt.Button(v16_1, 0, 0, 0, androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 0, 0, 0, p21, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14), 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$MuralScreenKt.INSTANCE.getLambda$-1314645333$app(), p21, 805306368, 494);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewPostDialog$lambda$26$lambda$25$lambda$24(kotlin.jvm.functions.Function3 p3, androidx.compose.runtime.MutableState p4, androidx.compose.runtime.MutableState p5, androidx.compose.runtime.MutableState p6)
    {
        if (!kotlin.text.StringsKt.isBlank(((CharSequence) com.example.ui.screens.MuralScreenKt.NewPostDialog$lambda$16(p4)))) {
            p3.invoke(com.example.ui.screens.MuralScreenKt.NewPostDialog$lambda$16(p4), com.example.ui.screens.MuralScreenKt.NewPostDialog$lambda$19(p5), Boolean.valueOf(com.example.ui.screens.MuralScreenKt.NewPostDialog$lambda$22(p6)));
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewPostDialog$lambda$27(kotlin.jvm.functions.Function0 p15, androidx.compose.runtime.Composer p16, int p17)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p16, "C325@14373L80:MuralScreen.kt#2thlc2");
        if (((p17 & 3) == 2) && (p16.getSkipping())) {
            p16.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2035296707, p17, -1, "com.example.ui.screens.NewPostDialog.<anonymous> (MuralScreen.kt:325)");
            }
            androidx.compose.material3.ButtonKt.TextButton(p15, 0, 0, 0, 0, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$MuralScreenKt.INSTANCE.getLambda$-1154824070$app(), p16, 805306368, 510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewPostDialog$lambda$39(androidx.compose.runtime.MutableState p106, androidx.compose.runtime.MutableState p107, androidx.compose.runtime.MutableState p108, androidx.compose.runtime.Composer p109, int p110)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p109, "C246@10816L3115:MuralScreen.kt#2thlc2");
        if (((p110 & 3) == 2) && (p109.getSkipping())) {
            p109.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1289382016, p110, -1, "com.example.ui.screens.NewPostDialog.<anonymous> (MuralScreen.kt:246)");
            }
            int v1_20 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            int v9_2 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
            androidx.compose.ui.layout.MeasurePolicy v11_3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v9_2, androidx.compose.ui.Alignment.Companion.getStart(), p109, (((6 >> 3) & 14) | ((6 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v17 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p109, 0);
            androidx.compose.runtime.CompositionLocalMap v14_2 = p109.getCurrentCompositionLocalMap();
            float v3_33 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p109, v1_20);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p109.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p109.startReusableNode();
            if (!p109.getInserting()) {
                p109.useNode();
            } else {
                p109.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            int v1_39 = androidx.compose.runtime.Updater.constructor-impl(p109);
            androidx.compose.runtime.Updater.set-impl(v1_39, v11_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_39, v14_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Integer v2_18 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.ColumnScope v28 = v1_39;
            if ((v28.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v28.rememberedValue(), Integer.valueOf(v17)))) {
                v28.updateRememberedValue(Integer.valueOf(v17));
                v1_39.apply(Integer.valueOf(v17), v2_18);
            }
            androidx.compose.runtime.Updater.set-impl(v1_39, v3_33, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            v28 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, -680429523, "C249@10966L13,247@10877L423,257@11318L41,259@11377L83,260@11477L40,261@11534L1224,286@12776L41,294@13129L32,289@12885L1032:MuralScreen.kt#2thlc2");
            int v32_0 = com.example.ui.screens.MuralScreenKt.NewPostDialog$lambda$16(p106);
            int v62 = (((6 >> 6) & 112) | 6);
            int v34_0 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, 1640618467, "CC(remember):MuralScreen.kt#9igjgp");
            int v33 = 0;
            int v1_13 = p109.rememberedValue();
            if (v1_13 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                kotlin.jvm.functions.Function0 v36 = v1_13;
            } else {
                v1_13 = new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda1(p106);
                p109.updateRememberedValue(v1_13);
            }
            int v33_1 = ((kotlin.jvm.functions.Function1) v1_13);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p109);
            Integer v38_0 = com.example.ui.screens.ComposableSingletons$MuralScreenKt.INSTANCE.getLambda$1944009232$app();
            kotlin.jvm.functions.Function2 vtmp29 = com.example.ui.screens.ComposableSingletons$MuralScreenKt.INSTANCE.getLambda$-1757469393$app();
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(v32_0, v33_1, v34_0, 0, 0, 0, v38_0, vtmp29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 3, 0, 0, 0, p109, 14156208, 905969664, 0, 7601976);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), p109, 6);
            androidx.compose.material3.TextKt.Text--4IGK_g("Modalidade Relacionada:", 0, 0, androidx.compose.ui.unit.TextUnitKt.getSp(12), 0, androidx.compose.ui.text.font.FontWeight.Companion.getSemiBold(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p109, 199686, 0, 131030);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 4))), p109, 6);
            float v3_19 = ((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 6))));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Object v8_2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v3_19, androidx.compose.ui.Alignment.Companion.getTop(), p109, (((54 >> 3) & 14) | ((54 >> 3) & 112)));
            Integer v42 = v3_19;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v43_1 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p109, 0);
            float v3_22 = p109.getCurrentCompositionLocalMap();
            boolean v6_5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p109, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0));
            kotlin.jvm.functions.Function0 vtmp44 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            int v47_2 = vtmp44;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p109.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p109.startReusableNode();
            if (!p109.getInserting()) {
                p109.useNode();
            } else {
                p109.createNode(v47_2);
            }
            int v4_27 = androidx.compose.runtime.Updater.constructor-impl(p109);
            androidx.compose.runtime.Updater.set-impl(v4_27, v8_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v4_27, v3_22, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v5_17 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v52_1 = v4_27;
            if (v52_1.getInserting()) {
                androidx.compose.runtime.Composer v55 = v8_2;
                v52_1.updateRememberedValue(Integer.valueOf(v43_1));
                v4_27.apply(Integer.valueOf(v43_1), v5_17);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v52_1.rememberedValue(), Integer.valueOf(v43_1))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v4_27, v6_5, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v52 = (((54 >> 6) & 112) | 6);
            Object v63_0 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v5_19 = p109;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, 1793316319, "C:MuralScreen.kt#2thlc2");
            p109.startReplaceGroup(-1466171368);
            androidx.compose.runtime.ComposerKt.sourceInformation(p109, "*272@12142L25,273@12194L524,267@11825L893");
            int v4_33 = ((Iterable) com.example.ui.components.CommonComponentsKt.getSPORTS_LIST());
            Object v8_7 = 0;
            java.util.Iterator v58_1 = v4_33.iterator();
            while (v58_1.hasNext()) {
                androidx.compose.ui.graphics.Shape v64_2;
                String v76 = v4_33;
                int v4_47 = ((String) v58_1.next());
                boolean v78 = v6_5;
                boolean v6_14 = kotlin.jvm.internal.Intrinsics.areEqual(com.example.ui.screens.MuralScreenKt.NewPostDialog$lambda$19(p107), v4_47);
                if (!v6_14) {
                    v64_2 = androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.Color.Companion.getLightGray-0d7_KjU(), 1050253722, 0, 0, 0, 14, 0);
                } else {
                    v64_2 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
                }
                androidx.compose.ui.text.font.FontWeight v88_1;
                int v69_1 = v64_2;
                Object v79 = v8_7;
                int v80 = v9_2;
                Object v8_15 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)));
                String v81_1 = androidx.compose.foundation.layout.RowScope.weight$default(v63_0, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 1065353216, 0, 2, 0);
                int v9_13 = v63_0;
                Object v63_1 = v8_15;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, 862862403, "CC(remember):MuralScreen.kt#9igjgp");
                boolean v66_1 = p109.changed(v4_47);
                Object v8_18 = p109.rememberedValue();
                if (v66_1) {
                    v88_1 = v9_13;
                    v8_18 = new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda2(v4_47, p107);
                    p109.updateRememberedValue(v8_18);
                } else {
                    v88_1 = v9_13;
                    if (v8_18 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                        int v9 = p109;
                    }
                }
                long v85_2 = ((kotlin.jvm.functions.Function0) v8_18);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p109);
                Object v8_20 = androidx.compose.foundation.ClickableKt.clickable-XHw0xAI$default(v81_1, 0, 0, 0, v85_2, 7, 0);
                androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(v8_20, ((androidx.compose.ui.graphics.Shape) v63_1), v69_1, 0, 0, 0, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-971718033, 1, new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda3(v4_47, v6_14), v5_19, 54)), v5_19, 12582912, 120);
                v4_33 = v76;
                v6_5 = v78;
                v8_7 = v79;
                v9_2 = v80;
                v63_0 = v88_1;
            }
            int v1_23;
            v78 = v6_5;
            v80 = v9_2;
            p109.endReplaceGroup();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p109);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p109);
            p109.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p109);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p109);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p109);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), p109, 6);
            int v4_38 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            Integer v42_1 = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)))));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, 1640687702, "CC(remember):MuralScreen.kt#9igjgp");
            Object v8_10 = p109.rememberedValue();
            if (v8_10 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                Integer v2 = p108;
                v1_23 = v8_10;
            } else {
                int v35 = 0;
                v1_23 = new com.example.ui.screens.MuralScreenKt$$ExternalSyntheticLambda4(p108);
                p109.updateRememberedValue(v1_23);
            }
            long v46_2 = ((kotlin.jvm.functions.Function0) v1_23);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p109);
            int v1_27 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(androidx.compose.foundation.ClickableKt.clickable-XHw0xAI$default(v42_1, 0, 0, 0, v46_2, 7, 0), 0, androidx.compose.ui.unit.Dp.constructor-impl(((float) 6)), 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v9_10 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v4_38, p109, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            Integer v2_11 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p109, 0);
            androidx.compose.runtime.CompositionLocalMap v15_1 = p109.getCurrentCompositionLocalMap();
            int v16 = v2_11;
            Integer v2_12 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p109, v1_27);
            kotlin.jvm.functions.Function0 vtmp89 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            int v34_5 = vtmp89;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p109, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p109.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p109.startReusableNode();
            if (!p109.getInserting()) {
                p109.useNode();
            } else {
                p109.createNode(v34_5);
            }
            Integer v42_2;
            int v1_32 = androidx.compose.runtime.Updater.constructor-impl(p109);
            androidx.compose.runtime.Updater.set-impl(v1_32, v9_10, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_32, v15_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            boolean v0_9 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            Integer v38_7 = v1_32;
            if (v38_7.getInserting()) {
                v42_2 = p109;
                v38_7.updateRememberedValue(Integer.valueOf(v16));
                v1_32.apply(Integer.valueOf(v16), v0_9);
            } else {
                v42_2 = p109;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v38_7.rememberedValue(), Integer.valueOf(v16))) {
                }
            }
            boolean v0_19;
            androidx.compose.runtime.Updater.set-impl(v1_32, v2_12, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            int v1_33 = v42_2;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v1_33, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v5 = (((384 >> 6) & 112) | 6);
            int v34 = (((((((384 << 3) & 112) << 6) & 896) | 6) >> 6) & 14);
            Integer v38_8 = v1_33;
            Integer v2_13 = v1_33;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_13, -989017365, "C297@13252L229,302@13502L39,303@13562L337:MuralScreen.kt#2thlc2");
            int v43_3 = androidx.compose.material.icons.filled.ImageKt.getImage(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            if (!com.example.ui.screens.MuralScreenKt.NewPostDialog$lambda$22(p108)) {
                v0_19 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            } else {
                v0_19 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
            }
            boolean v0_25;
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v43_3, "Anexar foto", 0, v0_19, v2_13, 48, 4);
            androidx.compose.foundation.layout.RowScope v44 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))), v2_13, 6);
            if (!com.example.ui.screens.MuralScreenKt.NewPostDialog$lambda$22(p108)) {
                v0_25 = "Anexar Foto da Quadra";
            } else {
                v0_25 = "Foto da Quadra Anexada (Clique para remover)";
            }
            boolean v0_28;
            String v81_0 = v0_25;
            long v85_0 = androidx.compose.ui.unit.TextUnitKt.getSp(12);
            if (!com.example.ui.screens.MuralScreenKt.NewPostDialog$lambda$22(p108)) {
                v0_28 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            } else {
                v0_28 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
            }
            long v83_0 = v0_28;
            androidx.compose.ui.text.font.FontWeight vtmp118 = androidx.compose.ui.text.font.FontWeight.Companion.getSemiBold();
            androidx.compose.material3.TextKt.Text--4IGK_g(v81_0, 0, v83_0, v85_0, 0, vtmp118, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v2_13, 199680, 0, 131026);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v2_13);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v38_8);
            v42_2.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v42_2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v42_2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v42_2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p109);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p109);
            p109.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p109);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p109);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p109);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewPostDialog$lambda$39$lambda$38$lambda$29$lambda$28(androidx.compose.runtime.MutableState p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        com.example.ui.screens.MuralScreenKt.NewPostDialog$lambda$17(p1, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewPostDialog$lambda$39$lambda$38$lambda$34$lambda$33$lambda$31$lambda$30(String p1, androidx.compose.runtime.MutableState p2)
    {
        com.example.ui.screens.MuralScreenKt.NewPostDialog$lambda$20(p2, p1);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewPostDialog$lambda$39$lambda$38$lambda$34$lambda$33$lambda$32(String p27, boolean p28, androidx.compose.runtime.Composer p29, int p30)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p29, "C274@12224L468:MuralScreen.kt#2thlc2");
        if (((p30 & 3) == 2) && (p29.getSkipping())) {
            p29.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-971718033, p30, -1, "com.example.ui.screens.NewPostDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MuralScreen.kt:274)");
            }
            long v4_3;
            long v6_0 = new String[1];
            v6_0[0] = " ";
            androidx.compose.ui.Modifier v3_4 = ((String) kotlin.collections.CollectionsKt.first(kotlin.text.StringsKt.split$default(((CharSequence) p27), v6_0, 0, 0, 6, 0)));
            long v4_2 = androidx.compose.ui.graphics.Color.Companion;
            if (!p28) {
                v4_3 = v4_2.getBlack-0d7_KjU();
            } else {
                v4_3 = v4_2.getWhite-0d7_KjU();
            }
            long v6_2 = androidx.compose.ui.unit.TextUnitKt.getSp(11);
            androidx.compose.ui.text.font.FontWeight v9_1 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            boolean v1_5 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, androidx.compose.ui.unit.Dp.constructor-impl(((float) 6)), 1, 0);
            int vtmp11 = androidx.compose.ui.text.style.TextAlign.Companion.getCenter-e0LSkKk();
            androidx.compose.material3.TextKt.Text--4IGK_g(v3_4, v1_5, v4_3, v6_2, 0, v9_1, 0, 0, 0, androidx.compose.ui.text.style.TextAlign.box-impl(vtmp11), 0, 0, 0, 0, 0, 0, 0, p29, 199728, 0, 130512);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewPostDialog$lambda$39$lambda$38$lambda$36$lambda$35(androidx.compose.runtime.MutableState p1)
    {
        com.example.ui.screens.MuralScreenKt.NewPostDialog$lambda$23(p1, (com.example.ui.screens.MuralScreenKt.NewPostDialog$lambda$22(p1) ^ 1));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewPostDialog$lambda$40(String p1, kotlin.jvm.functions.Function0 p2, kotlin.jvm.functions.Function3 p3, int p4, androidx.compose.runtime.Composer p5, int p6)
    {
        com.example.ui.screens.MuralScreenKt.NewPostDialog(p1, p2, p3, p5, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p4 | 1)));
        return kotlin.Unit.INSTANCE;
    }
}
