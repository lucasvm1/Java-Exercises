# Sistema de Veículos em Java / Vehicle System in Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este projeto implementa um sistema de veículos utilizando Programação Orientada a Objetos (POO) em Java. Ele permite representar diferentes tipos de veículos, como carros e motos, armazenando informações relevantes para cada tipo.

### Classes Implementadas
1. **Veiculo**
   - **Atributos**: marca (String), modelo (String), ano (int)
   - **Métodos**: getMarca(), setMarca(String marca), getModelo(), setModelo(String modelo), getAno(), setAno(int ano), toString()

2. **Carro**
   - Estende a classe Veiculo
   - **Atributos**: quantidadePortas (int)
   - **Métodos**: getQuantidadePortas(), setQuantidadePortas(int quantidadePortas), toString() (sobrescrito)

3. **Moto**
   - Estende a classe Veiculo
   - **Atributos**: cilindrada (int)
   - **Métodos**: getCilindrada(), setCilindrada(int cilindrada), toString() (sobrescrito)

4. **Main**
   - Classe principal que testa o sistema de veículos

### Funcionamento
1. O programa cria instâncias de diferentes tipos de veículos (Carro e Moto).
2. Define atributos específicos para cada tipo de veículo (marca, modelo, ano, quantidade de portas ou cilindrada).
3. Exibe as informações completas de cada veículo no console.
4. Demonstra o uso de herança e sobrescrita do método toString() para personalizar a exibição das informações de cada tipo de veículo.

---

<a id="english"></a>
## English

### Description
This project implements a vehicle system using Object-Oriented Programming (OOP) in Java. It allows representing different types of vehicles, such as cars and motorcycles, storing relevant information for each type.

### Implemented Classes
1. **Veiculo (Vehicle)**
   - **Attributes**: brand (String), model (String), year (int)
   - **Methods**: getBrand(), setBrand(String brand), getModel(), setModel(String model), getYear(), setYear(int year), toString()

2. **Carro (Car)**
   - Extends the Vehicle class
   - **Attributes**: numberOfDoors (int)
   - **Methods**: getNumberOfDoors(), setNumberOfDoors(int numberOfDoors), toString() (overridden)

3. **Moto (Motorcycle)**
   - Extends the Vehicle class
   - **Attributes**: engineDisplacement (int)
   - **Methods**: getEngineDisplacement(), setEngineDisplacement(int engineDisplacement), toString() (overridden)

4. **Main**
   - Main class that tests the vehicle system

### How it works
1. The program creates instances of different types of vehicles (Car and Motorcycle).
2. Sets specific attributes for each type of vehicle (brand, model, year, number of doors or engine displacement).
3. Displays the complete information of each vehicle in the console.
4. Demonstrates the use of inheritance and overriding of the toString() method to customize the display of information for each type of vehicle.
