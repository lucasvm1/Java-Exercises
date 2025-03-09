# Sistema de Funcionários com Cargos em Java / Employee System with Positions in Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este projeto implementa um sistema de funcionários que utiliza enumerações (Enums) para representar diferentes cargos e calcular o salário com bônus correspondente.

### Classes Implementadas
1. **Cargo (Enum)**
   - Enumeração que define os cargos disponíveis para os funcionários:
     - Gerente
     - Desenvolvedor
     - Analista

2. **Funcionario**
   - **Atributos**: nome (String), salario (double), cargo (Cargo)
   - **Métodos**: getNome(), setNome(String nome), getSalario(), setSalario(double salario), getCargo(), setCargo(Cargo cargo), calcularSalario()

3. **Main**
   - Classe principal que testa o sistema de funcionários

### Funcionamento
1. O programa cria diferentes funcionários, cada um com um cargo específico (Gerente, Desenvolvedor ou Analista).
2. Define nome e salário base para cada funcionário.
3. Calcula o salário final aplicando um bônus baseado no cargo:
   - Gerente: 20% de bônus
   - Desenvolvedor: 10% de bônus
   - Analista: 5% de bônus
4. Exibe o salário final de cada funcionário após aplicação do bônus.
5. Demonstra o uso de enumerações (Enums), estrutura condicional e cálculo de bônus salarial para organizar a gestão de funcionários de maneira eficiente.

---

<a id="english"></a>
## English

### Description
This project implements an employee system that uses enumerations (Enums) to represent different positions and calculate the corresponding bonus salary.

### Implemented Classes
1. **Cargo (Position - Enum)**
   - Enumeration that defines the available positions for employees:
     - Manager
     - Developer
     - Analyst

2. **Funcionario (Employee)**
   - **Attributes**: name (String), salary (double), position (Position)
   - **Methods**: getName(), setName(String name), getSalary(), setSalary(double salary), getPosition(), setPosition(Position position), calculateSalary()

3. **Main**
   - Main class that tests the employee system

### How it works
1. The program creates different employees, each with a specific position (Manager, Developer, or Analyst).
2. Sets name and base salary for each employee.
3. Calculates the final salary by applying a bonus based on the position:
   - Manager: 20% bonus
   - Developer: 10% bonus
   - Analyst: 5% bonus
4. Displays the final salary of each employee after the bonus is applied.
5. Demonstrates the use of enumerations (Enums), conditional structure, and salary bonus calculation to efficiently organize employee management.
