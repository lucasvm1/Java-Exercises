# Sistema de Pedidos em Java / Order System in Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este projeto implementa um sistema de pedidos utilizando Programação Orientada a Objetos (POO) em Java. Ele permite gerenciar clientes, adicionar itens a pedidos e calcular o valor total da compra.

### Classes Implementadas
1. **Cliente**
   - **Atributos**: idCliente (int), nome (String)
   - **Métodos**: getIdCliente(), getNome(), setNome(String nome)

2. **Item**
   - **Atributos**: nome (String), quantidade (int), preco (double)
   - **Métodos**: getNome(), getQuantidade(), getPreco(), exibirInfo()

3. **Pedido**
   - **Atributos**: numeroPedido (int), cliente (Cliente), itens (ArrayList<Item>)
   - **Métodos**: getNumeroPedido(), getCliente(), setCliente(Cliente cliente), adicionarItem(Item item), removerItem(Item item), calcularTotal()

4. **Main**
   - Classe principal que testa o sistema de pedidos

### Funcionamento
1. O programa cria um cliente com ID e nome.
2. Cria um pedido associado ao cliente com um número identificador.
3. Adiciona diferentes itens ao pedido, cada um com nome, quantidade e preço.
4. Permite remover itens do pedido se necessário.
5. Calcula e exibe o valor total do pedido.
6. Demonstra o uso de associação de classes, manipulação de listas e encapsulamento para modelar um sistema de pedidos eficiente.

---

<a id="english"></a>
## English

### Description
This project implements an order system using Object-Oriented Programming (OOP) in Java. It allows managing customers, adding items to orders, and calculating the total purchase value.

### Implemented Classes
1. **Cliente (Customer)**
   - **Attributes**: customerId (int), name (String)
   - **Methods**: getCustomerId(), getName(), setName(String name)

2. **Item**
   - **Attributes**: name (String), quantity (int), price (double)
   - **Methods**: getName(), getQuantity(), getPrice(), displayInfo()

3. **Pedido (Order)**
   - **Attributes**: orderNumber (int), customer (Customer), items (ArrayList<Item>)
   - **Methods**: getOrderNumber(), getCustomer(), setCustomer(Customer customer), addItem(Item item), removeItem(Item item), calculateTotal()

4. **Main**
   - Main class that tests the order system

### How it works
1. The program creates a customer with ID and name.
2. Creates an order associated with the customer with an identifier number.
3. Adds different items to the order, each with name, quantity, and price.
4. Allows removing items from the order if necessary.
5. Calculates and displays the total order value.
6. Demonstrates the use of class association, list manipulation, and encapsulation to model an efficient order system.
