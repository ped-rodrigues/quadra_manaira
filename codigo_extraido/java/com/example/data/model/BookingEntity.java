package com.example.data.model;
public final class BookingEntity {
    public static final int $stable;
    private final long createdAt;
    private final String date;
    private final String endTime;
    private final long id;
    private final String notes;
    private final String organizerId;
    private final String organizerName;
    private final String sport;
    private final String startTime;
    private final String status;

    static BookingEntity()
    {
        return;
    }

    public BookingEntity(long p2, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, long p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "startTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "endTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "sport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "organizerId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "organizerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "notes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "status");
        this.id = p2;
        this.date = p4;
        this.startTime = p5;
        this.endTime = p6;
        this.sport = p7;
        this.organizerId = p8;
        this.organizerName = p9;
        this.notes = p10;
        this.status = p11;
        this.createdAt = p12;
        return;
    }

    public synthetic BookingEntity(long p17, String p19, String p20, String p21, String p22, String p23, String p24, String p25, String p26, long p27, int p29, kotlin.jvm.internal.DefaultConstructorMarker p30)
    {
        long v4;
        if ((p29 & 1) == 0) {
            v4 = p17;
        } else {
            v4 = 0;
        }
        String v12;
        if ((p29 & 128) == 0) {
            v12 = p25;
        } else {
            v12 = "";
        }
        String v13;
        if ((p29 & 256) == 0) {
            v13 = p26;
        } else {
            v13 = "CONFIRMED";
        }
        long v14;
        if ((p29 & 512) == 0) {
            v14 = p27;
        } else {
            v14 = System.currentTimeMillis();
        }
        this(v4, p19, p20, p21, p22, p23, p24, v12, v13, v14);
        return;
    }

    public static synthetic com.example.data.model.BookingEntity copy$default(com.example.data.model.BookingEntity p13, long p14, String p16, String p17, String p18, String p19, String p20, String p21, String p22, String p23, long p24, int p26, Object p27)
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
            v3_1 = p13.date;
        }
        String v4_0;
        if ((p26 & 4) == 0) {
            v4_0 = p17;
        } else {
            v4_0 = p13.startTime;
        }
        String v5_1;
        if ((p26 & 8) == 0) {
            v5_1 = p18;
        } else {
            v5_1 = p13.endTime;
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
            v7_1 = p13.organizerId;
        }
        String v8_1;
        if ((p26 & 64) == 0) {
            v8_1 = p21;
        } else {
            v8_1 = p13.organizerName;
        }
        String v9_1;
        if ((p26 & 128) == 0) {
            v9_1 = p22;
        } else {
            v9_1 = p13.notes;
        }
        String v10_1;
        if ((p26 & 256) == 0) {
            v10_1 = p23;
        } else {
            v10_1 = p13.status;
        }
        long v25;
        if ((p26 & 512) == 0) {
            v25 = p24;
        } else {
            v25 = p13.createdAt;
        }
        return p13.copy(v1_1, v3_1, v4_0, v5_1, v6_1, v7_1, v8_1, v9_1, v10_1, v25);
    }

    public final long component1()
    {
        return this.id;
    }

    public final long component10()
    {
        return this.createdAt;
    }

    public final String component2()
    {
        return this.date;
    }

    public final String component3()
    {
        return this.startTime;
    }

    public final String component4()
    {
        return this.endTime;
    }

    public final String component5()
    {
        return this.sport;
    }

    public final String component6()
    {
        return this.organizerId;
    }

    public final String component7()
    {
        return this.organizerName;
    }

    public final String component8()
    {
        return this.notes;
    }

    public final String component9()
    {
        return this.status;
    }

    public final com.example.data.model.BookingEntity copy(long p15, String p17, String p18, String p19, String p20, String p21, String p22, String p23, String p24, long p25)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "startTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "endTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p20, "sport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p21, "organizerId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p22, "organizerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p23, "notes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p24, "status");
        return new com.example.data.model.BookingEntity(p15, p17, p18, p19, p20, p21, p22, p23, p24, p25);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.example.data.model.BookingEntity)) {
                if (this.id == ((com.example.data.model.BookingEntity) p8).id) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.date, ((com.example.data.model.BookingEntity) p8).date)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.startTime, ((com.example.data.model.BookingEntity) p8).startTime)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.endTime, ((com.example.data.model.BookingEntity) p8).endTime)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.sport, ((com.example.data.model.BookingEntity) p8).sport)) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.organizerId, ((com.example.data.model.BookingEntity) p8).organizerId)) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.organizerName, ((com.example.data.model.BookingEntity) p8).organizerName)) {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.notes, ((com.example.data.model.BookingEntity) p8).notes)) {
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.status, ((com.example.data.model.BookingEntity) p8).status)) {
                                                    if (this.createdAt == ((com.example.data.model.BookingEntity) p8).createdAt) {
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

    public final long getCreatedAt()
    {
        return this.createdAt;
    }

    public final String getDate()
    {
        return this.date;
    }

    public final String getEndTime()
    {
        return this.endTime;
    }

    public final long getId()
    {
        return this.id;
    }

    public final String getNotes()
    {
        return this.notes;
    }

    public final String getOrganizerId()
    {
        return this.organizerId;
    }

    public final String getOrganizerName()
    {
        return this.organizerName;
    }

    public final String getSport()
    {
        return this.sport;
    }

    public final String getStartTime()
    {
        return this.startTime;
    }

    public final String getStatus()
    {
        return this.status;
    }

    public int hashCode()
    {
        return ((((((((((((((((((Long.hashCode(this.id) * 31) + this.date.hashCode()) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31) + this.sport.hashCode()) * 31) + this.organizerId.hashCode()) * 31) + this.organizerName.hashCode()) * 31) + this.notes.hashCode()) * 31) + this.status.hashCode()) * 31) + Long.hashCode(this.createdAt));
    }

    public String toString()
    {
        return new StringBuilder().append("BookingEntity(id=").append(this.id).append(", date=").append(this.date).append(", startTime=").append(this.startTime).append(", endTime=").append(this.endTime).append(", sport=").append(this.sport).append(", organizerId=").append(this.organizerId).append(", organizerName=").append(this.organizerName).append(", notes=").append(this.notes).append(", status=").append(this.status).append(", createdAt=").append(this.createdAt).append(")").toString();
    }
}
