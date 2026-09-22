package com.example.ui.screens;
final class ProfileScreenKt$ProfileScreen$1$1$6$1 implements kotlin.jvm.functions.Function3 {
    final synthetic com.example.data.model.UserEntity $athlete;
    final synthetic com.example.ui.viewmodel.QuadraViewModel $viewModel;

    ProfileScreenKt$ProfileScreen$1$1$6$1(com.example.ui.viewmodel.QuadraViewModel p1, com.example.data.model.UserEntity p2)
    {
        this.$viewModel = p1;
        this.$athlete = p2;
        return;
    }

    public bridge synthetic Object invoke(Object p4, Object p5, Object p6)
    {
        this.invoke(((androidx.compose.foundation.layout.ColumnScope) p4), ((androidx.compose.runtime.Composer) p5), ((Number) p6).intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.layout.ColumnScope p132, androidx.compose.runtime.Composer p133, int p134)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p132, "$this$Card");
        androidx.compose.runtime.ComposerKt.sourceInformation(p133, "C328@14618L1935:ProfileScreen.kt#2thlc2");
        if (((p134 & 17) == 16) && (p133.getSkipping())) {
            p133.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(374925460, p134, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:328)");
            }
            int v2_7 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 14)));
            int v5_34 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical vtmp7 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween();
            int v6_10 = ((androidx.compose.foundation.layout.Arrangement$Horizontal) vtmp7);
            com.example.ui.viewmodel.QuadraViewModel v8_1 = this.$viewModel;
            com.example.data.model.UserEntity v9 = this.$athlete;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v15_3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v6_10, v5_34, p133, (((438 >> 3) & 14) | ((438 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v21 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p133, 0);
            Object v7_19 = p133.getCurrentCompositionLocalMap();
            boolean v0_13 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p133, v2_7);
            kotlin.jvm.functions.Function0 vtmp12 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function0 v25 = vtmp12;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p133.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p133.startReusableNode();
            if (!p133.getInserting()) {
                p133.useNode();
            } else {
                p133.createNode(v25);
            }
            androidx.compose.runtime.Composer v1_2 = androidx.compose.runtime.Updater.constructor-impl(p133);
            androidx.compose.runtime.Updater.set-impl(v1_2, v15_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_2, v7_19, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Composer v3_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v31_0 = v1_2;
            if ((v31_0.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v31_0.rememberedValue(), Integer.valueOf(v21)))) {
                v31_0.updateRememberedValue(Integer.valueOf(v21));
                v1_2.apply(Integer.valueOf(v21), v3_4);
            }
            androidx.compose.runtime.Updater.set-impl(v1_2, v0_13, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            androidx.compose.foundation.layout.RowScope v30 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            androidx.compose.runtime.Composer v40 = p133;
            int v32 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, 907164165, "C335@14921L1266,362@16230L35,362@16209L326:ProfileScreen.kt#2thlc2");
            androidx.compose.runtime.Composer v1_7 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            int v45 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Object v7_1 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v1_7, p133, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            kotlin.jvm.functions.Function2 v39 = v1_7;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            androidx.compose.runtime.Composer v40_0 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p133, 0);
            androidx.compose.runtime.Composer v1_10 = p133.getCurrentCompositionLocalMap();
            int v6_2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p133, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p133.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p133.startReusableNode();
            if (!p133.getInserting()) {
                p133.useNode();
            } else {
                p133.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            Object v4_6 = androidx.compose.runtime.Updater.constructor-impl(p133);
            androidx.compose.runtime.Updater.set-impl(v4_6, v7_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v4_6, v1_10, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v5_22 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v54 = v4_6;
            if (v54.getInserting()) {
                Integer v57 = v7_1;
                v54.updateRememberedValue(Integer.valueOf(v40_0));
                v4_6.apply(Integer.valueOf(v40_0), v5_22);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v54.rememberedValue(), Integer.valueOf(v40_0))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v4_6, v6_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v52 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, -1305131351, "C336@14999L185,341@15209L40,342@15274L891:ProfileScreen.kt#2thlc2");
            int v58_0 = v9.getPhotoUri();
            androidx.compose.ui.Modifier v59 = v9.getName();
            com.example.ui.components.CommonComponentsKt.UserAvatarView(v58_0, v59, 48, 0, p133, 384, 8);
            v59 = v6_2;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), p133, 6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            int v5_29 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
            Object v7_9 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v5_29, androidx.compose.ui.Alignment.Companion.getStart(), p133, (((0 >> 3) & 14) | ((0 >> 3) & 112)));
            androidx.compose.foundation.layout.Arrangement$Vertical v66 = v5_29;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v67 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p133, 0);
            int v5_33 = p133.getCurrentCompositionLocalMap();
            int v6_7 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p133, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            kotlin.jvm.functions.Function0 vtmp56 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.runtime.Composer v71_0 = vtmp56;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p133.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p133.startReusableNode();
            if (!p133.getInserting()) {
                p133.useNode();
            } else {
                p133.createNode(v71_0);
            }
            androidx.compose.runtime.Composer v1_24 = androidx.compose.runtime.Updater.constructor-impl(p133);
            androidx.compose.runtime.Updater.set-impl(v1_24, v7_9, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_24, v5_33, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Object v4_28 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.ColumnScope v76 = v1_24;
            if (v76.getInserting()) {
                Integer v79 = v7_9;
                v76.updateRememberedValue(Integer.valueOf(v67));
                v1_24.apply(Integer.valueOf(v67), v4_28);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v76.rememberedValue(), Integer.valueOf(v67))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v1_24, v6_7, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            v76 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, 12198065, "C343@15311L258,349@15598L40,350@15667L472:ProfileScreen.kt#2thlc2");
            int v80 = v9.getName();
            int v87_0 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            androidx.compose.ui.Alignment$Vertical v84 = androidx.compose.ui.unit.TextUnitKt.getSp(15);
            long vtmp73 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            androidx.compose.material3.TextKt.Text--4IGK_g(v80, 0, vtmp73, v84, 0, v87_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p133, 200064, 0, 131026);
            androidx.compose.ui.Modifier v81 = v6_7;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 3))), p133, 6);
            androidx.compose.runtime.Composer v1_37 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v5_42 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v1_37, p133, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            v84 = v1_37;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v13_1 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p133, 0);
            androidx.compose.runtime.Composer v1_40 = p133.getCurrentCompositionLocalMap();
            Object v7_16 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p133, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p133.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p133.startReusableNode();
            if (!p133.getInserting()) {
                p133.useNode();
            } else {
                p133.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            Object v4_44 = androidx.compose.runtime.Updater.constructor-impl(p133);
            androidx.compose.runtime.Updater.set-impl(v4_44, v5_42, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v4_44, v1_40, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v2_17 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.runtime.Composer v90_0 = v4_44;
            if (v90_0.getInserting()) {
                Integer v93 = v5_42;
                v90_0.updateRememberedValue(Integer.valueOf(v13_1));
                v4_44.apply(Integer.valueOf(v13_1), v2_17);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v90_0.rememberedValue(), Integer.valueOf(v13_1))) {
                }
            }
            Object v7_20;
            androidx.compose.runtime.Updater.set-impl(v4_44, v7_16, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            kotlin.jvm.functions.Function0 v34 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, 905326957, "C351@15753L33,352@15819L39,353@15891L218:ProfileScreen.kt#2thlc2");
            int v18 = (((384 >> 6) & 112) | 6);
            com.example.ui.components.CommonComponentsKt.SportBadge(v9.getSport(), 0, p133, 0, 2);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))), p133, 6);
            String v106 = new StringBuilder().append("\u1f382 ").append(v9.getBirthDate()).toString();
            long v110 = androidx.compose.ui.unit.TextUnitKt.getSp(11);
            long vtmp104 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g(v106, 0, vtmp104, v110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p133, 3456, 0, 131058);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            p133.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            p133.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            p133.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p133, 2107513651, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean v0_16 = (p133.changedInstance(v8_1) | p133.changed(v9));
            Object v4_50 = p133.rememberedValue();
            if ((!v0_16) && (v4_50 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v7_20 = v4_50;
            } else {
                v7_20 = ((kotlin.jvm.functions.Function0) new com.example.ui.screens.ProfileScreenKt$ProfileScreen$1$1$6$1$1$2$1(v8_1, v9));
                p133.updateRememberedValue(v7_20);
            }
            kotlin.jvm.functions.Function0 v34_1 = ((kotlin.jvm.functions.Function0) v7_20);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.material3.IconButtonKt.IconButton(v34_1, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$-1845029197$app(), p133, 196608, 30);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            p133.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p133);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return;
    }
}
