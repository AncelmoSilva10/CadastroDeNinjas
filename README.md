# 🥷 Ninja Mission Control

Sistema de gerenciamento de missões ninja, desenvolvido para integrar um frontend dinâmico a uma API REST robusta. Este projeto demonstra o fluxo completo de uma aplicação web, desde a captura de dados no formulário até a persistência no backend.

## 💻 Sobre o Projeto

O **Ninja Mission Control** permite que usuários cadastrem missões especificando o nome e o Rank (dificuldade). O projeto foi construído focando na comunicação entre sistemas e na criação de uma interface personalizada.

---

## 🛠️ Tecnologias e Ferramentas

### **Backend**
* **Java 17+**: Linguagem principal.
* **Spring Boot**: Framework para construção da API REST.
* **Maven**: Gerenciador de dependências.

### **Frontend**
* **HTML5 & JavaScript (ES6+)**: Lógica de captura de eventos e consumo de API via `fetch`.
* **CSS3**: Estilização manual (feita "na raça") com temática Dark Mode e animações de digitação (typewriter).

---

## 🚀 Desafios Técnicos Implementados

1.  **Arquitetura Full Stack**: Integração real entre um cliente (Browser) e um servidor (Spring Boot).
2.  **Consumo de API**: Implementação de requisições assíncronas utilizando `fetch` com tratamento de promessas (`then/catch`).
3.  **Tratamento de CORS**: Configuração no Spring Boot para permitir chamadas de origens diferentes, solucionando bloqueios de segurança do navegador.
4.  **UX/UI Customizada**: Design responsivo e temático desenvolvido sem o uso de frameworks CSS externos, focando no domínio de seletores e posicionamento (Flexbox).
5.  **Prevenção de Comportamento Padrão**: Uso de `event.preventDefault()` para garantir que o envio dos dados ocorra via JavaScript sem recarregar a página.

---

## 🔌 API Endpoints

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `POST` | `/missoes/criar` | Cadastra uma nova missão enviando um objeto JSON. |

### Exemplo de JSON (Payload)
```json
{
  "nome": "Escoltar o Time 7",
  "dificuldade": "Rank A"
}
