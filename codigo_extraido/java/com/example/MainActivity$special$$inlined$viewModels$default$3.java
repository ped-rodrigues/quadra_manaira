package com.example;
public final class MainActivity$special$$inlined$viewModels$default$3 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {
    final synthetic kotlin.jvm.functions.Function0 $extrasProducer;
    final synthetic androidx.activity.ComponentActivity $this_viewModels;

    public MainActivity$special$$inlined$viewModels$default$3(kotlin.jvm.functions.Function0 p2, androidx.activity.ComponentActivity p3)
    {
        this.$extrasProducer = p2;
        this.$this_viewModels = p3;
        super(0);
        return;
    }

    public final androidx.lifecycle.viewmodel.CreationExtras invoke()
    {
        androidx.lifecycle.viewmodel.CreationExtras v0_2;
        androidx.lifecycle.viewmodel.CreationExtras v0_0 = this.$extrasProducer;
        if (v0_0 == null) {
            v0_2 = this.$this_viewModels.getDefaultViewModelCreationExtras();
        } else {
            v0_2 = ((androidx.lifecycle.viewmodel.CreationExtras) v0_0.invoke());
            if (v0_2 == null) {
            }
        }
        return v0_2;
    }

    public bridge synthetic Object invoke()
    {
        return this.invoke();
    }
}
