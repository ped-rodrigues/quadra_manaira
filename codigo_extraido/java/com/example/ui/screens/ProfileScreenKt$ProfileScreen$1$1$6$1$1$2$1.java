package com.example.ui.screens;
final class ProfileScreenKt$ProfileScreen$1$1$6$1$1$2$1 implements kotlin.jvm.functions.Function0 {
    final synthetic com.example.data.model.UserEntity $athlete;
    final synthetic com.example.ui.viewmodel.QuadraViewModel $viewModel;

    ProfileScreenKt$ProfileScreen$1$1$6$1$1$2$1(com.example.ui.viewmodel.QuadraViewModel p1, com.example.data.model.UserEntity p2)
    {
        this.$viewModel = p1;
        this.$athlete = p2;
        return;
    }

    public bridge synthetic Object invoke()
    {
        this.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke()
    {
        this.$viewModel.openChatWith(this.$athlete);
        return;
    }
}
