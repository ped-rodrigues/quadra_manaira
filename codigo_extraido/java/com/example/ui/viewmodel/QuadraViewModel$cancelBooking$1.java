package com.example.ui.viewmodel;
final class QuadraViewModel$cancelBooking$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    final synthetic com.example.data.model.BookingEntity $booking;
    int label;
    final synthetic com.example.ui.viewmodel.QuadraViewModel this$0;

    QuadraViewModel$cancelBooking$1(com.example.ui.viewmodel.QuadraViewModel p2, com.example.data.model.BookingEntity p3, kotlin.coroutines.Continuation p4)
    {
        this.this$0 = p2;
        this.$booking = p3;
        super(2, p4);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p4, kotlin.coroutines.Continuation p5)
    {
        return ((kotlin.coroutines.Continuation) new com.example.ui.viewmodel.QuadraViewModel$cancelBooking$1(this.this$0, this.$booking, p5));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.ui.viewmodel.QuadraViewModel$cancelBooking$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p8)
    {
        kotlin.Unit v0_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p8);
                String v1_0 = this.this$0.getRepository();
                long v2_1 = this.$booking.getId();
                com.example.data.model.BookingEntity v4 = this.$booking;
                this.label = 1;
                if (v1_0.cancelBooking-0E7RQCE(v2_1, v4, ((kotlin.coroutines.Continuation) this)) != v0_0) {
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
        com.example.ui.viewmodel.QuadraViewModel.access$get_uiMessage$p(this.this$0).setValue("Agendamento cancelado com sucesso.");
        return kotlin.Unit.INSTANCE;
    }
}
