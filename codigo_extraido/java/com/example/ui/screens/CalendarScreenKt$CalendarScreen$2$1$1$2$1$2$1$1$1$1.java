package com.example.ui.screens;
final class CalendarScreenKt$CalendarScreen$2$1$1$2$1$2$1$1$1$1 implements kotlin.jvm.functions.Function0 {
    final synthetic String $isoDate;
    final synthetic com.example.ui.viewmodel.QuadraViewModel $viewModel;

    CalendarScreenKt$CalendarScreen$2$1$1$2$1$2$1$1$1$1(com.example.ui.viewmodel.QuadraViewModel p1, String p2)
    {
        this.$viewModel = p1;
        this.$isoDate = p2;
        return;
    }

    public bridge synthetic Object invoke()
    {
        this.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke()
    {
        this.$viewModel.selectCalendarDate(this.$isoDate);
        return;
    }
}
