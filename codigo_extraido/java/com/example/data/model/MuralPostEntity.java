package com.example.data.model;
public final class MuralPostEntity {
    public static final int $stable;
    private final String authorId;
    private final String authorName;
    private final String authorPhoto;
    private final long id;
    private final String imageType;
    private final boolean isLikedByMe;
    private final int likesCount;
    private final String sport;
    private final String text;
    private final long timestamp;

    static MuralPostEntity()
    {
        return;
    }

    public MuralPostEntity(long p2, String p4, String p5, String p6, String p7, String p8, String p9, int p10, boolean p11, long p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "authorId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "authorName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "authorPhoto");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "sport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "text");
        this.id = p2;
        this.authorId = p4;
        this.authorName = p5;
        this.authorPhoto = p6;
        this.sport = p7;
        this.text = p8;
        this.imageType = p9;
        this.likesCount = p10;
        this.isLikedByMe = p11;
        this.timestamp = p12;
        return;
    }

    public synthetic MuralPostEntity(long p17, String p19, String p20, String p21, String p22, String p23, String p24, int p25, boolean p26, long p27, int p29, kotlin.jvm.internal.DefaultConstructorMarker p30)
    {
        long v4;
        if ((p29 & 1) == 0) {
            v4 = p17;
        } else {
            v4 = 0;
        }
        String v11;
        if ((p29 & 64) == 0) {
            v11 = p24;
        } else {
            v11 = 0;
        }
        int v12;
        if ((p29 & 128) == 0) {
            v12 = p25;
        } else {
            v12 = 0;
        }
        boolean v13;
        if ((p29 & 256) == 0) {
            v13 = p26;
        } else {
            v13 = 0;
        }
        long v14;
        if ((p29 & 512) == 0) {
            v14 = p27;
        } else {
            v14 = System.currentTimeMillis();
        }
        this(v4, p19, p20, p21, p22, p23, v11, v12, v13, v14);
        return;
    }

    public static synthetic com.example.data.model.MuralPostEntity copy$default(com.example.data.model.MuralPostEntity p13, long p14, String p16, String p17, String p18, String p19, String p20, String p21, int p22, boolean p23, long p24, int p26, Object p27)
    {
        long v1_1;
        if ((p26 & 1) == 0) {
            v1_1 = p14;
        } else {
            v1_1 = p13.id;
        }
        String v3_1;
        if ((p26 & 2) == 0) {
            v3_1 = p16;
        } else {
            v3_1 = p13.authorId;
        }
        String v4_0;
        if ((p26 & 4) == 0) {
            v4_0 = p17;
        } else {
            v4_0 = p13.authorName;
        }
        String v5_1;
        if ((p26 & 8) == 0) {
            v5_1 = p18;
        } else {
            v5_1 = p13.authorPhoto;
        }
        String v6_1;
        if ((p26 & 16) == 0) {
            v6_1 = p19;
        } else {
            v6_1 = p13.sport;
        }
        String v7_1;
        if ((p26 & 32) == 0) {
            v7_1 = p20;
        } else {
            v7_1 = p13.text;
        }
        String v8_1;
        if ((p26 & 64) == 0) {
            v8_1 = p21;
        } else {
            v8_1 = p13.imageType;
        }
        int v9_1;
        if ((p26 & 128) == 0) {
            v9_1 = p22;
        } else {
            v9_1 = p13.likesCount;
        }
        boolean v10_1;
        if ((p26 & 256) == 0) {
            v10_1 = p23;
        } else {
            v10_1 = p13.isLikedByMe;
        }
        long v25;
        if ((p26 & 512) == 0) {
            v25 = p24;
        } else {
            v25 = p13.timestamp;
        }
        return p13.copy(v1_1, v3_1, v4_0, v5_1, v6_1, v7_1, v8_1, v9_1, v10_1, v25);
    }

    public final long component1()
    {
        return this.id;
    }

    public final long component10()
    {
        return this.timestamp;
    }

    public final String component2()
    {
        return this.authorId;
    }

    public final String component3()
    {
        return this.authorName;
    }

    public final String component4()
    {
        return this.authorPhoto;
    }

    public final String component5()
    {
        return this.sport;
    }

    public final String component6()
    {
        return this.text;
    }

    public final String component7()
    {
        return this.imageType;
    }

    public final int component8()
    {
        return this.likesCount;
    }

    public final boolean component9()
    {
        return this.isLikedByMe;
    }

    public final com.example.data.model.MuralPostEntity copy(long p15, String p17, String p18, String p19, String p20, String p21, String p22, int p23, boolean p24, long p25)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "authorId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "authorName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "authorPhoto");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p20, "sport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p21, "text");
        return new com.example.data.model.MuralPostEntity(p15, p17, p18, p19, p20, p21, p22, p23, p24, p25);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.example.data.model.MuralPostEntity)) {
                if (this.id == ((com.example.data.model.MuralPostEntity) p8).id) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.authorId, ((com.example.data.model.MuralPostEntity) p8).authorId)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.authorName, ((com.example.data.model.MuralPostEntity) p8).authorName)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.authorPhoto, ((com.example.data.model.MuralPostEntity) p8).authorPhoto)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.sport, ((com.example.data.model.MuralPostEntity) p8).sport)) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.text, ((com.example.data.model.MuralPostEntity) p8).text)) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.imageType, ((com.example.data.model.MuralPostEntity) p8).imageType)) {
                                            if (this.likesCount == ((com.example.data.model.MuralPostEntity) p8).likesCount) {
                                                if (this.isLikedByMe == ((com.example.data.model.MuralPostEntity) p8).isLikedByMe) {
                                                    if (this.timestamp == ((com.example.data.model.MuralPostEntity) p8).timestamp) {
                                                        return 1;
                                                    } else {
                                                        return 0;
                                                    }
                                                } else {
                                                    return 0;
                                                }
                                            } else {
                                                return 0;
                                            }
                                        } else {
                                            return 0;
                                        }
                                    } else {
                                        return 0;
                                    }
                                } else {
                                    return 0;
                                }
                            } else {
                                return 0;
                            }
                        } else {
                            return 0;
                        }
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final String getAuthorId()
    {
        return this.authorId;
    }

    public final String getAuthorName()
    {
        return this.authorName;
    }

    public final String getAuthorPhoto()
    {
        return this.authorPhoto;
    }

    public final long getId()
    {
        return this.id;
    }

    public final String getImageType()
    {
        return this.imageType;
    }

    public final int getLikesCount()
    {
        return this.likesCount;
    }

    public final String getSport()
    {
        return this.sport;
    }

    public final String getText()
    {
        return this.text;
    }

    public final long getTimestamp()
    {
        return this.timestamp;
    }

    public int hashCode()
    {
        int v2_9;
        int v0_5 = (((((((((((Long.hashCode(this.id) * 31) + this.authorId.hashCode()) * 31) + this.authorName.hashCode()) * 31) + this.authorPhoto.hashCode()) * 31) + this.sport.hashCode()) * 31) + this.text.hashCode()) * 31);
        if (this.imageType != null) {
            v2_9 = this.imageType.hashCode();
        } else {
            v2_9 = 0;
        }
        return (((((((v0_5 + v2_9) * 31) + Integer.hashCode(this.likesCount)) * 31) + Boolean.hashCode(this.isLikedByMe)) * 31) + Long.hashCode(this.timestamp));
    }

    public final boolean isLikedByMe()
    {
        return this.isLikedByMe;
    }

    public String toString()
    {
        return new StringBuilder().append("MuralPostEntity(id=").append(this.id).append(", authorId=").append(this.authorId).append(", authorName=").append(this.authorName).append(", authorPhoto=").append(this.authorPhoto).append(", sport=").append(this.sport).append(", text=").append(this.text).append(", imageType=").append(this.imageType).append(", likesCount=").append(this.likesCount).append(", isLikedByMe=").append(this.isLikedByMe).append(", timestamp=").append(this.timestamp).append(")").toString();
    }
}
