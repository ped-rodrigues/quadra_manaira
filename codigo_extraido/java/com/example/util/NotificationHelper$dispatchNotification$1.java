package com.example.util;
final class NotificationHelper$dispatchNotification$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    final synthetic String $message;
    final synthetic String $title;
    final synthetic String $type;
    int label;
    final synthetic com.example.util.NotificationHelper this$0;

    NotificationHelper$dispatchNotification$1(com.example.util.NotificationHelper p2, String p3, String p4, String p5, kotlin.coroutines.Continuation p6)
    {
        this.this$0 = p2;
        this.$type = p3;
        this.$title = p4;
        this.$message = p5;
        super(2, p6);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p7, kotlin.coroutines.Continuation p8)
    {
        return ((kotlin.coroutines.Continuation) new com.example.util.NotificationHelper$dispatchNotification$1(this.this$0, this.$type, this.$title, this.$message, p8));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.util.NotificationHelper$dispatchNotification$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p14)
    {
        kotlin.Unit v0_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p14);
                Object v1_4 = com.example.util.NotificationHelper.access$getNotificationDao$p(this.this$0);
                com.example.data.model.NotificationEntity v2_0 = new com.example.data.model.NotificationEntity(0, this.$type, this.$title, this.$message, 0, 0, 49, 0);
                this.label = 1;
                if (v1_4.insertNotification(v2_0, ((kotlin.coroutines.Continuation) this)) != v0_0) {
                } else {
                    return v0_0;
                }
            case 1:
                kotlin.ResultKt.throwOnFailure(p14);
                break;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        return kotlin.Unit.INSTANCE;
    }
}
