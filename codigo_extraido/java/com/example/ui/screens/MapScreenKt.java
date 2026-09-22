package com.example.ui.screens;
public final class MapScreenKt {

    public static final void MapScreen(com.example.ui.viewmodel.QuadraViewModel p13, androidx.compose.runtime.Composer p14, int p15)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "viewModel");
        androidx.compose.runtime.Composer v10 = p14.startRestartGroup(2029238642);
        androidx.compose.runtime.ComposerKt.sourceInformation(v10, "C(MapScreen)55@2470L7,63@2705L13216,57@2483L13438:MapScreen.kt#2thlc2");
        if (((p15 & 1) == 0) && (v10.getSkipping())) {
            v10.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2029238642, p15, -1, "com.example.ui.screens.MapScreen (MapScreen.kt:54)");
            }
            kotlin.jvm.functions.Function1 v9_1;
            androidx.compose.ui.Modifier v1_1 = v10;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v1_1, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            androidx.compose.foundation.layout.PaddingValues v3_1 = v1_1.consume(((androidx.compose.runtime.CompositionLocal) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v1_1);
            androidx.compose.runtime.ScopeUpdateScope v14_8 = ((android.content.Context) v3_1);
            androidx.compose.ui.Modifier v1_3 = androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.graphics.ColorKt.Color(4294441724), 0, 2, 0);
            androidx.compose.foundation.layout.PaddingValues v3_4 = androidx.compose.foundation.layout.PaddingKt.PaddingValues-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v10, 183206098, "CC(remember):MapScreen.kt#9igjgp");
            boolean v0_13 = v10.changedInstance(v14_8);
            int v2_4 = v10;
            int v6_0 = v2_4.rememberedValue();
            if ((!v0_13) && (v6_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v9_1 = v6_0;
            } else {
                v9_1 = new com.example.ui.screens.MapScreenKt$$ExternalSyntheticLambda4(v14_8);
                v2_4.updateRememberedValue(v9_1);
            }
            kotlin.jvm.functions.Function1 v9_3 = ((kotlin.jvm.functions.Function1) v9_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v10);
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(v1_3, 0, v3_4, 0, ((androidx.compose.foundation.layout.Arrangement$Vertical) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)))), 0, 0, 0, v9_3, v10, 24966, 234);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope v14_2 = v10.endRestartGroup();
        if (v14_2 != null) {
            v14_2.updateScope(new com.example.ui.screens.MapScreenKt$$ExternalSyntheticLambda5(p13, p15));
        }
        return;
    }

    static final kotlin.Unit MapScreen$lambda$11$lambda$10(android.content.Context p13, androidx.compose.foundation.lazy.LazyListScope p14)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "$this$LazyColumn");
        androidx.compose.foundation.lazy.LazyListScope.item$default(p14, 0, 0, com.example.ui.screens.ComposableSingletons$MapScreenKt.INSTANCE.getLambda$-1888015610$app(), 3, 0);
        androidx.compose.foundation.lazy.LazyListScope.item$default(p14, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1091960189, 1, new com.example.ui.screens.MapScreenKt$$ExternalSyntheticLambda0(p13))), 3, 0);
        androidx.compose.foundation.lazy.LazyListScope.item$default(p14, 0, 0, com.example.ui.screens.ComposableSingletons$MapScreenKt.INSTANCE.getLambda$198025278$app(), 3, 0);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit MapScreen$lambda$11$lambda$10$lambda$9(android.content.Context p15, androidx.compose.foundation.lazy.LazyItemScope p16, androidx.compose.runtime.Composer p17, int p18)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "$this$item");
        androidx.compose.runtime.ComposerKt.sourceInformation(p17, "C109@4767L40,110@4850L38,112@4955L8472,107@4672L8755:MapScreen.kt#2thlc2");
        if (((p18 & 17) == 16) && (p17.getSkipping())) {
            p17.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1091960189, p18, -1, "com.example.ui.screens.MapScreen.<anonymous>.<anonymous>.<anonymous> (MapScreen.kt:107)");
            }
            androidx.compose.foundation.shape.RoundedCornerShape v14 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 20)));
            androidx.compose.material3.CardColors v10_1 = androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 0, 0, 0, p17, ((androidx.compose.material3.CardDefaults.$stable << 12) | 6), 14);
            androidx.compose.material3.CardElevation v3_5 = androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(((float) 3)), 0, 0, 0, 0, 0, p17, ((androidx.compose.material3.CardDefaults.$stable << 18) | 6), 62);
            kotlin.Unit v0_11 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.material3.CardKt.Card(v0_11, ((androidx.compose.ui.graphics.Shape) v14), v10_1, v3_5, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-256271505, 1, new com.example.ui.screens.MapScreenKt$$ExternalSyntheticLambda3(p15), p17, 54)), p17, 196614, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit MapScreen$lambda$11$lambda$10$lambda$9$lambda$8(android.content.Context p96, androidx.compose.foundation.layout.ColumnScope p97, androidx.compose.runtime.Composer p98, int p99)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p97, "$this$Card");
        androidx.compose.runtime.ComposerKt.sourceInformation(p98, "C113@4973L8440:MapScreen.kt#2thlc2");
        if (((p99 & 17) == 16) && (p98.getSkipping())) {
            p98.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-256271505, p99, -1, "com.example.ui.screens.MapScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapScreen.kt:113)");
            }
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            int v9_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
            androidx.compose.ui.layout.MeasurePolicy v11_3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v9_4, androidx.compose.ui.Alignment.Companion.getStart(), p98, (((0 >> 3) & 14) | ((0 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v16 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p98, 0);
            Integer v2_19 = p98.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v14_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p98, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p98.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p98.startReusableNode();
            if (!p98.getInserting()) {
                p98.useNode();
            } else {
                p98.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            boolean v1_58 = androidx.compose.runtime.Updater.constructor-impl(p98);
            androidx.compose.runtime.Updater.set-impl(v1_58, v11_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_58, v2_19, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v4_59 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v26 = v1_58;
            if ((v26.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v26.rememberedValue(), Integer.valueOf(v16)))) {
                v26.updateRememberedValue(Integer.valueOf(v16));
                v1_58.apply(Integer.valueOf(v16), v4_59);
            }
            androidx.compose.runtime.Updater.set-impl(v1_58, v14_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            androidx.compose.foundation.layout.ColumnScope v27 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -1367677803, "C114@5002L6920,256@11996L1399:MapScreen.kt#2thlc2");
            boolean v1_11 = androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 230))), androidx.compose.ui.graphics.ColorKt.Color(4293060848), 0, 2, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Object v5_8 = androidx.compose.ui.Alignment.Companion.getTopStart();
            int v7_0 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(v5_8, 0);
            int v43 = v5_8;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            kotlin.jvm.functions.Function0 v44 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p98, 0);
            Object v5_12 = p98.getCurrentCompositionLocalMap();
            int v6_2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p98, v1_11);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p98.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p98.startReusableNode();
            if (!p98.getInserting()) {
                p98.useNode();
            } else {
                p98.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            boolean v1_20 = androidx.compose.runtime.Updater.constructor-impl(p98);
            androidx.compose.runtime.Updater.set-impl(v1_20, v7_0, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_20, v5_12, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v4_9 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.material3.ButtonColors v53_0 = v1_20;
            if (v53_0.getInserting()) {
                int v56 = v7_0;
                v53_0.updateRememberedValue(Integer.valueOf(v44));
                v1_20.apply(Integer.valueOf(v44), v4_9);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v53_0.rememberedValue(), Integer.valueOf(v44))) {
                }
            }
            androidx.compose.ui.layout.MeasurePolicy v10_1;
            androidx.compose.runtime.Updater.set-impl(v1_20, v6_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            int v7_6 = ((androidx.compose.foundation.layout.BoxScope) androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE);
            androidx.compose.ui.Modifier v72 = v6_2;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -1615696854, "C121@5400L4054,121@5358L4096,206@9536L1544,238@11164L736:MapScreen.kt#2thlc2");
            androidx.compose.foundation.layout.Arrangement$Vertical v74 = v9_4;
            int v4_16 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -1714688383, "CC(remember):MapScreen.kt#9igjgp");
            kotlin.jvm.functions.Function3 v58 = 0;
            Object v5_23 = p98.rememberedValue();
            if (v5_23 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v10_1 = v5_23;
            } else {
                v10_1 = new com.example.ui.screens.MapScreenKt$$ExternalSyntheticLambda1();
                p98.updateRememberedValue(v10_1);
            }
            androidx.compose.ui.layout.MeasurePolicy v10_2 = ((kotlin.jvm.functions.Function1) v10_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            androidx.compose.foundation.CanvasKt.Canvas(v4_16, v10_2, p98, 54);
            int v4_20 = androidx.compose.foundation.layout.PaddingKt.padding-qDBjuR0$default(v7_6.align(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.Alignment.Companion.getCenter()), 0, 0, 0, androidx.compose.ui.unit.Dp.constructor-impl(((float) 10)), 7, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Object v5_30 = androidx.compose.ui.Alignment.Companion.getTopStart();
            androidx.compose.ui.layout.MeasurePolicy v10_6 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(v5_30, 0);
            int v61 = v5_30;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v62_1 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p98, 0);
            Object v5_33 = p98.getCurrentCompositionLocalMap();
            int v6_6 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p98, v4_20);
            kotlin.jvm.functions.Function0 vtmp59 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function2 v66_0 = vtmp59;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p98.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p98.startReusableNode();
            if (!p98.getInserting()) {
                p98.useNode();
            } else {
                p98.createNode(v66_0);
            }
            int v4_29 = androidx.compose.runtime.Updater.constructor-impl(p98);
            androidx.compose.runtime.Updater.set-impl(v4_29, v10_6, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v4_29, v5_33, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v9_11 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v78 = v4_29;
            if (v78.getInserting()) {
                Integer v81 = v10_6;
                v78.updateRememberedValue(Integer.valueOf(v62_1));
                v4_29.apply(Integer.valueOf(v62_1), v9_11);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v78.rememberedValue(), Integer.valueOf(v62_1))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v4_29, v6_6, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v10 = ((androidx.compose.foundation.layout.BoxScope) androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE);
            int v76 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -1260445949, "C211@9759L1295:MapScreen.kt#2thlc2");
            long v84 = androidx.compose.ui.graphics.ColorKt.Color(4293212469);
            float v89 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 6));
            androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(0, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 20)))), v84, 0, 0, v89, 0, com.example.ui.screens.ComposableSingletons$MapScreenKt.INSTANCE.getLambda$1083785868$app(), p98, 12779904, 89);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            p98.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(v7_6.align(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.Alignment.Companion.getTopEnd()), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)))), androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.Color.Companion.getBlack-0d7_KjU(), 1058642330, 0, 0, 0, 14, 0), 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$MapScreenKt.INSTANCE.getLambda$1979969606$app(), p98, 12583296, 120);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            p98.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            int v4_46 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Integer v2_21 = androidx.compose.ui.Alignment.Companion.getTopStart();
            androidx.compose.ui.layout.MeasurePolicy v10_12 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(v2_21, 0);
            androidx.compose.ui.Alignment v39 = v2_21;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            Integer v2_24 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p98, 0);
            androidx.compose.runtime.CompositionLocalMap v15_1 = p98.getCurrentCompositionLocalMap();
            int v17_1 = v2_24;
            Integer v2_25 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p98, v4_46);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p98, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p98.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p98.startReusableNode();
            if (!p98.getInserting()) {
                p98.useNode();
            } else {
                p98.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            Integer v48_1;
            int v4_52 = androidx.compose.runtime.Updater.constructor-impl(p98);
            androidx.compose.runtime.Updater.set-impl(v4_52, v10_12, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v4_52, v15_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Integer v3_9 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.ui.Modifier v45 = v4_52;
            if (v45.getInserting()) {
                v48_1 = p98;
                v45.updateRememberedValue(Integer.valueOf(v17_1));
                v4_52.apply(Integer.valueOf(v17_1), v3_9);
            } else {
                v48_1 = p98;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v45.rememberedValue(), Integer.valueOf(v17_1))) {
                }
            }
            boolean v1_50;
            androidx.compose.runtime.Updater.set-impl(v4_52, v2_25, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            int v4_53 = v48_1;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_53, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            kotlin.jvm.functions.Function3 v58_3 = v4_53;
            int v23 = 0;
            v45 = v2_25;
            Integer v3_15 = v58_3;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v3_15, 529878178, "C259@12221L48,261@12389L40,258@12108L59,257@12062L1311:MapScreen.kt#2thlc2");
            kotlin.jvm.functions.Function3 v58_4 = androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 0, 0, 0, v58_3, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14);
            androidx.compose.material3.ButtonElevation v54_2 = androidx.compose.material3.ButtonDefaults.INSTANCE.buttonElevation-R_JCAzs(androidx.compose.ui.unit.Dp.constructor-impl(((float) 4)), 0, 0, 0, 0, v3_15, ((androidx.compose.material3.ButtonDefaults.$stable << 15) | 6), 30);
            Integer v20_1 = v4_53;
            androidx.compose.ui.Modifier v50_2 = androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 52)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v3_15, 709829725, "CC(remember):MapScreen.kt#9igjgp");
            boolean v1_48 = v3_15.changedInstance(p96);
            Integer v2_32 = v3_15;
            Object v5_58 = v2_32.rememberedValue();
            if ((!v1_48) && (v5_58 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v1_50 = v5_58;
            } else {
                v1_50 = new com.example.ui.screens.MapScreenKt$$ExternalSyntheticLambda2(p96);
                v2_32.updateRememberedValue(v1_50);
            }
            kotlin.jvm.functions.Function0 v49_4 = ((kotlin.jvm.functions.Function0) v1_50);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v3_15);
            androidx.compose.material3.ButtonKt.Button(v49_4, v50_2, 0, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 14)))), v58_4, v54_2, 0, 0, 0, com.example.ui.screens.ComposableSingletons$MapScreenKt.INSTANCE.getLambda$1301248914$app(), v3_15, 805306416, 452);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v3_15);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v20_1);
            v48_1.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v48_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v48_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v48_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            p98.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p98);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit MapScreen$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7$lambda$3$lambda$1$lambda$0(androidx.compose.ui.graphics.drawscope.DrawScope p35)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p35, "$this$Canvas");
        kotlin.Unit v0_7 = androidx.compose.ui.geometry.Size.getWidth-impl(p35.getSize-NH-jbRc());
        float v16 = androidx.compose.ui.geometry.Size.getHeight-impl(p35.getSize-NH-jbRc());
        float v3_2 = new androidx.compose.ui.graphics.Color[3];
        v3_2[0] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4278220726));
        v3_2[1] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4278228679));
        v3_2[2] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4282960612));
        androidx.compose.ui.graphics.drawscope.DrawScope.drawRect-AsUm42w$default(p35, androidx.compose.ui.graphics.Brush$Companion.verticalGradient-8A-3gB4$default(androidx.compose.ui.graphics.Brush.Companion, kotlin.collections.CollectionsKt.listOf(v3_2), 0, 0, 0, 14, 0), androidx.compose.ui.geometry.OffsetKt.Offset(0, 0), androidx.compose.ui.geometry.SizeKt.Size(v0_7, (v16 * 1054280253)), 0, 0, 0, 0, 120, 0);
        androidx.compose.ui.graphics.drawscope.DrawScope.drawRect-n-J9OG0$default(p35, androidx.compose.ui.graphics.ColorKt.Color(4293779668), androidx.compose.ui.geometry.OffsetKt.Offset(0, (1054280253 * v16)), androidx.compose.ui.geometry.SizeKt.Size(v0_7, (1043878380 * v16)), 0, 0, 0, 0, 120, 0);
        androidx.compose.ui.graphics.drawscope.DrawScope.drawRect-n-J9OG0$default(p35, androidx.compose.ui.graphics.ColorKt.Color(4292269782), androidx.compose.ui.geometry.OffsetKt.Offset(0, (1058642330 * v16)), androidx.compose.ui.geometry.SizeKt.Size(v0_7, (1039516303 * v16)), 0, 0, 0, 0, 120, 0);
        androidx.compose.ui.graphics.drawscope.DrawScope.drawRect-n-J9OG0$default(p35, androidx.compose.ui.graphics.ColorKt.Color(4282865001), androidx.compose.ui.geometry.OffsetKt.Offset(0, (1060655596 * v16)), androidx.compose.ui.geometry.SizeKt.Size(v0_7, (1049582633 * v16)), 0, 0, 0, 0, 120, 0);
        androidx.compose.ui.graphics.drawscope.DrawScope v1_2 = 0;
        while (v1_2 < 11) {
            int v4_15 = androidx.compose.ui.graphics.ColorKt.Color(4294955366);
            int v7_4 = androidx.compose.ui.geometry.OffsetKt.Offset((((float) v1_2) * (v0_7 / 1092616192)), (v16 * 1063004406));
            long v2_13 = androidx.compose.ui.geometry.OffsetKt.Offset(((((float) v1_2) * (v0_7 / 1092616192)) + (v0_7 / 1101004800)), (1063004406 * v16));
            int v17_1 = v1_2;
            androidx.compose.ui.graphics.drawscope.DrawScope.drawLine-NGM6Ib0$default(p35, v4_15, v7_4, v2_13, 1077936128, 0, 0, 0, 0, 0, 496, 0);
            v1_2 = (v17_1 + 1);
        }
        androidx.compose.ui.graphics.drawscope.DrawScope v1_4 = (1057300152 * v0_7);
        long v2_2 = (1050924810 * v16);
        androidx.compose.ui.graphics.drawscope.DrawStyle v8_0 = ((v0_7 - v1_4) / 1073741824);
        int v9_0 = (1055286886 * v16);
        float v20 = v2_2;
        float v22 = v8_0;
        float v19_1 = v9_0;
        float v18_1 = v1_4;
        androidx.compose.ui.graphics.drawscope.DrawScope.drawRoundRect-u-Aw5IA$default(p35, androidx.compose.ui.graphics.ColorKt.Color(4278223759), androidx.compose.ui.geometry.OffsetKt.Offset(v8_0, v9_0), androidx.compose.ui.geometry.SizeKt.Size(v1_4, v2_2), androidx.compose.ui.geometry.CornerRadiusKt.CornerRadius(1098907648, 1098907648), 0, 0, 0, 0, 240, 0);
        androidx.compose.ui.graphics.drawscope.DrawScope.drawRoundRect-u-Aw5IA$default(p35, androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), androidx.compose.ui.geometry.OffsetKt.Offset((v22 + 1090519040), (v19_1 + 1090519040)), androidx.compose.ui.geometry.SizeKt.Size((v18_1 - 1098907648), (v20 - 1098907648)), androidx.compose.ui.geometry.CornerRadiusKt.CornerRadius(1092616192, 1092616192), ((androidx.compose.ui.graphics.drawscope.DrawStyle) new androidx.compose.ui.graphics.drawscope.Stroke(1077936128, 0, 0, 0, 0, 30, 0)), 0, 0, 0, 224, 0);
        long v2_6 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
        int v4_9 = androidx.compose.ui.geometry.OffsetKt.Offset((v22 + (v18_1 / 1073741824)), (v19_1 + 1090519040));
        long v6_6 = androidx.compose.ui.geometry.OffsetKt.Offset((v22 + (v18_1 / 1073741824)), ((v19_1 + v20) - 1090519040));
        androidx.compose.ui.graphics.drawscope.DrawScope.drawLine-NGM6Ib0$default(p35, v2_6, v4_9, v6_6, 1077936128, 0, 0, 0, 0, 0, 496, 0);
        long v2_7 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
        long v5_6 = androidx.compose.ui.geometry.OffsetKt.Offset((v22 + (v18_1 / 1073741824)), (v19_1 + (v20 / 1073741824)));
        int v7_1 = new androidx.compose.ui.graphics.drawscope.Stroke(1077936128, 0, 0, 0, 0, 30, 0);
        androidx.compose.ui.graphics.drawscope.DrawScope.drawCircle-VaOC9Bg$default(p35, v2_7, 1102053376, v5_6, 0, ((androidx.compose.ui.graphics.drawscope.DrawStyle) v7_1), 0, 0, 104, 0);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit MapScreen$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5$lambda$4(android.content.Context p1)
    {
        com.example.util.ExternalIntentsHelper.INSTANCE.openGoogleMapsNavigation(p1);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit MapScreen$lambda$12(com.example.ui.viewmodel.QuadraViewModel p1, int p2, androidx.compose.runtime.Composer p3, int p4)
    {
        com.example.ui.screens.MapScreenKt.MapScreen(p1, p3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p2 | 1)));
        return kotlin.Unit.INSTANCE;
    }
}
