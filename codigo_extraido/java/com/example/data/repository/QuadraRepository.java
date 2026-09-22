package com.example.data.repository;
public final class QuadraRepository {
    public static final int $stable;
    private final kotlinx.coroutines.flow.MutableStateFlow _isOnline;
    private final kotlinx.coroutines.flow.MutableStateFlow _isSyncing;
    private final kotlinx.coroutines.flow.MutableStateFlow _lastSyncTime;
    private final kotlinx.coroutines.flow.Flow allBookings;
    private final kotlinx.coroutines.flow.Flow allNotifications;
    private final kotlinx.coroutines.flow.Flow allPosts;
    private final kotlinx.coroutines.flow.Flow allUsers;
    private final com.example.data.local.BookingDao bookingDao;
    private final android.content.Context context;
    private final kotlinx.coroutines.flow.Flow currentUserFlow;
    private final com.example.data.local.QuadraDatabase database;
    private final kotlinx.coroutines.flow.StateFlow isOnline;
    private final kotlinx.coroutines.flow.StateFlow isSyncing;
    private final kotlinx.coroutines.flow.StateFlow lastSyncTime;
    private final com.example.data.local.MessageDao messageDao;
    private final com.example.data.local.MuralDao muralDao;
    private final com.example.data.local.NotificationDao notificationDao;
    private final com.example.util.NotificationHelper notificationHelper;
    private final kotlinx.coroutines.flow.Flow unreadNotificationsCount;
    private final com.example.data.local.UserDao userDao;
    private final com.example.data.remote.WeatherService weatherService;

    static QuadraRepository()
    {
        com.example.data.repository.QuadraRepository.$stable = 8;
        return;
    }

    public QuadraRepository(android.content.Context p3, com.example.data.local.QuadraDatabase p4, com.example.util.NotificationHelper p5, com.example.data.remote.WeatherService p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "database");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "notificationHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "weatherService");
        this.context = p3;
        this.database = p4;
        this.notificationHelper = p5;
        this.weatherService = p6;
        this.userDao = this.database.userDao();
        this.bookingDao = this.database.bookingDao();
        this.muralDao = this.database.muralDao();
        this.messageDao = this.database.messageDao();
        this.notificationDao = this.database.notificationDao();
        this.allUsers = this.userDao.getAllUsers();
        this.currentUserFlow = this.userDao.getCurrentUserFlow();
        this.allBookings = this.bookingDao.getAllBookings();
        this.allPosts = this.muralDao.getAllPosts();
        this.allNotifications = this.notificationDao.getAllNotifications();
        this.unreadNotificationsCount = this.notificationDao.getUnreadCount();
        this._isOnline = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(Boolean.valueOf(1));
        this.isOnline = kotlinx.coroutines.flow.FlowKt.asStateFlow(this._isOnline);
        this._lastSyncTime = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(Long.valueOf(System.currentTimeMillis()));
        this.lastSyncTime = kotlinx.coroutines.flow.FlowKt.asStateFlow(this._lastSyncTime);
        this._isSyncing = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(Boolean.valueOf(0));
        this.isSyncing = kotlinx.coroutines.flow.FlowKt.asStateFlow(this._isSyncing);
        return;
    }

    public synthetic QuadraRepository(android.content.Context p1, com.example.data.local.QuadraDatabase p2, com.example.util.NotificationHelper p3, com.example.data.remote.WeatherService p4, int p5, kotlin.jvm.internal.DefaultConstructorMarker p6)
    {
        if ((p5 & 8) != 0) {
            p4 = new com.example.data.remote.WeatherService();
        }
        this(p1, p2, p3, p4);
        return;
    }

    public static final synthetic Object access$checkBirthdaysForToday(com.example.data.repository.QuadraRepository p1, kotlin.coroutines.Continuation p2)
    {
        return p1.checkBirthdaysForToday(p2);
    }

    private final Object checkBirthdaysForToday(kotlin.coroutines.Continuation p7)
    {
        IllegalStateException v0_2;
        if (!(p7 instanceof com.example.data.repository.QuadraRepository$checkBirthdaysForToday$1)) {
            v0_2 = new com.example.data.repository.QuadraRepository$checkBirthdaysForToday$1(this, p7);
        } else {
            v0_2 = ((com.example.data.repository.QuadraRepository$checkBirthdaysForToday$1) p7);
            if ((((com.example.data.repository.QuadraRepository$checkBirthdaysForToday$1) p7).label & -2147483648) == 0) {
            } else {
                ((com.example.data.repository.QuadraRepository$checkBirthdaysForToday$1) p7).label = (((com.example.data.repository.QuadraRepository$checkBirthdaysForToday$1) p7).label - -2147483648);
            }
        }
        String v1_2 = v0_2.result;
        String v2_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (v0_2.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(v1_2);
                kotlin.Unit v4_4 = this.userDao;
                v0_2.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(new java.text.SimpleDateFormat("dd/MM", java.util.Locale.getDefault()).format(new java.util.Date()));
                v0_2.label = 1;
                if (v4_4.getCurrentUser(v0_2) != v2_0) {
                } else {
                    return v2_0;
                }
            case 1:
                kotlin.ResultKt.throwOnFailure(v1_2);
                break;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        return kotlin.Unit.INSTANCE;
    }

    public final Object cancelBooking-0E7RQCE(long p10, com.example.data.model.BookingEntity p12, kotlin.coroutines.Continuation p13)
    {
        IllegalStateException v0_2;
        if (!(p13 instanceof com.example.data.repository.QuadraRepository$cancelBooking$1)) {
            v0_2 = new com.example.data.repository.QuadraRepository$cancelBooking$1(this, p13);
        } else {
            v0_2 = ((com.example.data.repository.QuadraRepository$cancelBooking$1) p13);
            if ((((com.example.data.repository.QuadraRepository$cancelBooking$1) p13).label & -2147483648) == 0) {
            } else {
                ((com.example.data.repository.QuadraRepository$cancelBooking$1) p13).label = (((com.example.data.repository.QuadraRepository$cancelBooking$1) p13).label - -2147483648);
            }
        }
        Object v3_1;
        String v1_2 = v0_2.result;
        com.example.data.model.UserEntity v2_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (v0_2.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(v1_2);
                Object v3_3 = this.bookingDao;
                v0_2.L$0 = p12;
                v0_2.J$0 = p10;
                v0_2.label = 1;
                if (v3_3.cancelBooking(p10, v0_2) != v2_0) {
                    Object v3_5 = this.userDao;
                    v0_2.L$0 = p12;
                    v0_2.J$0 = p10;
                    v0_2.label = 2;
                    v3_1 = v3_5.getCurrentUser(v0_2);
                    if (v3_1 != v2_0) {
                    } else {
                        return v2_0;
                    }
                } else {
                    return v2_0;
                }
            case 1:
                p10 = v0_2.J$0;
                p12 = ((com.example.data.model.BookingEntity) v0_2.L$0);
                kotlin.ResultKt.throwOnFailure(v1_2);
                break;
            case 2:
                p12 = ((com.example.data.model.BookingEntity) v0_2.L$0);
                kotlin.ResultKt.throwOnFailure(v1_2);
                v3_1 = v1_2;
                break;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        String v7_2;
        com.example.data.model.UserEntity v2_3 = ((com.example.data.model.UserEntity) v3_1);
        Object v3_6 = this.notificationHelper;
        String v5_1 = p12.getSport();
        String v6_5 = new StringBuilder().append(p12.getStartTime()).append(" (").append(p12.getDate()).append(")").toString();
        if (v2_3 == null) {
            v7_2 = p12.getOrganizerName();
        } else {
            v7_2 = v2_3.getName();
            if (v7_2 == null) {
            }
        }
        v3_6.notifyBookingChanged(1, v5_1, v6_5, v7_2);
        return kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE);
    }

    public final boolean checkNetworkStatus()
    {
        int v0_2;
        int v0_1 = this.context.getSystemService("connectivity");
        android.net.NetworkCapabilities v2 = 0;
        if (!(v0_1 instanceof android.net.ConnectivityManager)) {
            v0_2 = 0;
        } else {
            v0_2 = ((android.net.ConnectivityManager) v0_1);
        }
        int v1_1;
        if (v0_2 == 0) {
            v1_1 = 0;
        } else {
            v1_1 = v0_2.getActiveNetwork();
        }
        if (v0_2 != 0) {
            v2 = v0_2.getNetworkCapabilities(v1_1);
        }
        Boolean v3 = 0;
        if ((v2 != null) && (v2.hasCapability(12) == 1)) {
            v3 = 1;
        }
        this._isOnline.setValue(Boolean.valueOf(v3));
        return v3;
    }

    public final Object createBooking-hUnOzRk(String p22, String p23, String p24, String p25, String p26, kotlin.coroutines.Continuation p27)
    {
        String v2_1;
        if (!(p27 instanceof com.example.data.repository.QuadraRepository$createBooking$1)) {
            v2_1 = new com.example.data.repository.QuadraRepository$createBooking$1(this, p27);
        } else {
            v2_1 = ((com.example.data.repository.QuadraRepository$createBooking$1) p27);
            if ((((com.example.data.repository.QuadraRepository$createBooking$1) p27).label & -2147483648) == 0) {
            } else {
                ((com.example.data.repository.QuadraRepository$createBooking$1) p27).label = (((com.example.data.repository.QuadraRepository$createBooking$1) p27).label - -2147483648);
            }
        }
        Object v9_0;
        Object v7_0;
        String v11_9;
        String v10_2;
        String v10_0;
        String v5_6;
        Object v9_3;
        String v15_4;
        String v5_3;
        String v8_2;
        String v12;
        Object v3_2 = v2_1.result;
        com.example.data.model.BookingEntity v4_6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (v2_1.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(v3_2);
                String v5_7 = this.userDao;
                v2_1.L$0 = p22;
                v2_1.L$1 = p23;
                v2_1.L$2 = p24;
                v2_1.L$3 = p25;
                v2_1.L$4 = p26;
                v2_1.label = 1;
                v5_6 = v5_7.getCurrentUser(v2_1);
                if (v5_6 != v4_6) {
                    v11_9 = p24;
                    v12 = p25;
                    v15_4 = p26;
                    v9_3 = p22;
                    v10_2 = p23;
                    v5_3 = ((com.example.data.model.UserEntity) v5_6);
                    if (v5_3 != null) {
                        String v13_1 = v5_3.getId();
                        String v14 = v5_3.getName();
                        String v6_5 = new com.example.data.model.BookingEntity(0, v9_3, v10_2, v11_9, v12, v13_1, v14, v15_4, 0, 0, 769, 0);
                        Object v7_9 = this.bookingDao;
                        v2_1.L$0 = v9_3;
                        v2_1.L$1 = v10_2;
                        v2_1.L$2 = v11_9;
                        v2_1.L$3 = v12;
                        v2_1.L$4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v15_4);
                        v2_1.L$5 = v5_3;
                        v2_1.L$6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v6_5);
                        v2_1.label = 2;
                        v7_0 = v7_9.insertBooking(v6_5, v2_1);
                        if (v7_0 != v4_6) {
                            v10_0 = v9_3;
                            v9_0 = v10_2;
                            v8_2 = v11_9;
                        } else {
                            return v4_6;
                        }
                    } else {
                        return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(((Throwable) new Exception("Usu\u00e1rio n\u00e3o identificado"))));
                    }
                } else {
                    return v4_6;
                }
            case 1:
                String v5_5 = ((String) v2_1.L$4);
                String v6_2 = ((String) v2_1.L$3);
                Object v7_6 = ((String) v2_1.L$2);
                String v8_5 = ((String) v2_1.L$1);
                v9_3 = ((String) v2_1.L$0);
                kotlin.ResultKt.throwOnFailure(v3_2);
                v15_4 = v5_5;
                v12 = v6_2;
                v11_9 = v7_6;
                v10_2 = v8_5;
                v5_6 = v3_2;
                break;
            case 2:
                v5_3 = ((com.example.data.model.UserEntity) v2_1.L$5);
                Object v7_4 = ((String) v2_1.L$3);
                v8_2 = ((String) v2_1.L$2);
                v9_0 = ((String) v2_1.L$1);
                v10_0 = ((String) v2_1.L$0);
                kotlin.ResultKt.throwOnFailure(v3_2);
                v12 = v7_4;
                v7_0 = v3_2;
                break;
            default:
                Object v7 = p23;
                Object v9 = p25;
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        String v13_0 = ((Number) v7_0).longValue();
        this.notificationHelper.notifyBookingChanged(0, v12, new StringBuilder().append(v9_0).append(" \u00e0s ").append(v8_2).append(" (").append(v10_0).append(")").toString(), v5_3.getName());
        this.notificationHelper.notify24HourReminder(v12, v10_0, v9_0);
        return kotlin.Result.constructor-impl(kotlin.coroutines.jvm.internal.Boxing.boxLong(v13_0));
    }

    public final Object createPost-BWLJW6A(String p22, String p23, String p24, kotlin.coroutines.Continuation p25)
    {
        IllegalStateException v2_1;
        if (!(p25 instanceof com.example.data.repository.QuadraRepository$createPost$1)) {
            v2_1 = new com.example.data.repository.QuadraRepository$createPost$1(this, p25);
        } else {
            v2_1 = ((com.example.data.repository.QuadraRepository$createPost$1) p25);
            if ((((com.example.data.repository.QuadraRepository$createPost$1) p25).label & -2147483648) == 0) {
            } else {
                ((com.example.data.repository.QuadraRepository$createPost$1) p25).label = (((com.example.data.repository.QuadraRepository$createPost$1) p25).label - -2147483648);
            }
        }
        String v14;
        String v5_5;
        String v13;
        String v12;
        String v3_3 = v2_1.result;
        com.example.data.model.MuralPostEntity v4_5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (v2_1.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(v3_3);
                String v5_6 = this.userDao;
                v2_1.L$0 = p22;
                v2_1.L$1 = p23;
                v2_1.L$2 = p24;
                v2_1.label = 1;
                v5_5 = v5_6.getCurrentUser(v2_1);
                if (v5_5 != v4_5) {
                    v13 = p22;
                    v12 = p23;
                    v14 = p24;
                    String v5_7 = ((com.example.data.model.UserEntity) v5_5);
                    if (v5_7 != null) {
                        String v9_3 = v5_7.getId();
                        String v10 = v5_7.getName();
                        String v11 = v5_7.getPhotoUri();
                        String v6_5 = new com.example.data.model.MuralPostEntity(0, v9_3, v10, v11, v12, v13, v14, 0, 0, 0, 897, 0);
                        String v7_5 = this.muralDao;
                        v2_1.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v13);
                        v2_1.L$1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v12);
                        v2_1.L$2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v14);
                        v2_1.L$3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v5_7);
                        v2_1.L$4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v6_5);
                        v2_1.label = 2;
                        if (v7_5.insertPost(v6_5, v2_1) != v4_5) {
                            String v7 = v12;
                            String v6 = v14;
                        } else {
                            return v4_5;
                        }
                    } else {
                        return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(((Throwable) new Exception("Fa\u00e7a login para postar"))));
                    }
                } else {
                    return v4_5;
                }
            case 1:
                String v5_4 = ((String) v2_1.L$2);
                String v6_2 = ((String) v2_1.L$1);
                String v7_2 = ((String) v2_1.L$0);
                kotlin.ResultKt.throwOnFailure(v3_3);
                v14 = v5_4;
                v12 = v6_2;
                v13 = v7_2;
                v5_5 = v3_3;
                break;
            case 2:
                String v5 = ((com.example.data.model.UserEntity) v2_1.L$3);
                v7 = ((String) v2_1.L$1);
                kotlin.ResultKt.throwOnFailure(v3_3);
                break;
            default:
                v7 = p23;
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        return kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE);
    }

    public final Object fetchWeather(kotlin.coroutines.Continuation p2)
    {
        return this.weatherService.getCourtWeather(p2);
    }

    public final kotlinx.coroutines.flow.Flow getAllBookings()
    {
        return this.allBookings;
    }

    public final kotlinx.coroutines.flow.Flow getAllNotifications()
    {
        return this.allNotifications;
    }

    public final kotlinx.coroutines.flow.Flow getAllPosts()
    {
        return this.allPosts;
    }

    public final kotlinx.coroutines.flow.Flow getAllUsers()
    {
        return this.allUsers;
    }

    public final kotlinx.coroutines.flow.Flow getConversation(String p2, String p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "otherUserId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "currentUserId");
        return this.messageDao.getConversation(p3, p2);
    }

    public final Object getCurrentUser(kotlin.coroutines.Continuation p2)
    {
        return this.userDao.getCurrentUser(p2);
    }

    public final kotlinx.coroutines.flow.Flow getCurrentUserFlow()
    {
        return this.currentUserFlow;
    }

    public final kotlinx.coroutines.flow.StateFlow getLastSyncTime()
    {
        return this.lastSyncTime;
    }

    public final kotlinx.coroutines.flow.Flow getUnreadNotificationsCount()
    {
        return this.unreadNotificationsCount;
    }

    public final kotlinx.coroutines.flow.StateFlow isOnline()
    {
        return this.isOnline;
    }

    public final kotlinx.coroutines.flow.StateFlow isSyncing()
    {
        return this.isSyncing;
    }

    public final Object login-0E7RQCE(String p9, String p10, kotlin.coroutines.Continuation p11)
    {
        IllegalStateException v0_4;
        if (!(p11 instanceof com.example.data.repository.QuadraRepository$login$1)) {
            v0_4 = new com.example.data.repository.QuadraRepository$login$1(this, p11);
        } else {
            v0_4 = ((com.example.data.repository.QuadraRepository$login$1) p11);
            if ((((com.example.data.repository.QuadraRepository$login$1) p11).label & -2147483648) == 0) {
            } else {
                ((com.example.data.repository.QuadraRepository$login$1) p11).label = (((com.example.data.repository.QuadraRepository$login$1) p11).label - -2147483648);
            }
        }
        Object v3_1;
        Object v5_3;
        Object v2_12;
        String v4_5;
        Object v5_0;
        Object v3_9;
        Object v5_1;
        Object v3_5;
        String v1_2 = v0_4.result;
        Object v2_5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        String v4_1 = 1;
        switch (v0_4.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(v1_2);
                Object v3_10 = this.userDao;
                Object v5_15 = kotlin.text.StringsKt.trim(((CharSequence) p9)).toString();
                v0_4.L$0 = p9;
                v0_4.L$1 = p10;
                v0_4.label = 1;
                v3_9 = v3_10.getUserByEmail(v5_15, v0_4);
                if (v3_9 != v2_5) {
                    v3_5 = ((com.example.data.model.UserEntity) v3_9);
                    if (v3_5 == null) {
                        this.userDao.getAllUsers();
                        v3_5 = 0;
                    }
                    Object v5_16 = this.userDao;
                    int v6_17 = kotlin.text.StringsKt.trim(((CharSequence) p9)).toString();
                    v0_4.L$0 = p9;
                    v0_4.L$1 = p10;
                    v0_4.L$2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v3_5);
                    v0_4.label = 2;
                    v5_0 = v5_16.getUserByEmail(v6_17, v0_4);
                    if (v5_0 != v2_5) {
                        v5_1 = ((com.example.data.model.UserEntity) v5_0);
                        if (v5_1 != null) {
                            if (v5_1 == null) {
                                return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(((Throwable) new Exception("Usu\u00e1rio n\u00e3o encontrado. Cadastre-se abaixo!"))));
                            } else {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(v5_1.getPasswordHash(), p10)) {
                                    if (((CharSequence) p10).length() != 0) {
                                        v4_1 = 0;
                                    }
                                    if (v4_1 == null) {
                                        return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(((Throwable) new Exception("Senha incorreta"))));
                                    }
                                }
                                String v4_3 = this.userDao;
                                v0_4.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(p9);
                                v0_4.L$1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(p10);
                                v0_4.L$2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v3_5);
                                v0_4.L$3 = v5_1;
                                v0_4.label = 4;
                                if (v4_3.clearCurrentUser(v0_4) != v2_5) {
                                    v4_5 = v3_5;
                                    v3_1 = v5_1;
                                    Object v5_4 = this.userDao;
                                    int v6_13 = v3_1.getId();
                                    v0_4.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(p9);
                                    v0_4.L$1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(p10);
                                    v0_4.L$2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v4_5);
                                    v0_4.L$3 = v3_1;
                                    v0_4.label = 5;
                                    if (v5_4.setCurrentUser(v6_13, v0_4) != v2_5) {
                                        v2_12 = v3_1;
                                    } else {
                                        return v2_5;
                                    }
                                } else {
                                    return v2_5;
                                }
                            }
                        } else {
                            Object v5_2 = this.userDao;
                            int v6_3 = kotlin.text.StringsKt.trim(((CharSequence) p9)).toString();
                            v0_4.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(p9);
                            v0_4.L$1 = p10;
                            v0_4.L$2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v3_5);
                            v0_4.label = 3;
                            v5_3 = v5_2.getUserById(v6_3, v0_4);
                            if (v5_3 != v2_5) {
                                v5_1 = ((com.example.data.model.UserEntity) v5_3);
                            } else {
                                return v2_5;
                            }
                        }
                    } else {
                        return v2_5;
                    }
                } else {
                    return v2_5;
                }
            case 1:
                p10 = ((String) v0_4.L$1);
                p9 = ((String) v0_4.L$0);
                kotlin.ResultKt.throwOnFailure(v1_2);
                v3_9 = v1_2;
                break;
            case 2:
                v3_5 = ((com.example.data.model.UserEntity) v0_4.L$2);
                p10 = ((String) v0_4.L$1);
                p9 = ((String) v0_4.L$0);
                kotlin.ResultKt.throwOnFailure(v1_2);
                v5_0 = v1_2;
                break;
            case 3:
                v3_5 = ((com.example.data.model.UserEntity) v0_4.L$2);
                p10 = ((String) v0_4.L$1);
                p9 = ((String) v0_4.L$0);
                kotlin.ResultKt.throwOnFailure(v1_2);
                v5_3 = v1_2;
                break;
            case 4:
                v3_1 = ((com.example.data.model.UserEntity) v0_4.L$3);
                v4_5 = ((com.example.data.model.UserEntity) v0_4.L$2);
                p10 = ((String) v0_4.L$1);
                p9 = ((String) v0_4.L$0);
                kotlin.ResultKt.throwOnFailure(v1_2);
                break;
            case 5:
                v2_12 = ((com.example.data.model.UserEntity) v0_4.L$3);
                p9 = ((String) v0_4.L$0);
                kotlin.ResultKt.throwOnFailure(v1_2);
                break;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        return kotlin.Result.constructor-impl(v2_12);
    }

    public final Object loginWithSocial(String p22, kotlin.coroutines.Continuation p23)
    {
        IllegalStateException v2_1;
        if (!(p23 instanceof com.example.data.repository.QuadraRepository$loginWithSocial$1)) {
            v2_1 = new com.example.data.repository.QuadraRepository$loginWithSocial$1(this, p23);
        } else {
            v2_1 = ((com.example.data.repository.QuadraRepository$loginWithSocial$1) p23);
            if ((((com.example.data.repository.QuadraRepository$loginWithSocial$1) p23).label & -2147483648) == 0) {
            } else {
                ((com.example.data.repository.QuadraRepository$loginWithSocial$1) p23).label = (((com.example.data.repository.QuadraRepository$loginWithSocial$1) p23).label - -2147483648);
            }
        }
        String v6_1;
        String v4_0;
        String v5_3;
        String v3_3 = v2_1.result;
        String v4_1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (v2_1.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(v3_3);
                String v5_4 = this.userDao;
                v2_1.L$0 = p22;
                v2_1.label = 1;
                if (v5_4.clearCurrentUser(v2_1) != v4_1) {
                    v5_3 = p22;
                    String v6_11;
                    String v6_5 = v5_3.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v6_5, "toLowerCase(...)");
                    String v9_3 = new StringBuilder().append("user_").append(v6_5).append("_").append((System.currentTimeMillis() % 10000)).toString();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(v5_3, "Google")) {
                        v6_11 = "Atleta Instagram";
                    } else {
                        v6_11 = "Atleta Google";
                    }
                    String v10_6 = v6_11;
                    String v6_13 = v5_3.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v6_13, "toLowerCase(...)");
                    String v11_1 = new StringBuilder().append(v6_13).append("@usuario.com").toString();
                    String v8_9 = new com.example.data.model.UserEntity(v9_3, v10_6, v11_1, "10/05/1996", "V\u00f4lei de Praia", "avatar_2", "social", 1, 0, 256, 0);
                    String v6_16 = this.userDao;
                    v2_1.L$0 = v5_3;
                    v2_1.L$1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v9_3);
                    v2_1.L$2 = v8_9;
                    v2_1.label = 2;
                    if (v6_16.insertUser(v8_9, v2_1) != v4_1) {
                        v6_1 = v5_3;
                        v4_0 = v8_9;
                    } else {
                        return v4_1;
                    }
                } else {
                    return v4_1;
                }
            case 1:
                v5_3 = ((String) v2_1.L$0);
                kotlin.ResultKt.throwOnFailure(v3_3);
                break;
            case 2:
                v4_0 = ((com.example.data.model.UserEntity) v2_1.L$2);
                v6_1 = ((String) v2_1.L$0);
                kotlin.ResultKt.throwOnFailure(v3_3);
                break;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        this.notificationHelper.dispatchNotification("SYSTEM", "Bem-vindo(a) \u00e0 Quadra de Mana\u00edra!", new StringBuilder().append("Login r\u00e1pido com ").append(v6_1).append(" realizado com sucesso.").toString());
        return v4_0;
    }

    public final Object logout(kotlin.coroutines.Continuation p3)
    {
        kotlin.Unit v0_1 = this.userDao.clearCurrentUser(p3);
        if (v0_1 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v0_1;
        }
    }

    public final Object markAllNotificationsAsRead(kotlin.coroutines.Continuation p3)
    {
        kotlin.Unit v0_1 = this.notificationDao.markAllAsRead(p3);
        if (v0_1 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v0_1;
        }
    }

    public final Object markNotificationAsRead(long p3, kotlin.coroutines.Continuation p5)
    {
        kotlin.Unit v0_1 = this.notificationDao.markAsRead(p3, p5);
        if (v0_1 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v0_1;
        }
    }

    public final Object registerUser-hUnOzRk(String p21, String p22, String p23, String p24, String p25, kotlin.coroutines.Continuation p26)
    {
        IllegalStateException v3_1;
        String v1_0 = p21;
        if (!(p26 instanceof com.example.data.repository.QuadraRepository$registerUser$1)) {
            v3_1 = new com.example.data.repository.QuadraRepository$registerUser$1(this, p26);
        } else {
            v3_1 = ((com.example.data.repository.QuadraRepository$registerUser$1) p26);
            if ((((com.example.data.repository.QuadraRepository$registerUser$1) p26).label & -2147483648) == 0) {
            } else {
                ((com.example.data.repository.QuadraRepository$registerUser$1) p26).label = (((com.example.data.repository.QuadraRepository$registerUser$1) p26).label - -2147483648);
            }
        }
        com.example.data.model.UserEntity v6_13;
        String v11_2;
        String v9_3;
        String v10_2;
        String v8_13;
        String v7_7;
        boolean v5_2;
        String v4_2 = v3_1.result;
        boolean v5_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (v3_1.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(v4_2);
                if ((!kotlin.text.StringsKt.isBlank(((CharSequence) p21))) && ((!kotlin.text.StringsKt.isBlank(((CharSequence) p22))) && ((!kotlin.text.StringsKt.isBlank(((CharSequence) p23))) && ((!kotlin.text.StringsKt.isBlank(((CharSequence) p24))) && (!kotlin.text.StringsKt.isBlank(((CharSequence) p25))))))) {
                    String v7_11 = p21.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_11, "toLowerCase(...)");
                    String v10_1 = new StringBuilder().append(kotlin.text.StringsKt.replace$default(v7_11, " ", "", 0, 4, 0)).append("@quadramanaira.com").toString();
                    com.example.data.model.UserEntity v6_4 = java.util.UUID.randomUUID().toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v6_4, "toString(...)");
                    String v8_6 = new StringBuilder().append("usr_").append(kotlin.text.StringsKt.take(v6_4, 8)).toString();
                    String v9_2 = kotlin.text.StringsKt.trim(((CharSequence) p21)).toString();
                    String v11_1 = kotlin.text.StringsKt.trim(((CharSequence) p22)).toString();
                    v6_13 = new com.example.data.model.UserEntity(v8_6, v9_2, v10_1, v11_1, p23, p24, p25, 1, 0, 256, 0);
                    String v7_5 = this.userDao;
                    v3_1.L$0 = p21;
                    v3_1.L$1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(p22);
                    v3_1.L$2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(p23);
                    v3_1.L$3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(p24);
                    v3_1.L$4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(p25);
                    v3_1.L$5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v10_1);
                    v3_1.L$6 = v6_13;
                    v3_1.label = 1;
                    if (v7_5.clearCurrentUser(v3_1) != v5_0) {
                        v11_2 = p22;
                        v9_3 = p24;
                        v8_13 = p25;
                        v7_7 = v10_1;
                        v10_2 = p23;
                        String v12_2 = this.userDao;
                        v3_1.L$0 = v1_0;
                        v3_1.L$1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v11_2);
                        v3_1.L$2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v10_2);
                        v3_1.L$3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v9_3);
                        v3_1.L$4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v8_13);
                        v3_1.L$5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v7_7);
                        v3_1.L$6 = v6_13;
                        v3_1.label = 2;
                        if (v12_2.insertUser(v6_13, v3_1) != v5_0) {
                            this.notificationHelper.dispatchNotification("SYSTEM", "Cadastro Realizado!", new StringBuilder().append("Ol\u00e1 ").append(v1_0).append(", seu perfil foi criado com sucesso. Bem-vindo(a) \u00e0 Quadra de Mana\u00edra!").toString());
                            v3_1.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v1_0);
                            v3_1.L$1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v11_2);
                            v3_1.L$2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v10_2);
                            v3_1.L$3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v9_3);
                            v3_1.L$4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v8_13);
                            v3_1.L$5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v7_7);
                            v3_1.L$6 = v6_13;
                            v3_1.label = 3;
                            if (this.checkBirthdaysForToday(v3_1) != v5_0) {
                                v5_2 = v6_13;
                                String v7 = v8_13;
                                String v9 = v10_2;
                            } else {
                                return v5_0;
                            }
                        } else {
                            return v5_0;
                        }
                    } else {
                        return v5_0;
                    }
                } else {
                    return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(((Throwable) new Exception("Todos os campos do cadastro s\u00e3o obrigat\u00f3rios!"))));
                }
            case 1:
                v6_13 = ((com.example.data.model.UserEntity) v3_1.L$6);
                v7_7 = ((String) v3_1.L$5);
                v8_13 = ((String) v3_1.L$4);
                v9_3 = ((String) v3_1.L$3);
                v10_2 = ((String) v3_1.L$2);
                v11_2 = ((String) v3_1.L$1);
                v1_0 = ((String) v3_1.L$0);
                kotlin.ResultKt.throwOnFailure(v4_2);
                break;
            case 2:
                v6_13 = ((com.example.data.model.UserEntity) v3_1.L$6);
                v7_7 = ((String) v3_1.L$5);
                v8_13 = ((String) v3_1.L$4);
                v9_3 = ((String) v3_1.L$3);
                v10_2 = ((String) v3_1.L$2);
                v11_2 = ((String) v3_1.L$1);
                v1_0 = ((String) v3_1.L$0);
                kotlin.ResultKt.throwOnFailure(v4_2);
                break;
            case 3:
                v5_2 = ((com.example.data.model.UserEntity) v3_1.L$6);
                v7 = ((String) v3_1.L$4);
                v9 = ((String) v3_1.L$2);
                kotlin.ResultKt.throwOnFailure(v4_2);
                break;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        return kotlin.Result.constructor-impl(v5_2);
    }

    public final Object sendMessage-BWLJW6A(String p20, String p21, String p22, kotlin.coroutines.Continuation p23)
    {
        IllegalStateException v2_1;
        if (!(p23 instanceof com.example.data.repository.QuadraRepository$sendMessage$1)) {
            v2_1 = new com.example.data.repository.QuadraRepository$sendMessage$1(this, p23);
        } else {
            v2_1 = ((com.example.data.repository.QuadraRepository$sendMessage$1) p23);
            if ((((com.example.data.repository.QuadraRepository$sendMessage$1) p23).label & -2147483648) == 0) {
            } else {
                ((com.example.data.repository.QuadraRepository$sendMessage$1) p23).label = (((com.example.data.repository.QuadraRepository$sendMessage$1) p23).label - -2147483648);
            }
        }
        String v5_3;
        String v12;
        String v11_1;
        String v6_1;
        Object v7_4;
        String v5_6;
        String v13_2;
        String v3_3 = v2_1.result;
        com.example.data.model.MessageEntity v4_5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (v2_1.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(v3_3);
                String v5_7 = this.userDao;
                v2_1.L$0 = p20;
                v2_1.L$1 = p21;
                v2_1.L$2 = p22;
                v2_1.label = 1;
                v5_6 = v5_7.getCurrentUser(v2_1);
                if (v5_6 != v4_5) {
                    v11_1 = p20;
                    v12 = p21;
                    v13_2 = p22;
                    v5_3 = ((com.example.data.model.UserEntity) v5_6);
                    if (v5_3 != null) {
                        String v9_1 = v5_3.getId();
                        String v10 = v5_3.getName();
                        String v6_6 = new com.example.data.model.MessageEntity(0, v9_1, v10, v11_1, v12, v13_2, 0, 0, 193, 0);
                        Object v7_9 = this.messageDao;
                        v2_1.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v11_1);
                        v2_1.L$1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v12);
                        v2_1.L$2 = v13_2;
                        v2_1.L$3 = v5_3;
                        v2_1.L$4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v6_6);
                        v2_1.label = 2;
                        v7_4 = v7_9.insertMessage(v6_6, v2_1);
                        if (v7_4 != v4_5) {
                            String v8 = v11_1;
                            v6_1 = v13_2;
                        } else {
                            return v4_5;
                        }
                    } else {
                        return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(((Throwable) new Exception("Fa\u00e7a login"))));
                    }
                } else {
                    return v4_5;
                }
            case 1:
                String v5_5 = ((String) v2_1.L$2);
                String v6_3 = ((String) v2_1.L$1);
                Object v7_6 = ((String) v2_1.L$0);
                kotlin.ResultKt.throwOnFailure(v3_3);
                v13_2 = v5_5;
                v12 = v6_3;
                v11_1 = v7_6;
                v5_6 = v3_3;
                break;
            case 2:
                v5_3 = ((com.example.data.model.UserEntity) v2_1.L$3);
                v6_1 = ((String) v2_1.L$2);
                Object v7_3 = ((String) v2_1.L$1);
                kotlin.ResultKt.throwOnFailure(v3_3);
                v12 = v7_3;
                v7_4 = v3_3;
                break;
            default:
                Object v7 = p21;
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        String v9_2 = ((Number) v7_4).longValue();
        this.notificationHelper.notifyPrivateMessage(v5_3.getName(), kotlin.text.StringsKt.take(v6_1, 60));
        return kotlin.Result.constructor-impl(kotlin.coroutines.jvm.internal.Boxing.boxLong(v9_2));
    }

    public final Object syncWithCloud(kotlin.coroutines.Continuation p8)
    {
        IllegalStateException v0_2;
        if (!(p8 instanceof com.example.data.repository.QuadraRepository$syncWithCloud$1)) {
            v0_2 = new com.example.data.repository.QuadraRepository$syncWithCloud$1(this, p8);
        } else {
            v0_2 = ((com.example.data.repository.QuadraRepository$syncWithCloud$1) p8);
            if ((((com.example.data.repository.QuadraRepository$syncWithCloud$1) p8).label & -2147483648) == 0) {
            } else {
                ((com.example.data.repository.QuadraRepository$syncWithCloud$1) p8).label = (((com.example.data.repository.QuadraRepository$syncWithCloud$1) p8).label - -2147483648);
            }
        }
        String v1_2 = v0_2.result;
        Boolean v2_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (v0_2.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(v1_2);
                this._isSyncing.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(1));
                v0_2.label = 1;
                if (kotlinx.coroutines.DelayKt.delay(1200, v0_2) != v2_0) {
                    this._lastSyncTime.setValue(kotlin.coroutines.jvm.internal.Boxing.boxLong(System.currentTimeMillis()));
                    this._isSyncing.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(0));
                    v0_2.label = 2;
                    if (this.checkBirthdaysForToday(v0_2) != v2_0) {
                    } else {
                        return v2_0;
                    }
                } else {
                    return v2_0;
                }
            case 1:
                kotlin.ResultKt.throwOnFailure(v1_2);
                break;
            case 2:
                kotlin.ResultKt.throwOnFailure(v1_2);
                break;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(1);
    }

    public final Object toggleLike(com.example.data.model.MuralPostEntity p5, kotlin.coroutines.Continuation p6)
    {
        kotlin.Unit v0_1;
        Object v1_1 = this.muralDao;
        if (!p5.isLikedByMe()) {
            kotlin.Unit v0_3 = v1_1.likePost(p5.getId(), p6);
            if (v0_3 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                v0_1 = kotlin.Unit.INSTANCE;
            } else {
                return v0_3;
            }
        } else {
            kotlin.Unit v0_2 = v1_1.unlikePost(p5.getId(), p6);
            if (v0_2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                v0_1 = kotlin.Unit.INSTANCE;
            } else {
                return v0_2;
            }
        }
        return v0_1;
    }

    public final Object updateProfile-yxL6bBk(String p22, String p23, String p24, String p25, kotlin.coroutines.Continuation p26)
    {
        IllegalStateException v2_1;
        if (!(p26 instanceof com.example.data.repository.QuadraRepository$updateProfile$1)) {
            v2_1 = new com.example.data.repository.QuadraRepository$updateProfile$1(this, p26);
        } else {
            v2_1 = ((com.example.data.repository.QuadraRepository$updateProfile$1) p26);
            if ((((com.example.data.repository.QuadraRepository$updateProfile$1) p26).label & -2147483648) == 0) {
            } else {
                ((com.example.data.repository.QuadraRepository$updateProfile$1) p26).label = (((com.example.data.repository.QuadraRepository$updateProfile$1) p26).label - -2147483648);
            }
        }
        String v7_2;
        String v13_1;
        String v6_3;
        com.example.data.model.UserEntity v5_5;
        String v14;
        String v3_2 = v2_1.result;
        com.example.data.model.UserEntity v4_5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (v2_1.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(v3_2);
                com.example.data.model.UserEntity v5_6 = this.userDao;
                v6_3 = p22;
                v2_1.L$0 = p22;
                v7_2 = p23;
                v2_1.L$1 = p23;
                v2_1.L$2 = p24;
                v2_1.L$3 = p25;
                v2_1.label = 1;
                v5_5 = v5_6.getCurrentUser(v2_1);
                if (v5_5 != v4_5) {
                    v13_1 = p24;
                    v14 = p25;
                    String v8_5 = ((com.example.data.model.UserEntity) v5_5);
                    if (v8_5 != null) {
                        int v10_8 = kotlin.text.StringsKt.trim(((CharSequence) v6_3)).toString();
                        String v12_1 = kotlin.text.StringsKt.trim(((CharSequence) v7_2)).toString();
                        com.example.data.model.UserEntity v5_13 = com.example.data.model.UserEntity.copy$default(v8_5, 0, v10_8, 0, v12_1, v13_1, v14, 0, 0, 0, 453, 0);
                        String v9_4 = this.userDao;
                        v2_1.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v6_3);
                        v2_1.L$1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v7_2);
                        v2_1.L$2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v13_1);
                        v2_1.L$3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v14);
                        v2_1.L$4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v8_5);
                        v2_1.L$5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v5_13);
                        v2_1.label = 2;
                        if (v9_4.updateUser(v5_13, v2_1) != v4_5) {
                            String v9 = v6_3;
                            String v6 = v14;
                            String v7 = v13_1;
                        } else {
                            return v4_5;
                        }
                    } else {
                        return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(((Throwable) new Exception("Nenhum usu\u00e1rio logado"))));
                    }
                } else {
                    return v4_5;
                }
            case 1:
                com.example.data.model.UserEntity v5_4 = ((String) v2_1.L$3);
                String v6_2 = ((String) v2_1.L$2);
                v7_2 = ((String) v2_1.L$1);
                String v8_2 = ((String) v2_1.L$0);
                kotlin.ResultKt.throwOnFailure(v3_2);
                v14 = v5_4;
                v13_1 = v6_2;
                v6_3 = v8_2;
                v5_5 = v3_2;
                break;
            case 2:
                com.example.data.model.UserEntity v5 = ((com.example.data.model.UserEntity) v2_1.L$4);
                v7 = ((String) v2_1.L$2);
                v9 = ((String) v2_1.L$0);
                kotlin.ResultKt.throwOnFailure(v3_2);
                break;
            default:
                v7 = p23;
                v9 = p25;
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        this.notificationHelper.dispatchNotification("SYSTEM", "Perfil Atualizado", "Seus dados foram atualizados com sucesso na Quadra de Mana\u00edra.");
        return kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE);
    }
}
