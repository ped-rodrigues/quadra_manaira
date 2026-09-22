package com.example.ui.viewmodel;
final class QuadraViewModel$observeChatWith$1$1 implements kotlinx.coroutines.flow.FlowCollector {
    final synthetic com.example.ui.viewmodel.QuadraViewModel this$0;

    QuadraViewModel$observeChatWith$1$1(com.example.ui.viewmodel.QuadraViewModel p1)
    {
        this.this$0 = p1;
        return;
    }

    public bridge synthetic Object emit(Object p2, kotlin.coroutines.Continuation p3)
    {
        return this.emit(((java.util.List) p2), p3);
    }

    public final Object emit(java.util.List p2, kotlin.coroutines.Continuation p3)
    {
        com.example.ui.viewmodel.QuadraViewModel.access$get_activeChatMessages$p(this.this$0).setValue(p2);
        return kotlin.Unit.INSTANCE;
    }
}
