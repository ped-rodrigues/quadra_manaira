package com.example.ui.viewmodel;
final class QuadraViewModel$loginWithSocial$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    final synthetic String $provider;
    int label;
    final synthetic com.example.ui.viewmodel.QuadraViewModel this$0;

    QuadraViewModel$loginWithSocial$1(com.example.ui.viewmodel.QuadraViewModel p2, String p3, kotlin.coroutines.Continuation p4)
    {
        this.this$0 = p2;
        this.$provider = p3;
        super(2, p4);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p4, kotlin.coroutines.Continuation p5)
    {
        return ((kotlin.coroutines.Continuation) new com.example.ui.viewmodel.QuadraViewModel$loginWithSocial$1(this.this$0, this.$provider, p5));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.ui.viewmodel.QuadraViewModel$loginWithSocial$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p6)
    {
        kotlin.Unit v0_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p6);
                com.example.ui.viewmodel.AppScreen v1_5 = this.this$0.getRepository();
                String v2 = this.$provider;
                this.label = 1;
                if (v1_5.loginWithSocial(v2, ((kotlin.coroutines.Continuation) this)) != v0_0) {
                } else {
                    return v0_0;
                }
            case 1:
                kotlin.ResultKt.throwOnFailure(p6);
                break;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        this.this$0.navigateTo(com.example.ui.viewmodel.AppScreen.PROFILE);
        return kotlin.Unit.INSTANCE;
    }
}
