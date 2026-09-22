package com.example;
final class MainActivityKt$QuadraApp$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    final synthetic android.content.Context $context;
    final synthetic androidx.activity.compose.ManagedActivityResultLauncher $notificationPermissionLauncher;
    int label;

    MainActivityKt$QuadraApp$1$1(android.content.Context p2, androidx.activity.compose.ManagedActivityResultLauncher p3, kotlin.coroutines.Continuation p4)
    {
        this.$context = p2;
        this.$notificationPermissionLauncher = p3;
        super(2, p4);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p4, kotlin.coroutines.Continuation p5)
    {
        return ((kotlin.coroutines.Continuation) new com.example.MainActivityKt$QuadraApp$1$1(this.$context, this.$notificationPermissionLauncher, p5));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.MainActivityKt$QuadraApp$1$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p3)
    {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p3);
                if (android.os.Build$VERSION.SDK_INT >= 33) {
                    if (androidx.core.content.ContextCompat.checkSelfPermission(this.$context, "android.permission.POST_NOTIFICATIONS") != 0) {
                        this.$notificationPermissionLauncher.launch("android.permission.POST_NOTIFICATIONS");
                    }
                }
                return kotlin.Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
    }
}
