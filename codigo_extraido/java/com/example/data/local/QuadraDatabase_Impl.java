package com.example.data.local;
public final class QuadraDatabase_Impl extends com.example.data.local.QuadraDatabase {
    public static final int $stable;
    private final kotlin.Lazy _bookingDao;
    private final kotlin.Lazy _messageDao;
    private final kotlin.Lazy _muralDao;
    private final kotlin.Lazy _notificationDao;
    private final kotlin.Lazy _userDao;

    static QuadraDatabase_Impl()
    {
        com.example.data.local.QuadraDatabase_Impl.$stable = 8;
        return;
    }

    public QuadraDatabase_Impl()
    {
        this._userDao = kotlin.LazyKt.lazy(new com.example.data.local.QuadraDatabase_Impl$$ExternalSyntheticLambda0(this));
        this._bookingDao = kotlin.LazyKt.lazy(new com.example.data.local.QuadraDatabase_Impl$$ExternalSyntheticLambda1(this));
        this._muralDao = kotlin.LazyKt.lazy(new com.example.data.local.QuadraDatabase_Impl$$ExternalSyntheticLambda2(this));
        this._messageDao = kotlin.LazyKt.lazy(new com.example.data.local.QuadraDatabase_Impl$$ExternalSyntheticLambda3(this));
        this._notificationDao = kotlin.LazyKt.lazy(new com.example.data.local.QuadraDatabase_Impl$$ExternalSyntheticLambda4(this));
        return;
    }

    static final com.example.data.local.BookingDao_Impl _bookingDao$lambda$1(com.example.data.local.QuadraDatabase_Impl p2)
    {
        return new com.example.data.local.BookingDao_Impl(((androidx.room.RoomDatabase) p2));
    }

    static final com.example.data.local.MessageDao_Impl _messageDao$lambda$3(com.example.data.local.QuadraDatabase_Impl p2)
    {
        return new com.example.data.local.MessageDao_Impl(((androidx.room.RoomDatabase) p2));
    }

    static final com.example.data.local.MuralDao_Impl _muralDao$lambda$2(com.example.data.local.QuadraDatabase_Impl p2)
    {
        return new com.example.data.local.MuralDao_Impl(((androidx.room.RoomDatabase) p2));
    }

    static final com.example.data.local.NotificationDao_Impl _notificationDao$lambda$4(com.example.data.local.QuadraDatabase_Impl p2)
    {
        return new com.example.data.local.NotificationDao_Impl(((androidx.room.RoomDatabase) p2));
    }

    static final com.example.data.local.UserDao_Impl _userDao$lambda$0(com.example.data.local.QuadraDatabase_Impl p2)
    {
        return new com.example.data.local.UserDao_Impl(((androidx.room.RoomDatabase) p2));
    }

    public static final synthetic void access$internalInitInvalidationTracker(com.example.data.local.QuadraDatabase_Impl p0, androidx.sqlite.SQLiteConnection p1)
    {
        p0.internalInitInvalidationTracker(p1);
        return;
    }

    public com.example.data.local.BookingDao bookingDao()
    {
        return ((com.example.data.local.BookingDao) this._bookingDao.getValue());
    }

    public void clearAllTables()
    {
        String[] v0_1 = new String[5];
        v0_1[0] = "users";
        v0_1[1] = "bookings";
        v0_1[2] = "mural_posts";
        v0_1[3] = "messages";
        v0_1[4] = "notifications";
        super.performClear(0, v0_1);
        return;
    }

    public java.util.List createAutoMigrations(java.util.Map p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "autoMigrationSpecs");
        return ((java.util.List) new java.util.ArrayList());
    }

    protected androidx.room.InvalidationTracker createInvalidationTracker()
    {
        String[] v4_0 = new String[5];
        v4_0[0] = "users";
        v4_0[1] = "bookings";
        v4_0[2] = "mural_posts";
        v4_0[3] = "messages";
        v4_0[4] = "notifications";
        return new androidx.room.InvalidationTracker(((androidx.room.RoomDatabase) this), ((java.util.Map) new java.util.LinkedHashMap()), ((java.util.Map) new java.util.LinkedHashMap()), v4_0);
    }

    protected androidx.room.RoomOpenDelegate createOpenDelegate()
    {
        return ((androidx.room.RoomOpenDelegate) new com.example.data.local.QuadraDatabase_Impl$createOpenDelegate$_openDelegate$1(this));
    }

    public bridge synthetic androidx.room.RoomOpenDelegateMarker createOpenDelegate()
    {
        return ((androidx.room.RoomOpenDelegateMarker) this.createOpenDelegate());
    }

    public java.util.Set getRequiredAutoMigrationSpecClasses()
    {
        return ((java.util.Set) new java.util.LinkedHashSet());
    }

    protected java.util.Map getRequiredTypeConverterClasses()
    {
        java.util.Map v0_2 = ((java.util.Map) new java.util.LinkedHashMap());
        v0_2.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.example.data.local.UserDao), com.example.data.local.UserDao_Impl.Companion.getRequiredConverters());
        v0_2.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.example.data.local.BookingDao), com.example.data.local.BookingDao_Impl.Companion.getRequiredConverters());
        v0_2.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.example.data.local.MuralDao), com.example.data.local.MuralDao_Impl.Companion.getRequiredConverters());
        v0_2.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.example.data.local.MessageDao), com.example.data.local.MessageDao_Impl.Companion.getRequiredConverters());
        v0_2.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.example.data.local.NotificationDao), com.example.data.local.NotificationDao_Impl.Companion.getRequiredConverters());
        return v0_2;
    }

    public com.example.data.local.MessageDao messageDao()
    {
        return ((com.example.data.local.MessageDao) this._messageDao.getValue());
    }

    public com.example.data.local.MuralDao muralDao()
    {
        return ((com.example.data.local.MuralDao) this._muralDao.getValue());
    }

    public com.example.data.local.NotificationDao notificationDao()
    {
        return ((com.example.data.local.NotificationDao) this._notificationDao.getValue());
    }

    public com.example.data.local.UserDao userDao()
    {
        return ((com.example.data.local.UserDao) this._userDao.getValue());
    }
}
