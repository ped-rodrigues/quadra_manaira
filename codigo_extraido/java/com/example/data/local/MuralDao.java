package com.example.data.local;
public interface MuralDao {

    public abstract kotlinx.coroutines.flow.Flow getAllPosts();

    public abstract Object insertPost(com.example.data.model.MuralPostEntity p0, kotlin.coroutines.Continuation p1);

    public abstract Object likePost(long p0, kotlin.coroutines.Continuation p1);

    public abstract Object unlikePost(long p0, kotlin.coroutines.Continuation p1);
}
