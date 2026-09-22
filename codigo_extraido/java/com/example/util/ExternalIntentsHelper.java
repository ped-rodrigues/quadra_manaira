package com.example.util;
public final class ExternalIntentsHelper {
    public static final int $stable = 0;
    public static final String APP_DOWNLOAD_URL = "https://quadramanaira.com.br";
    public static final com.example.util.ExternalIntentsHelper INSTANCE = None;
    public static final double QUADRA_LAT = 13843049918000914026;
    public static final double QUADRA_LNG = 13853470951989923807;
    public static final String QUADRA_NAME = "Quadra Poliesportiva de Mana\xedra";

    static ExternalIntentsHelper()
    {
        com.example.util.ExternalIntentsHelper.INSTANCE = new com.example.util.ExternalIntentsHelper();
        return;
    }

    private ExternalIntentsHelper()
    {
        return;
    }

    public final void openGoogleMapsNavigation(android.content.Context p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "context");
        try {
            android.net.Uri v2_3 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("google.navigation:q=-7.0982,-34.8315&mode=d"));
            v2_3.setPackage("com.google.android.apps.maps");
            p7.startActivity(v2_3);
        } catch (Exception v1) {
            android.content.Intent v3_1 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://www.google.com/maps/dir/?api=1&destination=-7.0982,-34.8315"));
            try {
                p7.startActivity(v3_1);
            } catch (Exception v0) {
                android.widget.Toast.makeText(p7, ((CharSequence) "N\u00e3o foi poss\u00edvel abrir o mapa"), 0).show();
            }
        }
        return;
    }

    public final void shareAppOnWhatsApp(android.content.Context p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "context");
        android.content.Intent v1_1 = new android.content.Intent("android.intent.action.SEND");
        Exception v3 = v1_1;
        v3.setType("text/plain");
        v3.setPackage("com.whatsapp");
        v3.putExtra("android.intent.extra.TEXT", "\u1f3d6\ufe0f *QUADRA DE MANAIRA - JO\u00c3O PESSOA / PB* \u1f3c0\u26bd\u1f3d0\n\nVenha fazer parte da comunidade esportiva da Quadra de Mana\u00edra!\n\u2022 Agende partidas de Futebol, Basquete, V\u00f4lei de Praia e Gin\u00e1stica\n\u2022 Confira o clima e vento na praia em tempo real\n\u2022 Interaja no mural e converse no chat com outros atletas\n\nAcesse e baixe o aplicativo: https://quadramanaira.com.br");
        try {
            p9.startActivity(v1_1);
        } catch (Exception v3) {
            android.content.Intent v4_1 = new android.content.Intent("android.intent.action.SEND");
            android.content.Intent v2_0 = v4_1;
            android.content.Intent vtmp4 = v2_0.setType("text/plain");
            v2_0.putExtra("android.intent.extra.TEXT", "\u1f3d6\ufe0f *QUADRA DE MANAIRA - JO\u00c3O PESSOA / PB* \u1f3c0\u26bd\u1f3d0\n\nVenha fazer parte da comunidade esportiva da Quadra de Mana\u00edra!\n\u2022 Agende partidas de Futebol, Basquete, V\u00f4lei de Praia e Gin\u00e1stica\n\u2022 Confira o clima e vento na praia em tempo real\n\u2022 Interaja no mural e converse no chat com outros atletas\n\nAcesse e baixe o aplicativo: https://quadramanaira.com.br");
            p9.startActivity(android.content.Intent.createChooser(v4_1, ((CharSequence) "Compartilhar Quadra de Mana\u00edra")));
        }
        return;
    }
}
