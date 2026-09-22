package com.example.data.local;
public final synthetic class BookingDao_Impl$$ExternalSyntheticLambda4 implements kotlin.jvm.functions.Function1 {
    public final synthetic com.example.data.local.BookingDao_Impl f$0;
    public final synthetic com.example.data.model.BookingEntity f$1;

    public synthetic BookingDao_Impl$$ExternalSyntheticLambda4(com.example.data.local.BookingDao_Impl p1, com.example.data.model.BookingEntity p2)
    {
        this.f$0 = p1;
        this.f$1 = p2;
        return;
    }

    public final Object invoke(Object p3)
    {
        return Long.valueOf(com.example.data.local.BookingDao_Impl.insertBooking$lambda$0(this.f$0, this.f$1, ((androidx.sqlite.SQLiteConnection) p3)));
    }
}
