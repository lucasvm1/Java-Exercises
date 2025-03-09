# Sistema de Batalha de Personagens em Java / Character Battle System in Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este projeto implementa um sistema de combate entre personagens utilizando herança e polimorfismo em Java. Ele permite criar personagens com características distintas e simular batalhas entre eles.

### Classes Implementadas
1. **Personagem (Classe Abstrata)**
   - **Atributos**: nome (String), vida (int), ataque (int)
   - **Métodos**: getNome(), setNome(String nome), getVida(), setVida(int vida), getAtaque(), setAtaque(int ataque), atacar(Personagem alvo)

2. **Guerreiro**
   - Estende a classe Personagem
   - **Características**: Vida inicial: 150, Ataque: 15

3. **Mago**
   - Estende a classe Personagem
   - **Características**: Vida inicial: 100, Ataque: 30

4. **Main**
   - Classe principal que testa o sistema de combate

### Funcionamento
1. O programa cria personagens de diferentes classes (Mago e Guerreiro) com nomes personalizados.
2. Define os atributos iniciais específicos para cada tipo de personagem.
3. Simula ataques entre os personagens, reduzindo a vida do alvo a cada ataque.
4. Continua a batalha por turnos até que um dos personagens seja derrotado (vida ≤ 0).
5. Demonstra o uso de herança, métodos abstratos e sistema de combate por turnos para criar uma dinâmica de RPG simples.

---

<a id="english"></a>
## English

### Description
This project implements a combat system between characters using inheritance and polymorphism in Java. It allows creating characters with distinct characteristics and simulating battles between them.

### Implemented Classes
1. **Personagem (Character - Abstract Class)**
   - **Attributes**: name (String), health (int), attack (int)
   - **Methods**: getName(), setName(String name), getHealth(), setHealth(int health), getAttack(), setAttack(int attack), attack(Character target)

2. **Guerreiro (Warrior)**
   - Extends the Character class
   - **Characteristics**: Initial health: 150, Attack: 15

3. **Mago (Mage)**
   - Extends the Character class
   - **Characteristics**: Initial health: 100, Attack: 30

4. **Main**
   - Main class that tests the combat system

### How it works
1. The program creates characters of different classes (Mage and Warrior) with custom names.
2. Sets specific initial attributes for each type of character.
3. Simulates attacks between characters, reducing the target's health with each attack.
4. Continues the turn-based battle until one of the characters is defeated (health ≤ 0).
5. Demonstrates the use of inheritance, abstract methods, and turn-based combat system to create a simple RPG dynamic.
