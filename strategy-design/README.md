
# Strategy Design Pattern

As you remember when we started this repo we said we should be able to explain each algorithm in a single breath

## Single breath explanation
![](https://github.com/johntria/java-design-patterns/blob/master/strategy-design/src/main/resources/will-trent.gif)

The strategy design pattern is like having a toy box full of different toys. When you want to play, you pick the toy that best suits your game. Similarly, the strategy pattern lets you choose from different strategies to solve a problem based on your needs. It's like having different tools in a toolbox that you can use depending on what you want to build.


###  Real time scenario 🤙🏾
A common real-world scenario where the strategy design pattern is used on vehicles.
Lets set an example which someone told you that we want to create us an application which we can store lot of vehicles but we have to know if it can fly.


As a developer which you ❤️ ORP (object-oriented programming) you would think that I have to create a class where it can have the ability for multiple objects where in each of these objects I have to define whether it can fly.

If you design your application WRONG you would go to each of the objects and add a field where you would define if it can fly.
As you can understand this would be very tedious for you because you would be repeating yourself in many places in your code for no reason.

But now that you know the existence of the Strategy-Design-Pattern you will create a superclass where you will add the common fields that all vehicles have and you will also add a feature where each vehicle will be able to decide if they can fly.

In giving this option it is very important to understand that we can give many options and implementations to algorithms.

Consider the same example in an e-wallet service.
Each e-wallet can contain infinite cards where each card will have a specific method of payment as well as communication with the respective bank.


### Definition & Pros/Cons


_The strategy design pattern is a behavioral design pattern that allows you to encapsulate a family of algorithms and make them interchangeable within the same context object. This pattern defines a set of algorithms, encapsulates each one as an object, and makes them interchangeable at runtime._

Pros:

* Encapsulates algorithms as separate objects, making them easy to swap in and out as needed.
* Promotes code reusability, as the same set of strategies can be used across multiple applications or modules.
* Allows for easy addition of new strategies without modifying existing code.
* Enhances flexibility and maintainability of the codebase, as changes to one strategy do not affect the others.
* Promotes adherence to the Open/Closed Principle (OCP) of software design, which states that code should be open for extension but closed for modification.


Cons:

* Can introduce additional complexity to the codebase, particularly if there are a large number of strategies to manage.
