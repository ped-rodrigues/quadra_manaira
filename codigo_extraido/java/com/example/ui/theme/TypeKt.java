package com.example.ui.theme;
public final class TypeKt {
    private static final androidx.compose.material3.Typography Typography;

    static TypeKt()
    {
        int v1_1 = androidx.compose.ui.text.font.FontFamily.Companion.getDefault();
        int v8_1 = androidx.compose.ui.text.font.FontWeight.Companion.getNormal();
        int v6_1 = androidx.compose.ui.unit.TextUnitKt.getSp(16);
        long v25 = androidx.compose.ui.unit.TextUnitKt.getSp(24);
        long vtmp5 = androidx.compose.ui.unit.TextUnitKt.getSp(4602678819172646912);
        com.example.ui.theme.TypeKt.Typography = new androidx.compose.material3.Typography(0, 0, 0, 0, 0, 0, 0, 0, 0, new androidx.compose.ui.text.TextStyle(0, v6_1, v8_1, 0, 0, ((androidx.compose.ui.text.font.FontFamily) v1_1), 0, vtmp5, 0, 0, 0, 0, 0, 0, 0, 0, 0, v25, 0, 0, 0, 0, 0, 0, 16645977, 0), 0, 0, 0, 0, 0, 32255, 0);
        return;
    }

    public static final androidx.compose.material3.Typography getTypography()
    {
        return com.example.ui.theme.TypeKt.Typography;
    }
}
