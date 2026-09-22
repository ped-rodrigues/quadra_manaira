package com.example.data.local;
public abstract class QuadraDatabase extends androidx.room.RoomDatabase {
    public static final int $stable;
    public static final com.example.data.local.QuadraDatabase$Companion Companion;
    private static volatile com.example.data.local.QuadraDatabase INSTANCE;

    static QuadraDatabase()
    {
        com.example.data.local.QuadraDatabase.Companion = new com.example.data.local.QuadraDatabase$Companion(0);
        com.example.data.local.QuadraDatabase.$stable = 8;
        return;
    }

    public QuadraDatabase()
    {
        return;
    }

    public static final synthetic com.example.data.local.QuadraDatabase access$getINSTANCE$cp()
    {
        return com.example.data.local.QuadraDatabase.INSTANCE;
    }

    public static final synthetic void access$setINSTANCE$cp(com.example.data.local.QuadraDatabase p0)
    {
        com.example.data.local.QuadraDatabase.INSTANCE = p0;
        return;
    }

    public abstract com.example.data.local.BookingDao bookingDao();

    public abstract com.example.data.local.MessageDao messageDao();

    public abstract com.example.data.local.MuralDao muralDao();

    public abstract com.example.data.local.NotificationDao notificationDao();

    public abstract com.example.data.local.UserDao userDao();
}
