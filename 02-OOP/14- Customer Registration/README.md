# Sistema de Cadastro de Clientes em Java / Customer Registration System in Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este projeto implementa um sistema de cadastro de clientes utilizando coleções (HashMap) em Java. Ele permite adicionar, remover, buscar e listar clientes cadastrados.

### Classes Implementadas
1. **Cliente**
   - **Atributos**: idCliente (int), nome (String)
   - **Métodos**: getIdCliente(), getNome(), setNome(String nome)

2. **CadastroCliente**
   - **Atributos**: clientes (HashMap<Integer, Cliente>)
   - **Métodos**: cadastrarCliente(Cliente cliente), removerCliente(int idCliente), buscarCliente(int idCliente), listarClientes()

3. **Main**
   - Classe principal que testa o sistema de cadastro de clientes

### Funcionamento
1. O programa cria objetos Cliente com ID único e nome.
2. Adiciona os clientes ao cadastro utilizando um HashMap que associa o ID do cliente ao objeto Cliente.
3. Permite listar todos os clientes cadastrados, exibindo uma mensagem caso não haja clientes.
4. Possibilita buscar um cliente específico pelo seu ID, tratando casos onde o cliente não é encontrado.
5. Permite remover um cliente do cadastro pelo ID, verificando se ele existe antes da remoção.
6. Demonstra o uso de coleções (HashMap), manipulação de dados e gestão de clientes de forma eficiente, com verificações adicionais para evitar erros de acesso a dados inexistentes.

---

<a id="english"></a>
## English

### Description
This project implements a customer registration system using collections (HashMap) in Java. It allows adding, removing, searching, and listing registered customers.

### Implemented Classes
1. **Cliente (Customer)**
   - **Attributes**: customerId (int), name (String)
   - **Methods**: getCustomerId(), getName(), setName(String name)

2. **CadastroCliente (CustomerRegistration)**
   - **Attributes**: customers (HashMap<Integer, Customer>)
   - **Methods**: registerCustomer(Customer customer), removeCustomer(int customerId), findCustomer(int customerId), listCustomers()

3. **Main**
   - Main class that tests the customer registration system

### How it works
1. The program creates Customer objects with unique ID and name.
2. Adds customers to the registration using a HashMap that associates the customer ID with the Customer object.
3. Allows listing all registered customers, displaying a message if there are no customers.
4. Makes it possible to search for a specific customer by their ID, handling cases where the customer is not found.
5. Allows removing a customer from the registration by ID, checking if they exist before removal.
6. Demonstrates the use of collections (HashMap), data manipulation, and customer management efficiently, with additional checks to avoid errors when accessing non-existent data.
