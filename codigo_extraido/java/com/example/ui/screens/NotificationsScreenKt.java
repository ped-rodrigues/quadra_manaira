package com.example.ui.screens;
public final class NotificationsScreenKt {

    public static final void NotificationsScreen(com.example.ui.viewmodel.QuadraViewModel p22, androidx.compose.runtime.Composer p23, int p24)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p22, "viewModel");
        androidx.compose.runtime.Composer v12 = p23.startRestartGroup(1778542002);
        androidx.compose.runtime.ComposerKt.sourceInformation(v12, "C(NotificationsScreen)57@2527L7,58@2584L16,59@2659L16,67@2903L12082,61@2681L12304:NotificationsScreen.kt#2thlc2");
        boolean v3_0 = p24;
        if ((p24 & 6) == 0) {
            int v4_3;
            if (!v12.changedInstance(p22)) {
                v4_3 = 2;
            } else {
                v4_3 = 4;
            }
            v3_0 = (p24 | v4_3);
        }
        int v15 = v3_0;
        if (((v15 & 3) == 2) && (v12.getSkipping())) {
            v12.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1778542002, v15, -1, "com.example.ui.screens.NotificationsScreen (NotificationsScreen.kt:56)");
            }
            com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda11 v2_0;
            int v4_5 = v12;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_5, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            int v6_2 = v4_5.consume(((androidx.compose.runtime.CompositionLocal) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v4_5);
            com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda11 v2_8 = ((android.content.Context) v6_2);
            boolean v3_11 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p22.getNotifications(), 0, v12, 0, 1);
            androidx.compose.foundation.layout.PaddingValues v5_3 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p22.getUnreadNotificationsCount(), 0, v12, 0, 1);
            int v4_7 = androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.graphics.ColorKt.Color(4294441724), 0, 2, 0);
            int v6_7 = androidx.compose.foundation.layout.PaddingKt.PaddingValues-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v12, -218092668, "CC(remember):NotificationsScreen.kt#9igjgp");
            int v8_9 = ((v12.changed(v5_3) | v12.changedInstance(p22)) | v12.changed(v3_11));
            int v9_5 = v12;
            kotlin.jvm.functions.Function1 v11_0 = v9_5.rememberedValue();
            if ((v8_9 == 0) && (v11_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v2_0 = v11_0;
            } else {
                p23 = v2_8;
                v2_0 = new com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda10(v5_3, p22, v3_11);
                v9_5.updateRememberedValue(v2_0);
            }
            kotlin.jvm.functions.Function1 v11_2 = ((kotlin.jvm.functions.Function1) v2_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v12);
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(v4_7, 0, v6_7, 0, ((androidx.compose.foundation.layout.Arrangement$Vertical) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 14)))), 0, 0, 0, v11_2, v12, 24966, 234);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda11 v2_2 = v12.endRestartGroup();
        if (v2_2 != null) {
            v2_2.updateScope(new com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda11(p22, p24));
        }
        return;
    }

    private static final java.util.List NotificationsScreen$lambda$0(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((java.util.List) p4.getValue());
    }

    private static final int NotificationsScreen$lambda$1(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((Number) p4.getValue()).intValue();
    }

    static final kotlin.Unit NotificationsScreen$lambda$27$lambda$26(androidx.compose.runtime.State p10, com.example.ui.viewmodel.QuadraViewModel p11, androidx.compose.runtime.State p12, androidx.compose.foundation.lazy.LazyListScope p13)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "$this$LazyColumn");
        androidx.compose.foundation.lazy.LazyListScope.item$default(p13, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-305052346, 1, new com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda0(p10, p11))), 3, 0);
        androidx.compose.foundation.lazy.LazyListScope.item$default(p13, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-118671811, 1, new com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda3(p11))), 3, 0);
        androidx.compose.foundation.lazy.LazyListScope.item$default(p13, 0, 0, com.example.ui.screens.ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$-1932464514$app(), 3, 0);
        if (!com.example.ui.screens.NotificationsScreenKt.NotificationsScreen$lambda$0(p12).isEmpty()) {
            kotlin.Unit v0_9 = com.example.ui.screens.NotificationsScreenKt.NotificationsScreen$lambda$0(p12);
            int v5_1 = v0_9.size();
            p13.items(v5_1, 0, ((kotlin.jvm.functions.Function1) new com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$lambda$27$lambda$26$$inlined$items$default$3(((kotlin.jvm.functions.Function1) com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$lambda$27$lambda$26$$inlined$items$default$1.INSTANCE), v0_9)), ((kotlin.jvm.functions.Function4) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-632812321, 1, new com.example.ui.screens.NotificationsScreenKt$NotificationsScreen$lambda$27$lambda$26$$inlined$items$default$4(v0_9))));
        } else {
            androidx.compose.foundation.lazy.LazyListScope.item$default(p13, 0, 0, com.example.ui.screens.ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$-962147999$app(), 3, 0);
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NotificationsScreen$lambda$27$lambda$26$lambda$10(androidx.compose.runtime.State p15, com.example.ui.viewmodel.QuadraViewModel p16, androidx.compose.foundation.lazy.LazyItemScope p17, androidx.compose.runtime.Composer p18, int p19)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "$this$item");
        androidx.compose.runtime.ComposerKt.sourceInformation(p18, "C72@3093L40,73@3176L38,75@3281L2802,70@2998L3085:NotificationsScreen.kt#2thlc2");
        if (((p19 & 17) == 16) && (p18.getSkipping())) {
            p18.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-305052346, p19, -1, "com.example.ui.screens.NotificationsScreen.<anonymous>.<anonymous>.<anonymous> (NotificationsScreen.kt:70)");
            }
            androidx.compose.foundation.shape.RoundedCornerShape v14 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 18)));
            androidx.compose.material3.CardColors v10_1 = androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 0, 0, 0, p18, ((androidx.compose.material3.CardDefaults.$stable << 12) | 6), 14);
            androidx.compose.material3.CardElevation v3_5 = androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(((float) 2)), 0, 0, 0, 0, 0, p18, ((androidx.compose.material3.CardDefaults.$stable << 18) | 6), 62);
            kotlin.Unit v0_11 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.material3.CardKt.Card(v0_11, ((androidx.compose.ui.graphics.Shape) v14), v10_1, v3_5, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(62393016, 1, new com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda9(p15, p16), p18, 54)), p18, 196614, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NotificationsScreen$lambda$27$lambda$26$lambda$10$lambda$9(androidx.compose.runtime.State p103, com.example.ui.viewmodel.QuadraViewModel p104, androidx.compose.foundation.layout.ColumnScope p105, androidx.compose.runtime.Composer p106, int p107)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p105, "$this$Card");
        androidx.compose.runtime.ComposerKt.sourceInformation(p106, "C76@3299L2770:NotificationsScreen.kt#2thlc2");
        if (((p107 & 17) == 16) && (p106.getSkipping())) {
            p106.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(62393016, p107, -1, "com.example.ui.screens.NotificationsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NotificationsScreen.kt:76)");
            }
            androidx.compose.runtime.Composer v2_6 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            int v8_20 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
            int v10_9 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v8_20, androidx.compose.ui.Alignment.Companion.getStart(), p106, (((6 >> 3) & 14) | ((6 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v16 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p106, 0);
            androidx.compose.runtime.CompositionLocalMap v15_1 = p106.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v13_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p106, v2_6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p106.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p106.startReusableNode();
            if (!p106.getInserting()) {
                p106.useNode();
            } else {
                p106.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            boolean v1_40 = androidx.compose.runtime.Updater.constructor-impl(p106);
            androidx.compose.runtime.Updater.set-impl(v1_40, v10_9, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_40, v15_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v3_3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.ColumnScope v27 = v1_40;
            if ((v27.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v27.rememberedValue(), Integer.valueOf(v16)))) {
                v27.updateRememberedValue(Integer.valueOf(v16));
                v1_40.apply(Integer.valueOf(v16), v3_3);
            }
            androidx.compose.runtime.Updater.set-impl(v1_40, v13_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            v27 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, 1167242038, "C77@3364L1756,114@5142L40,115@5203L253,121@5478L41,123@5541L510:NotificationsScreen.kt#2thlc2");
            boolean v1_9 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.ui.Alignment$Vertical vtmp27 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.ui.Modifier v33 = vtmp27;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.foundation.layout.Arrangement$Vertical v59 = v8_20;
            int v3_11 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween()), v33, p106, (((438 >> 3) & 14) | ((438 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v35_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p106, 0);
            androidx.compose.runtime.State v7_3 = p106.getCurrentCompositionLocalMap();
            int v8_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p106, v1_9);
            kotlin.jvm.functions.Function0 vtmp32 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            boolean v39_0 = vtmp32;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p106.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p106.startReusableNode();
            if (!p106.getInserting()) {
                p106.useNode();
            } else {
                p106.createNode(v39_0);
            }
            boolean v1_18 = androidx.compose.runtime.Updater.constructor-impl(p106);
            androidx.compose.runtime.Updater.set-impl(v1_18, v3_11, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_18, v7_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v5_14 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v44_0 = v1_18;
            if (v44_0.getInserting()) {
                int v47 = v7_3;
                v44_0.updateRememberedValue(Integer.valueOf(v35_2));
                v1_18.apply(Integer.valueOf(v35_2), v5_14);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v44_0.rememberedValue(), Integer.valueOf(v35_2))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v1_18, v8_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v42 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v45 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -604691411, "C82@3622L764:NotificationsScreen.kt#2thlc2");
            int v3_22 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v10_1 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v3_22, p106, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            kotlin.jvm.functions.Function0 v60 = v3_22;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v61_0 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p106, 0);
            int v3_25 = p106.getCurrentCompositionLocalMap();
            androidx.compose.runtime.Composer v9_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p106, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            kotlin.jvm.functions.Function0 vtmp52 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            int v65_0 = vtmp52;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p106.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p106.startReusableNode();
            if (!p106.getInserting()) {
                p106.useNode();
            } else {
                p106.createNode(v65_0);
            }
            androidx.compose.runtime.State v7_12 = androidx.compose.runtime.Updater.constructor-impl(p106);
            androidx.compose.runtime.Updater.set-impl(v7_12, v10_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v7_12, v3_25, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v8_19 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            Object v70_1 = v7_12;
            if (v70_1.getInserting()) {
                Integer v75 = v10_1;
                v70_1.updateRememberedValue(Integer.valueOf(v61_0));
                v7_12.apply(Integer.valueOf(v61_0), v8_19);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v70_1.rememberedValue(), Integer.valueOf(v61_0))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v7_12, v9_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v10 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v68 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -592907395, "C83@3704L283,89@4016L39,90@4084L276:NotificationsScreen.kt#2thlc2");
            String v76_0 = androidx.compose.material.icons.filled.NotificationsActiveKt.getNotificationsActive(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            long v79 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
            long v78_0 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 24)));
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v76_0, 0, v78_0, v79, p106, 3504, 0);
            androidx.compose.ui.Modifier v102 = v9_1;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))), p106, 6);
            long v80 = androidx.compose.ui.unit.TextUnitKt.getSp(17);
            androidx.compose.ui.text.font.FontWeight v83_1 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long vtmp75 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            androidx.compose.material3.TextKt.Text--4IGK_g("Central de Notifica\u00e7\u00f5es Push", 0, vtmp75, v80, 0, v83_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p106, 200070, 0, 131026);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            p106.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            if (com.example.ui.screens.NotificationsScreenKt.NotificationsScreen$lambda$1(p103) <= 0) {
                p106.startReplaceGroup(-608331184);
            } else {
                p106.startReplaceGroup(-603912041);
                androidx.compose.runtime.ComposerKt.sourceInformation(p106, "102@4627L445,99@4463L609");
                int v62_0 = androidx.compose.ui.graphics.ColorKt.Color(4293212469);
                androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(0, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 10)))), v62_0, 0, 0, 0, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1351939256, 1, new com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda1(p103), p106, 54)), p106, 12583296, 121);
            }
            p106.endReplaceGroup();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            p106.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 6))), p106, 6);
            int v34_0 = androidx.compose.ui.unit.TextUnitKt.getSp(13);
            long vtmp84 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g("Alertas autom\u00e1ticos de agendamentos, anivers\u00e1rios, mensagens privadas e lembretes com 24h de anteced\u00eancia.", 0, vtmp84, v34_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p106, 3462, 0, 131058);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), p106, 6);
            int v3_64 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            int v5_27 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getEnd();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.Modifier v4_9 = androidx.compose.ui.Alignment.Companion.getTop();
            int v6_7 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v5_27, v4_9, p106, (((54 >> 3) & 14) | ((54 >> 3) & 112)));
            androidx.compose.ui.Alignment$Vertical v32 = v4_9;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            androidx.compose.ui.Modifier v4_12 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p106, 0);
            androidx.compose.runtime.CompositionLocalMap v14_1 = p106.getCurrentCompositionLocalMap();
            int v17 = v4_12;
            androidx.compose.ui.Modifier v4_13 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p106, v3_64);
            kotlin.jvm.functions.Function0 vtmp94 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            int v34_1 = vtmp94;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p106.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p106.startReusableNode();
            if (!p106.getInserting()) {
                p106.useNode();
            } else {
                p106.createNode(v34_1);
            }
            int v3_69 = androidx.compose.runtime.Updater.constructor-impl(p106);
            androidx.compose.runtime.Updater.set-impl(v3_69, v6_7, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v3_69, v14_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Composer v2_16 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.runtime.Composer v37_3 = v3_69;
            if (v37_3.getInserting()) {
                Integer v40 = v6_7;
                v37_3.updateRememberedValue(Integer.valueOf(v17));
                v3_69.apply(Integer.valueOf(v17), v2_16);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v37_3.rememberedValue(), Integer.valueOf(v17))) {
                }
            }
            Object v70_3;
            androidx.compose.runtime.Updater.set-impl(v3_69, v4_13, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v6 = (((54 >> 6) & 112) | 6);
            int v22 = 0;
            int v34 = (((((((54 << 3) & 112) << 6) & 896) | 6) >> 6) & 14);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, 1696158397, "C124@5669L42,124@5648L381:NotificationsScreen.kt#2thlc2");
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p106, -915116205, "CC(remember):NotificationsScreen.kt#9igjgp");
            boolean v41_1 = p106.changedInstance(p104);
            boolean v1_31 = p106.rememberedValue();
            if (v41_1) {
                v70_3 = p106;
                Object v43 = v1_31;
                v1_31 = new com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda2(p104);
                p106.updateRememberedValue(v1_31);
            } else {
                v70_3 = p106;
                if (v1_31 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                }
            }
            kotlin.jvm.functions.Function0 v60_2 = ((kotlin.jvm.functions.Function0) v1_31);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v70_3);
            androidx.compose.material3.ButtonKt.TextButton(v60_2, 0, 0, 0, 0, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$1787191174$app(), v70_3, 805306368, 510);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v70_3);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            p106.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            p106.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p106);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NotificationsScreen$lambda$27$lambda$26$lambda$10$lambda$9$lambda$8$lambda$4$lambda$3(androidx.compose.runtime.State p27, androidx.compose.runtime.Composer p28, int p29)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p28, "C103@4661L381:NotificationsScreen.kt#2thlc2");
        if (((p29 & 3) == 2) && (p28.getSkipping())) {
            p28.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1351939256, p29, -1, "com.example.ui.screens.NotificationsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NotificationsScreen.kt:103)");
            }
            kotlin.Unit v1_6 = new StringBuilder().append(com.example.ui.screens.NotificationsScreenKt.NotificationsScreen$lambda$1(p27)).append(" novas").toString();
            long v4_1 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            long v6 = androidx.compose.ui.unit.TextUnitKt.getSp(11);
            androidx.compose.ui.text.font.FontWeight v9 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            androidx.compose.ui.Modifier v3_10 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)), androidx.compose.ui.unit.Dp.constructor-impl(((float) 3)));
            androidx.compose.material3.TextKt.Text--4IGK_g(v1_6, v3_10, v4_1, v6, 0, v9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p28, 200112, 0, 131024);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NotificationsScreen$lambda$27$lambda$26$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.markAllNotificationsAsRead();
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NotificationsScreen$lambda$27$lambda$26$lambda$24(com.example.ui.viewmodel.QuadraViewModel p15, androidx.compose.foundation.lazy.LazyItemScope p16, androidx.compose.runtime.Composer p17, int p18)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "$this$item");
        androidx.compose.runtime.ComposerKt.sourceInformation(p17, "C138@6282L46,141@6487L3924,136@6187L4224:NotificationsScreen.kt#2thlc2");
        if (((p18 & 17) == 16) && (p17.getSkipping())) {
            p17.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-118671811, p18, -1, "com.example.ui.screens.NotificationsScreen.<anonymous>.<anonymous>.<anonymous> (NotificationsScreen.kt:136)");
            }
            androidx.compose.foundation.shape.RoundedCornerShape v14 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 18)));
            androidx.compose.material3.CardColors v2_2 = androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4292933626), 0, 0, 0, p17, ((androidx.compose.material3.CardDefaults.$stable << 12) | 6), 14);
            androidx.compose.runtime.Composer v6_1 = p17;
            androidx.compose.foundation.BorderStroke v4 = androidx.compose.foundation.BorderStrokeKt.BorderStroke-cXLIe8U(androidx.compose.ui.unit.Dp.constructor-impl(((float) 1)), androidx.compose.ui.graphics.ColorKt.Color(4286635754));
            kotlin.Unit v0_12 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.material3.CardKt.Card(v0_12, ((androidx.compose.ui.graphics.Shape) v14), v2_2, 0, v4, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(809002799, 1, new com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda8(p15), v6_1, 54)), v6_1, 221190, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NotificationsScreen$lambda$27$lambda$26$lambda$24$lambda$23(com.example.ui.viewmodel.QuadraViewModel p98, androidx.compose.foundation.layout.ColumnScope p99, androidx.compose.runtime.Composer p100, int p101)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p99, "$this$Card");
        androidx.compose.runtime.ComposerKt.sourceInformation(p100, "C142@6505L3892:NotificationsScreen.kt#2thlc2");
        if (((p101 & 17) == 16) && (p100.getSkipping())) {
            p100.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(809002799, p101, -1, "com.example.ui.screens.NotificationsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NotificationsScreen.kt:142)");
            }
            int v2_20 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v12_3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), p100, (((6 >> 3) & 14) | ((6 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v19 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p100, 0);
            androidx.compose.runtime.CompositionLocalMap v13_3 = p100.getCurrentCompositionLocalMap();
            boolean v1_32 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p100, v2_20);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p100.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p100.startReusableNode();
            if (!p100.getInserting()) {
                p100.useNode();
            } else {
                p100.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            Integer v32;
            int v2_105 = androidx.compose.runtime.Updater.constructor-impl(p100);
            androidx.compose.runtime.Updater.set-impl(v2_105, v12_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v2_105, v13_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Integer v4_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v29_0 = v2_105;
            if (v29_0.getInserting()) {
                v32 = p100;
                v29_0.updateRememberedValue(Integer.valueOf(v19));
                v2_105.apply(Integer.valueOf(v19), v4_4);
            } else {
                v32 = p100;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v29_0.rememberedValue(), Integer.valueOf(v19))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v2_105, v1_32, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            Integer v4_7 = v32;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_7, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            androidx.compose.foundation.layout.ColumnScope v28 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            Integer v54 = v4_7;
            int v30 = 0;
            Integer v60 = v4_7;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_7, -1079702339, "C143@6570L239,149@6830L212,155@7064L41,157@7127L3252:NotificationsScreen.kt#2thlc2");
            int v37_0 = androidx.compose.ui.unit.TextUnitKt.getSp(14);
            int v40_0 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long vtmp27 = androidx.compose.ui.graphics.ColorKt.Color(4278214756);
            androidx.compose.material3.TextKt.Text--4IGK_g("Simular Notifica\u00e7\u00f5es Push (FCM)", 0, vtmp27, v37_0, 0, v40_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v54, 200070, 0, 131026);
            int v37_1 = androidx.compose.ui.unit.TextUnitKt.getSp(12);
            int v35_1 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
            androidx.compose.material3.TextKt.Text--4IGK_g("Toque abaixo para testar o disparo dos 4 cen\u00e1rios de push:", 0, v35_1, v37_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v54, 3462, 0, 131058);
            int v35 = 0;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10))), v4_7, 6);
            int v2_15 = ((androidx.compose.foundation.layout.Arrangement$Vertical) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))));
            int v5_9 = v54;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v5_9, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            int v6_9 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v2_15, androidx.compose.ui.Alignment.Companion.getStart(), v5_9, (((48 >> 3) & 14) | ((48 >> 3) & 112)));
            androidx.compose.foundation.layout.Arrangement$Vertical v38 = v2_15;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v5_9, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v39_1 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v5_9, 0);
            int v2_19 = v5_9.getCurrentCompositionLocalMap();
            Integer v7_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v5_9, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v5_9, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(v5_9.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            v5_9.startReusableNode();
            if (!v5_9.getInserting()) {
                v5_9.useNode();
            } else {
                v5_9.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            Integer v4_22 = androidx.compose.runtime.Updater.constructor-impl(v5_9);
            Integer v47 = v5_9;
            androidx.compose.runtime.Updater.set-impl(v4_22, v6_9, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v4_22, v2_19, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v5_16 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.ColumnScope v48_1 = v4_22;
            if (v48_1.getInserting()) {
                Integer v51 = v6_9;
                v48_1.updateRememberedValue(Integer.valueOf(v39_1));
                v4_22.apply(Integer.valueOf(v39_1), v5_16);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v48_1.rememberedValue(), Integer.valueOf(v39_1))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v4_22, v7_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            Integer v4_23 = v47;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_23, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            Integer v45_1 = v4_23;
            androidx.compose.foundation.layout.ColumnScope v48 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            Integer v52_1 = v4_23;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_23, 2146741981, "C158@7210L1566,182@8802L1555:NotificationsScreen.kt#2thlc2");
            boolean v1_9 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            int v2_33 = ((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))));
            int v5_21 = v45_1;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v5_21, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Integer v7_4 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v2_33, androidx.compose.ui.Alignment.Companion.getTop(), v5_21, (((54 >> 3) & 14) | ((54 >> 3) & 112)));
            Integer v69 = v2_33;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v5_21, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            boolean v70_0 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v5_21, 0);
            int v2_36 = v5_21.getCurrentCompositionLocalMap();
            Integer v4_30 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v5_21, v1_9);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v5_21, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(v5_21.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            v5_21.startReusableNode();
            if (!v5_21.getInserting()) {
                v5_21.useNode();
            } else {
                v5_21.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            boolean v1_18 = androidx.compose.runtime.Updater.constructor-impl(v5_21);
            int v78_0 = v5_21;
            androidx.compose.runtime.Updater.set-impl(v1_18, v7_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_18, v2_36, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v5_26 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v79_0 = v1_18;
            if (v79_0.getInserting()) {
                Integer v82 = v7_4;
                v79_0.updateRememberedValue(Integer.valueOf(v70_0));
                v1_18.apply(Integer.valueOf(v70_0), v5_26);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v79_0.rememberedValue(), Integer.valueOf(v70_0))) {
                }
            }
            Object v92_1;
            androidx.compose.runtime.Updater.set-impl(v1_18, v4_30, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            int v2_43 = v78_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_43, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            Integer v7 = (((54 >> 6) & 112) | 6);
            Object v92_0 = v2_43;
            int v79_1 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v80_0 = v2_43;
            Integer v4_31 = v92_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_31, 525415450, "C161@7488L48,160@7382L48,159@7332L698,172@8217L48,171@8110L49,170@8060L690:NotificationsScreen.kt#2thlc2");
            androidx.compose.ui.Alignment$Vertical v62_0 = androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 0, 0, 0, v92_0, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14);
            boolean v1_30 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 10)));
            int v84_3 = androidx.compose.foundation.layout.RowScope.weight$default(v79_1, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 1065353216, 0, 2, 0);
            androidx.compose.foundation.layout.Arrangement$Horizontal v61_1 = v1_30;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_31, -398692881, "CC(remember):NotificationsScreen.kt#9igjgp");
            int v83_2 = v4_31;
            androidx.compose.ui.graphics.Shape v86_2 = v4_31.changedInstance(p98);
            int v2_50 = v83_2.rememberedValue();
            if (v86_2 != null) {
                v92_1 = v4_31;
                int v88 = v2_50;
                v2_50 = new com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda4(p98);
                v83_2.updateRememberedValue(v2_50);
            } else {
                v92_1 = v4_31;
                if (v2_50 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                    Integer v4 = v83_2;
                }
            }
            Object v92_4;
            int v83_4 = ((kotlin.jvm.functions.Function0) v2_50);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v92_1);
            Object v93_1 = v92_1;
            androidx.compose.material3.ButtonKt.Button(v83_4, v84_3, 0, ((androidx.compose.ui.graphics.Shape) v61_1), v62_0, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$365237103$app(), v93_1, 805306368, 484);
            Object v92_3 = v93_1;
            Integer v4_35 = v92_3;
            androidx.compose.foundation.layout.Arrangement$Horizontal v61_3 = androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4293284096), 0, 0, 0, v92_3, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14);
            int v97 = 0;
            int v2_59 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 10)));
            int v84_7 = androidx.compose.foundation.layout.RowScope.weight$default(v79_1, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 1065353216, 0, 2, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_35, -398669584, "CC(remember):NotificationsScreen.kt#9igjgp");
            int v5_31 = v4_35.changedInstance(p98);
            androidx.compose.ui.Alignment$Vertical v62_1 = v4_35;
            int v85_3 = v2_59;
            int v2_60 = v62_1.rememberedValue();
            if (v5_31 != 0) {
                v92_4 = v4_35;
                androidx.compose.material3.ButtonColors v87 = v2_60;
                v2_60 = new com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda5(p98);
                v62_1.updateRememberedValue(v2_60);
            } else {
                v92_4 = v4_35;
                if (v2_60 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                    v4 = v62_1;
                }
            }
            int v83_8 = ((kotlin.jvm.functions.Function0) v2_60);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v92_4);
            Object v93_3 = v92_4;
            androidx.compose.material3.ButtonKt.Button(v83_8, v84_7, 0, ((androidx.compose.ui.graphics.Shape) v85_3), v61_3, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$-1905983898$app(), v93_3, 805306368, 484);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v93_3);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v80_0);
            v78_0.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v78_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v78_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v78_0);
            int v2_71 = ((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))));
            Integer v7_11 = v45_1;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_11, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v6_21 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v2_71, androidx.compose.ui.Alignment.Companion.getTop(), v7_11, (((54 >> 3) & 14) | ((54 >> 3) & 112)));
            androidx.compose.foundation.layout.Arrangement$Horizontal v61 = v2_71;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_11, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v2_76 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v7_11, 0);
            androidx.compose.runtime.CompositionLocalMap v8_2 = v7_11.getCurrentCompositionLocalMap();
            int v18 = v2_76;
            int v2_77 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v7_11, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_11, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(v7_11.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            v7_11.startReusableNode();
            if (!v7_11.getInserting()) {
                v7_11.useNode();
            } else {
                v7_11.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            Integer v4_48 = androidx.compose.runtime.Updater.constructor-impl(v7_11);
            androidx.compose.runtime.Updater.set-impl(v4_48, v6_21, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v4_48, v8_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Integer v3_9 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v67_2 = v4_48;
            if (v67_2.getInserting()) {
                Integer v71 = v6_21;
                v67_2.updateRememberedValue(Integer.valueOf(v18));
                v4_48.apply(Integer.valueOf(v18), v3_9);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v67_2.rememberedValue(), Integer.valueOf(v18))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v4_48, v2_77, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            Integer v4_49 = v7_11;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_49, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v6 = (((54 >> 6) & 112) | 6);
            Integer v81_1 = v4_49;
            androidx.compose.foundation.layout.RowScope v63_3 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            v69 = v4_49;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_49, 2073251118, "C185@9077L48,184@8974L45,183@8924L686,196@9798L48,195@9690L50,194@9640L691:NotificationsScreen.kt#2thlc2");
            int v78_1 = androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4281236786), 0, 0, 0, v81_1, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14);
            int v2_92 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 10)));
            androidx.compose.ui.Modifier v73_3 = androidx.compose.foundation.layout.RowScope.weight$default(v63_3, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 1065353216, 0, 2, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_49, 898163299, "CC(remember):NotificationsScreen.kt#9igjgp");
            Integer v3_19 = v4_49.changedInstance(p98);
            kotlin.jvm.functions.Function0 v72_4 = v4_49;
            androidx.compose.ui.graphics.Shape v75_3 = v2_92;
            int v2_93 = v72_4.rememberedValue();
            if ((v3_19 == null) && (v2_93 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                Integer v3 = v72_4;
            } else {
                int v77 = v2_93;
                v2_93 = new com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda6(p98);
                v72_4.updateRememberedValue(v2_93);
            }
            androidx.compose.material3.ButtonColors v76_3;
            kotlin.jvm.functions.Function0 v72_6 = ((kotlin.jvm.functions.Function0) v2_93);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v4_49);
            Integer v82_1 = v4_49;
            androidx.compose.material3.ButtonKt.Button(v72_6, v73_3, 0, ((androidx.compose.ui.graphics.Shape) v75_3), v78_1, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$465501606$app(), v82_1, 805306368, 484);
            Integer v81_3 = v82_1;
            Integer v4_50 = v81_3;
            androidx.compose.material3.ButtonColors v33_3 = androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4285143962), 0, 0, 0, v81_3, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14);
            int v2_104 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 10)));
            androidx.compose.ui.Modifier v73_7 = androidx.compose.foundation.layout.RowScope.weight$default(v63_3, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 1065353216, 0, 2, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_50, 898186216, "CC(remember):NotificationsScreen.kt#9igjgp");
            Integer v3_25 = v4_50;
            kotlin.jvm.functions.Function0 v72_9 = v4_50.changedInstance(p98);
            boolean v1_34 = v3_25.rememberedValue();
            if (v72_9 != null) {
                v76_3 = v2_104;
                androidx.compose.ui.graphics.Shape v75 = v1_34;
                v1_34 = new com.example.ui.screens.NotificationsScreenKt$$ExternalSyntheticLambda7(p98);
                v3_25.updateRememberedValue(v1_34);
            } else {
                v76_3 = v2_104;
                if (v1_34 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                }
            }
            kotlin.jvm.functions.Function0 v72_11 = ((kotlin.jvm.functions.Function0) v1_34);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v4_50);
            Integer v82_3 = v4_50;
            androidx.compose.material3.ButtonKt.Button(v72_11, v73_7, 0, ((androidx.compose.ui.graphics.Shape) v76_3), v33_3, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$NotificationsScreenKt.INSTANCE.getLambda$-334493987$app(), v82_3, 805306368, 484);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v82_3);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v69);
            v7_11.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v7_11);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v7_11);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v7_11);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v45_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v52_1);
            v47.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v47);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v47);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v47);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v54);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v60);
            v32.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v32);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v32);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NotificationsScreen$lambda$27$lambda$26$lambda$24$lambda$23$lambda$22$lambda$21$lambda$15$lambda$12$lambda$11(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.triggerPushNotification("BOOKING");
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NotificationsScreen$lambda$27$lambda$26$lambda$24$lambda$23$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.triggerPushNotification("BIRTHDAY");
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NotificationsScreen$lambda$27$lambda$26$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20$lambda$17$lambda$16(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.triggerPushNotification("CHAT");
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NotificationsScreen$lambda$27$lambda$26$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.triggerPushNotification("ALERT_24H");
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NotificationsScreen$lambda$28(com.example.ui.viewmodel.QuadraViewModel p1, int p2, androidx.compose.runtime.Composer p3, int p4)
    {
        com.example.ui.screens.NotificationsScreenKt.NotificationsScreen(p1, p3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p2 | 1)));
        return kotlin.Unit.INSTANCE;
    }
}
