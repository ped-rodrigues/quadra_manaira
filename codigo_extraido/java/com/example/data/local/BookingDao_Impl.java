package com.example.data.local;
public final class BookingDao_Impl implements com.example.data.local.BookingDao {
    public static final int $stable;
    public static final com.example.data.local.BookingDao_Impl$Companion Companion;
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertAdapter __insertAdapterOfBookingEntity;

    static BookingDao_Impl()
    {
        com.example.data.local.BookingDao_Impl.Companion = new com.example.data.local.BookingDao_Impl$Companion(0);
        com.example.data.local.BookingDao_Impl.$stable = 8;
        return;
    }

    public BookingDao_Impl(androidx.room.RoomDatabase p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "__db");
        this.__db = p2;
        this.__insertAdapterOfBookingEntity = ((androidx.room.EntityInsertAdapter) new com.example.data.local.BookingDao_Impl$1());
        return;
    }

    static final kotlin.Unit cancelBooking$lambda$3(String p2, long p3, androidx.sqlite.SQLiteConnection p5)
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

    static final kotlin.Unit deleteBooking$lambda$4(String p2, long p3, androidx.sqlite.SQLiteConnection p5)
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

    static final java.util.List getAllBookings$lambda$1(String p32, androidx.sqlite.SQLiteConnection p33)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p33, "_connection");
        androidx.sqlite.SQLiteStatement v3 = p33.prepare(p32);
        try {
            Throwable v0_3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "id");
            int v4_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "date");
            int v5_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "startTime");
            int v6_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "endTime");
            int v7_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "sport");
            int v8_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "organizerId");
            int v9_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "organizerName");
            int v10_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "notes");
            int v11_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "status");
            int v12_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "createdAt");
            java.util.List v13_2 = ((java.util.List) new java.util.ArrayList());
        } catch (Throwable v0_1) {
            v3.close();
            throw v0_1;
        }
        while (v3.step()) {
            long v15 = 0;
            v13_2.add(new com.example.data.model.BookingEntity(v3.getLong(v0_3), v3.getText(v4_1), v3.getText(v5_1), v3.getText(v6_1), v3.getText(v7_1), v3.getText(v8_1), v3.getText(v9_1), v3.getText(v10_1), v3.getText(v11_1), v3.getLong(v12_1)));
        }
        v3.close();
        return v13_2;
    }

    static final java.util.List getBookingsByDate$lambda$2(String p34, String p35, androidx.sqlite.SQLiteConnection p36)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p36, "_connection");
        androidx.sqlite.SQLiteStatement v3 = p36.prepare(p34);
        Throwable v0_2 = 1;
        try {
            v3.bindText(1, p35);
            int v5_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "id");
            int v6_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "date");
            int v7_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "startTime");
            int v8_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "endTime");
            int v9_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "sport");
            int v10_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "organizerId");
            int v11_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "organizerName");
            int v12_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "notes");
            int v13_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "status");
            int v14_1 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(v3, "createdAt");
            java.util.List v15_2 = ((java.util.List) new java.util.ArrayList());
        } catch (Throwable v0_1) {
            v3.close();
            throw v0_1;
        }
        while (v3.step()) {
            com.example.data.model.BookingEntity v17 = 0;
            Throwable v16_1 = v0_2;
            v15_2.add(new com.example.data.model.BookingEntity(v3.getLong(v5_1), v3.getText(v6_1), v3.getText(v7_1), v3.getText(v8_1), v3.getText(v9_1), v3.getText(v10_1), v3.getText(v11_1), v3.getText(v12_1), v3.getText(v13_1), v3.getLong(v14_1)));
            v0_2 = v16_1;
        }
        v3.close();
        return v15_2;
    }

    static final long insertBooking$lambda$0(com.example.data.local.BookingDao_Impl p2, com.example.data.model.BookingEntity p3, androidx.sqlite.SQLiteConnection p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "_connection");
        return p2.__insertAdapterOfBookingEntity.insertAndReturnId(p4, p3);
    }

    public Object cancelBooking(long p6, kotlin.coroutines.Continuation p8)
    {
        kotlin.Unit v1_2 = androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.BookingDao_Impl$$ExternalSyntheticLambda3("UPDATE bookings SET status = \'CANCELLED\' WHERE id = ?", p6), p8);
        if (v1_2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v1_2;
        }
    }

    public Object deleteBooking(long p6, kotlin.coroutines.Continuation p8)
    {
        kotlin.Unit v1_2 = androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.BookingDao_Impl$$ExternalSyntheticLambda2("DELETE FROM bookings WHERE id = ?", p6), p8);
        if (v1_2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v1_2;
        }
    }

    public kotlinx.coroutines.flow.Flow getAllBookings()
    {
        kotlinx.coroutines.flow.Flow v1_0 = this.__db;
        String[] v2_1 = new String[1];
        v2_1[0] = "bookings";
        return androidx.room.coroutines.FlowUtil.createFlow(v1_0, 0, v2_1, new com.example.data.local.BookingDao_Impl$$ExternalSyntheticLambda0("SELECT * FROM bookings ORDER BY date ASC, startTime ASC"));
    }

    public kotlinx.coroutines.flow.Flow getBookingsByDate(String p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "date");
        kotlinx.coroutines.flow.Flow v1_1 = this.__db;
        String[] v2_1 = new String[1];
        v2_1[0] = "bookings";
        return androidx.room.coroutines.FlowUtil.createFlow(v1_1, 0, v2_1, new com.example.data.local.BookingDao_Impl$$ExternalSyntheticLambda1("SELECT * FROM bookings WHERE date = ? ORDER BY startTime ASC", p6));
    }

    public Object insertBooking(com.example.data.model.BookingEntity p5, kotlin.coroutines.Continuation p6)
    {
        return androidx.room.util.DBUtil.performSuspending(this.__db, 0, 1, new com.example.data.local.BookingDao_Impl$$ExternalSyntheticLambda4(this, p5), p6);
    }
}
