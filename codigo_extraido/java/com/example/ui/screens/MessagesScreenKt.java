package com.example.ui.screens;
public final class MessagesScreenKt {

    public static final void ConversationsListView(java.util.List p21, kotlin.jvm.functions.Function1 p22, androidx.compose.runtime.Composer p23, int p24)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p21, "athletes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p22, "onSelectAthlete");
        androidx.compose.runtime.Composer v13 = p23.startRestartGroup(-520274482);
        androidx.compose.runtime.ComposerKt.sourceInformation(v13, "C(ConversationsListView)93@3823L4165,87@3601L4387:MessagesScreen.kt#2thlc2");
        boolean v4_4 = p24;
        if ((p24 & 6) == 0) {
            int v5_5;
            if (!v13.changedInstance(p21)) {
                v5_5 = 2;
            } else {
                v5_5 = 4;
            }
            v4_4 = (p24 | v5_5);
        }
        if ((p24 & 48) == 0) {
            int v5_8;
            if (!v13.changedInstance(p22)) {
                v5_8 = 16;
            } else {
                v5_8 = 32;
            }
            v4_4 |= v5_8;
        }
        if (((v4_4 & 19) == 18) && (v13.getSkipping())) {
            v13.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-520274482, v4_4, -1, "com.example.ui.screens.ConversationsListView (MessagesScreen.kt:86)");
            }
            androidx.compose.foundation.layout.Arrangement$Vertical v8_1 = 1;
            androidx.compose.runtime.ScopeUpdateScope v3_4 = androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.graphics.ColorKt.Color(4294441724), 0, 2, 0);
            int v5_16 = androidx.compose.foundation.layout.PaddingKt.PaddingValues-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v13, -1767555725, "CC(remember):MessagesScreen.kt#9igjgp");
            boolean vtmp13 = v13.changedInstance(p21);
            if ((v4_4 & 112) != 32) {
                v8_1 = 0;
            }
            int v14_2;
            com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda1 v6_2 = (vtmp13 | v8_1);
            androidx.compose.foundation.layout.Arrangement$Vertical v8_2 = v13;
            int v10_3 = v8_2.rememberedValue();
            if ((v6_2 == null) && (v10_3 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v14_2 = v10_3;
            } else {
                v14_2 = new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda15(p21, p22);
                v8_2.updateRememberedValue(v14_2);
            }
            kotlin.jvm.functions.Function1 v12_1 = ((kotlin.jvm.functions.Function1) v14_2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v13);
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(v3_4, 0, v5_16, 0, ((androidx.compose.foundation.layout.Arrangement$Vertical) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 12)))), 0, 0, 0, v12_1, v13, 24966, 234);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        boolean v4_3 = v13.endRestartGroup();
        if (v4_3) {
            v4_3.updateScope(new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda1(p21, p22, p24));
        }
        return;
    }

    static final kotlin.Unit ConversationsListView$lambda$15$lambda$14(java.util.List p13, kotlin.jvm.functions.Function1 p14, androidx.compose.foundation.lazy.LazyListScope p15)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "$this$LazyColumn");
        androidx.compose.foundation.lazy.LazyListScope.item$default(p15, 0, 0, com.example.ui.screens.ComposableSingletons$MessagesScreenKt.INSTANCE.getLambda$783484770$app(), 3, 0);
        androidx.compose.foundation.lazy.LazyListScope.item$default(p15, 0, 0, com.example.ui.screens.ComposableSingletons$MessagesScreenKt.INSTANCE.getLambda$-1151071271$app(), 3, 0);
        if (!p13.isEmpty()) {
            int v4_0 = p13.size();
            p15.items(v4_0, 0, ((kotlin.jvm.functions.Function1) new com.example.ui.screens.MessagesScreenKt$ConversationsListView$lambda$15$lambda$14$$inlined$items$default$3(((kotlin.jvm.functions.Function1) com.example.ui.screens.MessagesScreenKt$ConversationsListView$lambda$15$lambda$14$$inlined$items$default$1.INSTANCE), p13)), ((kotlin.jvm.functions.Function4) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-632812321, 1, new com.example.ui.screens.MessagesScreenKt$ConversationsListView$lambda$15$lambda$14$$inlined$items$default$4(p13, p14))));
        } else {
            androidx.compose.foundation.lazy.LazyListScope.item$default(p15, 0, 0, com.example.ui.screens.ComposableSingletons$MessagesScreenKt.INSTANCE.getLambda$-1022570243$app(), 3, 0);
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ConversationsListView$lambda$16(java.util.List p1, kotlin.jvm.functions.Function1 p2, int p3, androidx.compose.runtime.Composer p4, int p5)
    {
        com.example.ui.screens.MessagesScreenKt.ConversationsListView(p1, p2, p4, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p3 | 1)));
        return kotlin.Unit.INSTANCE;
    }

    public static final void DirectChatView(com.example.data.model.UserEntity p23, java.util.List p24, String p25, kotlin.jvm.functions.Function0 p26, kotlin.jvm.functions.Function1 p27, androidx.compose.runtime.Composer p28, int p29)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p23, "partner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p24, "messages");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p25, "currentUserId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p26, "onBack");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p27, "onSendMessage");
        boolean v7_4 = p28.startRestartGroup(-1920695186);
        androidx.compose.runtime.ComposerKt.sourceInformation(v7_4, "C(DirectChatView)P(4,1)204@8196L31,207@8260L1608,248@9890L1892,296@11789L3336,206@8233L6892:MessagesScreen.kt#2thlc2");
        kotlin.jvm.functions.Function2 v8_2 = p29;
        if ((p29 & 6) == 0) {
            kotlin.jvm.functions.Function2 v9_7;
            if (!v7_4.changed(p23)) {
                v9_7 = 2;
            } else {
                v9_7 = 4;
            }
            v8_2 = (p29 | v9_7);
        }
        if ((p29 & 48) == 0) {
            kotlin.jvm.functions.Function2 v9_10;
            if (!v7_4.changedInstance(p24)) {
                v9_10 = 16;
            } else {
                v9_10 = 32;
            }
            v8_2 |= v9_10;
        }
        if ((p29 & 384) == 0) {
            kotlin.jvm.functions.Function2 v9_13;
            if (!v7_4.changed(p25)) {
                v9_13 = 128;
            } else {
                v9_13 = 256;
            }
            v8_2 |= v9_13;
        }
        if ((p29 & 3072) == 0) {
            kotlin.jvm.functions.Function2 v9_16;
            if (!v7_4.changedInstance(p26)) {
                v9_16 = 1024;
            } else {
                v9_16 = 2048;
            }
            v8_2 |= v9_16;
        }
        if ((p29 & 24576) == 0) {
            kotlin.jvm.functions.Function2 v9_19;
            if (!v7_4.changedInstance(p27)) {
                v9_19 = 8192;
            } else {
                v9_19 = 16384;
            }
            v8_2 |= v9_19;
        }
        if (((v8_2 & 9363) == 9362) && (v7_4.getSkipping())) {
            v7_4.skipToGroupEnd();
            androidx.compose.runtime.ScopeUpdateScope v19 = v7_4;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1920695186, v8_2, -1, "com.example.ui.screens.DirectChatView (MessagesScreen.kt:203)");
            }
            androidx.compose.runtime.MutableState v0_11;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_4, 1047870093, "CC(remember):MessagesScreen.kt#9igjgp");
            kotlin.jvm.functions.Function2 v9_25 = v7_4;
            int v12_3 = v9_25.rememberedValue();
            if (v12_3 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v0_11 = v12_3;
            } else {
                v0_11 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default("", 0, 2, 0);
                v9_25.updateRememberedValue(v0_11);
            }
            androidx.compose.runtime.MutableState v0_1 = ((androidx.compose.runtime.MutableState) v0_11);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v7_4);
            v19 = v7_4;
            androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-304365270, 1, new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda7(p26, p23), v7_4, 54)), ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-159955575, 1, new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda8(p27, v0_1), v7_4, 54)), 0, 0, 0, 0, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1707625345, 1, new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda9(p24, p23, p25), v7_4, 54)), v19, 805306800, 505);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        boolean v7_2 = v19.endRestartGroup();
        if (v7_2) {
            v7_2.updateScope(new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda10(p23, p24, p25, p26, p27, p29));
        }
        return;
    }

    private static final String DirectChatView$lambda$18(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void DirectChatView$lambda$19(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    static final kotlin.Unit DirectChatView$lambda$23(kotlin.jvm.functions.Function0 p16, com.example.data.model.UserEntity p17, androidx.compose.runtime.Composer p18, int p19)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p18, "C212@8425L1433,208@8274L1584:MessagesScreen.kt#2thlc2");
        if (((p19 & 3) == 2) && (p18.getSkipping())) {
            p18.skipToGroupEnd();
            com.example.data.model.UserEntity v15 = p17;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-304365270, p19, -1, "com.example.ui.screens.DirectChatView.<anonymous> (MessagesScreen.kt:208)");
            }
            long v2_1 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            float v7 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 3));
            kotlin.Unit v0_7 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(v0_7, 0, v2_1, 0, 0, v7, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-324286225, 1, new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda6(p16, p17), p18, 54)), p18, 12779910, 90);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit DirectChatView$lambda$23$lambda$22(kotlin.jvm.functions.Function0 p71, com.example.data.model.UserEntity p72, androidx.compose.runtime.Composer p73, int p74)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p73, "C213@8443L1401:MessagesScreen.kt#2thlc2");
        if (((p74 & 3) == 2) && (p73.getSkipping())) {
            p73.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-324286225, p74, -1, "com.example.ui.screens.DirectChatView.<anonymous>.<anonymous> (MessagesScreen.kt:213)");
            }
            String v1_9 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10)));
            int v3_19 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v8_4 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v3_19, p73, (((390 >> 3) & 14) | ((390 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v14 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p73, 0);
            androidx.compose.runtime.CompositionLocalMap v15 = p73.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v13_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p73, v1_9);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p73.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p73.startReusableNode();
            if (!p73.getInserting()) {
                p73.useNode();
            } else {
                p73.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            Integer v28;
            boolean v0_1 = androidx.compose.runtime.Updater.constructor-impl(p73);
            androidx.compose.runtime.Updater.set-impl(v0_1, v8_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v0_1, v15, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Integer v2_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v25_0 = v0_1;
            if (v25_0.getInserting()) {
                v28 = 390;
                v25_0.updateRememberedValue(Integer.valueOf(v14));
                v0_1.apply(Integer.valueOf(v14), v2_4);
            } else {
                v28 = 390;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v25_0.rememberedValue(), Integer.valueOf(v14))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v0_1, v13_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v4_5 = (((v28 >> 6) & 112) | 6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, -633752144, "C219@8706L299,226@9026L169,231@9216L40,232@9277L549:MessagesScreen.kt#2thlc2");
            androidx.compose.material3.IconButtonKt.IconButton(p71, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$MessagesScreenKt.INSTANCE.getLambda$-384098768$app(), p73, 196608, 30);
            androidx.compose.foundation.layout.RowScope v29_1 = p72.getPhotoUri();
            String vtmp29 = p72.getName();
            com.example.ui.components.CommonComponentsKt.UserAvatarView(v29_1, vtmp29, 40, 0, p73, 384, 8);
            int v35 = v4_5;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10))), p73, 6);
            boolean v0_13 = androidx.compose.foundation.layout.RowScope.weight$default(((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE), ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 1065353216, 0, 2, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Integer v2_16 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
            androidx.compose.ui.layout.MeasurePolicy v5_2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v2_16, androidx.compose.ui.Alignment.Companion.getStart(), p73, (((0 >> 3) & 14) | ((0 >> 3) & 112)));
            androidx.compose.foundation.layout.Arrangement$Vertical v36 = v2_16;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            Integer v2_19 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p73, 0);
            androidx.compose.runtime.CompositionLocalMap v12_0 = p73.getCurrentCompositionLocalMap();
            int v16 = v2_19;
            Integer v2_20 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p73, v0_13);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p73.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p73.startReusableNode();
            if (!p73.getInserting()) {
                p73.useNode();
            } else {
                p73.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            Integer v45;
            String v1_6 = androidx.compose.runtime.Updater.constructor-impl(p73);
            androidx.compose.runtime.Updater.set-impl(v1_6, v5_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_6, v12_0, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            boolean v0_26 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            Integer v42_0 = v1_6;
            if (v42_0.getInserting()) {
                v45 = p73;
                v42_0.updateRememberedValue(Integer.valueOf(v16));
                v1_6.apply(Integer.valueOf(v16), v0_26);
            } else {
                v45 = p73;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v42_0.rememberedValue(), Integer.valueOf(v16))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v1_6, v2_20, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            String v1_7 = v45;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v1_7, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int v4 = (((0 >> 6) & 112) | 6);
            Integer v67 = v1_7;
            androidx.compose.foundation.layout.ColumnScope v39 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            Integer v42_1 = v1_7;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v67, -816734900, "C233@9342L238,239@9605L199:MessagesScreen.kt#2thlc2");
            String v46_0 = p72.getName();
            int v53_0 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long v50_0 = androidx.compose.ui.unit.TextUnitKt.getSp(15);
            long vtmp56 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            androidx.compose.material3.TextKt.Text--4IGK_g(v46_0, 0, vtmp56, v50_0, 0, v53_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v67, 200064, 0, 131026);
            String v46_1 = new StringBuilder().append(p72.getSport()).append(" \u2022 Atleta de Mana\u00edra").toString();
            long v50_1 = androidx.compose.ui.unit.TextUnitKt.getSp(11);
            long vtmp62 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g(v46_1, 0, vtmp62, v50_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v67, 3456, 0, 131058);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v67);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v42_1);
            v45.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v45);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v45);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v45);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p73);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p73);
            p73.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p73);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p73);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p73);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit DirectChatView$lambda$30(kotlin.jvm.functions.Function1 p16, androidx.compose.runtime.MutableState p17, androidx.compose.runtime.Composer p18, int p19)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p18, "C253@10068L1704,249@9904L1868:MessagesScreen.kt#2thlc2");
        if (((p19 & 3) == 2) && (p18.getSkipping())) {
            p18.skipToGroupEnd();
            androidx.compose.runtime.MutableState v15 = p17;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-159955575, p19, -1, "com.example.ui.screens.DirectChatView.<anonymous> (MessagesScreen.kt:249)");
            }
            long v2_1 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            float v7 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 8));
            kotlin.Unit v0_8 = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0));
            androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(v0_8, 0, v2_1, 0, 0, v7, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-179876530, 1, new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda11(p16, p17), p18, 54)), p18, 12779904, 90);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit DirectChatView$lambda$30$lambda$29(kotlin.jvm.functions.Function1 p122, androidx.compose.runtime.MutableState p123, androidx.compose.runtime.Composer p124, int p125)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p124, "C254@10086L1672:MessagesScreen.kt#2thlc2");
        if (((p125 & 3) == 2) && (p124.getSkipping())) {
            p124.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-179876530, p125, -1, "com.example.ui.screens.DirectChatView.<anonymous>.<anonymous> (MessagesScreen.kt:254)");
            }
            androidx.compose.ui.graphics.Shape v3_22 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12)));
            int v5_14 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p124, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v10_4 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v5_14, p124, (((390 >> 3) & 14) | ((390 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p124, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v13_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p124, 0);
            androidx.compose.runtime.CompositionLocalMap v14_1 = p124.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v15 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p124, v3_22);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p124, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p124.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p124.startReusableNode();
            if (!p124.getInserting()) {
                p124.useNode();
            } else {
                p124.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            androidx.compose.ui.graphics.Shape v3_29 = androidx.compose.runtime.Updater.constructor-impl(p124);
            androidx.compose.runtime.Updater.set-impl(v3_29, v10_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v3_29, v14_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            boolean v2_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.RowScope v23_0 = v3_29;
            if ((v23_0.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v23_0.rememberedValue(), Integer.valueOf(v13_2)))) {
                v23_0.updateRememberedValue(Integer.valueOf(v13_2));
                v3_29.apply(Integer.valueOf(v13_2), v2_4);
            }
            androidx.compose.runtime.Updater.set-impl(v3_29, v15, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p124, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p124, -2081749660, "C266@10672L168,262@10421L18,260@10319L599,273@10940L39,276@11047L219,275@11001L739:MessagesScreen.kt#2thlc2");
            String v121 = com.example.ui.screens.MessagesScreenKt.DirectChatView$lambda$18(p123);
            boolean v2_16 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 24)));
            androidx.compose.material3.TextFieldColors v48_1 = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE.colors-0hiis_0(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, androidx.compose.ui.graphics.ColorKt.Color(4278223759), androidx.compose.ui.graphics.Color.Companion.getLightGray-0d7_KjU(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p124, 0, 432, 0, 0, 3072, 2147477503, 4095);
            int v28_1 = androidx.compose.foundation.layout.RowScope.weight$default(((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE), ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 1065353216, 0, 2, 0);
            kotlin.jvm.functions.Function0 v26_2 = v2_16;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p124, 2011058628, "CC(remember):MessagesScreen.kt#9igjgp");
            int v30 = 0;
            androidx.compose.ui.graphics.Shape v3_12 = p124.rememberedValue();
            if (v3_12 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                androidx.compose.runtime.Composer v4 = p124;
            } else {
                androidx.compose.runtime.Composer v32 = v3_12;
                v3_12 = new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda13(p123);
                p124.updateRememberedValue(v3_12);
            }
            boolean v2_21;
            androidx.compose.ui.Modifier v27_6 = ((kotlin.jvm.functions.Function1) v3_12);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p124);
            kotlin.jvm.functions.Function2 vtmp35 = com.example.ui.screens.ComposableSingletons$MessagesScreenKt.INSTANCE.getLambda$-1705255061$app();
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(v121, v27_6, v28_1, 0, 0, 0, 0, vtmp35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, ((androidx.compose.ui.graphics.Shape) v26_2), v48_1, p124, 12582960, 100663296, 0, 1834872);
            int v36 = 390;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))), p124, 6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p124, 2011078861, "CC(remember):MessagesScreen.kt#9igjgp");
            boolean v2_19 = p124.changed(p122);
            float v6_3 = p124.rememberedValue();
            if ((!v2_19) && (v6_3 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v2_21 = v6_3;
            } else {
                v2_21 = new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda14(p122, p123);
                p124.updateRememberedValue(v2_21);
            }
            kotlin.jvm.functions.Function0 v26_6 = ((kotlin.jvm.functions.Function0) v2_21);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p124);
            androidx.compose.material3.IconButtonKt.IconButton(v26_6, androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 48))), ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape())), androidx.compose.ui.graphics.ColorKt.Color(4278223759), 0, 2, 0), 0, 0, 0, com.example.ui.screens.ComposableSingletons$MessagesScreenKt.INSTANCE.getLambda$-239689073$app(), p124, 196608, 28);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p124);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p124);
            p124.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p124);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p124);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p124);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit DirectChatView$lambda$30$lambda$29$lambda$28$lambda$25$lambda$24(androidx.compose.runtime.MutableState p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        com.example.ui.screens.MessagesScreenKt.DirectChatView$lambda$19(p1, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit DirectChatView$lambda$30$lambda$29$lambda$28$lambda$27$lambda$26(kotlin.jvm.functions.Function1 p1, androidx.compose.runtime.MutableState p2)
    {
        if (!kotlin.text.StringsKt.isBlank(((CharSequence) com.example.ui.screens.MessagesScreenKt.DirectChatView$lambda$18(p2)))) {
            p1.invoke(com.example.ui.screens.MessagesScreenKt.DirectChatView$lambda$18(p2));
            com.example.ui.screens.MessagesScreenKt.DirectChatView$lambda$19(p2, "");
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit DirectChatView$lambda$38(java.util.List p20, com.example.data.model.UserEntity p21, String p22, androidx.compose.foundation.layout.PaddingValues p23, androidx.compose.runtime.Composer p24, int p25)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p23, "innerPadding");
        androidx.compose.runtime.ComposerKt.sourceInformation(p24, "C304@12099L3020,297@11815L3304:MessagesScreen.kt#2thlc2");
        boolean v4_3 = p25;
        if ((p25 & 6) == 0) {
            int v5_3;
            if (!p24.changed(p23)) {
                v5_3 = 2;
            } else {
                v5_3 = 4;
            }
            v4_3 = (p25 | v5_3);
        }
        if (((v4_3 & 19) == 18) && (p24.getSkipping())) {
            p24.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1707625345, v4_3, -1, "com.example.ui.screens.DirectChatView.<anonymous> (MessagesScreen.kt:297)");
            }
            int v15_3;
            int v5_12 = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.graphics.ColorKt.Color(4294047225), 0, 2, 0), p23);
            androidx.compose.foundation.layout.PaddingValues v6_5 = androidx.compose.foundation.layout.PaddingKt.PaddingValues-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p24, -350436533, "CC(remember):MessagesScreen.kt#9igjgp");
            int v7_9 = ((p24.changedInstance(p20) | p24.changed(p21)) | p24.changed(p22));
            int v11_2 = p24.rememberedValue();
            if ((v7_9 == 0) && (v11_2 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v15_3 = v11_2;
            } else {
                v15_3 = new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda12(p20, p21, p22);
                p24.updateRememberedValue(v15_3);
            }
            kotlin.jvm.functions.Function1 v12_1 = ((kotlin.jvm.functions.Function1) v15_3);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p24);
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(v5_12, 0, v6_5, 0, ((androidx.compose.foundation.layout.Arrangement$Vertical) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)))), 0, 0, 0, v12_1, p24, 24960, 234);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit DirectChatView$lambda$38$lambda$37$lambda$36(java.util.List p10, com.example.data.model.UserEntity p11, String p12, androidx.compose.foundation.lazy.LazyListScope p13)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "$this$LazyColumn");
        if (!p10.isEmpty()) {
            int v6_0 = p10.size();
            p13.items(v6_0, 0, ((kotlin.jvm.functions.Function1) new com.example.ui.screens.MessagesScreenKt$DirectChatView$lambda$38$lambda$37$lambda$36$$inlined$items$default$3(((kotlin.jvm.functions.Function1) com.example.ui.screens.MessagesScreenKt$DirectChatView$lambda$38$lambda$37$lambda$36$$inlined$items$default$1.INSTANCE), p10)), ((kotlin.jvm.functions.Function4) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-632812321, 1, new com.example.ui.screens.MessagesScreenKt$DirectChatView$lambda$38$lambda$37$lambda$36$$inlined$items$default$4(p10, p12))));
        } else {
            androidx.compose.foundation.lazy.LazyListScope.item$default(p13, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1638661842, 1, new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda0(p11))), 3, 0);
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit DirectChatView$lambda$38$lambda$37$lambda$36$lambda$33(com.example.data.model.UserEntity p71, androidx.compose.foundation.lazy.LazyItemScope p72, androidx.compose.runtime.Composer p73, int p74)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p72, "$this$item");
        androidx.compose.runtime.ComposerKt.sourceInformation(p73, "C307@12182L930:MessagesScreen.kt#2thlc2");
        if (((p74 & 17) == 16) && (p73.getSkipping())) {
            p73.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1638661842, p74, -1, "com.example.ui.screens.DirectChatView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessagesScreen.kt:307)");
            }
            androidx.compose.ui.text.font.FontWeight$Companion v1_25 = androidx.compose.foundation.layout.PaddingKt.padding-qDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), 0, androidx.compose.ui.unit.Dp.constructor-impl(((float) 40)), 0, 0, 13, 0);
            int v4_15 = androidx.compose.ui.Alignment.Companion.getCenter();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v9_2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(v4_15, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v15 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p73, 0);
            androidx.compose.runtime.CompositionLocalMap v14_1 = p73.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v12_2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p73, v1_25);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p73.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p73.startReusableNode();
            if (!p73.getInserting()) {
                p73.useNode();
            } else {
                p73.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            boolean v0_34 = androidx.compose.runtime.Updater.constructor-impl(p73);
            androidx.compose.runtime.Updater.set-impl(v0_34, v9_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v0_34, v14_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            StringBuilder v2_3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v25 = v0_34;
            if ((v25.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v25.rememberedValue(), Integer.valueOf(v15)))) {
                v25.updateRememberedValue(Integer.valueOf(v15));
                v0_34.apply(Integer.valueOf(v15), v2_3);
            }
            androidx.compose.runtime.Updater.set-impl(v0_34, v12_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            androidx.compose.foundation.layout.BoxScope v26 = ((androidx.compose.foundation.layout.BoxScope) androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, 385149183, "C313@12434L656:MessagesScreen.kt#2thlc2");
            boolean v0_8 = androidx.compose.ui.Alignment.Companion.getCenterHorizontally();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v5_1 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), v0_8, p73, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            androidx.compose.ui.Alignment$Horizontal v36 = v0_8;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            boolean v0_11 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p73, 0);
            androidx.compose.runtime.CompositionLocalMap v13_0 = p73.getCurrentCompositionLocalMap();
            int v16 = v0_11;
            boolean v0_12 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p73, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p73, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p73.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p73.startReusableNode();
            if (!p73.getInserting()) {
                p73.useNode();
            } else {
                p73.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            Integer v44;
            StringBuilder v2_17 = androidx.compose.runtime.Updater.constructor-impl(p73);
            androidx.compose.runtime.Updater.set-impl(v2_17, v5_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v2_17, v13_0, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.ui.text.font.FontWeight$Companion v1_14 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.ColumnScope v41 = v2_17;
            if (v41.getInserting()) {
                v44 = p73;
                v41.updateRememberedValue(Integer.valueOf(v16));
                v2_17.apply(Integer.valueOf(v16), v1_14);
            } else {
                v44 = p73;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v41.rememberedValue(), Integer.valueOf(v16))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v2_17, v0_12, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            StringBuilder v2_18 = v44;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_18, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            Integer v66 = v2_18;
            int v38 = 0;
            int v42 = (((((((384 << 3) & 112) << 6) & 896) | 6) >> 6) & 14);
            Integer v70 = v2_18;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_18, -1940156580, "C314@12523L205,319@12757L307:MessagesScreen.kt#2thlc2");
            androidx.compose.material3.TextKt.Text--4IGK_g("Nenhuma mensagem anterior.", 0, androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(13), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v66, 3462, 0, 131058);
            androidx.compose.material3.TextKt.Text--4IGK_g(new StringBuilder().append("Diga um ol\u00e1 para ").append(p71.getName()).append(" e combine uma partida!").toString(), 0, androidx.compose.ui.graphics.ColorKt.Color(4278220697), androidx.compose.ui.unit.TextUnitKt.getSp(13), 0, androidx.compose.ui.text.font.FontWeight.Companion.getSemiBold(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v66, 200064, 0, 131026);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v66);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v70);
            v44.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v44);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v44);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v44);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p73);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p73);
            p73.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p73);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p73);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p73);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit DirectChatView$lambda$39(com.example.data.model.UserEntity p8, java.util.List p9, String p10, kotlin.jvm.functions.Function0 p11, kotlin.jvm.functions.Function1 p12, int p13, androidx.compose.runtime.Composer p14, int p15)
    {
        com.example.ui.screens.MessagesScreenKt.DirectChatView(p8, p9, p10, p11, p12, p14, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p13 | 1)));
        return kotlin.Unit.INSTANCE;
    }

    public static final void MessagesScreen(com.example.ui.viewmodel.QuadraViewModel p21, androidx.compose.runtime.Composer p22, int p23)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p21, "viewModel");
        androidx.compose.runtime.Composer v8 = p22.startRestartGroup(-2004278192);
        androidx.compose.runtime.ComposerKt.sourceInformation(v8, "C(MessagesScreen)59@2641L16,60@2697L16,61@2759L16,62@2835L16:MessagesScreen.kt#2thlc2");
        int v3_0 = p23;
        if ((p23 & 6) == 0) {
            int v4_4;
            if (!v8.changedInstance(p21)) {
                v4_4 = 2;
            } else {
                v4_4 = 4;
            }
            v3_0 = (p23 | v4_4);
        }
        int v10 = v3_0;
        if (((v10 & 3) == 2) && (v8.getSkipping())) {
            v8.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2004278192, v10, -1, "com.example.ui.screens.MessagesScreen (MessagesScreen.kt:58)");
            }
            com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda3 v2_16 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p21.getSelectedChatUser(), 0, v8, 0, 1);
            androidx.compose.runtime.State v11 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p21.getAllUsers(), 0, v8, 0, 1);
            androidx.compose.runtime.State v12 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p21.getCurrentUser(), 0, v8, 0, 1);
            androidx.compose.runtime.State v13 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p21.getActiveChatMessages(), 0, v8, 0, 1);
            if (com.example.ui.screens.MessagesScreenKt.MessagesScreen$lambda$0(v2_16) == null) {
                v8.startReplaceGroup(-815561892);
                androidx.compose.runtime.ComposerKt.sourceInformation(v8, "77@3414L46,75@3292L178");
                com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda3 v2_2 = ((Iterable) com.example.ui.screens.MessagesScreenKt.MessagesScreen$lambda$1(v11));
                kotlin.jvm.functions.Function1 v7_8 = ((java.util.Collection) new java.util.ArrayList());
                int v15_1 = v2_2.iterator();
                while (v15_1.hasNext()) {
                    com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda3 v2_0;
                    String v19_1;
                    int v3_2 = v15_1.next();
                    int v4_1 = ((com.example.data.model.UserEntity) v3_2).getId();
                    String v19_0 = com.example.ui.screens.MessagesScreenKt.MessagesScreen$lambda$2(v12);
                    if (v19_0 == null) {
                        v19_1 = v2_2;
                        v2_0 = 0;
                    } else {
                        v19_1 = v2_2;
                        v2_0 = v19_0.getId();
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(v4_1, v2_0)) {
                        v7_8.add(v3_2);
                    }
                    v2_2 = v19_1;
                    int v4 = 0;
                }
                Object v14_2;
                com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda3 v2_22 = ((java.util.List) v7_8);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v8, -1965965410, "CC(remember):MessagesScreen.kt#9igjgp");
                int v3_16 = v8.changedInstance(p21);
                int v4_7 = v8;
                Object v6_6 = v4_7.rememberedValue();
                if ((v3_16 == 0) && (v6_6 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v14_2 = v6_6;
                } else {
                    v14_2 = new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda4(p21);
                    v4_7.updateRememberedValue(v14_2);
                }
                Object v14_0 = ((kotlin.jvm.functions.Function1) v14_2);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v8);
                com.example.ui.screens.MessagesScreenKt.ConversationsListView(v2_22, v14_0, v8, 0);
                v8.endReplaceGroup();
            } else {
                int v5_2;
                v8.startReplaceGroup(-815899327);
                androidx.compose.runtime.ComposerKt.sourceInformation(v8, "70@3114L25,71@3169L39,66@2941L277");
                int v3_5 = com.example.ui.screens.MessagesScreenKt.MessagesScreen$lambda$0(v2_16);
                kotlin.jvm.internal.Intrinsics.checkNotNull(v3_5);
                int v4_2 = com.example.ui.screens.MessagesScreenKt.MessagesScreen$lambda$3(v13);
                int v5_1 = com.example.ui.screens.MessagesScreenKt.MessagesScreen$lambda$2(v12);
                if (v5_1 == 0) {
                    v5_2 = "";
                } else {
                    v5_2 = v5_1.getId();
                    if (v5_2 == 0) {
                    }
                }
                com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda3 v2_4;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v8, -1965975031, "CC(remember):MessagesScreen.kt#9igjgp");
                kotlin.jvm.functions.Function1 v7_1 = v8.changedInstance(p21);
                int v9_0 = v8;
                int v15_0 = v9_0.rememberedValue();
                if ((v7_1 == null) && (v15_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v2_4 = v15_0;
                } else {
                    v2_4 = new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda2(p21);
                    v9_0.updateRememberedValue(v2_4);
                }
                Object v17_3;
                com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda3 v2_9;
                com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda3 v2_7 = ((kotlin.jvm.functions.Function0) v2_4);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v8);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v8, -1965973257, "CC(remember):MessagesScreen.kt#9igjgp");
                Object v6_0 = v8.changedInstance(p21);
                kotlin.jvm.functions.Function1 v7_3 = v8;
                Object v14_1 = v7_3.rememberedValue();
                if (v6_0 != null) {
                    v17_3 = v2_7;
                    v2_9 = new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda3(p21);
                    v7_3.updateRememberedValue(v2_9);
                } else {
                    v17_3 = v2_7;
                    if (v14_1 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                        v2_9 = v14_1;
                    }
                }
                kotlin.jvm.functions.Function1 v7_5 = ((kotlin.jvm.functions.Function1) v2_9);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v8);
                com.example.ui.screens.MessagesScreenKt.DirectChatView(v3_5, v4_2, v5_2, v17_3, v7_5, v8, 0);
                v8.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda3 v2_14 = v8.endRestartGroup();
        if (v2_14 != null) {
            v2_14.updateScope(new com.example.ui.screens.MessagesScreenKt$$ExternalSyntheticLambda5(p21, p23));
        }
        return;
    }

    private static final com.example.data.model.UserEntity MessagesScreen$lambda$0(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((com.example.data.model.UserEntity) p4.getValue());
    }

    private static final java.util.List MessagesScreen$lambda$1(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((java.util.List) p4.getValue());
    }

    static final kotlin.Unit MessagesScreen$lambda$10$lambda$9(com.example.ui.viewmodel.QuadraViewModel p1, com.example.data.model.UserEntity p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "athlete");
        p1.openChatWith(p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit MessagesScreen$lambda$11(com.example.ui.viewmodel.QuadraViewModel p1, int p2, androidx.compose.runtime.Composer p3, int p4)
    {
        com.example.ui.screens.MessagesScreenKt.MessagesScreen(p1, p3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p2 | 1)));
        return kotlin.Unit.INSTANCE;
    }

    private static final com.example.data.model.UserEntity MessagesScreen$lambda$2(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((com.example.data.model.UserEntity) p4.getValue());
    }

    private static final java.util.List MessagesScreen$lambda$3(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((java.util.List) p4.getValue());
    }

    static final kotlin.Unit MessagesScreen$lambda$5$lambda$4(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.closeChat();
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit MessagesScreen$lambda$7$lambda$6(com.example.ui.viewmodel.QuadraViewModel p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "text");
        p1.sendMessage(p2);
        return kotlin.Unit.INSTANCE;
    }
}
