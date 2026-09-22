package com.example.data.local;
public interface NotificationDao {

    public abstract Object deleteNotification(long p0, kotlin.coroutines.Continuation p1);

    public abstract kotlinx.coroutines.flow.Flow getAllNotifications();

    public abstract kotlinx.coroutines.flow.Flow getUnreadCount();

    public abstract Object insertNotification(com.example.data.model.NotificationEntity p0, kotlin.coroutines.Continuation p1);

    public abstract Object markAllAsRead(kotlin.coroutines.Continuation p0);

    public abstract Object markAsRead(long p0, kotlin.coroutines.Continuation p1);
}
