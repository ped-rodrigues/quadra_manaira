# Quadra de Manaíra: apps Android e iOS + Firebase

Reescrita do zero (outubro de 2026): app nativo Android (Kotlin + Jetpack Compose), app nativo iOS
(SwiftUI) e o mesmo backend Firebase para os dois.

```
quadra-manaira-app/
├── android/                 App Android (Kotlin + Compose), um módulo só
│   └── app/src/main/java/br/com/quadramanaira/
│       ├── Data.kt          Modelos, regras da quadra (puras, testadas) e todo o acesso ao Firebase
│       ├── App.kt           Application (canal de push, emulador no debug) e serviço de push
│       ├── MainActivity.kt  Sessão e navegação (abas + conversa/localização por cima)
│       ├── Theme.kt         Paleta, fonte de placar e peças compartilhadas
│       └── *Screen(s).kt    Telas: login/cadastro, agenda, mural, conversas, alertas/perfil/localização
├── ios/                     App iOS (SwiftUI), projeto gerado pelo XcodeGen (project.yml)
│   ├── QuadraManaira/       Mesmos arquivos e nomes do Android: Data, App, Theme, *View(s)
│   └── QuadraManairaTests/  Testes das regras puras
└── firebase/                Backend comum
    ├── firestore.rules      Regras de segurança (valida tudo no servidor; comunidade só com e-mail confirmado)
    ├── firestore.indexes.json
    └── functions/           Push, lembrete 24 h, aniversários, limpezas, exclusão de conta + testes das regras
```

## Rodar sem criar o Firebase (emulador local)

Os builds de **debug** sem arquivo de configuração conectam no Firebase Emulator do computador.
O build de **release** sem configuração não sobe: abre uma tela dizendo o que falta.

```bash
cd firebase
firebase emulators:start --only auth,firestore --project demo-quadra   # precisa de Java 11+
```

- Android: rode o app de debug num emulador Android (ele usa `10.0.2.2`, que é o PC).
- iOS: rode o app de debug no simulador (ele usa `localhost`, que é o Mac).
- Painel do emulador: http://localhost:4000
- Contas por e-mail precisam confirmar o e-mail. No emulador o link não é enviado: ele aparece no terminal do
  `firebase emulators:start` (e em `http://localhost:9099/emulator/v1/projects/demo-quadra/oobCodes`). Abra o link no
  navegador e volte para o app.

## Compilar

**Android** (Android Studio, ou linha de comando com JDK 17+ e Android SDK):
```bash
cd android
./gradlew assembleDebug            # app/build/outputs/apk/debug/
./gradlew testDebugUnitTest        # testes das regras da quadra
./gradlew bundleRelease            # para a Play Store (configure a assinatura antes)
```

**iOS** (Mac com Xcode 26):
```bash
brew install xcodegen
cd ios && xcodegen && open QuadraManaira.xcodeproj
```
O workflow `.github/workflows/ios.yml` compila e roda os testes num Mac do GitHub a cada push em `ios/`.

## Firebase de verdade

Já existe: projeto **`quadra-de-manaira`** (conta pedro.rcosta2006, plano gratuito). Com os arquivos de configuração
no lugar, os builds de debug falam com ele; sem eles, falam com o emulador. Neste PC o do Android está guardado como
`android/app/google-services.json.real`: tire o `.real` para testar no Firebase de verdade. Para baixá-los de novo:
`firebase apps:sdkconfig ANDROID|IOS <id do app> -o <arquivo>` (ids em `firebase apps:list`).

Para recriar do zero em outra conta:


1. Em https://console.firebase.google.com crie o projeto.
2. **Android**: adicione o app `br.com.quadramanaira`, cadastre as SHA-1 (debug, release e Play App Signing;
   sem elas o login com Google falha) e coloque o `google-services.json` em `android/app/`.
3. **iOS**: adicione o app com bundle id `br.com.quadramanaira`, coloque o `GoogleService-Info.plist` em
   `ios/QuadraManaira/` e envie a **chave APNs** (.p8, do Apple Developer) em *Configurações do projeto →
   Cloud Messaging*. Sem a chave, o iOS não recebe push.
4. Ative **Authentication** (E-mail/senha; Google para o Android) e o **Firestore** em `southamerica-east1`.
5. Deploy (Node 22+):
   ```bash
   cd firebase && firebase use --add
   cd functions && npm install && cd ..
   firebase deploy --only firestore
   firebase deploy --only functions    # plano Blaze (tem cota grátis)
   ```

Os dois arquivos de configuração ficam fora do git (`.gitignore`).

## Testes

| O quê | Comando |
|---|---|
| Regras da quadra (Android) | `cd android && ./gradlew testDebugUnitTest` |
| Regras da quadra (iOS) | `xcodebuild test` (ou o workflow do GitHub) |
| Regras do Firestore no emulador | `cd firebase/functions && npm run test:rules` (Java 11+) |
| Dependências | `cd firebase/functions && npm audit` |

## Modelo de dados (Firestore)

| Coleção | Conteúdo |
|---|---|
| `users/{uid}` | perfil público: nome, esporte, avatar, dia/mês do aniversário |
| `users/{uid}/private/data` | e-mail, nascimento, bloqueados (só o dono lê) |
| `users/{uid}/tokens/{token}` | aparelhos para push (`platform`, `broadcasts` = quer avisos gerais) |
| `users/{uid}/notifications/{id}` | histórico de alertas (só as Functions criam) |
| `bookings/{id}` | jogos (data, horário, esporte, organizador, status) |
| `slots/{data}_{HH:mm}` | blocos de 30 min ocupados; impedem conflito de horário |
| `posts/{id}` + `posts/{id}/likes/{uid}` | mural e curtidas |
| `conversations/{uidA_uidB}` + `/messages/{id}` | conversas, com não lidas por pessoa |
| `reports/{id}` | denúncias (só leitura pelo console) |

## Decisões

- **Push por token, não por tópico:** a Function escolhe os aparelhos (menos quem causou o evento e quem
  desligou os avisos gerais). Funciona igual nos dois sistemas. Se passar de alguns milhares de aparelhos,
  trocar por tópicos (`ponytail:` em `functions/src/index.ts`).
- **iOS sem login com Google:** a App Store exige "Entrar com a Apple" quando há login social. Ficou só
  e-mail/senha no iOS; a mesma conta funciona nos dois apps.
- **Dependências travadas por segurança:** `@grpc/grpc-js` (overrides no `package.json`) e Jackson 2.21.7
  (Android). Tirar quando o Firebase atualizar as versões que puxa.
