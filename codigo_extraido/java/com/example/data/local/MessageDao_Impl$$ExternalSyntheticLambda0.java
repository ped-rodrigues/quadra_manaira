package com.example.data.local;
public final synthetic class MessageDao_Impl$$ExternalSyntheticLambda0 implements kotlin.jvm.functions.Function1 {
    public final synthetic String f$0;
    public final synthetic String f$1;
    public final synthetic String f$2;

    public synthetic MessageDao_Impl$$ExternalSyntheticLambda0(String p1, String p2, String p3)
    {
        this.f$0 = p1;
        this.f$1 = p2;
        this.f$2 = p3;
        return;
    }

    public final Object invoke(Object p4)
    {
        return com.example.data.local.MessageDao_Impl.markAsRead$lambda$3(this.f$0, this.f$1, this.f$2, ((androidx.sqlite.SQLiteConnection) p4));
    }
}
