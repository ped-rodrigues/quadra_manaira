package com.example.ui.viewmodel;
final class QuadraViewModel$sendPasswordRecovery$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    final synthetic String $email;
    final synthetic kotlin.jvm.functions.Function0 $onDone;
    int label;
    final synthetic com.example.ui.viewmodel.QuadraViewModel this$0;

    QuadraViewModel$sendPasswordRecovery$1(com.example.ui.viewmodel.QuadraViewModel p2, String p3, kotlin.jvm.functions.Function0 p4, kotlin.coroutines.Continuation p5)
    {
        this.this$0 = p2;
        this.$email = p3;
        this.$onDone = p4;
        super(2, p5);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p5, kotlin.coroutines.Continuation p6)
    {
        return ((kotlin.coroutines.Continuation) new com.example.ui.viewmodel.QuadraViewModel$sendPasswordRecovery$1(this.this$0, this.$email, this.$onDone, p6));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.ui.viewmodel.QuadraViewModel$sendPasswordRecovery$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p5)
    {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p5);
                kotlin.Unit v0_10 = com.example.ui.viewmodel.QuadraViewModel.access$getNotificationHelper$p(this.this$0);
                v0_10.dispatchNotification("SYSTEM", "Recupera\u00e7\u00e3o de Senha", new StringBuilder().append("Link de redefini\u00e7\u00e3o enviado para o e-mail: ").append(this.$email).toString());
                com.example.ui.viewmodel.QuadraViewModel.access$get_uiMessage$p(this.this$0).setValue(new StringBuilder().append("Instru\u00e7\u00f5es de recupera\u00e7\u00e3o enviadas para ").append(this.$email).toString());
                this.this$0.getShowPasswordRecoveryDialog().setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(0));
                this.$onDone.invoke();
                return kotlin.Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
    }
}
