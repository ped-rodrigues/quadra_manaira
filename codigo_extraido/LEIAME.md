# Código extraído de QUADRA_DE_MANAIRA.apk

Decompilado com androguard (DAD). O código é **Java reconstruído a partir do bytecode**:
o original era Kotlin + Jetpack Compose, então nomes de variáveis locais (`v3_1`, `p9`...),
corrotinas (`label`, `L$0`) e lambdas (`$1`, `$2`...) aparecem "desmontados".
Não compila direto — serve como referência para reescrever o app.

## Estrutura

- `AndroidManifest.xml` — manifest decodificado
- `java/com/example/`
  - `MainActivity*.java` — entrada do app e navegação
  - `data/model/` — entidades (User, Booking, MuralPost, Message, Notification, WeatherData)
  - `data/local/` — banco Room (DAOs + `QuadraDatabase`)
  - `data/remote/WeatherService*.java` — clima via Open-Meteo
  - `data/repository/QuadraRepository*.java` — lógica de login, cadastro, agendamentos, mural, chat
  - `ui/screens/` — telas (Login, Calendar, Mural, Messages, Notifications, Map, Profile)
  - `ui/viewmodel/` — `QuadraViewModel`
  - `ui/components/`, `ui/theme/` — componentes e tema
  - `util/` — notificações, intents externos (Maps, WhatsApp)
  - Arquivos com `$` no nome são classes internas / lambdas geradas pelo Kotlin
- `res/` — recursos (layouts e XMLs já em texto, imagens, ícones, `raw/`)
- `res/values/strings.xml` — todas as strings do app

Bibliotecas de terceiros (AndroidX, Firebase, OkHttp, Kotlin) não foram extraídas.
