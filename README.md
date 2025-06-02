---

# 🧼 Clean House - Plataforma de Serviços

![Badge Status](https://img.shields.io/badge/status-prototipo-blue)  
![Badge Projeto](https://img.shields.io/badge/projeto-integrador-success)  
![Badge Ano](https://img.shields.io/badge/ano-2025-lightgrey)

---

## 👥 Equipe

- Bruna Andrade Alves  
- Giovana Beatriz Ferreira  
- Gustavo Kazuyuki Matsunaka  
- Kayque Dias Moreno  
- Nelson Gilberto  
- Pedro José Sieiro Marques  

---

## 📌 Sobre o Projeto

O **Clean House** é um projeto integrador do curso de Engenharia de Software da UNIFIO (Centro Universitário de Ourinhos). A plataforma simula a **contratação de serviços domésticos**, conectando clientes a empregadas domésticas com foco em usabilidade, validação de dados e experiência do usuário.

---

## 🏠 Tela Inicial (Home)

### ✍️ Campos do Formulário

- **Nota**: A tela inicial (`CleanHouseSwing`) não possui formulários diretos, mas os botões "Cadastre-se" e "Entre" levam a telas de cadastro (não implementadas no código atual). Campos inferidos com base no banco de dados:
  - **Empregadas**:
    - 📧 Email
    - 👤 Nome completo
    - 📱 Telefone com DDD
    - 🆔 CPF
    - 📍 Endereço (rua, número, complemento, bairro, cidade, estado, CEP)
    - 📅 Data de nascimento
    - 🖼️ Foto de perfil
    - 📝 Descrição
    - 💼 Serviços oferecidos (com preço por hora)
    - 📄 Documentos (RG, CPF, comprovante de residência, atestado de antecedentes)
  - **Clientes**:
    - 📧 Email
    - 👤 Nome completo
    - 📱 Telefone com DDD
    - 🆔 CPF
    - 📍 Endereço (rua, número, complemento, bairro, cidade, estado, CEP)

### ✅ Campos Obrigatórios

- **Empregadas**:
  - Nome
  - CPF
  - Email
  - Tipo de documento
  - URL do documento
- **Clientes**:
  - Nome
  - CPF
  - Email

### 🛠 Regras de Validação

- **CPF**: Formato `123.456.789-00`, validado por regex e algoritmo de dígitos verificadores.
- **Email**: Formato válido (ex.: `nome@dominio.com`), verificado via regex.
- **Telefone**: Formato `(DD) 9XXXX-XXXX`, com 11 dígitos.
- **Data de Nascimento**: Idade mínima de 18 anos para empregadas.
- **Documentos**: URLs devem apontar para arquivos válidos (ex.: PDF, imagens). Status (`pendente`, `aprovado`, `rejeitado`) atualizado por administradores.
- **Nota**: Validações aplicáveis em telas de cadastro acessadas via "Cadastre-se" ou "Entre".

### 🧑‍🔧 Listagem

- **Seção "Profissionais"**:
  - Colunas exibidas:
    | Profissional | Especialidade | Foto |
    |--------------|---------------|------|
    | Devon Silva  | Manutenção    | 📷   |
    | Emma Fisher  | Limpeza de Casa | 📷 |
    | Eva Edwards  | Limpeza Comercial | 📷 |
    | Edward Cooper | Cortador de Grama | 📷 |
  - **Nota**: Dados estáticos no código atual; futura integração com tabela `Empregadas` e `Empregadas_Servicos`.
- **Seção "Clientes"**:
  - Colunas exibidas:
    | Cliente | Depoimento | Avaliação |
    |---------|------------|-----------|
    | Courtney Henry | Aliquam et magna sit amet. | ⭐⭐⭐⭐⭐ |
    | Darrell Steward | Aliquam et magna sit amet. | ⭐⭐⭐⭐⭐ |
    | Jerome Bell | Aliquam et magna sit amet. | ⭐⭐⭐⭐⭐ |
  - **Nota**: Depoimentos estáticos; futura integração com tabela `Avaliacoes`.

### 🔍 Campo de Busca

- **Nota**: Não implementado na tela inicial, mas o botão "Serviços" sugere acesso a uma tela com busca.
- Placeholder sugerido: `"Pesquise por serviços ou localização"`.
- Filtros futuros:
  - 🏷️ Tipo de serviço (ex.: limpeza, cuidado infantil)
  - 📍 Localidade (cidade, estado)
  - 🔑 Palavra-chave (ex.: nome da empregada)

### ✏️ Campos Editáveis

- **Empregadas** (em tela de perfil, acessada via "Entre"):
  - Nome, email, telefone, endereço, foto de perfil, descrição, serviços oferecidos, preço por hora, disponibilidade.
- **Clientes**:
  - Nome, email, telefone, endereço.
- **Restrição**: CPF não editável (único e fixo).

### 🛠 Comportamento Esperado (Edição)

1. Clicar em "Entre" na barra de navegação.
2. Após login, redirecionamento para tela de perfil (não implementada).
3. Editar campos (nome, email, etc.), validar dados e salvar no banco (`Empregadas`, `Clientes`, `Enderecos`).
4. Exibir mensagem de sucesso e atualizar `ultima_atualizacao` no banco.
5. Redirecionar para dashboard ou perfil.

### ❌ Ação de Cancelar/Exclusão

- **Cancelamento**: Retorna à tela inicial ou de login.
- **Exclusão**:
  1. Acessar tela de perfil via "Entre".
  2. Clicar em "Excluir Conta" (não implementado).
  3. Confirmar exclusão.
  4. Remover registros de `Empregadas` ou `Clientes`, respeitando `ON DELETE CASCADE`/`RESTRICT`.
  5. Deslogar e redirecionar para a tela inicial.

---

## 🧑‍🔧 Tela de Lista de Empregadas

### ✍️ Campos do Formulário

- **Nota**: A tela (`CleanHouseEmployeesSwing`) é de exibição, mas o botão "Cadastre-se" leva a uma tela de cadastro com os mesmos campos da Tela Inicial.
- Adicional para empregadas:
  - 📅 Disponibilidade (dia da semana, hora de início, hora de fim)
  - 💼 Experiência por serviço (em anos)

### ✅ Campos Obrigatórios

- Mesmos da Tela Inicial.
- Para `Disponibilidades`:
  - Dia da semana
  - Hora de início
  - Hora de fim
- Para `Empregadas_Servicos`:
  - Serviço
  - Preço por hora (ou "Negociável")

### 🛠 Regras de Validação

- Mesmas validações da Tela Inicial.
- **Disponibilidade**:
  - Horários válidos (00:00–23:59).
  - `hora_fim` posterior a `hora_inicio`.
  - Sem sobreposição de horários no mesmo dia.
- **Preço por Hora**: Decimal positivo ou "Negociável" (NULL no banco).
- **Experiência**: Inteiro não negativo.

### 🧑‍🔧 Listagem

- Colunas exibidas:
  | Profissional | Preço | Experiência | Disponibilidade | Dias | Foto |
  |--------------|-------|-------------|-----------------|------|------|
  | Barbara (30) | Negociável | 4 meses | Não | SE, TE, QA, SE, DO | 📷 |
  | Eder (42)    | Negociável | 3 anos  | Não | SE, TE, QA, SE, DO | 📷 |
  | ... (outros) | ...       | ...         | ... | ... | 📷 |
- **Nota**: Dados estáticos; futura integração com `Empregadas`, `Empregadas_Servicos`, `Disponibilidades`. Campo "Disponível não" deve refletir `Disponibilidades`.

### 🔍 Campo de Busca

- Placeholder: `"Pesquise aqui"`.
- Botão: "Procurar agora".
- Filtros futuros:
  - 🏷️ Tipo de serviço
  - 📍 Localidade
  - 💰 Faixa de preço
  - 📅 Disponibilidade

### ✏️ Campos Editáveis

- Mesmos da Tela Inicial (em tela de perfil).
- Adicional: Disponibilidade (editar dias e horários) e experiência por serviço.

### 🛠 Comportamento Esperado (Edição)

1. Clicar em "Entre" e acessar tela de perfil.
2. Editar campos (nome, email, disponibilidade, etc.), validar e salvar.
3. Exibir mensagem de sucesso e atualizar `ultima_atualizacao`.
4. Retornar ao perfil ou dashboard.

### ❌ Ação de Cancelar/Exclusão

- **Cancelamento**: Retorna à tela inicial ou login.
- **Exclusão**:
  1. Acessar perfil via "Entre".
  2. Clicar em "Excluir Conta".
  3. Confirmar exclusão.
  4. Remover registros de `Empregadas`, `Disponibilidades`, etc., respeitando regras do banco.
  5. Deslogar e redirecionar para a tela inicial.

---

## 🚀 Futuras Funcionalidades

- 🛡️ Login com autenticação segura.
- 💬 Chat entre cliente e empregada (`Mensagens`).
- 📅 Agenda com horários disponíveis (`Disponibilidades`).
- ⭐ Sistema de avaliações bidirecionais (`Avaliacoes`).
- 🛠️ Painel administrativo para validação de documentos.
- 💸 Integração de pagamentos (`Pagamentos`).
- 🔔 Notificações para eventos (ex.: nova contratação, mensagem).

---

## 📫 Contato

Dúvidas ou sugestões? Entre em contato com a equipe ou envie um e-mail para: **cleanhouse@unifio.edu.br**

---

### Notas Técnicas
- **Integração com Banco**: As telas devem consultar o banco de dados (tabelas `Empregadas`, `Clientes`, `Disponibilidades`, etc.) para exibir dados dinâmicos.
- **Problemas Atuais**:
  - Imagens (ex.: `barbara.jpg`) requerem caminhos válidos.
  - Disponibilidade ("Não") e checkboxes (SE, TE, etc.) devem usar `Disponibilidades`.
- **Execução**:
  ```bash
  javac CleanHouseSwing.java
  java CleanHouseSwing
  javac CleanHouseEmployeesSwing.java
  java CleanHouseEmployeesSwing
  ```

---
