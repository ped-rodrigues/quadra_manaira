package com.example.data.remote;
public final class WeatherService {
    public static final int $stable;
    private final okhttp3.OkHttpClient client;
    private final double latitude;
    private final double longitude;

    static WeatherService()
    {
        com.example.data.remote.WeatherService.$stable = 8;
        return;
    }

    public WeatherService()
    {
        this.client = new okhttp3.OkHttpClient$Builder().connectTimeout(5, java.util.concurrent.TimeUnit.SECONDS).readTimeout(5, java.util.concurrent.TimeUnit.SECONDS).build();
        this.latitude = -4603694155708637590;
        this.longitude = -4593273121719627809;
        return;
    }

    public static final synthetic okhttp3.OkHttpClient access$getClient$p(com.example.data.remote.WeatherService p1)
    {
        return p1.client;
    }

    public static final synthetic double access$getLatitude$p(com.example.data.remote.WeatherService p2)
    {
        return p2.latitude;
    }

    public static final synthetic double access$getLongitude$p(com.example.data.remote.WeatherService p2)
    {
        return p2.longitude;
    }

    public final Object getCourtWeather(kotlin.coroutines.Continuation p4)
    {
        return kotlinx.coroutines.BuildersKt.withContext(((kotlin.coroutines.CoroutineContext) kotlinx.coroutines.Dispatchers.getIO()), ((kotlin.jvm.functions.Function2) new com.example.data.remote.WeatherService$getCourtWeather$2(this, 0)), p4);
    }
}
