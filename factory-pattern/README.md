
# Strategy Design Pattern

As you remember when we started this repo we said we should be able to explain each algorithm in a single breath

## Single breath explanation
![](https://media2.giphy.com/media/TFI0e2cyeRGPy67BY7/giphy.gif)

Okay, imagine you love playing with Legos. You have a bunch of different Lego pieces and you can use them to build all sorts of cool things like cars, houses, and spaceships. But sometimes you want to build the same thing over and over again, like a car. It's kind of boring to have to gather all the pieces you need every time you want to build a car.

So, you decide to make a special box that has all the pieces you need to build a car. This box is your "factory". Whenever you want to build a car, you just use the pieces in the factory box instead of searching for them all over your Lego collection.

That's basically what the factory pattern is in programming. Instead of creating objects from scratch every time you need them, you make a "factory" that creates those objects for you. This way, you don't have to repeat the same code over and over again, and you can easily make changes to the way objects are created by updating the factory.

###  Real time scenario 🤙🏾
It's often used in scenarios where you need to create multiple objects that have similar functionality but different implementations. Here are a few examples of real-world scenarios where you might use the factory pattern:

Creating different types of database connections: If you're working on a web application that needs to connect to multiple databases (such as MySQL, Oracle, and PostgreSQL), you could use a factory pattern to create different types of database connections. Each type of database connection would have its own implementation, but the client code that uses the connections would only need to interact with the factory class.


### Definition & Pros/Cons


_It is a method that returns a class from a set of classes. All classes MUST have a common target, a superclass.
The class that the method returns is chosen at run-time_

Pros:

* Encapsulation: The factory pattern encapsulates object creation in a separate class, which makes the code easier to maintain and modify in the future. This also helps to reduce coupling between objects and improve overall code organization.

* Abstraction: The factory pattern provides an abstraction layer between the client code and the objects being created. This allows the client code to interact with the objects through a common interface, which can simplify code and make it easier to add or modify objects in the future.

* Flexibility: The factory pattern allows you to change the type of object being created without modifying the client code. This means you can easily switch between different implementations of an object without changing the code that uses it.

Cons:

*  Increased complexity: The factory pattern adds an additional layer of complexity to your code, which can make it harder to understand and debug. It also requires additional classes and interfaces, which can increase the size of your codebase.

* Performance overhead: The factory pattern can introduce a small performance overhead, since it requires an additional class to create objects. This overhead is usually negligible, but it may be a concern in performance-critical applications.

* Learning curve: If you're not familiar with the factory pattern, it can take some time to understand how it works and how to implement it effectively. This can make it harder to get started with the pattern, especially for developers who are new to software design patterns.

### Should you use it ?

* Do you know in advance what class object you need? If NO go for it!

* Do you want to group in one place the class selection from a multitude of classes? If YES go for it!

* Do the possible classes you want to use have the same super class? If YES go for it!

* Do you want your colleague to know all the sub classes? If NOT go for it!

* Do you want to encapsulate the creation of objects? If YES go for it!
