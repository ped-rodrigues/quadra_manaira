package com.example.ui.screens;
final class MuralScreenKt$MuralScreen$2$1$1$1$1 implements kotlin.jvm.functions.Function3 {
    final synthetic com.example.data.model.MuralPostEntity $post;
    final synthetic com.example.ui.viewmodel.QuadraViewModel $viewModel;

    MuralScreenKt$MuralScreen$2$1$1$1$1(com.example.data.model.MuralPostEntity p1, com.example.ui.viewmodel.QuadraViewModel p2)
    {
        this.$post = p1;
        this.$viewModel = p2;
        return;
    }

    public bridge synthetic Object invoke(Object p4, Object p5, Object p6)
    {
        this.invoke(((androidx.compose.foundation.layout.ColumnScope) p4), ((androidx.compose.runtime.Composer) p5), ((Number) p6).intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.layout.ColumnScope p128, androidx.compose.runtime.Composer p129, int p130)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p128, "$this$Card");
        androidx.compose.runtime.ComposerKt.sourceInformation(p129, "C133@5736L3999:MuralScreen.kt#2thlc2");
        if (((p130 & 17) == 16) && (p129.getSkipping())) {
            p129.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-913234743, p130, -1, "com.example.ui.screens.MuralScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MuralScreen.kt:133)");
            }
            androidx.compose.runtime.Composer v2_6 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            com.example.data.model.MuralPostEntity v5_3 = this.$post;
            int v6_1 = this.$viewModel;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v12_19 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
            int v14_9 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v12_19, androidx.compose.ui.Alignment.Companion.getStart(), p129, (((6 >> 3) & 14) | ((6 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v21 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p129, 0);
            androidx.compose.runtime.CompositionLocalMap v15_3 = p129.getCurrentCompositionLocalMap();
            boolean v0_19 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p129, v2_6);
            kotlin.jvm.functions.Function0 vtmp11 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function0 v25 = vtmp11;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p129.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p129.startReusableNode();
            if (!p129.getInserting()) {
                p129.useNode();
            } else {
                p129.createNode(v25);
            }
            String v1_36 = androidx.compose.runtime.Updater.constructor-impl(p129);
            androidx.compose.runtime.Updater.set-impl(v1_36, v14_9, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_36, v15_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v3_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v31_0 = v1_36;
            if ((v31_0.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v31_0.rememberedValue(), Integer.valueOf(v21)))) {
                v31_0.updateRememberedValue(Integer.valueOf(v21));
                v1_36.apply(Integer.valueOf(v21), v3_4);
            }
            androidx.compose.runtime.Updater.set-impl(v1_36, v0_19, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            androidx.compose.foundation.layout.ColumnScope v30 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.Composer v55 = p129;
            int v32 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -617138687, "C135@5858L1617,167@7501L41,170@7609L225,191@8610L41,194@8734L979:MuralScreen.kt#2thlc2");
            String v1_9 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            int v35_1 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical vtmp27 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween();
            int v37_0 = v35_1;
            int v35_2 = ((androidx.compose.foundation.layout.Arrangement$Horizontal) vtmp27);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.foundation.layout.Arrangement$Vertical v64 = v12_19;
            int v4_8 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v35_2, v37_0, p129, (((438 >> 3) & 14) | ((438 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            Integer v40_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p129, 0);
            int v9_3 = p129.getCurrentCompositionLocalMap();
            androidx.compose.ui.layout.MeasurePolicy v12_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p129, v1_9);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p129.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p129.startReusableNode();
            if (!p129.getInserting()) {
                p129.useNode();
            } else {
                p129.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            String v1_18 = androidx.compose.runtime.Updater.constructor-impl(p129);
            androidx.compose.runtime.Updater.set-impl(v1_18, v4_8, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_18, v9_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Composer v8_6 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v49_1 = v1_18;
            if (v49_1.getInserting()) {
                int v52 = v9_3;
                v49_1.updateRememberedValue(Integer.valueOf(v40_2));
                v1_18.apply(Integer.valueOf(v40_2), v8_6);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v49_1.rememberedValue(), Integer.valueOf(v40_2))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v1_18, v12_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            androidx.compose.runtime.Composer v47 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v53 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, 662757555, "C140@6136L1253,164@7419L30:MuralScreen.kt#2thlc2");
            int v4_18 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v14_1 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v4_18, p129, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            String v68 = v4_18;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v69_1 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p129, 0);
            int v4_21 = p129.getCurrentCompositionLocalMap();
            int v13_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p129, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            kotlin.jvm.functions.Function0 vtmp52 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.runtime.Composer v73_0 = vtmp52;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p129.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p129.startReusableNode();
            if (!p129.getInserting()) {
                p129.useNode();
            } else {
                p129.createNode(v73_0);
            }
            int v9_11 = androidx.compose.runtime.Updater.constructor-impl(p129);
            androidx.compose.runtime.Updater.set-impl(v9_11, v14_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v9_11, v4_21, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.ui.layout.MeasurePolicy v12_18 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v78 = v9_11;
            if (v78.getInserting()) {
                long v81 = v14_1;
                v78.updateRememberedValue(Integer.valueOf(v69_1));
                v9_11.apply(Integer.valueOf(v69_1), v12_18);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v78.rememberedValue(), Integer.valueOf(v69_1))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v9_11, v13_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v14 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v76 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -74291129, "C141@6222L220,146@6475L40,147@6548L811:MuralScreen.kt#2thlc2");
            int v82_0 = v5_3.getAuthorPhoto();
            int v83_1 = v5_3.getAuthorName();
            com.example.ui.components.CommonComponentsKt.UserAvatarView(v82_0, v83_1, 44, 0, p129, 384, 8);
            int v83 = v13_1;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10))), p129, 6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            int v11_2 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
            int v13_7 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v11_2, androidx.compose.ui.Alignment.Companion.getStart(), p129, (((0 >> 3) & 14) | ((0 >> 3) & 112)));
            int v87 = v11_2;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v88_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p129, 0);
            int v11_5 = p129.getCurrentCompositionLocalMap();
            androidx.compose.ui.layout.MeasurePolicy v12_23 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p129, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            kotlin.jvm.functions.Function0 vtmp76 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.runtime.Composer v93_0 = vtmp76;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p129.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p129.startReusableNode();
            if (!p129.getInserting()) {
                p129.useNode();
            } else {
                p129.createNode(v93_0);
            }
            int v4_35 = androidx.compose.runtime.Updater.constructor-impl(p129);
            androidx.compose.runtime.Updater.set-impl(v4_35, v13_7, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v4_35, v11_5, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v9_33 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.runtime.Composer v98_0 = v4_35;
            if (v98_0.getInserting()) {
                Integer v101 = v13_7;
                v98_0.updateRememberedValue(Integer.valueOf(v88_2));
                v4_35.apply(Integer.valueOf(v88_2), v9_33);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v98_0.rememberedValue(), Integer.valueOf(v88_2))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v4_35, v12_23, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int v13 = (((0 >> 6) & 112) | 6);
            androidx.compose.foundation.layout.ColumnScope v95 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -884887246, "C148@6593L301,156@7109L216:MuralScreen.kt#2thlc2");
            String v102_0 = v5_3.getAuthorName();
            int v109_0 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long v106_0 = androidx.compose.ui.unit.TextUnitKt.getSp(15);
            long vtmp93 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            androidx.compose.material3.TextKt.Text--4IGK_g(v102_0, 0, vtmp93, v106_0, 0, v109_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p129, 200064, 0, 131026);
            int v9 = v12_23;
            String v102_1 = new java.text.SimpleDateFormat("dd/MM \'\u00e0s\' HH:mm", java.util.Locale.getDefault()).format(new java.util.Date(v5_3.getTimestamp()));
            kotlin.jvm.internal.Intrinsics.checkNotNull(v102_1);
            long v106_1 = androidx.compose.ui.unit.TextUnitKt.getSp(11);
            long vtmp98 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g(v102_1, 0, vtmp98, v106_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p129, 3456, 0, 131058);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            p129.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            p129.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            com.example.ui.components.CommonComponentsKt.SportBadge(v5_3.getSport(), 0, p129, 0, 2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            p129.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), p129, 6);
            int v34_0 = v5_3.getText();
            int v38_1 = androidx.compose.ui.unit.TextUnitKt.getSp(14);
            kotlin.jvm.functions.Function0 v36_6 = androidx.compose.ui.graphics.ColorKt.Color(4281153352);
            long vtmp105 = androidx.compose.ui.unit.TextUnitKt.getSp(20);
            androidx.compose.material3.TextKt.Text--4IGK_g(v34_0, 0, v36_6, v38_1, 0, 0, 0, 0, 0, 0, vtmp105, 0, 0, 0, 0, 0, 0, p129, 3456, 6, 130034);
            if (v5_3.getImageType() == null) {
                p129.startReplaceGroup(-623070321);
            } else {
                p129.startReplaceGroup(-615156548);
                androidx.compose.runtime.ComposerKt.sourceInformation(p129, "179@7987L41,181@8106L48,180@8057L501");
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), p129, 6);
                int v34_1 = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.example.R$drawable.img_capa_quadra, p129, 0);
                int v38_2 = androidx.compose.ui.layout.ContentScale.Companion.getCrop();
                androidx.compose.ui.Modifier vtmp116 = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 180))), ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 12)))));
                androidx.compose.foundation.ImageKt.Image(v34_1, "Foto da Quadra de Mana\u00edra", vtmp116, 0, v38_2, 0, 0, p129, 24624, 104);
            }
            p129.endReplaceGroup();
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), p129, 6);
            boolean v0_42 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            int v4_59 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v7_9 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart();
            androidx.compose.ui.layout.MeasurePolicy v12_28 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v7_9, v0_42, p129, (((390 >> 3) & 14) | ((390 >> 3) & 112)));
            androidx.compose.ui.Alignment$Vertical v19 = v0_42;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            boolean v0_45 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p129, 0);
            androidx.compose.runtime.CompositionLocalMap v10_2 = p129.getCurrentCompositionLocalMap();
            int v20 = v0_45;
            boolean v0_46 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p129, v4_59);
            kotlin.jvm.functions.Function0 vtmp126 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            int v34_2 = vtmp126;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p129.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p129.startReusableNode();
            if (!p129.getInserting()) {
                p129.useNode();
            } else {
                p129.createNode(v34_2);
            }
            int v3_13 = androidx.compose.runtime.Updater.constructor-impl(p129);
            androidx.compose.runtime.Updater.set-impl(v3_13, v12_28, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v3_13, v10_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Composer v2_18 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v37_2 = v3_13;
            if (v37_2.getInserting()) {
                Integer v40 = v7_9;
                v37_2.updateRememberedValue(Integer.valueOf(v20));
                v3_13.apply(Integer.valueOf(v20), v2_18);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v37_2.rememberedValue(), Integer.valueOf(v20))) {
                }
            }
            Object v50_2;
            androidx.compose.runtime.Updater.set-impl(v3_13, v0_46, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v7 = (((390 >> 6) & 112) | 6);
            androidx.compose.ui.Modifier v26 = v0_46;
            int v34 = (((((((390 << 3) & 112) << 6) & 896) | 6) >> 6) & 14);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, 1401016218, "C198@8955L30,198@8987L399,198@8934L452,205@9415L272:MuralScreen.kt#2thlc2");
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p129, 1707762006, "CC(remember):MuralScreen.kt#9igjgp");
            int v38_3 = (p129.changedInstance(v6_1) | p129.changed(v5_3));
            boolean v0_51 = p129.rememberedValue();
            if (v38_3 != 0) {
                v50_2 = p129;
                int v42 = v0_51;
                v0_51 = ((kotlin.jvm.functions.Function0) new com.example.ui.screens.MuralScreenKt$MuralScreen$2$1$1$1$1$1$2$1$1(v6_1, v5_3));
                p129.updateRememberedValue(v0_51);
            } else {
                v50_2 = p129;
                if (v0_51 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                }
            }
            kotlin.jvm.functions.Function0 v41_3 = ((kotlin.jvm.functions.Function0) v0_51);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.material3.IconButtonKt.IconButton(v41_3, 0, 0, 0, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1713357211, 1, new com.example.ui.screens.MuralScreenKt$MuralScreen$2$1$1$1$1$1$2$2(v5_3), p129, 54)), p129, 196608, 30);
            v68 = new StringBuilder().append(v5_3.getLikesCount()).append(" curtidas").toString();
            long v72 = androidx.compose.ui.unit.TextUnitKt.getSp(13);
            androidx.compose.ui.text.font.FontWeight v75_0 = androidx.compose.ui.text.font.FontWeight.Companion.getSemiBold();
            long vtmp151 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g(v68, 0, vtmp151, v72, 0, v75_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p129, 200064, 0, 131026);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v50_2);
            p129.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            p129.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p129);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return;
    }
}
