package com.example.ui.screens;
final class MessagesScreenKt$DirectChatView$3$1$1$2$1$1 implements kotlin.jvm.functions.Function2 {
    final synthetic boolean $isMine;
    final synthetic com.example.data.model.MessageEntity $msg;

    MessagesScreenKt$DirectChatView$3$1$1$2$1$1(com.example.data.model.MessageEntity p1, boolean p2)
    {
        this.$msg = p1;
        this.$isMine = p2;
        return;
    }

    public bridge synthetic Object invoke(Object p3, Object p4)
    {
        this.invoke(((androidx.compose.runtime.Composer) p3), ((Number) p4).intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.runtime.Composer p55, int p56)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p55, "C346@14096L933:MessagesScreen.kt#2thlc2");
        if (((p56 & 3) == 2) && (p55.getSkipping())) {
            p55.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1403021926, p56, -1, "com.example.ui.screens.DirectChatView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessagesScreen.kt:346)");
            }
            String v2_14 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 14)), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)));
            androidx.compose.ui.Alignment$Horizontal v4_13 = this.$msg;
            boolean v5_3 = this.$isMine;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p55, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v11_3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), p55, (((6 >> 3) & 14) | ((6 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p55, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v12_3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p55, 0);
            androidx.compose.runtime.CompositionLocalMap v15_1 = p55.getCurrentCompositionLocalMap();
            boolean v0_5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p55, v2_14);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p55, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p55.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p55.startReusableNode();
            if (!p55.getInserting()) {
                p55.useNode();
            } else {
                p55.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            long v26_1;
            String v2_18 = androidx.compose.runtime.Updater.constructor-impl(p55);
            androidx.compose.runtime.Updater.set-impl(v2_18, v11_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v2_18, v15_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            java.text.SimpleDateFormat v1_5 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v24 = v2_18;
            if (v24.getInserting()) {
                v26_1 = v4_13;
                v24.updateRememberedValue(Integer.valueOf(v12_3));
                v2_18.apply(Integer.valueOf(v12_3), v1_5);
            } else {
                v26_1 = v4_13;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v24.rememberedValue(), Integer.valueOf(v12_3))) {
                }
            }
            java.text.SimpleDateFormat v1_12;
            androidx.compose.runtime.Updater.set-impl(v2_18, v0_5, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p55, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            v24 = (((((((6 << 3) & 112) << 6) & 896) | 6) >> 6) & 14);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p55, -1670580797, "C347@14203L237,352@14473L40,354@14642L357:MessagesScreen.kt#2thlc2");
            String v27_0 = v26_1.getText();
            if (!v5_3) {
                v1_12 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            } else {
                v1_12 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            }
            androidx.compose.ui.Modifier v3_9;
            androidx.compose.material3.TextKt.Text--4IGK_g(v27_0, 0, v1_12, androidx.compose.ui.unit.TextUnitKt.getSp(14), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p55, 3072, 0, 131058);
            int v53 = (((6 >> 6) & 112) | 6);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 2))), p55, 6);
            String v2_13 = new java.text.SimpleDateFormat("HH:mm", java.util.Locale.getDefault()).format(new java.util.Date(v26_1.getTimestamp()));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_13, "format(...)");
            androidx.compose.ui.Modifier v3_8 = androidx.compose.ui.graphics.Color.Companion;
            if (!v5_3) {
                v3_9 = v3_8.getGray-0d7_KjU();
            } else {
                v3_9 = androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(v3_8.getWhite-0d7_KjU(), 1060320051, 0, 0, 0, 14, 0);
            }
            long v29_2 = v3_9;
            long v31_2 = androidx.compose.ui.unit.TextUnitKt.getSp(10);
            androidx.compose.ui.Modifier vtmp40 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE).align(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.Alignment.Companion.getEnd());
            androidx.compose.material3.TextKt.Text--4IGK_g(v2_13, vtmp40, v29_2, v31_2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p55, 3072, 0, 131056);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p55);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p55);
            p55.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p55);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p55);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p55);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return;
    }
}
