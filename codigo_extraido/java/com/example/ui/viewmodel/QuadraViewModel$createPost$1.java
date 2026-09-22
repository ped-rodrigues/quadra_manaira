package com.example.ui.viewmodel;
final class QuadraViewModel$createPost$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    final synthetic String $imageType;
    final synthetic String $sport;
    final synthetic String $text;
    int label;
    final synthetic com.example.ui.viewmodel.QuadraViewModel this$0;

    QuadraViewModel$createPost$1(com.example.ui.viewmodel.QuadraViewModel p2, String p3, String p4, String p5, kotlin.coroutines.Continuation p6)
    {
        this.this$0 = p2;
        this.$text = p3;
        this.$sport = p4;
        this.$imageType = p5;
        super(2, p6);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p7, kotlin.coroutines.Continuation p8)
    {
        return ((kotlin.coroutines.Continuation) new com.example.ui.viewmodel.QuadraViewModel$createPost$1(this.this$0, this.$text, this.$sport, this.$imageType, p8));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.ui.viewmodel.QuadraViewModel$createPost$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p8)
    {
        kotlin.Unit v0_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p8);
                String v1_0 = this.this$0.getRepository();
                String v2 = this.$text;
                String v3 = this.$sport;
                String v4 = this.$imageType;
                this.label = 1;
                if (v1_0.createPost-BWLJW6A(v2, v3, v4, ((kotlin.coroutines.Continuation) this)) != v0_0) {
                } else {
                    return v0_0;
                }
            case 1:
                kotlin.ResultKt.throwOnFailure(p8);
                ((kotlin.Result) p8).unbox-impl();
                break;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        this.this$0.getShowNewPostDialog().setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(0));
        com.example.ui.viewmodel.QuadraViewModel.access$get_uiMessage$p(this.this$0).setValue("Publica\u00e7\u00e3o enviada para o Mural da Quadra!");
        return kotlin.Unit.INSTANCE;
    }
}
