package com.example.data.local;
public final synthetic class UserDao_Impl$$ExternalSyntheticLambda8 implements kotlin.jvm.functions.Function1 {
    public final synthetic String f$0;

    public synthetic UserDao_Impl$$ExternalSyntheticLambda8(String p1)
    {
        this.f$0 = p1;
        return;
    }

    public final Object invoke(Object p2)
    {
        return com.example.data.local.UserDao_Impl.getCurrentUser$lambda$4(this.f$0, ((androidx.sqlite.SQLiteConnection) p2));
    }
}
