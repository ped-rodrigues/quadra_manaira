package com.example.data.local;
public final class QuadraDatabase$Companion {

    private QuadraDatabase$Companion()
    {
        return;
    }

    public synthetic QuadraDatabase$Companion(kotlin.jvm.internal.DefaultConstructorMarker p1)
    {
        return;
    }

    public final com.example.data.local.QuadraDatabase getInstance(android.content.Context p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "context");
        Throwable v0_1 = com.example.data.local.QuadraDatabase.access$getINSTANCE$cp();
        if (v0_1 == null) {
            try {
                com.example.data.local.QuadraDatabase v1_4 = p5.getApplicationContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_4, "getApplicationContext(...)");
                com.example.data.local.QuadraDatabase v1_3 = ((com.example.data.local.QuadraDatabase) androidx.room.Room.databaseBuilder(v1_4, com.example.data.local.QuadraDatabase, "quadra_manaira.db").fallbackToDestructiveMigration().build());
                com.example.data.local.QuadraDatabase.access$setINSTANCE$cp(v1_3);
                v0_1 = v1_3;
            } catch (Throwable v0_2) {
                throw v0_2;
            }
        }
        return v0_1;
    }
}
