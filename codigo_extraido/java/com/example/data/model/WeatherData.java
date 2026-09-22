package com.example.data.model;
public final class WeatherData {
    public static final int $stable;
    private final String condition;
    private final int humidity;
    private final boolean isDay;
    private final String location;
    private final double temperature;
    private final double windSpeed;

    static WeatherData()
    {
        return;
    }

    public WeatherData(double p2, String p4, double p5, int p7, boolean p8, String p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "condition");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "location");
        this.temperature = p2;
        this.condition = p4;
        this.windSpeed = p5;
        this.humidity = p7;
        this.isDay = p8;
        this.location = p9;
        return;
    }

    public synthetic WeatherData(double p11, String p13, double p14, int p16, boolean p17, String p18, int p19, kotlin.jvm.internal.DefaultConstructorMarker p20)
    {
        int v7;
        if ((p19 & 8) == 0) {
            v7 = p16;
        } else {
            v7 = 78;
        }
        boolean v8;
        if ((p19 & 16) == 0) {
            v8 = p17;
        } else {
            v8 = 1;
        }
        String v9;
        if ((p19 & 32) == 0) {
            v9 = p18;
        } else {
            v9 = "Mana\u00edra, Jo\u00e3o Pessoa - PB";
        }
        this(p11, p13, p14, v7, v8, v9);
        return;
    }

    public static synthetic com.example.data.model.WeatherData copy$default(com.example.data.model.WeatherData p9, double p10, String p12, double p13, int p15, boolean p16, String p17, int p18, Object p19)
    {
        if ((p18 & 1) != 0) {
            p10 = p9.temperature;
        }
        if ((p18 & 2) != 0) {
            p12 = p9.condition;
        }
        if ((p18 & 4) != 0) {
            p13 = p9.windSpeed;
        }
        if ((p18 & 8) != 0) {
            p15 = p9.humidity;
        }
        boolean v7;
        if ((p18 & 16) == 0) {
            v7 = p16;
        } else {
            v7 = p9.isDay;
        }
        String v8;
        if ((p18 & 32) == 0) {
            v8 = p17;
        } else {
            v8 = p9.location;
        }
        return p9.copy(p10, p12, p13, p15, v7, v8);
    }

    public final double component1()
    {
        return this.temperature;
    }

    public final String component2()
    {
        return this.condition;
    }

    public final double component3()
    {
        return this.windSpeed;
    }

    public final int component4()
    {
        return this.humidity;
    }

    public final boolean component5()
    {
        return this.isDay;
    }

    public final String component6()
    {
        return this.location;
    }

    public final com.example.data.model.WeatherData copy(double p11, String p13, double p14, int p16, boolean p17, String p18)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "condition");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "location");
        return new com.example.data.model.WeatherData(p11, p13, p14, p16, p17, p18);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.example.data.model.WeatherData)) {
                if (Double.compare(this.temperature, ((com.example.data.model.WeatherData) p8).temperature) == 0) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.condition, ((com.example.data.model.WeatherData) p8).condition)) {
                        if (Double.compare(this.windSpeed, ((com.example.data.model.WeatherData) p8).windSpeed) == 0) {
                            if (this.humidity == ((com.example.data.model.WeatherData) p8).humidity) {
                                if (this.isDay == ((com.example.data.model.WeatherData) p8).isDay) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.location, ((com.example.data.model.WeatherData) p8).location)) {
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

    public final String getCondition()
    {
        return this.condition;
    }

    public final int getHumidity()
    {
        return this.humidity;
    }

    public final String getLocation()
    {
        return this.location;
    }

    public final double getTemperature()
    {
        return this.temperature;
    }

    public final double getWindSpeed()
    {
        return this.windSpeed;
    }

    public int hashCode()
    {
        return ((((((((((Double.hashCode(this.temperature) * 31) + this.condition.hashCode()) * 31) + Double.hashCode(this.windSpeed)) * 31) + Integer.hashCode(this.humidity)) * 31) + Boolean.hashCode(this.isDay)) * 31) + this.location.hashCode());
    }

    public final boolean isDay()
    {
        return this.isDay;
    }

    public String toString()
    {
        return new StringBuilder().append("WeatherData(temperature=").append(this.temperature).append(", condition=").append(this.condition).append(", windSpeed=").append(this.windSpeed).append(", humidity=").append(this.humidity).append(", isDay=").append(this.isDay).append(", location=").append(this.location).append(")").toString();
    }
}
