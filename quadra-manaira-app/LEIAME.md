# Quadra de Manaíra: app novo (Kotlin + Firebase)

Reescrita do app original (gerado no AI Studio) com backend real no Firebase.

## Estrutura

```
quadra-manaira-app/
├── app/                                 App Android (Kotlin + Jetpack Compose)
│   └── src/main/java/br/com/quadramanaira/
│       ├── QuadraApp.kt                 Application + injeção de dependências
│       ├── MainActivity.kt              Sessão: login → completar perfil → app
│       ├── data/model/                  Modelos (User, Booking, Post, Chat...)
│       ├── data/repository/             Acesso ao Firebase (Auth, Firestore)
│       ├── data/remote/                 Clima (Open-Meteo)
│       ├── push/                        Push (FCM) e notificações locais
│       ├── ui/screens/                  Telas: auth, calendar, mural, chat, notifications, profile, map
│       └── util/                        Datas, erros, dados da quadra
└── firebase/                            Backend
    ├── firestore.rules                  Regras de segurança (valida tudo no servidor)
    ├── firestore.indexes.json           Índices
    └── functions/src/index.ts           Push, lembrete 24h, aniversários
```

## Como configurar o Firebase (quando for criar)

1. Em https://console.firebase.google.com, crie um projeto.
2. **Adicione um app Android** com o pacote `br.com.quadramanaira`.
   - Para o login com Google, cadastre também a impressão digital SHA-1 da chave de assinatura.
     No Android Studio: aba *Gradle* → `app > Tasks > android > signingReport`.
3. Baixe o `google-services.json` e coloque em `app/google-services.json`.
4. No console, ative:
   - **Authentication** → métodos *E-mail/senha* e *Google*
   - **Firestore Database** (modo produção, região `southamerica-east1`)
   - **Cloud Messaging** (já vem ativo)
5. Faça o deploy das regras, dos índices e das funções (precisa do Node 20+):
   ```bash
   npm install -g firebase-tools
   firebase login
   cd firebase
   firebase use --add          # escolhe o projeto criado
   cd functions && npm install && cd ..
   firebase deploy --only firestore
   firebase deploy --only functions   # exige o plano Blaze (tem cota gratuita)
   ```

Sem o `google-services.json` o app **compila e abre** uma tela explicando esses passos.

Sem as Cloud Functions (plano Spark, gratuito) o app funciona, mas **sem push, sem lembrete de 24h e sem aviso de aniversário**.

## Como compilar

Abra a pasta `quadra-manaira-app` no **Android Studio** (Ladybug 2024.2 ou mais novo) e rode o app.
Para gerar o APK de release: *Build → Generate Signed App Bundle / APK* (crie uma keystore e **guarde-a**; sem ela não dá pra publicar atualizações).

## Modelo de dados (Firestore)

| Coleção | Conteúdo |
|---|---|
| `users/{uid}` | perfil público: nome, esporte, avatar, dia/mês do aniversário |
| `users/{uid}/private/data` | e-mail, data de nascimento, bloqueados (só o dono lê) |
| `users/{uid}/tokens/{token}` | aparelhos para push |
| `users/{uid}/notifications/{id}` | histórico de notificações (criado pelas Functions) |
| `bookings/{id}` | agendamentos (data, horário, esporte, organizador, status) |
| `slots/{data}_{HH:mm}` | blocos de 30 min ocupados; impedem conflito de horário |
| `posts/{id}` + `posts/{id}/likes/{uid}` | mural e curtidas por usuário |
| `conversations/{uidA_uidB}` + `/messages/{id}` | chat privado, com não lidas por usuário |
| `reports/{id}` | denúncias de posts/conversas (só leitura pelo console) |

Testes das regras: `cd firebase/functions && npm install && npm run test:rules` (precisa de Java 11+).
