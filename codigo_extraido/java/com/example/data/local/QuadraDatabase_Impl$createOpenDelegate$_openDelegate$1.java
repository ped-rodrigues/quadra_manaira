package com.example.data.local;
public final class QuadraDatabase_Impl$createOpenDelegate$_openDelegate$1 extends androidx.room.RoomOpenDelegate {
    final synthetic com.example.data.local.QuadraDatabase_Impl this$0;

    QuadraDatabase_Impl$createOpenDelegate$_openDelegate$1(com.example.data.local.QuadraDatabase_Impl p4)
    {
        this.this$0 = p4;
        super(3, "702f9d271665a655eeb81c251b0ece4b", "de29828a17daa760c5e7e2f0074ab943");
        return;
    }

    public void createAllTables(androidx.sqlite.SQLiteConnection p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "connection");
        androidx.sqlite.SQLite.execSQL(p2, "CREATE TABLE IF NOT EXISTS `users` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `email` TEXT NOT NULL, `birthDate` TEXT NOT NULL, `sport` TEXT NOT NULL, `photoUri` TEXT NOT NULL, `passwordHash` TEXT NOT NULL, `isCurrentUser` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        androidx.sqlite.SQLite.execSQL(p2, "CREATE TABLE IF NOT EXISTS `bookings` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date` TEXT NOT NULL, `startTime` TEXT NOT NULL, `endTime` TEXT NOT NULL, `sport` TEXT NOT NULL, `organizerId` TEXT NOT NULL, `organizerName` TEXT NOT NULL, `notes` TEXT NOT NULL, `status` TEXT NOT NULL, `createdAt` INTEGER NOT NULL)");
        androidx.sqlite.SQLite.execSQL(p2, "CREATE TABLE IF NOT EXISTS `mural_posts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `authorId` TEXT NOT NULL, `authorName` TEXT NOT NULL, `authorPhoto` TEXT NOT NULL, `sport` TEXT NOT NULL, `text` TEXT NOT NULL, `imageType` TEXT, `likesCount` INTEGER NOT NULL, `isLikedByMe` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL)");
        androidx.sqlite.SQLite.execSQL(p2, "CREATE TABLE IF NOT EXISTS `messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `senderId` TEXT NOT NULL, `senderName` TEXT NOT NULL, `receiverId` TEXT NOT NULL, `receiverName` TEXT NOT NULL, `text` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `isRead` INTEGER NOT NULL)");
        androidx.sqlite.SQLite.execSQL(p2, "CREATE TABLE IF NOT EXISTS `notifications` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `message` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `isRead` INTEGER NOT NULL)");
        androidx.sqlite.SQLite.execSQL(p2, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        androidx.sqlite.SQLite.execSQL(p2, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'702f9d271665a655eeb81c251b0ece4b\')");
        return;
    }

    public void dropAllTables(androidx.sqlite.SQLiteConnection p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "connection");
        androidx.sqlite.SQLite.execSQL(p2, "DROP TABLE IF EXISTS `users`");
        androidx.sqlite.SQLite.execSQL(p2, "DROP TABLE IF EXISTS `bookings`");
        androidx.sqlite.SQLite.execSQL(p2, "DROP TABLE IF EXISTS `mural_posts`");
        androidx.sqlite.SQLite.execSQL(p2, "DROP TABLE IF EXISTS `messages`");
        androidx.sqlite.SQLite.execSQL(p2, "DROP TABLE IF EXISTS `notifications`");
        return;
    }

    public void onCreate(androidx.sqlite.SQLiteConnection p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "connection");
        return;
    }

    public void onOpen(androidx.sqlite.SQLiteConnection p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "connection");
        com.example.data.local.QuadraDatabase_Impl.access$internalInitInvalidationTracker(this.this$0, p2);
        return;
    }

    public void onPostMigrate(androidx.sqlite.SQLiteConnection p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "connection");
        return;
    }

    public void onPreMigrate(androidx.sqlite.SQLiteConnection p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "connection");
        androidx.room.util.DBUtil.dropFtsSyncTriggers(p2);
        return;
    }

    public androidx.room.RoomOpenDelegate$ValidationResult onValidateSchema(androidx.sqlite.SQLiteConnection p37)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p37, "connection");
        androidx.room.util.TableInfo v1_34 = ((java.util.Map) new java.util.LinkedHashMap());
        v1_34.put("id", new androidx.room.util.TableInfo$Column("id", "TEXT", 1, 1, 0, 1));
        v1_34.put("name", new androidx.room.util.TableInfo$Column("name", "TEXT", 1, 0, 0, 1));
        v1_34.put("email", new androidx.room.util.TableInfo$Column("email", "TEXT", 1, 0, 0, 1));
        v1_34.put("birthDate", new androidx.room.util.TableInfo$Column("birthDate", "TEXT", 1, 0, 0, 1));
        v1_34.put("sport", new androidx.room.util.TableInfo$Column("sport", "TEXT", 1, 0, 0, 1));
        v1_34.put("photoUri", new androidx.room.util.TableInfo$Column("photoUri", "TEXT", 1, 0, 0, 1));
        v1_34.put("passwordHash", new androidx.room.util.TableInfo$Column("passwordHash", "TEXT", 1, 0, 0, 1));
        v1_34.put("isCurrentUser", new androidx.room.util.TableInfo$Column("isCurrentUser", "INTEGER", 1, 0, 0, 1));
        v1_34.put("createdAt", new androidx.room.util.TableInfo$Column("createdAt", "INTEGER", 1, 0, 0, 1));
        androidx.room.util.TableInfo v5_2 = new java.util.LinkedHashSet();
        java.util.Map v7_1 = new androidx.room.util.TableInfo("users", v1_34, ((java.util.Set) v5_2), ((java.util.Set) new java.util.LinkedHashSet()));
        androidx.room.util.TableInfo v8_1 = androidx.room.util.TableInfo.Companion.read(p37, "users");
        if (v7_1.equals(v8_1)) {
            java.util.Map v9_4 = ((java.util.Map) new java.util.LinkedHashMap());
            v9_4.put("id", new androidx.room.util.TableInfo$Column("id", "INTEGER", 1, 1, 0, 1));
            v9_4.put("date", new androidx.room.util.TableInfo$Column("date", "TEXT", 1, 0, 0, 1));
            v9_4.put("startTime", new androidx.room.util.TableInfo$Column("startTime", "TEXT", 1, 0, 0, 1));
            v9_4.put("endTime", new androidx.room.util.TableInfo$Column("endTime", "TEXT", 1, 0, 0, 1));
            v9_4.put("sport", new androidx.room.util.TableInfo$Column("sport", "TEXT", 1, 0, 0, 1));
            v9_4.put("organizerId", new androidx.room.util.TableInfo$Column("organizerId", "TEXT", 1, 0, 0, 1));
            v9_4.put("organizerName", new androidx.room.util.TableInfo$Column("organizerName", "TEXT", 1, 0, 0, 1));
            v9_4.put("notes", new androidx.room.util.TableInfo$Column("notes", "TEXT", 1, 0, 0, 1));
            v9_4.put("status", new androidx.room.util.TableInfo$Column("status", "TEXT", 1, 0, 0, 1));
            v9_4.put("createdAt", new androidx.room.util.TableInfo$Column("createdAt", "INTEGER", 1, 0, 0, 1));
            java.util.Set v12_11 = new java.util.LinkedHashSet();
            androidx.room.util.TableInfo v13_7 = new androidx.room.util.TableInfo("bookings", v9_4, ((java.util.Set) new java.util.LinkedHashSet()), ((java.util.Set) v12_11));
            androidx.room.util.TableInfo v14_10 = androidx.room.util.TableInfo.Companion.read(p37, "bookings");
            if (v13_7.equals(v14_10)) {
                java.util.Map v15_14 = ((java.util.Map) new java.util.LinkedHashMap());
                v15_14.put("id", new androidx.room.util.TableInfo$Column("id", "INTEGER", 1, 1, 0, 1));
                v15_14.put("authorId", new androidx.room.util.TableInfo$Column("authorId", "TEXT", 1, 0, 0, 1));
                v15_14.put("authorName", new androidx.room.util.TableInfo$Column("authorName", "TEXT", 1, 0, 0, 1));
                v15_14.put("authorPhoto", new androidx.room.util.TableInfo$Column("authorPhoto", "TEXT", 1, 0, 0, 1));
                v15_14.put("sport", new androidx.room.util.TableInfo$Column("sport", "TEXT", 1, 0, 0, 1));
                v15_14.put("text", new androidx.room.util.TableInfo$Column("text", "TEXT", 1, 0, 0, 1));
                v15_14.put("imageType", new androidx.room.util.TableInfo$Column("imageType", "TEXT", 0, 0, 0, 1));
                v15_14.put("likesCount", new androidx.room.util.TableInfo$Column("likesCount", "INTEGER", 1, 0, 0, 1));
                v15_14.put("isLikedByMe", new androidx.room.util.TableInfo$Column("isLikedByMe", "INTEGER", 1, 0, 0, 1));
                v15_14.put("timestamp", new androidx.room.util.TableInfo$Column("timestamp", "INTEGER", 1, 0, 0, 1));
                java.util.Set v18_30 = new java.util.LinkedHashSet();
                androidx.room.util.TableInfo v5_7 = new androidx.room.util.TableInfo("mural_posts", v15_14, ((java.util.Set) new java.util.LinkedHashSet()), ((java.util.Set) v18_30));
                androidx.room.util.TableInfo v1_15 = androidx.room.util.TableInfo.Companion.read(p37, "mural_posts");
                if (v5_7.equals(v1_15)) {
                    java.util.Map v6_10 = ((java.util.Map) new java.util.LinkedHashMap());
                    v6_10.put("id", new androidx.room.util.TableInfo$Column("id", "INTEGER", 1, 1, 0, 1));
                    v6_10.put("senderId", new androidx.room.util.TableInfo$Column("senderId", "TEXT", 1, 0, 0, 1));
                    v6_10.put("senderName", new androidx.room.util.TableInfo$Column("senderName", "TEXT", 1, 0, 0, 1));
                    v6_10.put("receiverId", new androidx.room.util.TableInfo$Column("receiverId", "TEXT", 1, 0, 0, 1));
                    v6_10.put("receiverName", new androidx.room.util.TableInfo$Column("receiverName", "TEXT", 1, 0, 0, 1));
                    v6_10.put("text", new androidx.room.util.TableInfo$Column("text", "TEXT", 1, 0, 0, 1));
                    v6_10.put("timestamp", new androidx.room.util.TableInfo$Column("timestamp", "INTEGER", 1, 0, 0, 1));
                    v6_10.put("isRead", new androidx.room.util.TableInfo$Column("isRead", "INTEGER", 1, 0, 0, 1));
                    java.util.Set v4_13 = new java.util.LinkedHashSet();
                    androidx.room.util.TableInfo v5_10 = new androidx.room.util.TableInfo("messages", v6_10, ((java.util.Set) new java.util.LinkedHashSet()), ((java.util.Set) v4_13));
                    androidx.room.util.TableInfo v1_29 = androidx.room.util.TableInfo.Companion.read(p37, "messages");
                    if (v5_10.equals(v1_29)) {
                        java.util.Map v7_10 = ((java.util.Map) new java.util.LinkedHashMap());
                        v7_10.put("id", new androidx.room.util.TableInfo$Column("id", "INTEGER", 1, 1, 0, 1));
                        v7_10.put("type", new androidx.room.util.TableInfo$Column("type", "TEXT", 1, 0, 0, 1));
                        v7_10.put("title", new androidx.room.util.TableInfo$Column("title", "TEXT", 1, 0, 0, 1));
                        v7_10.put("message", new androidx.room.util.TableInfo$Column("message", "TEXT", 1, 0, 0, 1));
                        v7_10.put("timestamp", new androidx.room.util.TableInfo$Column("timestamp", "INTEGER", 1, 0, 0, 1));
                        v7_10.put("isRead", new androidx.room.util.TableInfo$Column("isRead", "INTEGER", 1, 0, 0, 1));
                        androidx.room.util.TableInfo v1_38 = new java.util.LinkedHashSet();
                        androidx.room.util.TableInfo v3_5 = new androidx.room.util.TableInfo("notifications", v7_10, ((java.util.Set) v1_38), ((java.util.Set) new java.util.LinkedHashSet()));
                        androidx.room.util.TableInfo v1_41 = androidx.room.util.TableInfo.Companion.read(p37, "notifications");
                        if (v3_5.equals(v1_41)) {
                            return new androidx.room.RoomOpenDelegate$ValidationResult(1, 0);
                        } else {
                            return new androidx.room.RoomOpenDelegate$ValidationResult(0, new StringBuilder().append("notifications(com.example.data.model.NotificationEntity).\n Expected:\n").append(v3_5).append("\n Found:\n").append(v1_41).toString());
                        }
                    } else {
                        return new androidx.room.RoomOpenDelegate$ValidationResult(0, new StringBuilder().append("messages(com.example.data.model.MessageEntity).\n Expected:\n").append(v5_10).append("\n Found:\n").append(v1_29).toString());
                    }
                } else {
                    return new androidx.room.RoomOpenDelegate$ValidationResult(0, new StringBuilder().append("mural_posts(com.example.data.model.MuralPostEntity).\n Expected:\n").append(v5_7).append("\n Found:\n").append(v1_15).toString());
                }
            } else {
                return new androidx.room.RoomOpenDelegate$ValidationResult(0, new StringBuilder().append("bookings(com.example.data.model.BookingEntity).\n Expected:\n").append(v13_7).append("\n Found:\n").append(v14_10).toString());
            }
        } else {
            return new androidx.room.RoomOpenDelegate$ValidationResult(0, new StringBuilder().append("users(com.example.data.model.UserEntity).\n Expected:\n").append(v7_1).append("\n Found:\n").append(v8_1).toString());
        }
    }
}
