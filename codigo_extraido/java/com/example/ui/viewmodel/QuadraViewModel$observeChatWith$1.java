package com.example.ui.viewmodel;
final class QuadraViewModel$observeChatWith$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    final synthetic com.example.data.model.UserEntity $current;
    final synthetic com.example.data.model.UserEntity $user;
    int label;
    final synthetic com.example.ui.viewmodel.QuadraViewModel this$0;

    QuadraViewModel$observeChatWith$1(com.example.ui.viewmodel.QuadraViewModel p2, com.example.data.model.UserEntity p3, com.example.data.model.UserEntity p4, kotlin.coroutines.Continuation p5)
    {
        this.this$0 = p2;
        this.$user = p3;
        this.$current = p4;
        super(2, p5);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p5, kotlin.coroutines.Continuation p6)
    {
        return ((kotlin.coroutines.Continuation) new com.example.ui.viewmodel.QuadraViewModel$observeChatWith$1(this.this$0, this.$user, this.$current, p6));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.ui.viewmodel.QuadraViewModel$observeChatWith$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p6)
    {
        kotlin.Unit v0_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p6);
                Object v1_0 = this.this$0.getRepository().getConversation(this.$user.getId(), this.$current.getId());
                kotlinx.coroutines.flow.FlowCollector v2_3 = ((kotlinx.coroutines.flow.FlowCollector) new com.example.ui.viewmodel.QuadraViewModel$observeChatWith$1$1(this.this$0));
                this.label = 1;
                if (v1_0.collect(v2_3, ((kotlin.coroutines.Continuation) this)) != v0_0) {
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
