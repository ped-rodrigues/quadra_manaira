package com.example.data.local;
public final class UserDao_Impl$1 extends androidx.room.EntityInsertAdapter {

    UserDao_Impl$1()
    {
        return;
    }

    protected void bind(androidx.sqlite.SQLiteStatement p5, com.example.data.model.UserEntity p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "statement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "entity");
        p5.bindText(1, p6.getId());
        p5.bindText(2, p6.getName());
        p5.bindText(3, p6.getEmail());
        p5.bindText(4, p6.getBirthDate());
        p5.bindText(5, p6.getSport());
        p5.bindText(6, p6.getPhotoUri());
        p5.bindText(7, p6.getPasswordHash());
        p5.bindLong(8, ((long) p6.isCurrentUser()));
        p5.bindLong(9, p6.getCreatedAt());
        return;
    }

    public bridge synthetic void bind(androidx.sqlite.SQLiteStatement p2, Object p3)
    {
        this.bind(p2, ((com.example.data.model.UserEntity) p3));
        return;
    }

    protected String createQuery()
    {
        return "INSERT OR REPLACE INTO `users` (`id`,`name`,`email`,`birthDate`,`sport`,`photoUri`,`passwordHash`,`isCurrentUser`,`createdAt`) VALUES (?,?,?,?,?,?,?,?,?)";
    }
}
