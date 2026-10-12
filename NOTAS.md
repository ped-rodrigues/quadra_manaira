# Quadra de Manaíra — Notas do projeto

_Última atualização: 2026-10-12_

## Status atual

- [x] Análise do APK, bugs e proposta de backend (seções 1 a 7)
- [x] Backend: **Firebase** (Auth + Firestore + FCM + Cloud Functions)
- [x] 2026-09-22/28: primeiro app Kotlin (seção 8, **substituído**; está no commit `7ba3fb7`)
- [x] 2026-10-11: **reescrita do zero**: app Android nativo (Compose), app iOS nativo (SwiftUI) e backend refeito (seção 9)
- [x] Android compilado e testado de ponta a ponta no emulador; regras testadas; auditoria de configurações inseguras (seção 10)
- [x] 2026-10-12: iOS compila e passa nos testes no GitHub Actions (`.github/workflows/ios.yml`); telas ainda não vistas num iPhone
- [x] 2026-10-12: **e-mail confirmado obrigatório** (achado MÉDIO da auditoria, seção 10)
- [ ] **Pendente (você):** criar o Firebase (Android + iOS + chave APNs). Passo a passo em `quadra-manaira-app/LEIAME.md`
- Lista completa do que falta: **`PENDENCIAS.md`**

---

## 1. Identificação do APK

| Item | Valor |
|---|---|
| Arquivo | `QUADRA_DE_MANAIRA.apk` (25 MB) |
| Pacote | `com.aistudio.quadramanaira.kpxz` |
| Versão | 0.2.0 (code 3) |
| SDK | min 24 (Android 7) / target 36 |
| Build | **debug**, assinado com certificado "Android Debug" |
| Origem | Gerado pelo Google AI Studio (pacote `aistudio`, código em `com.example.*`) |
| Stack | Kotlin + Jetpack Compose + Room (SQLite) + OkHttp |
| Ofuscação | Nenhuma |

**Permissões:** INTERNET, ACCESS_NETWORK_STATE, POST_NOTIFICATIONS, VIBRATE.

## 2. Funcionalidades

- **Login / Cadastro**: e-mail + senha; botões "Google" e "Instagram"
- **Calendário**: agendamentos (Futebol, Basquete, Vôlei de Praia, Ginástica)
- **Mural**: posts com curtidas
- **Mensagens**: chat entre usuários
- **Notificações**: lembrete 24h antes, aniversários
- **Mapa**: rota no Google Maps até a quadra (-7.0982, -34.8315)
- **Clima**: API Open-Meteo (única chamada de rede real)
- **Perfil** + compartilhar no WhatsApp (link `quadramanaira.com.br`)

## 3. Problemas encontrados

1. **Sem backend**: tudo fica no SQLite local (`quadra_manaira.db`). Agendamentos, mural e chat não chegam a outros usuários.
2. **Sincronização falsa**: `syncWithCloud()` só espera 1,2 s e mostra mensagem de sucesso.
3. **Login Google/Instagram falso**: cria usuário fixo ("Atleta Google", 10/05/1996, Vôlei de Praia) sem autenticar.
4. **Recuperação de senha falsa**: mostra "link enviado", mas não envia nada.
5. **Senha em texto puro**: o campo se chama `passwordHash`, mas compara a senha direto.
6. **Senha vazia entra em qualquer conta**: a checagem só falha se a senha for diferente **e** não vazia (`QuadraRepository.login`).
7. **Firebase embutido sem uso**: bibliotecas incluídas, mas sem configuração (`google_app_id`) e sem uso no código.
8. `res/raw/videoplayback.mp4` e `hello.wav` aumentam o tamanho do APK.

**Conclusão:** protótipo visual pra um usuário só. Pra virar app comunitário de verdade faltam: backend (Firebase/Supabase), autenticação real, hash de senha e build de release assinado.

## 4. Banco de dados local (Room)

Tabelas: `users`, `bookings`, `mural_posts`, `messages`, `notifications`.
Arquivo `quadra_manaira.db`, versão de schema 3, criado com `fallbackToDestructiveMigration()`.

### 4.1 O problema do banco

**O problema principal: o banco é só local, cada celular tem o seu.** O app usa SQLite (Room) dentro do aparelho e não existe servidor. Consequências:
- Um usuário cadastrado no celular A **não existe** no celular B.
- Agendamentos, mural e chat **não chegam a ninguém**. Uma "mensagem" pra outro atleta só fica gravada no seu próprio celular.
- O calendário não impede que dois celulares agendem o mesmo horário, porque um não enxerga o outro.
- O botão "sincronizar" é falso (espera 1,2 s e mostra sucesso).

**Problemas de modelagem, mesmo sendo local:**

| # | Problema | Onde | Efeito |
|---|---|---|---|
| B1 | **Sem unicidade de usuário.** O e-mail é gerado a partir do nome (`nome sem espaços + @quadramanaira.com`) e não há `UNIQUE` em `email` nem em `name` | `registerUser`, tabela `users` | Duas pessoas com o mesmo nome geram o mesmo e-mail. O login busca com `LIMIT 1` e pega a primeira, então **a segunda pessoa nunca consegue entrar** ("Senha incorreta") |
| B2 | **Login social cria usuário novo a cada clique** (`id = user_google_<ms % 10000>`) | `loginWithSocial` | A tabela enche de "Atleta Google" duplicados. Se o id colidir, o `INSERT OR REPLACE` sobrescreve outro |
| B3 | **Curtida é global, não por usuário** (`mural_posts.isLikedByMe`) | `MuralDao.likePost/unlikePost` | Se o usuário A curte, o B vê como curtido por ele e pode "descurtir" a curtida do A |
| B4 | **Sessão gravada no banco** (`users.isCurrentUser`) | `UserDao.setCurrentUser` | Frágil: se o app fechar entre `clearCurrentUser` e `setCurrentUser`, ninguém fica logado |
| B5 | **Senha em texto puro** (coluna `passwordHash` guarda a senha em claro). Usuários sociais têm senha `"social"` | `users` | Qualquer um que digite "Atleta Google" + "social" entra nessa conta |
| B6 | **`fallbackToDestructiveMigration()`** | `QuadraDatabase.Companion` | Toda atualização que mude o schema **apaga todos os dados** do usuário sem avisar |
| B7 | **Mensagens nunca são marcadas como lidas.** `MessageDao.markAsRead` existe mas nunca é chamado | `MessageDao` | O indicador de "não lida" nunca some |
| B8 | Agendamento cancelado só muda `status` pra `CANCELLED`; não há checagem de conflito de horário no insert | `createBooking` | Dá pra marcar dois jogos no mesmo horário no mesmo aparelho |

## 5. Bugs de funcionamento

| # | Bug | Onde |
|---|---|---|
| F1 | **Cadastro não pede e-mail**: o e-mail é inventado a partir do nome. A "recuperação de senha" manda link pra esse e-mail falso (e nem manda de verdade) | `registerUser`, `sendPasswordRecovery` |
| F2 | **Aniversários nunca notificam**: `checkBirthdaysForToday()` calcula a data de hoje, busca o usuário e não faz mais nada. `notifyBirthday()` nunca é chamado | `QuadraRepository.checkBirthdaysForToday` |
| F3 | **"Lembrete de 24h" dispara na hora do agendamento**, não 24h antes (não usa AlarmManager/WorkManager) | `createBooking` → `notify24HourReminder` |
| F4 | **Notificação de mensagem aparece pra quem enviou**, não pra quem recebe | `sendMessage` → `notifyPrivateMessage` |
| F5 | **Senha vazia passa** no `QuadraRepository.login` (código morto hoje: a tela usa `QuadraViewModel.login`, que está correto) | `QuadraRepository.login` |
| F6 | IDs de notificação aleatórios (`Random.nextInt(1000, 99999)`) podem colidir e sobrescrever uma notificação | `NotificationHelper.dispatchNotification` |
| F7 | Código morto: `getBookingsByDate`, `deleteBooking`, `getMessagesForUser`, `deleteNotification`, `MessageDao.markAsRead` nunca são usados | DAOs |

## 6. Como corrigir

O que foi extraído é Java decompilado. **Não dá pra editar e recompilar** (falta o código-fonte Kotlin original e não há Java/Android SDK nesta máquina). As opções são:
1. **Reescrever como projeto Kotlin limpo** (Android Studio), já com as correções acima.
2. **Patch no bytecode (smali) + reassinar o APK**: só corrige bugs pontuais (F2–F6, B6, B7); não resolve o banco local.
3. **Pegar o projeto original no Google AI Studio** (se ainda existir) e corrigir lá.

O problema principal (banco só local) só se resolve com **backend**: Firebase (Auth + Firestore) ou Supabase.

## 7. Proposta: refatorar para backend

### Opções

| Opção | O que é | Prós | Contras |
|---|---|---|---|
| **Supabase** (recomendado) | Postgres + Auth + Realtime + Storage prontos | Os problemas do banco são relacionais e o Postgres resolve direto: `UNIQUE` no e-mail, constraint que impede horário sobreposto, tabela de curtidas por usuário. Tem login Google, recuperação de senha real e chat em tempo real. Plano gratuito | Regras de acesso em SQL (RLS), que exigem um pouco de estudo |
| Firebase | Firestore (NoSQL) + Auth + FCM | Push notification nativo (FCM), SDK Android muito maduro | NoSQL: unicidade e conflito de horário precisam de transação ou Cloud Function |
| API própria (Ktor/NestJS/Django) + Postgres | Servidor escrito por você | Controle total, mesma linguagem do app (Ktor = Kotlin) | Precisa hospedar, manter, implementar auth, chat em tempo real e push na mão. É muito mais trabalho pra um app desse tamanho |

**Recomendação: Supabase para dados, auth e chat, mais Firebase Cloud Messaging só para push.** Se depois precisar de regra de negócio pesada, dá pra somar Edge Functions (no próprio Supabase) sem ter um servidor.

### Arquitetura alvo

```
App Android (Kotlin + Compose)
 ├─ ui/         telas atuais (Login, Calendário, Mural, Chat, Notificações, Mapa, Perfil)
 ├─ viewmodel/  um ViewModel por tela
 ├─ data/
 │   ├─ remote/ SupabaseClient (auth, postgrest, realtime) + Open-Meteo
 │   ├─ local/  Room só como cache offline
 │   └─ repository/ junta remoto + cache
 └─ push/       FCM (lembrete 24h, nova mensagem, novo agendamento)

Supabase
 ├─ auth.users            (e-mail/senha + Google; hash e recuperação de senha nativos)
 ├─ profiles              (id → auth.users, nome, nascimento, esporte, foto)
 ├─ bookings              (EXCLUDE para impedir horário sobreposto; status)
 ├─ mural_posts
 ├─ post_likes            (post_id, user_id) PK composta → corrige B3
 ├─ messages              (sender_id, receiver_id, read_at) + Realtime
 ├─ notifications         (por usuário)
 └─ cron / Edge Function  (lembrete 24h, aniversários do dia → FCM)
```

### Como cada problema é resolvido

| Problema | Solução |
|---|---|
| Banco só local | Dados no Supabase; Room vira cache |
| B1, F1 | Cadastro com e-mail real; `UNIQUE(email)` no Auth |
| B2 | Login Google via Supabase Auth (OAuth real) |
| B3 | Tabela `post_likes` por usuário |
| B4 | Sessão gerenciada pelo SDK do Supabase |
| B5, F5 | Senha com hash no Supabase Auth; o app nunca vê a senha |
| B6 | Migrations versionadas no Supabase e no Room |
| B7 | `read_at` atualizado ao abrir a conversa |
| B8 | `EXCLUDE USING gist` em (data, horário) para status ≠ CANCELLED |
| F2, F3 | Cron diário/horário no Supabase → push FCM |
| F4 | Push enviado para o destinatário, via trigger no insert de `messages` |
| F6 | ID de notificação derivado do id do registro |

### Etapas

1. Criar o projeto Supabase: schema SQL, RLS e migrations (versionados no repo)
2. Criar o projeto Android Kotlin limpo, portando as telas do código extraído
3. Auth (e-mail/senha + Google) e perfil
4. Calendário com checagem de conflito
5. Mural + curtidas
6. Chat em tempo real
7. Push (FCM) + cron de lembretes e aniversários
8. Build de release assinado

---

## 8. Primeiro app Kotlin (setembro de 2026, substituído pela seção 9)

> Decisão: **Firebase** em vez do Supabase recomendado na seção 7. As limitações do NoSQL foram contornadas assim: o conflito de horário usa documentos de "slot" protegidos por regra, e o contador de curtidas é validado pelas regras.

**Stack:** Kotlin 2.1 · Jetpack Compose (Material 3) · Firebase Auth / Firestore / Messaging · Credential Manager (Google) · Cloud Functions em TypeScript (Node 20). minSdk 26, targetSdk 35. Pacote novo: `br.com.quadramanaira`.

### Como cada problema foi resolvido

| Problema | Solução no app novo | Onde |
|---|---|---|
| Banco só local | Firestore compartilhado, com cache offline nativo | `data/repository/*` |
| B1/F1: sem e-mail real e sem unicidade | Cadastro com e-mail real; unicidade garantida pelo Firebase Auth. Login só por e-mail | `AuthRepository.register` |
| B2: login social falso | Google via Credential Manager + Firebase Auth; perfil criado só no 1º login. **Instagram foi removido** (o Firebase não suporta) | `AuthRepository.signInWithGoogle` |
| B3: curtida global | `posts/{id}/likes/{uid}`; contador ±1 validado pelas regras | `MuralRepository`, `firestore.rules` |
| B4: sessão no banco | Sessão do SDK do Firebase | `SessionViewModel` |
| B5/F5: senha em texto puro / senha vazia | Senha nunca passa pelo app; hash no Firebase Auth | — |
| B6: migração destrutiva | Sem Room; o schema do Firestore é flexível | — |
| B7: mensagens nunca lidas | `conversations.unread[uid]`, zerado ao abrir a conversa; badge na barra | `ChatRepository.markRead` |
| B8: conflito de horário | Blocos `slots/{data}_{HH:mm}` criados em transação; as regras proíbem sobrescrever. Também valida horário de funcionamento (06–22h), máximo de 3h e se o horário já passou | `BookingRepository`, `firestore.rules` |
| F1: recuperação de senha falsa | `sendPasswordResetEmail` real | `AuthRepository` |
| F2: aniversário nunca notificava | Function diária às 08:00 (`birthDayMonth == hoje`) | `functions/src/index.ts` → `birthdays` |
| F3: lembrete 24h imediato | Function a cada 15 min, com `startAt` e `reminderSent` | `bookingReminders` |
| F4: push para o remetente | Function no insert da mensagem envia ao **destinatário** | `onMessageCreated` |
| F6: IDs de notificação aleatórios | Notificação com tag = id do registro (atualiza em vez de duplicar) | `push/Notifications.kt` |
| Sync falso | Removido (o Firestore sincroniza sozinho) | — |

### O que mudou em relação ao app original
- Login por **nome** removido: agora só e-mail (necessário pro Firebase Auth).
- Login pelo **Instagram** removido.
- **Foto anexada no mural** ainda não foi implementada (exigiria o Firebase Storage). Avatares continuam sendo emojis.
- Só o **organizador** pode cancelar o próprio agendamento.

### Correções de 2026-09-28 (itens da seção 3 do PENDENCIAS)
- **Privacidade:** `users/{uid}` só tem nome, avatar, esporte e `birthDayMonth`. E-mail, nascimento e lista de bloqueados ficam em `users/{uid}/private/data` (só o dono lê). `UserRepository.myProfile` junta as duas partes.
- **Excluir conta:** Perfil → "Excluir minha conta". O app apaga o usuário do Auth (se o login for antigo, pede para sair e entrar de novo); a Function `onUserDeleted` (gatilho v1 de Auth) apaga posts, curtidas, conversas, agendamentos (jogos futuros viram cancelados) e o perfil.
- **Denunciar/bloquear:** menu ⋮ no post e na conversa. Denúncia grava em `reports` (só leitura pelo console; **alguém precisa olhar lá**). Bloquear esconde posts e conversas da pessoa e as regras recusam mensagens dela.
- **Regras:** chat só aceita os nomes reais dos perfis e não lidas só zeram (as minhas) ou sobem 1 (as do outro); agendamento exige todos os blocos de 30 min do intervalo, e cada bloco tem de estar dentro de um agendamento confirmado do próprio usuário.
- **Push:** aviso geral virou mensagem só `data` com `excludeUid`, então quem agenda/cancela/faz aniversário não recebe o aviso duplicado; chave "Avisos gerais da quadra" no Perfil silencia os avisos gerais.
- **Functions novas:** `onPostDeleted` (curtidas órfãs), `monthlyCleanup` (agendamentos e slots de datas passadas), `onUserDeleted`.
- **Chat:** mensagem sai com o nome atual (antes usava o perfil de quando a tela abriu).

### Status da verificação
- Functions (TypeScript): `tsc` passou sem erros.
- App Android: **não compilado ainda**. Revisei o código manualmente, mas o primeiro build no Android Studio pode apontar ajustes pequenos.
- Regras do Firestore: **15 testes passando no emulador** (2026-09-28), `cd firebase/functions && npm run test:rules`. Precisa de Java 11+ no PATH (usei um JRE portátil só para rodar).

## 9. Reescrita nativa (2026-10-11)

Pedido: apps Android e iOS **do zero**, código enxuto ("ponytail"), skill de design, animações, Android primeiro.
Escolhas confirmadas com o usuário: apagar e recriar tudo (backup no commit `7ba3fb7`, branch `app-nativo`) e **nativo separado** (Kotlin/Compose + Swift/SwiftUI).

### Estrutura
`quadra-manaira-app/android`, `quadra-manaira-app/ios`, `quadra-manaira-app/firebase`. Os dois apps têm os mesmos arquivos (Data, App, Theme, telas) e as mesmas regras puras (horários, blocos de 30 min, nascimento), com testes nos dois.

### Enxugamento em relação ao app de setembro
- Android: de 30 arquivos para 9; sem ViewModels, sem navigation-compose e sem injeção de dependência (um `object Repo` com os fluxos do Firestore e as telas coletando direto).
- Push: o aviso geral deixou de ser por tópico com filtro no aparelho (não funciona no iOS) e passou a ser por token, escolhido pela Function. A chave "Avisos gerais" agora vale no servidor (campo `broadcasts` do token).
- FCM 26 (Firebase BOM 35) tornou `getToken()`/`onNewToken` obsoletos; o app usa `register()` + `onRegistered`.
- iOS sem login com Google (a App Store exigiria "Entrar com a Apple").

### Design
- Paleta da própria quadra: verde-azulado do mar (#0B6E69), amarelo das linhas do piso (#F5C400), concreto (#EEF2F0), tinta (#0F2A28); coral só para curtir e ações destrutivas.
- Fonte de placar (Barlow Condensed SemiBold) em títulos, horários e números; texto corrido na fonte do sistema.
- Destaque único: a **linha do dia** na Agenda (06:00 às 22:00 como as linhas do piso; jogos são blocos; faixa amarela = jogo seu; linha amarela = agora; tocar num espaço livre já abre o agendamento naquele horário).
- Faixa do mar com o clima e a hora em que o sol nasceu (João Pessoa é onde ele nasce primeiro nas Américas).
- Movimento: os blocos crescem em cascata ao trocar de dia; o coração pulsa ao curtir; telas por cima deslizam da direita. Respeita "reduzir movimento" (Android pela escala de animação do sistema; iOS por `accessibilityReduceMotion`).
- Ícone novo: as linhas da quadra vistas de cima. **Os ícones do app antigo estavam todos corrompidos** (nenhum `.webp` abria).

### Bugs achados nos testes de ponta a ponta (corrigidos)
- Campo de nascimento: a barra automática deixava o cursor para trás (`15032000` virava `15/02/0003`).
- Título "Quadra de Manaíra" duplicado sobre a foto de capa (a foto já tem o letreiro).
- Rótulo amarelo da aba selecionada com pouco contraste; faixa do clima mudava de altura ao carregar.
- Regras: o helper `doc(caminho)` virava um segmento só (`$(path)` não aceita barras). Os testes pegaram.

### Ambiente desta máquina (para as próximas sessões)
- JDK 21 em `%LOCALAPPDATA%\jdk-21`, Android SDK em `%LOCALAPPDATA%\Android\Sdk` (licenças aceitas, emulador e AVD `quadra` com Android 15), Gradle 9.8.1.
- No Git Bash, tirar a aspa solta do PATH antes do Gradle (`tr -d` na variável), senão os testes do Gradle quebram.
- O git usa credencial de outra conta (Tech-Mack); o push vai com `git -c credential.helper= -c "credential.helper=!gh auth git-credential" push`.

## 10. Auditoria de configurações inseguras (2026-10-11)

Adaptação do `/insecure-defaults:audit` (Trail of Bits) feita à mão, porque aqui não há a ferramenta de Workflow do plugin. Mesmo método: varredura das 6 categorias (segredos com valor padrão, credenciais padrão, chaves que falham abertas, criptografia fraca, acesso permissivo, vazamento de depuração), depois verificação de cada candidato pelos 5 passos (chega em produção? o valor inseguro é o que roda? é inseguro mesmo? chega numa decisão de segurança? o deploy sempre fornece a config?).

**Validação "sem autenticação, falha fechada"** (equivalente ao REQUIRE_AUTH do prompt), testada de verdade:
- Firestore sem login: leitura de `users`, `posts`, `bookings`, `conversations`, `reports` e escrita em `posts` → **HTTP 403** em todas.
- APK de release sem `google-services.json` → abre só a tela "Firebase não configurado"; nada se conecta.
- iOS: mesmo desenho (`#if DEBUG` para o emulador; release sem plist mostra a tela de configuração). Não executado (sem Mac).

**Achados**

| # | Severidade | Categoria | Onde (sink) | Problema | Correção |
|---|---|---|---|---|---|
| 1 | MÉDIA | acesso permissivo | `firestore.rules` (`signedIn()` em posts, bookings, messages) | Conta com e-mail **não verificado** escreve tudo: dá para criar contas em série com e-mails falsos (ou de outra pessoa) e postar, agendar e mandar mensagens | Mandar e-mail de verificação no cadastro e exigir `request.auth.token.email_verified == true` nas escritas (login Google já vem verificado). Precisa de uma tela "confirme seu e-mail" nos dois apps. **Feito em 2026-10-12** (ver histórico) |
| 2 | BAIXA | padrão fraco | Firebase Auth (console) | Política de senha padrão aceita 6 caracteres | Ativar a política de senha no console (mínimo 8, letras e números) |
| 3 | BAIXA | acesso permissivo | `ios/project.yml` (`NSAllowsLocalNetworking`) | HTTP liberado para a rede local também no release | Aceito: o release não faz chamadas locais e o TLS para Firebase/Open-Meteo continua obrigatório. Para zerar, separar o Info.plist por configuração |

**Refutados** (não chegam em produção ou não são inseguros): `demo-key`/`demo-quadra` e `useEmulator` (só no debug, e não são segredos), `usesCleartextTraffic` (só no manifest de debug), `broadcasts` ligado por padrão (preferência de aviso, não segurança), leituras com `signedIn()` (comunidade aberta por desenho; e-mail, nascimento e bloqueios ficam em `private/data`), `exported="true"` só na tela inicial, logs com uid só nos logs do projeto.

**Dependências (o mesmo problema do `npm audit` de setembro, procurado de novo):**
- Functions: `firebase@13` → `@firebase/firestore` trava `@grpc/grpc-js ~1.9` (5 falhas HIGH). Corrigido com `overrides` → 1.14.6. `npm audit`: **0**.
- Android: consulta das 208 bibliotecas no OSV achou **Jackson 2.21.3** (puxado pelo `firebase-firestore` 27) com falhas HIGH. Corrigido forçando `jackson-bom:2.21.7`. Nova consulta: **0**. App testado de novo no emulador depois da troca.
- iOS (SwiftPM): só dá para conferir depois que o Mac resolver os pacotes (`Package.resolved`).

## Histórico

- **2026-09-22**: análise do APK; extração do código decompilado para `codigo_extraido/`; criação deste documento.
- **2026-09-22**: levantamento de bugs (F1–F7) e problemas do banco (B1–B8) confirmados no bytecode.
- **2026-09-22**: proposta de refatoração para backend (Supabase + FCM).
- **2026-09-22**: escolhido o Firebase; criado `quadra-manaira-app/` (app Kotlin/Compose + regras + Cloud Functions). Firebase ainda não criado.
- **2026-09-22**: criado `PENDENCIAS.md` com tudo o que falta (configuração, testes, problemas conhecidos, publicação).
- **2026-09-28**: resolvidos os itens de código da seção 3 do `PENDENCIAS.md` (privacidade, excluir conta, denunciar/bloquear, regras de chat e slots, limpezas, push duplicado, silenciar avisos) + testes das regras no emulador. App Android ainda não compilado.
- **2026-10-11**: reescrita do zero (seção 9): Android nativo novo, iOS nativo, regras e Functions refeitas; Android compilado e testado de ponta a ponta no emulador com o Firebase Emulator; regras com 8 cenários de teste; auditoria de configurações inseguras e de dependências (seção 10: grpc-js e Jackson corrigidos); branch `app-nativo` enviado ao GitHub. iOS aguarda compilação no GitHub Actions.
- **2026-10-12**: escopo `workflow` liberado no `gh`; o iOS compilou de primeira no GitHub Actions, mas os testes derrubavam o app: no modo emulador o SDK exige uma chave no formato real (39 caracteres, começando com "A"). Corrigido; `deleteToken()` trocado por `unregister()`. **E-mail confirmado obrigatório**: regras com `verified()` (`email_verified` no token) em tudo fora do próprio perfil, tokens e alertas; o cadastro manda o link e a sessão para em "Confirme seu e-mail" (Android `Session.Unverified`, iOS `.unverified`), que confere sozinha ao voltar para o app; a sessão ouve o token (`IdTokenListener`), que é o que muda ao confirmar. Teste das regras novo (9/9). Testado no emulador Android: conta nova fica presa na tela de confirmação, "Já confirmei" antes do link dá erro, link do emulador → voltar ao app abre a agenda. **Bug achado no teste:** o link não saía no cadastro porque, criada a conta, a tela de login sai de cena e cancela a corrotina do cadastro no meio; o resto do cadastro (e do primeiro login com Google) agora roda em `NonCancellable`.
- **2026-10-12**: aberto o PR #1 (`app-nativo` → `main`).
- **2026-10-12**: merge do PR #1 no `main` (commit `64e69ae`). O `main` agora tem os apps nativos.
