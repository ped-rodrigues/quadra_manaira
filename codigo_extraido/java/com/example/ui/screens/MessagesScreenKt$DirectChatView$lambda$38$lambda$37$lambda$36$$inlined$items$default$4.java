package com.example.ui.screens;
public final class MessagesScreenKt$DirectChatView$lambda$38$lambda$37$lambda$36$$inlined$items$default$4 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function4 {
    final synthetic String $currentUserId$inlined;
    final synthetic java.util.List $items;

    public MessagesScreenKt$DirectChatView$lambda$38$lambda$37$lambda$36$$inlined$items$default$4(java.util.List p1, String p2)
    {
        this.$items = p1;
        this.$currentUserId$inlined = p2;
        super(4);
        return;
    }

    public bridge synthetic Object invoke(Object p5, Object p6, Object p7, Object p8)
    {
        this.invoke(((androidx.compose.foundation.lazy.LazyItemScope) p5), ((Number) p6).intValue(), ((androidx.compose.runtime.Composer) p7), ((Number) p8).intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.lazy.LazyItemScope p49, int p50, androidx.compose.runtime.Composer p51, int p52)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p51, "C152@7074L22:LazyDsl.kt#428nma");
        int v3_2 = p52;
        if ((p52 & 6) == 0) {
            com.example.data.model.MessageEntity v6_1;
            if (!p51.changed(p49)) {
                v6_1 = 2;
            } else {
                v6_1 = 4;
            }
            v3_2 = (p52 | v6_1);
        }
        if ((p52 & 48) == 0) {
            com.example.data.model.MessageEntity v6_4;
            if (!p51.changed(p50)) {
                v6_4 = 16;
            } else {
                v6_4 = 32;
            }
            v3_2 |= v6_4;
        }
        if (((v3_2 & 147) == 146) && (p51.getSkipping())) {
            p51.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-632812321, v3_2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
            }
            int v16_1;
            com.example.data.model.MessageEntity v6_11 = ((com.example.data.model.MessageEntity) this.$items.get(p50));
            p51.startReplaceGroup(325295008);
            androidx.compose.runtime.ComposerKt.sourceInformation(p51, "C*331@13276L1801:MessagesScreen.kt#2thlc2");
            boolean v11_3 = kotlin.jvm.internal.Intrinsics.areEqual(v6_11.getSenderId(), this.$currentUserId$inlined);
            androidx.compose.ui.Modifier v12_3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            int v16_0 = androidx.compose.foundation.layout.Arrangement.INSTANCE;
            if (!v11_3) {
                v16_1 = v16_0.getStart();
            } else {
                v16_1 = v16_0.getEnd();
            }
            int v20_0 = v16_1;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p51, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            int v5_8 = androidx.compose.ui.Alignment.Companion.getTop();
            androidx.compose.ui.layout.MeasurePolicy v14_5 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v20_0, v5_8, p51, (((6 >> 3) & 14) | ((6 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p51, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            boolean v0_19 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p51, 0);
            int v1_1 = p51.getCurrentCompositionLocalMap();
            int v22 = v0_19;
            boolean v0_1 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p51, v12_3);
            kotlin.jvm.functions.Function0 vtmp16 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.ui.Modifier v24 = vtmp16;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p51, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p51.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p51.startReusableNode();
            if (!p51.getInserting()) {
                p51.useNode();
            } else {
                p51.createNode(v24);
            }
            int v3_1 = androidx.compose.runtime.Updater.constructor-impl(p51);
            androidx.compose.runtime.Updater.set-impl(v3_1, v14_5, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v3_1, v1_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Composer v2_12 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v29 = v3_1;
            if ((v29.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v29.rememberedValue(), Integer.valueOf(v22)))) {
                v29.updateRememberedValue(Integer.valueOf(v22));
                v3_1.apply(Integer.valueOf(v22), v2_12);
            }
            boolean v0_7;
            androidx.compose.runtime.Updater.set-impl(v3_1, v0_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p51, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v17 = 0;
            v29 = (((((((6 << 3) & 112) << 6) & 896) | 6) >> 6) & 14);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p51, -300270555, "C345@14066L989,335@13488L1567:MessagesScreen.kt#2thlc2");
            if (!v11_3) {
                v0_7 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            } else {
                v0_7 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
            }
            int v3_6;
            long v34 = v0_7;
            boolean v0_10 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 16));
            int v45 = 0;
            int v1_14 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 16));
            if (!v11_3) {
                v3_6 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 4));
            } else {
                float v46 = (((6 >> 6) & 112) | 6);
                v3_6 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 16));
            }
            int v4_11;
            if (!v11_3) {
                v4_11 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 16));
            } else {
                float v47 = v5_8;
                v4_11 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 4));
            }
            boolean v0_11 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4(v0_10, v1_14, v4_11, v3_6);
            float v39 = androidx.compose.ui.unit.Dp.constructor-impl(((float) 1));
            androidx.compose.foundation.shape.RoundedCornerShape v19_0 = v0_11;
            androidx.compose.ui.Modifier v32 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 4)), 0, 2, 0);
            androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(v32, ((androidx.compose.ui.graphics.Shape) v19_0), v34, 0, 0, v39, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1403021926, 1, new com.example.ui.screens.MessagesScreenKt$DirectChatView$3$1$1$2$1$1(v6_11, v11_3), p51, 54)), p51, 12779526, 88);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p51);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p51);
            p51.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p51);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p51);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p51);
            p51.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return;
    }
}
