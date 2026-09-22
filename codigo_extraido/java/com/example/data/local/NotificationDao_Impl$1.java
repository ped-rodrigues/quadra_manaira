package com.example.data.local;
public final class NotificationDao_Impl$1 extends androidx.room.EntityInsertAdapter {

    NotificationDao_Impl$1()
    {
        return;
    }

    protected void bind(androidx.sqlite.SQLiteStatement p5, com.example.data.model.NotificationEntity p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "statement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "entity");
        p5.bindLong(1, p6.getId());
        p5.bindText(2, p6.getType());
        p5.bindText(3, p6.getTitle());
        p5.bindText(4, p6.getMessage());
        p5.bindLong(5, p6.getTimestamp());
        p5.bindLong(6, ((long) p6.isRead()));
        return;
    }

    public bridge synthetic void bind(androidx.sqlite.SQLiteStatement p2, Object p3)
    {
        this.bind(p2, ((com.example.data.model.NotificationEntity) p3));
        return;
    }

    protected String createQuery()
    {
        return "INSERT OR REPLACE INTO `notifications` (`id`,`type`,`title`,`message`,`timestamp`,`isRead`) VALUES (nullif(?, 0),?,?,?,?,?)";
    }
}
