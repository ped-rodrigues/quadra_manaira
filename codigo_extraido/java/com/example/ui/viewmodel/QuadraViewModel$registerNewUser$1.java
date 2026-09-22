package com.example.ui.viewmodel;
final class QuadraViewModel$registerNewUser$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    final synthetic String $birthDate;
    final synthetic String $name;
    final synthetic kotlin.jvm.functions.Function1 $onError;
    final synthetic kotlin.jvm.functions.Function0 $onSuccess;
    final synthetic String $password;
    final synthetic String $photoUri;
    final synthetic String $sport;
    int label;
    final synthetic com.example.ui.viewmodel.QuadraViewModel this$0;

    QuadraViewModel$registerNewUser$1(com.example.ui.viewmodel.QuadraViewModel p2, String p3, String p4, String p5, String p6, String p7, kotlin.jvm.functions.Function0 p8, kotlin.jvm.functions.Function1 p9, kotlin.coroutines.Continuation p10)
    {
        this.this$0 = p2;
        this.$name = p3;
        this.$birthDate = p4;
        this.$sport = p5;
        this.$photoUri = p6;
        this.$password = p7;
        this.$onSuccess = p8;
        this.$onError = p9;
        super(2, p10);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p11, kotlin.coroutines.Continuation p12)
    {
        return ((kotlin.coroutines.Continuation) new com.example.ui.viewmodel.QuadraViewModel$registerNewUser$1(this.this$0, this.$name, this.$birthDate, this.$sport, this.$photoUri, this.$password, this.$onSuccess, this.$onError, p12));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.ui.viewmodel.QuadraViewModel$registerNewUser$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p10)
    {
        Object v0_1;
        Object v0_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p10);
                Throwable v2_0 = this.this$0.getRepository();
                int v3_0 = this.$name;
                String v4_0 = this.$birthDate;
                com.example.ui.viewmodel.AppScreen v5_0 = this.$sport;
                Boolean v6_0 = this.$photoUri;
                String v7 = this.$password;
                this.label = 1;
                kotlin.Unit v1_3 = v2_0.registerUser-hUnOzRk(v3_0, v4_0, v5_0, v6_0, v7, ((kotlin.coroutines.Continuation) this));
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
        Throwable v2_1 = this.$onSuccess;
        if (kotlin.Result.isSuccess-impl(v0_1)) {
            String v4 = 0;
            v1_4.getShowRegistrationDialog().setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(0));
            v1_4.navigateTo(com.example.ui.viewmodel.AppScreen.PROFILE);
            v2_1.invoke();
        }
        kotlin.Unit v1_5 = this.$onError;
        Throwable v2_2 = kotlin.Result.exceptionOrNull-impl(v0_1);
        if (v2_2 != null) {
            String v4_1 = v2_2.getMessage();
            if (v4_1 == null) {
                v4_1 = "Erro ao cadastrar";
            }
            v1_5.invoke(v4_1);
        }
        return kotlin.Unit.INSTANCE;
    }
}
