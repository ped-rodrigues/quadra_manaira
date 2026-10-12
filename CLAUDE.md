# Quadra de Manaíra

## Visão geral do código

Apps nativos da Quadra de Manaíra (quadra pública na orla de João Pessoa, PB): agenda em blocos de 30 min,
mural, conversas, alertas/push, perfil, clima e localização. Android e iOS se espelham arquivo por arquivo
e usam o mesmo backend Firebase.

**Stack**: Android em Kotlin + Jetpack Compose (AGP 9, Firebase BOM 35); iOS em SwiftUI (iOS 17, XcodeGen,
Firebase iOS 13); Firebase Auth, Firestore (regras testadas no emulador), Cloud Functions em TypeScript (Node 22) e FCM.

**Estrutura**: `quadra-manaira-app/android`, `quadra-manaira-app/ios`, `quadra-manaira-app/firebase`.
`apk org/` e `codigo_extraido/` são só referência do APK original (não mexer).

Arquitetura detalhada: [quadra-manaira-app/docs/CODEBASE_MAP.md](quadra-manaira-app/docs/CODEBASE_MAP.md).
Como rodar e configurar: [quadra-manaira-app/LEIAME.md](quadra-manaira-app/LEIAME.md).

## Combinados

- Registrar o que foi feito em `NOTAS.md` (histórico no fim) e o que falta em `PENDENCIAS.md`. No terminal, respostas curtas.
- Textos, comentários e commits em português.
- Mudou o `Repo` ou um campo do Firestore num app? Mude no outro e nas regras, e rode os testes das regras.
