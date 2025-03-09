# Sistema de Funcionários em Java / Employee System in Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este projeto implementa um sistema básico de funcionários utilizando Programação Orientada a Objetos (POO) em Java. Ele simula diferentes tipos de funcionários, aplicando bônus salariais específicos para cada cargo.

### Classes Implementadas
1. **Funcionario**
   - **Atributos**: nome (String), salario (double)
   - **Métodos**: getNome(), setNome(String nome), getSalario(), setSalario(double salario)

2. **Desenvolvedor**
   - Estende a classe Funcionario
   - **Atributos**: bonus (double) - 10% sobre o salário base
   - **Métodos**: getBonus(), setBonus(double bonus), getSalario() (sobrescrito)

3. **Gerente**
   - Estende a classe Funcionario
   - **Atributos**: bonus (double) - 15% sobre o salário base
   - **Métodos**: getBonus(), setBonus(double bonus), getSalario() (sobrescrito)

4. **Main**
   - Classe principal que testa o sistema de funcionários

### Funcionamento
1. O programa cria instâncias de diferentes tipos de funcionários (Gerente e Desenvolvedor).
2. Define o mesmo salário base (1000) para ambos os funcionários.
3. Calcula automaticamente o bônus específico para cada cargo (10% para Desenvolvedor, 15% para Gerente).
4. Exibe o salário final de cada funcionário, já considerando o bônus aplicado.
5. Demonstra o uso de herança e sobrescrita de métodos para personalizar o comportamento das classes derivadas.

---

<a id="english"></a>
## English

### Description
This project implements a basic employee system using Object-Oriented Programming (OOP) in Java. It simulates different types of employees, applying specific salary bonuses for each position.

### Implemented Classes
1. **Funcionario (Employee)**
   - **Attributes**: name (String), salary (double)
   - **Methods**: getName(), setName(String name), getSalary(), setSalary(double salary)

2. **Desenvolvedor (Developer)**
   - Extends the Employee class
   - **Attributes**: bonus (double) - 10% of the base salary
   - **Methods**: getBonus(), setBonus(double bonus), getSalary() (overridden)

3. **Gerente (Manager)**
   - Extends the Employee class
   - **Attributes**: bonus (double) - 15% of the base salary
   - **Methods**: getBonus(), setBonus(double bonus), getSalary() (overridden)

4. **Main**
   - Main class that tests the employee system

### How it works
1. The program creates instances of different types of employees (Manager and Developer).
2. Sets the same base salary (1000) for both employees.
3. Automatically calculates the specific bonus for each position (10% for Developer, 15% for Manager).
4. Displays the final salary of each employee, already considering the applied bonus.
5. Demonstrates the use of inheritance and method overriding to customize the behavior of derived classes.
