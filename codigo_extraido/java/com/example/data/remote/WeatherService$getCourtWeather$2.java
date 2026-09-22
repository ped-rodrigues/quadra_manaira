package com.example.data.remote;
final class WeatherService$getCourtWeather$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    int label;
    final synthetic com.example.data.remote.WeatherService this$0;

    WeatherService$getCourtWeather$2(com.example.data.remote.WeatherService p2, kotlin.coroutines.Continuation p3)
    {
        this.this$0 = p2;
        super(2, p3);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p3, kotlin.coroutines.Continuation p4)
    {
        return ((kotlin.coroutines.Continuation) new com.example.data.remote.WeatherService$getCourtWeather$2(this.this$0, p4));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.data.remote.WeatherService$getCourtWeather$2) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p25)
    {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p25);
                try {
                    okhttp3.Response v3_3 = com.example.data.remote.WeatherService.access$getClient$p(this.this$0).newCall(new okhttp3.Request$Builder().url(new StringBuilder().append("https://api.open-meteo.com/v1/forecast?latitude=").append(com.example.data.remote.WeatherService.access$getLatitude$p(this.this$0)).append("&longitude=").append(com.example.data.remote.WeatherService.access$getLongitude$p(this.this$0)).append("&current_weather=true").toString()).build()).execute();
                } catch (Exception v0) {
                    return new com.example.data.model.WeatherData(4628574517030027264, "Ensolarado (Brisa do Mar)", 4624633867356078080, 75, 1, "Praia de Mana\u00edra, Jo\u00e3o Pessoa - PB (Offline)");
                }
                if (!v3_3.isSuccessful()) {
                    return new com.example.data.model.WeatherData(4628574517030027264, "Ensolarado (Brisa do Mar)", 4624633867356078080, 75, 1, "Praia de Mana\u00edra, Jo\u00e3o Pessoa - PB (Offline)");
                } else {
                    int v4_3;
                    int v4_2 = v3_3.body();
                    if (v4_2 == 0) {
                        v4_3 = 0;
                    } else {
                        v4_3 = v4_2.string();
                    }
                    if (v4_3 == 0) {
                        return new com.example.data.model.WeatherData(4628574517030027264, "Ensolarado (Brisa do Mar)", 4624633867356078080, 75, 1, "Praia de Mana\u00edra, Jo\u00e3o Pessoa - PB (Offline)");
                    } else {
                        int v8_2;
                        org.json.JSONObject v6_2 = new org.json.JSONObject(v4_3).getJSONObject("current_weather");
                        double v10 = v6_2.getDouble("temperature");
                        double v13 = v6_2.getDouble("windspeed");
                        int v7_4 = v6_2.getInt("weathercode");
                        if (v6_2.optInt("is_day", 1) != 1) {
                            v8_2 = 0;
                        } else {
                            v8_2 = 1;
                        }
                        int v15_2;
                        switch (v7_4) {
                            case 0:
                                if (v8_2 == 0) {
                                    v15_2 = "Noite Estrelada";
                                } else {
                                    v15_2 = "Ensolarado / C\u00e9u Limpo";
                                }
                            case 1:
                            case 2:
                            case 3:
                                v15_2 = "Parcialmente Nublado";
                                break;
                            case 45:
                            case 48:
                                v15_2 = "N\u00e9voa Mar\u00edtima";
                                break;
                            case 51:
                            case 53:
                            case 55:
                            case 61:
                            case 63:
                            case 65:
                            case 80:
                            case 81:
                            case 82:
                                v15_2 = "Chuva R\u00e1pida de Praia";
                                break;
                            case 95:
                            case 96:
                            case 99:
                                v15_2 = "Trovoadas Tropicais";
                                break;
                            default:
                                v15_2 = "Tempo Bom na Orla";
                        }
                        int v16_1 = 1;
                        if (v8_2 == 0) {
                            v16_1 = 0;
                        } else {
                        }
                        return new com.example.data.model.WeatherData(v10, v15_2, v13, 76, v16_1, "Praia de Mana\u00edra, Jo\u00e3o Pessoa - PB");
                    }
                }
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
    }
}
