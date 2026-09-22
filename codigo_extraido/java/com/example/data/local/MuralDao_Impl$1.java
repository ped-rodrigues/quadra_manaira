package com.example.data.local;
public final class MuralDao_Impl$1 extends androidx.room.EntityInsertAdapter {

    MuralDao_Impl$1()
    {
        return;
    }

    protected void bind(androidx.sqlite.SQLiteStatement p6, com.example.data.model.MuralPostEntity p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "statement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "entity");
        p6.bindLong(1, p7.getId());
        p6.bindText(2, p7.getAuthorId());
        p6.bindText(3, p7.getAuthorName());
        p6.bindText(4, p7.getAuthorPhoto());
        p6.bindText(5, p7.getSport());
        p6.bindText(6, p7.getText());
        String v0_6 = p7.getImageType();
        if (v0_6 != null) {
            p6.bindText(7, v0_6);
        } else {
            p6.bindNull(7);
        }
        p6.bindLong(8, ((long) p7.getLikesCount()));
        p6.bindLong(9, ((long) p7.isLikedByMe()));
        p6.bindLong(10, p7.getTimestamp());
        return;
    }

    public bridge synthetic void bind(androidx.sqlite.SQLiteStatement p2, Object p3)
    {
        this.bind(p2, ((com.example.data.model.MuralPostEntity) p3));
        return;
    }

    protected String createQuery()
    {
        return "INSERT OR REPLACE INTO `mural_posts` (`id`,`authorId`,`authorName`,`authorPhoto`,`sport`,`text`,`imageType`,`likesCount`,`isLikedByMe`,`timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
    }
}
