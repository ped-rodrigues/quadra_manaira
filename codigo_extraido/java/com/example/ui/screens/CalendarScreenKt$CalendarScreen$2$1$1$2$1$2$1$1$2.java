package com.example.ui.screens;
final class CalendarScreenKt$CalendarScreen$2$1$1$2$1$2$1$1$2 implements kotlin.jvm.functions.Function2 {
    final synthetic String $day;
    final synthetic boolean $isSelected;
    final synthetic String $week;

    CalendarScreenKt$CalendarScreen$2$1$1$2$1$2$1$1$2(boolean p1, String p2, String p3)
    {
        this.$isSelected = p1;
        this.$week = p2;
        this.$day = p3;
        return;
    }

    public bridge synthetic Object invoke(Object p3, Object p4)
    {
        this.invoke(((androidx.compose.runtime.Composer) p3), ((Number) p4).intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.runtime.Composer p54, int p55)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p54, "C177@7958L1047:CalendarScreen.kt#2thlc2");
        if (((p55 & 3) == 2) && (p54.getSkipping())) {
            p54.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1784188401, p55, -1, "com.example.ui.screens.CalendarScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CalendarScreen.kt:177)");
            }
            int v2_7 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, androidx.compose.ui.unit.Dp.constructor-impl(((float) 10)), 1, 0);
            androidx.compose.ui.Alignment$Horizontal v4_4 = androidx.compose.ui.Alignment.Companion.getCenterHorizontally();
            boolean v5_2 = this.$isSelected;
            androidx.compose.runtime.Composer v6_3 = this.$week;
            String v7_8 = this.$day;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            float v10_6 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), v4_4, p54, (((390 >> 3) & 14) | ((390 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v36 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p54, 0);
            long v11_7 = p54.getCurrentCompositionLocalMap();
            int v12_2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p54, v2_7);
            int v13_3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p54.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p54.startReusableNode();
            if (!p54.getInserting()) {
                p54.useNode();
            } else {
                p54.createNode(v13_3);
            }
            androidx.compose.ui.text.font.FontWeight v14_15 = androidx.compose.runtime.Updater.constructor-impl(p54);
            androidx.compose.runtime.Updater.set-impl(v14_15, v10_6, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v14_15, v11_7, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            boolean v0_3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v18_0 = v14_15;
            if ((v18_0.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v18_0.rememberedValue(), Integer.valueOf(v36)))) {
                v18_0.updateRememberedValue(Integer.valueOf(v36));
                v14_15.apply(Integer.valueOf(v36), v0_3);
            }
            int v19_0;
            androidx.compose.runtime.Updater.set-impl(v14_15, v12_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            androidx.compose.foundation.layout.ColumnScope v41 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -403865759, "C181@8208L322,187@8567L40,188@8644L327:CalendarScreen.kt#2thlc2");
            int v17_0 = androidx.compose.ui.unit.TextUnitKt.getSp(11);
            boolean v0_11 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            if (!v5_2) {
                v19_0 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            } else {
                v19_0 = androidx.compose.ui.graphics.ColorKt.Color(4294955366);
            }
            String v7_5;
            androidx.compose.ui.layout.MeasurePolicy v45 = v10_6;
            androidx.compose.ui.Modifier v48 = v12_2;
            String v49 = v7_8;
            androidx.compose.material3.TextKt.Text--4IGK_g(v6_3, 0, v19_0, v17_0, 0, v0_11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p54, 199680, 0, 131026);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 4))), p54, 6);
            long v11_0 = androidx.compose.ui.unit.TextUnitKt.getSp(18);
            androidx.compose.ui.text.font.FontWeight v14_7 = androidx.compose.ui.text.font.FontWeight.Companion.getExtraBold();
            if (!v5_2) {
                v7_5 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            } else {
                v7_5 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            }
            androidx.compose.material3.TextKt.Text--4IGK_g(v49, 0, v7_5, v11_0, 0, v14_7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p54, 199680, 0, 131026);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p54);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p54);
            p54.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p54);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p54);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return;
    }
}
