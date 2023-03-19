
# Decorataor Design Pattern

As you remember when we started this repo we said we should be able to explain each algorithm in a single breath

## Single breath explanation
![](https://media2.giphy.com/media/tIjN9l7AesL2lRP571/giphy.gif)


Imagine you have a basic pair of shoes. They're nice, but a bit boring. You want to make them special by adding some decorations to them, like colorful laces or sparkly gems. But you don't want to mess up the original shoes, and you want to be able to add or remove decorations whenever you like.

The decorator pattern is like having a magic shoe box that lets you add different decorations to your shoes without changing the original shoes. You can add as many decorations as you want, in any order, and you can take them off anytime you want. And best of all, you can still wear your original shoes underneath all the decorations.

In Java, the decorator pattern is a way of adding extra features or behavior to an object, without changing its original code. In our shoe example, the basic pair of shoes is the original object, and the decorations are the extra features. We can create different decorator classes for each decoration, like a "lace" decorator or a "gem" decorator. Each decorator class adds a specific feature to the original object, and we can stack multiple decorators on top of each other to create different combinations of features.

So, the decorator pattern is like having a shoe box full of decorations that you can add or remove from your basic shoes whenever you want, without changing the shoes themselves.


###  Real time scenario 🤙🏾
Let's say you're working on a software project for a restaurant. You have a Dish class that represents a menu item, and you want to be able to dynamically add or remove ingredients to a dish without changing its original code.

Here's how you could use the decorator pattern in this scenario:

Define an interface called Dish that has methods for getting the name, description, and price of the dish.
Implement a concrete Dish class that represents a basic menu item, like a cheeseburger. This class would implement the Dish interface and have methods for getting the name, description, and price of the cheeseburger.
Define an abstract IngredientDecorator class that also implements the Dish interface, but has a reference to another Dish object. This class should have methods for getting the name, description, and price of the dish, and it should delegate those methods to the wrapped Dish object.
Implement concrete IngredientDecorator classes for each ingredient that can be added to a dish, like bacon or avocado. These classes should extend the IngredientDecorator class and add behavior for the specific ingredient they represent.
To create a dish with added ingredients, you can wrap the basic Dish object in one or more IngredientDecorator objects. For example, to create a cheeseburger with bacon and avocado, you can create a BaconDecorator object that wraps a GuacamoleDecorator object that wraps a Cheeseburger object.
In this scenario, the decorator pattern allows you to add or remove ingredients to a dish at runtime, without changing the original Dish code. You can create different combinations of ingredients by stacking multiple IngredientDecorator objects on top of each other, and you can easily remove an ingredient by removing the corresponding decorator. This makes it easy to customize menu items for individual customers or to offer special menu items with unique ingredient combinations.

### Definition & Pros/Cons

_The decorator pattern is a design pattern in object-oriented programming that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. This pattern is useful when you want to add functionality to an object at runtime, and when subclassing would be impractical due to the large number of possible combinations. The decorator pattern involves creating a decorator class that wraps the original class and adds new behavior, and a client class that interacts with the decorated object through a common interface._

### Pros of decorator Pattern:

* Open-closed principle: The decorator pattern follows the open-closed principle, which means that it allows you to add new functionality to an object without modifying its underlying code. This makes it easier to extend the behavior of an object over time, without introducing new bugs or breaking existing code.

* Flexibility: The decorator pattern provides a flexible way to add or remove behavior from an object at runtime. You can add new behavior by wrapping an object in a decorator class, and you can remove behavior by removing the corresponding decorator.

* Simplifies code: The decorator pattern simplifies the code by reducing the number of subclasses required to implement different combinations of behavior. Instead of creating a new subclass for each combination of behavior, you can create a small set of decorator classes that can be combined in different ways to achieve the desired behavior.

* Composability: The decorator pattern allows you to compose objects at runtime, which makes it easier to create complex object structures from simple components. This can be especially useful in scenarios where you need to build objects dynamically based on user input or other runtime factors.

* Separation of concerns: The decorator pattern separates the concerns of object behavior and object composition, which can make the code easier to understand and maintain. By separating the behavior from the composition, you can focus on each aspect independently and make changes without affecting the other.


### Cons of decorator Pattern:

* Increased complexity: The decorator pattern can make the code more complex by introducing additional classes and layers of abstraction. This can make it harder to understand and maintain the code, especially if there are many different decorators and combinations of decorators.

* Performance overhead: The use of decorator objects can result in some performance overhead, since each decorator object adds a layer of indirection and additional method calls. This can be a concern in performance-critical systems, or when creating many objects with complex decorator chains.

* Object identity: Decorator objects may not have the same identity as the original object, since they wrap the original object rather than extending it. This can be a problem if object identity is important for the application, such as when comparing objects or using object hash codes.

* Interface proliferation: The decorator pattern can result in a proliferation of interfaces and classes, since each decorator requires its own interface and implementation. This can make the codebase more difficult to navigate and understand, especially if there are many decorators and interfaces.

* Limited impact: The decorator pattern may not be the best solution for all design problems. In some cases, other patterns or techniques may be more effective or efficient for achieving the desired behavior. It is important to consider the specific requirements and constraints of the application before deciding to use the decorator pattern.

### Should you use it ?

If you want to provide a way to add new behavior to an object at runtime, without modifying its underlying code, the decorator pattern can help with that.

If you want to make the code more maintainable by reducing the number of subclasses needed to implement different combinations of behavior, consider using the decorator pattern.

If you want to separate the concerns of object behavior and object composition, making the code easier to understand and maintain, the decorator pattern can be a good choice.

If you want to make the code more reusable by allowing the same decorator classes to be used across different objects and contexts, the decorator pattern can be useful.

If you want to follow best practices and design principles that have been proven in many different applications and contexts, the decorator pattern is a well-known and widely used design pattern in object-oriented programming that you might consider using.
