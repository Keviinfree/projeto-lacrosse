# Portal Lacrosse Brasil – Projeto Final de Desenvolvimento de Interfaces (2/2026)

Aplicação web responsiva e acessível desenvolvida para difundir a história, as regras, os equipamentos e as posições táticas do **Lacrosse** no Brasil, integrando recursos modernos de UI/UX, acessibilidade digital (WCAG 2.1) e interatividade em JavaScript puro.

---

## Funcionalidades Implementadas

* **Barra de Acessibilidade Persistente:**
  * Alternância instantânea entre Modo Claro (Light Mode) e Modo Escuro (Dark Mode) com salvamento automático da preferência do usuário via localStorage.
  * Controle dinâmico de tamanho da tipografia (A-, A para restaurar, A+) ajustando o font-size raiz (rem) sem quebrar o layout.
* Design Responsivo (Mobile-First):
  * Adaptação fluida para dispositivos móveis, tablets e desktops utilizando CSS Flexbox, CSS Grid e Media Queries, incluindo menu hambúrguer colapsável em telas menores.
* Carrossel de Imagens Interativo:
  * Exibição de destaques visuais com controles de navegação manuais (anterior/próximo) e textos alternativos (alt) para leitores de tela.
* Abas de Pesquisa Dinâmicas ("Explore o Lacrosse"):
  * Navegação segmentada em abas (História, Regras Básicas e Equipamentos) com atributos ARIA e troca de conteúdo sem recarregamento da página.
* Cartões Explicativos (Cards):
  * Grade responsiva detalhando as posições táticas em campo (*Atacantes*, *Meio-Campistas* e *Defensores*) com efeitos suaves de elevação (`hover`).
* Formulário de Contato e Página de Login (login.html):
  * Formulário para agendamento de treinos experimentais com validação de campos obrigatórios e feedback visual acessível (role="alert"), acompanhado de uma página dedicada à Área do Atleta.

---

## Estrutura de Diretórios do Projeto

text
projeto-lacrosse/
│
├── index.html          # Página principal (carrossel, abas, cartões, contato e rodapé)
├── login.html          # Página de autenticação (Área do Atleta)
├── README.md           # Documentação técnica do projeto
│
├── css/
│   └── style.css       # Folha de estilos, variáveis de tema (:root) e responsividade
│
└── js/
    └── script.js       # Lógica de acessibilidade, carrossel, abas, menu e validação