# Sistema de Carrinho de Compras em Java / Shopping Cart System in Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este projeto implementa um sistema de carrinho de compras utilizando Programação Orientada a Objetos (POO) em Java. Ele permite que um usuário adicione e remova produtos do carrinho e calcule o total da compra.

### Classes Implementadas
1. **Produto**
   - **Atributos**: nome (String), preco (double)
   - **Métodos**: getNome(), setNome(String nome), getPreco()

2. **Usuario**
   - **Atributos**: id (int), nome (String)
   - **Métodos**: getId(), setId(int id), getNome(), setNome(String nome)

3. **CarrinhoCompras**
   - **Atributos**: usuario (Usuario), produtos (ArrayList<Produto>)
   - **Métodos**: adicionarProduto(Produto produto), removerProduto(Produto produto), calcularPreco()

4. **Main**
   - Classe principal que testa o sistema de carrinho de compras

### Funcionamento
1. O programa cria um usuário com ID e nome.
2. Cria um carrinho de compras associado ao usuário.
3. Adiciona diferentes produtos ao carrinho.
4. Permite remover produtos do carrinho se necessário.
5. Calcula e exibe o valor total da compra.
6. Demonstra o uso de associação de classes, manipulação de listas e encapsulamento para modelar um sistema de compras eficiente.

---

<a id="english"></a>
## English

### Description
This project implements a shopping cart system using Object-Oriented Programming (OOP) in Java. It allows a user to add and remove products from the cart and calculate the total purchase amount.

### Implemented Classes
1. **Produto (Product)**
   - **Attributes**: name (String), price (double)
   - **Methods**: getName(), setName(String name), getPrice()

2. **Usuario (User)**
   - **Attributes**: id (int), name (String)
   - **Methods**: getId(), setId(int id), getName(), setName(String name)

3. **CarrinhoCompras (ShoppingCart)**
   - **Attributes**: user (User), products (ArrayList<Product>)
   - **Methods**: addProduct(Product product), removeProduct(Product product), calculatePrice()

4. **Main**
   - Main class that tests the shopping cart system

### How it works
1. The program creates a user with ID and name.
2. Creates a shopping cart associated with the user.
3. Adds different products to the cart.
4. Allows removing products from the cart if necessary.
5. Calculates and displays the total purchase amount.
6. Demonstrates the use of class association, list manipulation, and encapsulation to model an efficient shopping system.
