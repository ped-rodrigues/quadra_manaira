package com.example.ui.screens;
public final class ProfileScreenKt {

    public static final void EditProfileDialog(com.example.data.model.UserEntity p29, kotlin.jvm.functions.Function0 p30, kotlin.jvm.functions.Function4 p31, androidx.compose.runtime.Composer p32, int p33)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p29, "user");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p30, "onDismiss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p31, "onSave");
        long v9_0 = p32.startRestartGroup(-350334274);
        androidx.compose.runtime.ComposerKt.sourceInformation(v9_0, "C(EditProfileDialog)P(2)444@19443L38,445@19503L43,446@19572L39,447@19637L42,520@22832L277,528@23135L104,454@19914L2892,451@19771L3474:ProfileScreen.kt#2thlc2");
        kotlin.jvm.functions.Function2 v4_3 = p33;
        if ((p33 & 6) == 0) {
            int v5_11;
            if (!v9_0.changed(p29)) {
                v5_11 = 2;
            } else {
                v5_11 = 4;
            }
            v4_3 = (p33 | v5_11);
        }
        if ((p33 & 48) == 0) {
            int v5_14;
            if (!v9_0.changedInstance(p30)) {
                v5_14 = 16;
            } else {
                v5_14 = 32;
            }
            v4_3 |= v5_14;
        }
        if ((p33 & 384) == 0) {
            int v5_17;
            if (!v9_0.changedInstance(p31)) {
                v5_17 = 128;
            } else {
                v5_17 = 256;
            }
            v4_3 |= v5_17;
        }
        androidx.compose.runtime.Composer v19_0;
        int v10 = v4_3;
        if (((v10 & 147) == 146) && (v9_0.getSkipping())) {
            v9_0.skipToGroupEnd();
            v19_0 = v9_0;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-350334274, v10, -1, "com.example.ui.screens.EditProfileDialog (ProfileScreen.kt:443)");
            }
            int v32_1;
            kotlin.jvm.functions.Function2 v6_3;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_0, -1663782172, "CC(remember):ProfileScreen.kt#9igjgp");
            int v5_20 = v9_0;
            Object v12_3 = v5_20.rememberedValue();
            if (v12_3 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v32_1 = 4;
                v6_3 = v12_3;
            } else {
                v32_1 = 4;
                v6_3 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(p29.getName(), 0, 2, 0);
                v5_20.updateRememberedValue(v6_3);
            }
            long v13_0;
            androidx.compose.runtime.Composer v19_2 = ((androidx.compose.runtime.MutableState) v6_3);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v9_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_0, -1663780247, "CC(remember):ProfileScreen.kt#9igjgp");
            int v5_21 = v9_0;
            long v11_4 = v5_21.rememberedValue();
            if (v11_4 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v13_0 = v11_4;
            } else {
                v13_0 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(p29.getBirthDate(), 0, 2, 0);
                v5_21.updateRememberedValue(v13_0);
            }
            long v13_3;
            int v20_1 = ((androidx.compose.runtime.MutableState) v13_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v9_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_0, -1663778043, "CC(remember):ProfileScreen.kt#9igjgp");
            int v5_0 = v9_0;
            long v11_0 = v5_0.rememberedValue();
            if (v11_0 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v13_3 = v11_0;
            } else {
                v13_3 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(p29.getSport(), 0, 2, 0);
                v5_0.updateRememberedValue(v13_3);
            }
            Object v12_2;
            int v21_1 = ((androidx.compose.runtime.MutableState) v13_3);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v9_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_0, -1663775960, "CC(remember):ProfileScreen.kt#9igjgp");
            kotlin.jvm.functions.Function2 v4_2 = v9_0;
            kotlin.jvm.functions.Function2 v6_0 = v4_2.rememberedValue();
            if (v6_0 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v12_2 = v6_0;
            } else {
                v12_2 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(p29.getPhotoUri(), 0, 2, 0);
                v4_2.updateRememberedValue(v12_2);
            }
            int v18_1 = ((androidx.compose.runtime.MutableState) v12_2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v9_0);
            boolean v2_4 = new String[5];
            v2_4[0] = "avatar_1";
            v2_4[1] = "avatar_2";
            v2_4[2] = "avatar_3";
            v2_4[3] = "avatar_4";
            v2_4[v32_1] = "avatar_5";
            int v17_0 = kotlin.collections.CollectionsKt.listOf(v2_4);
            androidx.compose.runtime.MutableState v26 = v18_1;
            androidx.compose.runtime.MutableState v24 = v20_1;
            v19_0 = v9_0;
            androidx.compose.material3.AndroidAlertDialog_androidKt.AlertDialog-Oix01E0(p30, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(434201862, 1, new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda16(p31, v19_2, v20_1, v21_1, v18_1), v9_0, 54)), 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-272394744, 1, new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda17(p30), v9_0, 54)), 0, com.example.ui.screens.ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$-978991350$app(), ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(815193995, 1, new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda18(v17_0, v18_1, v19_2, v20_1, v21_1), v9_0, 54)), 0, 0, 0, 0, 0, 0, 0, v19_0, (((v10 >> 3) & 14) | 1772592), 0, 16276);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        boolean v2_10 = v19_0.endRestartGroup();
        if (!v2_10) {
            int v8 = p33;
        } else {
            v2_10.updateScope(new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda19(p29, p30, p31, p33));
        }
        return;
    }

    private static final String EditProfileDialog$lambda$52(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void EditProfileDialog$lambda$53(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final String EditProfileDialog$lambda$55(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void EditProfileDialog$lambda$56(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final String EditProfileDialog$lambda$58(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void EditProfileDialog$lambda$59(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final String EditProfileDialog$lambda$61(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void EditProfileDialog$lambda$62(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    static final kotlin.Unit EditProfileDialog$lambda$65(kotlin.jvm.functions.Function4 p14, androidx.compose.runtime.MutableState p15, androidx.compose.runtime.MutableState p16, androidx.compose.runtime.MutableState p17, androidx.compose.runtime.MutableState p18, androidx.compose.runtime.Composer p19, int p20)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p19, "C522@22880L57,523@22979L48,521@22846L253:ProfileScreen.kt#2thlc2");
        if (((p20 & 3) == 2) && (p19.getSkipping())) {
            p19.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(434201862, p20, -1, "com.example.ui.screens.EditProfileDialog.<anonymous> (ProfileScreen.kt:521)");
            }
            int v2_3;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p19, 656163263, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean v0_4 = p19.changed(p14);
            androidx.compose.runtime.Composer v10_0 = p19.rememberedValue();
            if ((!v0_4) && (v10_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v2_3 = v10_0;
            } else {
                v2_3 = new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda0(p14, p15, p16, p17, p18);
                p19.updateRememberedValue(v2_3);
            }
            int v12_1 = ((kotlin.jvm.functions.Function0) v2_3);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p19);
            androidx.compose.material3.ButtonKt.Button(v12_1, 0, 0, 0, androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 0, 0, 0, p19, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14), 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$-1284003594$app(), p19, 805306368, 494);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit EditProfileDialog$lambda$65$lambda$64$lambda$63(kotlin.jvm.functions.Function4 p4, androidx.compose.runtime.MutableState p5, androidx.compose.runtime.MutableState p6, androidx.compose.runtime.MutableState p7, androidx.compose.runtime.MutableState p8)
    {
        p4.invoke(com.example.ui.screens.ProfileScreenKt.EditProfileDialog$lambda$52(p5), com.example.ui.screens.ProfileScreenKt.EditProfileDialog$lambda$55(p6), com.example.ui.screens.ProfileScreenKt.EditProfileDialog$lambda$58(p7), com.example.ui.screens.ProfileScreenKt.EditProfileDialog$lambda$61(p8));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit EditProfileDialog$lambda$66(kotlin.jvm.functions.Function0 p15, androidx.compose.runtime.Composer p16, int p17)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p16, "C529@23149L80:ProfileScreen.kt#2thlc2");
        if (((p17 & 3) == 2) && (p16.getSkipping())) {
            p16.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-272394744, p17, -1, "com.example.ui.screens.EditProfileDialog.<anonymous> (ProfileScreen.kt:529)");
            }
            androidx.compose.material3.ButtonKt.TextButton(p15, 0, 0, 0, 0, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$-13197307$app(), p16, 805306368, 510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit EditProfileDialog$lambda$82(java.util.List p95, androidx.compose.runtime.MutableState p96, androidx.compose.runtime.MutableState p97, androidx.compose.runtime.MutableState p98, androidx.compose.runtime.MutableState p99, androidx.compose.runtime.Composer p100, int p101)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p100, "C455@19928L2868:ProfileScreen.kt#2thlc2");
        if (((p101 & 3) == 2) && (p100.getSkipping())) {
            p100.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(815193995, p101, -1, "com.example.ui.screens.EditProfileDialog.<anonymous> (ProfileScreen.kt:455)");
            }
            int v1_5 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Object v11_0 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
            androidx.compose.ui.layout.MeasurePolicy v13_3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v11_0, androidx.compose.ui.Alignment.Companion.getStart(), p100, (((6 >> 3) & 14) | ((6 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v19 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p100, 0);
            int v9_8 = p100.getCurrentCompositionLocalMap();
            androidx.compose.runtime.MutableState v4_15 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p100, v1_5);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p100.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p100.startReusableNode();
            if (!p100.getInserting()) {
                p100.useNode();
            } else {
                p100.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            String v0_21 = androidx.compose.runtime.Updater.constructor-impl(p100);
            androidx.compose.runtime.Updater.set-impl(v0_21, v13_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v0_21, v9_8, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda26 v2_0 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v29_0 = v0_21;
            if ((v29_0.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v29_0.rememberedValue(), Integer.valueOf(v19)))) {
                v29_0.updateRememberedValue(Integer.valueOf(v19));
                v0_21.apply(Integer.valueOf(v19), v2_0);
            }
            androidx.compose.runtime.Updater.set-impl(v0_21, v4_15, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            androidx.compose.foundation.layout.ColumnScope v28 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            int v30 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, 1170071001, "C456@19989L83,457@20089L40,458@20146L667,475@20831L41,479@20979L13,477@20890L261,485@21169L40,489@21321L18,487@21227L285,495@21530L41,497@21589L78,498@21684L40,499@21741L1041:ProfileScreen.kt#2thlc2");
            androidx.compose.material3.TextKt.Text--4IGK_g("Alterar Foto de Perfil:", 0, 0, androidx.compose.ui.unit.TextUnitKt.getSp(12), 0, androidx.compose.ui.text.font.FontWeight.Companion.getSemiBold(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p100, 199686, 0, 131030);
            int v65 = 0;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 6))), p100, 6);
            com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda26 v2_19 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            int v5_10 = ((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v8_7 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v5_10, androidx.compose.ui.Alignment.Companion.getTop(), p100, (((54 >> 3) & 14) | ((54 >> 3) & 112)));
            int v37 = v5_10;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            kotlin.jvm.functions.Function0 v38_0 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p100, 0);
            int v5_14 = p100.getCurrentCompositionLocalMap();
            int v7_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p100, v2_19);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p100.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p100.startReusableNode();
            if (!p100.getInserting()) {
                p100.useNode();
            } else {
                p100.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda26 v2_28 = androidx.compose.runtime.Updater.constructor-impl(p100);
            androidx.compose.runtime.Updater.set-impl(v2_28, v8_7, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v2_28, v5_14, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v6_23 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.shape.RoundedCornerShape v47_0 = v2_28;
            if (v47_0.getInserting()) {
                int v50 = v8_7;
                v47_0.updateRememberedValue(Integer.valueOf(v38_0));
                v2_28.apply(Integer.valueOf(v38_0), v6_23);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v47_0.rememberedValue(), Integer.valueOf(v38_0))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v2_28, v7_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v8_2 = (((54 >> 6) & 112) | 6);
            int v48 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v6_8 = p100;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -1076468929, "C:ProfileScreen.kt#2thlc2");
            p100.startReplaceGroup(242370108);
            androidx.compose.runtime.ComposerKt.sourceInformation(p100, "*468@20617L22,464@20425L348");
            com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda26 v2_7 = ((Iterable) p95);
            int v53_1 = ((Iterable) p95).iterator();
            while(true) {
                androidx.compose.ui.Modifier v55_1 = v2_7;
                com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda26 v2_38 = "CC(remember):ProfileScreen.kt#9igjgp";
                if (!v53_1.hasNext()) {
                    break;
                }
                androidx.compose.ui.Modifier v77_3;
                com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda26 v2_46;
                int v56_5 = v7_1;
                int v7_41 = ((String) v53_1.next());
                int v58_3 = v8_2;
                kotlin.jvm.internal.Intrinsics.areEqual(com.example.ui.screens.ProfileScreenKt.EditProfileDialog$lambda$61(p96), v7_41);
                int v75 = v9_8;
                Object v76 = v11_0;
                int v68_0 = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 42))), ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()));
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_8, -1922543445, "CC(remember):ProfileScreen.kt#9igjgp");
                com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda26 v2_44 = v6_8.changed(v7_41);
                int v8_35 = v6_8;
                Object v11_9 = v8_35.rememberedValue();
                if ((v2_44 == null) && (v11_9 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v77_3 = v6_8;
                    v2_46 = v11_9;
                } else {
                    v77_3 = v6_8;
                    v2_46 = new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda11(v7_41, p96);
                    v8_35.updateRememberedValue(v2_46);
                }
                androidx.compose.runtime.Composer v72_2 = ((kotlin.jvm.functions.Function0) v2_46);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v77_3);
                com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda26 v2_50 = androidx.compose.foundation.ClickableKt.clickable-XHw0xAI$default(v68_0, 0, 0, 0, v72_2, 7, 0);
                int v9_21 = v77_3;
                int v68_1 = v7_41;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_21, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                int v6_47 = androidx.compose.ui.Alignment.Companion.getTopStart();
                int v8_37 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(v6_47, 0);
                int v80 = v6_47;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_21, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                long v81_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v9_21, 0);
                int v6_50 = v9_21.getCurrentCompositionLocalMap();
                int v7_44 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v9_21, v2_50);
                kotlin.jvm.functions.Function0 vtmp80 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                int v84_2 = vtmp80;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v9_21, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(v9_21.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                v9_21.startReusableNode();
                if (!v9_21.getInserting()) {
                    v9_21.useNode();
                } else {
                    v9_21.createNode(v84_2);
                }
                com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda26 v2_62 = androidx.compose.runtime.Updater.constructor-impl(v9_21);
                int v87_0 = v9_21;
                androidx.compose.runtime.Updater.set-impl(v2_62, v8_37, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.set-impl(v2_62, v6_50, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                int v9_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                int v71_0 = v2_62;
                if (v71_0.getInserting()) {
                    int v89 = v8_37;
                    v71_0.updateRememberedValue(Integer.valueOf(v81_2));
                    v2_62.apply(Integer.valueOf(v81_2), v9_4);
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(v71_0.rememberedValue(), Integer.valueOf(v81_2))) {
                    }
                }
                androidx.compose.runtime.Updater.set-impl(v2_62, v7_44, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
                int v6_6 = v87_0;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_6, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                int v9 = (((0 >> 6) & 112) | 6);
                androidx.compose.runtime.Composer v72_0 = v6_6;
                androidx.compose.foundation.layout.BoxScope v92 = ((androidx.compose.foundation.layout.BoxScope) androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE);
                androidx.compose.runtime.Composer v93 = v6_6;
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v72_0, 1714938785, "C470@20696L51:ProfileScreen.kt#2thlc2");
                com.example.ui.components.CommonComponentsKt.UserAvatarView(v68_1, v68_1, 40, 0, v72_0, 384, 8);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v72_0);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v93);
                v87_0.endNode();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v87_0);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v87_0);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v87_0);
                v2_7 = v55_1;
                v7_1 = v56_5;
                v8_2 = v58_3;
                v9_8 = v75;
                v11_0 = v76;
                v6_8 = v77_3;
            }
            androidx.compose.runtime.MutableState v4_4;
            androidx.compose.ui.Modifier v77_0 = v6_8;
            int v58 = v8_2;
            v76 = v11_0;
            v77_0.endReplaceGroup();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v77_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
            p100.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), p100, 6);
            int v33_2 = com.example.ui.screens.ProfileScreenKt.EditProfileDialog$lambda$52(p97);
            androidx.compose.ui.Modifier v35_5 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, 314867790, "CC(remember):ProfileScreen.kt#9igjgp");
            int v9_12 = p100.rememberedValue();
            if (v9_12 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                int v6 = p97;
                v4_4 = v9_12;
            } else {
                int v36 = 0;
                v4_4 = new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda22(p97);
                p100.updateRememberedValue(v4_4);
            }
            androidx.compose.runtime.MutableState v4_10;
            androidx.compose.foundation.layout.Arrangement$Vertical v34_3 = ((kotlin.jvm.functions.Function1) v4_4);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
            kotlin.jvm.functions.Function2 vtmp67 = com.example.ui.screens.ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$-1747808741$app();
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(v33_2, v34_3, v35_5, 0, 0, 0, vtmp67, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, p100, 1573296, 12582912, 0, 8257464);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))), p100, 6);
            int v33_3 = com.example.ui.screens.ProfileScreenKt.EditProfileDialog$lambda$55(p98);
            androidx.compose.ui.Modifier v35_6 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, 314878739, "CC(remember):ProfileScreen.kt#9igjgp");
            Object v11_4 = p100.rememberedValue();
            if (v11_4 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v4_10 = v11_4;
            } else {
                v4_10 = new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda25(p98);
                p100.updateRememberedValue(v4_10);
            }
            androidx.compose.foundation.layout.Arrangement$Vertical v34_5 = ((kotlin.jvm.functions.Function1) v4_10);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
            kotlin.jvm.functions.Function2 vtmp83 = com.example.ui.screens.ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$10792082$app();
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(v33_3, v34_5, v35_6, 0, 0, 0, vtmp83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, p100, 1573296, 12582912, 0, 8257464);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), p100, 6);
            androidx.compose.material3.TextKt.Text--4IGK_g("Esporte Praticado:", 0, 0, androidx.compose.ui.unit.TextUnitKt.getSp(12), 0, androidx.compose.ui.text.font.FontWeight.Companion.getSemiBold(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p100, 199686, 0, 131030);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 6))), p100, 6);
            int v7_28 = ((androidx.compose.foundation.layout.Arrangement$Vertical) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 4))));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            int v6_35 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v7_28, androidx.compose.ui.Alignment.Companion.getStart(), p100, (((48 >> 3) & 14) | ((48 >> 3) & 112)));
            androidx.compose.foundation.layout.Arrangement$Vertical v34 = v7_28;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            boolean v3_5 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p100, 0);
            int v7_30 = p100.getCurrentCompositionLocalMap();
            int v18 = v3_5;
            boolean v3_6 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p100, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p100.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p100.startReusableNode();
            if (!p100.getInserting()) {
                p100.useNode();
            } else {
                p100.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            androidx.compose.runtime.MutableState v4_23 = androidx.compose.runtime.Updater.constructor-impl(p100);
            androidx.compose.runtime.Updater.set-impl(v4_23, v6_35, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v4_23, v7_30, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v1_15 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            java.util.Iterator v39_4 = v4_23;
            if (v39_4.getInserting()) {
                Integer v42 = v7_30;
                v39_4.updateRememberedValue(Integer.valueOf(v18));
                v4_23.apply(Integer.valueOf(v18), v1_15);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v39_4.rememberedValue(), Integer.valueOf(v18))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v4_23, v3_6, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.MutableState v4_24 = p100;
            int v6_40 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int v7_36 = (((48 >> 6) & 112) | 6);
            androidx.compose.foundation.layout.ColumnScope v26 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -468176452, "C:ProfileScreen.kt#2thlc2");
            p100.startReplaceGroup(1370371227);
            androidx.compose.runtime.ComposerKt.sourceInformation(p100, "*507@22263L25,508@22315L427,502@21939L803");
            String v0_12 = ((Iterable) com.example.ui.components.CommonComponentsKt.getSPORTS_LIST());
            int v5_26 = 0;
            java.util.Iterator v39_5 = v0_12.iterator();
            while (v39_5.hasNext()) {
                androidx.compose.runtime.MutableState v46_7;
                String v43_3 = v0_12;
                String v0_18 = ((String) v39_5.next());
                boolean v45_5 = v3_6;
                boolean v3_8 = kotlin.jvm.internal.Intrinsics.areEqual(com.example.ui.screens.ProfileScreenKt.EditProfileDialog$lambda$58(p99), v0_18);
                if (!v3_8) {
                    v46_7 = androidx.compose.ui.graphics.Color.Companion.getTransparent-0d7_KjU();
                } else {
                    v46_7 = androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 1041865114, 0, 0, 0, 14, 0);
                }
                com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda26 v2_39;
                com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda26 v52_5;
                long v79_1 = v46_7;
                androidx.compose.runtime.MutableState v46_9 = v4_24;
                int v48_4 = v5_26;
                int v17 = v6_40;
                int v22 = v7_36;
                androidx.compose.ui.Modifier v55_5 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p100, -881470976, v2_38);
                int v5_31 = p100.changed(v0_18);
                androidx.compose.runtime.MutableState v4_29 = p100.rememberedValue();
                if ((v5_31 == 0) && (v4_29 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v52_5 = v2_38;
                    v2_39 = v4_29;
                    androidx.compose.runtime.MutableState v4 = p99;
                } else {
                    v52_5 = v2_38;
                    v2_39 = new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda26(v0_18, p99);
                    p100.updateRememberedValue(v2_39);
                }
                kotlin.jvm.functions.Function0 v59_3 = ((kotlin.jvm.functions.Function0) v2_39);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
                androidx.compose.ui.Modifier v77_2 = androidx.compose.foundation.ClickableKt.clickable-XHw0xAI$default(v55_5, 0, 0, 0, v59_3, 7, 0);
                androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(v77_2, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)))), v79_1, 0, 0, 0, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1439711092, 1, new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda27(v3_8, v0_18), p100, 54)), p100, 12582912, 120);
                v6_40 = v17;
                v7_36 = v22;
                v0_12 = v43_3;
                v3_6 = v45_5;
                v4_24 = v46_9;
                v5_26 = v48_4;
                v2_38 = v52_5;
            }
            androidx.compose.runtime.MutableState v46_5 = v4_24;
            v17 = v6_40;
            v4 = p99;
            p100.endReplaceGroup();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v46_5);
            p100.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
            p100.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p100);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit EditProfileDialog$lambda$82$lambda$81$lambda$71$lambda$70$lambda$68$lambda$67(String p1, androidx.compose.runtime.MutableState p2)
    {
        com.example.ui.screens.ProfileScreenKt.EditProfileDialog$lambda$62(p2, p1);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit EditProfileDialog$lambda$82$lambda$81$lambda$73$lambda$72(androidx.compose.runtime.MutableState p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        com.example.ui.screens.ProfileScreenKt.EditProfileDialog$lambda$53(p1, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit EditProfileDialog$lambda$82$lambda$81$lambda$75$lambda$74(androidx.compose.runtime.MutableState p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        com.example.ui.screens.ProfileScreenKt.EditProfileDialog$lambda$56(p1, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit EditProfileDialog$lambda$82$lambda$81$lambda$80$lambda$79$lambda$77$lambda$76(String p1, androidx.compose.runtime.MutableState p2)
    {
        com.example.ui.screens.ProfileScreenKt.EditProfileDialog$lambda$59(p2, p1);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit EditProfileDialog$lambda$82$lambda$81$lambda$80$lambda$79$lambda$78(boolean p27, String p28, androidx.compose.runtime.Composer p29, int p30)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p29, "C509@22345L371:ProfileScreen.kt#2thlc2");
        if (((p30 & 3) == 2) && (p29.getSkipping())) {
            p29.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1439711092, p30, -1, "com.example.ui.screens.EditProfileDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:509)");
            }
            boolean v1_4;
            boolean v1_3 = androidx.compose.ui.text.font.FontWeight.Companion;
            if (!p27) {
                v1_4 = v1_3.getNormal();
            } else {
                v1_4 = v1_3.getBold();
            }
            androidx.compose.ui.Modifier v3_1;
            androidx.compose.ui.text.font.FontWeight v9 = v1_4;
            if (!p27) {
                v3_1 = androidx.compose.ui.graphics.Color.Companion.getBlack-0d7_KjU();
            } else {
                v3_1 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
            }
            long v4_1 = v3_1;
            androidx.compose.ui.Modifier v3_5 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10)), androidx.compose.ui.unit.Dp.constructor-impl(((float) 6)));
            androidx.compose.material3.TextKt.Text--4IGK_g(p28, v3_5, v4_1, 0, 0, v9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p29, 48, 0, 131032);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit EditProfileDialog$lambda$83(com.example.data.model.UserEntity p1, kotlin.jvm.functions.Function0 p2, kotlin.jvm.functions.Function4 p3, int p4, androidx.compose.runtime.Composer p5, int p6)
    {
        com.example.ui.screens.ProfileScreenKt.EditProfileDialog(p1, p2, p3, p5, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p4 | 1)));
        return kotlin.Unit.INSTANCE;
    }

    public static final void ProfileScreen(com.example.ui.viewmodel.QuadraViewModel p34, androidx.compose.runtime.Composer p35, int p36)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p34, "viewModel");
        androidx.compose.runtime.Composer v8_1 = p35.startRestartGroup(-200484334);
        androidx.compose.runtime.ComposerKt.sourceInformation(v8_1, "C(ProfileScreen)71@3244L7,72@3297L16,73@3353L16,74@3409L16,75@3467L16,77@3544L16,78@3624L16,86@3868L12715,80@3646L12937:ProfileScreen.kt#2thlc2");
        int v2_0 = p36;
        if ((p36 & 6) == 0) {
            kotlin.jvm.functions.Function4 v3_2;
            if (!v8_1.changedInstance(p34)) {
                v3_2 = 2;
            } else {
                v3_2 = 4;
            }
            v2_0 = (p36 | v3_2);
        }
        kotlin.jvm.functions.Function2 v9_5 = v2_0;
        if (((v9_5 & 3) == 2) && (v8_1.getSkipping())) {
            v8_1.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-200484334, v9_5, -1, "com.example.ui.screens.ProfileScreen (ProfileScreen.kt:70)");
            }
            kotlin.jvm.functions.Function2 v0_0;
            int v2_10;
            kotlin.jvm.functions.Function4 v3_8 = v8_1;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v3_8, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            android.content.Context v5_1 = v3_8.consume(((androidx.compose.runtime.CompositionLocal) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v3_8);
            android.content.Context v5_2 = ((android.content.Context) v5_1);
            androidx.compose.runtime.State v4_1 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p34.getCurrentUser(), 0, v8_1, 0, 1);
            androidx.compose.runtime.State v6_1 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p34.getAllUsers(), 0, v8_1, 0, 1);
            kotlin.jvm.functions.Function2 v0_18 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p34.isOnline(), 0, v8_1, 0, 1);
            kotlin.jvm.functions.Function4 v3_10 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p34.isSyncing(), 0, v8_1, 0, 1);
            androidx.compose.runtime.State v30 = androidx.compose.runtime.SnapshotStateKt.collectAsState(((kotlinx.coroutines.flow.StateFlow) p34.getShowEditProfileDialog()), 0, v8_1, 0, 1);
            androidx.compose.runtime.State v31 = androidx.compose.runtime.SnapshotStateKt.collectAsState(((kotlinx.coroutines.flow.StateFlow) p34.getShowUpdateCheckerDialog()), 0, v8_1, 0, 1);
            int v12_13 = androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.graphics.ColorKt.Color(4294441724), 0, 2, 0);
            kotlin.jvm.functions.Function2 v13_4 = androidx.compose.foundation.layout.PaddingKt.PaddingValues-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v8_1, 608118941, "CC(remember):ProfileScreen.kt#9igjgp");
            int v15_5 = v8_1;
            long v16_0 = (((((v8_1.changed(v0_18) | v8_1.changed(v3_10)) | v8_1.changedInstance(p34)) | v8_1.changed(v4_1)) | v8_1.changedInstance(v5_2)) | v8_1.changed(v6_1));
            int v2_9 = v15_5.rememberedValue();
            if ((v16_0 == 0) && (v2_9 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v2_10 = v0_18;
                v0_0 = v2_9;
            } else {
                int v19 = v2_9;
                v2_10 = v0_18;
                v0_0 = new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda28(p34, v2_10, v3_10, v4_1, v5_2, v6_1);
                v15_5.updateRememberedValue(v0_0);
            }
            long v16_2 = ((kotlin.jvm.functions.Function1) v0_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v8_1);
            androidx.compose.runtime.Composer v17_0 = v8_1;
            com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda28 v32 = v2_10;
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(v12_13, 0, v13_4, 0, ((androidx.compose.foundation.layout.Arrangement$Vertical) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)))), 0, 0, 0, v16_2, v17_0, 24966, 234);
            v8_1 = v17_0;
            if (!com.example.ui.screens.ProfileScreenKt.ProfileScreen$lambda$4(v30)) {
                v8_1.startReplaceGroup(1667585776);
            } else {
                v8_1.startReplaceGroup(1684112062);
                androidx.compose.runtime.ComposerKt.sourceInformation(v8_1, "");
                kotlin.jvm.functions.Function2 v9_4 = com.example.ui.screens.ProfileScreenKt.ProfileScreen$lambda$0(v4_1);
                if (v9_4 == null) {
                    v8_1.startReplaceGroup(1667585776);
                    v8_1.endReplaceGroup();
                } else {
                    int v2_14;
                    v8_1.startReplaceGroup(1684168575);
                    androidx.compose.runtime.ComposerKt.sourceInformation(v8_1, "380@16792L49,381@16868L243,378@16716L409");
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v8_1, 608519843, "CC(remember):ProfileScreen.kt#9igjgp");
                    int v11_5 = v8_1.changedInstance(p34);
                    int v12_1 = v8_1;
                    kotlin.jvm.functions.Function2 v14_2 = v12_1.rememberedValue();
                    if ((v11_5 == 0) && (v14_2 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                        v2_14 = v14_2;
                    } else {
                        v2_14 = new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda29(p34);
                        v12_1.updateRememberedValue(v2_14);
                    }
                    kotlin.jvm.functions.Function4 v3_3;
                    int v2_16 = ((kotlin.jvm.functions.Function0) v2_14);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v8_1);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v8_1, 608522469, "CC(remember):ProfileScreen.kt#9igjgp");
                    int v10_7 = (v8_1.changedInstance(p34) | v8_1.changedInstance(v5_2));
                    int v11_7 = v8_1;
                    kotlin.jvm.functions.Function2 v13_1 = v11_7.rememberedValue();
                    if ((v10_7 == 0) && (v13_1 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                        v3_3 = v13_1;
                    } else {
                        int v33 = v3_10;
                        v3_3 = new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda30(p34, v5_2);
                        v11_7.updateRememberedValue(v3_3);
                    }
                    kotlin.jvm.functions.Function4 v3_5 = ((kotlin.jvm.functions.Function4) v3_3);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v8_1);
                    com.example.ui.screens.ProfileScreenKt.EditProfileDialog(v9_4, v2_16, v3_5, v8_1, 0);
                    v8_1.endReplaceGroup();
                }
            }
            v8_1.endReplaceGroup();
            if (!com.example.ui.screens.ProfileScreenKt.ProfileScreen$lambda$5(v31)) {
                v8_1.startReplaceGroup(1667585776);
            } else {
                int v12_2;
                v8_1.startReplaceGroup(1684725242);
                androidx.compose.runtime.ComposerKt.sourceInformation(v8_1, "393@17267L51,422@18734L501,401@17704L1000,392@17223L2022");
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v8_1, 608535045, "CC(remember):ProfileScreen.kt#9igjgp");
                kotlin.jvm.functions.Function2 v0_5 = v8_1.changedInstance(p34);
                int v2_23 = v8_1;
                kotlin.jvm.functions.Function2 v9_6 = v2_23.rememberedValue();
                if ((v0_5 == null) && (v9_6 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v12_2 = v9_6;
                } else {
                    v12_2 = new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda31(p34);
                    v2_23.updateRememberedValue(v12_2);
                }
                int v12_4 = ((kotlin.jvm.functions.Function0) v12_2);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v8_1);
                androidx.compose.runtime.Composer v26 = v8_1;
                androidx.compose.material3.AndroidAlertDialog_androidKt.AlertDialog-Oix01E0(v12_4, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-913128932, 1, new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda1(p34, v5_2), v8_1, 54)), 0, 0, 0, com.example.ui.screens.ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$-303113064$app(), ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(923132727, 1, new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda2(p34), v8_1, 54)), 0, 0, 0, 0, 0, 0, 0, v26, 1769520, 0, 16284);
                v8_1 = v26;
            }
            v8_1.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        kotlin.jvm.functions.Function2 v0_11 = v8_1.endRestartGroup();
        if (v0_11 != null) {
            v0_11.updateScope(new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda3(p34, p36));
        }
        return;
    }

    private static final com.example.data.model.UserEntity ProfileScreen$lambda$0(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((com.example.data.model.UserEntity) p4.getValue());
    }

    private static final java.util.List ProfileScreen$lambda$1(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((java.util.List) p4.getValue());
    }

    private static final boolean ProfileScreen$lambda$2(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((Boolean) p4.getValue()).booleanValue();
    }

    private static final boolean ProfileScreen$lambda$3(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((Boolean) p4.getValue()).booleanValue();
    }

    static final kotlin.Unit ProfileScreen$lambda$37$lambda$36(com.example.ui.viewmodel.QuadraViewModel p19, androidx.compose.runtime.State p20, androidx.compose.runtime.State p21, androidx.compose.runtime.State p22, android.content.Context p23, androidx.compose.runtime.State p24, androidx.compose.foundation.lazy.LazyListScope p25)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p25, "$this$LazyColumn");
        androidx.compose.foundation.lazy.LazyListScope.item$default(p25, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1004570714, 1, new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda12(p19, p20, p21))), 3, 0);
        androidx.compose.foundation.lazy.LazyListScope.item$default(p25, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(110879517, 1, new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda13(p22, p19))), 3, 0);
        androidx.compose.foundation.lazy.LazyListScope.item$default(p25, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1076442334, 1, new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda14(p23, p19))), 3, 0);
        androidx.compose.foundation.lazy.LazyListScope.item$default(p25, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2042005151, 1, new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda15(p24))), 3, 0);
        java.util.List v3_3 = ((java.util.Collection) new java.util.ArrayList());
        int v6_1 = ((Iterable) com.example.ui.screens.ProfileScreenKt.ProfileScreen$lambda$1(p24)).iterator();
        while (v6_1.hasNext()) {
            int v10_0;
            kotlin.jvm.functions.Function1 v7_5 = v6_1.next();
            int v14_2 = ((com.example.data.model.UserEntity) v7_5).getId();
            com.example.data.model.UserEntity v18 = com.example.ui.screens.ProfileScreenKt.ProfileScreen$lambda$0(p22);
            if (v18 == null) {
                v10_0 = 0;
            } else {
                v10_0 = v18.getId();
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(v14_2, v10_0)) {
                v3_3.add(v7_5);
            }
        }
        java.util.List v3_4 = ((java.util.List) v3_3);
        int v6_2 = v3_4.size();
        p25.items(v6_2, 0, ((kotlin.jvm.functions.Function1) new com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$37$lambda$36$$inlined$items$default$3(((kotlin.jvm.functions.Function1) com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$37$lambda$36$$inlined$items$default$1.INSTANCE), v3_4)), ((kotlin.jvm.functions.Function4) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-632812321, 1, new com.example.ui.screens.ProfileScreenKt$ProfileScreen$lambda$37$lambda$36$$inlined$items$default$4(v3_4, p19))));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$37$lambda$36$lambda$21(androidx.compose.runtime.State p27, com.example.ui.viewmodel.QuadraViewModel p28, androidx.compose.foundation.lazy.LazyItemScope p29, androidx.compose.runtime.Composer p30, int p31)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p29, "$this$item");
        androidx.compose.runtime.ComposerKt.sourceInformation(p30, "C110@4659L40,111@4742L38,113@4847L5823,108@4564L6106:ProfileScreen.kt#2thlc2");
        if (((p31 & 17) == 16) && (p30.getSkipping())) {
            p30.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(110879517, p31, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:98)");
            }
            boolean v0_6 = com.example.ui.screens.ProfileScreenKt.ProfileScreen$lambda$0(p27);
            if (!v0_6) {
                v0_6 = new com.example.data.model.UserEntity("guest", "Atleta Convidado", "atleta@manaira.com", "10/05/1996", "V\u00f4lei de Praia", "avatar_1", "", 0, 0, 384, 0);
            }
            com.example.data.model.UserEntity v14_2 = v0_6;
            androidx.compose.foundation.shape.RoundedCornerShape v15_1 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 22)));
            androidx.compose.material3.CardColors v10_1 = androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 0, 0, 0, p30, ((androidx.compose.material3.CardDefaults.$stable << 12) | 6), 14);
            androidx.compose.material3.CardElevation v3_5 = androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(((float) 3)), 0, 0, 0, 0, 0, p30, ((androidx.compose.material3.CardDefaults.$stable << 18) | 6), 62);
            boolean v0_15 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.material3.CardKt.Card(v0_15, ((androidx.compose.ui.graphics.Shape) v15_1), v10_1, v3_5, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2080149745, 1, new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda7(v14_2, p28), p30, 54)), p30, 196614, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$37$lambda$36$lambda$21$lambda$20(com.example.data.model.UserEntity p66, com.example.ui.viewmodel.QuadraViewModel p67, androidx.compose.foundation.layout.ColumnScope p68, androidx.compose.runtime.Composer p69, int p70)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p68, "$this$Card");
        androidx.compose.runtime.ComposerKt.sourceInformation(p69, "C114@4865L933,138@5816L4840:ProfileScreen.kt#2thlc2");
        if (((p70 & 17) == 16) && (p69.getSkipping())) {
            p69.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2080149745, p70, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:114)");
            }
            Integer v2_6 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.foundation.layout.Arrangement$Vertical v8_12 = androidx.compose.ui.Alignment.Companion.getBottomCenter();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p69, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            int v10_2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(v8_12, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p69, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            androidx.compose.foundation.layout.ColumnScope v22_1 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p69, 0);
            androidx.compose.ui.Modifier v13_5 = p69.getCurrentCompositionLocalMap();
            int v6_17 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p69, v2_6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p69, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p69.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p69.startReusableNode();
            if (!p69.getInserting()) {
                p69.useNode();
            } else {
                p69.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            boolean v1_68 = androidx.compose.runtime.Updater.constructor-impl(p69);
            androidx.compose.runtime.Updater.set-impl(v1_68, v10_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_68, v13_5, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Integer v3_38 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v33_0 = v1_68;
            if ((v33_0.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v33_0.rememberedValue(), Integer.valueOf(v22_1)))) {
                v33_0.updateRememberedValue(Integer.valueOf(v22_1));
                v1_68.apply(Integer.valueOf(v22_1), v3_38);
            }
            androidx.compose.runtime.Updater.set-impl(v1_68, v6_17, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p69, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p69, 762300446, "C118@5028L458,129@5507L273:ProfileScreen.kt#2thlc2");
            androidx.compose.ui.graphics.Shape v40 = v8_12;
            androidx.compose.material3.ButtonColors v41_0 = ((androidx.compose.foundation.layout.BoxScope) androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE).align(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 110))), androidx.compose.ui.Alignment.Companion.getTopCenter());
            int v6_5 = new androidx.compose.ui.graphics.Color[2];
            v6_5[0] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4278220697));
            v6_5[1] = androidx.compose.ui.graphics.Color.box-impl(androidx.compose.ui.graphics.ColorKt.Color(4278236376));
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.background$default(v41_0, androidx.compose.ui.graphics.Brush$Companion.horizontalGradient-8A-3gB4$default(androidx.compose.ui.graphics.Brush.Companion, kotlin.collections.CollectionsKt.listOf(v6_5), 0, 0, 0, 14, 0), 0, 0, 6, 0), p69, 0);
            Integer v3_10 = androidx.compose.foundation.layout.PaddingKt.padding-qDBjuR0$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, androidx.compose.ui.unit.Dp.constructor-impl(((float) 65)), 0, 0, 13, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p69, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            int v4_8 = androidx.compose.ui.Alignment.Companion.getTopStart();
            int v6_11 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(v4_8, 0);
            int v45 = v4_8;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p69, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            kotlin.jvm.functions.Function3 v46_3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p69, 0);
            int v4_11 = p69.getCurrentCompositionLocalMap();
            int v7_6 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p69, v3_10);
            kotlin.jvm.functions.Function0 vtmp42 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            long v50_0 = vtmp42;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p69, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p69.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p69.startReusableNode();
            if (!p69.getInserting()) {
                p69.useNode();
            } else {
                p69.createNode(v50_0);
            }
            Integer v3_19 = androidx.compose.runtime.Updater.constructor-impl(p69);
            androidx.compose.runtime.Updater.set-impl(v3_19, v6_11, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v3_19, v4_11, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.foundation.layout.Arrangement$Vertical v8_11 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v55_0 = v3_19;
            if (v55_0.getInserting()) {
                Integer v58 = v6_11;
                v55_0.updateRememberedValue(Integer.valueOf(v46_3));
                v3_19.apply(Integer.valueOf(v46_3), v8_11);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v55_0.rememberedValue(), Integer.valueOf(v46_3))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v3_19, v7_6, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p69, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            kotlin.jvm.functions.Function0 v37 = 0;
            int v53 = (((((((6 << 3) & 112) << 6) & 896) | 6) >> 6) & 14);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p69, -840349794, "C130@5579L179:ProfileScreen.kt#2thlc2");
            int v59_0 = p66.getPhotoUri();
            int v60_0 = p66.getName();
            com.example.ui.components.CommonComponentsKt.UserAvatarView(v59_0, v60_0, 88, 0, p69, 384, 8);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p69);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p69);
            p69.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p69);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p69);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p69);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p69);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p69);
            p69.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p69);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p69);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p69);
            boolean v1_12 = androidx.compose.foundation.layout.PaddingKt.padding-qDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 20)), 0, 2, 0), 0, androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)), 0, androidx.compose.ui.unit.Dp.constructor-impl(((float) 20)), 5, 0);
            Integer v3_27 = androidx.compose.ui.Alignment.Companion.getCenterHorizontally();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p69, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v9_6 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), v3_27, p69, (((390 >> 3) & 14) | ((390 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p69, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v12_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p69, 0);
            Object v5_3 = p69.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v13_2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p69, v1_12);
            kotlin.jvm.functions.Function0 v14_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.ui.Modifier v18 = v1_12;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p69, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p69.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p69.startReusableNode();
            if (!p69.getInserting()) {
                p69.useNode();
            } else {
                p69.createNode(v14_4);
            }
            Integer v29;
            boolean v1_17 = androidx.compose.runtime.Updater.constructor-impl(p69);
            androidx.compose.runtime.Updater.set-impl(v1_17, v9_6, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_17, v5_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Integer v2_12 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.ColumnScope v22_0 = v1_17;
            if (v22_0.getInserting()) {
                v29 = p69;
                v22_0.updateRememberedValue(Integer.valueOf(v12_2));
                v1_17.apply(Integer.valueOf(v12_2), v2_12);
            } else {
                v29 = p69;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v22_0.rememberedValue(), Integer.valueOf(v12_2))) {
                }
            }
            boolean v1_58;
            androidx.compose.runtime.Updater.set-impl(v1_17, v13_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            Integer v2_16 = v29;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_16, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            v58 = v2_16;
            androidx.compose.foundation.layout.ColumnScope v22 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            Integer v25_0 = v2_16;
            Integer v3_33 = v58;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v3_33, 1701228611, "C146@6131L40,148@6193L215,155@6430L155,161@6607L41,164@6720L30,166@6772L41,173@7107L2758,169@6907L2958,227@9887L41,232@10157L48,231@10059L48,230@10017L621:ProfileScreen.kt#2thlc2");
            int v32 = (((390 >> 6) & 112) | 6);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))), v3_33, 6);
            kotlin.jvm.functions.Function0 v37_0 = p66.getName();
            androidx.compose.material3.ButtonColors v41_3 = androidx.compose.ui.unit.TextUnitKt.getSp(22);
            int v44_1 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long vtmp89 = androidx.compose.ui.graphics.ColorKt.Color(4279902252);
            androidx.compose.material3.TextKt.Text--4IGK_g(v37_0, 0, vtmp89, v41_3, 0, v44_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v58, 200064, 0, 131026);
            kotlin.jvm.functions.Function0 v37_1 = p66.getEmail();
            androidx.compose.material3.ButtonColors v41_4 = androidx.compose.ui.unit.TextUnitKt.getSp(13);
            long vtmp92 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g(v37_1, 0, vtmp92, v41_4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v58, 3456, 0, 131058);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 12))), v3_33, 6);
            com.example.ui.components.CommonComponentsKt.SportBadge(p66.getSport(), 0, v3_33, 0, 2);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16))), v3_33, 6);
            int v39_2 = androidx.compose.ui.graphics.ColorKt.Color(4294047225);
            kotlin.jvm.functions.Function0 v37_2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(v37_2, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 14)))), v39_2, 0, 0, 0, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(230450720, 1, new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda4(p66), v3_33, 54)), v3_33, 12583302, 120);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16))), v3_33, 6);
            androidx.compose.material3.ButtonColors v41_6 = androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 0, 0, 0, v3_33, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14);
            androidx.compose.ui.Modifier v38_5 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v3_33, 1994662229, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean v1_56 = v3_33.changedInstance(p67);
            Integer v2_40 = v3_33;
            Object v5_11 = v2_40.rememberedValue();
            if ((!v1_56) && (v5_11 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v1_58 = v5_11;
            } else {
                v1_58 = new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda5(p67);
                v2_40.updateRememberedValue(v1_58);
            }
            kotlin.jvm.functions.Function0 v37_5 = ((kotlin.jvm.functions.Function0) v1_58);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v3_33);
            androidx.compose.material3.ButtonKt.Button(v37_5, v38_5, 0, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 12)))), v41_6, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$1504899189$app(), v3_33, 805306416, 484);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v3_33);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v25_0);
            v29.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v29);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v29);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v29);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$37$lambda$36$lambda$21$lambda$20$lambda$19$lambda$16(com.example.data.model.UserEntity p115, androidx.compose.runtime.Composer p116, int p117)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p116, "C174@7133L2710:ProfileScreen.kt#2thlc2");
        if (((p117 & 3) == 2) && (p116.getSkipping())) {
            p116.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(230450720, p117, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:174)");
            }
            int v1_6 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 14)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p116, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.foundation.layout.Arrangement$Vertical v10_9 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceEvenly()), androidx.compose.ui.Alignment.Companion.getTop(), p116, (((54 >> 3) & 14) | ((54 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p116, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v17 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p116, 0);
            int v7_24 = p116.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v11_2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p116, v1_6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p116, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p116.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p116.startReusableNode();
            if (!p116.getInserting()) {
                p116.useNode();
            } else {
                p116.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            Integer v31;
            boolean v0_22 = androidx.compose.runtime.Updater.constructor-impl(p116);
            androidx.compose.runtime.Updater.set-impl(v0_22, v10_9, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v0_22, v7_24, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            boolean v2_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v28_0 = v0_22;
            if (v28_0.getInserting()) {
                v31 = p116;
                v28_0.updateRememberedValue(Integer.valueOf(v17));
                v0_22.apply(Integer.valueOf(v17), v2_4);
            } else {
                v31 = p116;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v28_0.rememberedValue(), Integer.valueOf(v17))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v0_22, v11_2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            boolean v2_7 = v31;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_7, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            androidx.compose.foundation.layout.RowScope v27 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v29_0 = v2_7;
            int v32 = 0;
            Integer v34 = v2_7;
            float v3_6 = v29_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v3_6, 1991738725, "C180@7415L1046,199@8491L251,206@8772L1045:ProfileScreen.kt#2thlc2");
            boolean v2_10 = androidx.compose.ui.Alignment.Companion.getCenterHorizontally();
            androidx.compose.ui.Modifier v6_0 = v29_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_0, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            int v9_1 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), v2_10, v6_0, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            long v44 = v2_10;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_0, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v45 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v6_0, 0);
            boolean v2_14 = v6_0.getCurrentCompositionLocalMap();
            int v7_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v6_0, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            kotlin.jvm.functions.Function0 vtmp32 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.ui.Modifier v49_0 = vtmp32;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_0, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(v6_0.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            v6_0.startReusableNode();
            if (!v6_0.getInserting()) {
                v6_0.useNode();
            } else {
                v6_0.createNode(v49_0);
            }
            int v4_18 = androidx.compose.runtime.Updater.constructor-impl(v6_0);
            androidx.compose.foundation.layout.ColumnScope v53_0 = v6_0;
            androidx.compose.runtime.Updater.set-impl(v4_18, v9_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v4_18, v2_14, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.ui.Modifier v6_5 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            Integer v54_0 = v4_18;
            if (v54_0.getInserting()) {
                boolean v57 = v9_1;
                v54_0.updateRememberedValue(Integer.valueOf(v45));
                v4_18.apply(Integer.valueOf(v45), v6_5);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v54_0.rememberedValue(), Integer.valueOf(v45))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v4_18, v7_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            int v4_19 = v53_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_19, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int v52 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            int v79_0 = v4_19;
            int v55 = 0;
            int v84 = v4_19;
            androidx.compose.ui.Modifier v6_7 = v79_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_7, 1398770882, "C181@7508L610,191@8151L280:ProfileScreen.kt#2thlc2");
            int v4_22 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            String v59 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_7, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.foundation.layout.Arrangement$Vertical v10_1 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v4_22, v6_7, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            androidx.compose.ui.Alignment$Vertical v62 = v4_22;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_7, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            long v63_0 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v6_7, 0);
            int v4_25 = v6_7.getCurrentCompositionLocalMap();
            int v9_8 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v6_7, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_7, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(v6_7.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            v6_7.startReusableNode();
            if (!v6_7.getInserting()) {
                v6_7.useNode();
            } else {
                v6_7.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            int v67_1 = v6_7;
            androidx.compose.ui.Modifier v6_8 = androidx.compose.runtime.Updater.constructor-impl(v67_1);
            androidx.compose.runtime.Updater.set-impl(v6_8, v10_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v6_8, v4_25, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v7_17 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            long v72_0 = v6_8;
            if (v72_0.getInserting()) {
                int v75 = v10_1;
                v72_0.updateRememberedValue(Integer.valueOf(v63_0));
                v6_8.apply(Integer.valueOf(v63_0), v7_17);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v72_0.rememberedValue(), Integer.valueOf(v63_0))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v6_8, v9_8, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.ui.Modifier v6_10 = v67_1;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v6_10, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            androidx.compose.foundation.layout.Arrangement$Vertical v10 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            Integer v93_0 = v6_10;
            int v70 = 0;
            androidx.compose.ui.Modifier v73_0 = v6_10;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v93_0, 2013312699, "C182@7598L317,188@7952L39,189@8028L56:ProfileScreen.kt#2thlc2");
            String v88_0 = androidx.compose.material.icons.filled.CakeKt.getCake(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            long v91 = androidx.compose.ui.graphics.ColorKt.Color(4278220697);
            long v90_0 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v88_0, "Anivers\u00e1rio", v90_0, v91, v93_0, 3504, 0);
            int v7_22 = v93_0;
            int v78 = v9_8;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 4))), v7_22, 6);
            boolean v109_0 = v7_22;
            androidx.compose.material3.TextKt.Text--4IGK_g("Nascimento", 0, androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(11), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v109_0, 3462, 0, 131058);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v109_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v73_0);
            v67_1.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v67_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v67_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v67_1);
            Integer v58_5 = p115.getBirthDate();
            v62 = androidx.compose.ui.unit.TextUnitKt.getSp(14);
            int v65_2 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            int v60_1 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            androidx.compose.material3.TextKt.Text--4IGK_g(v58_5, 0, v60_1, v62, 0, v65_2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v79_0, 200064, 0, 131026);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v79_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v84);
            v53_0.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v53_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v53_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v53_0);
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 1))), androidx.compose.ui.unit.Dp.constructor-impl(((float) 35))), androidx.compose.ui.graphics.Color.Companion.getLightGray-0d7_KjU(), 0, 2, 0), v3_6, 6);
            int v4_50 = androidx.compose.ui.Alignment.Companion.getCenterHorizontally();
            int v7_23 = v3_6;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_23, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Integer v40 = v3_6;
            float v3_15 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), v4_50, v7_23, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            androidx.compose.ui.Alignment$Horizontal v42 = v4_50;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_23, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v46_1 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v7_23, 0);
            int v4_53 = v7_23.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v6_24 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v7_23, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            kotlin.jvm.functions.Function0 vtmp91 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function0 v50_2 = vtmp91;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v7_23, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(v7_23.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            v7_23.startReusableNode();
            if (!v7_23.getInserting()) {
                v7_23.useNode();
            } else {
                v7_23.createNode(v50_2);
            }
            int v5_14 = androidx.compose.runtime.Updater.constructor-impl(v7_23);
            Integer v54_3 = v7_23;
            androidx.compose.runtime.Updater.set-impl(v5_14, v3_15, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v5_14, v4_53, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v7_29 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            v55 = v5_14;
            if (v55.getInserting()) {
                Integer v58 = v4_53;
                v55.updateRememberedValue(Integer.valueOf(v46_1));
                v5_14.apply(Integer.valueOf(v46_1), v7_29);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v55.rememberedValue(), Integer.valueOf(v46_1))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v5_14, v6_24, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            int v4_56 = v54_3;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_56, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int v7 = (((384 >> 6) & 112) | 6);
            Integer v80_1 = v4_56;
            androidx.compose.foundation.layout.ColumnScope v53 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            Integer v56_1 = v4_56;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v4_56, -1002590310, "C207@8865L613,217@9511L276:ProfileScreen.kt#2thlc2");
            boolean v2_28 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            float v3_26 = v4_56;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v3_26, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v5_17 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), v2_28, v3_26, (((384 >> 3) & 14) | ((384 >> 3) & 112)));
            v62 = v2_28;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v3_26, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            boolean v2_31 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(v3_26, 0);
            androidx.compose.runtime.CompositionLocalMap v15_1 = v3_26.getCurrentCompositionLocalMap();
            int v19 = v2_31;
            boolean v2_32 = androidx.compose.ui.ComposedModifierKt.materializeModifier(v3_26, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v3_26, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(v3_26.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            v3_26.startReusableNode();
            if (!v3_26.getInserting()) {
                v3_26.useNode();
            } else {
                v3_26.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            boolean v69_4;
            int v4_64 = androidx.compose.runtime.Updater.constructor-impl(v3_26);
            androidx.compose.runtime.Updater.set-impl(v4_64, v5_17, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v4_64, v15_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v1_16 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v67_3 = v4_64;
            if (v67_3.getInserting()) {
                v69_4 = v3_26;
                v67_3.updateRememberedValue(Integer.valueOf(v19));
                v4_64.apply(Integer.valueOf(v19), v1_16);
            } else {
                v69_4 = v3_26;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v67_3.rememberedValue(), Integer.valueOf(v19))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v4_64, v2_32, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            float v3_31 = v69_4;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v3_31, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v5 = (((384 >> 6) & 112) | 6);
            int v76_1 = v3_31;
            androidx.compose.foundation.layout.RowScope v33 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v67 = v2_32;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v76_1, 1170772239, "C208@8955L320,214@9312L39,215@9388L56:ProfileScreen.kt#2thlc2");
            int v71_1 = androidx.compose.material.icons.filled.SportsScoreKt.getSportsScore(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            int v74_2 = androidx.compose.ui.graphics.ColorKt.Color(4278220697);
            androidx.compose.ui.Modifier v73_2 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v71_1, "Esporte", v73_2, v74_2, v76_1, 3504, 0);
            boolean v2_35 = v76_1;
            int v71_2 = v3_31;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 4))), v2_35, 6);
            androidx.compose.material3.TextKt.Text--4IGK_g("Modalidade", 0, androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(11), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v2_35, 3462, 0, 131058);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v2_35);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v71_2);
            v69_4.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v69_4);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v69_4);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v69_4);
            String v59_4 = p115.getSport();
            long v63_1 = androidx.compose.ui.unit.TextUnitKt.getSp(14);
            androidx.compose.ui.text.font.FontWeight v66_1 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long vtmp137 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            androidx.compose.material3.TextKt.Text--4IGK_g(v59_4, 0, vtmp137, v63_1, 0, v66_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v80_1, 200064, 0, 131026);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v80_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v56_1);
            v54_3.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v54_3);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v54_3);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v54_3);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v40);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v34);
            v31.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v31);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v31);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v31);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$37$lambda$36$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17(com.example.ui.viewmodel.QuadraViewModel p2)
    {
        p2.getShowEditProfileDialog().setValue(Boolean.valueOf(1));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$37$lambda$36$lambda$31(android.content.Context p15, com.example.ui.viewmodel.QuadraViewModel p16, androidx.compose.foundation.lazy.LazyItemScope p17, androidx.compose.runtime.Composer p18, int p19)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "$this$item");
        androidx.compose.runtime.ComposerKt.sourceInformation(p18, "C248@10877L40,249@10960L38,251@11065L2442,246@10782L2725:ProfileScreen.kt#2thlc2");
        if (((p19 & 17) == 16) && (p18.getSkipping())) {
            p18.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1076442334, p19, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:246)");
            }
            androidx.compose.foundation.shape.RoundedCornerShape v14 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 18)));
            androidx.compose.material3.CardColors v10_1 = androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 0, 0, 0, p18, ((androidx.compose.material3.CardDefaults.$stable << 12) | 6), 14);
            androidx.compose.material3.CardElevation v3_5 = androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(((float) 2)), 0, 0, 0, 0, 0, p18, ((androidx.compose.material3.CardDefaults.$stable << 18) | 6), 62);
            kotlin.Unit v0_11 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.material3.CardKt.Card(v0_11, ((androidx.compose.ui.graphics.Shape) v14), v10_1, v3_5, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1114586928, 1, new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda6(p15, p16), p18, 54)), p18, 196614, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$37$lambda$36$lambda$31$lambda$30(android.content.Context p51, com.example.ui.viewmodel.QuadraViewModel p52, androidx.compose.foundation.layout.ColumnScope p53, androidx.compose.runtime.Composer p54, int p55)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p53, "$this$Card");
        androidx.compose.runtime.ComposerKt.sourceInformation(p54, "C252@11083L2410:ProfileScreen.kt#2thlc2");
        if (((p55 & 17) == 16) && (p54.getSkipping())) {
            p54.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1114586928, p55, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:252)");
            }
            androidx.compose.ui.Alignment$Horizontal v3_28 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v11_4 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(((androidx.compose.foundation.layout.Arrangement$Vertical) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 10)))), androidx.compose.ui.Alignment.Companion.getStart(), p54, (((54 >> 3) & 14) | ((54 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v14_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p54, 0);
            androidx.compose.runtime.CompositionLocalMap v15_1 = p54.getCurrentCompositionLocalMap();
            androidx.compose.foundation.layout.ColumnScope v2_4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p54, v3_28);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p54.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p54.startReusableNode();
            if (!p54.getInserting()) {
                p54.useNode();
            } else {
                p54.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            int v4_20 = androidx.compose.runtime.Updater.constructor-impl(p54);
            androidx.compose.runtime.Updater.set-impl(v4_20, v11_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v4_20, v15_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.ui.Alignment$Horizontal v3_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v22 = v4_20;
            if ((v22.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v22.rememberedValue(), Integer.valueOf(v14_2)))) {
                v22.updateRememberedValue(Integer.valueOf(v14_2));
                v4_20.apply(Integer.valueOf(v14_2), v3_4);
            }
            int v4_8;
            androidx.compose.runtime.Updater.set-impl(v4_20, v2_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            v22 = (((((((54 << 3) & 112) << 6) & 896) | 6) >> 6) & 14);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -907908903, "C253@11199L235,263@11658L48,262@11555L53,261@11513L755,278@12406L50,281@12598L323,277@12356L565,289@13032L22,288@12986L489:ProfileScreen.kt#2thlc2");
            int v29_0 = androidx.compose.ui.unit.TextUnitKt.getSp(15);
            int v32_0 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long vtmp28 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            androidx.compose.material3.TextKt.Text--4IGK_g("Recursos & Compartilhamento", 0, vtmp28, v29_0, 0, v32_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p54, 200070, 0, 131026);
            int v29_1 = androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4280669030), 0, 0, 0, p54, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14);
            androidx.compose.runtime.Composer v5_6 = p54;
            int v39 = 54;
            androidx.compose.ui.Modifier v26_2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -2107488197, "CC(remember):ProfileScreen.kt#9igjgp");
            int v4_7 = p54.changedInstance(p51);
            Object v6_9 = p54.rememberedValue();
            if ((v4_7 == 0) && (v6_9 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v4_8 = v6_9;
            } else {
                int v31 = v4_7;
                v4_8 = new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda20(p51);
                p54.updateRememberedValue(v4_8);
            }
            boolean v0_5;
            int v4_10 = ((kotlin.jvm.functions.Function0) v4_8);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p54);
            androidx.compose.material3.ButtonKt.Button(v4_10, v26_2, 0, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 12)))), v29_1, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$-1824505290$app(), p54, 805306416, 484);
            androidx.compose.ui.Modifier v26_3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -2107460968, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean v0_3 = p54.changedInstance(p52);
            int v7_6 = p54.rememberedValue();
            if ((!v0_3) && (v7_6 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v0_5 = v7_6;
            } else {
                v0_5 = new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda21(p52);
                p54.updateRememberedValue(v0_5);
            }
            boolean v0_14;
            boolean v0_8 = ((kotlin.jvm.functions.Function0) v0_5);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p54);
            androidx.compose.material3.ButtonKt.OutlinedButton(v0_8, v26_3, 0, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 12)))), 0, 0, 0, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1494528840, 1, new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda23(p52), v5_6, 54)), v5_6, 805306416, 500);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p54, -2107440964, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean v0_12 = p54.changedInstance(p52);
            Object v6_17 = p54.rememberedValue();
            if ((!v0_12) && (v6_17 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v0_14 = v6_17;
            } else {
                v0_14 = new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda24(p52);
                p54.updateRememberedValue(v0_14);
            }
            kotlin.jvm.functions.Function0 v25_8 = ((kotlin.jvm.functions.Function0) v0_14);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p54);
            androidx.compose.material3.ButtonKt.TextButton(v25_8, ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE).align(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.Alignment.Companion.getCenterHorizontally()), 0, 0, 0, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$2125955203$app(), p54, 805306368, 508);
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

    static final kotlin.Unit ProfileScreen$lambda$37$lambda$36$lambda$31$lambda$30$lambda$29$lambda$23$lambda$22(android.content.Context p1)
    {
        com.example.util.ExternalIntentsHelper.INSTANCE.shareAppOnWhatsApp(p1);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$37$lambda$36$lambda$31$lambda$30$lambda$29$lambda$25$lambda$24(com.example.ui.viewmodel.QuadraViewModel p2)
    {
        p2.getShowUpdateCheckerDialog().setValue(Boolean.valueOf(1));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$37$lambda$36$lambda$31$lambda$30$lambda$29$lambda$26(com.example.ui.viewmodel.QuadraViewModel p25, androidx.compose.foundation.layout.RowScope p26, androidx.compose.runtime.Composer p27, int p28)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p26, "$this$OutlinedButton");
        androidx.compose.runtime.ComposerKt.sourceInformation(p27, "C282@12624L94,283@12743L39,284@12807L92:ProfileScreen.kt#2thlc2");
        if (((p28 & 17) == 16) && (p27.getSkipping())) {
            p27.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1494528840, p28, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:282)");
            }
            androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.SystemUpdateKt.getSystemUpdate(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), "Atualiza\u00e7\u00e3o", 0, androidx.compose.ui.graphics.ColorKt.Color(4278220697), p27, 3120, 4);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))), p27, 6);
            androidx.compose.material3.TextKt.Text--4IGK_g(new StringBuilder().append("Procurar Atualiza\u00e7\u00e3o (Vers\u00e3o ").append(p25.getAppVersionName()).append(")").toString(), 0, androidx.compose.ui.graphics.ColorKt.Color(4278220697), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p27, 384, 0, 131066);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$37$lambda$36$lambda$31$lambda$30$lambda$29$lambda$28$lambda$27(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.logout();
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$37$lambda$36$lambda$33(androidx.compose.runtime.State p49, androidx.compose.foundation.lazy.LazyItemScope p50, androidx.compose.runtime.Composer p51, int p52)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p50, "$this$item");
        androidx.compose.runtime.ComposerKt.sourceInformation(p51, "C302@13607L613:ProfileScreen.kt#2thlc2");
        if (((p52 & 17) == 16) && (p51.getSkipping())) {
            p51.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2042005151, p52, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:302)");
            }
            String v1_14 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.ui.Alignment$Vertical v5_3 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p51, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v9_4 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween()), v5_3, p51, (((438 >> 3) & 14) | ((438 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p51, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v12_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p51, 0);
            androidx.compose.runtime.CompositionLocalMap v13_1 = p51.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v14 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p51, v1_14);
            kotlin.jvm.functions.Function0 v15_1 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p51, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p51.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p51.startReusableNode();
            if (!p51.getInserting()) {
                p51.useNode();
            } else {
                p51.createNode(v15_1);
            }
            boolean v0_25 = androidx.compose.runtime.Updater.constructor-impl(p51);
            androidx.compose.runtime.Updater.set-impl(v0_25, v9_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v0_25, v13_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            String v1_1 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v21_0 = v0_25;
            if ((v21_0.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v21_0.rememberedValue(), Integer.valueOf(v12_2)))) {
                v21_0.updateRememberedValue(Integer.valueOf(v12_2));
                v0_25.apply(Integer.valueOf(v12_2), v1_1);
            }
            androidx.compose.runtime.Updater.set-impl(v0_25, v14, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p51, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v45 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p51, 254374147, "C307@13825L209,313@14051L155:ProfileScreen.kt#2thlc2");
            long v24_0 = androidx.compose.ui.unit.TextUnitKt.getSp(17);
            int v27_0 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long vtmp26 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            androidx.compose.material3.TextKt.Text--4IGK_g("Atletas da Comunidade", 0, vtmp26, v24_0, 0, v27_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p51, 200070, 0, 131026);
            String v20_1 = new StringBuilder().append(com.example.ui.screens.ProfileScreenKt.ProfileScreen$lambda$1(p49).size()).append(" membros").toString();
            long v24_1 = androidx.compose.ui.unit.TextUnitKt.getSp(12);
            long vtmp33 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g(v20_1, 0, vtmp33, v24_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p51, 3456, 0, 131058);
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

    static final kotlin.Unit ProfileScreen$lambda$37$lambda$36$lambda$8(com.example.ui.viewmodel.QuadraViewModel p10, androidx.compose.runtime.State p11, androidx.compose.runtime.State p12, androidx.compose.foundation.lazy.LazyItemScope p13, androidx.compose.runtime.Composer p14, int p15)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "$this$item");
        androidx.compose.runtime.ComposerKt.sourceInformation(p14, "C92@4091L23,89@3961L167:ProfileScreen.kt#2thlc2");
        if (((p15 & 17) == 16) && (p14.getSkipping())) {
            p14.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1004570714, p15, -1, "com.example.ui.screens.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:89)");
            }
            int v8_0;
            boolean v3 = com.example.ui.screens.ProfileScreenKt.ProfileScreen$lambda$2(p11);
            boolean v4 = com.example.ui.screens.ProfileScreenKt.ProfileScreen$lambda$3(p12);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p14, 975190077, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean v0_5 = p14.changedInstance(p10);
            kotlin.jvm.functions.Function0 v5_0 = p14.rememberedValue();
            if ((!v0_5) && (v5_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v8_0 = v5_0;
            } else {
                v8_0 = new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda8(p10);
                p14.updateRememberedValue(v8_0);
            }
            kotlin.jvm.functions.Function0 v5_2 = ((kotlin.jvm.functions.Function0) v8_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p14);
            com.example.ui.components.CommonComponentsKt.OnlineSyncStatusBanner(v3, v4, v5_2, 0, p14, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$37$lambda$36$lambda$8$lambda$7$lambda$6(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.syncNow();
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$39$lambda$38(com.example.ui.viewmodel.QuadraViewModel p2)
    {
        p2.getShowEditProfileDialog().setValue(Boolean.valueOf(0));
        return kotlin.Unit.INSTANCE;
    }

    private static final boolean ProfileScreen$lambda$4(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((Boolean) p4.getValue()).booleanValue();
    }

    static final kotlin.Unit ProfileScreen$lambda$42$lambda$41(com.example.ui.viewmodel.QuadraViewModel p7, android.content.Context p8, String p9, String p10, String p11, String p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "birthDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "sport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "photo");
        p7.updateProfile(p9, p10, p11, p12, new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda10(p8));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$42$lambda$41$lambda$40(android.content.Context p2)
    {
        android.widget.Toast.makeText(p2, ((CharSequence) "Perfil salvo!"), 0).show();
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$44$lambda$43(com.example.ui.viewmodel.QuadraViewModel p2)
    {
        p2.getShowUpdateCheckerDialog().setValue(Boolean.valueOf(0));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$47(com.example.ui.viewmodel.QuadraViewModel p16, android.content.Context p17, androidx.compose.runtime.Composer p18, int p19)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p18, "C424@18790L256,429@19092L48,423@18752L469:ProfileScreen.kt#2thlc2");
        if (((p19 & 3) == 2) && (p18.getSkipping())) {
            p18.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-913128932, p19, -1, "com.example.ui.screens.ProfileScreen.<anonymous> (ProfileScreen.kt:423)");
            }
            int v8_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p18, -1343573220, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean v2_5 = (p18.changedInstance(p16) | p18.changedInstance(p17));
            int v5_0 = p18.rememberedValue();
            if ((!v2_5) && (v5_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v8_0 = v5_0;
            } else {
                v8_0 = new com.example.ui.screens.ProfileScreenKt$$ExternalSyntheticLambda9(p16, p17);
                p18.updateRememberedValue(v8_0);
            }
            int v14_1 = ((kotlin.jvm.functions.Function0) v8_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p18);
            androidx.compose.material3.ButtonKt.Button(v14_1, 0, 0, 0, androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 0, 0, 0, p18, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14), 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$-77067220$app(), p18, 805306368, 494);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$47$lambda$46$lambda$45(com.example.ui.viewmodel.QuadraViewModel p3, android.content.Context p4)
    {
        p3.syncNow();
        p3.getShowUpdateCheckerDialog().setValue(Boolean.valueOf(0));
        android.widget.Toast.makeText(p4, ((CharSequence) "Verifica\u00e7\u00e3o conclu\u00edda. App atualizado!"), 0).show();
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit ProfileScreen$lambda$49(com.example.ui.viewmodel.QuadraViewModel p51, androidx.compose.runtime.Composer p52, int p53)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p52, "C402@17722L968:ProfileScreen.kt#2thlc2");
        if (((p53 & 3) == 2) && (p52.getSkipping())) {
            p52.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(923132727, p53, -1, "com.example.ui.screens.ProfileScreen.<anonymous> (ProfileScreen.kt:402)");
            }
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p52, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v9_3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), p52, (((0 >> 3) & 14) | ((0 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p52, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            float v3_11 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p52, 0);
            androidx.compose.runtime.CompositionLocalMap v12_1 = p52.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v13_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p52, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            kotlin.jvm.functions.Function0 v14_1 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p52, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p52.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p52.startReusableNode();
            if (!p52.getInserting()) {
                p52.useNode();
            } else {
                p52.createNode(v14_1);
            }
            Integer v23;
            boolean v0_27 = androidx.compose.runtime.Updater.constructor-impl(p52);
            androidx.compose.runtime.Updater.set-impl(v0_27, v9_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v0_27, v12_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v1_23 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v20 = v0_27;
            if (v20.getInserting()) {
                v23 = v3_11;
                v20.updateRememberedValue(Integer.valueOf(v23));
                v0_27.apply(Integer.valueOf(v23), v1_23);
            } else {
                v23 = v3_11;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v20.rememberedValue(), Integer.valueOf(v23))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v0_27, v13_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p52, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            androidx.compose.foundation.layout.ColumnScope v21 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p52, 1764863017, "C403@17751L208,408@17980L40,409@18041L276,414@18338L41,415@18400L272:ProfileScreen.kt#2thlc2");
            String v24_0 = new StringBuilder().append("Vers\u00e3o instalada: ").append(p51.getAppVersionName()).toString();
            int v31_0 = androidx.compose.ui.text.font.FontWeight.Companion.getSemiBold();
            long vtmp28 = androidx.compose.ui.graphics.ColorKt.Color(4278220697);
            androidx.compose.material3.TextKt.Text--4IGK_g(v24_0, 0, vtmp28, 0, 0, v31_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p52, 196992, 0, 131034);
            int v50 = (((0 >> 6) & 112) | 6);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))), p52, 6);
            androidx.compose.material3.TextKt.Text--4IGK_g("Voc\u00ea est\u00e1 utilizando a vers\u00e3o mais recente do app Quadra de Mana\u00edra! Todas as regras de agendamento, clima integrado e sincroniza\u00e7\u00e3o est\u00e3o atualizadas.", 0, 0, androidx.compose.ui.unit.TextUnitKt.getSp(13), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p52, 3072, 0, 131062);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10))), p52, 6);
            long v28_2 = androidx.compose.ui.unit.TextUnitKt.getSp(12);
            long vtmp35 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g("Notas de vers\u00e3o:\n\u2022 Integra\u00e7\u00e3o nativa de clima e vento na praia\n\u2022 Sistema de notifica\u00e7\u00f5es push (FCM)\n\u2022 Mural comunit\u00e1rio com fotos", 0, vtmp35, v28_2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p52, 3462, 0, 131058);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p52);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p52);
            p52.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p52);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p52);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p52);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final boolean ProfileScreen$lambda$5(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((Boolean) p4.getValue()).booleanValue();
    }

    static final kotlin.Unit ProfileScreen$lambda$50(com.example.ui.viewmodel.QuadraViewModel p1, int p2, androidx.compose.runtime.Composer p3, int p4)
    {
        com.example.ui.screens.ProfileScreenKt.ProfileScreen(p1, p3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p2 | 1)));
        return kotlin.Unit.INSTANCE;
    }
}
