package com.example;
public final class MainActivity extends androidx.activity.ComponentActivity {
    public static final int $stable;
    private final kotlin.Lazy viewModel$delegate;

    static MainActivity()
    {
        com.example.MainActivity.$stable = 8;
        return;
    }

    public MainActivity()
    {
        int v3 = 0;
        kotlin.jvm.functions.Function0 v4_0 = ((kotlin.jvm.functions.Function0) new com.example.MainActivity$special$$inlined$viewModels$default$1(((androidx.activity.ComponentActivity) this)));
        kotlin.reflect.KClass v6_1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.example.ui.viewmodel.QuadraViewModel);
        this.viewModel$delegate = ((kotlin.Lazy) new androidx.lifecycle.ViewModelLazy(v6_1, ((kotlin.jvm.functions.Function0) new com.example.MainActivity$special$$inlined$viewModels$default$2(((androidx.activity.ComponentActivity) this))), v4_0, ((kotlin.jvm.functions.Function0) new com.example.MainActivity$special$$inlined$viewModels$default$3(0, ((androidx.activity.ComponentActivity) this)))));
        return;
    }

    private final com.example.ui.viewmodel.QuadraViewModel getViewModel()
    {
        return ((com.example.ui.viewmodel.QuadraViewModel) this.viewModel$delegate.getValue());
    }

    static final kotlin.Unit onCreate$lambda$1(com.example.MainActivity p7, androidx.compose.runtime.Composer p8, int p9)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p8, "C87@3882L64,87@3841L105:MainActivity.kt#to5c3");
        if (((p9 & 3) == 2) && (p8.getSkipping())) {
            p8.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-601144069, p9, -1, "com.example.MainActivity.onCreate.<anonymous> (MainActivity.kt:87)");
            }
            com.example.ui.theme.ThemeKt.MyApplicationTheme(0, 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(434770631, 1, new com.example.MainActivity$$ExternalSyntheticLambda1(p7), p8, 54)), p8, 432, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit onCreate$lambda$1$lambda$0(com.example.MainActivity p3, androidx.compose.runtime.Composer p4, int p5)
    {
        androidx.compose.runtime.ComposerKt.sourceInformation(p4, "C88@3900L32:MainActivity.kt#to5c3");
        if (((p5 & 3) == 2) && (p4.getSkipping())) {
            p4.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(434770631, p5, -1, "com.example.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:88)");
            }
            com.example.MainActivityKt.QuadraApp(p3.getViewModel(), p4, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    protected void onCreate(android.os.Bundle p6)
    {
        super.onCreate(p6);
        androidx.activity.EdgeToEdge.enable$default(((androidx.activity.ComponentActivity) this), 0, 0, 3, 0);
        androidx.activity.compose.ComponentActivityKt.setContent$default(((androidx.activity.ComponentActivity) this), 0, ((kotlin.jvm.functions.Function2) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-601144069, 1, new com.example.MainActivity$$ExternalSyntheticLambda0(this))), 1, 0);
        return;
    }
}
