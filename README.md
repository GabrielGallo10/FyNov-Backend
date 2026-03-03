# Documentação das Classes Java - FyNov Fintech

Documentação das classes do sistema de gestão financeira pessoal FyNov, descrevendo atributos (características) e métodos (comportamentos) de cada classe.

---

## Índice

1. [Estrutura de pastas](#estrutura-de-pastas)
2. [Visão geral](#visão-geral)
3. [Classe Login](#1-classe-login)
4. [Classe Usuario](#2-classe-usuario)
5. [Classe Recebimento](#3-classe-recebimento)
6. [Classe Gasto](#4-classe-gasto)
7. [Classe Meta](#5-classe-meta)
8. [Diagrama de relacionamento](#diagrama-de-relacionamento)

---

## Estrutura de pastas

```
ClassesJavas/
├── .gitignore
├── README.md
├── src/
│   ├── main/
│   │   └── java/
│   │       └── br/com/fynov/
│   │           ├── Main.java              ← ponto de entrada (main)
│   │           ├── auth/
│   │           │   └── Login.java
│   │           └── model/
│   │               ├── Usuario.java
│   │               ├── Recebimento.java
│   │               ├── Gasto.java
│   │               └── Meta.java
│   └── test/
│       └── java/
│           └── br/com/fynov/              ← para testes futuros
└── .idea/                                 ← configuração IntelliJ
```

- **`br.com.fynov`**: pacote raiz; contém `Main` e subpacotes.
- **`br.com.fynov.auth`**: autenticação (Login).
- **`br.com.fynov.model`**: entidades de domínio (Usuario, Recebimento, Gasto, Meta).

---

## Visão geral

O sistema FyNov é composto por cinco classes principais:

| Classe       | Responsabilidade                    |
|-------------|--------------------------------------|
| **Login**   | Autenticação do usuário no sistema   |
| **Usuario** | Dados e perfil do usuário            |
| **Recebimento** | Registro de entradas financeiras |
| **Gasto**   | Registro de saídas financeiras       |
| **Meta**    | Metas financeiras e acompanhamento  |

---

## 1. Classe Login

**Objetivo:** Representar a autenticação do usuário no sistema (credenciais de acesso).

### Atributos

| Atributo   | Tipo   | Descrição                          |
|-----------|--------|------------------------------------|
| `username`| String | Nome de usuário ou e-mail para login |
| `password`| String | Senha de acesso                    |

### Métodos

| Método        | Retorno | Descrição                                    |
|---------------|---------|----------------------------------------------|
| Construtor padrão `Login()` | - | Inicializa o objeto sem parâmetros          |
| Construtor `Login(String username, String password)` | - | Inicializa com usuário e senha              |
| `doLogin()`   | void    | Executa a lógica de autenticação (login)     |

### Exemplo de uso

```java
Login login = new Login("joao@email.com", "senha123");
login.doLogin();
```

---

## 2. Classe Usuario

**Objetivo:** Representar o usuário do sistema e suas informações de perfil.

### Atributos

| Atributo | Tipo   | Descrição                |
|----------|--------|--------------------------|
| `id`     | Long   | Identificador único      |
| `nome`   | String | Nome completo            |
| `email`  | String | E-mail (login)           |
| `senha`  | String | Senha (armazenamento)    |

### Métodos

| Método | Retorno | Descrição |
|--------|---------|-----------|
| Construtor padrão `Usuario()` | - | Inicializa sem parâmetros |
| Construtor com parâmetros | - | Inicializa com id, nome, email, senha |
| Getters e Setters | conforme tipo | Acesso e alteração dos atributos |
| `exibirPerfil()` | void | Exibe os dados do perfil do usuário |

### Exemplo de uso

```java
Usuario usuario = new Usuario(1L, "João Silva", "joao@email.com", "senha123");
usuario.exibirPerfil();
```

---

## 3. Classe Recebimento

**Objetivo:** Representar uma entrada financeira (salário, freelance, etc.).

### Atributos

| Atributo     | Tipo    | Descrição                    |
|-------------|---------|------------------------------|
| `id`        | Long    | Identificador único          |
| `data`      | String  | Data do recebimento (YYYY-MM-DD) |
| `descricao` | String  | Descrição do recebimento     |
| `valor`     | Double  | Valor em reais               |
| `categoria` | String  | Categoria (ex: Trabalho, Extra) |

### Métodos

| Método | Retorno | Descrição |
|--------|---------|-----------|
| Construtor padrão `Recebimento()` | - | Inicializa sem parâmetros |
| Construtor com parâmetros | - | Inicializa todos os atributos |
| Getters e Setters | conforme tipo | Acesso e alteração dos atributos |
| `registrarRecebimento()` | void | Registra um novo recebimento |
| `listarRecebimentos()` | void | Lista os recebimentos cadastrados |

### Exemplo de uso

```java
Recebimento rec = new Recebimento(1L, "2024-02-13", "Salário", 5000.00, "Trabalho");
rec.registrarRecebimento();
```

---

## 4. Classe Gasto

**Objetivo:** Representar uma saída financeira (conta, compra, etc.).

### Atributos

| Atributo     | Tipo    | Descrição                    |
|-------------|---------|------------------------------|
| `id`        | Long    | Identificador único          |
| `data`      | String  | Data do gasto (YYYY-MM-DD)   |
| `descricao` | String  | Descrição do gasto           |
| `valor`     | Double  | Valor em reais               |
| `categoria` | String  | Categoria (ex: Alimentação, Transporte) |

### Métodos

| Método | Retorno | Descrição |
|--------|---------|-----------|
| Construtor padrão `Gasto()` | - | Inicializa sem parâmetros |
| Construtor com parâmetros | - | Inicializa todos os atributos |
| Getters e Setters | conforme tipo | Acesso e alteração dos atributos |
| `registrarGasto()` | void | Registra um novo gasto |
| `listarGastos()` | void | Lista os gastos cadastrados |

### Exemplo de uso

```java
Gasto gasto = new Gasto(1L, "2024-02-14", "Supermercado", 350.00, "Alimentação");
gasto.registrarGasto();
```

---

## 5. Classe Meta

**Objetivo:** Representar uma meta financeira (ex.: viagem, reserva de emergência).

### Atributos

| Atributo      | Tipo    | Descrição                        |
|---------------|---------|----------------------------------|
| `id`          | Long    | Identificador único              |
| `titulo`      | String  | Nome da meta                     |
| `valorAlvo`   | Double  | Valor que se deseja atingir (R$)  |
| `valorAtual`  | Double  | Valor já guardado (R$)           |
| `prazo`       | String  | Data limite (YYYY-MM-DD)         |

### Métodos

| Método | Retorno | Descrição |
|--------|---------|-----------|
| Construtor padrão `Meta()` | - | Inicializa sem parâmetros |
| Construtor com parâmetros | - | Inicializa todos os atributos |
| Getters e Setters | conforme tipo | Acesso e alteração dos atributos |
| `criarMeta()` | void | Cria uma nova meta financeira |
| `atualizarProgresso()` | void | Atualiza o valor já guardado em direção à meta |
| `verificarProgresso()` | void | Verifica o progresso (quanto falta, percentual) |

### Exemplo de uso

```java
Meta meta = new Meta(1L, "Viagem", 10000.00, 2500.00, "2024-12-31");
meta.criarMeta();
meta.verificarProgresso();
```

---

## Diagrama de relacionamento

```
┌─────────────┐
│    Login    │  ← Credenciais de acesso
└──────┬──────┘
       │
       ▼
┌─────────────┐     ┌──────────────┐     ┌──────────────┐
│   Usuario   │────▶│ Recebimento  │     │    Gasto     │
└──────┬──────┘     └──────────────┘     └──────────────┘
       │
       ▼
┌─────────────┐
│    Meta     │  ← Metas financeiras do usuário
└─────────────┘
```

- **Login** usa credenciais que identificam um **Usuario**.
- **Usuario** pode ter vários **Recebimentos**, **Gastos** e **Metas**.

---

## Observações para implementação

1. **Tipos de dados:** Use `Long` para IDs, `Double` para valores monetários e `String` para datas no formato `YYYY-MM-DD` (ou `LocalDate` se preferir).
2. **Métodos:** Conforme o enunciado da atividade, os métodos podem conter apenas `System.out.println("...")` indicando qual método está sendo executado.
3. **Construtores:** Implemente construtor padrão (vazio) e construtor com parâmetros para cada classe.
4. **Encapsulamento:** Atributos `private` e acesso via getters e setters.

---

*Documentação do projeto FyNov - FIAP. Última atualização: março/2025.*
