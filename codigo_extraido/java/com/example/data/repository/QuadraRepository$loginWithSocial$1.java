package com.example.data.repository;
final class QuadraRepository$loginWithSocial$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    synthetic Object result;
    final synthetic com.example.data.repository.QuadraRepository this$0;

    QuadraRepository$loginWithSocial$1(com.example.data.repository.QuadraRepository p1, kotlin.coroutines.Continuation p2)
    {
        this.this$0 = p1;
        super(p2);
        return;
    }

    public final Object invokeSuspend(Object p4)
    {
        this.result = p4;
        this.label = (this.label | -2147483648);
        return this.this$0.loginWithSocial(0, ((kotlin.coroutines.Continuation) this));
    }
}
