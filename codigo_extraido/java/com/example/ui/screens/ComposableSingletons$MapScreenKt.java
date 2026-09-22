package com.example.ui.screens;
public final class ComposableSingletons$MapScreenKt {
    public static final com.example.ui.screens.ComposableSingletons$MapScreenKt INSTANCE;
    private static kotlin.jvm.functions.Function3 lambda$-1150206416;
    private static kotlin.jvm.functions.Function3 lambda$-1888015610;
    private static kotlin.jvm.functions.Function2 lambda$1083785868;
    private static kotlin.jvm.functions.Function3 lambda$1122868600;
    private static kotlin.jvm.functions.Function3 lambda$1301248914;
    private static kotlin.jvm.functions.Function2 lambda$1979969606;
    private static kotlin.jvm.functions.Function3 lambda$198025278;

    static ComposableSingletons$MapScreenKt()
    {
        com.example.ui.screens.ComposableSingletons$MapScreenKt.INSTANCE = new com.example.ui.screens.ComposableSingletons$MapScreenKt();
        com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$1122868600 = ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1122868600, 0, new com.example.ui.screens.ComposableSingletons$MapScreenKt$$ExternalSyntheticLambda0()));
        com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$-1888015610 = ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1888015610, 0, new com.example.ui.screens.ComposableSingletons$MapScreenKt$$ExternalSyntheticLambda1()));
        com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$1083785868 = ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1083785868, 0, new com.example.ui.screens.ComposableSingletons$MapScreenKt$$ExternalSyntheticLambda2()));
        com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$1979969606 = ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1979969606, 0, new com.example.ui.screens.ComposableSingletons$MapScreenKt$$ExternalSyntheticLambda3()));
        com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$1301248914 = ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1301248914, 0, new com.example.ui.screens.ComposableSingletons$MapScreenKt$$ExternalSyntheticLambda4()));
        com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$-1150206416 = ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1150206416, 0, new com.example.ui.screens.ComposableSingletons$MapScreenKt$$ExternalSyntheticLambda5()));
        com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$198025278 = ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(198025278, 0, new com.example.ui.screens.ComposableSingletons$MapScreenKt$$ExternalSyntheticLambda6()));
        return;
    }

    public ComposableSingletons$MapScreenKt()
    {
        return;
    }

    static final kotlin.Unit lambda_1083785868$lambda$5(androidx.compose.runtime.Composer p51, int p52)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p51, "C216@10013L1011:MapScreen.kt#2thlc2");
        if (((p52 & 3) == 2) && (p51.getSkipping())) {
            p51.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1083785868, p52, -1, "com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$1083785868.<anonymous> (MapScreen.kt:216)");
            }
            int v1_16 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            float v3_10 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10)), androidx.compose.ui.unit.Dp.constructor-impl(((float) 6)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p51, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v8_4 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v1_16, p51, (((390 >> 3) & 14) | ((390 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p51, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v11_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p51, 0);
            androidx.compose.runtime.CompositionLocalMap v12_1 = p51.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v13 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p51, v3_10);
            kotlin.jvm.functions.Function0 v14_1 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p51, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p51.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p51.startReusableNode();
            if (!p51.getInserting()) {
                p51.useNode();
            } else {
                p51.createNode(v14_1);
            }
            boolean v0_25 = androidx.compose.runtime.Updater.constructor-impl(p51);
            androidx.compose.runtime.Updater.set-impl(v0_25, v8_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v0_25, v12_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v1_3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.RowScope v21 = v0_25;
            if ((v21.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v21.rememberedValue(), Integer.valueOf(v11_2)))) {
                v21.updateRememberedValue(Integer.valueOf(v11_2));
                v0_25.apply(Integer.valueOf(v11_2), v1_3);
            }
            androidx.compose.runtime.Updater.set-impl(v0_25, v13, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p51, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            v21 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p51, 1083464240, "C220@10275L303,226@10615L39,227@10691L299:MapScreen.kt#2thlc2");
            String v24_0 = androidx.compose.material.icons.filled.PlaceKt.getPlace(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            long v27 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            long v26_0 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v24_0, 0, v26_0, v27, p51, 3504, 0);
            int v50 = (((390 >> 6) & 112) | 6);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 4))), p51, 6);
            long v26_1 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            androidx.compose.ui.text.font.FontWeight v31_1 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long vtmp35 = androidx.compose.ui.unit.TextUnitKt.getSp(12);
            androidx.compose.material3.TextKt.Text--4IGK_g("Quadra de Mana\u00edra", 0, v26_1, vtmp35, 0, v31_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p51, 200070, 0, 131026);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p51);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p51);
            p51.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p51);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p51);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p51);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit lambda_1122868600$lambda$2(androidx.compose.foundation.layout.ColumnScope p83, androidx.compose.runtime.Composer p84, int p85)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p83, "$this$Card");
        androidx.compose.runtime.ComposerKt.sourceInformation(p84, "C72@3064L1504:MapScreen.kt#2thlc2");
        if (((p85 & 17) == 16) && (p84.getSkipping())) {
            p84.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1122868600, p85, -1, "com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$1122868600.<anonymous> (MapScreen.kt:72)");
            }
            int v1_19 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p84, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v9_3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), p84, (((6 >> 3) & 14) | ((6 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p84, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v15 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p84, 0);
            androidx.compose.runtime.CompositionLocalMap v14_1 = p84.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v12_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p84, v1_19);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p84, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p84.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p84.startReusableNode();
            if (!p84.getInserting()) {
                p84.useNode();
            } else {
                p84.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            boolean v0_49 = androidx.compose.runtime.Updater.constructor-impl(p84);
            androidx.compose.runtime.Updater.set-impl(v0_49, v9_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v0_49, v14_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v2_2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.ColumnScope v26 = v0_49;
            if ((v26.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v26.rememberedValue(), Integer.valueOf(v15)))) {
                v26.updateRememberedValue(Integer.valueOf(v15));
                v0_49.apply(Integer.valueOf(v15), v2_2);
            }
            androidx.compose.runtime.Updater.set-impl(v0_49, v12_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p84, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            v26 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p84, -1767565272, "C73@3129L717,88@3867L40,89@3928L308,95@4257L40,96@4318L232:MapScreen.kt#2thlc2");
            boolean v0_8 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p84, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v6_1 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v0_8, p84, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            long v33 = v0_8;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p84, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            boolean v0_11 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p84, 0);
            androidx.compose.runtime.CompositionLocalMap v13_0 = p84.getCurrentCompositionLocalMap();
            int v16 = v0_11;
            boolean v0_12 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p84, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            kotlin.jvm.functions.Function0 vtmp31 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            int v35_0 = vtmp31;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p84, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p84.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p84.startReusableNode();
            if (!p84.getInserting()) {
                p84.useNode();
            } else {
                p84.createNode(v35_0);
            }
            int v41_0;
            int v2_16 = androidx.compose.runtime.Updater.constructor-impl(p84);
            androidx.compose.runtime.Updater.set-impl(v2_16, v6_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v2_16, v13_0, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v1_14 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            long v38_0 = v2_16;
            if (v38_0.getInserting()) {
                v41_0 = p84;
                v38_0.updateRememberedValue(Integer.valueOf(v16));
                v2_16.apply(Integer.valueOf(v16), v1_14);
            } else {
                v41_0 = p84;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v38_0.rememberedValue(), Integer.valueOf(v16))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v2_16, v0_12, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            int v2_17 = v41_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_17, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v47_0 = v2_17;
            int v35 = 0;
            int v39 = (((((((384 << 3) & 112) << 6) & 896) | 6) >> 6) & 14);
            androidx.compose.runtime.Composer v50_1 = v2_17;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_17, 433971304, "C74@3207L268,80@3500L39,81@3564L260:MapScreen.kt#2thlc2");
            long v42_0 = androidx.compose.material.icons.filled.LocationOnKt.getLocationOn(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            int v45_0 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
            int v44_0 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 24)));
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v42_0, 0, v44_0, v45_0, v47_0, 3504, 0);
            int v2_19 = v47_0;
            int v43 = 0;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))), v2_19, 6);
            long v62 = androidx.compose.ui.unit.TextUnitKt.getSp(18);
            androidx.compose.ui.text.font.FontWeight v65 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long vtmp54 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            Integer v79 = v2_19;
            androidx.compose.material3.TextKt.Text--4IGK_g("Localiza\u00e7\u00e3o da Quadra de Mana\u00edra", 0, vtmp54, v62, 0, v65, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v79, 200070, 0, 131026);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v79);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v50_1);
            v41_0.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v41_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v41_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v41_0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 6))), p84, 6);
            long v33_0 = androidx.compose.ui.unit.TextUnitKt.getSp(13);
            long v31_1 = androidx.compose.ui.graphics.Color.Companion.getDarkGray-0d7_KjU();
            long vtmp59 = androidx.compose.ui.unit.TextUnitKt.getSp(18);
            androidx.compose.material3.TextKt.Text--4IGK_g("Orla da Praia de Mana\u00edra \u2022 Av. Gov. Fl\u00e1vio Ribeiro Coutinho / Av. Jo\u00e3o Maur\u00edcio\nJo\u00e3o Pessoa - PB \u2022 CEP 58038-000", 0, v31_1, v33_0, 0, 0, 0, 0, 0, 0, vtmp59, 0, 0, 0, 0, 0, 0, p84, 3462, 6, 130034);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 6))), p84, 6);
            long v33_1 = androidx.compose.ui.unit.TextUnitKt.getSp(11);
            long vtmp63 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g("Coordenadas: -7.0982, -34.8315", 0, vtmp63, v33_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p84, 3456, 0, 131058);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p84);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p84);
            p84.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p84);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p84);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p84);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit lambda_1301248914$lambda$7(androidx.compose.foundation.layout.RowScope p27, androidx.compose.runtime.Composer p28, int p29)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p27, "$this$Button");
        androidx.compose.runtime.ComposerKt.sourceInformation(p28, "C266@12630L291,272@12950L40,273@13019L328:MapScreen.kt#2thlc2");
        if (((p29 & 17) == 16) && (p28.getSkipping())) {
            p28.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1301248914, p29, -1, "com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$1301248914.<anonymous> (MapScreen.kt:266)");
            }
            kotlin.Unit v0_6 = androidx.compose.material.icons.filled.DirectionsKt.getDirections(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            float v3_0 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            long v2_3 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 24)));
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v0_6, "Como Chegar", v2_3, v3_0, p28, 3504, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10))), p28, 6);
            kotlin.Unit v0_11 = androidx.compose.ui.unit.TextUnitKt.getSp(16);
            androidx.compose.ui.text.font.FontWeight v7_2 = androidx.compose.ui.text.font.FontWeight.Companion.getExtraBold();
            long v2_6 = androidx.compose.ui.unit.TextUnitKt.getSp(4602678819172646912);
            long vtmp13 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g("COMO CHEGAR (GOOGLE MAPS)", 0, vtmp13, v0_11, 0, v7_2, 0, v2_6, 0, 0, 0, 0, 0, 0, 0, 0, 0, p28, 12782982, 0, 130898);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit lambda_1979969606$lambda$6(androidx.compose.runtime.Composer p27, int p28)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p27, "C245@11512L362:MapScreen.kt#2thlc2");
        if (((p28 & 3) == 2) && (p27.getSkipping())) {
            p27.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1979969606, p28, -1, "com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$1979969606.<anonymous> (MapScreen.kt:245)");
            }
            long v4_1 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            long v6 = androidx.compose.ui.unit.TextUnitKt.getSp(11);
            androidx.compose.ui.text.font.FontWeight v9 = androidx.compose.ui.text.font.FontWeight.Companion.getSemiBold();
            androidx.compose.ui.Modifier v3_3 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)), androidx.compose.ui.unit.Dp.constructor-impl(((float) 4)));
            androidx.compose.material3.TextKt.Text--4IGK_g("\u1f30a Praia de Mana\u00edra", v3_3, v4_1, v6, 0, v9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p27, 200118, 0, 131024);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit lambda_198025278$lambda$14(androidx.compose.foundation.lazy.LazyItemScope p14, androidx.compose.runtime.Composer p15, int p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "$this$item");
        androidx.compose.runtime.ComposerKt.sourceInformation(p15, "C290@13608L40,291@13691L38,288@13513L2392:MapScreen.kt#2thlc2");
        if (((p16 & 17) == 16) && (p15.getSkipping())) {
            p15.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(198025278, p16, -1, "com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$198025278.<anonymous> (MapScreen.kt:288)");
            }
            kotlin.Unit v1_6 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 18)));
            androidx.compose.material3.CardColors v12_1 = androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 0, 0, 0, p15, ((androidx.compose.material3.CardDefaults.$stable << 12) | 6), 14);
            androidx.compose.material3.CardElevation v5_5 = androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(((float) 2)), 0, 0, 0, 0, 0, p15, ((androidx.compose.material3.CardDefaults.$stable << 18) | 6), 62);
            androidx.compose.ui.Modifier vtmp9 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.material3.CardKt.Card(vtmp9, ((androidx.compose.ui.graphics.Shape) v1_6), v12_1, v5_5, 0, com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$-1150206416, p15, 196614, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit lambda__1150206416$lambda$13(androidx.compose.foundation.layout.ColumnScope p113, androidx.compose.runtime.Composer p114, int p115)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p113, "$this$Card");
        androidx.compose.runtime.ComposerKt.sourceInformation(p114, "C294@13814L2077:MapScreen.kt#2thlc2");
        if (((p115 & 17) == 16) && (p114.getSkipping())) {
            p114.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1150206416, p115, -1, "com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$-1150206416.<anonymous> (MapScreen.kt:294)");
            }
            String v1_6 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            int v7_1 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p114, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v12_3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), p114, (((6 >> 3) & 14) | ((6 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p114, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v19 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p114, 0);
            int v20_0 = 0;
            androidx.compose.runtime.CompositionLocalMap v8_2 = p114.getCurrentCompositionLocalMap();
            androidx.compose.runtime.Composer v4_30 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p114, v1_6);
            String v1_13 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p114, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p114.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p114.startReusableNode();
            if (!p114.getInserting()) {
                p114.useNode();
            } else {
                p114.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            boolean v0_18 = androidx.compose.runtime.Updater.constructor-impl(p114);
            androidx.compose.runtime.Updater.set-impl(v0_18, v12_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v0_18, v8_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            boolean v2_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v28_0 = v0_18;
            if ((v28_0.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v28_0.rememberedValue(), Integer.valueOf(v19)))) {
                v28_0.updateRememberedValue(Integer.valueOf(v19));
                v0_18.apply(Integer.valueOf(v19), v2_4);
            }
            androidx.compose.runtime.Updater.set-impl(v0_18, v4_30, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            boolean v0_3 = "C88@4444L9:Column.kt#2w3rfo";
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p114, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            androidx.compose.foundation.layout.ColumnScope v27 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            int v29 = 0;
            androidx.compose.runtime.CompositionLocalMap v3_5 = p114;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p114, 509392723, "C295@13879L231,301@14131L41:MapScreen.kt#2thlc2");
            int v35 = androidx.compose.ui.unit.TextUnitKt.getSp(16);
            int v38_0 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long v33 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            androidx.compose.material3.TextKt.Text--4IGK_g("Infraestrutura do Local", 0, v33, v35, 0, v38_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p114, 200070, 0, 131026);
            androidx.compose.ui.Modifier v31 = v4_30;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), p114, 6);
            boolean v2_15 = new kotlin.Triple[4];
            Object v16_0 = v2_15;
            v16_0[0] = new kotlin.Triple(androidx.compose.material.icons.filled.SportsKt.getSports(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), "Quadra Poliesportiva", "Demarca\u00e7\u00f5es para Futsal, Basquete e espa\u00e7o adjacente para V\u00f4lei de praia");
            v16_0[1] = new kotlin.Triple(androidx.compose.material.icons.filled.LightbulbKt.getLightbulb(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), "Ilumina\u00e7\u00e3o Noturna em LED", "Funcionamento at\u00e9 \u00e0s 22h com \u00f3tima visibilidade para rachas");
            v16_0[2] = new kotlin.Triple(androidx.compose.material.icons.filled.LocalDrinkKt.getLocalDrink(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), "Ponto de Hidrata\u00e7\u00e3o", "Bebedouros e quiosques pr\u00f3ximos ao cal\u00e7ad\u00e3o");
            v16_0[3] = new kotlin.Triple(androidx.compose.material.icons.filled.CheckKt.getCheck(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), "Acesso Gratuito e P\u00fablico", "Espa\u00e7o de esporte e lazer comunit\u00e1rio de Jo\u00e3o Pessoa");
            boolean v2_23 = kotlin.collections.CollectionsKt.listOf(v16_0);
            p114.startReplaceGroup(847745528);
            androidx.compose.runtime.ComposerKt.sourceInformation(p114, "*311@14888L963");
            androidx.compose.runtime.Composer v4_18 = ((Iterable) v2_23);
            androidx.compose.ui.layout.MeasurePolicy v5_15 = 0;
            java.util.Iterator v6_5 = v4_18.iterator();
            while (v6_5.hasNext()) {
                String v34_1 = ((kotlin.Triple) v6_5.next());
                androidx.compose.ui.graphics.vector.ImageVector v37_2 = ((androidx.compose.ui.graphics.vector.ImageVector) v34_1.component1());
                String v61_1 = ((String) v34_1.component2());
                String v34_3 = ((String) v34_1.component3());
                boolean v45 = v2_23;
                androidx.compose.runtime.CompositionLocalMap v52_2 = v3_5;
                androidx.compose.runtime.Composer v46_1 = v4_18;
                androidx.compose.ui.layout.MeasurePolicy v36_3 = v5_15;
                java.util.Iterator v47_1 = v6_5;
                boolean v2_26 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, androidx.compose.ui.unit.Dp.constructor-impl(((float) 6)), 1, 0);
                androidx.compose.runtime.Composer v4_21 = v52_2;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_21, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                androidx.compose.runtime.CompositionLocalMap v3_11 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart();
                androidx.compose.ui.layout.MeasurePolicy v5_21 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v3_11, androidx.compose.ui.Alignment.Companion.getTop(), v4_21, (((6 >> 3) & 14) | ((6 >> 3) & 112)));
                androidx.compose.foundation.layout.Arrangement$Horizontal v53 = v3_11;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_21, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int v54_1 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v4_21, v20_0);
                androidx.compose.runtime.CompositionLocalMap v3_14 = v4_21.getCurrentCompositionLocalMap();
                java.util.Iterator v6_11 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v4_21, v2_26);
                kotlin.jvm.functions.Function0 vtmp53 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                kotlin.jvm.functions.Function0 v88 = vtmp53;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_21, -692256719, v1_13);
                if (!(v4_21.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                v4_21.startReusableNode();
                if (!v4_21.getInserting()) {
                    v4_21.useNode();
                } else {
                    v4_21.createNode(v88);
                }
                boolean v2_35 = androidx.compose.runtime.Updater.constructor-impl(v4_21);
                androidx.compose.runtime.Composer v91 = v4_21;
                androidx.compose.runtime.Updater.set-impl(v2_35, v5_21, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.set-impl(v2_35, v3_14, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Composer v4_26 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                int v40_1 = v2_35;
                if (v40_1.getInserting()) {
                    Integer v93 = v5_21;
                    v40_1.updateRememberedValue(Integer.valueOf(v54_1));
                    v2_35.apply(Integer.valueOf(v54_1), v4_26);
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(v40_1.rememberedValue(), Integer.valueOf(v54_1))) {
                    }
                }
                androidx.compose.runtime.Updater.set-impl(v2_35, v6_11, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
                androidx.compose.runtime.CompositionLocalMap v3_21 = v91;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v3_21, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                androidx.compose.foundation.layout.RowScope v97 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
                androidx.compose.runtime.Composer v98 = v3_21;
                androidx.compose.runtime.Composer v4_28 = v3_21;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_28, 128112907, "C312@14968L507,321@15504L40,322@15573L252:MapScreen.kt#2thlc2");
                int v95 = (((6 >> 6) & 112) | 6);
                androidx.compose.ui.layout.MeasurePolicy v5_29 = androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 36))), ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape())), androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 1039516303, 0, 0, 0, 14, 0), 0, 2, 0);
                java.util.Iterator v6_12 = v4_28;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_12, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                int v101 = v7_1;
                int v7_2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.Companion.getCenter(), 0);
                long v66 = 0;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_12, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int v67_1 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v6_12, 0);
                boolean v2_50 = v6_12.getCurrentCompositionLocalMap();
                androidx.compose.runtime.CompositionLocalMap v3_30 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v6_12, v5_29);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_12, -692256719, v1_13);
                if (!(v6_12.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                v6_12.startReusableNode();
                if (!v6_12.getInserting()) {
                    v6_12.useNode();
                } else {
                    v6_12.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
                }
                androidx.compose.ui.layout.MeasurePolicy v5_38 = androidx.compose.runtime.Updater.constructor-impl(v6_12);
                int v73_0 = v6_12;
                androidx.compose.runtime.Updater.set-impl(v5_38, v7_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.set-impl(v5_38, v2_50, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                java.util.Iterator v6_17 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                androidx.compose.ui.Alignment$Horizontal v42_3 = v5_38;
                if (v42_3.getInserting()) {
                    long v75 = v7_2;
                    v42_3.updateRememberedValue(Integer.valueOf(v67_1));
                    v5_38.apply(Integer.valueOf(v67_1), v6_17);
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(v42_3.rememberedValue(), Integer.valueOf(v67_1))) {
                    }
                }
                androidx.compose.runtime.Updater.set-impl(v5_38, v3_30, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
                androidx.compose.ui.layout.MeasurePolicy v5_39 = v73_0;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v5_39, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                int v7 = (((48 >> 6) & 112) | 6);
                androidx.compose.ui.Alignment$Horizontal v42_4 = v5_39;
                int v78 = ((androidx.compose.foundation.layout.BoxScope) androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE);
                int v80_0 = v5_39;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v5_39, 1295079530, "C319@15349L96:MapScreen.kt#2thlc2");
                int v40_6 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
                androidx.compose.material3.IconKt.Icon-ww6aTOc(v37_2, 0, androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 20))), v40_6, v42_4, 3504, 0);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v42_4);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v80_0);
                v73_0.endNode();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v73_0);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v73_0);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v73_0);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), v4_28, 6);
                boolean v2_68 = v4_28;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_68, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                java.util.Iterator v6_20 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
                int v39_6 = 0;
                androidx.compose.runtime.CompositionLocalMap v3_38 = androidx.compose.ui.Alignment.Companion.getStart();
                androidx.compose.runtime.Composer v41_2 = v4_28;
                androidx.compose.runtime.Composer v4_32 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v6_20, v3_38, v2_68, (((v39_6 >> 3) & 14) | ((v39_6 >> 3) & 112)));
                androidx.compose.ui.Alignment$Horizontal v42 = v3_38;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_68, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int v20_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v2_68, 0);
                androidx.compose.runtime.CompositionLocalMap v3_41 = v2_68.getCurrentCompositionLocalMap();
                androidx.compose.ui.layout.MeasurePolicy v5_42 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v2_68, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_68, -692256719, v1_13);
                if (!(v2_68.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                v2_68.startReusableNode();
                if (!v2_68.getInserting()) {
                    v2_68.useNode();
                } else {
                    v2_68.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
                }
                String v103_1 = v1_13;
                String v1_9 = androidx.compose.runtime.Updater.constructor-impl(v2_68);
                androidx.compose.runtime.Composer v106 = v2_68;
                androidx.compose.runtime.Updater.set-impl(v1_9, v4_32, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.set-impl(v1_9, v3_41, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                boolean v2_73 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                long v64_2 = v1_9;
                if (v64_2.getInserting()) {
                    Integer v108 = v4_32;
                    v64_2.updateRememberedValue(Integer.valueOf(v20_2));
                    v1_9.apply(Integer.valueOf(v20_2), v2_73);
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(v64_2.rememberedValue(), Integer.valueOf(v20_2))) {
                    }
                }
                androidx.compose.runtime.Updater.set-impl(v1_9, v5_42, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
                boolean v2_76 = v106;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_76, -384784025, v0_3);
                int v109 = (((0 >> 6) & 112) | 6);
                int v82_0 = v2_76;
                int v110 = 0;
                boolean v111 = v0_3;
                String v1_12 = v82_0;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v1_12, -1052408027, "C323@15614L93,324@15740L55:MapScreen.kt#2thlc2");
                androidx.compose.material3.TextKt.Text--4IGK_g(v61_1, 0, androidx.compose.ui.graphics.ColorKt.Color(4280166715), androidx.compose.ui.unit.TextUnitKt.getSp(14), 0, androidx.compose.ui.text.font.FontWeight.Companion.getBold(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v82_0, 200064, 0, 131026);
                androidx.compose.material3.TextKt.Text--4IGK_g(v34_3, 0, androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(12), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v1_12, 3456, 0, 131058);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v1_12);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v2_76);
                v106.endNode();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v106);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v106);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v106);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v41_2);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v98);
                v91.endNode();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v91);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v91);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v91);
                v5_15 = v36_3;
                v2_23 = v45;
                v4_18 = v46_1;
                v6_5 = v47_1;
                v3_5 = v52_2;
                v7_1 = v101;
                v1_13 = v103_1;
                v0_3 = v111;
                v20_0 = 0;
            }
            androidx.compose.runtime.CompositionLocalMap v52_1 = v3_5;
            androidx.compose.ui.layout.MeasurePolicy v36 = v5_15;
            v52_1.endReplaceGroup();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v52_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p114);
            p114.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p114);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p114);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p114);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit lambda__1888015610$lambda$3(androidx.compose.foundation.lazy.LazyItemScope p14, androidx.compose.runtime.Composer p15, int p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "$this$item");
        androidx.compose.runtime.ComposerKt.sourceInformation(p15, "C68@2858L40,69@2941L38,66@2763L1819:MapScreen.kt#2thlc2");
        if (((p16 & 17) == 16) && (p15.getSkipping())) {
            p15.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1888015610, p16, -1, "com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$-1888015610.<anonymous> (MapScreen.kt:66)");
            }
            kotlin.Unit v1_6 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 18)));
            androidx.compose.material3.CardColors v12_1 = androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 0, 0, 0, p15, ((androidx.compose.material3.CardDefaults.$stable << 12) | 6), 14);
            androidx.compose.material3.CardElevation v5_5 = androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(((float) 2)), 0, 0, 0, 0, 0, p15, ((androidx.compose.material3.CardDefaults.$stable << 18) | 6), 62);
            androidx.compose.ui.Modifier vtmp9 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.material3.CardKt.Card(vtmp9, ((androidx.compose.ui.graphics.Shape) v1_6), v12_1, v5_5, 0, com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$1122868600, p15, 196614, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3 getLambda$-1150206416$app()
    {
        return com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$-1150206416;
    }

    public final kotlin.jvm.functions.Function3 getLambda$-1888015610$app()
    {
        return com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$-1888015610;
    }

    public final kotlin.jvm.functions.Function2 getLambda$1083785868$app()
    {
        return com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$1083785868;
    }

    public final kotlin.jvm.functions.Function3 getLambda$1122868600$app()
    {
        return com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$1122868600;
    }

    public final kotlin.jvm.functions.Function3 getLambda$1301248914$app()
    {
        return com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$1301248914;
    }

    public final kotlin.jvm.functions.Function2 getLambda$1979969606$app()
    {
        return com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$1979969606;
    }

    public final kotlin.jvm.functions.Function3 getLambda$198025278$app()
    {
        return com.example.ui.screens.ComposableSingletons$MapScreenKt.lambda$198025278;
    }
}
