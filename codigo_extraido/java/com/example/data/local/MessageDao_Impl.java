package com.example.data.local;
public final class MessageDao_Impl implements com.example.data.local.MessageDao {
    public static final int $stable;
    public static final com.example.data.local.MessageDao_Impl$Companion Companion;
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertAdapter __insertAdapterOfMessageEntity;

    static MessageDao_Impl()
    {
        com.example.data.local.MessageDao_Impl.Companion = new com.example.data.local.MessageDao_Impl$Companion(0);
        com.example.data.local.MessageDao_Impl.$stable = 8;
        return;
    }

    public MessageDao_Impl(androidx.room.RoomDatabase p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "__db");
        this.__db = p2;
        this.__insertAdapterOfMessageEntity = ((androidx.room.EntityInsertAdapter) new com.example.data.local.MessageDao_Impl$1());
        return;
    }

    static final java.util.List getConversation$lambda$2(String p31, String p32, String p33, androidx.sqlite.SQLiteConnection p34)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p34, "_connection");
        androidx.sqlite.SQLiteStatement v5 = p34.prepare(p31);
        try {
            v5.bindText(1, p32);
            v5.bindText(2, p33);
            v5.bindText(3, p33);
            int v0_2 = 4;
            v5.bindText(4, p32);
            int v6_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v5, "id");
            int v7_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v5, "senderId");
            int v8_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v5, "senderName");
            int v9_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v5, "receiverId");
            int v10_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v5, "receiverName");
            int v11_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v5, "text");
            int v12_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v5, "timestamp");
            int v13_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v5, "isRead");
            java.util.List v14_2 = ((java.util.List) new java.util.ArrayList());
        } catch (int v0_6) {
            v5.close();
            throw v0_6;
        }
        while (v5.step()) {
            String v1_1;
            int v16 = 0;
            long v21 = v5.getLong(v6_1);
            String v23 = v5.getText(v7_1);
            String v24 = v5.getText(v8_1);
            String v25 = v5.getText(v9_1);
            String v26 = v5.getText(v10_1);
            String v27 = v5.getText(v11_1);
            long v28 = v5.getLong(v12_1);
            int v17 = 0;
            int v18_1 = v0_2;
            if (((int) v5.getLong(v13_1)) == 0) {
                v1_1 = 0;
            } else {
                v1_1 = 1;
            }
            v14_2.add(new com.example.data.model.MessageEntity(v21, v23, v24, v25, v26, v27, v28, v1_1));
            v0_2 = v18_1;
        }
        v5.close();
        return v14_2;
    }

    static final java.util.List getMessagesForUser$lambda$1(String p30, String p31, androidx.sqlite.SQLiteConnection p32)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p32, "_connection");
        androidx.sqlite.SQLiteStatement v4 = p32.prepare(p30);
        try {
            v4.bindText(1, p31);
            int v0_0 = 2;
            v4.bindText(2, p31);
            int v5_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "id");
            int v6_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "senderId");
            int v7_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "senderName");
            int v8_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "receiverId");
            int v9_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "receiverName");
            int v10_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "text");
            int v11_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "timestamp");
            int v12_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v4, "isRead");
            java.util.List v13_2 = ((java.util.List) new java.util.ArrayList());
        } catch (int v0_4) {
            v4.close();
            throw v0_4;
        }
        while (v4.step()) {
            String v1_1;
            int v15 = 0;
            long v20 = v4.getLong(v5_1);
            String v22 = v4.getText(v6_1);
            String v23 = v4.getText(v7_1);
            String v24 = v4.getText(v8_1);
            String v25 = v4.getText(v9_1);
            String v26 = v4.getText(v10_1);
            long v27 = v4.getLong(v11_1);
            int v16 = 0;
            int v17_1 = v0_0;
            if (((int) v4.getLong(v12_1)) == 0) {
                v1_1 = 0;
            } else {
                v1_1 = 1;
            }
            v13_2.add(new com.example.data.model.MessageEntity(v20, v22, v23, v24, v25, v26, v27, v1_1));
            v0_0 = v17_1;
        }
        v4.close();
        return v13_2;
    }

    static final long insertMessage$lambda$0(com.example.data.local.MessageDao_Impl p2, com.example.data.model.MessageEntity p3, androidx.sqlite.SQLiteConnection p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "_connection");
        return p2.__insertAdapterOfMessageEntity.insertAndReturnId(p4, p3);
    }

    static final kotlin.Unit markAsRead$lambda$3(String p2, String p3, String p4, androidx.sqlite.SQLiteConnection p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "_connection");
        androidx.sqlite.SQLiteStatement v0_1 = p5.prepare(p2);
        try {
            v0_1.bindText(1, p3);
            v0_1.bindText(2, p4);
            v0_1.step();
            v0_1.close();
            return kotlin.Unit.INSTANCE;
        } catch (Throwable v1_1) {
            v0_1.close();
            throw v1_1;
        }
    }

    public kotlinx.coroutines.flow.Flow getConversation(String p6, String p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "user1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "user2");
        kotlinx.coroutines.flow.Flow v1_1 = this.__db;
        String[] v2_1 = new String[1];
        v2_1[0] = "messages";
        return androidx.room.coroutines.FlowUtil.createFlow(v1_1, 0, v2_1, new com.example.data.local.MessageDao_Impl$$ExternalSyntheticLambda1("SELECT * FROM messages WHERE (senderId = ? AND receiverId = ?) OR (senderId = ? AND receiverId = ?) ORDER BY timestamp ASC", p6, p7));
    }

    public kotlinx.coroutines.flow.Flow getMessagesForUser(String p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "userId");
        kotlinx.coroutines.flow.Flow v1_1 = this.__db;
        String[] v2_1 = new String[1];
        v2_1[0] = "messages";
        return androidx.room.coroutines.FlowUtil.createFlow(v1_1, 0, v2_1, new com.example.data.local.MessageDao_Impl$$ExternalSyntheticLambda3("SELECT * FROM messages WHERE senderId = ? OR receiverId = ? ORDER BY timestamp ASC", p6));
    }

    public Object insertMessage(com.example.data.model.MessageEntity p5, kotlin.coroutines.Continuation p6)
    {
        return androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.MessageDao_Impl$$ExternalSyntheticLambda2(this, p5), p6);
    }

    public Object markAsRead(String p6, String p7, kotlin.coroutines.Continuation p8)
    {
        kotlin.Unit v1_2 = androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.MessageDao_Impl$$ExternalSyntheticLambda0("UPDATE messages SET isRead = 1 WHERE receiverId = ? AND senderId = ?", p6, p7), p8);
        if (v1_2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v1_2;
        }
    }
}
