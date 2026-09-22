package com.example.ui.viewmodel;
final class QuadraViewModel$updateProfile$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    final synthetic String $birthDate;
    final synthetic String $name;
    final synthetic kotlin.jvm.functions.Function0 $onComplete;
    final synthetic String $photoUri;
    final synthetic String $sport;
    int label;
    final synthetic com.example.ui.viewmodel.QuadraViewModel this$0;

    QuadraViewModel$updateProfile$1(com.example.ui.viewmodel.QuadraViewModel p2, String p3, String p4, String p5, String p6, kotlin.jvm.functions.Function0 p7, kotlin.coroutines.Continuation p8)
    {
        this.this$0 = p2;
        this.$name = p3;
        this.$birthDate = p4;
        this.$sport = p5;
        this.$photoUri = p6;
        this.$onComplete = p7;
        super(2, p8);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p9, kotlin.coroutines.Continuation p10)
    {
        return ((kotlin.coroutines.Continuation) new com.example.ui.viewmodel.QuadraViewModel$updateProfile$1(this.this$0, this.$name, this.$birthDate, this.$sport, this.$photoUri, this.$onComplete, p10));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.ui.viewmodel.QuadraViewModel$updateProfile$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p9)
    {
        kotlin.Unit v0_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p9);
                com.example.data.repository.QuadraRepository v2 = this.this$0.getRepository();
                String v3 = this.$name;
                String v4 = this.$birthDate;
                String v5 = this.$sport;
                String v6 = this.$photoUri;
                this.label = 1;
                if (v2.updateProfile-yxL6bBk(v3, v4, v5, v6, ((kotlin.coroutines.Continuation) this)) != v0_0) {
                } else {
                    return v0_0;
                }
            case 1:
                kotlin.ResultKt.throwOnFailure(p9);
                ((kotlin.Result) p9).unbox-impl();
                break;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        this.this$0.getShowEditProfileDialog().setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(0));
        com.example.ui.viewmodel.QuadraViewModel.access$get_uiMessage$p(this.this$0).setValue("Perfil atualizado com sucesso!");
        this.$onComplete.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
