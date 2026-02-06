# Strategy Design Pattern

## Pattern definition
The **Strategy Design Pattern** is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable. **Strategy** allows the algorithm to vary independently from clients that use it.

## Design principles
1. **Encapsulate what varies:** 
   1. Identify the aspects of your application that vary and separate them from what stays the same. 
   2. This allows you to change or extend the varying parts without affecting the rest of the code.
2. **Favor composition over inheritance:** 
   1. Instead of relying heavily on class inheritance, use composition to build complex functionality by combining simpler objects. 
   2. This promotes flexibility and reduces tight coupling between classes and makes it easier to change behavior at runtime.
3. **Program to an interface, not an implementation:** 
   1. Define interfaces or abstract classes that specify the behavior of your objects, and program against those interfaces rather than concrete implementations. 
   2. This allows you to change the underlying implementation without affecting the code that uses it.
4. **Single Responsibility Principle:** 
   1. Each class or module should have only one reason to change, meaning it should have only one responsibility. 
   2. This promotes maintainability and makes it easier to understand and modify the code.
5. **Open/Closed Principle:** 
   1. Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. 
   2. This means you should be able to add new functionality without changing existing code, which helps prevent bugs and promotes code stability.

