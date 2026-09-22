package com.example.data.local;
public final class MessageDao_Impl$1 extends androidx.room.EntityInsertAdapter {

    MessageDao_Impl$1()
    {
        return;
    }

    protected void bind(androidx.sqlite.SQLiteStatement p5, com.example.data.model.MessageEntity p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "statement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "entity");
        p5.bindLong(1, p6.getId());
        p5.bindText(2, p6.getSenderId());
        p5.bindText(3, p6.getSenderName());
        p5.bindText(4, p6.getReceiverId());
        p5.bindText(5, p6.getReceiverName());
        p5.bindText(6, p6.getText());
        p5.bindLong(7, p6.getTimestamp());
        p5.bindLong(8, ((long) p6.isRead()));
        return;
    }

    public bridge synthetic void bind(androidx.sqlite.SQLiteStatement p2, Object p3)
    {
        this.bind(p2, ((com.example.data.model.MessageEntity) p3));
        return;
    }

    protected String createQuery()
    {
        return "INSERT OR REPLACE INTO `messages` (`id`,`senderId`,`senderName`,`receiverId`,`receiverName`,`text`,`timestamp`,`isRead`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
    }
}
