package br.com.quadramanaira.util

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast

/** Dados fixos da quadra e atalhos para apps externos (Maps, WhatsApp). */
object QuadraInfo {
    const val NAME = "Quadra Poliesportiva de Manaíra"
    const val LAT = -7.0982
    const val LNG = -34.8315
    const val ADDRESS = "Orla da Praia de Manaíra • Av. Gov. Flávio Ribeiro Coutinho / Av. João Maurício\n" +
        "João Pessoa - PB • CEP 58038-000"
    const val SITE = "https://quadramanaira.com.br"

    val infrastructure = listOf(
        "Iluminação noturna em LED" to "Funcionamento até as 22h com ótima visibilidade para rachas",
        "Quadra poliesportiva" to "Demarcações para futsal e basquete, com espaço ao lado para vôlei de praia",
        "Ponto de hidratação" to "Bebedouros e quiosques próximos ao calçadão",
        "Acesso gratuito e público" to "Espaço de esporte e lazer comunitário de João Pessoa",
    )

    fun openRoute(context: Context) {
        val nav = Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=$LAT,$LNG&mode=d"))
            .setPackage("com.google.android.apps.maps")
        val web = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/?api=1&destination=$LAT,$LNG"))
        try {
            context.startActivity(nav)
        } catch (_: Exception) {
            try {
                context.startActivity(web)
            } catch (_: Exception) {
                Toast.makeText(context, "Não foi possível abrir o mapa", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun share(context: Context) {
        val text = "🏖️ *QUADRA DE MANAÍRA - JOÃO PESSOA / PB* 🏀⚽🏐\n\n" +
            "Venha fazer parte da comunidade esportiva da Quadra de Manaíra!\n" +
            "• Agende partidas de Futebol, Basquete, Vôlei de Praia e Ginástica\n" +
            "• Confira o clima e o vento na praia em tempo real\n" +
            "• Interaja no mural e converse no chat com outros atletas\n\n" +
            "Baixe o aplicativo: $SITE"
        val send = Intent(Intent.ACTION_SEND).setType("text/plain").putExtra(Intent.EXTRA_TEXT, text)
        try {
            context.startActivity(Intent(send).setPackage("com.whatsapp"))
        } catch (_: Exception) {
            context.startActivity(Intent.createChooser(send, "Compartilhar Quadra de Manaíra"))
        }
    }
}
