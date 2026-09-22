package com.example.data.repository;
final class QuadraRepository$cancelBooking$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    synthetic Object result;
    final synthetic com.example.data.repository.QuadraRepository this$0;

    QuadraRepository$cancelBooking$1(com.example.data.repository.QuadraRepository p1, kotlin.coroutines.Continuation p2)
    {
        this.this$0 = p1;
        super(p2);
        return;
    }

    public final Object invokeSuspend(Object p6)
    {
        this.result = p6;
        this.label = (this.label | -2147483648);
        kotlin.Result v0_1 = this.this$0.cancelBooking-0E7RQCE(0, 0, ((kotlin.coroutines.Continuation) this));
        if (v0_1 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Result.box-impl(v0_1);
        } else {
            return v0_1;
        }
    }
}
