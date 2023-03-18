
# Prototype Design Pattern

As you remember when we started this repo we said we should be able to explain each algorithm in a single breath

## Single breath explanation
![](https://media3.giphy.com/media/l0ErS9uOp6WstjZQY/giphy.gif)


Imagine you have a table with some cups of coffee on it, and you want to make sure that all of your friends have a cup of coffee that looks the same as yours. However, some friends might want more milk or sugar than you do in their coffee.

To make sure that all of your friends have a cup of coffee that looks the same, you can use a special kind of magic that lets you make exact copies of your own cup of coffee. This magic is called the "prototype pattern."

So, you take your original cup of coffee and make a copy of it, just like you would make a copy of a picture or a drawing. Then, you can change the amount of milk and sugar in the new copy to match what your friends want. This way, you can make sure that all of your friends have a cup of coffee that looks the same, but with the amount of milk and sugar that they want.

This prototype pattern is a way of making new objects by copying an existing object, instead of creating a new object from scratch each time. This can be really useful when you need to make lots of objects that are very similar but have different values for their properties, like the amount of milk and sugar in a cup of coffee for each friend.



###  Real time scenario 🤙🏾
Let's say you are building a game that involves creating lots of different characters with unique abilities and traits. Each character has a lot of similar properties, such as a name, a health value, a set of skills, and so on. However, each character also has unique properties that make them different from one another, such as a specific look, voice, or special ability.

Instead of creating a new character object from scratch each time a new character is needed in the game, you can use the prototype pattern. You can create a prototype character object that has all of the common properties that every character has, and then make copies of that prototype for each new character needed in the game. Each copy can then be customized with the unique properties that make that character special.

By using the prototype pattern, you can save a lot of time and memory by avoiding the need to create new objects from scratch each time a new character is needed. This can make your game run faster and smoother, especially if there are a lot of characters needed in the game.

### Definition & Pros/Cons

_Prototype Pattern is a creational design pattern that allows you to create new objects by copying an existing object. The existing object serves as a prototype, and the new objects are created by copying the prototype and then customizing it as needed. This pattern is useful when you need to create many objects that are similar but have some differences in their properties. By using the prototype pattern, you can save time and memory by avoiding the need to create new objects from scratch each time a new object is needed, which can improve the performance of your application.._

### Pros of Prototype Pattern:

* Enables efficient object creation by avoiding the overhead of creating new objects from scratch
* Reduces the amount of duplicated code and improves code reusability
* Provides a simple and flexible way to customize new objects by copying an existing object
* Allows for dynamic object creation, which can be useful in some situations where the exact type of object needed may not be known at compile time
* Helps to improve the performance and efficiency of your application by minimizing the number of object creation operations
* Can be combined with other design patterns, such as the Factory Method pattern, to create more complex and powerful object creation mechanisms


### Cons of Prototype Pattern:

* Requires the prototype object to be properly initialized and configured before it can be copied, which may add complexity to the code and increase the risk of errors
* May be less suitable for complex object hierarchies or object graphs, where copying an object may also require copying its related objects and dependencies
* Can be less efficient or scalable if the prototype object is very large or contains a lot of data, as copying the object may require a lot of memory and processing power
* May not be suitable for cases where the object being copied requires a lot of initialization or setup logic that cannot be easily copied from the prototype
* Requires careful consideration of object mutability, as changes to the prototype object may also affect the copied objects if they share the same references to mutable objects or properties.

### Should you use it ?

Here are some scenarios where using the Java Prototype Pattern could be beneficial:

When you need to create multiple objects that have similar properties or behavior, but with some variations in their attributes or values.

When the process of creating new objects from scratch is time-consuming, resource-intensive, or complex, and could benefit from a more efficient approach.

When you need to create objects dynamically at runtime, and the exact type or configuration of the object may not be known until then.

When you want to avoid duplicating code or logic when creating new objects, and instead want to reuse an existing object as a template or prototype.

When you want to minimize the memory usage and improve the performance of your application by reusing existing objects instead of creating new ones.
