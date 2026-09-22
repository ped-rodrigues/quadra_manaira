package com.example.data.local;
public final class UserDao_Impl implements com.example.data.local.UserDao {
    public static final int $stable;
    public static final com.example.data.local.UserDao_Impl$Companion Companion;
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertAdapter __insertAdapterOfUserEntity;
    private final androidx.room.EntityDeleteOrUpdateAdapter __updateAdapterOfUserEntity;

    static UserDao_Impl()
    {
        com.example.data.local.UserDao_Impl.Companion = new com.example.data.local.UserDao_Impl$Companion(0);
        com.example.data.local.UserDao_Impl.$stable = 8;
        return;
    }

    public UserDao_Impl(androidx.room.RoomDatabase p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "__db");
        this.__db = p2;
        this.__insertAdapterOfUserEntity = ((androidx.room.EntityInsertAdapter) new com.example.data.local.UserDao_Impl$1());
        this.__updateAdapterOfUserEntity = ((androidx.room.EntityDeleteOrUpdateAdapter) new com.example.data.local.UserDao_Impl$2());
        return;
    }

    static final kotlin.Unit clearCurrentUser$lambda$8(String p2, androidx.sqlite.SQLiteConnection p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "_connection");
        androidx.sqlite.SQLiteStatement v0_1 = p3.prepare(p2);
        try {
            v0_1.step();
            v0_1.close();
            return kotlin.Unit.INSTANCE;
        } catch (Throwable v1_0) {
            v0_1.close();
            throw v1_0;
        }
    }

    static final com.example.data.model.UserEntity findUserByIdentifier$lambda$6(String p29, String p30, androidx.sqlite.SQLiteConnection p31)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p31, "_connection");
        androidx.sqlite.SQLiteStatement v4 = p31.prepare(p29);
        try {
            com.example.data.model.UserEntity v17_0;
            v4.bindText(1, p30);
            v4.bindText(2, p30);
            int v5_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "id");
            int v6_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "name");
            int v7_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "email");
            int v8_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "birthDate");
            int v9_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "sport");
            int v10_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "photoUri");
            int v11_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "passwordHash");
            int v12_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "isCurrentUser");
            int v13_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "createdAt");
        } catch (int v0_4) {
            v4.close();
            throw v0_4;
        }
        if (!v4.step()) {
            v17_0 = 0;
        } else {
            int v1_1;
            String v18 = v4.getText(v5_1);
            String v19 = v4.getText(v6_1);
            String v20 = v4.getText(v7_1);
            String v21 = v4.getText(v8_1);
            String v22 = v4.getText(v9_1);
            String v23 = v4.getText(v10_1);
            String v24 = v4.getText(v11_1);
            int v16 = 0;
            if (((int) v4.getLong(v12_1)) == 0) {
                v1_1 = 0;
            } else {
                v1_1 = 1;
            }
            v17_0 = new com.example.data.model.UserEntity(v18, v19, v20, v21, v22, v23, v24, v1_1, v4.getLong(v13_1));
        }
        v4.close();
        return v17_0;
    }

    static final java.util.List getAllUsers$lambda$2(String p28, androidx.sqlite.SQLiteConnection p29)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p29, "_connection");
        androidx.sqlite.SQLiteStatement v3 = p29.prepare(p28);
        try {
            int v0_5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "id");
            int v4_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "name");
            int v5_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "email");
            int v6_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "birthDate");
            int v7_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "sport");
            int v8_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "photoUri");
            int v9_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "passwordHash");
            int v10_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "isCurrentUser");
            int v11_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "createdAt");
            java.util.List v12_2 = ((java.util.List) new java.util.ArrayList());
        } catch (int v0_4) {
            v3.close();
            throw v0_4;
        }
        while (v3.step()) {
            androidx.sqlite.SQLiteConnection v1_1;
            long v14 = 0;
            String v17 = v3.getText(v0_5);
            String v18 = v3.getText(v4_1);
            String v19 = v3.getText(v5_1);
            String v20 = v3.getText(v6_1);
            String v21 = v3.getText(v7_1);
            String v22 = v3.getText(v8_1);
            String v23 = v3.getText(v9_1);
            int v15 = 0;
            int v27 = v0_5;
            if (((int) v3.getLong(v10_1)) == 0) {
                v1_1 = 0;
            } else {
                v1_1 = 1;
            }
            v12_2.add(new com.example.data.model.UserEntity(v17, v18, v19, v20, v21, v22, v23, v1_1, v3.getLong(v11_1)));
            v0_5 = v27;
        }
        v3.close();
        return v12_2;
    }

    static final com.example.data.model.UserEntity getCurrentUser$lambda$4(String p27, androidx.sqlite.SQLiteConnection p28)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p28, "_connection");
        androidx.sqlite.SQLiteStatement v3 = p28.prepare(p27);
        try {
            com.example.data.model.UserEntity v15_0;
            int v0_5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "id");
            int v4_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "name");
            int v5_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "email");
            int v6_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "birthDate");
            int v7_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "sport");
            int v8_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "photoUri");
            int v9_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "passwordHash");
            int v10_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "isCurrentUser");
            int v11_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "createdAt");
        } catch (int v0_4) {
            v3.close();
            throw v0_4;
        }
        if (!v3.step()) {
            v15_0 = 0;
        } else {
            int v1_1;
            String v16 = v3.getText(v0_5);
            String v17 = v3.getText(v4_1);
            String v18 = v3.getText(v5_1);
            String v19 = v3.getText(v6_1);
            String v20 = v3.getText(v7_1);
            String v21 = v3.getText(v8_1);
            String v22 = v3.getText(v9_1);
            int v14 = 0;
            if (((int) v3.getLong(v10_1)) == 0) {
                v1_1 = 0;
            } else {
                v1_1 = 1;
            }
            v15_0 = new com.example.data.model.UserEntity(v16, v17, v18, v19, v20, v21, v22, v1_1, v3.getLong(v11_1));
        }
        v3.close();
        return v15_0;
    }

    static final com.example.data.model.UserEntity getCurrentUserFlow$lambda$3(String p27, androidx.sqlite.SQLiteConnection p28)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p28, "_connection");
        androidx.sqlite.SQLiteStatement v3 = p28.prepare(p27);
        try {
            com.example.data.model.UserEntity v15_0;
            int v0_5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "id");
            int v4_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "name");
            int v5_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "email");
            int v6_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "birthDate");
            int v7_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "sport");
            int v8_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "photoUri");
            int v9_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "passwordHash");
            int v10_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "isCurrentUser");
            int v11_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "createdAt");
        } catch (int v0_4) {
            v3.close();
            throw v0_4;
        }
        if (!v3.step()) {
            v15_0 = 0;
        } else {
            int v1_1;
            String v16 = v3.getText(v0_5);
            String v17 = v3.getText(v4_1);
            String v18 = v3.getText(v5_1);
            String v19 = v3.getText(v6_1);
            String v20 = v3.getText(v7_1);
            String v21 = v3.getText(v8_1);
            String v22 = v3.getText(v9_1);
            int v14 = 0;
            if (((int) v3.getLong(v10_1)) == 0) {
                v1_1 = 0;
            } else {
                v1_1 = 1;
            }
            v15_0 = new com.example.data.model.UserEntity(v16, v17, v18, v19, v20, v21, v22, v1_1, v3.getLong(v11_1));
        }
        v3.close();
        return v15_0;
    }

    static final com.example.data.model.UserEntity getUserByEmail$lambda$5(String p29, String p30, androidx.sqlite.SQLiteConnection p31)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p31, "_connection");
        androidx.sqlite.SQLiteStatement v3 = p31.prepare(p29);
        try {
            com.example.data.model.UserEntity v17_0;
            v3.bindText(1, p30);
            int v5_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "id");
            int v6_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "name");
            int v7_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "email");
            int v8_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "birthDate");
            int v9_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "sport");
            int v10_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "photoUri");
            int v11_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "passwordHash");
            int v12_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "isCurrentUser");
            int v13_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "createdAt");
        } catch (int v0_4) {
            v3.close();
            throw v0_4;
        }
        if (!v3.step()) {
            v17_0 = 0;
        } else {
            int v1_1;
            String v18 = v3.getText(v5_1);
            String v19 = v3.getText(v6_1);
            String v20 = v3.getText(v7_1);
            String v21 = v3.getText(v8_1);
            String v22 = v3.getText(v9_1);
            String v23 = v3.getText(v10_1);
            String v24 = v3.getText(v11_1);
            int v16 = 0;
            if (((int) v3.getLong(v12_1)) == 0) {
                v1_1 = 0;
            } else {
                v1_1 = 1;
            }
            v17_0 = new com.example.data.model.UserEntity(v18, v19, v20, v21, v22, v23, v24, v1_1, v3.getLong(v13_1));
        }
        v3.close();
        return v17_0;
    }

    static final com.example.data.model.UserEntity getUserById$lambda$7(String p29, String p30, androidx.sqlite.SQLiteConnection p31)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p31, "_connection");
        androidx.sqlite.SQLiteStatement v3 = p31.prepare(p29);
        try {
            com.example.data.model.UserEntity v17_0;
            v3.bindText(1, p30);
            int v5_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "id");
            int v6_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "name");
            int v7_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "email");
            int v8_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "birthDate");
            int v9_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "sport");
            int v10_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "photoUri");
            int v11_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "passwordHash");
            int v12_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "isCurrentUser");
            int v13_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "createdAt");
        } catch (int v0_4) {
            v3.close();
            throw v0_4;
        }
        if (!v3.step()) {
            v17_0 = 0;
        } else {
            int v1_1;
            String v18 = v3.getText(v5_1);
            String v19 = v3.getText(v6_1);
            String v20 = v3.getText(v7_1);
            String v21 = v3.getText(v8_1);
            String v22 = v3.getText(v9_1);
            String v23 = v3.getText(v10_1);
            String v24 = v3.getText(v11_1);
            int v16 = 0;
            if (((int) v3.getLong(v12_1)) == 0) {
                v1_1 = 0;
            } else {
                v1_1 = 1;
            }
            v17_0 = new com.example.data.model.UserEntity(v18, v19, v20, v21, v22, v23, v24, v1_1, v3.getLong(v13_1));
        }
        v3.close();
        return v17_0;
    }

    static final kotlin.Unit insertUser$lambda$0(com.example.data.local.UserDao_Impl p1, com.example.data.model.UserEntity p2, androidx.sqlite.SQLiteConnection p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "_connection");
        p1.__insertAdapterOfUserEntity.insert(p3, p2);
        return kotlin.Unit.INSTANCE;
    }

    static final kotlin.Unit setCurrentUser$lambda$9(String p2, String p3, androidx.sqlite.SQLiteConnection p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "_connection");
        androidx.sqlite.SQLiteStatement v0_1 = p4.prepare(p2);
        try {
            v0_1.bindText(1, p3);
            v0_1.step();
            v0_1.close();
            return kotlin.Unit.INSTANCE;
        } catch (Throwable v1_1) {
            v0_1.close();
            throw v1_1;
        }
    }

    static final kotlin.Unit updateUser$lambda$1(com.example.data.local.UserDao_Impl p1, com.example.data.model.UserEntity p2, androidx.sqlite.SQLiteConnection p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "_connection");
        p1.__updateAdapterOfUserEntity.handle(p3, p2);
        return kotlin.Unit.INSTANCE;
    }

    public Object clearCurrentUser(kotlin.coroutines.Continuation p6)
    {
        kotlin.Unit v1_2 = androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda0("UPDATE users SET isCurrentUser = 0"), p6);
        if (v1_2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v1_2;
        }
    }

    public Object findUserByIdentifier(String p6, kotlin.coroutines.Continuation p7)
    {
        return androidx.room.util.DBUtil.performSuspending(this.__db, 1, 0, new com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda9("SELECT * FROM users WHERE LOWER(email) = LOWER(?) OR LOWER(name) = LOWER(?) LIMIT 1", p6), p7);
    }

    public kotlinx.coroutines.flow.Flow getAllUsers()
    {
        kotlinx.coroutines.flow.Flow v1_0 = this.__db;
        String[] v2_1 = new String[1];
        v2_1[0] = "users";
        return androidx.room.coroutines.FlowUtil.createFlow(v1_0, 0, v2_1, new com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda7("SELECT * FROM users ORDER BY name ASC"));
    }

    public Object getCurrentUser(kotlin.coroutines.Continuation p6)
    {
        return androidx.room.util.DBUtil.performSuspending(this.__db, 1, 0, new com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda8("SELECT * FROM users WHERE isCurrentUser = 1 LIMIT 1"), p6);
    }

    public kotlinx.coroutines.flow.Flow getCurrentUserFlow()
    {
        kotlinx.coroutines.flow.Flow v1_0 = this.__db;
        String[] v2_1 = new String[1];
        v2_1[0] = "users";
        return androidx.room.coroutines.FlowUtil.createFlow(v1_0, 0, v2_1, new com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda5("SELECT * FROM users WHERE isCurrentUser = 1 LIMIT 1"));
    }

    public Object getUserByEmail(String p6, kotlin.coroutines.Continuation p7)
    {
        return androidx.room.util.DBUtil.performSuspending(this.__db, 1, 0, new com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda2("SELECT * FROM users WHERE email = ? LIMIT 1", p6), p7);
    }

    public Object getUserById(String p6, kotlin.coroutines.Continuation p7)
    {
        return androidx.room.util.DBUtil.performSuspending(this.__db, 1, 0, new com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda3("SELECT * FROM users WHERE id = ? LIMIT 1", p6), p7);
    }

    public Object insertUser(com.example.data.model.UserEntity p5, kotlin.coroutines.Continuation p6)
    {
        kotlin.Unit v0_2 = androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda6(this, p5), p6);
        if (v0_2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v0_2;
        }
    }

    public Object setCurrentUser(String p6, kotlin.coroutines.Continuation p7)
    {
        kotlin.Unit v1_2 = androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda1("UPDATE users SET isCurrentUser = 1 WHERE id = ?", p6), p7);
        if (v1_2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v1_2;
        }
    }

    public Object updateUser(com.example.data.model.UserEntity p5, kotlin.coroutines.Continuation p6)
    {
        kotlin.Unit v0_2 = androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda4(this, p5), p6);
        if (v0_2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v0_2;
        }
    }
}
