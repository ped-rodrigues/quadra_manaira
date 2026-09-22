package com.example.ui.viewmodel;
final class QuadraViewModel$checkBirthdays$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    int label;
    final synthetic com.example.ui.viewmodel.QuadraViewModel this$0;

    QuadraViewModel$checkBirthdays$1(com.example.ui.viewmodel.QuadraViewModel p2, kotlin.coroutines.Continuation p3)
    {
        this.this$0 = p2;
        super(2, p3);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p3, kotlin.coroutines.Continuation p4)
    {
        return ((kotlin.coroutines.Continuation) new com.example.ui.viewmodel.QuadraViewModel$checkBirthdays$1(this.this$0, p4));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.ui.viewmodel.QuadraViewModel$checkBirthdays$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p13)
    {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p13);
                String v0_1 = new java.text.SimpleDateFormat("dd/MM", java.util.Locale.getDefault()).format(new java.util.Date());
                com.example.ui.viewmodel.QuadraViewModel v2_0 = this.this$0;
                java.util.Iterator v4 = ((Iterable) this.this$0.getAllUsers().getValue()).iterator();
                while (v4.hasNext()) {
                    com.example.data.model.UserEntity v6_1 = ((com.example.data.model.UserEntity) v4.next());
                    com.example.util.NotificationHelper v8_0 = v6_1.getBirthDate();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(v0_1);
                    if (kotlin.text.StringsKt.startsWith$default(v8_0, v0_1, 0, 2, 0)) {
                        com.example.ui.viewmodel.QuadraViewModel.access$getNotificationHelper$p(v2_0).notifyBirthday(v6_1.getName(), v6_1.getSport());
                    }
                }
                return kotlin.Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
    }
}
