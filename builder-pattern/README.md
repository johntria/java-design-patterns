
# Builder Design Pattern

As you remember when we started this repo we said we should be able to explain each algorithm in a single breath

## Single breath explanation
![](https://media0.giphy.com/media/CZokLM4Ax23DbPN2Py/giphy.gif)


Imagine you want to build a PC, but you don't know where to start. You know you need some parts like a motherboard, a processor, some memory, a hard drive, and so on. But how do you put all of these parts together?

That's where the builder pattern comes in! It's a design pattern in Java that helps you create objects with many configurable parts. In other words, it helps you build complex objects step by step.

Here's how it works: you start by creating a builder object, which has methods for setting all the different parts of your PC. For example, you might have a method called setProcessor() that takes a Processor object as a parameter, and a method called setMemory() that takes a Memory object.

Once you've set all the parts you want, you call a build() method on the builder object, which returns a fully constructed PC object. This way, you can create different configurations of PCs without having to write a ton of code for each one.



###  Real time scenario 🤙🏾
A real-time scenario where the Builder pattern is commonly used is in the creation of complex objects, where the creation process involves a large number of optional parameters or configuration settings.

For example, imagine a restaurant management system where customers can place orders for pizzas with a variety of toppings and customizations. The pizza object can have many optional properties like crust type, size, sauce, cheese, toppings, and more. In such a scenario, a builder pattern can be used to create the pizza object in a more readable and maintainable way.

### Definition & Pros/Cons

_The Builder design pattern is a creational design pattern used in object-oriented programming to construct complex objects step-by-step, with the flexibility to create different object representations or variations. The Builder pattern separates the construction of an object from its representation, allowing you to create different variations of an object while keeping the creation process simple and maintainable.
In general, the Builder pattern involves creating a separate Builder class with methods to set each optional property of the object. The Builder class has a build() method that returns the final object, which is constructed using the values set by the builder methods._

### Pros of Builder Pattern:

* Encapsulation of object construction: The Builder pattern encapsulates the object construction process and separates it from the representation, making it easier to modify the construction process without affecting the object's API or behavior.

* Flexibility and variation: The Builder pattern allows for flexibility in constructing objects with multiple optional properties, and provides a clean and readable API for doing so. It also allows for the creation of different variations of the same object using the same construction process.

* Improves code readability: The Builder pattern makes the code more readable and maintainable by providing a clear and consistent way of constructing objects, and by making it easy to add or remove optional properties.

* Reduces object initialization errors: The Builder pattern reduces the risk of object initialization errors by ensuring that all required properties are set before the object is constructed.

* Increases testability: The Builder pattern makes it easier to test objects by allowing for the creation of test-specific builders that can be used to construct objects with specific properties for testing purposes.

### Cons of Builder Pattern:

* Increased complexity: The Builder pattern can add some additional complexity to the code, particularly when there are many optional properties to set or when there are multiple levels of nesting required.

* Overhead: The Builder pattern requires creating an additional Builder class, which can add some overhead to the code and increase the number of classes that need to be managed.

* Limited support for immutable objects: The Builder pattern is typically used to construct mutable objects, and can be more difficult to implement with immutable objects.

* Requires discipline: The Builder pattern requires discipline to be effective, particularly in ensuring that all required properties are set before the object is constructed. If the builder is not used consistently, it can lead to errors and confusion.

* Can be verbose: The Builder pattern can be verbose, particularly when there are many optional properties to set or when there are multiple levels of nesting required. This can make the code less concise and harder to read.

### Where and when should i use it ?

When you need to create objects with many optional properties: If you have an object with many optional properties that may or may not be set, using a Builder pattern can make it easier to construct the object with the desired properties without creating numerous overloaded constructors.

When you need to create multiple variations of the same object: If you need to create many variations of the same object, each with different sets of properties, using a Builder pattern can simplify the creation process and make it easier to manage and modify.

When you need to maintain immutability: If you need to create an immutable object with many properties, using a Builder pattern can simplify the construction process and ensure that all required properties are set before the object is constructed.

When you need to improve testability: If you need to create test-specific objects with specific properties for testing purposes, using a Builder pattern can make it easier to create these objects and ensure that they have the desired properties.
