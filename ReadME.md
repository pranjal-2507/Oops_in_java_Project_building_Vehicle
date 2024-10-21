## Vehicle Management System
---
This project is a simple demonstration of Object-Oriented Programming (OOP) concepts such as Abstraction, Inheritance, and Encapsulation using a Vehicle abstract class and its subclasses (Car and Motorcycle). The project is implemented in Java and showcases how different types of vehicles can inherit common characteristics while also defining their own unique properties and behaviors.

## Key Concepts
1. Abstraction
The Vehicle class is an abstract class that cannot be instantiated directly. It defines a common interface for all vehicles, which must be implemented by subclasses.

2. Inheritance
The Car and Motorcycle classes inherit common properties like make, model, and year from the Vehicle class, demonstrating the concept of reusing code through inheritance.

3. Encapsulation
Fields such as make, model, year, doors, and type are marked as private and can only be accessed and modified through getter and setter methods, ensuring encapsulation and data hiding.

4. Polymorphism
The method displayInfo() is implemented differently in Car and Motorcycle, but it is called in the same way, demonstrating polymorphism.

- Technologies Used
Java: The project is written entirely in Java and demonstrates core OOP principles.