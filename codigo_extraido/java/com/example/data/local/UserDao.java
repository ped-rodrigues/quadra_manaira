package com.example.data.local;
public interface UserDao {

    public abstract Object clearCurrentUser(kotlin.coroutines.Continuation p0);

    public abstract Object findUserByIdentifier(String p0, kotlin.coroutines.Continuation p1);

    public abstract kotlinx.coroutines.flow.Flow getAllUsers();

    public abstract Object getCurrentUser(kotlin.coroutines.Continuation p0);

    public abstract kotlinx.coroutines.flow.Flow getCurrentUserFlow();

    public abstract Object getUserByEmail(String p0, kotlin.coroutines.Continuation p1);

    public abstract Object getUserById(String p0, kotlin.coroutines.Continuation p1);

    public abstract Object insertUser(com.example.data.model.UserEntity p0, kotlin.coroutines.Continuation p1);

    public abstract Object setCurrentUser(String p0, kotlin.coroutines.Continuation p1);

    public abstract Object updateUser(com.example.data.model.UserEntity p0, kotlin.coroutines.Continuation p1);
}
