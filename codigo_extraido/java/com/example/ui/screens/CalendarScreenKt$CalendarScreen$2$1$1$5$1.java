package com.example.ui.screens;
final class CalendarScreenKt$CalendarScreen$2$1$1$5$1 implements kotlin.jvm.functions.Function3 {
    final synthetic com.example.data.model.BookingEntity $booking;
    final synthetic android.content.Context $context;
    final synthetic androidx.compose.runtime.State $currentUser$delegate;
    final synthetic boolean $isCancelled;
    final synthetic boolean $isOrganizer;
    final synthetic com.example.ui.viewmodel.QuadraViewModel $viewModel;

    CalendarScreenKt$CalendarScreen$2$1$1$5$1(com.example.data.model.BookingEntity p1, boolean p2, boolean p3, com.example.ui.viewmodel.QuadraViewModel p4, android.content.Context p5, androidx.compose.runtime.State p6)
    {
        this.$booking = p1;
        this.$isCancelled = p2;
        this.$isOrganizer = p3;
        this.$viewModel = p4;
        this.$context = p5;
        this.$currentUser$delegate = p6;
        return;
    }

    public bridge synthetic Object invoke(Object p4, Object p5, Object p6)
    {
        this.invoke(((androidx.compose.foundation.layout.ColumnScope) p4), ((androidx.compose.runtime.Composer) p5), ((Number) p6).intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.layout.ColumnScope p106, androidx.compose.runtime.Composer p107, int p108)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p106, "$this$Card");
        androidx.compose.runtime.ComposerKt.sourceInformation(p107, "C284@13119L6108:CalendarScreen.kt#2thlc2");
        if (((p108 & 17) == 16) && (p107.getSkipping())) {
            p107.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-188841829, p108, -1, "com.example.ui.screens.CalendarScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CalendarScreen.kt:284)");
            }
            int v2_23 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            com.example.data.model.BookingEntity v6_3 = this.$booking;
            int v7_15 = this.$isCancelled;
            int v8_10 = this.$isOrganizer;
            com.example.ui.viewmodel.QuadraViewModel v9 = this.$viewModel;
            android.content.Context v10 = this.$context;
            Object v11_4 = this.$currentUser$delegate;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            boolean v0_14 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), p107, (((6 >> 3) & 14) | ((6 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v20 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p107, 0);
            com.example.ui.screens.ComposableSingletons$CalendarScreenKt v1_23 = p107.getCurrentCompositionLocalMap();
            int v4_2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p107, v2_23);
            kotlin.jvm.functions.Function0 vtmp11 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function0 v25 = vtmp11;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p107.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p107.startReusableNode();
            if (!p107.getInserting()) {
                p107.useNode();
            } else {
                p107.createNode(v25);
            }
            int v2_0 = androidx.compose.runtime.Updater.constructor-impl(p107);
            boolean v31 = v7_15;
            androidx.compose.runtime.Updater.set-impl(v2_0, v0_14, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v2_0, v1_23, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v7_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.runtime.Composer v32_0 = v2_0;
            if (v32_0.getInserting()) {
                Integer v35 = v1_23;
                v32_0.updateRememberedValue(Integer.valueOf(v20));
                v2_0.apply(Integer.valueOf(v20), v7_4);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v32_0.rememberedValue(), Integer.valueOf(v20))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v2_0, v4_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            androidx.compose.ui.Modifier v61 = v4_2;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, -1576290587, "C285@13192L2679,332@15901L41,334@15972L830,350@16832L40,352@16902L743:CalendarScreen.kt#2thlc2");
            boolean v63 = v8_10;
            com.example.ui.screens.ComposableSingletons$CalendarScreenKt v1_8 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            int v2_9 = ((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween());
            int v7_11 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.runtime.State v64 = v11_4;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v8_4 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v2_9, v7_11, p107, (((438 >> 3) & 14) | ((438 >> 3) & 112)));
            int v42 = v2_9;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v43_1 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p107, 0);
            int v2_13 = p107.getCurrentCompositionLocalMap();
            int v7_13 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p107, v1_8);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p107.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p107.startReusableNode();
            if (!p107.getInserting()) {
                p107.useNode();
            } else {
                p107.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            com.example.ui.screens.ComposableSingletons$CalendarScreenKt v1_17 = androidx.compose.runtime.Updater.constructor-impl(p107);
            androidx.compose.runtime.Updater.set-impl(v1_17, v8_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_17, v2_13, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Composer v12_5 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v52_0 = v1_17;
            if (v52_0.getInserting()) {
                int v55 = v8_4;
                v52_0.updateRememberedValue(Integer.valueOf(v43_1));
                v1_17.apply(Integer.valueOf(v43_1), v12_5);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v52_0.rememberedValue(), Integer.valueOf(v43_1))) {
                }
            }
            androidx.compose.runtime.Composer v76_1;
            androidx.compose.runtime.Updater.set-impl(v1_17, v7_13, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            long v50 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v53 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, -654691885, "C290@13490L33:CalendarScreen.kt#2thlc2");
            com.example.ui.components.CommonComponentsKt.SportBadge(v6_3.getSport(), 0, p107, 0, 2);
            if (!v31) {
                p107.startReplaceGroup(-653870231);
                androidx.compose.runtime.ComposerKt.sourceInformation(p107, "306@14383L1424");
                v76_1 = p107;
                androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(0, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)))), androidx.compose.ui.graphics.ColorKt.Color(4293457385), 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$CalendarScreenKt.INSTANCE.getLambda$1578816610$app(), p107, 12583296, 121);
                p107.endReplaceGroup();
            } else {
                p107.startReplaceGroup(-654657724);
                androidx.compose.runtime.ComposerKt.sourceInformation(p107, "293@13612L693");
                v76_1 = p107;
                androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(0, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)))), androidx.compose.ui.graphics.ColorKt.Color(4294962158), 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$CalendarScreenKt.INSTANCE.getLambda$-569805301$app(), p107, 12583296, 121);
                p107.endReplaceGroup();
            }
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v76_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            p107.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10))), p107, 6);
            int v2_42 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.runtime.Composer v12_17 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v2_42, p107, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            androidx.compose.material3.ButtonColors v40 = v2_42;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v42_1 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p107, 0);
            int v2_45 = p107.getCurrentCompositionLocalMap();
            int v7_21 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p107, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p107.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p107.startReusableNode();
            if (!p107.getInserting()) {
                p107.useNode();
            } else {
                p107.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            int v8_12 = androidx.compose.runtime.Updater.constructor-impl(p107);
            androidx.compose.runtime.Updater.set-impl(v8_12, v12_17, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v8_12, v2_45, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.foundation.layout.Arrangement$Horizontal v13_17 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v51_1 = v8_12;
            if (v51_1.getInserting()) {
                int v54 = v12_17;
                v51_1.updateRememberedValue(Integer.valueOf(v42_1));
                v8_12.apply(Integer.valueOf(v42_1), v13_17);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v51_1.rememberedValue(), Integer.valueOf(v42_1))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v8_12, v7_21, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v48 = (((384 >> 6) & 112) | 6);
            long v49 = 0;
            int v52 = v7_21;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, 577323983, "C335@16058L294,341@16385L39,342@16457L315:CalendarScreen.kt#2thlc2");
            androidx.compose.ui.graphics.vector.ImageVector v66_2 = androidx.compose.material.icons.filled.AccessTimeKt.getAccessTime(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            long v69 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
            androidx.compose.ui.Modifier v68_2 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 18)));
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v66_2, 0, v68_2, v69, p107, 3504, 0);
            int v58 = 0;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 6))), p107, 6);
            String v80_0 = new StringBuilder().append(v6_3.getStartTime()).append(" \u00e0s ").append(v6_3.getEndTime()).toString();
            long v84_0 = androidx.compose.ui.unit.TextUnitKt.getSp(16);
            int v87_0 = androidx.compose.ui.text.font.FontWeight.Companion.getExtraBold();
            long vtmp92 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            androidx.compose.material3.TextKt.Text--4IGK_g(v80_0, 0, vtmp92, v84_0, 0, v87_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p107, 200064, 0, 131026);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            p107.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 6))), p107, 6);
            int v2_72 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v7_34 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v2_72, p107, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            int v38 = v2_72;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v2_75 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p107, 0);
            androidx.compose.runtime.Composer v3_2 = p107.getCurrentCompositionLocalMap();
            int v19 = v2_75;
            int v2_76 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p107, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p107.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p107.startReusableNode();
            if (!p107.getInserting()) {
                p107.useNode();
            } else {
                p107.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            Object v11_11 = androidx.compose.runtime.Updater.constructor-impl(p107);
            androidx.compose.runtime.Updater.set-impl(v11_11, v7_34, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v11_11, v3_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Object v5_11 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v43_2 = v11_11;
            if (v43_2.getInserting()) {
                androidx.compose.runtime.Composer v46 = v7_34;
                v43_2.updateRememberedValue(Integer.valueOf(v19));
                v11_11.apply(Integer.valueOf(v19), v5_11);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v43_2.rememberedValue(), Integer.valueOf(v19))) {
                }
            }
            androidx.compose.runtime.Composer v12_26;
            androidx.compose.runtime.Updater.set-impl(v11_11, v2_76, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            Object v11 = (((384 >> 6) & 112) | 6);
            v40 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p107, 99358087, "C353@16988L283,359@17304L39,360@17376L239:CalendarScreen.kt#2thlc2");
            int v47_3 = androidx.compose.material.icons.filled.PersonKt.getPerson(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            long v50_2 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            long v49_1 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v47_3, 0, v49_1, v50_2, p107, 3504, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 6))), p107, 6);
            String v80_1 = new StringBuilder().append("Organizado por: ").append(v6_3.getOrganizerName()).toString();
            long v84_1 = androidx.compose.ui.unit.TextUnitKt.getSp(13);
            long vtmp127 = androidx.compose.ui.graphics.Color.Companion.getDarkGray-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g(v80_1, 0, vtmp127, v84_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p107, 3456, 0, 131058);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            p107.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            if (kotlin.text.StringsKt.isBlank(((CharSequence) v6_3.getNotes()))) {
                v12_26 = p107;
                p107.startReplaceGroup(-1589564323);
            } else {
                p107.startReplaceGroup(-1571986796);
                androidx.compose.runtime.ComposerKt.sourceInformation(p107, "368@17741L40,369@17814L224");
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 6))), p107, 6);
                kotlin.jvm.functions.Function0 v36_14 = new StringBuilder().append("Observa\u00e7\u00f5es: ").append(v6_3.getNotes()).toString();
                androidx.compose.material3.ButtonColors v40_4 = androidx.compose.ui.unit.TextUnitKt.getSp(12);
                long vtmp137 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
                androidx.compose.material3.TextKt.Text--4IGK_g(v36_14, 0, vtmp137, v40_4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p107, 3456, 0, 131058);
                v12_26 = p107;
            }
            v12_26.endReplaceGroup();
            if ((v31) || ((!v63) && (com.example.ui.screens.CalendarScreenKt.access$CalendarScreen$lambda$4(v64) == null))) {
                v12_26.startReplaceGroup(-1589564323);
            } else {
                Object v11_0;
                v12_26.startReplaceGroup(-1571520184);
                androidx.compose.runtime.ComposerKt.sourceInformation(v12_26, "377@18190L41,383@18616L54,379@18326L228,378@18264L907");
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), v12_26, 6);
                androidx.compose.material3.ButtonColors v40_5 = androidx.compose.material3.ButtonDefaults.INSTANCE.outlinedButtonColors-ro_MJ88(0, androidx.compose.ui.graphics.ColorKt.Color(4292030255), 0, 0, v12_26, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 48), 13);
                com.example.ui.screens.ComposableSingletons$CalendarScreenKt v1_60 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 10)));
                androidx.compose.ui.Modifier v37_5 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE).align(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.Alignment.Companion.getEnd());
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v12_26, 1611878409, "CC(remember):CalendarScreen.kt#9igjgp");
                int v2_101 = ((v12_26.changedInstance(v9) | v12_26.changed(v6_3)) | v12_26.changedInstance(v10));
                androidx.compose.runtime.Composer v3_24 = v12_26;
                Object v5_23 = v3_24.rememberedValue();
                if ((v2_101 == 0) && (v5_23 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v11_0 = v5_23;
                } else {
                    v11_0 = ((kotlin.jvm.functions.Function0) new com.example.ui.screens.CalendarScreenKt$CalendarScreen$2$1$1$5$1$1$4$1(v9, v6_3, v10));
                    v3_24.updateRememberedValue(v11_0);
                }
                kotlin.jvm.functions.Function0 v36_1 = ((kotlin.jvm.functions.Function0) v11_0);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v12_26);
                androidx.compose.material3.ButtonKt.OutlinedButton(v36_1, v37_5, 0, ((androidx.compose.ui.graphics.Shape) v1_60), v40_5, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$CalendarScreenKt.INSTANCE.getLambda$684539425$app(), v12_26, 805306368, 484);
            }
            v12_26.endReplaceGroup();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v12_26);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            p107.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p107);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return;
    }
}
