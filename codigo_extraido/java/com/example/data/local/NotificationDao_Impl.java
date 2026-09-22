package com.example.data.local;
public final class NotificationDao_Impl implements com.example.data.local.NotificationDao {
    public static final int $stable;
    public static final com.example.data.local.NotificationDao_Impl$Companion Companion;
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertAdapter __insertAdapterOfNotificationEntity;

    static NotificationDao_Impl()
    {
        com.example.data.local.NotificationDao_Impl.Companion = new com.example.data.local.NotificationDao_Impl$Companion(0);
        com.example.data.local.NotificationDao_Impl.$stable = 8;
        return;
    }

    public NotificationDao_Impl(androidx.room.RoomDatabase p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "__db");
        this.__db = p2;
        this.__insertAdapterOfNotificationEntity = ((androidx.room.EntityInsertAdapter) new com.example.data.local.NotificationDao_Impl$1());
        return;
    }

    static final kotlin.Unit deleteNotification$lambda$5(String p2, long p3, androidx.sqlite.SQLiteConnection p5)
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

    static final java.util.List getAllNotifications$lambda$1(String p24, androidx.sqlite.SQLiteConnection p25)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p25, "_connection");
        androidx.sqlite.SQLiteStatement v3 = p25.prepare(p24);
        try {
            Throwable v0_3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "id");
            int v4_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "type");
            int v5_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "title");
            int v6_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "message");
            int v7_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "timestamp");
            int v8_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "isRead");
            java.util.List v9_2 = ((java.util.List) new java.util.ArrayList());
        } catch (Throwable v0_1) {
            v3.close();
            throw v0_1;
        }
        while (v3.step()) {
            int v13_2;
            int v11 = 0;
            long v16 = v3.getLong(v0_3);
            String v18 = v3.getText(v4_1);
            String v19 = v3.getText(v5_1);
            String v20 = v3.getText(v6_1);
            long v21 = v3.getLong(v7_1);
            int v12 = 0;
            if (((int) v3.getLong(v8_1)) == 0) {
                v13_2 = 0;
            } else {
                v13_2 = 1;
            }
            v9_2.add(new com.example.data.model.NotificationEntity(v16, v18, v19, v20, v21, v13_2));
        }
        v3.close();
        return v9_2;
    }

    static final int getUnreadCount$lambda$2(String p5, androidx.sqlite.SQLiteConnection p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "_connection");
        androidx.sqlite.SQLiteStatement v0_1 = p6.prepare(p5);
        try {
            int v2_0;
            if (!v0_1.step()) {
                v2_0 = 0;
            } else {
                v2_0 = ((int) v0_1.getLong(0));
            }
        } catch (Throwable v1) {
            v0_1.close();
            throw v1;
        }
        v0_1.close();
        return v2_0;
    }

    static final long insertNotification$lambda$0(com.example.data.local.NotificationDao_Impl p2, com.example.data.model.NotificationEntity p3, androidx.sqlite.SQLiteConnection p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "_connection");
        return p2.__insertAdapterOfNotificationEntity.insertAndReturnId(p4, p3);
    }

    static final kotlin.Unit markAllAsRead$lambda$4(String p2, androidx.sqlite.SQLiteConnection p3)
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

    static final kotlin.Unit markAsRead$lambda$3(String p2, long p3, androidx.sqlite.SQLiteConnection p5)
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

    public Object deleteNotification(long p6, kotlin.coroutines.Continuation p8)
    {
        kotlin.Unit v1_2 = androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.NotificationDao_Impl$$ExternalSyntheticLambda5("DELETE FROM notifications WHERE id = ?", p6), p8);
        if (v1_2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v1_2;
        }
    }

    public kotlinx.coroutines.flow.Flow getAllNotifications()
    {
        kotlinx.coroutines.flow.Flow v1_0 = this.__db;
        String[] v2_1 = new String[1];
        v2_1[0] = "notifications";
        return androidx.room.coroutines.FlowUtil.createFlow(v1_0, 0, v2_1, new com.example.data.local.NotificationDao_Impl$$ExternalSyntheticLambda1("SELECT * FROM notifications ORDER BY timestamp DESC"));
    }

    public kotlinx.coroutines.flow.Flow getUnreadCount()
    {
        kotlinx.coroutines.flow.Flow v1_0 = this.__db;
        String[] v2_1 = new String[1];
        v2_1[0] = "notifications";
        return androidx.room.coroutines.FlowUtil.createFlow(v1_0, 0, v2_1, new com.example.data.local.NotificationDao_Impl$$ExternalSyntheticLambda2("SELECT COUNT(*) FROM notifications WHERE isRead = 0"));
    }

    public Object insertNotification(com.example.data.model.NotificationEntity p5, kotlin.coroutines.Continuation p6)
    {
        return androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.NotificationDao_Impl$$ExternalSyntheticLambda3(this, p5), p6);
    }

    public Object markAllAsRead(kotlin.coroutines.Continuation p6)
    {
        kotlin.Unit v1_2 = androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.NotificationDao_Impl$$ExternalSyntheticLambda4("UPDATE notifications SET isRead = 1"), p6);
        if (v1_2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v1_2;
        }
    }

    public Object markAsRead(long p6, kotlin.coroutines.Continuation p8)
    {
        kotlin.Unit v1_2 = androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.NotificationDao_Impl$$ExternalSyntheticLambda0("UPDATE notifications SET isRead = 1 WHERE id = ?", p6), p8);
        if (v1_2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v1_2;
        }
    }
}
