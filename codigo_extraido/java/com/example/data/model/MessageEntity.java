package com.example.data.model;
public final class MessageEntity {
    public static final int $stable;
    private final long id;
    private final boolean isRead;
    private final String receiverId;
    private final String receiverName;
    private final String senderId;
    private final String senderName;
    private final String text;
    private final long timestamp;

    static MessageEntity()
    {
        return;
    }

    public MessageEntity(long p2, String p4, String p5, String p6, String p7, String p8, long p9, boolean p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "senderId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "senderName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "receiverId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "receiverName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "text");
        this.id = p2;
        this.senderId = p4;
        this.senderName = p5;
        this.receiverId = p6;
        this.receiverName = p7;
        this.text = p8;
        this.timestamp = p9;
        this.isRead = p11;
        return;
    }

    public synthetic MessageEntity(long p15, String p17, String p18, String p19, String p20, String p21, long p22, boolean p24, int p25, kotlin.jvm.internal.DefaultConstructorMarker p26)
    {
        long v4;
        if ((p25 & 1) == 0) {
            v4 = p15;
        } else {
            v4 = 0;
        }
        long v11;
        if ((p25 & 64) == 0) {
            v11 = p22;
        } else {
            v11 = System.currentTimeMillis();
        }
        boolean v13;
        if ((p25 & 128) == 0) {
            v13 = p24;
        } else {
            v13 = 0;
        }
        this(v4, p17, p18, p19, p20, p21, v11, v13);
        return;
    }

    public static synthetic com.example.data.model.MessageEntity copy$default(com.example.data.model.MessageEntity p11, long p12, String p14, String p15, String p16, String p17, String p18, long p19, boolean p21, int p22, Object p23)
    {
        if ((p22 & 1) != 0) {
            p12 = p11.id;
        }
        if ((p22 & 2) != 0) {
            p14 = p11.senderId;
        }
        if ((p22 & 4) != 0) {
            p15 = p11.senderName;
        }
        String v5;
        if ((p22 & 8) == 0) {
            v5 = p16;
        } else {
            v5 = p11.receiverId;
        }
        String v6;
        if ((p22 & 16) == 0) {
            v6 = p17;
        } else {
            v6 = p11.receiverName;
        }
        String v7;
        if ((p22 & 32) == 0) {
            v7 = p18;
        } else {
            v7 = p11.text;
        }
        long v8;
        if ((p22 & 64) == 0) {
            v8 = p19;
        } else {
            v8 = p11.timestamp;
        }
        boolean v10;
        if ((p22 & 128) == 0) {
            v10 = p21;
        } else {
            v10 = p11.isRead;
        }
        return p11.copy(p12, p14, p15, v5, v6, v7, v8, v10);
    }

    public final long component1()
    {
        return this.id;
    }

    public final String component2()
    {
        return this.senderId;
    }

    public final String component3()
    {
        return this.senderName;
    }

    public final String component4()
    {
        return this.receiverId;
    }

    public final String component5()
    {
        return this.receiverName;
    }

    public final String component6()
    {
        return this.text;
    }

    public final long component7()
    {
        return this.timestamp;
    }

    public final boolean component8()
    {
        return this.isRead;
    }

    public final com.example.data.model.MessageEntity copy(long p13, String p15, String p16, String p17, String p18, String p19, long p20, boolean p22)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "senderId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "senderName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "receiverId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "receiverName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "text");
        return new com.example.data.model.MessageEntity(p13, p15, p16, p17, p18, p19, p20, p22);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.example.data.model.MessageEntity)) {
                if (this.id == ((com.example.data.model.MessageEntity) p8).id) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.senderId, ((com.example.data.model.MessageEntity) p8).senderId)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.senderName, ((com.example.data.model.MessageEntity) p8).senderName)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.receiverId, ((com.example.data.model.MessageEntity) p8).receiverId)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.receiverName, ((com.example.data.model.MessageEntity) p8).receiverName)) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.text, ((com.example.data.model.MessageEntity) p8).text)) {
                                        if (this.timestamp == ((com.example.data.model.MessageEntity) p8).timestamp) {
                                            if (this.isRead == ((com.example.data.model.MessageEntity) p8).isRead) {
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
            return 1;
        }
    }

    public final long getId()
    {
        return this.id;
    }

    public final String getReceiverId()
    {
        return this.receiverId;
    }

    public final String getReceiverName()
    {
        return this.receiverName;
    }

    public final String getSenderId()
    {
        return this.senderId;
    }

    public final String getSenderName()
    {
        return this.senderName;
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
        return ((((((((((((((Long.hashCode(this.id) * 31) + this.senderId.hashCode()) * 31) + this.senderName.hashCode()) * 31) + this.receiverId.hashCode()) * 31) + this.receiverName.hashCode()) * 31) + this.text.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Boolean.hashCode(this.isRead));
    }

    public final boolean isRead()
    {
        return this.isRead;
    }

    public String toString()
    {
        return new StringBuilder().append("MessageEntity(id=").append(this.id).append(", senderId=").append(this.senderId).append(", senderName=").append(this.senderName).append(", receiverId=").append(this.receiverId).append(", receiverName=").append(this.receiverName).append(", text=").append(this.text).append(", timestamp=").append(this.timestamp).append(", isRead=").append(this.isRead).append(")").toString();
    }
}
