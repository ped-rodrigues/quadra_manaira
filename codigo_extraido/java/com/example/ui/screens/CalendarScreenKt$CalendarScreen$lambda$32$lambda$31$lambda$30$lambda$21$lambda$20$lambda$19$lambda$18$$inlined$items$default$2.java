package com.example.ui.screens;
public final class CalendarScreenKt$CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$21$lambda$20$lambda$19$lambda$18$$inlined$items$default$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {
    final synthetic java.util.List $items;
    final synthetic kotlin.jvm.functions.Function1 $key;

    public CalendarScreenKt$CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$21$lambda$20$lambda$19$lambda$18$$inlined$items$default$2(kotlin.jvm.functions.Function1 p2, java.util.List p3)
    {
        this.$key = p2;
        this.$items = p3;
        super(1);
        return;
    }

    public final Object invoke(int p3)
    {
        return this.$key.invoke(this.$items.get(p3));
    }

    public bridge synthetic Object invoke(Object p2)
    {
        return this.invoke(((Number) p2).intValue());
    }
}
