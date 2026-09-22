package com.example.ui.screens;
public final class MuralScreenKt$MuralScreen$lambda$9$lambda$8$lambda$7$$inlined$items$default$3 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {
    final synthetic kotlin.jvm.functions.Function1 $contentType;
    final synthetic java.util.List $items;

    public MuralScreenKt$MuralScreen$lambda$9$lambda$8$lambda$7$$inlined$items$default$3(kotlin.jvm.functions.Function1 p2, java.util.List p3)
    {
        this.$contentType = p2;
        this.$items = p3;
        super(1);
        return;
    }

    public final Object invoke(int p3)
    {
        return this.$contentType.invoke(this.$items.get(p3));
    }

    public bridge synthetic Object invoke(Object p2)
    {
        return this.invoke(((Number) p2).intValue());
    }
}
