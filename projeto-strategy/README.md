# 💳 Sistema de Pagamentos - Padrão de Projeto Strategy (Java Puro)

Este projeto demonstra a aplicação do **Padrão de Projeto Strategy** em Java puro, simulando um sistema de pagamentos com múltiplas formas (Cartão de Crédito, PayPal e PIX).

## 📌 Objetivo
Mostrar como o padrão **Strategy** permite trocar o algoritmo de execução (forma de pagamento) em tempo de execução **sem modificar o código principal**.

## 🛠️ Tecnologias Utilizadas
- Java 17+ (funciona também em versões anteriores como Java 8)
- Nenhuma dependência externa

## 📂 Estrutura do Projeto
```
src/
 ├── strategy/
 │    ├── PaymentStrategy.java
 │    ├── CreditCardPayment.java
 │    ├── PayPalPayment.java
 │    └── PixPayment.java
 ├── context/
 │    └── PaymentService.java
 └── Main.java
```

## 📖 Explicação do Padrão Strategy
O **Strategy** é um padrão de projeto comportamental que permite definir uma **família de algoritmos** e torná-los intercambiáveis.

No exemplo deste projeto:
- **PaymentStrategy** → Interface que define o método `pay`.
- **CreditCardPayment**, **PayPalPayment**, **PixPayment** → Implementações concretas da interface.
- **PaymentService** → Classe de contexto que usa o Strategy definido em tempo de execução.

## ▶️ Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/sistema-pagamentos-strategy.git
   ```
2. Compile o código:
   ```bash
   javac -d bin src/**/*.java
   ```
3. Execute:
   ```bash
   java -cp bin Main
   ```

## 💡 Saída Esperada
```
Pagamento de R$250.0 realizado com cartão de crédito: 1234-5678-9876-5432
Pagamento de R$100.0 realizado via PayPal: usuario@email.com
Pagamento de R$50.0 realizado via PIX: chave-pix-aleatoria
```

## 📚 Referências
- [Padrões de Projeto - Refactoring Guru](https://refactoring.guru/pt-br/design-patterns/strategy)
- [GitHub com Padrões de Projeto usando Java Puro](https://github.com/iluwatar/java-design-patterns)
