package com.example.ui.components;
public final class CommonComponentsKt {
    private static final java.util.List SPORTS_LIST;

    static CommonComponentsKt()
    {
        java.util.List v0_1 = new String[4];
        v0_1[0] = "Futebol";
        v0_1[1] = "Basquete";
        v0_1[2] = "Gin\u00e1stica";
        v0_1[3] = "V\u00f4lei de Praia";
        com.example.ui.components.CommonComponentsKt.SPORTS_LIST = kotlin.collections.CollectionsKt.listOf(v0_1);
        return;
    }

    public static final void OnlineSyncStatusBanner(boolean p22, boolean p23, kotlin.jvm.functions.Function0 p24, androidx.compose.ui.Modifier p25, androidx.compose.runtime.Composer p26, int p27, int p28)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p24, "onSyncClick");
        androidx.compose.runtime.ScopeUpdateScope v4_3 = p26.startRestartGroup(966345817);
        androidx.compose.runtime.ComposerKt.sourceInformation(v4_3, "C(OnlineSyncStatusBanner)P(!2,3)265@9958L17,266@9982L1530,256@9600L1912:CommonComponents.kt#qonjpd");
        androidx.compose.ui.Modifier v6_1 = p27;
        if ((p27 & 6) == 0) {
            androidx.compose.ui.graphics.Shape v7_4;
            if (!v4_3.changed(p22)) {
                v7_4 = 2;
            } else {
                v7_4 = 4;
            }
            v6_1 = (p27 | v7_4);
        }
        if ((p27 & 48) == 0) {
            androidx.compose.ui.graphics.Shape v7_7;
            if (!v4_3.changed(p23)) {
                v7_7 = 16;
            } else {
                v7_7 = 32;
            }
            v6_1 |= v7_7;
        }
        if ((p27 & 384) == 0) {
            androidx.compose.ui.graphics.Shape v7_10;
            if (!v4_3.changedInstance(p24)) {
                v7_10 = 128;
            } else {
                v7_10 = 256;
            }
            v6_1 |= v7_10;
        }
        long v9_1;
        androidx.compose.ui.graphics.Shape v7_11 = (p28 & 8);
        if (v7_11 == null) {
            if ((p27 & 3072) != 0) {
                v9_1 = p25;
            } else {
                long v10_2;
                v9_1 = p25;
                if (!v4_3.changed(p25)) {
                    v10_2 = 1024;
                } else {
                    v10_2 = 2048;
                }
                v6_1 |= v10_2;
            }
        } else {
            v6_1 |= 3072;
            v9_1 = p25;
        }
        if (((v6_1 & 1171) == 1170) && (v4_3.getSkipping())) {
            v4_3.skipToGroupEnd();
            androidx.compose.ui.Modifier v16_2 = v4_3;
            androidx.compose.runtime.ScopeUpdateScope v4_1 = v9_1;
        } else {
            androidx.compose.ui.graphics.Shape v7_12;
            if (v7_11 == null) {
                v7_12 = v9_1;
            } else {
                v7_12 = ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(966345817, v6_1, -1, "com.example.ui.components.OnlineSyncStatusBanner (CommonComponents.kt:255)");
            }
            long v9_4;
            if (!p22) {
                v9_4 = 4294962158;
            } else {
                v9_4 = 4293457385;
            }
            int v12_5;
            long v9_5 = androidx.compose.ui.graphics.ColorKt.Color(v9_4);
            androidx.compose.runtime.ScopeUpdateScope v0_12 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 12)));
            androidx.compose.runtime.internal.ComposableLambda v11_8 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 1));
            if (!p22) {
                v12_5 = 4294954450;
            } else {
                v12_5 = 4289058471;
            }
            long v8_0;
            androidx.compose.foundation.BorderStroke v14 = androidx.compose.foundation.BorderStrokeKt.BorderStroke-cXLIe8U(v11_8, androidx.compose.ui.graphics.ColorKt.Color(v12_5));
            kotlin.jvm.functions.Function2 v15_0 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(v7_12, 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_3, 945410730, "CC(remember):CommonComponents.kt#9igjgp");
            if ((v6_1 & 896) != 256) {
                v8_0 = 0;
            } else {
                v8_0 = 1;
            }
            Object v26_1;
            androidx.compose.runtime.ScopeUpdateScope v0_1;
            androidx.compose.runtime.internal.ComposableLambda v11_2 = v4_3;
            int v13_0 = v11_2.rememberedValue();
            if (v8_0 != 0) {
                v26_1 = v0_12;
                v0_1 = new com.example.ui.components.CommonComponentsKt$$ExternalSyntheticLambda2(p24);
                v11_2.updateRememberedValue(v0_1);
            } else {
                v26_1 = v0_12;
                if (v13_0 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                    v0_1 = v13_0;
                }
            }
            int v19_1 = ((kotlin.jvm.functions.Function0) v0_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v4_3);
            androidx.compose.runtime.ScopeUpdateScope v0_4 = androidx.compose.foundation.ClickableKt.clickable-XHw0xAI$default(v15_0, 0, 0, 0, v19_1, 7, 0);
            androidx.compose.runtime.ScopeUpdateScope v0_5 = v7_12;
            v16_2 = v4_3;
            androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(v0_4, ((androidx.compose.ui.graphics.Shape) v26_1), v9_5, 0, 0, 0, v14, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2129796748, 1, new com.example.ui.components.CommonComponentsKt$$ExternalSyntheticLambda3(p23, p22), v4_3, 54)), v16_2, 12582912, 56);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            v4_1 = v0_5;
        }
        androidx.compose.ui.graphics.Shape v7_3 = v16_2.endRestartGroup();
        if (v7_3 != null) {
            v7_3.updateScope(new com.example.ui.components.CommonComponentsKt$$ExternalSyntheticLambda4(p22, p23, p24, v4_1, p27, p28));
        }
        return;
    }

    static final kotlin.Unit OnlineSyncStatusBanner$lambda$18$lambda$17(kotlin.jvm.functions.Function0 p1)
    {
        p1.invoke();
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit OnlineSyncStatusBanner$lambda$21(boolean p84, boolean p85, androidx.compose.runtime.Composer p86, int p87)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p86, "C267@9992L1514:CommonComponents.kt#qonjpd");
        if (((p87 & 3) == 2) && (p86.getSkipping())) {
            p86.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2129796748, p87, -1, "com.example.ui.components.OnlineSyncStatusBanner.<anonymous> (CommonComponents.kt:267)");
            }
            float v1_19 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12)), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)));
            androidx.compose.runtime.Composer v3_10 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical vtmp7 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween();
            float v4_17 = ((androidx.compose.foundation.layout.Arrangement$Horizontal) vtmp7);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p86, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v10_3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v4_17, v3_10, p86, (((438 >> 3) & 14) | ((438 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p86, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v16 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p86, 0);
            androidx.compose.runtime.CompositionLocalMap v15_1 = p86.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v13_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p86, v1_19);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p86, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p86.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p86.startReusableNode();
            if (!p86.getInserting()) {
                p86.useNode();
            } else {
                p86.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            boolean v0_33 = androidx.compose.runtime.Updater.constructor-impl(p86);
            androidx.compose.runtime.Updater.set-impl(v0_33, v10_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v0_33, v15_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.ui.text.font.FontWeight$Companion v2_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v27_0 = v0_33;
            if (v27_0.getInserting()) {
                Integer v30 = v4_17;
                v27_0.updateRememberedValue(Integer.valueOf(v16));
                v0_33.apply(Integer.valueOf(v16), v2_4);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v27_0.rememberedValue(), Integer.valueOf(v16))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v0_33, v13_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p86, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            androidx.compose.foundation.layout.RowScope v26 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v28 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p86, 1799847223, "C272@10220L795:CommonComponents.kt#qonjpd");
            androidx.compose.ui.text.font.FontWeight$Companion v2_10 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p86, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v6_1 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v2_10, p86, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            androidx.compose.ui.Alignment$Vertical v36 = v2_10;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p86, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            androidx.compose.ui.text.font.FontWeight$Companion v2_13 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p86, 0);
            androidx.compose.runtime.CompositionLocalMap v14_0 = p86.getCurrentCompositionLocalMap();
            int v17 = v2_13;
            androidx.compose.ui.text.font.FontWeight$Companion v2_15 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p86, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p86, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p86.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p86.startReusableNode();
            if (!p86.getInserting()) {
                p86.useNode();
            } else {
                p86.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            int v43_1;
            float v5_8 = androidx.compose.runtime.Updater.constructor-impl(p86);
            androidx.compose.runtime.Updater.set-impl(v5_8, v6_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v5_8, v14_0, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            float v1_13 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.ui.Modifier v41 = v5_8;
            if (v41.getInserting()) {
                v43_1 = p86;
                v41.updateRememberedValue(Integer.valueOf(v17));
                v5_8.apply(Integer.valueOf(v17), v1_13);
            } else {
                v43_1 = p86;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v41.rememberedValue(), Integer.valueOf(v17))) {
                }
            }
            boolean v0_9;
            androidx.compose.runtime.Updater.set-impl(v5_8, v2_15, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            float v4_12 = v43_1;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_12, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v24 = 0;
            androidx.compose.ui.text.font.FontWeight v38 = (((((((384 << 3) & 112) << 6) & 896) | 6) >> 6) & 14);
            androidx.compose.ui.text.font.FontWeight$Companion v2_16 = v4_12;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_16, -658625616, "C273@10290L312,279@10619L39,280@10675L326:CommonComponents.kt#qonjpd");
            boolean v0_8 = androidx.compose.material.icons.Icons.INSTANCE.getDefault();
            if (!p85) {
                v0_9 = androidx.compose.material.icons.filled.WifiOffKt.getWifiOff(v0_8);
            } else {
                v0_9 = androidx.compose.material.icons.filled.WifiKt.getWifi(v0_8);
            }
            boolean v0_10;
            boolean v45_0 = v0_9;
            if (!p85) {
                v0_10 = 4291176488;
            } else {
                v0_10 = 4281236786;
            }
            boolean v0_17;
            int v48_0 = androidx.compose.ui.graphics.ColorKt.Color(v0_10);
            int v50_1 = v2_16;
            int v47_0 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v45_0, "Status Conex\u00e3o", v47_0, v48_0, v50_1, 432, 0);
            androidx.compose.ui.text.font.FontWeight$Companion v2_18 = v50_1;
            boolean v45_1 = v4_12;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))), v2_18, 6);
            if (!p85) {
                v0_17 = "Modo Offline \u2022 Salvo na mem\u00f3ria interna";
            } else {
                v0_17 = "Modo Online \u2022 Sincronizado com a nuvem";
            }
            boolean v0_20;
            String v59 = v0_17;
            long v63 = androidx.compose.ui.unit.TextUnitKt.getSp(12);
            androidx.compose.ui.text.font.FontWeight v66 = androidx.compose.ui.text.font.FontWeight.Companion.getMedium();
            if (!p85) {
                v0_20 = 4290190364;
            } else {
                v0_20 = 4279983648;
            }
            boolean v0_21 = androidx.compose.ui.graphics.ColorKt.Color(v0_20);
            androidx.compose.material3.TextKt.Text--4IGK_g(v59, 0, v0_21, v63, 0, v66, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v2_18, 199680, 0, 131026);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v2_18);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v45_1);
            v43_1.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v43_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v43_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v43_1);
            if (!p84) {
                p86.startReplaceGroup(1800851467);
                androidx.compose.runtime.ComposerKt.sourceInformation(p86, "295@11283L199");
                long v35_2 = androidx.compose.ui.unit.TextUnitKt.getSp(11);
                androidx.compose.ui.text.font.FontWeight v38_3 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
                long v33 = androidx.compose.ui.graphics.ColorKt.Color(4278220697);
                androidx.compose.material3.TextKt.Text--4IGK_g("Sincronizar", 0, v33, v35_2, 0, v38_3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p86, 200070, 0, 131026);
                p86.endReplaceGroup();
            } else {
                p86.startReplaceGroup(1800631739);
                androidx.compose.runtime.ComposerKt.sourceInformation(p86, "289@11062L183");
                float v34_1 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 2));
                int v32_6 = androidx.compose.ui.graphics.ColorKt.Color(4278220697);
                String v31_1 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
                androidx.compose.material3.ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(v31_1, v32_6, v34_1, 0, 0, p86, 438, 24);
                p86.endReplaceGroup();
            }
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p86);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p86);
            p86.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p86);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p86);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p86);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit OnlineSyncStatusBanner$lambda$22(boolean p8, boolean p9, kotlin.jvm.functions.Function0 p10, androidx.compose.ui.Modifier p11, int p12, int p13, androidx.compose.runtime.Composer p14, int p15)
    {
        com.example.ui.components.CommonComponentsKt.OnlineSyncStatusBanner(p8, p9, p10, p11, p14, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p12 | 1)), p13);
        return kotlin.Unit.INSTANCE;
    }

    public static final void SportBadge(String p24, androidx.compose.ui.Modifier p25, androidx.compose.runtime.Composer p26, int p27, int p28)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p24, "sport");
        androidx.compose.runtime.Composer v14 = p26.startRestartGroup(610068863);
        androidx.compose.runtime.ComposerKt.sourceInformation(v14, "C(SportBadge)P(1)79@3443L611,74@3223L831:CommonComponents.kt#qonjpd");
        androidx.compose.runtime.ScopeUpdateScope v4_1 = p27;
        if ((p27 & 6) == 0) {
            boolean v5_5;
            if (!v14.changed(p24)) {
                v5_5 = 2;
            } else {
                v5_5 = 4;
            }
            v4_1 = (p27 | v5_5);
        }
        long v6_3;
        boolean v5_6 = (p28 & 2);
        if (!v5_6) {
            if ((p27 & 48) != 0) {
                v6_3 = p25;
            } else {
                String v7_1;
                v6_3 = p25;
                if (!v14.changed(p25)) {
                    v7_1 = 16;
                } else {
                    v7_1 = 32;
                }
                v4_1 |= v7_1;
            }
        } else {
            v4_1 |= 48;
            v6_3 = p25;
        }
        if (((v4_1 & 19) == 18) && (v14.getSkipping())) {
            v14.skipToGroupEnd();
            androidx.compose.runtime.ScopeUpdateScope v4_0 = v6_3;
        } else {
            boolean v5_7;
            if (!v5_6) {
                v5_7 = v6_3;
            } else {
                v5_7 = ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(610068863, v4_1, -1, "com.example.ui.components.SportBadge (CommonComponents.kt:72)");
            }
            int v15_0 = com.example.ui.components.CommonComponentsKt.getSportColor(p24);
            long v6_6 = androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(v15_0, 1039516303, 0, 0, 0, 14, 0);
            int v3_4 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 12)));
            int v11_1 = v15_0;
            long v8_4 = androidx.compose.foundation.BorderStrokeKt.BorderStroke-cXLIe8U(androidx.compose.ui.unit.Dp.constructor-impl(((float) 1)), androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(v15_0, 1053609165, 0, 0, 0, 14, 0));
            v4_0 = v5_7;
            androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(v4_0, ((androidx.compose.ui.graphics.Shape) v3_4), v6_6, 0, 0, 0, v8_4, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-868334652, 1, new com.example.ui.components.CommonComponentsKt$$ExternalSyntheticLambda0(p24, v11_1), v14, 54)), v14, (((v4_1 >> 3) & 14) | 12582912), 56);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        boolean v5_2 = v14.endRestartGroup();
        if (v5_2) {
            v5_2.updateScope(new com.example.ui.components.CommonComponentsKt$$ExternalSyntheticLambda1(p24, v4_0, p27, p28));
        }
        return;
    }

    static final kotlin.Unit SportBadge$lambda$1(String p51, long p52, androidx.compose.runtime.Composer p54, int p55)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p54, "C80@3453L595:CommonComponents.kt#qonjpd");
        if (((p55 & 3) == 2) && (p54.getSkipping())) {
            p54.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-868334652, p55, -1, "com.example.ui.components.SportBadge.<anonymous> (CommonComponents.kt:80)");
            }
            int v1_17 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            float v3_10 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)), androidx.compose.ui.unit.Dp.constructor-impl(((float) 4)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v8_4 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v1_17, p54, (((390 >> 3) & 14) | ((390 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v11_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p54, 0);
            androidx.compose.runtime.CompositionLocalMap v12_1 = p54.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v13 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p54, v3_10);
            kotlin.jvm.functions.Function0 v14_1 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p54.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p54.startReusableNode();
            if (!p54.getInserting()) {
                p54.useNode();
            } else {
                p54.createNode(v14_1);
            }
            boolean v0_21 = androidx.compose.runtime.Updater.constructor-impl(p54);
            androidx.compose.runtime.Updater.set-impl(v0_21, v8_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v0_21, v12_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v1_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.RowScope v21 = v0_21;
            if ((v21.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v21.rememberedValue(), Integer.valueOf(v11_2)))) {
                v21.updateRememberedValue(Integer.valueOf(v11_2));
                v0_21.apply(Integer.valueOf(v11_2), v1_4);
            }
            androidx.compose.runtime.Updater.set-impl(v0_21, v13, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            v21 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -606689033, "C84@3618L192,90@3823L39,91@3875L163:CommonComponents.kt#qonjpd");
            String v24_0 = com.example.ui.components.CommonComponentsKt.getSportIcon(p51);
            long v26_0 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v24_0, p51, v26_0, p52, p54, 384, 0);
            int v50 = (((390 >> 6) & 112) | 6);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 4))), p54, 6);
            androidx.compose.material3.TextKt.Text--4IGK_g(p51, 0, p52, androidx.compose.ui.unit.TextUnitKt.getSp(12), 0, androidx.compose.ui.text.font.FontWeight.Companion.getSemiBold(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p54, 199680, 0, 131026);
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
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit SportBadge$lambda$2(String p1, androidx.compose.ui.Modifier p2, int p3, int p4, androidx.compose.runtime.Composer p5, int p6)
    {
        com.example.ui.components.CommonComponentsKt.SportBadge(p1, p2, p5, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p3 | 1)), p4);
        return kotlin.Unit.INSTANCE;
    }

    public static final void UserAvatarView(String p55, String p56, int p57, androidx.compose.ui.Modifier p58, androidx.compose.runtime.Composer p59, int p60, int p61)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p55, "photoUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p56, "name");
        androidx.compose.runtime.Composer v7 = p59.startRestartGroup(-1399493763);
        androidx.compose.runtime.ComposerKt.sourceInformation(v7, "C(UserAvatarView)P(2,1,3)124@4645L540:CommonComponents.kt#qonjpd");
        int v3_1 = p60;
        if ((p60 & 48) == 0) {
            androidx.compose.ui.Modifier v4_3;
            if (!v7.changed(p56)) {
                v4_3 = 16;
            } else {
                v4_3 = 32;
            }
            v3_1 = (p60 | v4_3);
        }
        int v6_7;
        androidx.compose.ui.Modifier v4_4 = (p61 & 4);
        if (v4_4 == null) {
            if ((p60 & 384) != 0) {
                v6_7 = p57;
            } else {
                androidx.compose.runtime.Composer v8_7;
                v6_7 = p57;
                if (!v7.changed(p57)) {
                    v8_7 = 128;
                } else {
                    v8_7 = 256;
                }
                v3_1 |= v8_7;
            }
        } else {
            v3_1 |= 384;
            v6_7 = p57;
        }
        androidx.compose.ui.Modifier v9_1;
        androidx.compose.runtime.Composer v8_8 = (p61 & 8);
        if (v8_8 == null) {
            if ((p60 & 3072) != 0) {
                v9_1 = p58;
            } else {
                int v10_1;
                v9_1 = p58;
                if (!v7.changed(p58)) {
                    v10_1 = 1024;
                } else {
                    v10_1 = 2048;
                }
                v3_1 |= v10_1;
            }
        } else {
            v3_1 |= 3072;
            v9_1 = p58;
        }
        int v3_4;
        androidx.compose.ui.Modifier v4_12;
        int v10_2 = v3_1;
        if (((v10_2 & 1169) == 1168) && (v7.getSkipping())) {
            v7.skipToGroupEnd();
            v3_4 = v6_7;
            v4_12 = v9_1;
        } else {
            if (v4_4 == null) {
                v3_4 = v6_7;
            } else {
                v3_4 = 48;
            }
            if (v8_8 != null) {
                v9_1 = ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1399493763, v10_2, -1, "com.example.ui.components.UserAvatarView (CommonComponents.kt:107)");
            }
            boolean v0_15 = 6;
            androidx.compose.ui.Modifier v4_17 = new androidx.compose.ui.graphics.Color[6];
            v4_17[0] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4278223759));
            int v11_5 = 1;
            v4_17[1] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4293284096));
            v4_17[2] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4281236786));
            v4_17[3] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4285143962));
            v4_17[4] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4278356177));
            v4_17[5] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4294278144));
            androidx.compose.ui.Modifier v4_0 = kotlin.collections.CollectionsKt.listOf(v4_17);
            int v6_5 = (Math.abs(p56.hashCode()) % v4_0.size());
            long v14 = ((androidx.compose.ui.graphics.Color) v4_0.get(v6_5)).unbox-impl();
            androidx.compose.ui.layout.MeasurePolicy v13_11 = new String[1];
            v13_11[0] = " ";
            String v57_1 = ((java.util.Collection) new java.util.ArrayList());
            androidx.compose.ui.Modifier v21_1 = ((Iterable) kotlin.text.StringsKt.split$default(((CharSequence) p56), v13_11, 0, 0, 6, 0)).iterator();
            while (v21_1.hasNext()) {
                androidx.compose.runtime.Composer v27_4;
                androidx.compose.runtime.Composer v27_3 = kotlin.text.StringsKt.firstOrNull(((CharSequence) ((String) v21_1.next())));
                if (v27_3 == null) {
                    v27_4 = 0;
                } else {
                    v27_4 = v27_3.toString();
                }
                String v57_4;
                boolean v0_14;
                androidx.compose.foundation.layout.BoxScope v59_1;
                if (v27_4 == null) {
                    v59_1 = v0_15;
                    v0_14 = v57_1;
                    v57_4 = v11_5;
                } else {
                    v59_1 = v0_15;
                    v0_14 = v57_1;
                    v57_4 = v11_5;
                    v0_14.add(v27_4);
                }
                v11_5 = v57_4;
                v57_1 = v0_14;
                v0_15 = v59_1;
            }
            int v11_1;
            String v57_2 = v11_5;
            boolean v0_6 = ((CharSequence) kotlin.collections.CollectionsKt.joinToString$default(((Iterable) kotlin.collections.CollectionsKt.take(((Iterable) ((java.util.List) v57_1)), 2)), ((CharSequence) ""), 0, 0, 0, 0, 0, 62, 0));
            if (v0_6.length() != 0) {
                v11_1 = 0;
            } else {
                v11_1 = v57_2;
            }
            if (v11_1 != 0) {
                v0_6 = "Q";
            }
            boolean v0_7 = ((String) v0_6);
            int v11_3 = androidx.compose.ui.Alignment.Companion.getCenter();
            androidx.compose.runtime.Composer v8_3 = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(v9_1, androidx.compose.ui.unit.Dp.constructor-impl(((float) v3_4))), ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()));
            int v12_0 = new androidx.compose.ui.graphics.Color[2];
            v12_0[0] = androidx.compose.ui.graphics.Color.box-impl(v14);
            v12_0[v57_2] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(v14, 1061158912, 0, 0, 0, 14, 0));
            String v1_2 = androidx.compose.foundation.BorderKt.border-xT4_qwU(androidx.compose.foundation.BackgroundKt.background$default(v8_3, androidx.compose.ui.graphics.Brush$Companion.linearGradient-mHitzGk$default(androidx.compose.ui.graphics.Brush.Companion, kotlin.collections.CollectionsKt.listOf(v12_0), 0, 0, 0, 14, 0), 0, 0, 6, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 2)), androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()));
            androidx.compose.runtime.Composer v8_5 = v7;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v8_5, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v13_19 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(v11_3, 0);
            int v18 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v8_5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v2_8 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v8_5, 0);
            androidx.compose.ui.Modifier v4_6 = v8_5.getCurrentCompositionLocalMap();
            int v58_2 = v2_8;
            int v2_9 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v8_5, v1_2);
            kotlin.jvm.functions.Function0 vtmp55 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            int v22_3 = vtmp55;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v8_5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(v8_5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            v8_5.startReusableNode();
            if (!v8_5.getInserting()) {
                v8_5.useNode();
            } else {
                v8_5.createNode(v22_3);
            }
            int v5_2 = androidx.compose.runtime.Updater.constructor-impl(v8_5);
            androidx.compose.runtime.Updater.set-impl(v5_2, v13_19, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v5_2, v4_6, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            String v1_16 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.ui.Modifier v26 = v5_2;
            if (v26.getInserting()) {
                Integer v29 = v6_5;
                v26.updateRememberedValue(Integer.valueOf(v58_2));
                v5_2.apply(Integer.valueOf(v58_2), v1_16);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v26.rememberedValue(), Integer.valueOf(v58_2))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v5_2, v2_9, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.ui.Modifier v4_11 = v8_5;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_11, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            androidx.compose.runtime.Composer v51 = v4_11;
            int v24 = 0;
            v26 = v2_9;
            androidx.compose.runtime.Composer v27_0 = v4_11;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_11, -662623242, "C136@5009L170:CommonComponents.kt#qonjpd");
            String v1_26 = v0_7.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_26, "toUpperCase(...)");
            long v32 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            androidx.compose.ui.text.font.FontWeight v37 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            String v30 = v1_26;
            long vtmp72 = androidx.compose.ui.unit.TextUnitKt.getSp((((double) v3_4) * 4600877379321698714));
            androidx.compose.material3.TextKt.Text--4IGK_g(v30, 0, v32, vtmp72, 0, v37, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v51, 196992, 0, 131026);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v51);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v27_0);
            v8_5.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v8_5);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v8_5);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v8_5);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            v4_12 = v9_1;
        }
        androidx.compose.runtime.Composer v8_9 = v7.endRestartGroup();
        if (v8_9 != null) {
            v8_9.updateScope(new com.example.ui.components.CommonComponentsKt$$ExternalSyntheticLambda5(p55, p56, v3_4, v4_12, p60, p61));
        }
        return;
    }

    static final kotlin.Unit UserAvatarView$lambda$6(String p8, String p9, int p10, androidx.compose.ui.Modifier p11, int p12, int p13, androidx.compose.runtime.Composer p14, int p15)
    {
        com.example.ui.components.CommonComponentsKt.UserAvatarView(p8, p9, p10, p11, p14, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p12 | 1)), p13);
        return kotlin.Unit.INSTANCE;
    }

    public static final void WeatherCard(com.example.data.model.WeatherData p19, boolean p20, kotlin.jvm.functions.Function0 p21, androidx.compose.ui.Modifier p22, androidx.compose.runtime.Composer p23, int p24, int p25)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p21, "onRefresh");
        androidx.compose.runtime.Composer v12_4 = p23.startRestartGroup(-1068528537);
        androidx.compose.runtime.ComposerKt.sourceInformation(v12_4, "C(WeatherCard)P(3!1,2)154@5417L68,157@5520L38,161@5680L3758,152@5338L4100:CommonComponents.kt#qonjpd");
        com.example.ui.components.CommonComponentsKt$$ExternalSyntheticLambda7 v4_1 = p24;
        if ((p24 & 6) == 0) {
            boolean v6_9;
            if (!v12_4.changed(p19)) {
                v6_9 = 2;
            } else {
                v6_9 = 4;
            }
            v4_1 = (p24 | v6_9);
        }
        if ((p24 & 48) == 0) {
            boolean v6_12;
            if (!v12_4.changed(p20)) {
                v6_12 = 16;
            } else {
                v6_12 = 32;
            }
            v4_1 |= v6_12;
        }
        if ((p24 & 384) == 0) {
            boolean v6_15;
            if (!v12_4.changedInstance(p21)) {
                v6_15 = 128;
            } else {
                v6_15 = 256;
            }
            v4_1 |= v6_15;
        }
        androidx.compose.ui.graphics.Shape v7_9;
        boolean v6_16 = (p25 & 8);
        if (!v6_16) {
            if ((p24 & 3072) != 0) {
                v7_9 = p22;
            } else {
                androidx.compose.material3.CardColors v8_7;
                v7_9 = p22;
                if (!v12_4.changed(p22)) {
                    v8_7 = 1024;
                } else {
                    v8_7 = 2048;
                }
                v4_1 |= v8_7;
            }
        } else {
            v4_1 |= 3072;
            v7_9 = p22;
        }
        if (((v4_1 & 1171) == 1170) && (v12_4.getSkipping())) {
            v12_4.skipToGroupEnd();
            int v0_3 = v7_9;
            androidx.compose.runtime.Composer v13_2 = v12_4;
        } else {
            boolean v6_17;
            if (!v6_16) {
                v6_17 = v7_9;
            } else {
                v6_17 = ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1068528537, v4_1, -1, "com.example.ui.components.WeatherCard (CommonComponents.kt:151)");
            }
            androidx.compose.runtime.Composer v15_2 = v12_4;
            v0_3 = v6_17;
            androidx.compose.material3.CardColors v16_1 = androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 0, 0, 0, v15_2, ((androidx.compose.material3.CardDefaults.$stable << 12) | 6), 14);
            androidx.compose.runtime.Composer v13_0 = v15_2;
            androidx.compose.material3.CardElevation v9_2 = androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(((float) 4)), 0, 0, 0, 0, 0, v13_0, ((androidx.compose.material3.CardDefaults.$stable << 18) | 6), 62);
            boolean v6_4 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(v0_3, 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)));
            androidx.compose.runtime.Composer v12_3 = v13_0;
            androidx.compose.material3.CardKt.Card(v6_4, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 18)))), v16_1, v9_2, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1452645685, 1, new com.example.ui.components.CommonComponentsKt$$ExternalSyntheticLambda6(p21, p19, p20), v13_0, 54)), v12_3, 196608, 16);
            v13_2 = v12_3;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.ui.graphics.Shape v7_7 = v13_2.endRestartGroup();
        if (v7_7 == null) {
            com.example.ui.components.CommonComponentsKt$$ExternalSyntheticLambda7 v4 = v0_3;
        } else {
            v7_7.updateScope(new com.example.ui.components.CommonComponentsKt$$ExternalSyntheticLambda7(p19, p20, p21, v0_3, p24, p25));
        }
        return;
    }

    static final kotlin.Unit WeatherCard$lambda$15(kotlin.jvm.functions.Function0 p178, com.example.data.model.WeatherData p179, boolean p180, androidx.compose.foundation.layout.ColumnScope p181, androidx.compose.runtime.Composer p182, int p183)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p181, "$this$Card");
        androidx.compose.runtime.ComposerKt.sourceInformation(p182, "C162@5690L3742:CommonComponents.kt#qonjpd");
        if (((p183 & 17) == 16) && (p182.getSkipping())) {
            p182.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1452645685, p183, -1, "com.example.ui.components.WeatherCard.<anonymous> (CommonComponents.kt:162)");
            }
            androidx.compose.foundation.layout.Arrangement$Horizontal v7_3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            boolean v1_36 = new androidx.compose.ui.graphics.Color[2];
            v1_36[0] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4278220697));
            v1_36[1] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4278233238));
            boolean v1_42 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.BackgroundKt.background$default(v7_3, androidx.compose.ui.graphics.Brush$Companion.horizontalGradient-8A-3gB4$default(androidx.compose.ui.graphics.Brush.Companion, kotlin.collections.CollectionsKt.listOf(v1_36), 0, 0, 0, 14, 0), 0, 0, 6, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v13_1 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.Companion.getTopStart(), 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v19 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p182, 0);
            androidx.compose.runtime.CompositionLocalMap v15_1 = p182.getCurrentCompositionLocalMap();
            androidx.compose.ui.layout.MeasurePolicy v8_33 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p182, v1_42);
            kotlin.jvm.functions.Function0 vtmp18 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.ui.Modifier v23 = vtmp18;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p182.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            int v6_18;
            p182.startReusableNode();
            if (!p182.getInserting()) {
                v6_18 = v23;
                p182.useNode();
            } else {
                v6_18 = v23;
                p182.createNode(v6_18);
            }
            boolean v1_5 = androidx.compose.runtime.Updater.constructor-impl(p182);
            androidx.compose.runtime.Updater.set-impl(v1_5, v13_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_5, v15_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v2_21 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v28_0 = v1_5;
            if ((v28_0.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v28_0.rememberedValue(), Integer.valueOf(v19)))) {
                v28_0.updateRememberedValue(Integer.valueOf(v19));
                v1_5.apply(Integer.valueOf(v19), v2_21);
            }
            androidx.compose.runtime.Updater.set-impl(v1_5, v8_33, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            int v29 = 0;
            int v32 = (((6 >> 6) & 112) | 6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, 1947220469, "C172@5999L3423:CommonComponents.kt#qonjpd");
            boolean v1_23 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            int v2_35 = ((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween());
            androidx.compose.runtime.Composer v3_7 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            kotlin.jvm.functions.Function0 v35 = v6_18;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v6_24 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v2_35, v3_7, p182, (((438 >> 3) & 14) | ((438 >> 3) & 112)));
            androidx.compose.foundation.layout.Arrangement$Horizontal v40 = v2_35;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v41 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p182, 0);
            int v2_38 = p182.getCurrentCompositionLocalMap();
            androidx.compose.runtime.Composer v3_8 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p182, v1_23);
            kotlin.jvm.functions.Function0 vtmp39 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function0 v45 = vtmp39;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p182.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p182.startReusableNode();
            if (!p182.getInserting()) {
                p182.useNode();
            } else {
                p182.createNode(v45);
            }
            boolean v1_34 = androidx.compose.runtime.Updater.constructor-impl(p182);
            androidx.compose.runtime.Updater.set-impl(v1_34, v6_24, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_34, v2_38, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v5_19 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v50_0 = v1_34;
            if (v50_0.getInserting()) {
                Integer v53 = v6_24;
                v50_0.updateRememberedValue(Integer.valueOf(v41));
                v1_34.apply(Integer.valueOf(v41), v5_19);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v50_0.rememberedValue(), Integer.valueOf(v41))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v1_34, v3_8, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, 1599850433, "C177@6217L2564,229@8831L577,229@8799L609:CommonComponents.kt#qonjpd");
            int v2_48 = androidx.compose.foundation.layout.RowScope.weight$default(((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE), ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 1065353216, 0, 2, 0);
            int v65 = 0;
            androidx.compose.ui.Modifier v67 = v8_33;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            int v5_22 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
            int v10_6 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v5_22, androidx.compose.ui.Alignment.Companion.getStart(), p182, (((0 >> 3) & 14) | ((0 >> 3) & 112)));
            kotlin.jvm.functions.Function2 v59 = v5_22;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            androidx.compose.runtime.Composer v60_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p182, 0);
            int v5_25 = p182.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v9_4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p182, v2_48);
            kotlin.jvm.functions.Function0 vtmp60 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function0 v71 = vtmp60;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p182.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p182.startReusableNode();
            if (!p182.getInserting()) {
                p182.useNode();
            } else {
                p182.createNode(v71);
            }
            int v2_57 = androidx.compose.runtime.Updater.constructor-impl(p182);
            androidx.compose.runtime.Updater.set-impl(v2_57, v10_6, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v2_57, v5_25, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.ui.layout.MeasurePolicy v8_9 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v76_0 = v2_57;
            if (v76_0.getInserting()) {
                Integer v79 = v10_6;
                v76_0.updateRememberedValue(Integer.valueOf(v60_2));
                v2_57.apply(Integer.valueOf(v60_2), v8_9);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v76_0.rememberedValue(), Integer.valueOf(v60_2))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v2_57, v9_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            androidx.compose.foundation.layout.ColumnScope v74 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            int v80 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -308185159, "C178@6278L749,194@7049L40,196@7111L1652:CommonComponents.kt#qonjpd");
            int v5_35 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.ui.Modifier v85 = v9_4;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v12_1 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v5_35, p182, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            int v90 = v5_35;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            androidx.compose.foundation.layout.Arrangement$Horizontal v91 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p182, 0);
            int v5_38 = p182.getCurrentCompositionLocalMap();
            androidx.compose.foundation.layout.RowScope v11_2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p182, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            kotlin.jvm.functions.Function0 vtmp80 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.ui.Modifier v95_0 = vtmp80;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p182.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p182.startReusableNode();
            if (!p182.getInserting()) {
                p182.useNode();
            } else {
                p182.createNode(v95_0);
            }
            androidx.compose.ui.Modifier v9_10 = androidx.compose.runtime.Updater.constructor-impl(p182);
            androidx.compose.runtime.Updater.set-impl(v9_10, v12_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v9_10, v5_38, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v10_28 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.runtime.Composer v100_0 = v9_10;
            if (v100_0.getInserting()) {
                boolean v103 = v12_1;
                v100_0.updateRememberedValue(Integer.valueOf(v91));
                v9_10.apply(Integer.valueOf(v91), v10_28);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v100_0.rememberedValue(), Integer.valueOf(v91))) {
                }
            }
            int v5_55;
            androidx.compose.runtime.Updater.set-impl(v9_10, v11_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v12 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v98 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, 1953729097, "C179@6356L271,185@6652L39,186@6716L289:CommonComponents.kt#qonjpd");
            Integer v104_0 = androidx.compose.material.icons.filled.LocationOnKt.getLocationOn(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            int v107_0 = androidx.compose.ui.graphics.ColorKt.Color(4294955366);
            int v106_0 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v104_0, "Local", v106_0, v107_0, p182, 3504, 0);
            androidx.compose.ui.Modifier v130 = v11_2;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 4))), p182, 6);
            if (p179 == null) {
                v5_55 = "Mana\u00edra, Jo\u00e3o Pessoa - PB";
            } else {
                v5_55 = p179.getLocation();
                if (v5_55 == 0) {
                }
            }
            androidx.compose.material3.TextKt.Text--4IGK_g(v5_55, 0, androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 1063675494, 0, 0, 0, 14, 0), androidx.compose.ui.unit.TextUnitKt.getSp(12), 0, androidx.compose.ui.text.font.FontWeight.Companion.getMedium(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p182, 200064, 0, 131026);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            p182.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 4))), p182, 6);
            androidx.compose.ui.Modifier v9_26 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v8_14 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart();
            int v10_39 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v8_14, v9_26, p182, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            v91 = v8_14;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v92 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p182, 0);
            androidx.compose.ui.layout.MeasurePolicy v8_17 = p182.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v9_27 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p182, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            kotlin.jvm.functions.Function0 vtmp114 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function0 v96_1 = vtmp114;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p182.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p182.startReusableNode();
            if (!p182.getInserting()) {
                p182.useNode();
            } else {
                p182.createNode(v96_1);
            }
            int v5_69 = androidx.compose.runtime.Updater.constructor-impl(p182);
            androidx.compose.runtime.Updater.set-impl(v5_69, v10_39, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v5_69, v8_17, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.foundation.layout.RowScope v11_13 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v101_1 = v5_69;
            if (v101_1.getInserting()) {
                Integer v104 = v10_39;
                v101_1.updateRememberedValue(Integer.valueOf(v92));
                v5_69.apply(Integer.valueOf(v92), v11_13);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v101_1.rememberedValue(), Integer.valueOf(v92))) {
                }
            }
            int v5_73;
            androidx.compose.runtime.Updater.set-impl(v5_69, v9_27, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            v98 = (((384 >> 6) & 112) | 6);
            int v99 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -595378919, "C197@7189L289,203@7503L40,204@7568L1173:CommonComponents.kt#qonjpd");
            if (p179 == null) {
                v5_73 = "--\u00b0C";
            } else {
                v5_73 = String.format("%.0f\u00b0C", java.util.Arrays.copyOf(new Object[] {Double.valueOf(p179.getTemperature())}), 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v5_73, "format(...)");
            }
            androidx.compose.material3.TextKt.Text--4IGK_g(v5_73, 0, androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(32), 0, androidx.compose.ui.text.font.FontWeight.Companion.getBold(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p182, 200064, 0, 131026);
            int v106 = 0;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), p182, 6);
            int v105_6 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            int v6_33 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
            int v10_47 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v6_33, androidx.compose.ui.Alignment.Companion.getStart(), p182, (((v105_6 >> 3) & 14) | ((v105_6 >> 3) & 112)));
            androidx.compose.foundation.layout.Arrangement$Vertical v109 = v6_33;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v110_3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p182, 0);
            int v6_36 = p182.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v9_30 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p182, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p182.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p182.startReusableNode();
            if (!p182.getInserting()) {
                p182.useNode();
            } else {
                p182.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            int v5_96 = androidx.compose.runtime.Updater.constructor-impl(p182);
            androidx.compose.runtime.Updater.set-impl(v5_96, v10_47, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v5_96, v6_36, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.ui.layout.MeasurePolicy v8_38 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.runtime.Composer v119_2 = v5_96;
            if (v119_2.getInserting()) {
                Integer v122 = v10_47;
                v119_2.updateRememberedValue(Integer.valueOf(v110_3));
                v5_96.apply(Integer.valueOf(v110_3), v8_38);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v119_2.rememberedValue(), Integer.valueOf(v110_3))) {
                }
            }
            int v2_3;
            androidx.compose.runtime.Updater.set-impl(v5_96, v9_30, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int v10 = (((0 >> 6) & 112) | 6);
            int v81 = 0;
            int v117 = (((((((0 << 3) & 112) << 6) & 896) | 6) >> 6) & 14);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, 610605577, "C205@7605L287,211@7921L794:CommonComponents.kt#qonjpd");
            if (p179 == null) {
                v2_3 = "Carregando clima...";
            } else {
                v2_3 = p179.getCondition();
                if (v2_3 == 0) {
                }
            }
            androidx.compose.material3.TextKt.Text--4IGK_g(v2_3, 0, androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(14), 0, androidx.compose.ui.text.font.FontWeight.Companion.getSemiBold(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p182, 200064, 0, 131026);
            int v2_7 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            int v124_0 = 384;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v8_2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v2_7, p182, (((v124_0 >> 3) & 14) | ((v124_0 >> 3) & 112)));
            androidx.compose.ui.Alignment$Vertical v127 = v2_7;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v2_10 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p182, 0);
            int v4_0 = p182.getCurrentCompositionLocalMap();
            int v20_0 = v2_10;
            int v2_11 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p182, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            kotlin.jvm.functions.Function0 vtmp168 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.ui.Modifier v129_0 = vtmp168;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p182, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p182.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p182.startReusableNode();
            if (!p182.getInserting()) {
                p182.useNode();
            } else {
                p182.createNode(v129_0);
            }
            Integer v136;
            int v6_17 = androidx.compose.runtime.Updater.constructor-impl(p182);
            androidx.compose.runtime.Updater.set-impl(v6_17, v8_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v6_17, v4_0, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            boolean v0_10 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v133_1 = v6_17;
            if (v133_1.getInserting()) {
                v136 = p182;
                v133_1.updateRememberedValue(Integer.valueOf(v20_0));
                v6_17.apply(Integer.valueOf(v20_0), v0_10);
            } else {
                v136 = p182;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v133_1.rememberedValue(), Integer.valueOf(v20_0))) {
                }
            }
            boolean v0_24;
            androidx.compose.runtime.Updater.set-impl(v6_17, v2_11, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            int v4_5 = v136;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v6 = (((384 >> 6) & 112) | 6);
            int v26 = (((((((384 << 3) & 112) << 6) & 896) | 6) >> 6) & 14);
            androidx.compose.ui.Modifier v129 = v2_11;
            int v2_12 = v4_5;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_12, 1341969565, "C212@8007L317,218@8357L39,219@8429L256:CommonComponents.kt#qonjpd");
            androidx.compose.ui.graphics.vector.ImageVector v137_1 = androidx.compose.material.icons.filled.AirKt.getAir(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            long v140_2 = androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 1061997773, 0, 0, 0, 14, 0);
            Integer v142_3 = v2_12;
            androidx.compose.ui.Modifier v139_1 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 14)));
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v137_1, "Vento", v139_1, v140_2, v142_3, 3504, 0);
            int v2_14 = v142_3;
            Integer v134 = v4_5;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 4))), v2_14, 6);
            if (p179 == null) {
                v0_24 = 4624633867356078080;
            } else {
                v0_24 = p179.getWindSpeed();
            }
            Integer v142_4 = v2_14;
            androidx.compose.material3.TextKt.Text--4IGK_g(new StringBuilder().append("Vento: ").append(v0_24).append(" km/h").toString(), 0, androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 1061997773, 0, 0, 0, 14, 0), androidx.compose.ui.unit.TextUnitKt.getSp(12), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v142_4, 3456, 0, 131058);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v142_4);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v134);
            v136.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v136);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v136);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v136);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            p182.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            p182.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            p182.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.material3.IconButtonKt.IconButton(p178, 0, 0, 0, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-211904370, 1, new com.example.ui.components.CommonComponentsKt$$ExternalSyntheticLambda8(p180), p182, 54)), p182, 196608, 30);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            p182.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            p182.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p182);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit WeatherCard$lambda$15$lambda$14$lambda$13$lambda$12(boolean p10, androidx.compose.runtime.Composer p11, int p12)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p11, "C:CommonComponents.kt#qonjpd");
        if (((p12 & 3) == 2) && (p11.getSkipping())) {
            p11.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-211904370, p12, -1, "com.example.ui.components.WeatherCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommonComponents.kt:230)");
            }
            if (!p10) {
                p11.startReplaceGroup(759144081);
                androidx.compose.runtime.ComposerKt.sourceInformation(p11, "237@9157L211");
                androidx.compose.ui.graphics.vector.ImageVector vtmp8 = androidx.compose.material.icons.filled.RefreshKt.getRefresh(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
                androidx.compose.material3.IconKt.Icon-ww6aTOc(vtmp8, "Atualizar Clima", 0, androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), p11, 3120, 4);
                p11.endReplaceGroup();
            } else {
                p11.startReplaceGroup(758883123);
                androidx.compose.runtime.ComposerKt.sourceInformation(p11, "231@8894L209");
                String v1_4 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
                long v3_1 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 2));
                boolean v0_15 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 24)));
                androidx.compose.material3.ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(v0_15, v1_4, v3_1, 0, 0, p11, 438, 24);
                p11.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit WeatherCard$lambda$16(com.example.data.model.WeatherData p8, boolean p9, kotlin.jvm.functions.Function0 p10, androidx.compose.ui.Modifier p11, int p12, int p13, androidx.compose.runtime.Composer p14, int p15)
    {
        com.example.ui.components.CommonComponentsKt.WeatherCard(p8, p9, p10, p11, p14, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p12 | 1)), p13);
        return kotlin.Unit.INSTANCE;
    }

    public static final java.util.List getSPORTS_LIST()
    {
        return com.example.ui.components.CommonComponentsKt.SPORTS_LIST;
    }

    public static final long getSportColor(String p2)
    {
        long v0_6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "sport");
        long v0_11 = p2.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_11, "toLowerCase(...)");
        switch (v0_11.hashCode()) {
            case -2075210991:
                if (v0_11.equals("gin\u00e1stica")) {
                    v0_6 = androidx.compose.ui.graphics.ColorKt.Color(4285143962);
                } else {
                    v0_6 = androidx.compose.ui.graphics.ColorKt.Color(4278220697);
                }
                break;
            case -1709438626:
                if (v0_11.equals("basquete")) {
                    v0_6 = androidx.compose.ui.graphics.ColorKt.Color(4293284096);
                } else {
                }
                break;
            case -1444775023:
                if (v0_11.equals("ginastica")) {
                } else {
                }
                break;
            case -658751002:
                if (v0_11.equals("v\u00f4lei de praia")) {
                    v0_6 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
                } else {
                }
                break;
            case -504059329:
                if (v0_11.equals("futebol")) {
                    v0_6 = androidx.compose.ui.graphics.ColorKt.Color(4281236786);
                } else {
                }
                break;
            case -290856735:
                if (v0_11.equals("volei de praia")) {
                } else {
                }
                break;
            case 112389303:
                if (v0_11.equals("volei")) {
                } else {
                }
                break;
            default:
        }
        return v0_6;
    }

    public static final androidx.compose.ui.graphics.vector.ImageVector getSportIcon(String p2)
    {
        androidx.compose.ui.graphics.vector.ImageVector v0_7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "sport");
        androidx.compose.ui.graphics.vector.ImageVector v0_12 = p2.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_12, "toLowerCase(...)");
        switch (v0_12.hashCode()) {
            case -2075210991:
                if (v0_12.equals("gin\u00e1stica")) {
                    v0_7 = androidx.compose.material.icons.filled.FitnessCenterKt.getFitnessCenter(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
                } else {
                    v0_7 = androidx.compose.material.icons.filled.SportsSoccerKt.getSportsSoccer(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
                }
                break;
            case -1709438626:
                if (v0_12.equals("basquete")) {
                    v0_7 = androidx.compose.material.icons.filled.SportsBasketballKt.getSportsBasketball(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
                } else {
                }
                break;
            case -1444775023:
                if (v0_12.equals("ginastica")) {
                } else {
                }
                break;
            case -658751002:
                if (v0_12.equals("v\u00f4lei de praia")) {
                    v0_7 = androidx.compose.material.icons.filled.SportsVolleyballKt.getSportsVolleyball(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
                } else {
                }
                break;
            case -504059329:
                if (v0_12.equals("futebol")) {
                    v0_7 = androidx.compose.material.icons.filled.SportsSoccerKt.getSportsSoccer(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
                } else {
                }
                break;
            case -290856735:
                if (v0_12.equals("volei de praia")) {
                } else {
                }
                break;
            case 112389303:
                if (v0_12.equals("volei")) {
                } else {
                }
                break;
            default:
        }
        return v0_7;
    }
}
