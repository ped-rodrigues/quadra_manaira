package com.example.data.local;
public final synthetic class NotificationDao_Impl$$ExternalSyntheticLambda3 implements kotlin.jvm.functions.Function1 {
    public final synthetic com.example.data.local.NotificationDao_Impl f$0;
    public final synthetic com.example.data.model.NotificationEntity f$1;

    public synthetic NotificationDao_Impl$$ExternalSyntheticLambda3(com.example.data.local.NotificationDao_Impl p1, com.example.data.model.NotificationEntity p2)
    {
        this.f$0 = p1;
        this.f$1 = p2;
        return;
    }

    public final Object invoke(Object p3)
    {
        return Long.valueOf(com.example.data.local.NotificationDao_Impl.insertNotification$lambda$0(this.f$0, this.f$1, ((androidx.sqlite.SQLiteConnection) p3)));
    }
}
