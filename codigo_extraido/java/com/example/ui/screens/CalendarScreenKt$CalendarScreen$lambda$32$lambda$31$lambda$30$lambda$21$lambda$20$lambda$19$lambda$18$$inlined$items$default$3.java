package com.example.ui.screens;
public final class CalendarScreenKt$CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$21$lambda$20$lambda$19$lambda$18$$inlined$items$default$3 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {
    final synthetic kotlin.jvm.functions.Function1 $contentType;
    final synthetic java.util.List $items;

    public CalendarScreenKt$CalendarScreen$lambda$32$lambda$31$lambda$30$lambda$21$lambda$20$lambda$19$lambda$18$$inlined$items$default$3(kotlin.jvm.functions.Function1 p2, java.util.List p3)
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
