package com.example.ui.viewmodel;
final class QuadraViewModel$triggerPushNotification$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    final synthetic String $type;
    int label;
    final synthetic com.example.ui.viewmodel.QuadraViewModel this$0;

    QuadraViewModel$triggerPushNotification$1(com.example.ui.viewmodel.QuadraViewModel p2, String p3, kotlin.coroutines.Continuation p4)
    {
        this.this$0 = p2;
        this.$type = p3;
        super(2, p4);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p4, kotlin.coroutines.Continuation p5)
    {
        return ((kotlin.coroutines.Continuation) new com.example.ui.viewmodel.QuadraViewModel$triggerPushNotification$1(this.this$0, this.$type, p5));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.ui.viewmodel.QuadraViewModel$triggerPushNotification$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p6)
    {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                String v0_1;
                kotlin.ResultKt.throwOnFailure(p6);
                String v0_5 = ((com.example.data.model.UserEntity) this.this$0.getCurrentUser().getValue());
                if (v0_5 == null) {
                    v0_1 = "Atleta";
                } else {
                    v0_1 = v0_5.getName();
                    if (v0_1 == null) {
                    }
                }
                com.example.util.NotificationHelper v1_0 = this.$type;
                switch (v1_0.hashCode()) {
                    case 2067288:
                        if (v1_0.equals("CHAT")) {
                            com.example.util.NotificationHelper vtmp15 = com.example.ui.viewmodel.QuadraViewModel.access$getNotificationHelper$p(this.this$0);
                            vtmp15.notifyPrivateMessage("Atleta da Quadra", "E a\u00ed, vamos bater um racha hoje \u00e0s 19h na Quadra de Mana\u00edra?");
                        } else {
                        }
                        break;
                    case 782668857:
                        if (!v1_0.equals("BOOKING")) {
                        } else {
                            com.example.util.NotificationHelper vtmp16 = com.example.ui.viewmodel.QuadraViewModel.access$getNotificationHelper$p(this.this$0);
                            vtmp16.notifyBookingChanged(0, "V\u00f4lei de Praia", "16:30 \u00e0s 18:00 (Amanh\u00e3)", v0_1);
                        }
                        break;
                    case 1325434051:
                        if (v1_0.equals("ALERT_24H")) {
                            com.example.util.NotificationHelper vtmp17 = com.example.ui.viewmodel.QuadraViewModel.access$getNotificationHelper$p(this.this$0);
                            vtmp17.notify24HourReminder("Futebol", "Amanh\u00e3", "08:00");
                        } else {
                        }
                        break;
                    case 1852002941:
                        if (v1_0.equals("BIRTHDAY")) {
                            com.example.util.NotificationHelper vtmp18 = com.example.ui.viewmodel.QuadraViewModel.access$getNotificationHelper$p(this.this$0);
                            vtmp18.notifyBirthday("Mariana Costa", "V\u00f4lei de Praia");
                        } else {
                        }
                        break;
                    default:
                }
                com.example.ui.viewmodel.QuadraViewModel.access$get_uiMessage$p(this.this$0).setValue(new StringBuilder().append("Notifica\u00e7\u00e3o Push (").append(this.$type).append(") enviada com sucesso!").toString());
                return kotlin.Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
    }
}
