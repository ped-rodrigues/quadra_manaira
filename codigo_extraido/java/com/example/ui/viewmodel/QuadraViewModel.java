package com.example.ui.viewmodel;
public final class QuadraViewModel extends androidx.lifecycle.AndroidViewModel {
    public static final int $stable;
    private final kotlinx.coroutines.flow.MutableStateFlow _activeChatMessages;
    private final kotlinx.coroutines.flow.MutableStateFlow _currentScreen;
    private final kotlinx.coroutines.flow.MutableStateFlow _isWeatherLoading;
    private final kotlinx.coroutines.flow.MutableStateFlow _selectedCalendarDate;
    private final kotlinx.coroutines.flow.MutableStateFlow _selectedChatUser;
    private final kotlinx.coroutines.flow.MutableStateFlow _uiMessage;
    private final kotlinx.coroutines.flow.MutableStateFlow _weather;
    private final kotlinx.coroutines.flow.StateFlow activeChatMessages;
    private final kotlinx.coroutines.flow.StateFlow allBookings;
    private final kotlinx.coroutines.flow.StateFlow allUsers;
    private final String appVersionName;
    private final kotlinx.coroutines.flow.StateFlow currentScreen;
    private final kotlinx.coroutines.flow.StateFlow currentUser;
    private final com.example.data.local.QuadraDatabase database;
    private final kotlinx.coroutines.flow.StateFlow isOnline;
    private final kotlinx.coroutines.flow.StateFlow isSyncing;
    private final kotlinx.coroutines.flow.StateFlow isWeatherLoading;
    private final kotlinx.coroutines.flow.StateFlow muralPosts;
    private final com.example.util.NotificationHelper notificationHelper;
    private final kotlinx.coroutines.flow.StateFlow notifications;
    private final com.example.data.repository.QuadraRepository repository;
    private final kotlinx.coroutines.flow.StateFlow selectedCalendarDate;
    private final kotlinx.coroutines.flow.StateFlow selectedChatUser;
    private kotlinx.coroutines.flow.MutableStateFlow showEditProfileDialog;
    private kotlinx.coroutines.flow.MutableStateFlow showNewBookingDialog;
    private kotlinx.coroutines.flow.MutableStateFlow showNewPostDialog;
    private kotlinx.coroutines.flow.MutableStateFlow showPasswordRecoveryDialog;
    private kotlinx.coroutines.flow.MutableStateFlow showRegistrationDialog;
    private kotlinx.coroutines.flow.MutableStateFlow showUpdateCheckerDialog;
    private final kotlinx.coroutines.flow.StateFlow uiMessage;
    private final kotlinx.coroutines.flow.StateFlow unreadNotificationsCount;
    private final kotlinx.coroutines.flow.StateFlow weather;

    static QuadraViewModel()
    {
        com.example.ui.viewmodel.QuadraViewModel.$stable = 8;
        return;
    }

    public QuadraViewModel(android.app.Application p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "application");
        super(p12);
        super.database = com.example.data.local.QuadraDatabase.Companion.getInstance(((android.content.Context) p12));
        super.notificationHelper = new com.example.util.NotificationHelper(((android.content.Context) p12), super.database.notificationDao());
        super.repository = new com.example.data.repository.QuadraRepository(((android.content.Context) p12), super.database, super.notificationHelper, 0, 8, 0);
        super.appVersionName = "v0.2.0";
        super._currentScreen = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.example.ui.viewmodel.AppScreen.LOGIN);
        super.currentScreen = kotlinx.coroutines.flow.FlowKt.asStateFlow(super._currentScreen);
        super.currentUser = kotlinx.coroutines.flow.FlowKt.stateIn(super.repository.getCurrentUserFlow(), androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) super)), kotlinx.coroutines.flow.SharingStarted$Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.Companion, 5000, 0, 2, 0), 0);
        super.allUsers = kotlinx.coroutines.flow.FlowKt.stateIn(super.repository.getAllUsers(), androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) super)), kotlinx.coroutines.flow.SharingStarted$Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.Companion, 5000, 0, 2, 0), kotlin.collections.CollectionsKt.emptyList());
        super.allBookings = kotlinx.coroutines.flow.FlowKt.stateIn(super.repository.getAllBookings(), androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) super)), kotlinx.coroutines.flow.SharingStarted$Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.Companion, 5000, 0, 2, 0), kotlin.collections.CollectionsKt.emptyList());
        super.muralPosts = kotlinx.coroutines.flow.FlowKt.stateIn(super.repository.getAllPosts(), androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) super)), kotlinx.coroutines.flow.SharingStarted$Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.Companion, 5000, 0, 2, 0), kotlin.collections.CollectionsKt.emptyList());
        super.notifications = kotlinx.coroutines.flow.FlowKt.stateIn(super.repository.getAllNotifications(), androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) super)), kotlinx.coroutines.flow.SharingStarted$Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.Companion, 5000, 0, 2, 0), kotlin.collections.CollectionsKt.emptyList());
        com.example.ui.viewmodel.QuadraViewModel$1 v0_6 = super.repository.getUnreadNotificationsCount();
        java.util.Date v1_7 = androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) super));
        java.util.Locale v2_3 = kotlinx.coroutines.flow.SharingStarted$Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.Companion, 5000, 0, 2, 0);
        int v5_0 = Boolean.valueOf(0);
        super.unreadNotificationsCount = kotlinx.coroutines.flow.FlowKt.stateIn(v0_6, v1_7, v2_3, Integer.valueOf(0));
        super.isOnline = super.repository.isOnline();
        super.isSyncing = super.repository.isSyncing();
        super._weather = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(0);
        super.weather = kotlinx.coroutines.flow.FlowKt.asStateFlow(super._weather);
        super._isWeatherLoading = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(v5_0);
        super.isWeatherLoading = kotlinx.coroutines.flow.FlowKt.asStateFlow(super._isWeatherLoading);
        super._selectedCalendarDate = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault()).format(new java.util.Date()));
        super.selectedCalendarDate = kotlinx.coroutines.flow.FlowKt.asStateFlow(super._selectedCalendarDate);
        super._selectedChatUser = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(0);
        super.selectedChatUser = kotlinx.coroutines.flow.FlowKt.asStateFlow(super._selectedChatUser);
        super._activeChatMessages = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
        super.activeChatMessages = kotlinx.coroutines.flow.FlowKt.asStateFlow(super._activeChatMessages);
        super.showRegistrationDialog = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(v5_0);
        super.showPasswordRecoveryDialog = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(v5_0);
        super.showEditProfileDialog = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(v5_0);
        super.showNewBookingDialog = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(v5_0);
        super.showNewPostDialog = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(v5_0);
        super.showUpdateCheckerDialog = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(v5_0);
        super._uiMessage = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(0);
        super.uiMessage = kotlinx.coroutines.flow.FlowKt.asStateFlow(super._uiMessage);
        super.repository.checkNetworkStatus();
        super.refreshWeather();
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) super)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$1(super, 0)), 3, 0);
        return;
    }

    public static final synthetic void access$checkBirthdays(com.example.ui.viewmodel.QuadraViewModel p0)
    {
        p0.checkBirthdays();
        return;
    }

    public static final synthetic com.example.data.local.QuadraDatabase access$getDatabase$p(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        return p1.database;
    }

    public static final synthetic com.example.util.NotificationHelper access$getNotificationHelper$p(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        return p1.notificationHelper;
    }

    public static final synthetic kotlinx.coroutines.flow.MutableStateFlow access$get_activeChatMessages$p(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        return p1._activeChatMessages;
    }

    public static final synthetic kotlinx.coroutines.flow.MutableStateFlow access$get_isWeatherLoading$p(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        return p1._isWeatherLoading;
    }

    public static final synthetic kotlinx.coroutines.flow.MutableStateFlow access$get_selectedChatUser$p(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        return p1._selectedChatUser;
    }

    public static final synthetic kotlinx.coroutines.flow.MutableStateFlow access$get_uiMessage$p(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        return p1._uiMessage;
    }

    public static final synthetic kotlinx.coroutines.flow.MutableStateFlow access$get_weather$p(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        return p1._weather;
    }

    private final void checkBirthdays()
    {
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$checkBirthdays$1(this, 0)), 3, 0);
        return;
    }

    public final void cancelBooking(com.example.data.model.BookingEntity p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "booking");
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$cancelBooking$1(this, p8, 0)), 3, 0);
        return;
    }

    public final void clearUiMessage()
    {
        this._uiMessage.setValue(0);
        return;
    }

    public final void closeChat()
    {
        this._selectedChatUser.setValue(0);
        this._activeChatMessages.setValue(kotlin.collections.CollectionsKt.emptyList());
        return;
    }

    public final void createBooking(String p12, String p13, String p14, String p15, String p16, kotlin.jvm.functions.Function0 p17, kotlin.jvm.functions.Function1 p18)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "startTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "endTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "sport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "notes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "onSuccess");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "onError");
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$createBooking$1(this, p12, p13, p14, p15, p16, p17, p18, 0)), 3, 0);
        return;
    }

    public final void createPost(String p9, String p10, String p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "sport");
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$createPost$1(this, p9, p10, p11, 0)), 3, 0);
        return;
    }

    public final kotlinx.coroutines.flow.StateFlow getActiveChatMessages()
    {
        return this.activeChatMessages;
    }

    public final kotlinx.coroutines.flow.StateFlow getAllBookings()
    {
        return this.allBookings;
    }

    public final kotlinx.coroutines.flow.StateFlow getAllUsers()
    {
        return this.allUsers;
    }

    public final String getAppVersionName()
    {
        return this.appVersionName;
    }

    public final kotlinx.coroutines.flow.StateFlow getCurrentScreen()
    {
        return this.currentScreen;
    }

    public final kotlinx.coroutines.flow.StateFlow getCurrentUser()
    {
        return this.currentUser;
    }

    public final kotlinx.coroutines.flow.StateFlow getMuralPosts()
    {
        return this.muralPosts;
    }

    public final kotlinx.coroutines.flow.StateFlow getNotifications()
    {
        return this.notifications;
    }

    public final com.example.data.repository.QuadraRepository getRepository()
    {
        return this.repository;
    }

    public final kotlinx.coroutines.flow.StateFlow getSelectedCalendarDate()
    {
        return this.selectedCalendarDate;
    }

    public final kotlinx.coroutines.flow.StateFlow getSelectedChatUser()
    {
        return this.selectedChatUser;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow getShowEditProfileDialog()
    {
        return this.showEditProfileDialog;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow getShowNewBookingDialog()
    {
        return this.showNewBookingDialog;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow getShowNewPostDialog()
    {
        return this.showNewPostDialog;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow getShowPasswordRecoveryDialog()
    {
        return this.showPasswordRecoveryDialog;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow getShowRegistrationDialog()
    {
        return this.showRegistrationDialog;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow getShowUpdateCheckerDialog()
    {
        return this.showUpdateCheckerDialog;
    }

    public final kotlinx.coroutines.flow.StateFlow getUiMessage()
    {
        return this.uiMessage;
    }

    public final kotlinx.coroutines.flow.StateFlow getUnreadNotificationsCount()
    {
        return this.unreadNotificationsCount;
    }

    public final kotlinx.coroutines.flow.StateFlow getWeather()
    {
        return this.weather;
    }

    public final kotlinx.coroutines.flow.StateFlow isOnline()
    {
        return this.isOnline;
    }

    public final kotlinx.coroutines.flow.StateFlow isSyncing()
    {
        return this.isSyncing;
    }

    public final kotlinx.coroutines.flow.StateFlow isWeatherLoading()
    {
        return this.isWeatherLoading;
    }

    public final void login(String p9, String p10, kotlin.jvm.functions.Function2 p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "identifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "password");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "onResult");
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$login$1(p9, p11, this, p10, 0)), 3, 0);
        return;
    }

    public final void loginWithSocial(String p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "provider");
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$loginWithSocial$1(this, p8, 0)), 3, 0);
        return;
    }

    public final void logout()
    {
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$logout$1(this, 0)), 3, 0);
        return;
    }

    public final void markAllNotificationsAsRead()
    {
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$markAllNotificationsAsRead$1(this, 0)), 3, 0);
        return;
    }

    public final void markNotificationAsRead(long p8)
    {
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$markNotificationAsRead$1(this, p8, 0)), 3, 0);
        return;
    }

    public final void navigateTo(com.example.ui.viewmodel.AppScreen p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "screen");
        this._currentScreen.setValue(p2);
        return;
    }

    public final void observeChatWith(com.example.data.model.UserEntity p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "user");
        com.example.data.model.UserEntity v0_3 = ((com.example.data.model.UserEntity) this.currentUser.getValue());
        if (v0_3 != null) {
            kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$observeChatWith$1(this, p9, v0_3, 0)), 3, 0);
            return;
        } else {
            return;
        }
    }

    public final void openChatWith(com.example.data.model.UserEntity p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "user");
        this._selectedChatUser.setValue(p2);
        this.navigateTo(com.example.ui.viewmodel.AppScreen.MESSAGES);
        this.observeChatWith(p2);
        return;
    }

    public final void refreshWeather()
    {
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$refreshWeather$1(this, 0)), 3, 0);
        return;
    }

    public final void registerNewUser(String p12, String p13, String p14, String p15, String p16, kotlin.jvm.functions.Function0 p17, kotlin.jvm.functions.Function1 p18)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "birthDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "sport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "photoUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "password");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "onSuccess");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "onError");
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$registerNewUser$1(this, p12, p13, p14, p15, p16, p17, p18, 0)), 3, 0);
        return;
    }

    public final void selectCalendarDate(String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "date");
        this._selectedCalendarDate.setValue(p2);
        return;
    }

    public final void sendMessage(String p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "text");
        com.example.data.model.UserEntity v0_3 = ((com.example.data.model.UserEntity) this._selectedChatUser.getValue());
        if (v0_3 != null) {
            if (!kotlin.text.StringsKt.isBlank(((CharSequence) p9))) {
                kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$sendMessage$1(this, v0_3, p9, 0)), 3, 0);
                return;
            } else {
                return;
            }
        } else {
            return;
        }
    }

    public final void sendPasswordRecovery(String p8, kotlin.jvm.functions.Function0 p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "email");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "onDone");
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$sendPasswordRecovery$1(this, p8, p9, 0)), 3, 0);
        return;
    }

    public final void setShowEditProfileDialog(kotlinx.coroutines.flow.MutableStateFlow p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.showEditProfileDialog = p2;
        return;
    }

    public final void setShowNewBookingDialog(kotlinx.coroutines.flow.MutableStateFlow p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.showNewBookingDialog = p2;
        return;
    }

    public final void setShowNewPostDialog(kotlinx.coroutines.flow.MutableStateFlow p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.showNewPostDialog = p2;
        return;
    }

    public final void setShowPasswordRecoveryDialog(kotlinx.coroutines.flow.MutableStateFlow p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.showPasswordRecoveryDialog = p2;
        return;
    }

    public final void setShowRegistrationDialog(kotlinx.coroutines.flow.MutableStateFlow p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.showRegistrationDialog = p2;
        return;
    }

    public final void setShowUpdateCheckerDialog(kotlinx.coroutines.flow.MutableStateFlow p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.showUpdateCheckerDialog = p2;
        return;
    }

    public final void syncNow()
    {
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$syncNow$1(this, 0)), 3, 0);
        return;
    }

    public final void toggleLike(com.example.data.model.MuralPostEntity p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "post");
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$toggleLike$1(this, p8, 0)), 3, 0);
        return;
    }

    public final void triggerPushNotification(String p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "type");
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$triggerPushNotification$1(this, p8, 0)), 3, 0);
        return;
    }

    public final void updateProfile(String p11, String p12, String p13, String p14, kotlin.jvm.functions.Function0 p15)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "birthDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "sport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "photoUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "onComplete");
        kotlinx.coroutines.BuildersKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(((androidx.lifecycle.ViewModel) this)), 0, 0, ((kotlin.jvm.functions.Function2) new com.example.ui.viewmodel.QuadraViewModel$updateProfile$1(this, p11, p12, p13, p14, p15, 0)), 3, 0);
        return;
    }
}
