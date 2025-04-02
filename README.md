# 🗑️ Coleta Seletiva - Sistema de Gerenciamento de Rotas

Este projeto é uma aplicação Java com Spring Boot desenvolvida como exercício prático para gerenciamento de **rotas de coleta seletiva**, **coletores** e seus **contratos** de atuação.

---

## 📚 Sumário

-   [🚀 Tecnologias utilizadas](#-tecnologias-utilizadas)
-   [📦 Como rodar o projeto](#-como-rodar-o-projeto)
-   [📌 Funcionalidades](#-funcionalidades)
-   [📬 Endpoints da API](#-endpoints-da-api)
-   [🧪 Testes com Insomnia](#-testes-com-insomnia)
-   [🧠 Regras de Negócio](#-regras-de-negócio)
-   [👩🏻‍💻 Desenvolvido por](#-desenvolvido-por)

---

## 🚀 Tecnologias utilizadas

-   Java 17
-   Spring Boot
-   Maven
-   REST API
-   Insomnia (para testes)

---

## 📦 Como rodar o projeto

1. Faça o clone do repositório:

    ```bash
    git clone https://github.com/seu-usuario/coleta-seletiva.git
    ```

2. Importe o projeto no seu **VSCode** ou **IntelliJ IDEA**

3. Execute a aplicação:

    - Vá até o arquivo `ColetaSeletivaApplication.java`
    - Clique com o botão direito e selecione **Run** (ou rode com o atalho "./mvnw spring-boot:run")

4. A API estará disponível em:
    ```
    http://localhost:8080
    ```

---

## 📌 Funcionalidades

-   Cadastro e listagem de **Coletores**
-   Cadastro e listagem de **Rotas**
-   Cadastro e listagem de **Contratos** entre coletores e rotas

---

## 📬 Endpoints da API

| Método | Endpoint                 | Descrição                             |
| ------ | ------------------------ | ------------------------------------- |
| POST   | `/coletores`             | Cadastrar novo coletor                |
| GET    | `/coletores`             | Listar todos os coletores             |
| POST   | `/rotas`                 | Cadastrar nova rota                   |
| GET    | `/rotas`                 | Listar todas as rotas                 |
| POST   | `/contratos/{coletorId}` | Criar contrato com uma lista de rotas |
| GET    | `/contratos`             | Listar todos os contratos             |

---

## 🧪 Testes com Insomnia

## Você pode importar o arquivo `.yaml` de requests Insomnia no app para testar todos os endpoints.

## 🧠 Regras de Negócio

-   Os IDs de `Coletor`, `Rota` e `Contrato` são **gerados automaticamente** por meio de um contador estático.
-   Não é possível criar um contrato com **coletores ou rotas inexistentes**.
-   Os dados são armazenados em listas estáticas (em memória) para fins didáticos.

---

## 👩🏻‍💻 Desenvolvido por: 

**Andressa Costa **  
Exercício desenvolvido como parte do curso Futuro DEV Joinville - Turma V1.  
📅 Abril/2025
