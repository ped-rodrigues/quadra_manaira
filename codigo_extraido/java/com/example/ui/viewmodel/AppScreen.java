package com.example.ui.viewmodel;
public final enum class AppScreen extends java.lang.Enum {
    private static final synthetic kotlin.enums.EnumEntries $ENTRIES;
    private static final synthetic com.example.ui.viewmodel.AppScreen[] $VALUES;
    public static final enum com.example.ui.viewmodel.AppScreen CALENDAR;
    public static final enum com.example.ui.viewmodel.AppScreen LOGIN;
    public static final enum com.example.ui.viewmodel.AppScreen MAP;
    public static final enum com.example.ui.viewmodel.AppScreen MESSAGES;
    public static final enum com.example.ui.viewmodel.AppScreen MURAL;
    public static final enum com.example.ui.viewmodel.AppScreen NOTIFICATIONS;
    public static final enum com.example.ui.viewmodel.AppScreen PROFILE;

    private static final synthetic com.example.ui.viewmodel.AppScreen[] $values()
    {
        com.example.ui.viewmodel.AppScreen v2 = com.example.ui.viewmodel.AppScreen.CALENDAR;
        com.example.ui.viewmodel.AppScreen v4 = com.example.ui.viewmodel.AppScreen.MESSAGES;
        return new com.example.ui.viewmodel.AppScreen[] {com.example.ui.viewmodel.AppScreen.LOGIN, com.example.ui.viewmodel.AppScreen.NOTIFICATIONS});
    }

    static AppScreen()
    {
        com.example.ui.viewmodel.AppScreen.LOGIN = new com.example.ui.viewmodel.AppScreen("LOGIN", 0);
        com.example.ui.viewmodel.AppScreen.PROFILE = new com.example.ui.viewmodel.AppScreen("PROFILE", 1);
        com.example.ui.viewmodel.AppScreen.CALENDAR = new com.example.ui.viewmodel.AppScreen("CALENDAR", 2);
        com.example.ui.viewmodel.AppScreen.MURAL = new com.example.ui.viewmodel.AppScreen("MURAL", 3);
        com.example.ui.viewmodel.AppScreen.MESSAGES = new com.example.ui.viewmodel.AppScreen("MESSAGES", 4);
        com.example.ui.viewmodel.AppScreen.MAP = new com.example.ui.viewmodel.AppScreen("MAP", 5);
        com.example.ui.viewmodel.AppScreen.NOTIFICATIONS = new com.example.ui.viewmodel.AppScreen("NOTIFICATIONS", 6);
        com.example.ui.viewmodel.AppScreen.$VALUES = com.example.ui.viewmodel.AppScreen.$values();
        com.example.ui.viewmodel.AppScreen.$ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(((Enum[]) com.example.ui.viewmodel.AppScreen.$VALUES));
        return;
    }

    private AppScreen(String p1, int p2)
    {
        super(p1, p2);
        return;
    }

    public static kotlin.enums.EnumEntries getEntries()
    {
        return com.example.ui.viewmodel.AppScreen.$ENTRIES;
    }

    public static com.example.ui.viewmodel.AppScreen valueOf(String p1)
    {
        return ((com.example.ui.viewmodel.AppScreen) Enum.valueOf(com.example.ui.viewmodel.AppScreen, p1));
    }

    public static com.example.ui.viewmodel.AppScreen[] values()
    {
        return ((com.example.ui.viewmodel.AppScreen[]) com.example.ui.viewmodel.AppScreen.$VALUES.clone());
    }
}
