package com.example.ui.screens;
public final class LoginScreenKt {

    public static final void LoginScreen(com.example.ui.viewmodel.QuadraViewModel p89, androidx.compose.runtime.Composer p90, int p91)
    {
        com.example.ui.viewmodel.QuadraViewModel v1_0 = p89;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p89, "viewModel");
        boolean v7_0 = p90.startRestartGroup(1860242);
        androidx.compose.runtime.ComposerKt.sourceInformation(v7_0, "C(LoginScreen)73@3293L7,74@3323L31,75@3375L31,76@3434L34,77@3493L42,79@3598L16,80@3676L16,82@3698L11581:LoginScreen.kt#2thlc2");
        int v2_0 = p91;
        if ((p91 & 6) == 0) {
            int v3_2;
            if (!v7_0.changedInstance(p89)) {
                v3_2 = 2;
            } else {
                v3_2 = 4;
            }
            v2_0 = (p91 | v3_2);
        }
        boolean v9_5;
        boolean v9_4 = v2_0;
        if (((v9_4 & 3) == 2) && (v7_0.getSkipping())) {
            v7_0.skipToGroupEnd();
            v9_5 = v7_0;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1860242, v9_4, -1, "com.example.ui.screens.LoginScreen (LoginScreen.kt:72)");
            }
            kotlin.jvm.functions.Function6 v13_9;
            int v3_5 = v7_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v3_5, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object v10_2 = v3_5.consume(((androidx.compose.runtime.CompositionLocal) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v3_5);
            Object v10_3 = ((android.content.Context) v10_2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_0, 1787696401, "CC(remember):LoginScreen.kt#9igjgp");
            int v2_29 = v7_0;
            Integer v5_20 = v2_29.rememberedValue();
            if (v5_20 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v13_9 = v5_20;
            } else {
                v13_9 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default("", 0, 2, 0);
                v2_29.updateRememberedValue(v13_9);
            }
            boolean v4_35;
            int v2_54 = ((androidx.compose.runtime.MutableState) v13_9);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v7_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_0, 1787698065, "CC(remember):LoginScreen.kt#9igjgp");
            int v3_24 = v7_0;
            int v12_8 = v3_24.rememberedValue();
            if (v12_8 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v4_35 = v12_8;
            } else {
                v4_35 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default("", 0, 2, 0);
                v3_24.updateRememberedValue(v4_35);
            }
            long v17_0;
            boolean v9_0;
            int v3_34 = ((androidx.compose.runtime.MutableState) v4_35);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v7_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_0, 1787699956, "CC(remember):LoginScreen.kt#9igjgp");
            boolean v4_0 = v7_0;
            int v12_2 = v4_0.rememberedValue();
            if (v12_2 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v17_0 = 0;
                v9_0 = v12_2;
            } else {
                v17_0 = 0;
                v9_0 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(0), 0, 2, 0);
                v4_0.updateRememberedValue(v9_0);
            }
            kotlin.jvm.functions.Function0 v14_4;
            boolean v4_2 = ((androidx.compose.runtime.MutableState) v9_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v7_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_0, 1787701852, "CC(remember):LoginScreen.kt#9igjgp");
            Integer v5_0 = v7_0;
            int v12_3 = v5_0.rememberedValue();
            if (v12_3 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v14_4 = v12_3;
            } else {
                v14_4 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(0, 0, 2, 0);
                v5_0.updateRememberedValue(v14_4);
            }
            Integer v5_2 = ((androidx.compose.runtime.MutableState) v14_4);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v7_0);
            int v12_4 = v17_0;
            androidx.compose.runtime.State v29 = androidx.compose.runtime.SnapshotStateKt.collectAsState(((kotlinx.coroutines.flow.StateFlow) p89.getShowPasswordRecoveryDialog()), 0, v7_0, v12_4, 1);
            androidx.compose.runtime.State v30 = androidx.compose.runtime.SnapshotStateKt.collectAsState(((kotlinx.coroutines.flow.StateFlow) p89.getShowRegistrationDialog()), 0, v7_0, v12_4, 1);
            int v0_9 = androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.graphics.ColorKt.Color(4279049002), 0, 2, 0);
            boolean v9_3 = v7_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            int v12_6 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.Companion.getTopStart(), 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v27_0 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v9_3, 0);
            long v15_2 = v9_3.getCurrentCompositionLocalMap();
            int v8_4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v9_3, v0_9);
            androidx.compose.runtime.Composer v34_0 = v2_54;
            androidx.compose.foundation.layout.Arrangement$Vertical v35 = v3_34;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(v9_3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            v9_3.startReusableNode();
            if (!v9_3.getInserting()) {
                v9_3.useNode();
            } else {
                v9_3.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            androidx.compose.runtime.Composer v43_0;
            androidx.compose.ui.layout.MeasurePolicy v42_1;
            int v2_8 = androidx.compose.runtime.Updater.constructor-impl(v9_3);
            androidx.compose.runtime.Updater.set-impl(v2_8, v12_6, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v2_8, v15_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v0_19 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v40 = v2_8;
            if (v40.getInserting()) {
                v42_1 = v4_2;
                v43_0 = v5_2;
                v40.updateRememberedValue(Integer.valueOf(v27_0));
                v2_8.apply(Integer.valueOf(v27_0), v0_19);
            } else {
                v42_1 = v4_2;
                v43_0 = v5_2;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v40.rememberedValue(), Integer.valueOf(v27_0))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v2_8, v8_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            int v0_23 = v9_3;
            int v38 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v0_23, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            androidx.compose.foundation.layout.BoxScope v41 = ((androidx.compose.foundation.layout.BoxScope) androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE);
            int v2_12 = v0_23;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_12, -1292563559, "C89@3892L48,88@3863L289,98@4226L552,119@4936L21,115@4788L10485:LoginScreen.kt#2thlc2");
            androidx.compose.ui.Modifier v44 = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.example.R$drawable.img_capa_quadra, v2_12, 0);
            int v48_0 = androidx.compose.ui.layout.ContentScale.Companion.getCrop();
            int v55_0 = v0_23;
            androidx.compose.runtime.Composer v51_0 = v2_12;
            int v46_0 = androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 290)));
            androidx.compose.foundation.ImageKt.Image(v44, "Capa Quadra de Mana\u00edra", v46_0, 0, v48_0, 0, 0, v51_0, 25008, 104);
            int v0_27 = v51_0;
            boolean v45_1 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            int v2_19 = new androidx.compose.ui.graphics.Color[4];
            v2_19[0] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.Color.Companion.getBlack-0d7_KjU(), 1048576000, 0, 0, 0, 14, 0));
            v2_19[1] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.ColorKt.Color(4279181351), 1062836634, 0, 0, 0, 14, 0));
            v2_19[2] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4279181351));
            v2_19[3] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4279181351));
            int v47_3 = kotlin.collections.CollectionsKt.listOf(v2_19);
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.background$default(v45_1, androidx.compose.ui.graphics.Brush$Companion.verticalGradient-8A-3gB4$default(androidx.compose.ui.graphics.Brush.Companion, v47_3, 0, 1144750080, 0, 8, 0), 0, 0, 6, 0), v0_27, 6);
            boolean v45_2 = v9_3;
            int v8_9 = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 24)), 0, 2, 0), androidx.compose.foundation.ScrollKt.rememberScrollState(0, v0_27, 0, 1), 0, 0, 0, 14, 0));
            boolean v9_7 = v0_27;
            int v2_27 = androidx.compose.ui.Alignment.Companion.getCenterHorizontally();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_7, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Integer v5_19 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), v2_27, v9_7, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            androidx.compose.runtime.Composer v51_3 = v0_27;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_7, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            long v17_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v9_7, 0);
            com.example.ui.viewmodel.QuadraViewModel v1_2 = v9_7.getCurrentCompositionLocalMap();
            int v12_7 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v9_7, v8_9);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_7, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(v9_7.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            v9_7.startReusableNode();
            if (!v9_7.getInserting()) {
                v9_7.useNode();
            } else {
                v9_7.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            int v3_6 = androidx.compose.runtime.Updater.constructor-impl(v9_7);
            androidx.compose.runtime.Updater.set-impl(v3_6, v5_19, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v3_6, v1_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v0_46 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v57 = v3_6;
            if (v57.getInserting()) {
                Integer v60 = v2_27;
                v57.updateRememberedValue(Integer.valueOf(v17_2));
                v3_6.apply(Integer.valueOf(v17_2), v0_46);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v57.rememberedValue(), Integer.valueOf(v17_2))) {
                }
            }
            int v0_73;
            int v3_25;
            int v2_66;
            androidx.compose.runtime.Updater.set-impl(v3_6, v12_7, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            int v0_50 = v9_7;
            int v52 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v0_50, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            v57 = (((384 >> 6) & 112) | 6);
            com.example.ui.viewmodel.QuadraViewModel v1_9 = v0_50;
            int v86 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v1_9, -1757201045, "C123@5077L42,126@5175L1133,153@6322L41,158@6511L98,161@6652L38,163@6757L8015,156@6416L8356,343@14786L41,346@14919L344:LoginScreen.kt#2thlc2");
            long v74_0 = v0_50;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 130))), v1_9, 6);
            long v63_2 = androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.Color.Companion.getBlack-0d7_KjU(), 1053609165, 0, 0, 0, 14, 0);
            androidx.compose.foundation.BorderStroke vtmp101 = androidx.compose.foundation.BorderStrokeKt.BorderStroke-cXLIe8U(androidx.compose.ui.unit.Dp.constructor-impl(((float) 1)), androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.ColorKt.Color(4278236376), 1056964608, 0, 0, 0, 14, 0));
            int v71_1 = v1_9;
            androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(0, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)))), v63_2, 0, 0, 0, vtmp101, com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$-1806302679$app(), v71_1, 14156160, 57);
            int v0_61 = v71_1;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 24))), v0_61, 6);
            com.example.ui.viewmodel.QuadraViewModel v1_15 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 24)));
            long v70_2 = v0_61;
            int v71_3 = androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 1064514355, 0, 0, 0, 14, 0), 0, 0, 0, v70_2, ((androidx.compose.material3.CardDefaults.$stable << 12) | 6), 14);
            int v0_65 = v70_2;
            int v64_4 = androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)), 0, 0, 0, 0, 0, v0_65, ((androidx.compose.material3.CardDefaults.$stable << 18) | 6), 62);
            long v70_4 = v0_65;
            String v61_6 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            v1_0 = p89;
            androidx.compose.runtime.Composer v50_4 = v9_7;
            int v2_51 = v34_0;
            androidx.compose.runtime.Composer v34_1 = v51_3;
            androidx.compose.runtime.Composer v51_4 = v55_0;
            boolean v9_8 = v70_4;
            androidx.compose.runtime.Composer v43_1 = v74_0;
            androidx.compose.runtime.MutableState v87 = v2_51;
            int v67_4 = v9_8;
            androidx.compose.material3.CardKt.Card(v61_6, ((androidx.compose.ui.graphics.Shape) v1_15), v71_3, v64_4, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1320420352, 1, new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda14(p89, v2_51, v35, v42_1, v43_0), v9_8, 54)), v67_4, 196614, 16);
            int v0_70 = v67_4;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 24))), v0_70, 6);
            String v61_7 = new StringBuilder().append("Quadra de Mana\u00edra \u2022 Vers\u00e3o ").append(p89.getAppVersionName()).toString();
            long v63_5 = androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 1060320051, 0, 0, 0, 14, 0);
            long v65_7 = androidx.compose.ui.unit.TextUnitKt.getSp(12);
            androidx.compose.ui.text.font.FontWeight v68_7 = androidx.compose.ui.text.font.FontWeight.Companion.getMedium();
            int v2_64 = androidx.compose.ui.text.style.TextAlign.Companion.getCenter-e0LSkKk();
            androidx.compose.ui.Modifier vtmp126 = androidx.compose.foundation.layout.PaddingKt.padding-qDBjuR0$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 0, 0, androidx.compose.ui.unit.Dp.constructor-impl(((float) 24)), 7, 0);
            androidx.compose.material3.TextKt.Text--4IGK_g(v61_7, vtmp126, v63_5, v65_7, 0, v68_7, 0, 0, 0, androidx.compose.ui.text.style.TextAlign.box-impl(v2_64), 0, 0, 0, 0, 0, 0, 0, v0_70, 200112, 0, 130512);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v0_70);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v43_1);
            v50_4.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v50_4);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v50_4);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v50_4);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v34_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v51_4);
            v45_2.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v45_2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v45_2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v45_2);
            if (!com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$12(v29)) {
                v9_5 = v7_0;
                v3_25 = v10_3;
                v0_73 = "CC(remember):LoginScreen.kt#9igjgp";
                v2_66 = 0;
                v9_5.startReplaceGroup(-419284784);
            } else {
                int v12_11;
                v7_0.startReplaceGroup(-404014866);
                androidx.compose.runtime.ComposerKt.sourceInformation(v7_0, "359@15371L39,361@15463L54,379@16319L476,391@16825L165,363@15622L667,360@15419L1581");
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_0, 1788081945, "CC(remember):LoginScreen.kt#9igjgp");
                int v2_67 = v7_0;
                int v8_12 = v2_67.rememberedValue();
                if (v8_12 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                    v12_11 = v8_12;
                } else {
                    v12_11 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$1(v87), 0, 2, 0);
                    v2_67.updateRememberedValue(v12_11);
                }
                kotlin.jvm.functions.Function0 v14_8;
                int v0_78 = ((androidx.compose.runtime.MutableState) v12_11);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v7_0);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_0, 1788084904, "CC(remember):LoginScreen.kt#9igjgp");
                int v2_69 = v7_0.changedInstance(p89);
                int v3_26 = v7_0;
                boolean v9_11 = v3_26.rememberedValue();
                if ((v2_69 == 0) && (v9_11 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v14_8 = v9_11;
                } else {
                    v14_8 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda15(p89);
                    v3_26.updateRememberedValue(v14_8);
                }
                kotlin.jvm.functions.Function0 v14_10 = ((kotlin.jvm.functions.Function0) v14_8);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v7_0);
                v0_73 = "CC(remember):LoginScreen.kt#9igjgp";
                v3_25 = v10_3;
                boolean v25_1 = v7_0;
                v2_66 = 0;
                androidx.compose.material3.AndroidAlertDialog_androidKt.AlertDialog-Oix01E0(v14_10, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1865719195, 1, new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda16(p89, v10_3, v0_78), v7_0, 54)), 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1394362845, 1, new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda17(p89), v7_0, 54)), 0, com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$-923006495$app(), ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-687328320, 1, new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda18(v0_78), v7_0, 54)), 0, 0, 0, 0, 0, 0, 0, v25_1, 1772592, 0, 16276);
                v9_5 = v25_1;
            }
            v9_5.endReplaceGroup();
            if (!com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$13(v30)) {
                v9_5.startReplaceGroup(-419284784);
            } else {
                kotlin.jvm.functions.Function0 v14_12;
                v9_5.startReplaceGroup(-402317275);
                androidx.compose.runtime.ComposerKt.sourceInformation(v9_5, "402@17141L50,403@17218L376,401@17097L507");
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_5, 1788138596, v0_73);
                boolean v7_7 = v9_5.changedInstance(p89);
                int v8_16 = v9_5;
                int v11_3 = v8_16.rememberedValue();
                if ((!v7_7) && (v11_3 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v14_12 = v11_3;
                } else {
                    v14_12 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda19(p89);
                    v8_16.updateRememberedValue(v14_12);
                }
                kotlin.jvm.functions.Function6 v13_0;
                kotlin.jvm.functions.Function0 v14_14 = ((kotlin.jvm.functions.Function0) v14_12);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v9_5);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_5, 1788141386, v0_73);
                int v0_82 = (v9_5.changedInstance(p89) | v9_5.changedInstance(v3_25));
                boolean v7_10 = v9_5;
                Object v10_0 = v7_10.rememberedValue();
                if ((v0_82 == 0) && (v10_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v13_0 = v10_0;
                } else {
                    v13_0 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda20(p89, v3_25);
                    v7_10.updateRememberedValue(v13_0);
                }
                kotlin.jvm.functions.Function6 v13_2 = ((kotlin.jvm.functions.Function6) v13_0);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v9_5);
                com.example.ui.screens.LoginScreenKt.RegistrationDialog(v14_14, v13_2, v9_5, v2_66);
            }
            v9_5.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        int v0_1 = v9_5.endRestartGroup();
        if (v0_1 != 0) {
            v0_1.updateScope(new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda21(v1_0, p91));
        }
        return;
    }

    private static final String LoginScreen$lambda$1(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final String LoginScreen$lambda$10(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void LoginScreen$lambda$11(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final boolean LoginScreen$lambda$12(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((Boolean) p4.getValue()).booleanValue();
    }

    private static final boolean LoginScreen$lambda$13(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((Boolean) p4.getValue()).booleanValue();
    }

    private static final void LoginScreen$lambda$2(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    static final kotlin.Unit LoginScreen$lambda$39$lambda$38$lambda$37(com.example.ui.viewmodel.QuadraViewModel p131, androidx.compose.runtime.MutableState p132, androidx.compose.runtime.MutableState p133, androidx.compose.runtime.MutableState p134, androidx.compose.runtime.MutableState p135, androidx.compose.foundation.layout.ColumnScope p136, androidx.compose.runtime.Composer p137, int p138)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p136, "$this$Card");
        androidx.compose.runtime.ComposerKt.sourceInformation(p137, "C164@6775L7983:LoginScreen.kt#2thlc2");
        if (((p138 & 17) == 16) && (p137.getSkipping())) {
            p137.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1320420352, p138, -1, "com.example.ui.screens.LoginScreen.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:164)");
            }
            int v4_12 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 24)));
            androidx.compose.ui.Alignment$Vertical v10_12 = androidx.compose.ui.Alignment.Companion.getCenterHorizontally();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p137, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v15_4 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), v10_12, p137, (((390 >> 3) & 14) | ((390 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p137, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v20 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p137, 0);
            int v7_59 = p137.getCurrentCompositionLocalMap();
            Object v9_23 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p137, v4_12);
            kotlin.jvm.functions.Function0 vtmp12 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function0 v24 = vtmp12;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p137, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p137.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p137.startReusableNode();
            if (!p137.getInserting()) {
                p137.useNode();
            } else {
                p137.createNode(v24);
            }
            Object v3_1 = androidx.compose.runtime.Updater.constructor-impl(p137);
            androidx.compose.runtime.Updater.set-impl(v3_1, v15_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v3_1, v7_59, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Object v5_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.ColumnScope v30 = v3_1;
            if ((v30.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v30.rememberedValue(), Integer.valueOf(v20)))) {
                v30.updateRememberedValue(Integer.valueOf(v20));
                v3_1.apply(Integer.valueOf(v20), v5_4);
            }
            androidx.compose.runtime.Updater.set-impl(v3_1, v9_23, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p137, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            v30 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p137, 1048293888, "C170@7015L226,176@7262L192,182@7476L41,193@8048L167,187@7685L19,185@7582L774,201@8378L41,222@9583L167,206@8577L17,211@8862L486,204@8476L1415,231@9963L602,264@11395L102,256@11019L326,255@10977L1017,280@12016L41,283@12110L588,296@12720L41,299@12853L1001,320@13876L41,325@14132L102,324@14033L49,323@13991L749:LoginScreen.kt#2thlc2");
            androidx.compose.material3.ButtonColors v37_1 = androidx.compose.ui.unit.TextUnitKt.getSp(20);
            int v40_4 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long vtmp28 = androidx.compose.ui.graphics.ColorKt.Color(4279181351);
            androidx.compose.material3.TextKt.Text--4IGK_g("Acesso dos Atletas", 0, vtmp28, v37_1, 0, v40_4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p137, 200070, 0, 131026);
            androidx.compose.material3.ButtonColors v37_2 = androidx.compose.ui.unit.TextUnitKt.getSp(13);
            long vtmp30 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g("Entre para agendar jogos e interagir no mural", 0, vtmp30, v37_2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p137, 3462, 0, 131058);
            int v128 = (((390 >> 6) & 112) | 6);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 18))), p137, 6);
            Object v3_28 = com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$1(p132);
            int v55_4 = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE.colors-0hiis_0(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, androidx.compose.ui.graphics.ColorKt.Color(4278220697), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, androidx.compose.ui.graphics.ColorKt.Color(4278220697), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p137, 0, 48, 3072, 0, 3072, 2139092991, 4095);
            kotlin.jvm.functions.Function0 v33_7 = v3_28;
            int v35_5 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p137, -797454327, "CC(remember):LoginScreen.kt#9igjgp");
            androidx.compose.ui.graphics.Shape v36 = 0;
            Object v3_36 = p137.rememberedValue();
            if (v3_36 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                int v38 = v3_36;
                v3_36 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda0(p132);
                p137.updateRememberedValue(v3_36);
            }
            int v54_5;
            String v130;
            int v7_32;
            Object v3_38 = ((kotlin.jvm.functions.Function1) v3_36);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p137);
            int v39_4 = com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$-1489237360$app();
            int v41_2 = com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$31031118$app();
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(v33_7, v3_38, v35_5, 0, 0, 0, v39_4, 0, v41_2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 14)))), v55_4, p137, 102236592, 12582912, 0, 1965752);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), p137, 6);
            Object v3_42 = com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$4(p133);
            if (!com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$7(p134)) {
                v130 = v3_42;
                v54_5 = p137;
                v7_32 = ((androidx.compose.ui.text.input.VisualTransformation) new androidx.compose.ui.text.input.PasswordVisualTransformation(0, 1, 0));
            } else {
                v7_32 = androidx.compose.ui.text.input.VisualTransformation.Companion.getNone();
                v130 = v3_42;
                v54_5 = p137;
            }
            Object v3_51;
            Object v6_13 = v54_5;
            int v55_6 = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE.colors-0hiis_0(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, androidx.compose.ui.graphics.ColorKt.Color(4278220697), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, androidx.compose.ui.graphics.ColorKt.Color(4278220697), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v6_13, 0, 48, 3072, 0, 3072, 2139092991, 4095);
            androidx.compose.foundation.layout.RowScope v47_3 = v7_32;
            kotlin.jvm.functions.Function0 v33_9 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 14)));
            int v35_6 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_13, -797425785, "CC(remember):LoginScreen.kt#9igjgp");
            int v7_37 = v6_13;
            androidx.compose.ui.Alignment$Vertical v10_14 = v7_37.rememberedValue();
            if (v10_14 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v3_51 = v10_14;
            } else {
                v3_51 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda11(p133);
                v7_37.updateRememberedValue(v3_51);
            }
            androidx.compose.ui.Modifier v34_10 = ((kotlin.jvm.functions.Function1) v3_51);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v6_13);
            int v39_5 = com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$747184903$app();
            int v41_3 = com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$1436311621$app();
            Object v3_58 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1780874980, 1, new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda22(p134), v6_13, 54);
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(v130, v34_10, v35_6, 0, 0, 0, v39_5, 0, v41_3, ((kotlin.jvm.functions.Function2) v3_58), 0, 0, 0, 0, v47_3, 0, 0, 1, 0, 0, 0, ((androidx.compose.ui.graphics.Shape) v3_58), v55_6, v6_13, 907542960, 12582912, 0, 1948856);
            int v58_2 = 54;
            Object v3_61 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            int v7_42 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getEnd();
            androidx.compose.ui.Alignment$Vertical v10_17 = v6_13;
            androidx.compose.ui.Modifier v34_11 = 54;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v10_17, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v12_7 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v7_42, androidx.compose.ui.Alignment.Companion.getTop(), v10_17, (((v34_11 >> 3) & 14) | ((v34_11 >> 3) & 112)));
            androidx.compose.material3.ButtonColors v37 = v7_42;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v10_17, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v38_8 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v10_17, 0);
            int v7_45 = v10_17.getCurrentCompositionLocalMap();
            Object v9_20 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v10_17, v3_61);
            kotlin.jvm.functions.Function0 vtmp67 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function3 v42_11 = vtmp67;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v10_17, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(v10_17.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            v10_17.startReusableNode();
            if (!v10_17.getInserting()) {
                v10_17.useNode();
            } else {
                v10_17.createNode(v42_11);
            }
            Object v3_70 = androidx.compose.runtime.Updater.constructor-impl(v10_17);
            int v46_4 = v10_17;
            androidx.compose.runtime.Updater.set-impl(v3_70, v12_7, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v3_70, v7_45, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.ui.Alignment$Vertical v10_22 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.RowScope v47_4 = v3_70;
            if (v47_4.getInserting()) {
                int v50 = v12_7;
                v47_4.updateRememberedValue(Integer.valueOf(v38_8));
                v3_70.apply(Integer.valueOf(v38_8), v10_22);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v47_4.rememberedValue(), Integer.valueOf(v38_8))) {
                }
            }
            Object v73_5;
            androidx.compose.runtime.Updater.set-impl(v3_70, v9_20, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            int v7_54 = v46_4;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_54, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            androidx.compose.foundation.layout.RowScope v47 = (((54 >> 6) & 112) | 6);
            Object v48 = 0;
            int v51_9 = v7_54;
            Object v9_21 = v7_54;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_21, -108314378, "C235@10161L53,235@10140L403:LoginScreen.kt#2thlc2");
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_21, 1381979631, "CC(remember):LoginScreen.kt#9igjgp");
            int v12_12 = v9_21;
            int v54_9 = v9_21.changedInstance(p131);
            int v7_58 = v12_12.rememberedValue();
            if (v54_9 != 0) {
                v73_5 = v9_21;
                int v56 = v7_58;
                v7_58 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda29(p131);
                v12_12.updateRememberedValue(v7_58);
            } else {
                v73_5 = v9_21;
                if (v7_58 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                }
            }
            kotlin.jvm.functions.Function0 v63_9 = ((kotlin.jvm.functions.Function0) v7_58);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v73_5);
            androidx.compose.material3.ButtonKt.TextButton(v63_9, 0, 0, 0, 0, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$1073209111$app(), v73_5, 805306368, 510);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v73_5);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v51_9);
            v46_4.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v46_4);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v46_4);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v46_4);
            if (com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$10(p135) == null) {
                v6_13.startReplaceGroup(1041094540);
            } else {
                v6_13.startReplaceGroup(1051633114);
                androidx.compose.runtime.ComposerKt.sourceInformation(v6_13, "246@10639L258");
                int v7_66 = com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$10(p135);
                if (v7_66 == 0) {
                    v7_66 = "";
                }
                kotlin.jvm.functions.Function0 v33_11 = v7_66;
                int v35_12 = androidx.compose.ui.graphics.ColorKt.Color(4292030255);
                androidx.compose.material3.ButtonColors v37_5 = androidx.compose.ui.unit.TextUnitKt.getSp(12);
                androidx.compose.ui.Modifier vtmp90 = androidx.compose.foundation.layout.PaddingKt.padding-qDBjuR0$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 0, 0, androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)), 7, 0);
                androidx.compose.material3.TextKt.Text--4IGK_g(v33_11, vtmp90, v35_12, v37_5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v6_13, 3504, 0, 131056);
            }
            Object v6_16;
            int v54_11;
            v6_13.endReplaceGroup();
            androidx.compose.material3.ButtonColors v37_6 = androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 0, 0, 0, v6_13, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14);
            androidx.compose.ui.Modifier v34_16 = androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 50)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_13, -797347332, "CC(remember):LoginScreen.kt#9igjgp");
            int v7_78 = v6_13.changedInstance(p131);
            Object v9_26 = v6_13;
            int v12_17 = v9_26.rememberedValue();
            if (v7_78 != 0) {
                v54_11 = v6_13;
                v38 = v7_78;
                v6_16 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda30(p131, p135, p132, p133);
                v9_26.updateRememberedValue(v6_16);
            } else {
                v54_11 = v6_13;
                if (v12_17 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                    v6_16 = v12_17;
                }
            }
            Object v6_19 = ((kotlin.jvm.functions.Function0) v6_16);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v54_11);
            Object v43_8 = v54_11;
            androidx.compose.material3.ButtonKt.Button(v6_19, v34_16, 0, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 14)))), v37_6, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$-552129818$app(), v43_8, 805306416, 484);
            Object v6_20 = v43_8;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16))), v6_20, 6);
            boolean v1_74 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            Object v9_33 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.ui.Alignment$Vertical v10_28 = v6_20;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v10_28, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            boolean v2_36 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart();
            int v7_81 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v2_36, v9_33, v10_28, (((390 >> 3) & 14) | ((390 >> 3) & 112)));
            int v35 = v2_36;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v10_28, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            androidx.compose.ui.graphics.Shape v36_15 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v10_28, 0);
            boolean v2_39 = v10_28.getCurrentCompositionLocalMap();
            Object v9_34 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v10_28, v1_74);
            kotlin.jvm.functions.Function0 vtmp111 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            int v40_16 = vtmp111;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v10_28, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(v10_28.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            v10_28.startReusableNode();
            if (!v10_28.getInserting()) {
                v10_28.useNode();
            } else {
                v10_28.createNode(v40_16);
            }
            boolean v1_83 = androidx.compose.runtime.Updater.constructor-impl(v10_28);
            int v44_11 = v10_28;
            androidx.compose.runtime.Updater.set-impl(v1_83, v7_81, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_83, v2_39, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.ui.Alignment$Vertical v10_33 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v45_10 = v1_83;
            if (v45_10.getInserting()) {
                int v49 = v7_81;
                v45_10.updateRememberedValue(Integer.valueOf(v36_15));
                v1_83.apply(Integer.valueOf(v36_15), v10_33);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v45_10.rememberedValue(), Integer.valueOf(v36_15))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v1_83, v9_34, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            boolean v2_2 = v44_11;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            kotlin.jvm.functions.Function3 v42 = (((390 >> 6) & 112) | 6);
            int v50_0 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            androidx.compose.ui.Alignment$Vertical v10_3 = v2_2;
            int v45 = (((((((390 << 3) & 112) << 6) & 896) | 6) >> 6) & 14);
            androidx.compose.foundation.layout.RowScope v47_0 = v2_2;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v10_3, -404940524, "C287@12294L76,288@12395L180,293@12600L76:LoginScreen.kt#2thlc2");
            v56 = 0;
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.RowScope.weight$default(v50_0, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 1065353216, 0, 2, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 1))), androidx.compose.ui.graphics.Color.Companion.getLightGray-0d7_KjU(), 0, 2, 0), v10_3, 0);
            long v81_0 = androidx.compose.ui.unit.TextUnitKt.getSp(12);
            long vtmp131 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            Object v98 = v10_3;
            androidx.compose.material3.TextKt.Text--4IGK_g("  ou acesse com  ", 0, vtmp131, v81_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v98, 3462, 0, 131058);
            boolean v2_7 = v98;
            int v51 = v9_34;
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.RowScope.weight$default(v50_0, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 1065353216, 0, 2, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 1))), androidx.compose.ui.graphics.Color.Companion.getLightGray-0d7_KjU(), 0, 2, 0), v2_7, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v2_7);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v47_0);
            v44_11.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v44_11);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v44_11);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v44_11);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), v6_20, 6);
            boolean v1_18 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            boolean v2_12 = ((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 10))));
            int v7_8 = v6_20;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_8, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v11_3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v2_12, androidx.compose.ui.Alignment.Companion.getTop(), v7_8, (((v58_2 >> 3) & 14) | ((v58_2 >> 3) & 112)));
            kotlin.jvm.functions.Function0 v33 = v2_12;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_8, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            boolean v2_15 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v7_8, 0);
            int v8_0 = v7_8.getCurrentCompositionLocalMap();
            int v19 = v2_15;
            boolean v2_16 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v7_8, v1_18);
            kotlin.jvm.functions.Function0 vtmp147 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            int v35_0 = vtmp147;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_8, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(v7_8.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            v7_8.startReusableNode();
            if (!v7_8.getInserting()) {
                v7_8.useNode();
            } else {
                v7_8.createNode(v35_0);
            }
            int v40_1;
            int v4_1 = androidx.compose.runtime.Updater.constructor-impl(v7_8);
            androidx.compose.runtime.Updater.set-impl(v4_1, v11_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v4_1, v8_0, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            boolean v1_31 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v38_0 = v4_1;
            if (v38_0.getInserting()) {
                v40_1 = v7_8;
                v38_0.updateRememberedValue(Integer.valueOf(v19));
                v4_1.apply(Integer.valueOf(v19), v1_31);
            } else {
                v40_1 = v7_8;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v38_0.rememberedValue(), Integer.valueOf(v19))) {
                }
            }
            Object v73_0;
            androidx.compose.runtime.Updater.set-impl(v4_1, v2_16, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            int v4_2 = v40_1;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v8 = (((54 >> 6) & 112) | 6);
            androidx.compose.foundation.layout.RowScope v47_1 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            Object v3_4 = v4_2;
            v35 = (((((((54 << 3) & 112) << 6) & 896) | 6) >> 6) & 14);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v3_4, -271340965, "C304@13096L39,303@13042L379,312@13501L42,311@13447L385:LoginScreen.kt#2thlc2");
            Object v43_0 = v4_2;
            androidx.compose.ui.Modifier v64_2 = androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.RowScope.weight$default(v47_1, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 1065353216, 0, 2, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 46)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v3_4, -1671319943, "CC(remember):LoginScreen.kt#9igjgp");
            boolean v2_22 = v3_4;
            kotlin.jvm.functions.Function3 v42_2 = v3_4.changedInstance(p131);
            boolean v1_44 = v2_22.rememberedValue();
            if (v42_2 != null) {
                v73_0 = v3_4;
                v45 = v1_44;
                v1_44 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda31(p131);
                v2_22.updateRememberedValue(v1_44);
            } else {
                v73_0 = v3_4;
                if (v1_44 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                }
            }
            kotlin.jvm.functions.Function0 v63_3 = ((kotlin.jvm.functions.Function0) v1_44);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v73_0);
            androidx.compose.material3.ButtonKt.OutlinedButton(v63_3, v64_2, 0, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 12)))), 0, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$-224921660$app(), v73_0, 805306368, 500);
            int v4_4 = v73_0;
            androidx.compose.ui.Modifier v64_3 = androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.RowScope.weight$default(v47_1, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 1065353216, 0, 2, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 46)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_4, -1671306980, "CC(remember):LoginScreen.kt#9igjgp");
            boolean v2_25 = v4_4;
            int v39_1 = v4_4.changedInstance(p131);
            boolean v1_54 = v2_25.rememberedValue();
            if ((v39_1 != 0) || (v1_54 == androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v45 = v1_54;
                v1_54 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda32(p131);
                v2_25.updateRememberedValue(v1_54);
            }
            Object v9_7;
            kotlin.jvm.functions.Function0 v63_5 = ((kotlin.jvm.functions.Function0) v1_54);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v4_4);
            Object v73_1 = v4_4;
            androidx.compose.material3.ButtonKt.OutlinedButton(v63_5, v64_3, 0, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 12)))), 0, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$665006139$app(), v73_1, 805306368, 500);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v73_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v43_0);
            v40_1.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v40_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v40_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v40_1);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16))), v6_20, 6);
            androidx.compose.material3.ButtonColors v37_0 = androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4293284096), 0, 0, 0, v6_20, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14);
            boolean v1_65 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 14)));
            androidx.compose.ui.Modifier v34_1 = androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 48)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_20, -797251161, "CC(remember):LoginScreen.kt#9igjgp");
            boolean v2_32 = v6_20.changedInstance(p131);
            Object v3_14 = v6_20;
            Object v5_7 = v3_14.rememberedValue();
            if ((!v2_32) && (v5_7 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v9_7 = v5_7;
            } else {
                v9_7 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda33(p131);
                v3_14.updateRememberedValue(v9_7);
            }
            kotlin.jvm.functions.Function0 v33_2 = ((kotlin.jvm.functions.Function0) v9_7);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v6_20);
            androidx.compose.material3.ButtonKt.Button(v33_2, v34_1, 0, ((androidx.compose.ui.graphics.Shape) v1_65), v37_0, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$-635599395$app(), v6_20, 805306416, 484);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v6_20);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p137);
            p137.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p137);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p137);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p137);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$39$lambda$38$lambda$37$lambda$36$lambda$15$lambda$14(androidx.compose.runtime.MutableState p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$2(p1, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$39$lambda$38$lambda$37$lambda$36$lambda$17$lambda$16(androidx.compose.runtime.MutableState p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$5(p1, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$39$lambda$38$lambda$37$lambda$36$lambda$21(androidx.compose.runtime.MutableState p9, androidx.compose.runtime.Composer p10, int p11)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p10, "C212@8913L38,212@8953L369,212@8892L430:LoginScreen.kt#2thlc2");
        if (((p11 & 3) == 2) && (p10.getSkipping())) {
            p10.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1780874980, p11, -1, "com.example.ui.screens.LoginScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:212)");
            }
            int v7_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p10, 2023873642, "CC(remember):LoginScreen.kt#9igjgp");
            int v3_0 = p10.rememberedValue();
            if (v3_0 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v7_0 = v3_0;
            } else {
                v7_0 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda8(p9);
                p10.updateRememberedValue(v7_0);
            }
            boolean v0_6 = ((kotlin.jvm.functions.Function0) v7_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p10);
            androidx.compose.material3.IconButtonKt.IconButton(v0_6, 0, 0, 0, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1082747111, 1, new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda9(p9), p10, 54)), p10, 196614, 30);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$39$lambda$38$lambda$37$lambda$36$lambda$21$lambda$19$lambda$18(androidx.compose.runtime.MutableState p1)
    {
        com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$8(p1, (com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$7(p1) ^ 1));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$39$lambda$38$lambda$37$lambda$36$lambda$21$lambda$20(androidx.compose.runtime.MutableState p9, androidx.compose.runtime.Composer p10, int p11)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p10, "C213@8987L305:LoginScreen.kt#2thlc2");
        if (((p11 & 3) == 2) && (p10.getSkipping())) {
            p10.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1082747111, p11, -1, "com.example.ui.screens.LoginScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:213)");
            }
            androidx.compose.ui.graphics.Color$Companion v0_7;
            if (!com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$7(p9)) {
                v0_7 = androidx.compose.material.icons.filled.VisibilityKt.getVisibility(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            } else {
                v0_7 = androidx.compose.material.icons.filled.VisibilityOffKt.getVisibilityOff(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            }
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v0_7, "Alternar visibilidade", 0, androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU(), p10, 3120, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$39$lambda$38$lambda$37$lambda$36$lambda$24$lambda$23$lambda$22(com.example.ui.viewmodel.QuadraViewModel p2)
    {
        p2.getShowPasswordRecoveryDialog().setValue(Boolean.valueOf(1));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$39$lambda$38$lambda$37$lambda$36$lambda$27$lambda$26(com.example.ui.viewmodel.QuadraViewModel p3, androidx.compose.runtime.MutableState p4, androidx.compose.runtime.MutableState p5, androidx.compose.runtime.MutableState p6)
    {
        com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$11(p4, 0);
        p3.login(com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$1(p5), com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$4(p6), new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda13(p4));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$39$lambda$38$lambda$37$lambda$36$lambda$27$lambda$26$lambda$25(androidx.compose.runtime.MutableState p1, boolean p2, String p3)
    {
        if (!p2) {
            com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$11(p1, p3);
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$39$lambda$38$lambda$37$lambda$36$lambda$33$lambda$30$lambda$29(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.loginWithSocial("Google");
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$39$lambda$38$lambda$37$lambda$36$lambda$33$lambda$32$lambda$31(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.loginWithSocial("Instagram");
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35$lambda$34(com.example.ui.viewmodel.QuadraViewModel p2)
    {
        p2.getShowRegistrationDialog().setValue(Boolean.valueOf(1));
        return kotlin.Unit.INSTANCE;
    }

    private static final String LoginScreen$lambda$4(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final String LoginScreen$lambda$41(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void LoginScreen$lambda$42(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    static final kotlin.Unit LoginScreen$lambda$44$lambda$43(com.example.ui.viewmodel.QuadraViewModel p2)
    {
        p2.getShowPasswordRecoveryDialog().setValue(Boolean.valueOf(0));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$48(com.example.ui.viewmodel.QuadraViewModel p17, android.content.Context p18, androidx.compose.runtime.MutableState p19, androidx.compose.runtime.Composer p20, int p21)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p20, "C381@16375L234,386@16655L48,380@16337L444:LoginScreen.kt#2thlc2");
        if (((p21 & 3) == 2) && (p20.getSkipping())) {
            p20.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1865719195, p21, -1, "com.example.ui.screens.LoginScreen.<anonymous> (LoginScreen.kt:380)");
            }
            int v8_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p20, -1954781937, "CC(remember):LoginScreen.kt#9igjgp");
            boolean v2_5 = (p20.changedInstance(p17) | p20.changedInstance(p18));
            int v5_0 = p20.rememberedValue();
            if ((!v2_5) && (v5_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v8_0 = v5_0;
            } else {
                v8_0 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda12(p17, p19, p18);
                p20.updateRememberedValue(v8_0);
            }
            kotlin.jvm.functions.Function0 v16_1 = ((kotlin.jvm.functions.Function0) v8_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p20);
            androidx.compose.material3.ButtonKt.Button(v16_1, 0, 0, 0, androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 0, 0, 0, p20, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14), 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$-156927883$app(), p20, 805306368, 494);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$48$lambda$47$lambda$46(com.example.ui.viewmodel.QuadraViewModel p2, androidx.compose.runtime.MutableState p3, android.content.Context p4)
    {
        p2.sendPasswordRecovery(com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$41(p3), new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda34(p4));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$48$lambda$47$lambda$46$lambda$45(android.content.Context p2)
    {
        android.widget.Toast.makeText(p2, ((CharSequence) "E-mail de recupera\u00e7\u00e3o enviado!"), 0).show();
        return kotlin.Unit.INSTANCE;
    }

    private static final void LoginScreen$lambda$5(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    static final kotlin.Unit LoginScreen$lambda$51(com.example.ui.viewmodel.QuadraViewModel p14, androidx.compose.runtime.Composer p15, int p16)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p15, "C392@16864L54,392@16843L133:LoginScreen.kt#2thlc2");
        if (((p16 & 3) == 2) && (p15.getSkipping())) {
            p15.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1394362845, p16, -1, "com.example.ui.screens.LoginScreen.<anonymous> (LoginScreen.kt:392)");
            }
            int v6_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p15, 47103609, "CC(remember):LoginScreen.kt#9igjgp");
            boolean v0_4 = p15.changedInstance(p14);
            int v3_0 = p15.rememberedValue();
            if ((!v0_4) && (v3_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v6_0 = v3_0;
            } else {
                v6_0 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda10(p14);
                p15.updateRememberedValue(v6_0);
            }
            boolean v0_7 = ((kotlin.jvm.functions.Function0) v6_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p15);
            androidx.compose.material3.ButtonKt.TextButton(v0_7, 0, 0, 0, 0, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$1832334598$app(), p15, 805306368, 510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$51$lambda$50$lambda$49(com.example.ui.viewmodel.QuadraViewModel p2)
    {
        p2.getShowPasswordRecoveryDialog().setValue(Boolean.valueOf(0));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$55(androidx.compose.runtime.MutableState p54, androidx.compose.runtime.Composer p55, int p56)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p55, "C364@15640L635:LoginScreen.kt#2thlc2");
        if (((p56 & 3) == 2) && (p55.getSkipping())) {
            p55.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-687328320, p56, -1, "com.example.ui.screens.LoginScreen.<anonymous> (LoginScreen.kt:364)");
            }
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p55, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v9_3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), p55, (((0 >> 3) & 14) | ((0 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p55, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v3_10 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p55, 0);
            androidx.compose.runtime.CompositionLocalMap v12_1 = p55.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v13_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p55, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            kotlin.jvm.functions.Function0 v14_1 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p55, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p55.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p55.startReusableNode();
            if (!p55.getInserting()) {
                p55.useNode();
            } else {
                p55.createNode(v14_1);
            }
            Integer v23;
            boolean v0_27 = androidx.compose.runtime.Updater.constructor-impl(p55);
            androidx.compose.runtime.Updater.set-impl(v0_27, v9_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v0_27, v12_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Composer v1_20 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v20 = v0_27;
            if (v20.getInserting()) {
                v23 = v3_10;
                v20.updateRememberedValue(Integer.valueOf(v23));
                v0_27.apply(Integer.valueOf(v23), v1_20);
            } else {
                v23 = v3_10;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v20.rememberedValue(), Integer.valueOf(v23))) {
                }
            }
            androidx.compose.runtime.MutableState v45_1;
            boolean v0_16;
            androidx.compose.runtime.Updater.set-impl(v0_27, v13_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p55, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            androidx.compose.foundation.layout.ColumnScope v21 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p55, -1611158739, "C365@15669L196,369@15886L41,372@16054L22,370@15948L309:LoginScreen.kt#2thlc2");
            androidx.compose.material3.TextKt.Text--4IGK_g("Digite seu e-mail cadastrado. Um link de redefini\u00e7\u00e3o e c\u00f3digo de seguran\u00e7a ser\u00e3o enviados para voc\u00ea:", 0, 0, androidx.compose.ui.unit.TextUnitKt.getSp(13), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p55, 3078, 0, 131062);
            int v53 = (((0 >> 6) & 112) | 6);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), p55, 6);
            String v24_1 = com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$41(p54);
            androidx.compose.ui.Modifier v26_1 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p55, 640775552, "CC(remember):LoginScreen.kt#9igjgp");
            Object v4_2 = p55.rememberedValue();
            if (v4_2 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v45_1 = p55;
                v0_16 = v4_2;
            } else {
                v45_1 = p55;
                v0_16 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda7(p54);
                p55.updateRememberedValue(v0_16);
            }
            kotlin.jvm.functions.Function1 v25_2 = ((kotlin.jvm.functions.Function1) v0_16);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v45_1);
            kotlin.jvm.functions.Function2 vtmp30 = com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$899947312$app();
            androidx.compose.runtime.MutableState v47_1 = v45_1;
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(v24_1, v25_2, v26_1, 0, 0, 0, vtmp30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, v47_1, 1573296, 12582912, 0, 8257464);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v47_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p55);
            p55.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p55);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p55);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p55);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$55$lambda$54$lambda$53$lambda$52(androidx.compose.runtime.MutableState p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        com.example.ui.screens.LoginScreenKt.LoginScreen$lambda$42(p1, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$57$lambda$56(com.example.ui.viewmodel.QuadraViewModel p2)
    {
        p2.getShowRegistrationDialog().setValue(Boolean.valueOf(0));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$60$lambda$59(com.example.ui.viewmodel.QuadraViewModel p9, android.content.Context p10, String p11, String p12, String p13, String p14, String p15, kotlin.jvm.functions.Function1 p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "birthDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "sport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "photo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "pass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "onError");
        com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda28 v7_1 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda28(p10);
        p9.registerNewUser(p11, p12, p13, p14, p15, v7_1, p16);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$60$lambda$59$lambda$58(android.content.Context p2)
    {
        android.widget.Toast.makeText(p2, ((CharSequence) "Cadastro realizado! Bem-vindo(a) \u00e0 Quadra!"), 0).show();
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit LoginScreen$lambda$61(com.example.ui.viewmodel.QuadraViewModel p1, int p2, androidx.compose.runtime.Composer p3, int p4)
    {
        com.example.ui.screens.LoginScreenKt.LoginScreen(p1, p3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p2 | 1)));
        return kotlin.Unit.INSTANCE;
    }

    private static final boolean LoginScreen$lambda$7(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((Boolean) ((androidx.compose.runtime.State) p4).getValue()).booleanValue();
    }

    private static final void LoginScreen$lambda$8(androidx.compose.runtime.MutableState p5, boolean p6)
    {
        int v1 = 0;
        p5.setValue(Boolean.valueOf(p6));
        return;
    }

    public static final void RegistrationDialog(kotlin.jvm.functions.Function0 p30, kotlin.jvm.functions.Function6 p31, androidx.compose.runtime.Composer p32, int p33)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p30, "onDismiss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p31, "onRegister");
        androidx.compose.runtime.Composer v9 = p32.startRestartGroup(1466056022);
        androidx.compose.runtime.ComposerKt.sourceInformation(v9, "C(RegistrationDialog)420@17829L31,421@17882L31,422@17939L38,423@18026L39,424@18086L31,425@18139L42,561@24630L649,577@25305L104,441@18674L5930,429@18273L7142:LoginScreen.kt#2thlc2");
        kotlin.jvm.functions.Function2 v3_1 = p33;
        if ((p33 & 6) == 0) {
            int v4_5;
            if (!v9.changedInstance(p30)) {
                v4_5 = 2;
            } else {
                v4_5 = 4;
            }
            v3_1 = (p33 | v4_5);
        }
        if ((p33 & 48) == 0) {
            int v4_15;
            if (!v9.changedInstance(p31)) {
                v4_15 = 16;
            } else {
                v4_15 = 32;
            }
            v3_1 |= v4_15;
        }
        androidx.compose.runtime.Composer v18_0;
        long v10_1 = v3_1;
        if (((v10_1 & 19) == 18) && (v9.getSkipping())) {
            v9.skipToGroupEnd();
            v18_0 = v9;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1466056022, v10_1, -1, "com.example.ui.screens.RegistrationDialog (LoginScreen.kt:419)");
            }
            long v12_13;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9, 130570965, "CC(remember):LoginScreen.kt#9igjgp");
            int v4_19 = v9;
            long v8_5 = v4_19.rememberedValue();
            if (v8_5 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v12_13 = v8_5;
            } else {
                v12_13 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default("", 0, 2, 0);
                v4_19.updateRememberedValue(v12_13);
            }
            long v12_16;
            androidx.compose.runtime.Composer v18_2 = ((androidx.compose.runtime.MutableState) v12_13);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v9);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9, 130572661, "CC(remember):LoginScreen.kt#9igjgp");
            int v4_20 = v9;
            long v8_6 = v4_20.rememberedValue();
            if (v8_6 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v12_16 = v8_6;
            } else {
                v12_16 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default("", 0, 2, 0);
                v4_20.updateRememberedValue(v12_16);
            }
            long v12_2;
            int v19_2 = ((androidx.compose.runtime.MutableState) v12_16);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v9);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9, 130574492, "CC(remember):LoginScreen.kt#9igjgp");
            int v4_0 = v9;
            long v8_0 = v4_0.rememberedValue();
            if (v8_0 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v12_2 = v8_0;
            } else {
                v12_2 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default("Futebol", 0, 2, 0);
                v4_0.updateRememberedValue(v12_2);
            }
            long v12_5;
            int v20_1 = ((androidx.compose.runtime.MutableState) v12_2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v9);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9, 130577277, "CC(remember):LoginScreen.kt#9igjgp");
            int v4_1 = v9;
            long v8_1 = v4_1.rememberedValue();
            if (v8_1 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v12_5 = v8_1;
            } else {
                v12_5 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default("avatar_1", 0, 2, 0);
                v4_1.updateRememberedValue(v12_5);
            }
            long v12_8;
            int v17_1 = ((androidx.compose.runtime.MutableState) v12_5);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v9);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9, 130579189, "CC(remember):LoginScreen.kt#9igjgp");
            int v4_3 = v9;
            long v8_2 = v4_3.rememberedValue();
            if (v8_2 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v12_8 = v8_2;
            } else {
                v12_8 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default("", 0, 2, 0);
                v4_3.updateRememberedValue(v12_8);
            }
            int v11_2;
            int v21_1 = ((androidx.compose.runtime.MutableState) v12_8);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v9);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9, 130580896, "CC(remember):LoginScreen.kt#9igjgp");
            kotlin.jvm.functions.Function2 v3_2 = v9;
            int v7_0 = v3_2.rememberedValue();
            if (v7_0 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v11_2 = v7_0;
            } else {
                v11_2 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(0, 0, 2, 0);
                v3_2.updateRememberedValue(v11_2);
            }
            androidx.compose.runtime.MutableState v22_1 = ((androidx.compose.runtime.MutableState) v11_2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v9);
            boolean v1_4 = new String[5];
            v1_4[0] = "avatar_1";
            v1_4[1] = "avatar_2";
            v1_4[2] = "avatar_3";
            v1_4[3] = "avatar_4";
            v1_4[4] = "avatar_5";
            int v16_0 = kotlin.collections.CollectionsKt.listOf(v1_4);
            androidx.compose.runtime.MutableState v25 = v17_1;
            androidx.compose.runtime.MutableState v24 = v20_1;
            androidx.compose.runtime.MutableState v27 = v22_1;
            v18_0 = v9;
            androidx.compose.material3.AndroidAlertDialog_androidKt.AlertDialog-Oix01E0(p30, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(112753566, 1, new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda23(p31, v18_2, v19_2, v20_1, v21_1, v22_1, v17_1), v9, 54)), 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1839898528, 1, new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda24(p30), v9, 54)), 0, com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$-727923806$app(), ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2011834973, 1, new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda25(v16_0, v17_1, v18_2, v19_2, v20_1, v21_1, v22_1), v9, 54)), 0, 0, 0, 0, 0, 0, 0, v18_0, ((v10_1 & 14) | 1772592), 0, 16276);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        boolean v1_11 = v18_0.endRestartGroup();
        if (!v1_11) {
            int v4 = p33;
        } else {
            v1_11.updateScope(new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda26(p30, p31, p33));
        }
        return;
    }

    static final kotlin.Unit RegistrationDialog$lambda$104(java.util.List p92, androidx.compose.runtime.MutableState p93, androidx.compose.runtime.MutableState p94, androidx.compose.runtime.MutableState p95, androidx.compose.runtime.MutableState p96, androidx.compose.runtime.MutableState p97, androidx.compose.runtime.MutableState p98, androidx.compose.runtime.Composer p99, int p100)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p99, "C445@18804L21,442@18688L5906:LoginScreen.kt#2thlc2");
        if (((p100 & 3) == 2) && (p99.getSkipping())) {
            p99.skipToGroupEnd();
            androidx.compose.runtime.MutableState v10 = p97;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2011834973, p100, -1, "com.example.ui.screens.RegistrationDialog.<anonymous> (LoginScreen.kt:442)");
            }
            int v6_23 = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.foundation.ScrollKt.rememberScrollState(0, p99, 0, 1), 0, 0, 0, 14, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            int v12_1 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
            int v13_4 = androidx.compose.ui.Alignment.Companion.getStart();
            androidx.compose.ui.layout.MeasurePolicy v14_3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v12_1, v13_4, p99, (((0 >> 3) & 14) | ((0 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v18 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p99, 0);
            int v2_62 = p99.getCurrentCompositionLocalMap();
            androidx.compose.runtime.MutableState v10_12 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p99, v6_23);
            kotlin.jvm.functions.Function0 vtmp12 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            int v21 = vtmp12;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p99.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            int v5_36;
            p99.startReusableNode();
            if (!p99.getInserting()) {
                v5_36 = v21;
                p99.useNode();
            } else {
                v5_36 = v21;
                p99.createNode(v5_36);
            }
            float v1_16 = androidx.compose.runtime.Updater.constructor-impl(p99);
            androidx.compose.runtime.Updater.set-impl(v1_16, v14_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_16, v2_62, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.runtime.MutableState v4_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v26_0 = v1_16;
            if (v26_0.getInserting()) {
                Integer v29 = v5_36;
                v26_0.updateRememberedValue(Integer.valueOf(v18));
                v1_16.apply(Integer.valueOf(v18), v4_4);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v26_0.rememberedValue(), Integer.valueOf(v18))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v1_16, v10_12, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            androidx.compose.foundation.layout.ColumnScope v24 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            int v27 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -678532085, "C448@18917L92,449@19026L40,450@19083L1137,474@20238L41,479@20413L13,477@20324L391,486@20733L41,491@20927L182,489@20833L643,502@21494L41,505@21666L92,506@21775L40,507@21832L1955,542@23805L41,547@23985L17,545@23892L473:LoginScreen.kt#2thlc2");
            androidx.compose.material3.TextKt.Text--4IGK_g("1. Foto de Perfil (Obrigat\u00f3rio):", 0, 0, androidx.compose.ui.unit.TextUnitKt.getSp(13), 0, androidx.compose.ui.text.font.FontWeight.Companion.getSemiBold(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p99, 199686, 0, 131030);
            androidx.compose.ui.Modifier v62 = v6_23;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 6))), p99, 6);
            int v2_40 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            int v5_14 = ((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween());
            int v6_20 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            int v64 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v8_21 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v5_14, v6_20, p99, (((438 >> 3) & 14) | ((438 >> 3) & 112)));
            Object v9_13 = ((438 << 3) & 112);
            int v33 = v5_14;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            long v34_1 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p99, 0);
            int v5_18 = p99.getCurrentCompositionLocalMap();
            int v6_21 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p99, v2_40);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p99.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p99.startReusableNode();
            if (!p99.getInserting()) {
                p99.useNode();
            } else {
                p99.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            int v2_50 = androidx.compose.runtime.Updater.constructor-impl(p99);
            androidx.compose.runtime.Updater.set-impl(v2_50, v8_21, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v2_50, v5_18, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.runtime.MutableState v7_13 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            long v43_1 = v2_50;
            if (v43_1.getInserting()) {
                int v46 = v8_21;
                v43_1.updateRememberedValue(Integer.valueOf(v34_1));
                v2_50.apply(Integer.valueOf(v34_1), v7_13);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v43_1.rememberedValue(), Integer.valueOf(v34_1))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v2_50, v6_21, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.MutableState v7_5 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v8_16 = (((438 >> 6) & 112) | 6);
            long v44 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v6_16 = p99;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -640405547, "C:LoginScreen.kt#2thlc2");
            p99.startReplaceGroup(1641909990);
            androidx.compose.runtime.ComposerKt.sourceInformation(p99, "*467@20006L28,457@19442L738");
            int v2_21 = ((Iterable) p92);
            kotlin.jvm.functions.Function2 v49_3 = ((Iterable) p92).iterator();
            while(true) {
                int v51_2 = v2_21;
                if (!v49_3.hasNext()) {
                    break;
                }
                Object v9_5;
                int v52_1 = v7_5;
                androidx.compose.runtime.MutableState v7_2 = ((String) v49_3.next());
                int v54_0 = v8_16;
                int v8_3 = kotlin.jvm.internal.Intrinsics.areEqual(com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$72(p93), v7_2);
                int v55_1 = androidx.compose.ui.Alignment.Companion.getCenter();
                int v57_0 = v8_3;
                int v56_1 = v9_13;
                float v75 = v10_12;
                int v8_7 = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 46))), ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()));
                if (v57_0 == 0) {
                    v9_5 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 1));
                } else {
                    v9_5 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 3));
                }
                int v66_0;
                if (v57_0 == 0) {
                    v66_0 = androidx.compose.ui.graphics.Color.Companion.getLightGray-0d7_KjU();
                } else {
                    v66_0 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
                }
                androidx.compose.ui.Modifier v78_0;
                int v2_1;
                int v76 = v13_4;
                int v77 = v12_1;
                int v66_2 = androidx.compose.foundation.BorderKt.border-xT4_qwU(v8_7, v9_5, v66_0, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()));
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_16, 1939324873, "CC(remember):LoginScreen.kt#9igjgp");
                int v2_0 = v6_16.changed(v7_2);
                int v8_9 = v6_16;
                androidx.compose.runtime.MutableState v10_10 = v8_9.rememberedValue();
                if ((v2_0 == 0) && (v10_10 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v78_0 = v6_16;
                    v2_1 = v10_10;
                } else {
                    int v67 = v2_0;
                    v78_0 = v6_16;
                    v2_1 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda35(v7_2, p93);
                    v8_9.updateRememberedValue(v2_1);
                }
                int v70_1 = ((kotlin.jvm.functions.Function0) v2_1);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v78_0);
                int v2_3 = androidx.compose.foundation.ClickableKt.clickable-XHw0xAI$default(v66_2, 0, 0, 0, v70_1, 7, 0);
                int v8_10 = v78_0;
                Object v9_7 = v55_1;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v8_10, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                int v13_3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(v9_7, 0);
                v67 = 0;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v8_10, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int v79_1 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v8_10, 0);
                int v6_7 = v8_10.getCurrentCompositionLocalMap();
                int v68_1 = v7_2;
                androidx.compose.runtime.MutableState v7_3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v8_10, v2_3);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v8_10, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(v8_10.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                v8_10.startReusableNode();
                if (!v8_10.getInserting()) {
                    v8_10.useNode();
                } else {
                    v8_10.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
                }
                int v2_12 = androidx.compose.runtime.Updater.constructor-impl(v8_10);
                int v84_1 = v8_10;
                androidx.compose.runtime.Updater.set-impl(v2_12, v13_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.set-impl(v2_12, v6_7, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                int v8_15 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                int v71_1 = v2_12;
                if (v71_1.getInserting()) {
                    Integer v86 = v9_7;
                    v71_1.updateRememberedValue(Integer.valueOf(v79_1));
                    v2_12.apply(Integer.valueOf(v79_1), v8_15);
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(v71_1.rememberedValue(), Integer.valueOf(v79_1))) {
                    }
                }
                androidx.compose.runtime.Updater.set-impl(v2_12, v7_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
                int v6_14 = v84_1;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_14, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                Object v9 = (((48 >> 6) & 112) | 6);
                Integer v72_1 = v6_14;
                androidx.compose.foundation.layout.BoxScope v89 = ((androidx.compose.foundation.layout.BoxScope) androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE);
                Integer v90 = v6_14;
                androidx.compose.runtime.MutableState v7_4 = v72_1;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_4, 1672684029, "C469@20091L63:LoginScreen.kt#2thlc2");
                com.example.ui.components.CommonComponentsKt.UserAvatarView(v68_1, v68_1, 42, 0, v72_1, 384, 8);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v7_4);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v90);
                v84_1.endNode();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v84_1);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v84_1);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v84_1);
                v2_21 = v51_2;
                v7_5 = v52_1;
                v8_16 = v54_0;
                v9_13 = v56_1;
                v10_12 = v75;
                v13_4 = v76;
                v12_1 = v77;
                v6_16 = v78_0;
            }
            int v13_5;
            int v51_3;
            androidx.compose.ui.Modifier v78_1 = v6_16;
            int v54 = v8_16;
            v75 = v10_12;
            v76 = v13_4;
            v78_1.endReplaceGroup();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v78_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            p99.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 14))), p99, 6);
            String v30_2 = com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$63(p94);
            long v32_1 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -160393242, "CC(remember):LoginScreen.kt#9igjgp");
            Object v9_22 = p99.rememberedValue();
            if (v9_22 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v51_3 = p99;
                v13_5 = v9_22;
            } else {
                v51_3 = p99;
                v13_5 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda1(p94);
                p99.updateRememberedValue(v13_5);
            }
            int v51_5;
            androidx.compose.runtime.MutableState v4_10;
            int v31_2 = ((kotlin.jvm.functions.Function1) v13_5);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v51_3);
            int v36_3 = com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$-50930637$app();
            kotlin.jvm.functions.Function2 vtmp70 = com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$-107795983$app();
            int v53_1 = v51_3;
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(v30_2, v31_2, v32_1, 0, 0, 0, v36_3, 0, vtmp70, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, v53_1, 102236592, 12582912, 0, 8257208);
            int v6_32 = v53_1;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10))), v6_32, 6);
            String v30_3 = com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$66(p95);
            long v32_2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_32, -160376625, "CC(remember):LoginScreen.kt#9igjgp");
            int v8_34 = v6_32;
            androidx.compose.runtime.MutableState v10_17 = v8_34.rememberedValue();
            if (v10_17 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v51_5 = v6_32;
                v4_10 = v10_17;
            } else {
                v51_5 = v6_32;
                v4_10 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda2(p95);
                v8_34.updateRememberedValue(v4_10);
            }
            int v31_4 = ((kotlin.jvm.functions.Function1) v4_10);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v51_5);
            int v36_4 = com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$1189197098$app();
            int v37_2 = com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$1782685769$app();
            kotlin.jvm.functions.Function2 vtmp85 = com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$-1918792856$app();
            int v53_2 = v51_5;
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(v30_3, v31_4, v32_2, 0, 0, 0, v36_4, v37_2, vtmp85, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, v53_2, 114819504, 12582912, 0, 8257080);
            androidx.compose.runtime.MutableState v4_15 = v53_2;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 14))), v4_15, 6);
            androidx.compose.material3.TextKt.Text--4IGK_g("Esporte Praticado (Obrigat\u00f3rio):", 0, 0, androidx.compose.ui.unit.TextUnitKt.getSp(13), 0, androidx.compose.ui.text.font.FontWeight.Companion.getSemiBold(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v4_15, 199686, 0, 131030);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 6))), v4_15, 6);
            Object v9_24 = v4_15;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_24, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            int v13_13 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(((androidx.compose.foundation.layout.Arrangement$Vertical) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 6)))), androidx.compose.ui.Alignment.Companion.getStart(), v9_24, (((48 >> 3) & 14) | ((48 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_24, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v3_5 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v9_24, 0);
            int v6_36 = v9_24.getCurrentCompositionLocalMap();
            int v19 = v3_5;
            int v3_0 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v9_24, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_24, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(v9_24.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            v9_24.startReusableNode();
            if (!v9_24.getInserting()) {
                v9_24.useNode();
            } else {
                v9_24.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            long v39_5;
            androidx.compose.runtime.MutableState v7_40 = androidx.compose.runtime.Updater.constructor-impl(v9_24);
            androidx.compose.runtime.Updater.set-impl(v7_40, v13_13, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v7_40, v6_36, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v0_11 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v36_6 = v7_40;
            if (v36_6.getInserting()) {
                v39_5 = 48;
                v36_6.updateRememberedValue(Integer.valueOf(v19));
                v7_40.apply(Integer.valueOf(v19), v0_11);
            } else {
                v39_5 = 48;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v36_6.rememberedValue(), Integer.valueOf(v19))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v7_40, v3_0, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            int v6_1 = v9_24;
            androidx.compose.runtime.MutableState v7_0 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_1, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int v8_1 = (((v39_5 >> 6) & 112) | 6);
            v33 = (((((((48 << 3) & 112) << 6) & 896) | 6) >> 6) & 14);
            float v1_6 = v6_1;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v1_6, 143888722, "C:LoginScreen.kt#2thlc2");
            v1_6.startReplaceGroup(1528662597);
            androidx.compose.runtime.ComposerKt.sourceInformation(v1_6, "*519@22632L25,520@22684L1063,510@22030L1717");
            int v0_2 = ((Iterable) com.example.ui.components.CommonComponentsKt.getSPORTS_LIST());
            int v5_3 = 0;
            int v37_4 = v0_2.iterator();
            while (v37_4.hasNext()) {
                androidx.compose.ui.Modifier v40_6;
                int v54_7 = v0_2;
                int v0_39 = ((String) v37_4.next());
                int v56_5 = v3_0;
                int v3_8 = kotlin.jvm.internal.Intrinsics.areEqual(com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$69(p96), v0_39);
                if (v3_8 == 0) {
                    v40_6 = androidx.compose.ui.graphics.Color.Companion.getTransparent-0d7_KjU();
                } else {
                    v40_6 = androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 1041865114, 0, 0, 0, 14, 0);
                }
                int v5_41;
                androidx.compose.ui.graphics.Shape v41_8;
                int v42_7 = v40_6;
                int v57_4 = v5_3;
                int v58_1 = v6_1;
                int v5_39 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 10)));
                if (v3_8 == 0) {
                    v41_8 = v5_39;
                    v5_41 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 1));
                } else {
                    v41_8 = v5_39;
                    v5_41 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 2));
                }
                long v44_6;
                if (v3_8 == 0) {
                    v44_6 = androidx.compose.ui.graphics.Color.Companion.getLightGray-0d7_KjU();
                } else {
                    v44_6 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
                }
                int v5_48;
                androidx.compose.runtime.MutableState v61_1 = v7_0;
                androidx.compose.foundation.BorderStroke v48_5 = androidx.compose.foundation.BorderStrokeKt.BorderStroke-cXLIe8U(v5_41, v44_6);
                int v68_2 = v8_1;
                androidx.compose.ui.Modifier v78_2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v1_6, 315571928, "CC(remember):LoginScreen.kt#9igjgp");
                int v5_46 = v1_6.changed(v0_39);
                int v6_50 = v1_6;
                int v8_55 = v6_50.rememberedValue();
                if ((v5_46 == 0) && (v8_55 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v5_48 = v8_55;
                } else {
                    v46 = 0;
                    v5_48 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda3(v0_39, p96);
                    v6_50.updateRememberedValue(v5_48);
                }
                kotlin.jvm.functions.Function0 v82_1 = ((kotlin.jvm.functions.Function0) v5_48);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v1_6);
                androidx.compose.ui.Modifier v40_0 = androidx.compose.foundation.ClickableKt.clickable-XHw0xAI$default(v78_2, 0, 0, 0, v82_1, 7, 0);
                androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(v40_0, ((androidx.compose.ui.graphics.Shape) v41_8), v42_7, 0, 0, 0, v48_5, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1967091748, 1, new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda4(v0_39, v3_8), v1_6, 54)), v1_6, 12582912, 56);
                v0_2 = v54_7;
                v3_0 = v56_5;
                v5_3 = v57_4;
                v6_1 = v58_1;
                v7_0 = v61_1;
                v8_1 = v68_2;
            }
            Object v9_25;
            int v56 = v3_0;
            int v58_0 = v6_1;
            int v68 = v8_1;
            v1_6.endReplaceGroup();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v1_6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v58_0);
            v9_24.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v9_24);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v9_24);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v9_24);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10))), v4_15, 6);
            String v30_5 = com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$75(p97);
            int v0_24 = new androidx.compose.ui.text.input.PasswordVisualTransformation(0, 1, 0);
            long v32_4 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_15, -160278934, "CC(remember):LoginScreen.kt#9igjgp");
            int v2_63 = v4_15;
            int v5_31 = v2_63.rememberedValue();
            if (v5_31 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v9_25 = v5_31;
            } else {
                v9_25 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda5(p97);
                v2_63.updateRememberedValue(v9_25);
            }
            int v31_9 = ((kotlin.jvm.functions.Function1) v9_25);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v4_15);
            int v36_7 = com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$148905259$app();
            kotlin.jvm.functions.Function2 vtmp151 = com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$1335882601$app();
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(v30_5, v31_9, v32_4, 0, 0, 0, v36_7, 0, vtmp151, 0, 0, 0, 0, 0, ((androidx.compose.ui.text.input.VisualTransformation) v0_24), 0, 0, 1, 0, 0, 0, 0, 0, v4_15, 102236592, 12582912, 0, 8240824);
            if (com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$78(p98) == null) {
                v4_15.startReplaceGroup(-697474295);
            } else {
                v4_15.startReplaceGroup(-673257157);
                androidx.compose.runtime.ComposerKt.sourceInformation(v4_15, "556@24428L40,557@24489L73");
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))), v4_15, 6);
                int v0_33 = com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$78(p98);
                if (v0_33 == 0) {
                    v0_33 = "";
                }
                androidx.compose.material3.TextKt.Text--4IGK_g(v0_33, 0, androidx.compose.ui.graphics.ColorKt.Color(4292030255), androidx.compose.ui.unit.TextUnitKt.getSp(12), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v4_15, 3456, 0, 131058);
            }
            v4_15.endReplaceGroup();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v4_15);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            p99.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit RegistrationDialog$lambda$104$lambda$103$lambda$100$lambda$99$lambda$96$lambda$95(String p1, androidx.compose.runtime.MutableState p2)
    {
        com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$70(p2, p1);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit RegistrationDialog$lambda$104$lambda$103$lambda$100$lambda$99$lambda$98(String p51, boolean p52, androidx.compose.runtime.Composer p53, int p54)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p53, "C521@22714L1007:LoginScreen.kt#2thlc2");
        if (((p54 & 3) == 2) && (p53.getSkipping())) {
            p53.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1967091748, p54, -1, "com.example.ui.screens.RegistrationDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:521)");
            }
            int v1_17 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12)), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)));
            float v3_11 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p53, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v8_4 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v3_11, p53, (((390 >> 3) & 14) | ((390 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p53, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v11_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p53, 0);
            androidx.compose.runtime.CompositionLocalMap v12_1 = p53.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v13 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p53, v1_17);
            kotlin.jvm.functions.Function0 v14_1 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p53, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p53.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p53.startReusableNode();
            if (!p53.getInserting()) {
                p53.useNode();
            } else {
                p53.createNode(v14_1);
            }
            boolean v0_24 = androidx.compose.runtime.Updater.constructor-impl(p53);
            androidx.compose.runtime.Updater.set-impl(v0_24, v8_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v0_24, v12_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v1_3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.RowScope v21 = v0_24;
            if ((v21.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v21.rememberedValue(), Integer.valueOf(v11_2)))) {
                v21.updateRememberedValue(Integer.valueOf(v11_2));
                v0_24.apply(Integer.valueOf(v11_2), v1_3);
            }
            int v25_1;
            androidx.compose.runtime.Updater.set-impl(v0_24, v13, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p53, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            v21 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p53, -42494016, "C525@22960L336,531@23329L40,532@23402L289:LoginScreen.kt#2thlc2");
            String v24_0 = com.example.ui.components.CommonComponentsKt.getSportIcon(p51);
            if (!p52) {
                v25_1 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            } else {
                v25_1 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
            }
            boolean v0_14;
            long v27 = v25_1;
            long v26_0 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 20)));
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v24_0, p51, v26_0, v27, p53, 384, 0);
            int v50 = (((390 >> 6) & 112) | 6);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10))), p53, 6);
            boolean v0_13 = androidx.compose.ui.text.font.FontWeight.Companion;
            if (!p52) {
                v0_14 = v0_13.getNormal();
            } else {
                v0_14 = v0_13.getBold();
            }
            boolean v0_16;
            androidx.compose.ui.text.font.FontWeight v31_1 = v0_14;
            if (!p52) {
                v0_16 = androidx.compose.ui.graphics.Color.Companion.getBlack-0d7_KjU();
            } else {
                v0_16 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
            }
            androidx.compose.material3.TextKt.Text--4IGK_g(p51, 0, v0_16, 0, 0, v31_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p53, 0, 0, 131034);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p53);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p53);
            p53.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p53);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p53);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p53);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit RegistrationDialog$lambda$104$lambda$103$lambda$102$lambda$101(androidx.compose.runtime.MutableState p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$76(p1, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit RegistrationDialog$lambda$104$lambda$103$lambda$89$lambda$88$lambda$86$lambda$85(String p1, androidx.compose.runtime.MutableState p2)
    {
        com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$73(p2, p1);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit RegistrationDialog$lambda$104$lambda$103$lambda$91$lambda$90(androidx.compose.runtime.MutableState p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$64(p1, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit RegistrationDialog$lambda$104$lambda$103$lambda$94$lambda$93(androidx.compose.runtime.MutableState p11, String p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "input");
        Appendable v3_2 = ((Appendable) new StringBuilder());
        int v5 = 0;
        int v6 = ((CharSequence) p12).length();
        while (v5 < v6) {
            int v10_2;
            char v7 = ((CharSequence) p12).charAt(v5);
            char v8 = v7;
            if ((!Character.isDigit(v8)) && (v8 != 47)) {
                v10_2 = 0;
            } else {
                v10_2 = 1;
            }
            if (v10_2 != 0) {
                v3_2.append(v7);
            }
            v5++;
        }
        com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$67(p11, kotlin.text.StringsKt.take(((StringBuilder) v3_2).toString(), 10));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit RegistrationDialog$lambda$105(kotlin.jvm.functions.Function0 p1, kotlin.jvm.functions.Function6 p2, int p3, androidx.compose.runtime.Composer p4, int p5)
    {
        com.example.ui.screens.LoginScreenKt.RegistrationDialog(p1, p2, p4, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p3 | 1)));
        return kotlin.Unit.INSTANCE;
    }

    private static final String RegistrationDialog$lambda$63(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void RegistrationDialog$lambda$64(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final String RegistrationDialog$lambda$66(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void RegistrationDialog$lambda$67(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final String RegistrationDialog$lambda$69(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void RegistrationDialog$lambda$70(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final String RegistrationDialog$lambda$72(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void RegistrationDialog$lambda$73(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final String RegistrationDialog$lambda$75(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void RegistrationDialog$lambda$76(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final String RegistrationDialog$lambda$78(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void RegistrationDialog$lambda$79(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    static final kotlin.Unit RegistrationDialog$lambda$83(kotlin.jvm.functions.Function6 p22, androidx.compose.runtime.MutableState p23, androidx.compose.runtime.MutableState p24, androidx.compose.runtime.MutableState p25, androidx.compose.runtime.MutableState p26, androidx.compose.runtime.MutableState p27, androidx.compose.runtime.MutableState p28, androidx.compose.runtime.Composer p29, int p30)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p29, "C563@24678L429,572@25149L48,562@24644L625:LoginScreen.kt#2thlc2");
        if (((p30 & 3) == 2) && (p29.getSkipping())) {
            p29.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(112753566, p30, -1, "com.example.ui.screens.RegistrationDialog.<anonymous> (LoginScreen.kt:562)");
            }
            kotlin.jvm.functions.Function0 v14_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p29, 981996491, "CC(remember):LoginScreen.kt#9igjgp");
            boolean v0_4 = p29.changed(p22);
            int v3_0 = p29.rememberedValue();
            if ((!v0_4) && (v3_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v14_0 = v3_0;
            } else {
                v14_0 = new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda27(p22, p23, p24, p25, p26, p27, p28);
                p29.updateRememberedValue(v14_0);
            }
            kotlin.jvm.functions.Function0 v14_2 = ((kotlin.jvm.functions.Function0) v14_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p29);
            androidx.compose.material3.ButtonKt.Button(v14_2, 0, 0, 0, androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 0, 0, 0, p29, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14), 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$1545676686$app(), p29, 805306368, 494);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit RegistrationDialog$lambda$83$lambda$82$lambda$81(kotlin.jvm.functions.Function6 p8, androidx.compose.runtime.MutableState p9, androidx.compose.runtime.MutableState p10, androidx.compose.runtime.MutableState p11, androidx.compose.runtime.MutableState p12, androidx.compose.runtime.MutableState p13, androidx.compose.runtime.MutableState p14)
    {
        if ((!kotlin.text.StringsKt.isBlank(((CharSequence) com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$63(p9)))) && ((!kotlin.text.StringsKt.isBlank(((CharSequence) com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$66(p10)))) && ((!kotlin.text.StringsKt.isBlank(((CharSequence) com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$69(p11)))) && (!kotlin.text.StringsKt.isBlank(((CharSequence) com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$75(p12))))))) {
            p8.invoke(com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$63(p9), com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$66(p10), com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$69(p11), com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$72(p14), com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$75(p12), new com.example.ui.screens.LoginScreenKt$$ExternalSyntheticLambda6(p13));
            return kotlin.Unit.INSTANCE;
        } else {
            com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$79(p13, "Preencha todos os campos obrigat\u00f3rios!");
            return kotlin.Unit.INSTANCE;
        }
    }

    static final kotlin.Unit RegistrationDialog$lambda$83$lambda$82$lambda$81$lambda$80(androidx.compose.runtime.MutableState p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "err");
        com.example.ui.screens.LoginScreenKt.RegistrationDialog$lambda$79(p1, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit RegistrationDialog$lambda$84(kotlin.jvm.functions.Function0 p15, androidx.compose.runtime.Composer p16, int p17)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p16, "C578@25319L80:LoginScreen.kt#2thlc2");
        if (((p17 & 3) == 2) && (p16.getSkipping())) {
            p16.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1839898528, p17, -1, "com.example.ui.screens.RegistrationDialog.<anonymous> (LoginScreen.kt:578)");
            }
            androidx.compose.material3.ButtonKt.TextButton(p15, 0, 0, 0, 0, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$-1211695843$app(), p16, 805306368, 510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
