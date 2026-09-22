package com.example.data.local;
public final synthetic class MuralDao_Impl$$ExternalSyntheticLambda2 implements kotlin.jvm.functions.Function1 {
    public final synthetic com.example.data.local.MuralDao_Impl f$0;
    public final synthetic com.example.data.model.MuralPostEntity f$1;

    public synthetic MuralDao_Impl$$ExternalSyntheticLambda2(com.example.data.local.MuralDao_Impl p1, com.example.data.model.MuralPostEntity p2)
    {
        this.f$0 = p1;
        this.f$1 = p2;
        return;
    }

    public final Object invoke(Object p3)
    {
        return com.example.data.local.MuralDao_Impl.insertPost$lambda$0(this.f$0, this.f$1, ((androidx.sqlite.SQLiteConnection) p3));
    }
}
