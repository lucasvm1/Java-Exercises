# Sistema Bancário em Java / Banking System in Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este programa simula um sistema bancário simples utilizando Programação Orientada a Objetos (POO) em Java. Ele permite criar contas bancárias, realizar operações básicas como depósitos e saques, e armazenar contas em um banco que permite buscar uma conta pelo número.

### Classes Implementadas
1. **ContaBancaria**
   - **Atributos**: numeroConta (int), titular (String), saldo (double)
   - **Métodos**: depositar(double valor), sacar(double valor), exibirSaldo(), toString()

2. **Banco**
   - **Atributos**: nome (String), contas (ArrayList<ContaBancaria>)
   - **Métodos**: adicionarConta(ContaBancaria conta), removerConta(ContaBancaria conta), buscarConta(int numeroConta)

3. **Main**
   - Classe principal que testa o sistema bancário

### Funcionamento
1. O programa cria três contas bancárias com diferentes números e titulares.
2. Realiza operações de depósito e saque para testar a funcionalidade.
3. Exibe o saldo atualizado das contas.
4. Adiciona as contas ao banco.
5. Demonstra a busca de contas existentes e inexistentes pelo número.

---

<a id="english"></a>
## English

### Description
This program simulates a simple banking system using Object-Oriented Programming (OOP) in Java. It allows the creation of bank accounts, performing basic operations such as deposits and withdrawals, and storing accounts in a bank that enables searching for an account by its number.

### Implemented Classes
1. **ContaBancaria (BankAccount)**
   - **Attributes**: accountNumber (int), accountHolder (String), balance (double)
   - **Methods**: deposit(double amount), withdraw(double amount), displayBalance(), toString()

2. **Banco (Bank)**
   - **Attributes**: name (String), accounts (ArrayList<ContaBancaria>)
   - **Methods**: addAccount(ContaBancaria account), removeAccount(ContaBancaria account), findAccount(int accountNumber)

3. **Main**
   - Main class that tests the banking system

### How it works
1. The program creates three bank accounts with different numbers and account holders.
2. It performs deposit and withdrawal operations to test functionality.
3. It displays the updated account balances.
4. It adds the accounts to the bank.
5. It demonstrates searching for existing and non-existing accounts by number.
