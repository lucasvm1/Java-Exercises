# Sistema de Gerenciamento de Alunos em Java / Student Management System in Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este projeto implementa um sistema simples de gerenciamento de alunos utilizando Programação Orientada a Objetos (POO) em Java. Ele permite cadastrar alunos, registrar notas e calcular a média final para determinar a aprovação.

### Classes Implementadas
1. **Aluno**
   - **Atributos**: nome (String), matricula (String), notas (ArrayList<Double>)
   - **Métodos**: getNome(), setNome(String nome), getMatricula(), adicionaNota(double nota), calcularMedia(), verificarAprovacao()

2. **Main**
   - Classe principal que testa o sistema de gerenciamento de alunos

### Funcionamento
1. O programa cria um objeto Aluno com nome e matrícula.
2. Adiciona múltiplas notas à lista de notas do aluno.
3. Calcula a média das notas registradas.
4. Verifica se o aluno foi aprovado (média igual ou superior a 7).
5. Demonstra o uso de encapsulamento e manipulação de listas para gerenciar informações acadêmicas de forma eficiente.

---

<a id="english"></a>
## English

### Description
This project implements a simple student management system using Object-Oriented Programming (OOP) in Java. It allows registering students, recording grades, and calculating the final average to determine approval.

### Implemented Classes
1. **Aluno (Student)**
   - **Attributes**: name (String), registrationNumber (String), grades (ArrayList<Double>)
   - **Methods**: getName(), setName(String name), getRegistrationNumber(), addGrade(double grade), calculateAverage(), checkApproval()

2. **Main**
   - Main class that tests the student management system

### How it works
1. The program creates a Student object with name and registration number.
2. Adds multiple grades to the student's grade list.
3. Calculates the average of the recorded grades.
4. Checks if the student has been approved (average equal to or greater than 7).
5. Demonstrates the use of encapsulation and list manipulation to efficiently manage academic information.
