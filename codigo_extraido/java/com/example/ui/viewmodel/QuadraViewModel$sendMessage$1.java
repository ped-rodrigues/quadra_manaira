package com.example.ui.viewmodel;
final class QuadraViewModel$sendMessage$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    final synthetic com.example.data.model.UserEntity $target;
    final synthetic String $text;
    int label;
    final synthetic com.example.ui.viewmodel.QuadraViewModel this$0;

    QuadraViewModel$sendMessage$1(com.example.ui.viewmodel.QuadraViewModel p2, com.example.data.model.UserEntity p3, String p4, kotlin.coroutines.Continuation p5)
    {
        this.this$0 = p2;
        this.$target = p3;
        this.$text = p4;
        super(2, p5);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p5, kotlin.coroutines.Continuation p6)
    {
        return ((kotlin.coroutines.Continuation) new com.example.ui.viewmodel.QuadraViewModel$sendMessage$1(this.this$0, this.$target, this.$text, p6));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.ui.viewmodel.QuadraViewModel$sendMessage$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p8)
    {
        kotlin.Unit v0_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p8);
                Object v1_0 = this.this$0.getRepository();
                String v2_1 = this.$target.getId();
                String v3_1 = this.$target.getName();
                String v4_3 = kotlin.text.StringsKt.trim(((CharSequence) this.$text)).toString();
                this.label = 1;
                if (v1_0.sendMessage-BWLJW6A(v2_1, v3_1, v4_3, ((kotlin.coroutines.Continuation) this)) != v0_0) {
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
        return kotlin.Unit.INSTANCE;
    }
}
