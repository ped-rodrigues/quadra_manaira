package com.example.ui.screens;
public final class CalendarScreenKt {

    public static final void CalendarScreen(com.example.ui.viewmodel.QuadraViewModel p35, androidx.compose.runtime.Composer p36, int p37)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p35, "viewModel");
        androidx.compose.runtime.Composer v10_1 = p36.startRestartGroup(-275904020);
        androidx.compose.runtime.ComposerKt.sourceInformation(v10_1, "C(CalendarScreen)70@3076L7,71@3121L16,72@3193L16,73@3252L16,74@3324L16,75@3386L16,76@3460L16,79@3560L734,99@4413L707,116@5127L14170,98@4372L14925:CalendarScreen.kt#2thlc2");
        kotlin.jvm.functions.Function0 v1_0 = p37;
        if ((p37 & 6) == 0) {
            java.text.SimpleDateFormat v2_8;
            if (!v10_1.changedInstance(p35)) {
                v2_8 = 2;
            } else {
                v2_8 = 4;
            }
            v1_0 = (p37 | v2_8);
        }
        String v11_1 = v1_0;
        if (((v11_1 & 3) == 2) && (v10_1.getSkipping())) {
            v10_1.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-275904020, v11_1, -1, "com.example.ui.screens.CalendarScreen (CalendarScreen.kt:69)");
            }
            kotlin.jvm.functions.Function3 v21_0;
            Object v17_0;
            int v24_0;
            int v13_1;
            int v20_0;
            int v23_0;
            java.text.SimpleDateFormat v2_17 = v10_1;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v2_17, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.util.List v5_3 = v2_17.consume(((androidx.compose.runtime.CompositionLocal) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v2_17);
            String v8_7 = ((android.content.Context) v5_3);
            kotlin.jvm.functions.Function6 v0_28 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p35.getWeather(), 0, v10_1, 0, 1);
            java.text.SimpleDateFormat v2_19 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p35.isWeatherLoading(), 0, v10_1, 0, 1);
            androidx.compose.runtime.State v25 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p35.getAllBookings(), 0, v10_1, 0, 1);
            java.text.SimpleDateFormat v4_9 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p35.getSelectedCalendarDate(), 0, v10_1, 0, 1);
            String v7_7 = androidx.compose.runtime.SnapshotStateKt.collectAsState(p35.getCurrentUser(), 0, v10_1, 0, 1);
            androidx.compose.runtime.State v26 = androidx.compose.runtime.SnapshotStateKt.collectAsState(((kotlinx.coroutines.flow.StateFlow) p35.getShowNewBookingDialog()), 0, v10_1, 0, 1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v10_1, 1144228298, "CC(remember):CalendarScreen.kt#9igjgp");
            java.util.List v5_7 = v10_1;
            int v15_5 = v5_7.rememberedValue();
            if (v15_5 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v17_0 = v0_28;
                v20_0 = v2_19;
                v21_0 = v4_9;
                v23_0 = v7_7;
                v24_0 = v8_7;
                v13_1 = v15_5;
            } else {
                v13_1 = ((java.util.List) new java.util.ArrayList());
                v17_0 = v0_28;
                kotlin.jvm.functions.Function6 v0_0 = java.util.Calendar.getInstance();
                v20_0 = v2_19;
                v21_0 = v4_9;
                kotlin.jvm.functions.Function0 v1_2 = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault());
                java.text.SimpleDateFormat v2_3 = new java.text.SimpleDateFormat("dd", java.util.Locale.getDefault());
                v23_0 = v7_7;
                v24_0 = v8_7;
                java.text.SimpleDateFormat v4_4 = new java.text.SimpleDateFormat("EEE", new java.util.Locale("pt", "BR"));
                java.util.List v6_3 = 0;
                while (v6_3 < 14) {
                    String v7_6 = v1_2.format(v0_0.getTime());
                    String v8_5 = v2_3.format(v0_0.getTime());
                    java.util.Calendar v27 = v1_2;
                    kotlin.jvm.functions.Function0 v1_19 = v4_4.format(v0_0.getTime());
                    java.util.Collection v34 = v2_3;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_19, "format(...)");
                    kotlin.jvm.functions.Function0 v1_21 = kotlin.text.StringsKt.replace$default(v1_19, ".", "", 0, 4, 0).toUpperCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_21, "toUpperCase(...)");
                    v13_1.add(new kotlin.Triple(v7_6, v8_5, v1_21));
                    v0_0.add(6, 1);
                    v6_3++;
                    v1_2 = v27;
                    v2_3 = v34;
                }
                v34 = v2_3;
                v5_7.updateRememberedValue(v13_1);
            }
            java.util.List v5_1 = ((java.util.List) v13_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v10_1);
            kotlin.jvm.functions.Function6 v0_2 = ((Iterable) com.example.ui.screens.CalendarScreenKt.CalendarScreen$lambda$2(v25));
            java.text.SimpleDateFormat v2_6 = ((java.util.Collection) new java.util.ArrayList());
            String v7_3 = v0_2.iterator();
            while (v7_3.hasNext()) {
                String v8_3 = v7_3.next();
                int v16_2 = v0_2;
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.example.data.model.BookingEntity) v8_3).getDate(), com.example.ui.screens.CalendarScreenKt.CalendarScreen$lambda$3(v21_0))) {
                    v2_6.add(v8_3);
                }
                v0_2 = v16_2;
            }
            java.text.SimpleDateFormat v4_6 = v21_0;
            String v8_2 = v24_0;
            androidx.compose.runtime.Composer v22 = v10_1;
            kotlin.jvm.functions.Function0 v1 = 0;
            androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(0, 0, 0, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1647729587, 1, new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda5(p35), v10_1, 54)), 0, 0, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1659815813, 1, new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda6(v17_0, v20_0, p35, v4_6, v5_1, ((java.util.List) v2_6), v23_0, v8_2), v10_1, 54)), v22, 805330944, 495);
            v10_1 = v22;
            if (!com.example.ui.screens.CalendarScreenKt.CalendarScreen$lambda$5(v26)) {
                v10_1.startReplaceGroup(1107783606);
            } else {
                kotlin.jvm.functions.Function0 v1_9;
                v10_1.startReplaceGroup(1127002583);
                androidx.compose.runtime.ComposerKt.sourceInformation(v10_1, "403@19448L48,404@19522L361,401@19366L527");
                String v11_5 = com.example.ui.screens.CalendarScreenKt.CalendarScreen$lambda$3(v4_6);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v10_1, 1144736028, "CC(remember):CalendarScreen.kt#9igjgp");
                int v12_3 = v10_1.changedInstance(p35);
                int v13_4 = v10_1;
                int v15_3 = v13_4.rememberedValue();
                if ((v12_3 == 0) && (v15_3 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v1_9 = v15_3;
                } else {
                    v1_9 = new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda7(p35);
                    v13_4.updateRememberedValue(v1_9);
                }
                kotlin.jvm.functions.Function6 v0_16;
                kotlin.jvm.functions.Function0 v1_12 = ((kotlin.jvm.functions.Function0) v1_9);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v10_1);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v10_1, 1144738709, "CC(remember):CalendarScreen.kt#9igjgp");
                kotlin.jvm.functions.Function6 v0_14 = (v10_1.changedInstance(p35) | v10_1.changedInstance(v8_2));
                int v12_6 = v10_1;
                Object v14_1 = v12_6.rememberedValue();
                if ((v0_14 == null) && (v14_1 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v0_16 = v14_1;
                } else {
                    v0_16 = new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda8(p35, v8_2);
                    v12_6.updateRememberedValue(v0_16);
                }
                kotlin.jvm.functions.Function6 v0_19 = ((kotlin.jvm.functions.Function6) v0_16);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v10_1);
                com.example.ui.screens.CalendarScreenKt.NewBookingDialog(v11_5, v1_12, v0_19, v10_1, 0);
            }
            v10_1.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        kotlin.jvm.functions.Function6 v0_21 = v10_1.endRestartGroup();
        if (v0_21 != null) {
            v0_21.updateScope(new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda9(p35, p37));
        }
        return;
    }

    private static final com.example.data.model.WeatherData CalendarScreen$lambda$0(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((com.example.data.model.WeatherData) p4.getValue());
    }

    private static final boolean CalendarScreen$lambda$1(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((Boolean) p4.getValue()).booleanValue();
    }

    static final kotlin.Unit CalendarScreen$lambda$10(com.example.ui.viewmodel.QuadraViewModel p14, androidx.compose.runtime.Composer p15, int p16)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p15, "C101@4475L47,100@4427L683:CalendarScreen.kt#2thlc2");
        if (((p16 & 3) == 2) && (p15.getSkipping())) {
            p15.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1647729587, p16, -1, "com.example.ui.screens.CalendarScreen.<anonymous> (CalendarScreen.kt:100)");
            }
            int v12_0;
            long v3 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
            long v5 = androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU();
            boolean v0_7 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p15, -1374797086, "CC(remember):CalendarScreen.kt#9igjgp");
            int v1_2 = p15.changedInstance(p14);
            int v8_0 = p15.rememberedValue();
            if ((v1_2 == 0) && (v8_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v12_0 = v8_0;
            } else {
                v12_0 = new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda12(p14);
                p15.updateRememberedValue(v12_0);
            }
            int v12_2 = ((kotlin.jvm.functions.Function0) v12_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p15);
            androidx.compose.material3.FloatingActionButtonKt.FloatingActionButton-X-z6DiA(v12_2, 0, ((androidx.compose.ui.graphics.Shape) v0_7), v3, v5, 0, 0, com.example.ui.screens.ComposableSingletons$CalendarScreenKt.INSTANCE.getLambda$225109429$app(), p15, 12610560, 98);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit CalendarScreen$lambda$10$lambda$9$lambda$8(com.example.ui.viewmodel.QuadraViewModel p2)
    {
        p2.getShowNewBookingDialog().setValue(Boolean.valueOf(1));
        return kotlin.Unit.INSTANCE;
    }

    private static final java.util.List CalendarScreen$lambda$2(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((java.util.List) p4.getValue());
    }

    private static final String CalendarScreen$lambda$3(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((String) p4.getValue());
    }

    static final kotlin.Unit CalendarScreen$lambda$32(androidx.compose.runtime.State p26, androidx.compose.runtime.State p27, com.example.ui.viewmodel.QuadraViewModel p28, androidx.compose.runtime.State p29, java.util.List p30, java.util.List p31, androidx.compose.runtime.State p32, android.content.Context p33, androidx.compose.foundation.layout.PaddingValues p34, androidx.compose.runtime.Composer p35, int p36)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p34, "innerPadding");
        androidx.compose.runtime.ComposerKt.sourceInformation(p35, "C124@5447L13844,117@5153L14138:CalendarScreen.kt#2thlc2");
        Object v1_1 = p36;
        if ((p36 & 6) == 0) {
            int v2_1;
            if (!p35.changed(p34)) {
                v2_1 = 2;
            } else {
                v2_1 = 4;
            }
            v1_1 = (p36 | v2_1);
        }
        int v13 = v1_1;
        if (((v13 & 19) == 18) && (p35.getSkipping())) {
            p35.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1659815813, v13, -1, "com.example.ui.screens.CalendarScreen.<anonymous> (CalendarScreen.kt:117)");
            }
            com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda27 v14_2;
            Object v25;
            Object v1_13 = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.graphics.ColorKt.Color(4294441724), 0, 2, 0), p34);
            androidx.compose.foundation.layout.PaddingValues v3_2 = androidx.compose.foundation.layout.PaddingKt.PaddingValues-a9UjIt4$default(0, 0, 0, androidx.compose.ui.unit.Dp.constructor-impl(((float) 80)), 7, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p35, -1650105393, "CC(remember):CalendarScreen.kt#9igjgp");
            int v4_0 = (((((((p35.changed(p26) | p35.changed(p27)) | p35.changedInstance(p28)) | p35.changed(p29)) | p35.changedInstance(p30)) | p35.changedInstance(p31)) | p35.changed(p32)) | p35.changedInstance(p33));
            boolean v0_1 = p35.rememberedValue();
            if (v4_0 != 0) {
                v25 = v1_13;
                v14_2 = new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda27(p31, p28, p26, p27, p30, p29, p32, p33);
                p35.updateRememberedValue(v14_2);
            } else {
                v25 = v1_13;
                if (v0_1 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                    v14_2 = v0_1;
                }
            }
            kotlin.jvm.functions.Function1 v9_1 = ((kotlin.jvm.functions.Function1) v14_2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p35);
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(v25, 0, v3_2, 0, ((androidx.compose.foundation.layout.Arrangement$Vertical) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 14)))), 0, 0, 0, v9_1, p35, 24960, 234);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit CalendarScreen$lambda$32$lambda$31$lambda$30(java.util.List p17, com.example.ui.viewmodel.QuadraViewModel p18, androidx.compose.runtime.State p19, androidx.compose.runtime.State p20, java.util.List p21, androidx.compose.runtime.State p22, androidx.compose.runtime.State p23, android.content.Context p24, androidx.compose.foundation.lazy.LazyListScope p25)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p25, "$this$LazyColumn");
        androidx.compose.foundation.lazy.LazyListScope.item$default(p25, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1300142439, 1, new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda13(p18, p19, p20))), 3, 0);
        androidx.compose.foundation.lazy.LazyListScope.item$default(p25, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(425872848, 1, new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda14(p21, p22, p18))), 3, 0);
        androidx.compose.foundation.lazy.LazyListScope.item$default(p25, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-8090833, 1, new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda15(p17))), 3, 0);
        if (!p17.isEmpty()) {
            int v6_1 = p17.size();
            p25.items(v6_1, 0, ((kotlin.jvm.functions.Function1) new com.example.ui.screens.CalendarScreenKt$CalendarScreen$lambda$32$lambda$31$lambda$30$$inlined$items$default$3(((kotlin.jvm.functions.Function1) com.example.ui.screens.CalendarScreenKt$CalendarScreen$lambda$32$lambda$31$lambda$30$$inlined$items$default$1.INSTANCE), p17)), ((kotlin.jvm.functions.Function4) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-632812321, 1, new com.example.ui.screens.CalendarScreenKt$CalendarScreen$lambda$32$lambda$31$lambda$30$$inlined$items$default$4(p17, p23, p18, p24))));
        } else {
            androidx.compose.foundation.lazy.LazyListScope.item$default(p25, 0, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2137752876, 1, new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda16(p18))), 3, 0);
            android.content.Context v10 = p24;
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$14(com.example.ui.viewmodel.QuadraViewModel p32, androidx.compose.runtime.State p33, androidx.compose.runtime.State p34, androidx.compose.foundation.lazy.LazyItemScope p35, androidx.compose.runtime.Composer p36, int p37)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p35, "$this$item");
        androidx.compose.runtime.ComposerKt.sourceInformation(p36, "C127@5533L287:CalendarScreen.kt#2thlc2");
        if (((p37 & 17) == 16) && (p36.getSkipping())) {
            p36.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1300142439, p37, -1, "com.example.ui.screens.CalendarScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CalendarScreen.kt:127)");
            }
            androidx.compose.runtime.Composer v2_10 = androidx.compose.foundation.layout.PaddingKt.padding-qDBjuR0$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, androidx.compose.ui.unit.Dp.constructor-impl(((float) 12)), 0, 0, 13, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p36, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v10_4 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), p36, (((6 >> 3) & 14) | ((6 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p36, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v13_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p36, 0);
            androidx.compose.runtime.CompositionLocalMap v14_1 = p36.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v15 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p36, v2_10);
            kotlin.jvm.functions.Function0 vtmp11 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            int v17 = vtmp11;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p36, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p36.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p36.startReusableNode();
            if (!p36.getInserting()) {
                p36.useNode();
            } else {
                p36.createNode(v17);
            }
            androidx.compose.runtime.Composer v2_14 = androidx.compose.runtime.Updater.constructor-impl(p36);
            androidx.compose.runtime.Updater.set-impl(v2_14, v10_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v2_14, v14_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            boolean v1_5 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            com.example.data.model.WeatherData v22_0 = v2_14;
            if ((v22_0.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v22_0.rememberedValue(), Integer.valueOf(v13_2)))) {
                v22_0.updateRememberedValue(Integer.valueOf(v13_2));
                v2_14.apply(Integer.valueOf(v13_2), v1_5);
            }
            int v28_0;
            androidx.compose.runtime.Updater.set-impl(v2_14, v15, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p36, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int v20 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p36, 1469383148, "C131@5750L30,128@5604L198:CalendarScreen.kt#2thlc2");
            com.example.data.model.WeatherData v22_1 = com.example.ui.screens.CalendarScreenKt.CalendarScreen$lambda$0(p33);
            boolean v23 = com.example.ui.screens.CalendarScreenKt.CalendarScreen$lambda$1(p34);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p36, -1338069361, "CC(remember):CalendarScreen.kt#9igjgp");
            int v25_0 = p36.changedInstance(p32);
            boolean v1_16 = p36.rememberedValue();
            if (v25_0 != 0) {
                v28_0 = p36;
                int v27 = v1_16;
                v1_16 = new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda18(p32);
                p36.updateRememberedValue(v1_16);
            } else {
                v28_0 = p36;
                if (v1_16 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                }
            }
            kotlin.jvm.functions.Function0 v24_2 = ((kotlin.jvm.functions.Function0) v1_16);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v28_0);
            Object v26_1 = v28_0;
            com.example.ui.components.CommonComponentsKt.WeatherCard(v22_1, v23, v24_2, 0, v26_1, 0, 8);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v26_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p36);
            p36.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p36);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p36);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p36);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$14$lambda$13$lambda$12$lambda$11(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        p1.refreshWeather();
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$21(java.util.List p75, androidx.compose.runtime.State p76, com.example.ui.viewmodel.QuadraViewModel p77, androidx.compose.foundation.lazy.LazyItemScope p78, androidx.compose.runtime.Composer p79, int p80)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p78, "$this$item");
        androidx.compose.runtime.ComposerKt.sourceInformation(p79, "C138@5938L3163:CalendarScreen.kt#2thlc2");
        if (((p80 & 17) == 16) && (p79.getSkipping())) {
            p79.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(425872848, p80, -1, "com.example.ui.screens.CalendarScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CalendarScreen.kt:138)");
            }
            androidx.compose.runtime.Composer v4_12 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)), 0, 2, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p79, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v15_3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), p79, (((6 >> 3) & 14) | ((6 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p79, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v21 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p79, 0);
            Object v7_21 = p79.getCurrentCompositionLocalMap();
            int v9_5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p79, v4_12);
            kotlin.jvm.functions.Function0 vtmp12 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function0 v26 = vtmp12;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p79, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p79.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p79.startReusableNode();
            if (!p79.getInserting()) {
                p79.useNode();
            } else {
                p79.createNode(v26);
            }
            boolean v3_0 = androidx.compose.runtime.Updater.constructor-impl(p79);
            androidx.compose.runtime.Updater.set-impl(v3_0, v15_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v3_0, v7_21, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v5_4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            androidx.compose.foundation.layout.ColumnScope v32 = v3_0;
            if ((v32.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v32.rememberedValue(), Integer.valueOf(v21)))) {
                v32.updateRememberedValue(Integer.valueOf(v21));
                v3_0.apply(Integer.valueOf(v21), v5_4);
            }
            androidx.compose.runtime.Updater.set-impl(v3_0, v9_5, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p79, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            v32 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p79, -2063278851, "C139@6031L792,158@6845L41,162@7014L2069,160@6908L2175:CalendarScreen.kt#2thlc2");
            androidx.compose.ui.Modifier v19 = v9_5;
            boolean v3_9 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            int v5_12 = ((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween());
            Object v7_9 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            int v48 = 6;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p79, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Object v10_4 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v5_12, v7_9, p79, (((438 >> 3) & 14) | ((438 >> 3) & 112)));
            int v37 = v5_12;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p79, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v5_15 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p79, 0);
            int v8_0 = p79.getCurrentCompositionLocalMap();
            int v20 = v5_15;
            int v5_16 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p79, v3_9);
            kotlin.jvm.functions.Function0 vtmp33 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            androidx.compose.foundation.layout.Arrangement$Horizontal v39_0 = vtmp33;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p79, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p79.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p79.startReusableNode();
            if (!p79.getInserting()) {
                p79.useNode();
            } else {
                p79.createNode(v39_0);
            }
            androidx.compose.runtime.Composer v4_5 = androidx.compose.runtime.Updater.constructor-impl(p79);
            androidx.compose.runtime.Updater.set-impl(v4_5, v10_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v4_5, v8_0, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            boolean v3_22 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v42_0 = v4_5;
            if (v42_0.getInserting()) {
                int v45 = v8_0;
                v42_0.updateRememberedValue(Integer.valueOf(v20));
                v4_5.apply(Integer.valueOf(v20), v3_22);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v42_0.rememberedValue(), Integer.valueOf(v20))) {
                }
            }
            Object v10_8;
            androidx.compose.runtime.Updater.set-impl(v4_5, v5_16, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p79, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            androidx.compose.foundation.layout.Arrangement$Horizontal v39 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p79, 198613581, "C144@6289L245,150@6559L242:CalendarScreen.kt#2thlc2");
            long v54_0 = androidx.compose.ui.unit.TextUnitKt.getSp(17);
            androidx.compose.ui.text.font.FontWeight v57_0 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long vtmp49 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            androidx.compose.material3.TextKt.Text--4IGK_g("Datas Dispon\u00edveis", 0, vtmp49, v54_0, 0, v57_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p79, 200070, 0, 131026);
            String v50_1 = com.example.ui.screens.CalendarScreenKt.CalendarScreen$lambda$3(p76);
            long v54_1 = androidx.compose.ui.unit.TextUnitKt.getSp(13);
            androidx.compose.ui.text.font.FontWeight v57_1 = androidx.compose.ui.text.font.FontWeight.Companion.getSemiBold();
            long vtmp53 = androidx.compose.ui.graphics.ColorKt.Color(4278220697);
            androidx.compose.material3.TextKt.Text--4IGK_g(v50_1, 0, vtmp53, v54_1, 0, v57_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p79, 200064, 0, 131026);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p79);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p79);
            p79.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p79);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p79);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p79);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10))), p79, 6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p79, 349115087, "CC(remember):CalendarScreen.kt#9igjgp");
            boolean v3_46 = ((p79.changedInstance(p75) | p79.changed(p76)) | p79.changedInstance(p77));
            Object v7_18 = p79.rememberedValue();
            if ((!v3_46) && (v7_18 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v10_8 = v7_18;
            } else {
                v10_8 = new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda0(p75, p77, p76);
                p79.updateRememberedValue(v10_8);
            }
            kotlin.jvm.functions.Function1 v43_2 = ((kotlin.jvm.functions.Function1) v10_8);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p79);
            androidx.compose.foundation.lazy.LazyDslKt.LazyRow(0, 0, 0, 0, ((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)))), 0, 0, 0, v43_2, p79, 24576, 239);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p79);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p79);
            p79.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p79);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p79);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p79);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$21$lambda$20$lambda$19$lambda$18(java.util.List p10, com.example.ui.viewmodel.QuadraViewModel p11, androidx.compose.runtime.State p12, androidx.compose.foundation.lazy.LazyListScope p13)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "$this$LazyRow");
        int v5 = p10.size();
        p13.items(v5, 0, ((kotlin.jvm.functions.Function1) new com.example.ui.screens.CalendarScreenKt$CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$21$lambda$20$lambda$19$lambda$18$$inlined$items$default$3(((kotlin.jvm.functions.Function1) com.example.ui.screens.CalendarScreenKt$CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$21$lambda$20$lambda$19$lambda$18$$inlined$items$default$1.INSTANCE), p10)), ((kotlin.jvm.functions.Function4) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-632812321, 1, new com.example.ui.screens.CalendarScreenKt$CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$21$lambda$20$lambda$19$lambda$18$$inlined$items$default$4(p10, p11, p12))));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$23(java.util.List p50, androidx.compose.foundation.lazy.LazyItemScope p51, androidx.compose.runtime.Composer p52, int p53)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p51, "$this$item");
        androidx.compose.runtime.ComposerKt.sourceInformation(p52, "C203@9198L773:CalendarScreen.kt#2thlc2");
        if (((p53 & 17) == 16) && (p52.getSkipping())) {
            p52.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-8090833, p53, -1, "com.example.ui.screens.CalendarScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CalendarScreen.kt:203)");
            }
            String v1_12 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)), 0, 2, 0);
            androidx.compose.ui.Alignment$Vertical v6_3 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p52, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v10_4 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween()), v6_3, p52, (((438 >> 3) & 14) | ((438 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p52, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v13_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p52, 0);
            androidx.compose.runtime.CompositionLocalMap v14_1 = p52.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v15 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p52, v1_12);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p52, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p52.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p52.startReusableNode();
            if (!p52.getInserting()) {
                p52.useNode();
            } else {
                p52.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            String v1_16 = androidx.compose.runtime.Updater.constructor-impl(p52);
            androidx.compose.runtime.Updater.set-impl(v1_16, v10_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v1_16, v14_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            boolean v0_5 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            String v22_0 = v1_16;
            if ((v22_0.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v22_0.rememberedValue(), Integer.valueOf(v13_2)))) {
                v22_0.updateRememberedValue(Integer.valueOf(v13_2));
                v1_16.apply(Integer.valueOf(v13_2), v0_5);
            }
            androidx.compose.runtime.Updater.set-impl(v1_16, v15, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p52, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int v20 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p52, 537299009, "C210@9514L238,216@9773L180:CalendarScreen.kt#2thlc2");
            long v26_0 = androidx.compose.ui.unit.TextUnitKt.getSp(16);
            int v29_0 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            long vtmp28 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            androidx.compose.material3.TextKt.Text--4IGK_g("Jogos & Agendamentos na Quadra", 0, vtmp28, v26_0, 0, v29_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p52, 200070, 0, 131026);
            String v22_2 = new StringBuilder().append(p50.size()).append(" marcados").toString();
            long v26_1 = androidx.compose.ui.unit.TextUnitKt.getSp(12);
            long vtmp34 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g(v22_2, 0, vtmp34, v26_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p52, 3456, 0, 131058);
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

    static final kotlin.Unit CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$28(com.example.ui.viewmodel.QuadraViewModel p15, androidx.compose.foundation.lazy.LazyItemScope p16, androidx.compose.runtime.Composer p17, int p18)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "$this$item");
        androidx.compose.runtime.ComposerKt.sourceInformation(p17, "C228@10187L40,229@10278L38,233@10485L1800,226@10076L2209:CalendarScreen.kt#2thlc2");
        if (((p18 & 17) == 16) && (p17.getSkipping())) {
            p17.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2137752876, p18, -1, "com.example.ui.screens.CalendarScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CalendarScreen.kt:226)");
            }
            androidx.compose.foundation.shape.RoundedCornerShape v14 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)));
            androidx.compose.material3.CardColors v10_1 = androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.ui.graphics.Color.Companion.getWhite-0d7_KjU(), 0, 0, 0, p17, ((androidx.compose.material3.CardDefaults.$stable << 12) | 6), 14);
            androidx.compose.material3.CardElevation v3_5 = androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(((float) 1)), 0, 0, 0, 0, 0, p17, ((androidx.compose.material3.CardDefaults.$stable << 18) | 6), 62);
            kotlin.Unit v0_13 = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 16)), 0, 2, 0);
            androidx.compose.material3.CardKt.Card(v0_13, ((androidx.compose.ui.graphics.Shape) v14), v10_1, v3_5, 0, ((kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1766062214, 1, new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda26(p15), p17, 54)), p17, 196614, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$28$lambda$27(com.example.ui.viewmodel.QuadraViewModel p54, androidx.compose.foundation.layout.ColumnScope p55, androidx.compose.runtime.Composer p56, int p57)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p55, "$this$Card");
        androidx.compose.runtime.ComposerKt.sourceInformation(p56, "C234@10511L1752:CalendarScreen.kt#2thlc2");
        if (((p57 & 17) == 16) && (p56.getSkipping())) {
            p56.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1766062214, p57, -1, "com.example.ui.screens.CalendarScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CalendarScreen.kt:234)");
            }
            com.example.ui.screens.ComposableSingletons$CalendarScreenKt v2_22 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0), androidx.compose.ui.unit.Dp.constructor-impl(((float) 24)));
            androidx.compose.ui.Alignment$Horizontal v5_5 = androidx.compose.ui.Alignment.Companion.getCenterHorizontally();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p56, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v10_4 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), v5_5, p56, (((390 >> 3) & 14) | ((390 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p56, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v13_2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p56, 0);
            androidx.compose.runtime.CompositionLocalMap v14_1 = p56.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier v15 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p56, v2_22);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p56, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p56.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p56.startReusableNode();
            if (!p56.getInserting()) {
                p56.useNode();
            } else {
                p56.createNode(androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor());
            }
            com.example.ui.screens.ComposableSingletons$CalendarScreenKt v2_26 = androidx.compose.runtime.Updater.constructor-impl(p56);
            androidx.compose.runtime.Updater.set-impl(v2_26, v10_4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v2_26, v14_1, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            boolean v1_5 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            kotlin.jvm.functions.Function0 v23_0 = v2_26;
            if ((v23_0.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v23_0.rememberedValue(), Integer.valueOf(v13_2)))) {
                v23_0.updateRememberedValue(Integer.valueOf(v13_2));
                v2_26.apply(Integer.valueOf(v13_2), v1_5);
            }
            androidx.compose.runtime.Updater.set-impl(v2_26, v15, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p56, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            androidx.compose.foundation.layout.ColumnScope v48 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p56, 1826072353, "C240@10799L291,246@11119L41,247@11189L283,253@11501L243,258@11773L41,261@11998L48,260@11893L47,259@11843L394:CalendarScreen.kt#2thlc2");
            kotlin.jvm.functions.Function0 v23_1 = androidx.compose.material.icons.filled.CalendarMonthKt.getCalendarMonth(androidx.compose.material.icons.Icons.INSTANCE.getDefault());
            androidx.compose.ui.graphics.Shape v26_0 = androidx.compose.ui.graphics.ColorKt.Color(4278223759);
            int v25_1 = androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 44)));
            androidx.compose.material3.IconKt.Icon-ww6aTOc(v23_1, 0, v25_1, v26_0, p56, 3504, 0);
            int v53 = (((390 >> 6) & 112) | 6);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10))), p56, 6);
            int v30_1 = androidx.compose.ui.text.font.FontWeight.Companion.getBold();
            androidx.compose.material3.ButtonColors v27_0 = androidx.compose.ui.unit.TextUnitKt.getSp(15);
            long vtmp35 = androidx.compose.ui.graphics.ColorKt.Color(4280166715);
            androidx.compose.material3.TextKt.Text--4IGK_g("Nenhum jogo agendado para esta data", 0, vtmp35, v27_0, 0, v30_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p56, 200070, 0, 131026);
            androidx.compose.material3.ButtonColors v27_1 = androidx.compose.ui.unit.TextUnitKt.getSp(12);
            long vtmp37 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g("Aproveite a quadra livre de Mana\u00edra e seja o primeiro a agendar!", 0, vtmp37, v27_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p56, 3462, 0, 131058);
            int v24 = 12;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 14))), p56, 6);
            androidx.compose.material3.ButtonColors v27_2 = androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 0, 0, 0, p56, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14);
            boolean v1_33 = androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 12)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p56, -1742176141, "CC(remember):CalendarScreen.kt#9igjgp");
            com.example.ui.screens.ComposableSingletons$CalendarScreenKt v2_19 = p56.changedInstance(p54);
            kotlin.jvm.functions.Function0 v23_5 = v1_33;
            boolean v1_34 = p56.rememberedValue();
            if ((v2_19 != null) || (v1_34 == androidx.compose.runtime.Composer.Companion.getEmpty())) {
                int v25 = v1_34;
                v1_34 = new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda10(p54);
                p56.updateRememberedValue(v1_34);
            }
            boolean v1_36 = ((kotlin.jvm.functions.Function0) v1_34);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p56);
            androidx.compose.material3.ButtonKt.Button(v1_36, 0, 0, ((androidx.compose.ui.graphics.Shape) v23_5), v27_2, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$CalendarScreenKt.INSTANCE.getLambda$-1317739820$app(), p56, 805306368, 486);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p56);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p56);
            p56.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p56);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p56);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p56);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24(com.example.ui.viewmodel.QuadraViewModel p2)
    {
        p2.getShowNewBookingDialog().setValue(Boolean.valueOf(1));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit CalendarScreen$lambda$34$lambda$33(com.example.ui.viewmodel.QuadraViewModel p2)
    {
        p2.getShowNewBookingDialog().setValue(Boolean.valueOf(0));
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit CalendarScreen$lambda$37$lambda$36(com.example.ui.viewmodel.QuadraViewModel p9, android.content.Context p10, String p11, String p12, String p13, String p14, String p15, kotlin.jvm.functions.Function1 p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "end");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "sport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "notes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "onError");
        com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda17 v7_1 = new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda17(p10);
        p9.createBooking(p11, p12, p13, p14, p15, v7_1, p16);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit CalendarScreen$lambda$37$lambda$36$lambda$35(android.content.Context p2)
    {
        android.widget.Toast.makeText(p2, ((CharSequence) "Jogo agendado! Alerta de 24h programado."), 1).show();
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit CalendarScreen$lambda$38(com.example.ui.viewmodel.QuadraViewModel p1, int p2, androidx.compose.runtime.Composer p3, int p4)
    {
        com.example.ui.screens.CalendarScreenKt.CalendarScreen(p1, p3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p2 | 1)));
        return kotlin.Unit.INSTANCE;
    }

    private static final com.example.data.model.UserEntity CalendarScreen$lambda$4(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((com.example.data.model.UserEntity) p4.getValue());
    }

    private static final boolean CalendarScreen$lambda$5(androidx.compose.runtime.State p4)
    {
        int v1 = 0;
        return ((Boolean) p4.getValue()).booleanValue();
    }

    public static final void NewBookingDialog(String p30, kotlin.jvm.functions.Function0 p31, kotlin.jvm.functions.Function6 p32, androidx.compose.runtime.Composer p33, int p34)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p30, "defaultDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p31, "onDismiss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p32, "onConfirm");
        long v11_0 = p33.startRestartGroup(1833770658);
        androidx.compose.runtime.ComposerKt.sourceInformation(v11_0, "C(NewBookingDialog)P(!1,2)422@20132L40,423@20194L36,424@20250L36,425@20312L45,426@20375L31,427@20428L42,511@24054L609,527@24689L104,432@20627L3401,429@20476L4323:CalendarScreen.kt#2thlc2");
        kotlin.jvm.functions.Function2 v4_2 = p34;
        if ((p34 & 6) == 0) {
            int v5_7;
            if (!v11_0.changed(p30)) {
                v5_7 = 2;
            } else {
                v5_7 = 4;
            }
            v4_2 = (p34 | v5_7);
        }
        if ((p34 & 48) == 0) {
            int v5_12;
            if (!v11_0.changedInstance(p31)) {
                v5_12 = 16;
            } else {
                v5_12 = 32;
            }
            v4_2 |= v5_12;
        }
        if ((p34 & 384) == 0) {
            int v5_15;
            if (!v11_0.changedInstance(p32)) {
                v5_15 = 128;
            } else {
                v5_15 = 256;
            }
            v4_2 |= v5_15;
        }
        androidx.compose.runtime.Composer v19_2;
        int v12 = v4_2;
        if (((v12 & 147) == 146) && (v11_0.getSkipping())) {
            v11_0.skipToGroupEnd();
            v19_2 = v11_0;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1833770658, v12, -1, "com.example.ui.screens.NewBookingDialog (CalendarScreen.kt:421)");
            }
            long v13_14;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v11_0, 1317018346, "CC(remember):CalendarScreen.kt#9igjgp");
            int v5_18 = v11_0;
            int v8_5 = v5_18.rememberedValue();
            if (v8_5 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v13_14 = v8_5;
            } else {
                v13_14 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(p30, 0, 2, 0);
                v5_18.updateRememberedValue(v13_14);
            }
            long v13_0;
            androidx.compose.runtime.MutableState v16_1 = ((androidx.compose.runtime.MutableState) v13_14);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v11_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v11_0, 1317020326, "CC(remember):CalendarScreen.kt#9igjgp");
            int v5_19 = v11_0;
            int v8_6 = v5_19.rememberedValue();
            if (v8_6 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v13_0 = v8_6;
            } else {
                v13_0 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default("17:00", 0, 2, 0);
                v5_19.updateRememberedValue(v13_0);
            }
            long v13_3;
            int v17_1 = ((androidx.compose.runtime.MutableState) v13_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v11_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v11_0, 1317022118, "CC(remember):CalendarScreen.kt#9igjgp");
            int v5_0 = v11_0;
            int v8_0 = v5_0.rememberedValue();
            if (v8_0 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v13_3 = v8_0;
            } else {
                v13_3 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default("18:30", 0, 2, 0);
                v5_0.updateRememberedValue(v13_3);
            }
            long v13_6;
            int v18_1 = ((androidx.compose.runtime.MutableState) v13_3);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v11_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v11_0, 1317024111, "CC(remember):CalendarScreen.kt#9igjgp");
            int v5_1 = v11_0;
            int v8_1 = v5_1.rememberedValue();
            if (v8_1 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v13_6 = v8_1;
            } else {
                v13_6 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default("V\u00f4lei de Praia", 0, 2, 0);
                v5_1.updateRememberedValue(v13_6);
            }
            long v13_9;
            androidx.compose.runtime.Composer v19_1 = ((androidx.compose.runtime.MutableState) v13_6);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v11_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v11_0, 1317026113, "CC(remember):CalendarScreen.kt#9igjgp");
            int v5_2 = v11_0;
            int v8_2 = v5_2.rememberedValue();
            if (v8_2 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v13_9 = v8_2;
            } else {
                v13_9 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default("", 0, 2, 0);
                v5_2.updateRememberedValue(v13_9);
            }
            kotlin.jvm.functions.Function2 v6_1;
            int v20_1 = ((androidx.compose.runtime.MutableState) v13_9);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v11_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(v11_0, 1317027820, "CC(remember):CalendarScreen.kt#9igjgp");
            kotlin.jvm.functions.Function2 v4_3 = v11_0;
            kotlin.jvm.functions.Function2 v7_0 = v4_3.rememberedValue();
            if (v7_0 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v6_1 = v7_0;
            } else {
                v6_1 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(0, 0, 2, 0);
                v4_3.updateRememberedValue(v6_1);
            }
            int v21_1 = ((androidx.compose.runtime.MutableState) v6_1);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v11_0);
            androidx.compose.runtime.MutableState v24 = v17_1;
            androidx.compose.runtime.MutableState v26 = v19_1;
            androidx.compose.runtime.MutableState v28 = v21_1;
            v19_2 = v11_0;
            androidx.compose.material3.AndroidAlertDialog_androidKt.AlertDialog-Oix01E0(p31, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1396402966, 1, new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda1(p32, v16_1, v17_1, v18_1, v21_1, v19_1, v20_1), v11_0, 54)), 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-908355860, 1, new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda2(p31), v11_0, 54)), 0, com.example.ui.screens.ComposableSingletons$CalendarScreenKt.INSTANCE.getLambda$-420308754$app(), ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1971198447, 1, new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda3(v16_1, v17_1, v18_1, v19_1, v20_1, v21_1), v11_0, 54)), 0, 0, 0, 0, 0, 0, 0, v19_2, (((v12 >> 3) & 14) | 1772592), 0, 16276);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        boolean v2_10 = v19_2.endRestartGroup();
        if (!v2_10) {
            int v10 = p34;
        } else {
            v2_10.updateScope(new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda4(p30, p31, p32, p34));
        }
        return;
    }

    private static final String NewBookingDialog$lambda$40(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void NewBookingDialog$lambda$41(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final String NewBookingDialog$lambda$43(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void NewBookingDialog$lambda$44(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final String NewBookingDialog$lambda$46(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void NewBookingDialog$lambda$47(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final String NewBookingDialog$lambda$49(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void NewBookingDialog$lambda$50(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final String NewBookingDialog$lambda$52(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void NewBookingDialog$lambda$53(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    private static final String NewBookingDialog$lambda$55(androidx.compose.runtime.MutableState p4)
    {
        int v2 = 0;
        return ((String) ((androidx.compose.runtime.State) p4).getValue());
    }

    private static final void NewBookingDialog$lambda$56(androidx.compose.runtime.MutableState p5, String p6)
    {
        int v1 = 0;
        p5.setValue(p6);
        return;
    }

    static final kotlin.Unit NewBookingDialog$lambda$60(kotlin.jvm.functions.Function6 p22, androidx.compose.runtime.MutableState p23, androidx.compose.runtime.MutableState p24, androidx.compose.runtime.MutableState p25, androidx.compose.runtime.MutableState p26, androidx.compose.runtime.MutableState p27, androidx.compose.runtime.MutableState p28, androidx.compose.runtime.Composer p29, int p30)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p29, "C513@24102L385,522@24529L48,512@24068L585:CalendarScreen.kt#2thlc2");
        if (((p30 & 3) == 2) && (p29.getSkipping())) {
            p29.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1396402966, p30, -1, "com.example.ui.screens.NewBookingDialog.<anonymous> (CalendarScreen.kt:512)");
            }
            kotlin.jvm.functions.Function0 v14_0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p29, -1913452053, "CC(remember):CalendarScreen.kt#9igjgp");
            boolean v0_4 = p29.changed(p22);
            int v3_0 = p29.rememberedValue();
            if ((!v0_4) && (v3_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                v14_0 = v3_0;
            } else {
                v14_0 = new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda11(p22, p23, p24, p25, p26, p27, p28);
                p29.updateRememberedValue(v14_0);
            }
            kotlin.jvm.functions.Function0 v14_2 = ((kotlin.jvm.functions.Function0) v14_0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p29);
            androidx.compose.material3.ButtonKt.Button(v14_2, 0, 0, 0, androidx.compose.material3.ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 0, 0, 0, p29, ((androidx.compose.material3.ButtonDefaults.$stable << 12) | 6), 14), 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$CalendarScreenKt.INSTANCE.getLambda$-797290278$app(), p29, 805306368, 494);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewBookingDialog$lambda$60$lambda$59$lambda$58(kotlin.jvm.functions.Function6 p8, androidx.compose.runtime.MutableState p9, androidx.compose.runtime.MutableState p10, androidx.compose.runtime.MutableState p11, androidx.compose.runtime.MutableState p12, androidx.compose.runtime.MutableState p13, androidx.compose.runtime.MutableState p14)
    {
        if ((!kotlin.text.StringsKt.isBlank(((CharSequence) com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$40(p9)))) && ((!kotlin.text.StringsKt.isBlank(((CharSequence) com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$43(p10)))) && (!kotlin.text.StringsKt.isBlank(((CharSequence) com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$46(p11)))))) {
            p8.invoke(com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$40(p9), com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$43(p10), com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$46(p11), com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$49(p13), com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$52(p14), new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda19(p12));
            return kotlin.Unit.INSTANCE;
        } else {
            com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$56(p12, "Informe data e hor\u00e1rios v\u00e1lidos!");
            return kotlin.Unit.INSTANCE;
        }
    }

    static final kotlin.Unit NewBookingDialog$lambda$60$lambda$59$lambda$58$lambda$57(androidx.compose.runtime.MutableState p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "err");
        com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$56(p1, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewBookingDialog$lambda$61(kotlin.jvm.functions.Function0 p15, androidx.compose.runtime.Composer p16, int p17)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p16, "C528@24703L80:CalendarScreen.kt#2thlc2");
        if (((p17 & 3) == 2) && (p16.getSkipping())) {
            p16.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-908355860, p17, -1, "com.example.ui.screens.NewBookingDialog.<anonymous> (CalendarScreen.kt:528)");
            }
            androidx.compose.material3.ButtonKt.TextButton(p15, 0, 0, 0, 0, 0, 0, 0, 0, com.example.ui.screens.ComposableSingletons$CalendarScreenKt.INSTANCE.getLambda$2041915241$app(), p16, 805306368, 510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewBookingDialog$lambda$77(androidx.compose.runtime.MutableState p95, androidx.compose.runtime.MutableState p96, androidx.compose.runtime.MutableState p97, androidx.compose.runtime.MutableState p98, androidx.compose.runtime.MutableState p99, androidx.compose.runtime.MutableState p100, androidx.compose.runtime.Composer p101, int p102)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p101, "C433@20641L3377:CalendarScreen.kt#2thlc2");
        if (((p102 & 3) == 2) && (p101.getSkipping())) {
            p101.skipToGroupEnd();
            androidx.compose.runtime.MutableState v9 = p99;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1971198447, p102, -1, "com.example.ui.screens.NewBookingDialog.<anonymous> (CalendarScreen.kt:433)");
            }
            boolean v1_7 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy v13_3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), p101, (((6 >> 3) & 14) | ((6 >> 3) & 112)));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v18 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p101, 0);
            androidx.compose.runtime.MutableState v9_13 = p101.getCurrentCompositionLocalMap();
            androidx.compose.runtime.Composer v4_44 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p101, v1_7);
            kotlin.jvm.functions.Function0 vtmp10 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function0 v21 = vtmp10;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p101.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p101.startReusableNode();
            if (!p101.getInserting()) {
                p101.useNode();
            } else {
                p101.createNode(v21);
            }
            int v0_34 = androidx.compose.runtime.Updater.constructor-impl(p101);
            androidx.compose.runtime.Updater.set-impl(v0_34, v13_3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v0_34, v9_13, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            int v2_1 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v27_0 = v0_34;
            if ((v27_0.getInserting()) || (!kotlin.jvm.internal.Intrinsics.areEqual(v27_0.rememberedValue(), Integer.valueOf(v18)))) {
                v27_0.updateRememberedValue(Integer.valueOf(v18));
                v0_34.apply(Integer.valueOf(v18), v2_1);
            }
            androidx.compose.runtime.Updater.set-impl(v0_34, v4_44, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            androidx.compose.foundation.layout.ColumnScope v26 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            int v28 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, 1279544216, "C434@20702L191,440@20911L41,444@21059L13,442@20970L274,450@21262L40,452@21320L761,470@22099L41,472@22158L81,473@22256L40,474@22313L1041,494@23372L40,498@23520L14,496@23430L359:CalendarScreen.kt#2thlc2");
            long v35_0 = androidx.compose.ui.unit.TextUnitKt.getSp(12);
            long vtmp25 = androidx.compose.ui.graphics.Color.Companion.getGray-0d7_KjU();
            androidx.compose.material3.TextKt.Text--4IGK_g("Reserve a quadra definindo a data, hor\u00e1rios e modalidade esportiva:", 0, vtmp25, v35_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p101, 3462, 0, 131058);
            int v63 = 0;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10))), p101, 6);
            String v31_1 = com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$40(p95);
            long v33_1 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -790000238, "CC(remember):CalendarScreen.kt#9igjgp");
            int v32 = 0;
            int v2_15 = p101.rememberedValue();
            if (v2_15 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                long v35 = v2_15;
            } else {
                v2_15 = new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda20(p95);
                p101.updateRememberedValue(v2_15);
            }
            int v32_2 = ((kotlin.jvm.functions.Function1) v2_15);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
            kotlin.jvm.functions.Function2 vtmp32 = com.example.ui.screens.ComposableSingletons$CalendarScreenKt.INSTANCE.getLambda$2054656127$app();
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(v31_1, v32_2, v33_1, 0, 0, 0, vtmp32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, p101, 1573296, 12582912, 0, 8257464);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))), p101, 6);
            androidx.compose.runtime.Composer v4_15 = ((androidx.compose.foundation.layout.Arrangement$Horizontal) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            androidx.compose.runtime.MutableState v9_5 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(v4_15, androidx.compose.ui.Alignment.Companion.getTop(), p101, (((54 >> 3) & 14) | ((54 >> 3) & 112)));
            v35 = v4_15;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v36_1 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p101, 0);
            androidx.compose.runtime.Composer v4_18 = p101.getCurrentCompositionLocalMap();
            int v6_22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p101, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0));
            kotlin.jvm.functions.Function0 vtmp43 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            long v40_2 = vtmp43;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p101.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p101.startReusableNode();
            if (!p101.getInserting()) {
                p101.useNode();
            } else {
                p101.createNode(v40_2);
            }
            androidx.compose.runtime.MutableState v7_17 = androidx.compose.runtime.Updater.constructor-impl(p101);
            androidx.compose.runtime.Updater.set-impl(v7_17, v9_5, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v7_17, v4_18, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Object v8_10 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v45_1 = v7_17;
            if (v45_1.getInserting()) {
                int v48 = v9_5;
                v45_1.updateRememberedValue(Integer.valueOf(v36_1));
                v7_17.apply(Integer.valueOf(v36_1), v8_10);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v45_1.rememberedValue(), Integer.valueOf(v36_1))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v7_17, v6_22, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            v9 = (((54 >> 6) & 112) | 6);
            int v49_4 = ((androidx.compose.foundation.layout.RowScope) androidx.compose.foundation.layout.RowScopeInstance.INSTANCE);
            int v45 = v6_22;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, 2075136901, "C455@21536L18,453@21434L305,463@21861L16,461@21761L302:CalendarScreen.kt#2thlc2");
            Object v67_0 = com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$43(p96);
            androidx.compose.runtime.MutableState v69_0 = androidx.compose.foundation.layout.RowScope.weight$default(v49_4, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 1065353216, 0, 2, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -2011267429, "CC(remember):CalendarScreen.kt#9igjgp");
            kotlin.jvm.functions.Function2 v51 = 0;
            androidx.compose.runtime.Composer v4_35 = p101.rememberedValue();
            if (v4_35 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                int v53 = v4_35;
            } else {
                v4_35 = new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda21(p96);
                p101.updateRememberedValue(v4_35);
            }
            int v68_1 = ((kotlin.jvm.functions.Function1) v4_35);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
            kotlin.jvm.functions.Function2 vtmp61 = com.example.ui.screens.ComposableSingletons$CalendarScreenKt.INSTANCE.getLambda$-256676765$app();
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(v67_0, v68_1, v69_0, 0, 0, 0, vtmp61, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, p101, 1572912, 12582912, 0, 8257464);
            Object v67_1 = com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$46(p97);
            androidx.compose.runtime.MutableState v69_1 = androidx.compose.foundation.layout.RowScope.weight$default(v49_4, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 1065353216, 0, 2, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -2011257031, "CC(remember):CalendarScreen.kt#9igjgp");
            androidx.compose.runtime.Composer v4_39 = p101.rememberedValue();
            if (v4_39 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                int v6 = p101;
            } else {
                v4_39 = new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda22(p97);
                p101.updateRememberedValue(v4_39);
            }
            int v68_3 = ((kotlin.jvm.functions.Function1) v4_39);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
            kotlin.jvm.functions.Function2 vtmp66 = com.example.ui.screens.ComposableSingletons$CalendarScreenKt.INSTANCE.getLambda$1869252122$app();
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(v67_1, v68_3, v69_1, 0, 0, 0, vtmp66, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, p101, 1572912, 12582912, 0, 8257464);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
            p101.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 10))), p101, 6);
            androidx.compose.material3.TextKt.Text--4IGK_g("Modalidade Esportiva:", 0, 0, androidx.compose.ui.unit.TextUnitKt.getSp(12), 0, androidx.compose.ui.text.font.FontWeight.Companion.getSemiBold(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p101, 199686, 0, 131030);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 4))), p101, 6);
            int v2_24 = ((androidx.compose.foundation.layout.Arrangement$Vertical) androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 4))));
            Object v8_2 = p101;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            androidx.compose.runtime.MutableState v7_23 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(v2_24, androidx.compose.ui.Alignment.Companion.getStart(), p101, (((48 >> 3) & 14) | ((48 >> 3) & 112)));
            long v33 = v2_24;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int v2_27 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(p101, 0);
            Object v3_10 = p101.getCurrentCompositionLocalMap();
            int v17 = v2_27;
            int v2_28 = androidx.compose.ui.ComposedModifierKt.materializeModifier(p101, ((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion));
            kotlin.jvm.functions.Function0 vtmp80 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            long v35_4 = vtmp80;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(p101.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            p101.startReusableNode();
            if (!p101.getInserting()) {
                p101.useNode();
            } else {
                p101.createNode(v35_4);
            }
            int v6_48 = androidx.compose.runtime.Updater.constructor-impl(p101);
            androidx.compose.runtime.Updater.set-impl(v6_48, v7_23, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(v6_48, v3_10, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            boolean v1_17 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            int v38_5 = v6_48;
            if (v38_5.getInserting()) {
                int v41 = v7_23;
                v38_5.updateRememberedValue(Integer.valueOf(v17));
                v6_48.apply(Integer.valueOf(v17), v1_17);
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v38_5.rememberedValue(), Integer.valueOf(v17))) {
                }
            }
            androidx.compose.runtime.Updater.set-impl(v6_48, v2_28, androidx.compose.ui.node.ComposeUiNode.Companion.getSetModifier());
            Object v3_5 = p101;
            int v6_2 = 0;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            androidx.compose.runtime.MutableState v7_2 = (((48 >> 6) & 112) | 6);
            v35 = ((androidx.compose.foundation.layout.ColumnScope) androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE);
            int v39 = v2_28;
            int v2_29 = p101;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -2103437608, "C:CalendarScreen.kt#2thlc2");
            p101.startReplaceGroup(1179073535);
            androidx.compose.runtime.ComposerKt.sourceInformation(p101, "*482@22835L25,483@22887L427,477@22511L803");
            int v0_3 = ((Iterable) com.example.ui.components.CommonComponentsKt.getSPORTS_LIST());
            boolean v1_2 = 0;
            int v55_3 = v0_3.iterator();
            while (v55_3.hasNext()) {
                androidx.compose.ui.Modifier v42_8;
                int v57_2 = v0_3;
                int v0_40 = ((String) v55_3.next());
                boolean v59 = v1_2;
                boolean v1_31 = kotlin.jvm.internal.Intrinsics.areEqual(com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$49(p98), v0_40);
                if (!v1_31) {
                    v42_8 = androidx.compose.ui.graphics.Color.Companion.getTransparent-0d7_KjU();
                } else {
                    v42_8 = androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.ui.graphics.ColorKt.Color(4278223759), 1041865114, 0, 0, 0, 14, 0);
                }
                Object v3_1;
                long v44_7 = v42_8;
                Object v67_3 = v3_5;
                int v68_4 = v6_2;
                androidx.compose.runtime.MutableState v69_2 = v7_2;
                Object v70_3 = v8_2;
                long v46_8 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -546078364, "CC(remember):CalendarScreen.kt#9igjgp");
                Object v3_24 = p101.changed(v0_40);
                Object v8_0 = p101.rememberedValue();
                if ((v3_24 == null) && (v8_0 != androidx.compose.runtime.Composer.Companion.getEmpty())) {
                    v3_1 = v8_0;
                } else {
                    int v49 = 0;
                    v3_1 = new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda23(v0_40, p98);
                    p101.updateRememberedValue(v3_1);
                }
                int v50_1 = ((kotlin.jvm.functions.Function0) v3_1);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
                Object v3_4 = androidx.compose.foundation.ClickableKt.clickable-XHw0xAI$default(v46_8, 0, 0, 0, v50_1, 7, 0);
                androidx.compose.material3.SurfaceKt.Surface-T9BRK9s(v3_4, ((androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(((float) 8)))), v44_7, 0, 0, 0, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(183083888, 1, new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda24(v1_31, v0_40), v2_29, 54)), v2_29, 12582912, 120);
                v0_3 = v57_2;
                v1_2 = v59;
                v3_5 = v67_3;
                v6_2 = v68_4;
                v7_2 = v69_2;
                v8_2 = v70_3;
            }
            Object v8_12;
            v59 = v1_2;
            Object v67_2 = v3_5;
            androidx.compose.runtime.MutableState v69 = v7_2;
            Object v70_2 = v8_2;
            p101.endReplaceGroup();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v67_2);
            v70_2.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v70_2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v70_2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(v70_2);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 8))), p101, 6);
            String v31_5 = com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$52(p99);
            long v33_7 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), 0, 1, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(p101, -789921485, "CC(remember):CalendarScreen.kt#9igjgp");
            Object v3_17 = p101.rememberedValue();
            if (v3_17 != androidx.compose.runtime.Composer.Companion.getEmpty()) {
                v8_12 = v3_17;
            } else {
                v8_12 = new com.example.ui.screens.CalendarScreenKt$$ExternalSyntheticLambda25(p99);
                p101.updateRememberedValue(v8_12);
            }
            int v32_8 = ((kotlin.jvm.functions.Function1) v8_12);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
            int v37_3 = com.example.ui.screens.ComposableSingletons$CalendarScreenKt.INSTANCE.getLambda$101810806$app();
            kotlin.jvm.functions.Function2 vtmp115 = com.example.ui.screens.ComposableSingletons$CalendarScreenKt.INSTANCE.getLambda$547348117$app();
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(v31_5, v32_8, v33_7, 0, 0, 0, v37_3, vtmp115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, p101, 14156208, 12582912, 0, 8257336);
            if (com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$55(p100) == null) {
                p101.startReplaceGroup(1258904477);
            } else {
                p101.startReplaceGroup(1282550223);
                androidx.compose.runtime.ComposerKt.sourceInformation(p101, "506@23852L40,507@23913L73");
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion), androidx.compose.ui.unit.Dp.constructor-impl(((float) 6))), p101, 6);
                int v0_35 = com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$55(p100);
                if (v0_35 == 0) {
                    v0_35 = "";
                }
                androidx.compose.material3.TextKt.Text--4IGK_g(v0_35, 0, androidx.compose.ui.graphics.ColorKt.Color(4292030255), androidx.compose.ui.unit.TextUnitKt.getSp(12), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p101, 3456, 0, 131058);
            }
            p101.endReplaceGroup();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
            p101.endNode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(p101);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewBookingDialog$lambda$77$lambda$76$lambda$63$lambda$62(androidx.compose.runtime.MutableState p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$41(p1, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewBookingDialog$lambda$77$lambda$76$lambda$68$lambda$65$lambda$64(androidx.compose.runtime.MutableState p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$44(p1, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewBookingDialog$lambda$77$lambda$76$lambda$68$lambda$67$lambda$66(androidx.compose.runtime.MutableState p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$47(p1, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewBookingDialog$lambda$77$lambda$76$lambda$73$lambda$72$lambda$70$lambda$69(String p1, androidx.compose.runtime.MutableState p2)
    {
        com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$50(p2, p1);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewBookingDialog$lambda$77$lambda$76$lambda$73$lambda$72$lambda$71(boolean p27, String p28, androidx.compose.runtime.Composer p29, int p30)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p29, "C484@22917L371:CalendarScreen.kt#2thlc2");
        if (((p30 & 3) == 2) && (p29.getSkipping())) {
            p29.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(183083888, p30, -1, "com.example.ui.screens.NewBookingDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CalendarScreen.kt:484)");
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

    static final kotlin.Unit NewBookingDialog$lambda$77$lambda$76$lambda$75$lambda$74(androidx.compose.runtime.MutableState p1, String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        com.example.ui.screens.CalendarScreenKt.NewBookingDialog$lambda$53(p1, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit NewBookingDialog$lambda$78(String p1, kotlin.jvm.functions.Function0 p2, kotlin.jvm.functions.Function6 p3, int p4, androidx.compose.runtime.Composer p5, int p6)
    {
        com.example.ui.screens.CalendarScreenKt.NewBookingDialog(p1, p2, p3, p5, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags((p4 | 1)));
        return kotlin.Unit.INSTANCE;
    }

    public static final synthetic String access$CalendarScreen$lambda$3(androidx.compose.runtime.State p1)
    {
        return com.example.ui.screens.CalendarScreenKt.CalendarScreen$lambda$3(p1);
    }

    public static final synthetic com.example.data.model.UserEntity access$CalendarScreen$lambda$4(androidx.compose.runtime.State p1)
    {
        return com.example.ui.screens.CalendarScreenKt.CalendarScreen$lambda$4(p1);
    }
}
