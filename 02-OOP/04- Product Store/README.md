# Sistema de Controle de Estoque em Java / Inventory Control System in Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este projeto implementa um sistema simples de controle de estoque utilizando Programação Orientada a Objetos (POO) em Java. Ele permite gerenciar produtos, incluindo operações de adição e remoção de estoque.

### Classes Implementadas
1. **Produto**
   - **Atributos**: nome (String), preco (double), quantidadeEstoque (int)
   - **Métodos**: getNome(), setNome(String nome), getPreco(), setPreco(double preco), getQuantidadeEstoque(), setQuantidadeEstoque(int quantidade), adicionaEstoque(int quantidade), removerEstoque(int quantidade)

2. **Main**
   - Classe principal que testa o sistema de controle de estoque

### Funcionamento
1. O programa cria um produto com nome, preço e quantidade inicial em estoque.
2. Permite adicionar unidades ao estoque através do método adicionaEstoque().
3. Permite remover unidades do estoque através do método removerEstoque(), garantindo que o estoque nunca fique com valor negativo.
4. Demonstra o uso de encapsulamento e métodos de controle para gerenciar produtos de forma eficiente.

---

<a id="english"></a>
## English

### Description
This project implements a simple inventory control system using Object-Oriented Programming (OOP) in Java. It allows managing products, including operations for adding and removing items from inventory.

### Implemented Classes
1. **Produto (Product)**
   - **Attributes**: name (String), price (double), inventoryQuantity (int)
   - **Methods**: getName(), setName(String name), getPrice(), setPrice(double price), getInventoryQuantity(), setInventoryQuantity(int quantity), addToInventory(int quantity), removeFromInventory(int quantity)

2. **Main**
   - Main class that tests the inventory control system

### How it works
1. The program creates a product with name, price, and initial inventory quantity.
2. Allows adding units to inventory through the addToInventory() method.
3. Allows removing units from inventory through the removeFromInventory() method, ensuring the inventory never becomes negative.
4. Demonstrates the use of encapsulation and control methods to efficiently manage products.
