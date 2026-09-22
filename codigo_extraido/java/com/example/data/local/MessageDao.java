package com.example.data.local;
public interface MessageDao {

    public abstract kotlinx.coroutines.flow.Flow getConversation(String p0, String p1);

    public abstract kotlinx.coroutines.flow.Flow getMessagesForUser(String p0);

    public abstract Object insertMessage(com.example.data.model.MessageEntity p0, kotlin.coroutines.Continuation p1);

    public abstract Object markAsRead(String p0, String p1, kotlin.coroutines.Continuation p2);
}
