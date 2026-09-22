package com.example.ui.viewmodel;
final class QuadraViewModel$createBooking$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    final synthetic String $date;
    final synthetic String $endTime;
    final synthetic String $notes;
    final synthetic kotlin.jvm.functions.Function1 $onError;
    final synthetic kotlin.jvm.functions.Function0 $onSuccess;
    final synthetic String $sport;
    final synthetic String $startTime;
    int label;
    final synthetic com.example.ui.viewmodel.QuadraViewModel this$0;

    QuadraViewModel$createBooking$1(com.example.ui.viewmodel.QuadraViewModel p2, String p3, String p4, String p5, String p6, String p7, kotlin.jvm.functions.Function0 p8, kotlin.jvm.functions.Function1 p9, kotlin.coroutines.Continuation p10)
    {
        this.this$0 = p2;
        this.$date = p3;
        this.$startTime = p4;
        this.$endTime = p5;
        this.$sport = p6;
        this.$notes = p7;
        this.$onSuccess = p8;
        this.$onError = p9;
        super(2, p10);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p11, kotlin.coroutines.Continuation p12)
    {
        return ((kotlin.coroutines.Continuation) new com.example.ui.viewmodel.QuadraViewModel$createBooking$1(this.this$0, this.$date, this.$startTime, this.$endTime, this.$sport, this.$notes, this.$onSuccess, this.$onError, p12));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.ui.viewmodel.QuadraViewModel$createBooking$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p10)
    {
        Object v0_1;
        Object v0_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p10);
                Throwable v2_0 = this.this$0.getRepository();
                int v3_0 = this.$date;
                String v4_0 = this.$startTime;
                String v5 = this.$endTime;
                int v6 = this.$sport;
                String v7_0 = this.$notes;
                this.label = 1;
                kotlin.Unit v1_3 = v2_0.createBooking-hUnOzRk(v3_0, v4_0, v5, v6, v7_0, ((kotlin.coroutines.Continuation) this));
                if (v1_3 != v0_0) {
                    v0_1 = v1_3;
                } else {
                    return v0_0;
                }
            case 1:
                kotlin.ResultKt.throwOnFailure(p10);
                v0_1 = ((kotlin.Result) p10).unbox-impl();
                break;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        kotlin.Unit v1_4 = this.this$0;
        Throwable v2_1 = this.$sport;
        int v3_1 = this.$onSuccess;
        if (kotlin.Result.isSuccess-impl(v0_1)) {
            ((Number) v0_1).longValue();
            v6 = 0;
            v1_4.getShowNewBookingDialog().setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(0));
            com.example.ui.viewmodel.QuadraViewModel.access$get_uiMessage$p(v1_4).setValue(new StringBuilder().append("Agendamento de ").append(v2_1).append(" realizado com sucesso!").toString());
            v3_1.invoke();
        }
        kotlin.Unit v1_6 = this.$onError;
        Throwable v2_5 = kotlin.Result.exceptionOrNull-impl(v0_1);
        if (v2_5 != null) {
            String v4_4 = v2_5.getMessage();
            if (v4_4 == null) {
                v4_4 = "Erro ao agendar";
            }
            v1_6.invoke(v4_4);
        }
        return kotlin.Unit.INSTANCE;
    }
}
