# Sistema de Animais em Java / Animal System in Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este projeto implementa um sistema de representação de animais utilizando herança e polimorfismo em Java. Ele permite criar diferentes tipos de animais e fazer com que cada um emita seu próprio som.

### Classes Implementadas
1. **Animal (Classe Abstrata)**
   - **Atributos**: nome (String), idade (int)
   - **Métodos**: getNome(), setNome(String nome), getIdade(), setIdade(int idade), emitirSom() (método abstrato)

2. **Cachorro**
   - Estende a classe Animal
   - **Comportamento**: Quando o método emitirSom() é chamado, o cachorro late

3. **Gato**
   - Estende a classe Animal
   - **Comportamento**: Quando o método emitirSom() é chamado, o gato mia

4. **Papagaio**
   - Estende a classe Animal
   - **Atributo Extra**: frase (String) - Frase que o papagaio repete
   - **Comportamento**: Quando o método emitirSom() é chamado, o papagaio fala a frase armazenada

5. **Main**
   - Classe principal que testa o sistema de animais

### Funcionamento
1. O programa cria instâncias de diferentes tipos de animais (Cachorro, Gato e Papagaio).
2. Define atributos como nome e idade para cada animal.
3. Para o Papagaio, define também uma frase que ele pode repetir.
4. Chama o método emitirSom() para cada animal, demonstrando o comportamento específico de cada um.
5. Demonstra o uso de herança, polimorfismo e classes abstratas para estruturar um sistema de modelagem de animais.

---

<a id="english"></a>
## English

### Description
This project implements an animal representation system using inheritance and polymorphism in Java. It allows creating different types of animals and making each one emit its own sound.

### Implemented Classes
1. **Animal (Abstract Class)**
   - **Attributes**: name (String), age (int)
   - **Methods**: getName(), setName(String name), getAge(), setAge(int age), makeSound() (abstract method)

2. **Cachorro (Dog)**
   - Extends the Animal class
   - **Behavior**: When the makeSound() method is called, the dog barks

3. **Gato (Cat)**
   - Extends the Animal class
   - **Behavior**: When the makeSound() method is called, the cat meows

4. **Papagaio (Parrot)**
   - Extends the Animal class
   - **Extra Attribute**: phrase (String) - Phrase that the parrot repeats
   - **Behavior**: When the makeSound() method is called, the parrot speaks the stored phrase

5. **Main**
   - Main class that tests the animal system

### How it works
1. The program creates instances of different types of animals (Dog, Cat, and Parrot).
2. Sets attributes such as name and age for each animal.
3. For the Parrot, also sets a phrase that it can repeat.
4. Calls the makeSound() method for each animal, demonstrating the specific behavior of each one.
5. Demonstrates the use of inheritance, polymorphism, and abstract classes to structure an animal modeling system.
