package com.example.data.local;
public final class BookingDao_Impl$1 extends androidx.room.EntityInsertAdapter {

    BookingDao_Impl$1()
    {
        return;
    }

    protected void bind(androidx.sqlite.SQLiteStatement p4, com.example.data.model.BookingEntity p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "statement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "entity");
        p4.bindLong(1, p5.getId());
        p4.bindText(2, p5.getDate());
        p4.bindText(3, p5.getStartTime());
        p4.bindText(4, p5.getEndTime());
        p4.bindText(5, p5.getSport());
        p4.bindText(6, p5.getOrganizerId());
        p4.bindText(7, p5.getOrganizerName());
        p4.bindText(8, p5.getNotes());
        p4.bindText(9, p5.getStatus());
        p4.bindLong(10, p5.getCreatedAt());
        return;
    }

    public bridge synthetic void bind(androidx.sqlite.SQLiteStatement p2, Object p3)
    {
        this.bind(p2, ((com.example.data.model.BookingEntity) p3));
        return;
    }

    protected String createQuery()
    {
        return "INSERT OR REPLACE INTO `bookings` (`id`,`date`,`startTime`,`endTime`,`sport`,`organizerId`,`organizerName`,`notes`,`status`,`createdAt`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
    }
}
