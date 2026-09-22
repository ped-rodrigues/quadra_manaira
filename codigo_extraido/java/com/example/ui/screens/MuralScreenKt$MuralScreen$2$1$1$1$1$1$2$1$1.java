package com.example.ui.screens;
final class MuralScreenKt$MuralScreen$2$1$1$1$1$1$2$1$1 implements kotlin.jvm.functions.Function0 {
    final synthetic com.example.data.model.MuralPostEntity $post;
    final synthetic com.example.ui.viewmodel.QuadraViewModel $viewModel;

    MuralScreenKt$MuralScreen$2$1$1$1$1$1$2$1$1(com.example.ui.viewmodel.QuadraViewModel p1, com.example.data.model.MuralPostEntity p2)
    {
        this.$viewModel = p1;
        this.$post = p2;
        return;
    }

    public bridge synthetic Object invoke()
    {
        this.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke()
    {
        this.$viewModel.toggleLike(this.$post);
        return;
    }
}
