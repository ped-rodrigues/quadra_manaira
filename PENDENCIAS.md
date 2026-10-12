# Quadra de Manaíra: o que falta fazer

_Criado em: 2026-09-22 · Atualizado em: 2026-10-12 (e-mail confirmado obrigatório; iOS no CI) · Código em `quadra-manaira-app/` · Contexto e histórico em `NOTAS.md`_

Legenda de prioridade: 🔴 bloqueia o lançamento · 🟡 importante · 🟢 melhoria

---

## 0. Agora (sessão de 2026-10-11)

- [x] Build do iOS no GitHub Actions ✅ 2026-10-12 (compila; ver seção 2 para o teste no simulador)
- [x] Exigir e-mail confirmado ✅ 2026-10-12
- [x] PR aberto: https://github.com/ped-rodrigues/quadra_manaira/pull/1 ✅ 2026-10-12, merge feito no `main`

## 1. Configuração do Firebase

- [x] Projeto `quadra-de-manaira` criado (plano gratuito Spark, sem Analytics e sem Gemini) ✅ 2026-10-12
- [x] App Android registrado e `google-services.json` no lugar ✅ 2026-10-12
- [x] App iOS registrado e `GoogleService-Info.plist` no lugar ✅ 2026-10-12
- [x] Authentication: e-mail/senha e Google ativos ✅ 2026-10-12
- [x] Firestore em modo produção, `southamerica-east1` ✅ 2026-10-12
- [ ] 🔴 Cadastrar as **SHA-1** de release e do Play App Signing (a de debug deste PC já está); sem elas o login com Google falha na versão da loja
- [ ] 🔴 Enviar a **chave APNs** (.p8) em *Cloud Messaging*; sem ela o iOS não recebe push
- [x] Regras e índices publicados (`firebase deploy --only firestore`) ✅ 2026-10-12
- [ ] 🟡 Plano **Blaze** + `firebase deploy --only functions`. **Decisão: ficar no gratuito por enquanto**, então não há push, lembrete de 24 h, aniversário nem limpeza automática; a exclusão de conta apaga o login, mas os dados no Firestore ficam
- [ ] 🟡 **Alerta de orçamento** no Google Cloud (ex.: R$ 10)
- [x] Política de senha exigida: 8+ caracteres, minúscula e número (os apps conferem a mesma regra) ✅ 2026-10-12
- [x] E-mails do Auth em português ✅ 2026-10-12

## 2. Testes que faltam

- [x] Android compila (debug e release com R8), lint sem erros, 5 testes unitários ✅ 2026-10-11
- [x] Regras do Firestore: 8 cenários (~40 verificações) no emulador ✅ 2026-10-11
- [x] Android de ponta a ponta no emulador contra o Firebase Emulator: cadastro, login, agendar, cancelar, mural, curtir, conversa com não lidas, localização ✅ 2026-10-11
- [x] Release sem configuração abre a tela "Firebase não configurado" (falha fechada) ✅ 2026-10-11
- [x] iOS compila (debug e release) e os testes passam no simulador do GitHub Actions ✅ 2026-10-12
- [ ] 🔴 iOS: testar as telas num Mac/iPhone de verdade (ninguém viu o app iOS rodando ainda)
- [ ] 🔴 Com o Firebase real, **dois celulares** (um Android e um iPhone):
  - [ ] Conflito: os dois tentam o mesmo horário ao mesmo tempo; só um consegue
  - [ ] Push com o app fechado e aberto, nos dois sistemas
  - [ ] Login com Google (Android), "esqueci minha senha" e o link de confirmação (o e-mail chega? cai no spam?)
  - [ ] Lembrete de 24 h e aniversário (rodar as Functions manualmente)
  - [ ] Excluir conta (a Function `onUserDeleted` apaga tudo?)
  - [ ] Modo avião, tema escuro, fonte grande do sistema

## 3. Problemas conhecidos

- [ ] 🟡 Mudança de nome não se propaga para posts, jogos e conversas antigos
- [ ] 🟡 **Firebase App Check** (Play Integrity / App Attest) para bloquear chamadas fora dos apps oficiais
- [ ] 🟢 Limite de jogos futuros por pessoa (ninguém reservar a semana toda)
- [ ] 🟢 iOS libera HTTP para a rede local também no release (`NSAllowsLocalNetworking`, achado BAIXO); o app não faz chamadas locais no release
- [ ] 🟢 A abertura a frio leva alguns segundos até a agenda aparecer (primeira conexão do Firestore)

## 4. Funcionalidades que ainda não existem

- [ ] 🟡 **Foto no mural** (Firebase Storage + regras + compressão)
- [ ] 🟢 Foto de perfil real (hoje são avatares emoji)
- [ ] 🟢 "Entrar com a Apple" no iOS (necessário se um dia houver login com Google lá)
- [ ] 🟢 Login com Instagram (o Firebase não suporta)

## 5. Publicação

- [ ] 🔴 Keystore de release do Android **guardada em local seguro**
- [ ] 🔴 Conta Apple Developer (US$ 99/ano), certificados e perfil de distribuição; App Store Connect
- [ ] 🔴 **Política de privacidade** numa URL (LGPD; obrigatória nas duas lojas) + link de exclusão de conta na web
- [ ] 🔴 Play Console: Segurança dos dados, classificação de conteúdo, teste fechado (12+ testadores por 14 dias se a conta for pessoal nova)
- [ ] 🔴 App Store: rótulos de privacidade, classificação (chat entre usuários → moderação e denúncia já existem)
- [ ] 🟡 Capturas de tela das duas lojas (ícone já existe em vetor e em 1024 px)
- [ ] 🟡 Conferir se **quadramanaira.com.br** existe e é de vocês (usado no texto de compartilhar)
- [ ] 🟡 Quem tem o APK antigo (`com.aistudio.quadramanaira.kpxz`) precisa desinstalar e instalar o novo

## 6. Qualidade

- [x] Testes unitários das regras da quadra (Android e iOS) ✅ 2026-10-11
- [x] Git com remoto no GitHub ✅ (branch `app-nativo`)
- [ ] 🟢 CI para o Android e para os testes das regras (hoje só o iOS tem workflow)
- [ ] 🟢 Crashlytics
- [ ] 🟢 Tirar os overrides de segurança (`@grpc/grpc-js`, Jackson) quando o Firebase atualizar

## 7. Arrumação

- [ ] 🟢 `apk org/` e `codigo_extraido/` servem só de referência. O repositório é **público** e eles estão no `main`: avaliar tirar
