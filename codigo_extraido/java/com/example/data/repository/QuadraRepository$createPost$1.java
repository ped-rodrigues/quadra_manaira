package com.example.data.repository;
final class QuadraRepository$createPost$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    synthetic Object result;
    final synthetic com.example.data.repository.QuadraRepository this$0;

    QuadraRepository$createPost$1(com.example.data.repository.QuadraRepository p1, kotlin.coroutines.Continuation p2)
    {
        this.this$0 = p1;
        super(p2);
        return;
    }

    public final Object invokeSuspend(Object p4)
    {
        this.result = p4;
        this.label = (this.label | -2147483648);
        kotlin.Result v0_1 = this.this$0.createPost-BWLJW6A(0, 0, 0, ((kotlin.coroutines.Continuation) this));
        if (v0_1 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Result.box-impl(v0_1);
        } else {
            return v0_1;
        }
    }
}
