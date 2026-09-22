package com.example;
final class MainActivityKt$QuadraApp$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    final synthetic androidx.compose.material3.SnackbarHostState $snackbarHostState;
    final synthetic androidx.compose.runtime.State $uiMessage$delegate;
    final synthetic com.example.ui.viewmodel.QuadraViewModel $viewModel;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    MainActivityKt$QuadraApp$2$1(androidx.compose.runtime.State p2, androidx.compose.material3.SnackbarHostState p3, com.example.ui.viewmodel.QuadraViewModel p4, kotlin.coroutines.Continuation p5)
    {
        this.$uiMessage$delegate = p2;
        this.$snackbarHostState = p3;
        this.$viewModel = p4;
        super(2, p5);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p5, kotlin.coroutines.Continuation p6)
    {
        return ((kotlin.coroutines.Continuation) new com.example.MainActivityKt$QuadraApp$2$1(this.$uiMessage$delegate, this.$snackbarHostState, this.$viewModel, p6));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.MainActivityKt$QuadraApp$2$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p12)
    {
        com.example.ui.viewmodel.QuadraViewModel v2_2;
        int v0_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p12);
                String v1_1 = com.example.MainActivityKt.access$QuadraApp$lambda$3(this.$uiMessage$delegate);
                if (v1_1 == null) {
                } else {
                    com.example.ui.viewmodel.QuadraViewModel v2_0 = this.$snackbarHostState;
                    com.example.ui.viewmodel.QuadraViewModel v10 = this.$viewModel;
                    String v3 = v1_1;
                    this.L$0 = v10;
                    this.L$1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v3);
                    this.I$0 = 0;
                    this.label = 1;
                    if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(v2_0, v3, 0, 0, 0, this, 14, 0) != v0_0) {
                        String v1 = v3;
                        v2_2 = v10;
                        v2_2.clearUiMessage();
                    } else {
                        return v0_0;
                    }
                }
            case 1:
                v2_2 = ((com.example.ui.viewmodel.QuadraViewModel) this.L$0);
                kotlin.ResultKt.throwOnFailure(p12);
                break;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        return kotlin.Unit.INSTANCE;
    }
}
