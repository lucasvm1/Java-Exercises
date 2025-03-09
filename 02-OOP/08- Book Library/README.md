# Sistema de Biblioteca em Java / Library System in Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este projeto implementa um sistema de gerenciamento de biblioteca utilizando Programação Orientada a Objetos (POO) em Java. Ele permite cadastrar livros, controlar empréstimos e listar os livros disponíveis na biblioteca.

### Classes Implementadas
1. **Livro**
   - **Atributos**: titulo (String), autor (String), emprestado (boolean)
   - **Métodos**: getTitulo(), setTitulo(String titulo), getAutor(), setAutor(String autor), isEmprestado(), setEmprestado(boolean emprestado), emprestar(), devolver()

2. **Biblioteca**
   - **Atributos**: nome (String), livros (ArrayList<Livro>)
   - **Métodos**: getNome(), setNome(String nome), adicionarLivro(Livro livro), listarLivrosDisponiveis()

3. **Main**
   - Classe principal que testa o sistema de biblioteca

### Funcionamento
1. O programa cria uma Biblioteca com um nome específico.
2. Adiciona vários livros ao acervo da biblioteca.
3. Realiza empréstimos de livros, alterando seu status para emprestado.
4. Lista os livros que estão disponíveis (não emprestados) no acervo.
5. Demonstra o uso de encapsulamento, manipulação de listas e gestão de empréstimos para organizar um sistema de biblioteca funcional.

---

<a id="english"></a>
## English

### Description
This project implements a library management system using Object-Oriented Programming (OOP) in Java. It allows registering books, controlling loans, and listing available books in the library.

### Implemented Classes
1. **Livro (Book)**
   - **Attributes**: title (String), author (String), borrowed (boolean)
   - **Methods**: getTitle(), setTitle(String title), getAuthor(), setAuthor(String author), isBorrowed(), setBorrowed(boolean borrowed), borrow(), returnBook()

2. **Biblioteca (Library)**
   - **Attributes**: name (String), books (ArrayList<Book>)
   - **Methods**: getName(), setName(String name), addBook(Book book), listAvailableBooks()

3. **Main**
   - Main class that tests the library system

### How it works
1. The program creates a Library with a specific name.
2. Adds several books to the library collection.
3. Performs book loans, changing their status to borrowed.
4. Lists books that are available (not borrowed) in the collection.
5. Demonstrates the use of encapsulation, list manipulation, and loan management to organize a functional library system.
