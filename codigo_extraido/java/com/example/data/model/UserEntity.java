package com.example.data.model;
public final class UserEntity {
    public static final int $stable;
    private final String birthDate;
    private final long createdAt;
    private final String email;
    private final String id;
    private final boolean isCurrentUser;
    private final String name;
    private final String passwordHash;
    private final String photoUri;
    private final String sport;

    static UserEntity()
    {
        return;
    }

    public UserEntity(String p2, String p3, String p4, String p5, String p6, String p7, String p8, boolean p9, long p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "email");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "birthDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "sport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "photoUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "passwordHash");
        this.id = p2;
        this.name = p3;
        this.email = p4;
        this.birthDate = p5;
        this.sport = p6;
        this.photoUri = p7;
        this.passwordHash = p8;
        this.isCurrentUser = p9;
        this.createdAt = p10;
        return;
    }

    public synthetic UserEntity(String p14, String p15, String p16, String p17, String p18, String p19, String p20, boolean p21, long p22, int p24, kotlin.jvm.internal.DefaultConstructorMarker p25)
    {
        boolean v10;
        if ((p24 & 128) == 0) {
            v10 = p21;
        } else {
            v10 = 0;
        }
        long v11;
        if ((p24 & 256) == 0) {
            v11 = p22;
        } else {
            v11 = System.currentTimeMillis();
        }
        this(p14, p15, p16, p17, p18, p19, p20, v10, v11);
        return;
    }

    public static synthetic com.example.data.model.UserEntity copy$default(com.example.data.model.UserEntity p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, boolean p8, long p9, int p11, Object p12)
    {
        if ((p11 & 1) != 0) {
            p1 = p0.id;
        }
        if ((p11 & 2) != 0) {
            p2 = p0.name;
        }
        if ((p11 & 4) != 0) {
            p3 = p0.email;
        }
        if ((p11 & 8) != 0) {
            p4 = p0.birthDate;
        }
        if ((p11 & 16) != 0) {
            p5 = p0.sport;
        }
        if ((p11 & 32) != 0) {
            p6 = p0.photoUri;
        }
        if ((p11 & 64) != 0) {
            p7 = p0.passwordHash;
        }
        if ((p11 & 128) != 0) {
            p8 = p0.isCurrentUser;
        }
        if ((p11 & 256) != 0) {
            p9 = p0.createdAt;
        }
        return p0.copy(p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final String component1()
    {
        return this.id;
    }

    public final String component2()
    {
        return this.name;
    }

    public final String component3()
    {
        return this.email;
    }

    public final String component4()
    {
        return this.birthDate;
    }

    public final String component5()
    {
        return this.sport;
    }

    public final String component6()
    {
        return this.photoUri;
    }

    public final String component7()
    {
        return this.passwordHash;
    }

    public final boolean component8()
    {
        return this.isCurrentUser;
    }

    public final long component9()
    {
        return this.createdAt;
    }

    public final com.example.data.model.UserEntity copy(String p13, String p14, String p15, String p16, String p17, String p18, String p19, boolean p20, long p21)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "email");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "birthDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "sport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "photoUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "passwordHash");
        return new com.example.data.model.UserEntity(p13, p14, p15, p16, p17, p18, p19, p20, p21);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.example.data.model.UserEntity)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.example.data.model.UserEntity) p8).id)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.example.data.model.UserEntity) p8).name)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.email, ((com.example.data.model.UserEntity) p8).email)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.birthDate, ((com.example.data.model.UserEntity) p8).birthDate)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.sport, ((com.example.data.model.UserEntity) p8).sport)) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.photoUri, ((com.example.data.model.UserEntity) p8).photoUri)) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.passwordHash, ((com.example.data.model.UserEntity) p8).passwordHash)) {
                                            if (this.isCurrentUser == ((com.example.data.model.UserEntity) p8).isCurrentUser) {
                                                if (this.createdAt == ((com.example.data.model.UserEntity) p8).createdAt) {
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
            return 1;
        }
    }

    public final String getBirthDate()
    {
        return this.birthDate;
    }

    public final long getCreatedAt()
    {
        return this.createdAt;
    }

    public final String getEmail()
    {
        return this.email;
    }

    public final String getId()
    {
        return this.id;
    }

    public final String getName()
    {
        return this.name;
    }

    public final String getPasswordHash()
    {
        return this.passwordHash;
    }

    public final String getPhotoUri()
    {
        return this.photoUri;
    }

    public final String getSport()
    {
        return this.sport;
    }

    public int hashCode()
    {
        return ((((((((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.email.hashCode()) * 31) + this.birthDate.hashCode()) * 31) + this.sport.hashCode()) * 31) + this.photoUri.hashCode()) * 31) + this.passwordHash.hashCode()) * 31) + Boolean.hashCode(this.isCurrentUser)) * 31) + Long.hashCode(this.createdAt));
    }

    public final boolean isCurrentUser()
    {
        return this.isCurrentUser;
    }

    public String toString()
    {
        return new StringBuilder().append("UserEntity(id=").append(this.id).append(", name=").append(this.name).append(", email=").append(this.email).append(", birthDate=").append(this.birthDate).append(", sport=").append(this.sport).append(", photoUri=").append(this.photoUri).append(", passwordHash=").append(this.passwordHash).append(", isCurrentUser=").append(this.isCurrentUser).append(", createdAt=").append(this.createdAt).append(")").toString();
    }
}
