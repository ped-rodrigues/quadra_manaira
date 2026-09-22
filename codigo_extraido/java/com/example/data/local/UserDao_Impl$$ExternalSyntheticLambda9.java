package com.example.data.local;
public final synthetic class UserDao_Impl$$ExternalSyntheticLambda9 implements kotlin.jvm.functions.Function1 {
    public final synthetic String f$0;
    public final synthetic String f$1;

    public synthetic UserDao_Impl$$ExternalSyntheticLambda9(String p1, String p2)
    {
        this.f$0 = p1;
        this.f$1 = p2;
        return;
    }

    public final Object invoke(Object p3)
    {
        return com.example.data.local.UserDao_Impl.findUserByIdentifier$lambda$6(this.f$0, this.f$1, ((androidx.sqlite.SQLiteConnection) p3));
    }
}
