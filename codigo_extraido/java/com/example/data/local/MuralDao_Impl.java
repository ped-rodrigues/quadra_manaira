package com.example.data.local;
public final class MuralDao_Impl implements com.example.data.local.MuralDao {
    public static final int $stable;
    public static final com.example.data.local.MuralDao_Impl$Companion Companion;
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertAdapter __insertAdapterOfMuralPostEntity;

    static MuralDao_Impl()
    {
        com.example.data.local.MuralDao_Impl.Companion = new com.example.data.local.MuralDao_Impl$Companion(0);
        com.example.data.local.MuralDao_Impl.$stable = 8;
        return;
    }

    public MuralDao_Impl(androidx.room.RoomDatabase p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "__db");
        this.__db = p2;
        this.__insertAdapterOfMuralPostEntity = ((androidx.room.EntityInsertAdapter) new com.example.data.local.MuralDao_Impl$1());
        return;
    }

    static final java.util.List getAllPosts$lambda$1(String p32, androidx.sqlite.SQLiteConnection p33)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p33, "_connection");
        androidx.sqlite.SQLiteStatement v3 = p33.prepare(p32);
        try {
            Throwable v0_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "id");
            int v4_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "authorId");
            int v5_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "authorName");
            int v6_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "authorPhoto");
            int v7_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "sport");
            int v8_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "text");
            int v9_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "imageType");
            int v10_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "likesCount");
            int v11_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "isLikedByMe");
            int v12_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "timestamp");
            java.util.List v13_2 = ((java.util.List) new java.util.ArrayList());
        } catch (Throwable v0_7) {
            v3.close();
            throw v0_7;
        }
        while (v3.step()) {
            String v27;
            int v15 = 0;
            long v20 = v3.getLong(v0_1);
            String v22 = v3.getText(v4_1);
            String v23 = v3.getText(v5_1);
            String v24 = v3.getText(v6_1);
            String v25 = v3.getText(v7_1);
            String v26 = v3.getText(v8_1);
            if (!v3.isNull(v9_1)) {
                v27 = v3.getText(v9_1);
            } else {
                v27 = 0;
            }
            androidx.sqlite.SQLiteConnection v1_3;
            Throwable v16_2 = v0_1;
            if (((int) v3.getLong(v11_1)) == 0) {
                v1_3 = 0;
            } else {
                v1_3 = 1;
            }
            v13_2.add(new com.example.data.model.MuralPostEntity(v20, v22, v23, v24, v25, v26, v27, ((int) v3.getLong(v10_1)), v1_3, v3.getLong(v12_1)));
            v0_1 = v16_2;
        }
        v3.close();
        return v13_2;
    }

    static final kotlin.Unit insertPost$lambda$0(com.example.data.local.MuralDao_Impl p1, com.example.data.model.MuralPostEntity p2, androidx.sqlite.SQLiteConnection p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "_connection");
        p1.__insertAdapterOfMuralPostEntity.insert(p3, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit likePost$lambda$2(String p2, long p3, androidx.sqlite.SQLiteConnection p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "_connection");
        androidx.sqlite.SQLiteStatement v0_1 = p5.prepare(p2);
        try {
            v0_1.bindLong(1, p3);
            v0_1.step();
            v0_1.close();
            return kotlin.Unit.INSTANCE;
        } catch (Throwable v1_1) {
            v0_1.close();
            throw v1_1;
        }
    }

    static final kotlin.Unit unlikePost$lambda$3(String p2, long p3, androidx.sqlite.SQLiteConnection p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "_connection");
        androidx.sqlite.SQLiteStatement v0_1 = p5.prepare(p2);
        try {
            v0_1.bindLong(1, p3);
            v0_1.step();
            v0_1.close();
            return kotlin.Unit.INSTANCE;
        } catch (Throwable v1_1) {
            v0_1.close();
            throw v1_1;
        }
    }

    public kotlinx.coroutines.flow.Flow getAllPosts()
    {
        kotlinx.coroutines.flow.Flow v1_0 = this.__db;
        String[] v2_1 = new String[1];
        v2_1[0] = "mural_posts";
        return androidx.room.coroutines.FlowUtil.createFlow(v1_0, 0, v2_1, new com.example.data.local.MuralDao_Impl$$ExternalSyntheticLambda1("SELECT * FROM mural_posts ORDER BY timestamp DESC"));
    }

    public Object insertPost(com.example.data.model.MuralPostEntity p5, kotlin.coroutines.Continuation p6)
    {
        kotlin.Unit v0_2 = androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.MuralDao_Impl$$ExternalSyntheticLambda2(this, p5), p6);
        if (v0_2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v0_2;
        }
    }

    public Object likePost(long p6, kotlin.coroutines.Continuation p8)
    {
        kotlin.Unit v1_2 = androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.MuralDao_Impl$$ExternalSyntheticLambda0("UPDATE mural_posts SET likesCount = likesCount + 1, isLikedByMe = 1 WHERE id = ?", p6), p8);
        if (v1_2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v1_2;
        }
    }

    public Object unlikePost(long p6, kotlin.coroutines.Continuation p8)
    {
        kotlin.Unit v1_2 = androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.MuralDao_Impl$$ExternalSyntheticLambda3("UPDATE mural_posts SET likesCount = MAX(0, likesCount - 1), isLikedByMe = 0 WHERE id = ?", p6), p8);
        if (v1_2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v1_2;
        }
    }
}
