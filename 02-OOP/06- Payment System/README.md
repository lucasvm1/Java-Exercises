# Sistema de Pagamentos em Java / Payment System in Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este projeto implementa um sistema de pagamentos utilizando interfaces e polimorfismo em Java. Ele permite simular pagamentos utilizando diferentes métodos, como cartão de crédito, boleto e Pix, aplicando taxas específicas para cada tipo.

### Classes Implementadas
1. **Pagamento (Interface)**
   - **Métodos**: pagar(double valor) - Calcula o valor final do pagamento aplicando a taxa correspondente

2. **CartaoCredito**
   - Implementa a interface Pagamento
   - **Atributos**: taxa (double)
   - **Métodos**: pagar(double valor) - Retorna o valor total a ser pago considerando a taxa

3. **Boleto**
   - Implementa a interface Pagamento
   - **Atributos**: taxa (double)
   - **Métodos**: pagar(double valor) - Retorna o valor total a ser pago considerando a taxa

4. **Pix**
   - Implementa a interface Pagamento
   - **Atributos**: taxa (double)
   - **Métodos**: pagar(double valor) - Retorna o valor total a ser pago considerando a taxa

5. **Main**
   - Classe principal que testa o sistema de pagamentos

### Funcionamento
1. O programa cria três métodos de pagamento diferentes (CartaoCredito, Pix e Boleto) com taxas específicas para cada um.
2. Calcula o valor final para um pagamento de 100 utilizando cada um dos métodos.
3. Exibe os valores finais calculados para cada método de pagamento.
4. Demonstra o uso de interfaces, polimorfismo e métodos de cálculo de pagamento para criar um sistema flexível e extensível.

---

<a id="english"></a>
## English

### Description
This project implements a payment system using interfaces and polymorphism in Java. It allows simulating payments using different methods, such as credit card, bank slip (boleto), and Pix, applying specific fees for each type.

### Implemented Classes
1. **Pagamento (Payment - Interface)**
   - **Methods**: pay(double amount) - Calculates the final payment amount by applying the corresponding fee

2. **CartaoCredito (CreditCard)**
   - Implements the Payment interface
   - **Attributes**: fee (double)
   - **Methods**: pay(double amount) - Returns the total amount to be paid considering the fee

3. **Boleto (BankSlip)**
   - Implements the Payment interface
   - **Attributes**: fee (double)
   - **Methods**: pay(double amount) - Returns the total amount to be paid considering the fee

4. **Pix**
   - Implements the Payment interface
   - **Attributes**: fee (double)
   - **Methods**: pay(double amount) - Returns the total amount to be paid considering the fee

5. **Main**
   - Main class that tests the payment system

### How it works
1. The program creates three different payment methods (CreditCard, Pix, and BankSlip) with specific fees for each one.
2. Calculates the final amount for a payment of 100 using each of the methods.
3. Displays the final calculated amounts for each payment method.
4. Demonstrates the use of interfaces, polymorphism, and payment calculation methods to create a flexible and extensible system.
