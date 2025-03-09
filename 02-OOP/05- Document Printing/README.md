# Sistema de Impressão de Documentos em Java / Document Printing System in Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este projeto implementa um sistema de impressão de documentos utilizando interfaces e polimorfismo em Java. Ele permite imprimir diferentes tipos de documentos, como relatórios e contratos.

### Classes Implementadas
1. **Imprimivel (Interface)**
   - **Métodos**: imprimir() - Método que deve ser implementado por todas as classes que desejam ser imprimíveis

2. **Contrato**
   - Implementa a interface Imprimivel
   - **Atributos**: signatario1 (String), signatario2 (String)
   - **Métodos**: imprimir() - Exibe os nomes dos signatários do contrato

3. **Relatorio**
   - Implementa a interface Imprimivel
   - **Atributos**: conteudo (String)
   - **Métodos**: imprimir() - Exibe o conteúdo do relatório

4. **Main**
   - Classe principal que testa o sistema de impressão

### Funcionamento
1. O programa cria uma lista de objetos imprimíveis (Contrato e Relatorio).
2. Define os atributos específicos para cada tipo de documento.
3. Percorre a lista e imprime cada documento utilizando o método imprimir().
4. Demonstra o uso de interfaces, polimorfismo e listas de objetos genéricos para criar um sistema de impressão flexível.

---

<a id="english"></a>
## English

### Description
This project implements a document printing system using interfaces and polymorphism in Java. It allows printing different types of documents, such as reports and contracts.

### Implemented Classes
1. **Imprimivel (Printable - Interface)**
   - **Methods**: print() - Method that must be implemented by all classes that wish to be printable

2. **Contrato (Contract)**
   - Implements the Printable interface
   - **Attributes**: signatory1 (String), signatory2 (String)
   - **Methods**: print() - Displays the names of the contract signatories

3. **Relatorio (Report)**
   - Implements the Printable interface
   - **Attributes**: content (String)
   - **Methods**: print() - Displays the report content

4. **Main**
   - Main class that tests the printing system

### How it works
1. The program creates a list of printable objects (Contract and Report).
2. Sets specific attributes for each type of document.
3. Iterates through the list and prints each document using the print() method.
4. Demonstrates the use of interfaces, polymorphism, and lists of generic objects to create a flexible printing system.
