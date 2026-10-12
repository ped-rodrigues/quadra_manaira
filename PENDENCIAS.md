# Quadra de Manaíra: o que falta fazer

_Criado em: 2026-09-22 · Atualizado em: 2026-09-28 · App novo em `quadra-manaira-app/` · Contexto e histórico em `NOTAS.md`_

Legenda de prioridade: 🔴 bloqueia o lançamento · 🟡 importante · 🟢 melhoria

---

## 1. Configuração (primeiros passos)

- [ ] 🔴 **Criar o projeto no Firebase** (console.firebase.google.com)
- [ ] 🔴 Registrar o app Android com o pacote `br.com.quadramanaira`
- [ ] 🔴 Baixar o `google-services.json` e colocar em `quadra-manaira-app/app/`
- [ ] 🔴 Ativar **Authentication**: provedores *E-mail/senha* e *Google*
- [ ] 🔴 Criar o **Firestore** em modo produção, região `southamerica-east1` (a mesma das Functions)
- [ ] 🔴 Cadastrar as **SHA-1** no Firebase (sem elas o login com Google falha):
  - [ ] SHA-1 de debug (Android Studio → Gradle → `signingReport`)
  - [ ] SHA-1 da keystore de release
  - [ ] SHA-1 do *Play App Signing*, se publicar na Play Store
- [ ] 🔴 Deploy das regras e dos índices: `firebase deploy --only firestore`
- [ ] 🟡 Ativar o **plano Blaze** e fazer o deploy das Functions (`firebase deploy --only functions`). Sem isso não há push, lembrete de 24h nem aniversários
- [ ] 🟡 Configurar um **alerta de orçamento** no Google Cloud (ex.: R$ 10), por segurança no Blaze
- [ ] 🟢 Traduzir os modelos de e-mail do Auth (redefinição de senha) para português no console

## 2. Compilar e verificar o app

- [ ] 🔴 **Primeiro build no Android Studio.** O código ainda não foi compilado nenhuma vez, então é provável que apareçam ajustes pequenos (imports, APIs)
- [ ] 🟡 Aceitar ou recusar as sugestões de atualização de versões (AGP, Kotlin, Compose BOM, Firebase BOM) que o Android Studio oferecer. As versões usadas são do fim de 2024
- [ ] 🟡 Conferir o **targetSdk** exigido pela Play Store na data do lançamento (hoje está em 35) e subir se precisar
- [ ] 🔴 Testar manualmente em aparelho real, com **dois usuários em dois celulares**:
  - [ ] Cadastro, login, logout, "esqueci minha senha" (o e-mail chega?)
  - [ ] Login com Google (primeiro acesso → tela "complete seu perfil")
  - [ ] Agendar; o outro celular vê na hora
  - [ ] **Conflito:** os dois tentam o mesmo horário ao mesmo tempo; só um consegue
  - [ ] Cancelar (só o organizador vê o botão)
  - [ ] Mural: publicar, curtir/descurtir nos dois aparelhos (o contador bate?), apagar
  - [ ] Chat: mensagem chega, badge de não lidas aparece e some ao abrir
  - [ ] Push com o app fechado e com o app aberto
  - [ ] Lembrete de 24h (agendar para daqui a ~24h e esperar a Function das 15 min)
  - [ ] Aniversário (cadastrar alguém com a data de hoje e rodar a Function manualmente)
  - [ ] Modo avião: o app abre com o cache e sincroniza ao voltar a conexão
  - [ ] Tema escuro, tela pequena, fonte grande do sistema
- [x] 🟡 Testar as **regras do Firestore no emulador** (`firebase emulators:start`, precisa de Java), tentando burlar: criar agendamento em nome de outro, curtir duas vezes, ler conversa alheia etc. ✅ 2026-09-28: 15 testes em `firebase/functions/test/rules.test.mjs` (`npm run test:rules`, precisa de Java 11+)

## 3. Problemas conhecidos no app novo (corrigir)

- [x] 🔴 **Privacidade: e-mail e data de nascimento de todos ficam visíveis** para qualquer usuário logado (`users/{uid}` tem leitura liberada). Separar em `users/{uid}` (público: nome, avatar, esporte, `birthDayMonth`) e `users/{uid}/private/data` (e-mail, nascimento completo) e ajustar as regras ✅ 2026-09-28: feito (`users/{uid}/private/data`)
- [x] 🔴 **Excluir conta**: a Play Store exige que o usuário possa apagar a conta e os dados dentro do app (e por um link na web). Implementar tela + Function que apaga perfil, posts, curtidas, tokens e o usuário do Auth ✅ 2026-09-28: botão no Perfil + Function `onUserDeleted`. Falta o **link na web** (pode ser um e-mail de contato na política de privacidade)
- [x] 🔴 **Denunciar/bloquear conteúdo**: mural e chat são conteúdo gerado por usuário, e a política da Play exige denúncia de posts/mensagens e bloqueio de usuários. Hoje não existe ✅ 2026-09-28: menu ⋮ no post e na conversa; denúncias vão para a coleção `reports` (ver no console); bloqueio esconde posts/conversas e impede mensagens nas regras
- [x] 🟡 Chat: um participante pode gravar qualquer valor em `names` e `unread` da conversa. Restringir nas regras (só o próprio nome; só incrementar o `unread` do outro ou zerar o próprio) ✅ 2026-09-28
- [x] 🟡 Regras de `slots`: não validam que a data no id do slot é a mesma do agendamento nem que cobrem exatamente o intervalo início→fim (só o primeiro bloco é conferido). Reforçar ou mover a criação para uma Function ✅ 2026-09-28: todos os blocos do intervalo são conferidos nas regras
- [x] 🟡 Post apagado deixa as curtidas órfãs em `posts/{id}/likes`. Criar Function `onDelete` para limpar ✅ 2026-09-28: `onPostDeleted`
- [x] 🟡 Limpeza periódica: agendamentos e `slots` de datas passadas se acumulam. Criar Function mensal ✅ 2026-09-28: `monthlyCleanup` (dia 1º, 04:00)
- [x] 🟡 Quem agenda recebe **duas** notificações (a pessoal + a do tópico geral). Excluir o organizador do broadcast ou tirar uma das duas ✅ 2026-09-28: aviso geral agora é só `data` com `excludeUid`; o app esconde de quem causou o evento (vale também para cancelamento e aniversário)
- [x] 🟡 Broadcast de todo agendamento para todo mundo pode virar spam. Criar opção nas configurações para silenciar ("só meus jogos e mensagens") ✅ 2026-09-28: chave "Avisos gerais da quadra" no Perfil
- [x] 🟡 Nome desatualizado: `ChatViewModel`/`MuralViewModel` guardam o perfil do momento em que abriram. Se o usuário editar o nome, as próximas mensagens/posts saem com o nome antigo até reabrir a tela ✅ 2026-09-28: o mural já usava o perfil atual; o chat passou a usar também
- [ ] 🟡 Mudança de nome não se propaga para posts, agendamentos e conversas antigos (que guardam `authorName`/`organizerName`). Aceitar isso ou criar uma Function que atualiza
- [ ] 🟡 **Firebase App Check** (Play Integrity) para bloquear chamadas que não vêm do app oficial
- [ ] 🟢 Limite de uso por usuário (ex.: máximo de agendamentos futuros por pessoa), para ninguém reservar a semana toda
- [ ] 🟢 O badge de mensagens conta conversas com não lidas, não o total de mensagens. Decidir qual se quer

## 4. Funcionalidades do app antigo que ainda não existem

- [ ] 🟡 **Foto no mural** ("Anexar foto da quadra"): precisa do Firebase Storage + regras + compressão da imagem
- [ ] 🟢 Foto de perfil real (hoje só há avatares emoji)
- [ ] 🟢 Login pelo **nome** (removido; hoje é só por e-mail). Dá pra voltar com uma Function que troca nome → e-mail, mas expõe quem está cadastrado
- [ ] 🟢 Login com **Instagram** (removido; o Firebase não suporta. Alternativas: Facebook Login ou deixar só Google)
- [ ] 🟢 Tela "Status da versão / verificar atualização" do app antigo. Com a Play Store, dá pra usar o *In-App Updates*

## 5. Publicação

- [ ] 🔴 Criar e **guardar em local seguro** a keystore de release (senha + arquivo `.jks`). Se perder, não dá mais pra publicar atualizações
- [ ] 🔴 **Política de privacidade** publicada em uma URL (obrigatória na Play Store; o app coleta nome, e-mail, data de nascimento e mensagens). Atender à **LGPD**: finalidade, retenção, como pedir exclusão
- [ ] 🔴 Formulário de **Segurança dos dados** (Data safety) no Play Console
- [ ] 🔴 Classificação de conteúdo (questionário do Play Console; o app tem chat entre usuários)
- [ ] 🟡 Conta de desenvolvedor Google Play (taxa única de US$ 25) e, se for conta pessoal nova, a exigência de **teste fechado com 12+ testadores por 14 dias** antes da produção
- [ ] 🟡 Ícone em alta resolução (512×512), banner (1024×500) e capturas de tela
- [ ] 🟡 Verificar se o domínio **quadramanaira.com.br** (usado no texto de compartilhamento) existe e é de vocês. Se não, trocar pelo link da Play Store
- [ ] 🟡 **O app antigo não atualiza para o novo**: o pacote mudou (`com.aistudio.quadramanaira.kpxz` → `br.com.quadramanaira`) e a assinatura também. Quem tem o APK antigo precisa desinstalar e instalar o novo. Os dados antigos eram só locais, então não há o que migrar
- [ ] 🟢 Definir quem administra o projeto Firebase e dar acesso a mais uma pessoa (não depender de uma conta só)

## 6. Qualidade de código (depois que funcionar)

- [ ] 🟢 Testes unitários (validações de agendamento, `DateUtils.slotsBetween`, validação de data de nascimento)
- [x] 🟢 Testes das regras com `@firebase/rules-unit-testing` ✅ 2026-09-28
- [ ] 🟢 Colocar o projeto no **git** (GitHub/GitLab); hoje está só numa pasta do OneDrive _(já existe repositório git local; falta criar o remoto no GitHub e dar push)_
- [ ] 🟢 CI (GitHub Actions) para compilar o app e rodar os testes a cada push
- [ ] 🟢 Firebase Crashlytics para ver erros dos usuários
- [ ] 🟢 Acessibilidade: `contentDescription` nos ícones restantes, contraste das cores no tema claro

## 7. Arrumação da pasta

- [ ] 🟢 `QUADRA_DE_MANAIRA.apk` e `codigo_extraido/` servem só de referência. Arquivar ou apagar quando o app novo estiver no ar
