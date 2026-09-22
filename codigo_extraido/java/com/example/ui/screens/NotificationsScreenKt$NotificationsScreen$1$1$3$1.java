package com.example.ui.screens;
final class NotificationsScreenKt$NotificationsScreen$1$1$3$1 implements kotlin.jvm.functions.Function3 {
    final synthetic kotlin.Pair $iconInfo;
    final synthetic com.example.data.model.NotificationEntity $notif;

    NotificationsScreenKt$NotificationsScreen$1$1$3$1(kotlin.Pair p1, com.example.data.model.NotificationEntity p2)
    {
        this.$iconInfo = p1;
        this.$notif = p2;
        return;
    }

    public bridge synthetic Object invoke(Object p4, Object p5, Object p6)
    {
        this.invoke(((androidx.compose.foundation.layout.ColumnScope) p4), ((androidx.compose.runtime.Composer) p5), ((Number) p6).intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.layout.ColumnScope p112, androidx.compose.runtime.Composer p113, int p114)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p112, "$this$Card");
        androidx.compose.runtime.ComposerKt.sourceInformation(p113, "C258@12487L2450:NotificationsScreen.kt#2thlc2");
        if (((p114 & 17) == 16) && (p113.getSkipping())) {
            p113.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1468607992, p114, -1, "com.example.ui.screens.NotificationsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NotificationsScreen.kt:258)");
            }
            int v2_7 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 14)));
            androidx.compose.ui.layout.MeasurePolicy v8_12 = androidx.compose.ui.Alignment.Companion.getTop();
            androidx.compose.ui.Alignment$Horizontal v9_0 = this.$iconInfo;
            com.example.data.model.NotificationEntity v10_1 = this.$notif;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v5_27 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v8_12, p113, (((390 >> 3) & 14) | ((390 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v24 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p113, 0);
            int v6_19 = p113.getCurrentCompositionLocalMap();
            boolean v0_9 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p113, v2_7);
            kotlin.jvm.functions.Function0 vtmp12 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function0 v28 = vtmp12;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p113.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p113.startReusableNode();
            if (!p113.getInserting()) {
                p113.useNode();
            } else {
                p113.createNode(v28);
            }
            int v1_1 = androidx.compose.runtime.Updater.constructor-impl(p113);
            androidx.compose.runtime.Updater.set-impl(v1_1, v5_27, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_1, v6_19, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            float v3_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v34_0 = v1_1;
            if ((v34_0.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v34_0.rememberedValue(), Integer.valueOf(v24)))) {
                v34_0.updateRememberedValue(Integer.valueOf(v24));
                v1_1.apply(Integer.valueOf(v24), v3_4);
            }
            androidx.compose.runtime.Updater.set-impl(v1_1, v0_9, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v35 = p113;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, -1471422297, "C264@12731L653,279@13410L40,281@13476L1439:NotificationsScreen.kt#2thlc2");
            int v46 = 0;
            int v1_10 = androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 40))), ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape())), androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(((androidx.compose.ui.graphics.Color) v9_0.getSecond()).unbox-impl(), 1041865114, 0, 0, 0, 14, 0), 0, 2, 0);
            androidx.compose.runtime.Composer v4_10 = androidx.compose.ui.Alignment.Companion.getCenter();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            int v6_2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(v4_10, 0);
            int v41 = v4_10;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v42_0 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p113, 0);
            androidx.compose.runtime.Composer v4_13 = p113.getCurrentCompositionLocalMap();
            int v5_9 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p113, v1_10);
            kotlin.jvm.functions.Function0 vtmp39 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            int v52_2 = vtmp39;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p113.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p113.startReusableNode();
            if (!p113.getInserting()) {
                p113.useNode();
            } else {
                p113.createNode(v52_2);
            }
            int v1_19 = androidx.compose.runtime.Updater.constructor-impl(p113);
            androidx.compose.runtime.Updater.set-impl(v1_19, v6_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_19, v4_13, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.ui.layout.MeasurePolicy v8_5 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.runtime.Composer v57_0 = v1_19;
            if (v57_0.getInserting()) {
                String v60 = v6_2;
                v57_0.updateRememberedValue(Integer.valueOf(v42_0));
                v1_19.apply(Integer.valueOf(v42_0), v8_5);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v57_0.rememberedValue(), Integer.valueOf(v42_0))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v1_19, v5_9, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            androidx.compose.runtime.Composer v55 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, -1924254303, "C271@13082L276:NotificationsScreen.kt#2thlc2");
            int v61_1 = ((androidx.compose.ui.graphics.vector.ImageVector) v9_0.getFirst());
            long v64_0 = ((androidx.compose.ui.graphics.Color) v9_0.getSecond()).unbox-impl();
            androidx.compose.ui.Modifier v63 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 20)));
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v61_1, 0, v63, v64_0, p113, 432, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p113);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p113);
            p113.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p113);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p113);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p113);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), p113, 6);
            int v1_35 = androidx.compose.foundation.layout.RowScope.weight$default(((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE), ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 1065353216, 0, 2, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            float v3_10 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), p113, (((0 >> 3) & 14) | ((0 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v41_1 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p113, 0);
            androidx.compose.runtime.Composer v4_30 = p113.getCurrentCompositionLocalMap();
            int v6_8 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p113, v1_35);
            kotlin.jvm.functions.Function0 vtmp67 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function0 v51_2 = vtmp67;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p113.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p113.startReusableNode();
            if (!p113.getInserting()) {
                p113.useNode();
            } else {
                p113.createNode(v51_2);
            }
            int v1_44 = androidx.compose.runtime.Updater.constructor-impl(p113);
            androidx.compose.runtime.Updater.set-impl(v1_44, v3_10, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_44, v4_30, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v5_18 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.ColumnScope v56_1 = v1_44;
            if (v56_1.getInserting()) {
                Integer v59 = v4_30;
                v56_1.updateRememberedValue(Integer.valueOf(v41_1));
                v1_44.apply(Integer.valueOf(v41_1), v5_18);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v56_1.rememberedValue(), Integer.valueOf(v41_1))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v1_44, v6_8, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            androidx.compose.foundation.layout.ColumnScope v56 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, -1265660059, "C282@13545L998,302@14573L40,304@14643L246:NotificationsScreen.kt#2thlc2");
            androidx.compose.ui.Modifier v21 = v6_8;
            int v1_53 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            float v3_22 = ((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween());
            int v5_25 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v8_20 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v3_22, v5_25, p113, (((438 >> 3) & 14) | ((438 >> 3) & 112)));
            long v62 = v3_22;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            float v3_25 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p113, 0);
            androidx.compose.runtime.CompositionLocalMap v7_1 = p113.getCurrentCompositionLocalMap();
            int v23 = v3_25;
            float v3_26 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p113, v1_53);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p113, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p113.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p113.startReusableNode();
            if (!p113.getInserting()) {
                p113.useNode();
            } else {
                p113.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            Integer v70;
            int v2_9 = androidx.compose.runtime.Updater.constructor-impl(p113);
            androidx.compose.runtime.Updater.set-impl(v2_9, v8_20, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v2_9, v7_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v1_66 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v67_1 = v2_9;
            if (v67_1.getInserting()) {
                v70 = p113;
                v67_1.updateRememberedValue(Integer.valueOf(v23));
                v2_9.apply(Integer.valueOf(v23), v1_66);
            } else {
                v70 = p113;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v67_1.rememberedValue(), Integer.valueOf(v23))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v2_9, v3_26, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            int v2_10 = v70;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_10, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v6 = (((438 >> 6) & 112) | 6);
            Integer v107 = v2_10;
            androidx.compose.foundation.layout.RowScope v43 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v67_2 = v2_10;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_10, -835053397, "C287@13843L277,295@14313L200:NotificationsScreen.kt#2thlc2");
            String v86_0 = v10_1.getTitle();
            int v93_0 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long v90_0 = androidx.compose.ui.unit.TextUnitKt.getSp(14);
            long vtmp105 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            androidx.compose.material3.TextKt.Text--4IGK_g(v86_0, 0, vtmp105, v90_0, 0, v93_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v107, 200064, 0, 131026);
            String v86_1 = new java.text.SimpleDateFormat("HH:mm", java.util.Locale.getDefault()).format(new java.util.Date(v10_1.getTimestamp()));
            kotlin.jvm.internal.Intrinsics.checkNotNull(v86_1);
            long v90_1 = androidx.compose.ui.unit.TextUnitKt.getSp(11);
            long vtmp110 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g(v86_1, 0, vtmp110, v90_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v107, 3456, 0, 131058);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v107);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v67_2);
            v70.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v70);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v70);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v70);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 4))), p113, 6);
            v60 = v10_1.getMessage();
            long v64_3 = androidx.compose.ui.unit.TextUnitKt.getSp(13);
            long v62_1 = androidx.compose.ui.graphics.Color.Companion.getDarkGray-0d7_KjU();
            long vtmp116 = androidx.compose.ui.unit.TextUnitKt.getSp(18);
            androidx.compose.material3.TextKt.Text--4IGK_g(v60, 0, v62_1, v64_3, 0, 0, 0, 0, 0, 0, vtmp116, 0, 0, 0, 0, 0, 0, p113, 3456, 6, 130034);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p113);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p113);
            p113.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p113);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p113);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p113);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p113);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p113);
            p113.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p113);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p113);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p113);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return;
    }
}
