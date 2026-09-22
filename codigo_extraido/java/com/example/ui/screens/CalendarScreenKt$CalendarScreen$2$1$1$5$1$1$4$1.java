package com.example.ui.screens;
final class CalendarScreenKt$CalendarScreen$2$1$1$5$1$1$4$1 implements kotlin.jvm.functions.Function0 {
    final synthetic com.example.data.model.BookingEntity $booking;
    final synthetic android.content.Context $context;
    final synthetic com.example.ui.viewmodel.QuadraViewModel $viewModel;

    CalendarScreenKt$CalendarScreen$2$1$1$5$1$1$4$1(com.example.ui.viewmodel.QuadraViewModel p1, com.example.data.model.BookingEntity p2, android.content.Context p3)
    {
        this.$viewModel = p1;
        this.$booking = p2;
        this.$context = p3;
        return;
    }

    public bridge synthetic Object invoke()
    {
        this.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke()
    {
        this.$viewModel.cancelBooking(this.$booking);
        android.widget.Toast.makeText(this.$context, ((CharSequence) "Agendamento cancelado"), 0).show();
        return;
    }
}
