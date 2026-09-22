package com.example;
public final class BuildConfig {
    public static final String APPLICATION_ID = "com.aistudio.quadramanaira.kpxz";
    public static final String BUILD_TYPE = "debug";
    public static final boolean DEBUG = False;
    public static final int VERSION_CODE = 3;
    public static final String VERSION_NAME = "0.2.0";

    static BuildConfig()
    {
        com.example.BuildConfig.DEBUG = Boolean.parseBoolean("true");
        return;
    }

    public BuildConfig()
    {
        return;
    }
}
