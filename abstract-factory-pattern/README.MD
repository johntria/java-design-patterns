
# Abstract Factory Pattern

As you remember when we started this repo we said we should be able to explain each algorithm in a single breath

## Single breath explanation
![](https://media1.giphy.com/media/3o7TKzhPqGvUDm3pba/giphy.gif)

Imagine you love playing with different types of toys like cars, dolls, and puzzles. But sometimes, your mom takes you to a toy store, and you have no idea what toys are available there.

So, your mom takes you to a special section of the store where you can pick the type of toy you want to play with, and then the store's helper gives you a toy from that section.

An abstract factory pattern is like that special section of the store. It's a special way of making toys (or other things) where you can choose the type of toy you want, and then a factory makes the exact toy you asked for.

This helps make sure that you get the right toy without having to worry about all the different types of toys that are available.

###  Real time scenario 🤙🏾
A real-life scenario where the abstract factory pattern can be used with Legos is in a Lego theme park.

Imagine a Lego theme park that has different areas dedicated to different Lego themes, such as Star Wars, Harry Potter, or Ninjago. Each area has Lego sculptures and models that represent the different characters and scenes from the theme.

Using the abstract factory pattern, the park could have a Lego factory for each theme that produces only the Lego blocks required for that theme. For example, the Star Wars Lego factory would produce blocks for building spaceships, lightsabers, and droids, while the Harry Potter Lego factory would produce blocks for building wands, potions, and magical creatures.

When new models and sculptures are being created, the appropriate factory is chosen based on the theme and used to create the required Lego blocks. This way, the theme park can ensure that each model and sculpture is built with the correct set of Lego blocks, and the visitors get an immersive and authentic experience in each themed area.

In summary, the abstract factory pattern can be used in a Lego theme park to ensure that the correct Lego blocks are used for each theme, without having to worry about the specific implementation details of each block.

### Definition & Pros/Cons


_The Abstract Factory Pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. It allows a client to create objects from a family of related objects without knowing the specific classes of those objects. The Abstract Factory Pattern is used when a system needs to be independent of how its objects are created, composed, and represented. It promotes loose coupling by separating the object creation from the rest of the code, making it easier to add new types of objects to the system._

### Pros of Abstract Factory Pattern:

* Provides abstraction: The Abstract Factory Pattern provides a level of abstraction that allows a client to create objects without knowing their concrete implementation. This makes the system more flexible and easier to maintain.

* Encourages loose coupling: The Abstract Factory Pattern promotes loose coupling between objects, making it easier to modify and extend the system. It allows objects to be replaced without affecting the rest of the system.

* Supports the Open-Closed Principle: The Abstract Factory Pattern supports the Open-Closed Principle by allowing new factories and products to be added to the system without modifying existing code.

* Simplifies testing: The Abstract Factory Pattern makes testing easier because it allows objects to be mocked and injected into other objects. This makes it easier to isolate and test specific parts of the system.

### Cons of Abstract Factory Pattern:

* Increased complexity: The Abstract Factory Pattern can add complexity to the system by introducing additional classes and interfaces. This can make the code harder to understand and maintain.

* Increased development time: Implementing the Abstract Factory Pattern can take more time than simply creating objects directly, especially for smaller systems.

* Limits flexibility: The Abstract Factory Pattern can limit the flexibility of the system by defining a fixed set of object types. This can make it harder to introduce new object types into the system.

* Requires careful design: The Abstract Factory Pattern requires careful design to ensure that the factories and products are properly defined and organized. This can be challenging for complex systems.

### Should you use it ?

* Does your project need to be independent of how its objects are created, composed, and represented? If YES go for it!

* Does your project need to support multiple families of related objects? If YES go for it!

* Does your project need to support different variations of objects while still maintaining a consistent interface? If YES go for it!

* Does your project need to support different platforms or environments while still maintaining a consistent interface? If YES go for it!

* Does your project need to be easily testable and allow for mocking and injection of objects for better testing? If YES go for it!
