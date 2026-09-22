package com.example.ui.viewmodel;
final class QuadraViewModel$refreshWeather$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    int label;
    final synthetic com.example.ui.viewmodel.QuadraViewModel this$0;

    QuadraViewModel$refreshWeather$1(com.example.ui.viewmodel.QuadraViewModel p2, kotlin.coroutines.Continuation p3)
    {
        this.this$0 = p2;
        super(2, p3);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p3, kotlin.coroutines.Continuation p4)
    {
        return ((kotlin.coroutines.Continuation) new com.example.ui.viewmodel.QuadraViewModel$refreshWeather$1(this.this$0, p4));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.ui.viewmodel.QuadraViewModel$refreshWeather$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p5)
    {
        kotlin.Unit v1_3;
        com.example.data.model.WeatherData v0_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p5);
                com.example.ui.viewmodel.QuadraViewModel.access$get_isWeatherLoading$p(this.this$0).setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(1));
                kotlin.Unit v1_1 = this.this$0.getRepository();
                this.label = 1;
                v1_3 = v1_1.fetchWeather(((kotlin.coroutines.Continuation) this));
                if (v1_3 != v0_0) {
                } else {
                    return v0_0;
                }
            case 1:
                kotlin.ResultKt.throwOnFailure(p5);
                v1_3 = p5;
                break;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        com.example.ui.viewmodel.QuadraViewModel.access$get_weather$p(this.this$0).setValue(((com.example.data.model.WeatherData) v1_3));
        com.example.ui.viewmodel.QuadraViewModel.access$get_isWeatherLoading$p(this.this$0).setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(0));
        return kotlin.Unit.INSTANCE;
    }
}
