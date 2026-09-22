package com.example.ui.screens;
final class MessagesScreenKt$ConversationsListView$1$1$1$2 implements kotlin.jvm.functions.Function3 {
    final synthetic com.example.data.model.UserEntity $athlete;

    MessagesScreenKt$ConversationsListView$1$1$1$2(com.example.data.model.UserEntity p1)
    {
        this.$athlete = p1;
        return;
    }

    public bridge synthetic Object invoke(Object p4, Object p5, Object p6)
    {
        this.invoke(((androidx.compose.foundation.layout.ColumnScope) p4), ((androidx.compose.runtime.Composer) p5), ((Number) p6).intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.layout.ColumnScope p98, androidx.compose.runtime.Composer p99, int p100)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p98, "$this$Card");
        androidx.compose.runtime.ComposerKt.sourceInformation(p99, "C158@6433L1507:MessagesScreen.kt#2thlc2");
        if (((p100 & 17) == 16) && (p99.getSkipping())) {
            p99.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1638751732, p100, -1, "com.example.ui.screens.ConversationsListView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessagesScreen.kt:158)");
            }
            int v1_33 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 14)));
            int v4_19 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical vtmp7 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween();
            androidx.compose.ui.Modifier v5_30 = ((androidx.compose.foundation.layout.Arrangement$Horizontal) vtmp7);
            com.example.data.model.UserEntity v8 = this.$athlete;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v14_3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v5_30, v4_19, p99, (((438 >> 3) & 14) | ((438 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v19 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p99, 0);
            androidx.compose.ui.layout.MeasurePolicy v6_13 = p99.getCurrentCompositionLocalMap();
            boolean v0_32 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p99, v1_33);
            kotlin.jvm.functions.Function0 vtmp12 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function0 v24 = vtmp12;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p99.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p99.startReusableNode();
            if (!p99.getInserting()) {
                p99.useNode();
            } else {
                p99.createNode(v24);
            }
            int v1_2 = androidx.compose.runtime.Updater.constructor-impl(p99);
            androidx.compose.runtime.Updater.set-impl(v1_2, v14_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_2, v6_13, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Composer v3_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v29_0 = v1_2;
            if (v29_0.getInserting()) {
                Integer v32 = v5_30;
                v29_0.updateRememberedValue(Integer.valueOf(v19));
                v1_2.apply(Integer.valueOf(v19), v3_4);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v29_0.rememberedValue(), Integer.valueOf(v19))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v1_2, v0_32, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            androidx.compose.foundation.layout.RowScope v28 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v33 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, 1848629361, "C165@6764L1095,188@7885L33:MessagesScreen.kt#2thlc2");
            int v1_10 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            int v38 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v6_1 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v1_10, p99, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            androidx.compose.ui.Alignment$Vertical v41 = v1_10;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v42 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p99, 0);
            int v1_13 = p99.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v7_0 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p99, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            kotlin.jvm.functions.Function0 vtmp32 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.runtime.Composer v45_0 = vtmp32;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p99.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p99.startReusableNode();
            if (!p99.getInserting()) {
                p99.useNode();
            } else {
                p99.createNode(v45_0);
            }
            int v4_8 = androidx.compose.runtime.Updater.constructor-impl(p99);
            androidx.compose.runtime.Updater.set-impl(v4_8, v6_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v4_8, v1_13, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.ui.Modifier v5_22 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.runtime.Composer v50_0 = v4_8;
            if (v50_0.getInserting()) {
                Integer v53 = v6_1;
                v50_0.updateRememberedValue(Integer.valueOf(v42));
                v4_8.apply(Integer.valueOf(v42), v5_22);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v50_0.rememberedValue(), Integer.valueOf(v42))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v4_8, v7_0, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            androidx.compose.foundation.layout.RowScope v47 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -1645756644, "C166@6846L201,171@7076L40,172@7145L688:MessagesScreen.kt#2thlc2");
            int v54 = v8.getPhotoUri();
            int v55_0 = v8.getName();
            com.example.ui.components.CommonComponentsKt.UserAvatarView(v54, v55_0, 48, 0, p99, 384, 8);
            v54 = 0;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), p99, 6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            int v4_14 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
            androidx.compose.ui.layout.MeasurePolicy v6_10 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v4_14, androidx.compose.ui.Alignment.Companion.getStart(), p99, (((0 >> 3) & 14) | ((0 >> 3) & 112)));
            androidx.compose.foundation.layout.Arrangement$Vertical v60 = v4_14;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v12_0 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p99, 0);
            int v4_18 = p99.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v5_27 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p99, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
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
            int v2_1 = androidx.compose.runtime.Updater.constructor-impl(p99);
            androidx.compose.runtime.Updater.set-impl(v2_1, v6_10, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v2_1, v4_18, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            boolean v0_13 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.ColumnScope v66 = v2_1;
            if (v66.getInserting()) {
                Integer v69 = v4_18;
                v66.updateRememberedValue(Integer.valueOf(v12_0));
                v2_1.apply(Integer.valueOf(v12_0), v0_13);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v66.rememberedValue(), Integer.valueOf(v12_0))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v2_1, v5_27, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            v66 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p99, -797775548, "C173@7186L278,179@7497L40,180@7570L233:MessagesScreen.kt#2thlc2");
            String v70_0 = v8.getName();
            int v77_0 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long v74_0 = androidx.compose.ui.unit.TextUnitKt.getSp(15);
            long vtmp73 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            androidx.compose.material3.TextKt.Text--4IGK_g(v70_0, 0, vtmp73, v74_0, 0, v77_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p99, 200064, 0, 131026);
            int v96 = (((0 >> 6) & 112) | 6);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 2))), p99, 6);
            long v74_1 = androidx.compose.ui.unit.TextUnitKt.getSp(12);
            long vtmp77 = androidx.compose.ui.graphics.ColorKt.Color(4278220697);
            androidx.compose.material3.TextKt.Text--4IGK_g("Toque para abrir o chat privado", 0, vtmp77, v74_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p99, 3462, 0, 131058);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            p99.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            p99.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            com.example.ui.components.CommonComponentsKt.SportBadge(v8.getSport(), 0, p99, 0, 2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            p99.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p99);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return;
    }
}
