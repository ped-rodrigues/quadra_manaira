package com.example.ui.viewmodel;
final class QuadraViewModel$toggleLike$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    final synthetic com.example.data.model.MuralPostEntity $post;
    int label;
    final synthetic com.example.ui.viewmodel.QuadraViewModel this$0;

    QuadraViewModel$toggleLike$1(com.example.ui.viewmodel.QuadraViewModel p2, com.example.data.model.MuralPostEntity p3, kotlin.coroutines.Continuation p4)
    {
        this.this$0 = p2;
        this.$post = p3;
        super(2, p4);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p4, kotlin.coroutines.Continuation p5)
    {
        return ((kotlin.coroutines.Continuation) new com.example.ui.viewmodel.QuadraViewModel$toggleLike$1(this.this$0, this.$post, p5));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.ui.viewmodel.QuadraViewModel$toggleLike$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p6)
    {
        kotlin.Unit v0_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p6);
                Object v1_4 = this.this$0.getRepository();
                com.example.data.model.MuralPostEntity v2 = this.$post;
                this.label = 1;
                if (v1_4.toggleLike(v2, ((kotlin.coroutines.Continuation) this)) != v0_0) {
                } else {
                    return v0_0;
                }
            case 1:
                kotlin.ResultKt.throwOnFailure(p6);
                break;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        return kotlin.Unit.INSTANCE;
    }
}
