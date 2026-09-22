package com.example.ui.viewmodel;
final class QuadraViewModel$login$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    final synthetic String $identifier;
    final synthetic kotlin.jvm.functions.Function2 $onResult;
    final synthetic String $password;
    Object L$0;
    int label;
    final synthetic com.example.ui.viewmodel.QuadraViewModel this$0;

    QuadraViewModel$login$1(String p2, kotlin.jvm.functions.Function2 p3, com.example.ui.viewmodel.QuadraViewModel p4, String p5, kotlin.coroutines.Continuation p6)
    {
        this.$identifier = p2;
        this.$onResult = p3;
        this.this$0 = p4;
        this.$password = p5;
        super(2, p6);
        return;
    }

    public final kotlin.coroutines.Continuation create(Object p7, kotlin.coroutines.Continuation p8)
    {
        return ((kotlin.coroutines.Continuation) new com.example.ui.viewmodel.QuadraViewModel$login$1(this.$identifier, this.$onResult, this.this$0, this.$password, p8));
    }

    public bridge synthetic Object invoke(Object p2, Object p3)
    {
        return this.invoke(((kotlinx.coroutines.CoroutineScope) p2), ((kotlin.coroutines.Continuation) p3));
    }

    public final Object invoke(kotlinx.coroutines.CoroutineScope p3, kotlin.coroutines.Continuation p4)
    {
        return ((com.example.ui.viewmodel.QuadraViewModel$login$1) this.create(p3, p4)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object p8)
    {
        kotlin.Unit v1_6;
        kotlin.Unit v1_0;
        kotlin.Unit v0_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(p8);
                if (!kotlin.text.StringsKt.isBlank(((CharSequence) this.$identifier))) {
                    kotlin.Unit v1_13 = com.example.ui.viewmodel.QuadraViewModel.access$getDatabase$p(this.this$0).userDao();
                    String v4_3 = kotlin.text.StringsKt.trim(((CharSequence) this.$identifier)).toString();
                    this.label = 1;
                    v1_6 = v1_13.findUserByIdentifier(v4_3, ((kotlin.coroutines.Continuation) this));
                    if (v1_6 != v0_0) {
                        v1_0 = ((com.example.data.model.UserEntity) v1_6);
                        if (v1_0 == null) {
                            this.$onResult.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(0), "Usu\u00e1rio n\u00e3o encontrado. Toque em \'Cadastrar Novo Usu\u00e1rio\' abaixo para criar sua conta.");
                            return kotlin.Unit.INSTANCE;
                        } else {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(v1_0.getPasswordHash(), this.$password)) {
                                String v4_9;
                                if (((CharSequence) v1_0.getPasswordHash()).length() != 0) {
                                    v4_9 = 0;
                                } else {
                                    v4_9 = 1;
                                }
                                if (v4_9 != null) {
                                    String v4_13;
                                    if (((CharSequence) this.$password).length() != 0) {
                                        v4_13 = 0;
                                    } else {
                                        v4_13 = 1;
                                    }
                                    if (v4_13 != null) {
                                        String v3_8 = com.example.ui.viewmodel.QuadraViewModel.access$getDatabase$p(this.this$0).userDao();
                                        this.L$0 = v1_0;
                                        this.label = 2;
                                        if (v3_8.clearCurrentUser(((kotlin.coroutines.Continuation) this)) != v0_0) {
                                            String v3_12 = com.example.ui.viewmodel.QuadraViewModel.access$getDatabase$p(this.this$0).userDao();
                                            String v4_16 = v1_0.getId();
                                            this.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(v1_0);
                                            this.label = 3;
                                            if (v3_12.setCurrentUser(v4_16, ((kotlin.coroutines.Continuation) this)) != v0_0) {
                                            } else {
                                                return v0_0;
                                            }
                                        } else {
                                            return v0_0;
                                        }
                                    }
                                }
                                this.$onResult.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(0), "Senha incorreta.");
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                    } else {
                        return v0_0;
                    }
                } else {
                    this.$onResult.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(0), "Por favor, digite seu nome ou e-mail.");
                    return kotlin.Unit.INSTANCE;
                }
            case 1:
                kotlin.ResultKt.throwOnFailure(p8);
                v1_6 = p8;
                break;
            case 2:
                v1_0 = ((com.example.data.model.UserEntity) this.L$0);
                kotlin.ResultKt.throwOnFailure(p8);
                break;
            case 3:
                kotlin.ResultKt.throwOnFailure(p8);
                break;
            default:
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        this.this$0.navigateTo(com.example.ui.viewmodel.AppScreen.PROFILE);
        this.$onResult.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(1), 0);
        return kotlin.Unit.INSTANCE;
    }
}
