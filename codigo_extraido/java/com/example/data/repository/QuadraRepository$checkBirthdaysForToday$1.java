package com.example.data.repository;
final class QuadraRepository$checkBirthdaysForToday$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    Object L$0;
    int label;
    synthetic Object result;
    final synthetic com.example.data.repository.QuadraRepository this$0;

    QuadraRepository$checkBirthdaysForToday$1(com.example.data.repository.QuadraRepository p1, kotlin.coroutines.Continuation p2)
    {
        this.this$0 = p1;
        super(p2);
        return;
    }

    public final Object invokeSuspend(Object p3)
    {
        this.result = p3;
        this.label = (this.label | -2147483648);
        return com.example.data.repository.QuadraRepository.access$checkBirthdaysForToday(this.this$0, ((kotlin.coroutines.Continuation) this));
    }
}
