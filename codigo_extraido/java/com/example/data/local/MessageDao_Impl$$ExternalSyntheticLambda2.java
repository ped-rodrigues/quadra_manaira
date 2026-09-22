package com.example.data.local;
public final synthetic class MessageDao_Impl$$ExternalSyntheticLambda2 implements kotlin.jvm.functions.Function1 {
    public final synthetic com.example.data.local.MessageDao_Impl f$0;
    public final synthetic com.example.data.model.MessageEntity f$1;

    public synthetic MessageDao_Impl$$ExternalSyntheticLambda2(com.example.data.local.MessageDao_Impl p1, com.example.data.model.MessageEntity p2)
    {
        this.f$0 = p1;
        this.f$1 = p2;
        return;
    }

    public final Object invoke(Object p3)
    {
        return Long.valueOf(com.example.data.local.MessageDao_Impl.insertMessage$lambda$0(this.f$0, this.f$1, ((androidx.sqlite.SQLiteConnection) p3)));
    }
}
