package com.example.data.local;
public interface BookingDao {

    public abstract Object cancelBooking(long p0, kotlin.coroutines.Continuation p1);

    public abstract Object deleteBooking(long p0, kotlin.coroutines.Continuation p1);

    public abstract kotlinx.coroutines.flow.Flow getAllBookings();

    public abstract kotlinx.coroutines.flow.Flow getBookingsByDate(String p0);

    public abstract Object insertBooking(com.example.data.model.BookingEntity p0, kotlin.coroutines.Continuation p1);
}
