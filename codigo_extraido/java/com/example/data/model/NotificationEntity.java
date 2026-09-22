package com.example.data.model;
public final class NotificationEntity {
    public static final int $stable;
    private final long id;
    private final boolean isRead;
    private final String message;
    private final long timestamp;
    private final String title;
    private final String type;

    static NotificationEntity()
    {
        return;
    }

    public NotificationEntity(long p2, String p4, String p5, String p6, long p7, boolean p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "message");
        this.id = p2;
        this.type = p4;
        this.title = p5;
        this.message = p6;
        this.timestamp = p7;
        this.isRead = p9;
        return;
    }

    public synthetic NotificationEntity(long p10, String p12, String p13, String p14, long p15, boolean p17, int p18, kotlin.jvm.internal.DefaultConstructorMarker p19)
    {
        long v1;
        if ((p18 & 1) == 0) {
            v1 = p10;
        } else {
            v1 = 0;
        }
        long v6;
        if ((p18 & 16) == 0) {
            v6 = p15;
        } else {
            v6 = System.currentTimeMillis();
        }
        boolean v8;
        if ((p18 & 32) == 0) {
            v8 = p17;
        } else {
            v8 = 0;
        }
        this(v1, p12, p13, p14, v6, v8);
        return;
    }

    public static synthetic com.example.data.model.NotificationEntity copy$default(com.example.data.model.NotificationEntity p9, long p10, String p12, String p13, String p14, long p15, boolean p17, int p18, Object p19)
    {
        if ((p18 & 1) != 0) {
            p10 = p9.id;
        }
        if ((p18 & 2) != 0) {
            p12 = p9.type;
        }
        if ((p18 & 4) != 0) {
            p13 = p9.title;
        }
        if ((p18 & 8) != 0) {
            p14 = p9.message;
        }
        long v6;
        if ((p18 & 16) == 0) {
            v6 = p15;
        } else {
            v6 = p9.timestamp;
        }
        boolean v8;
        if ((p18 & 32) == 0) {
            v8 = p17;
        } else {
            v8 = p9.isRead;
        }
        return p9.copy(p10, p12, p13, p14, v6, v8);
    }

    public final long component1()
    {
        return this.id;
    }

    public final String component2()
    {
        return this.type;
    }

    public final String component3()
    {
        return this.title;
    }

    public final String component4()
    {
        return this.message;
    }

    public final long component5()
    {
        return this.timestamp;
    }

    public final boolean component6()
    {
        return this.isRead;
    }

    public final com.example.data.model.NotificationEntity copy(long p11, String p13, String p14, String p15, long p16, boolean p18)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "message");
        return new com.example.data.model.NotificationEntity(p11, p13, p14, p15, p16, p18);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.example.data.model.NotificationEntity)) {
                if (this.id == ((com.example.data.model.NotificationEntity) p8).id) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.type, ((com.example.data.model.NotificationEntity) p8).type)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.title, ((com.example.data.model.NotificationEntity) p8).title)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.example.data.model.NotificationEntity) p8).message)) {
                                if (this.timestamp == ((com.example.data.model.NotificationEntity) p8).timestamp) {
                                    if (this.isRead == ((com.example.data.model.NotificationEntity) p8).isRead) {
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
            return 1;
        }
    }

    public final long getId()
    {
        return this.id;
    }

    public final String getMessage()
    {
        return this.message;
    }

    public final long getTimestamp()
    {
        return this.timestamp;
    }

    public final String getTitle()
    {
        return this.title;
    }

    public final String getType()
    {
        return this.type;
    }

    public int hashCode()
    {
        return ((((((((((Long.hashCode(this.id) * 31) + this.type.hashCode()) * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Boolean.hashCode(this.isRead));
    }

    public final boolean isRead()
    {
        return this.isRead;
    }

    public String toString()
    {
        return new StringBuilder().append("NotificationEntity(id=").append(this.id).append(", type=").append(this.type).append(", title=").append(this.title).append(", message=").append(this.message).append(", timestamp=").append(this.timestamp).append(", isRead=").append(this.isRead).append(")").toString();
    }
}
