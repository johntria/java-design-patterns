
# Command Design Pattern

As you remember when we started this repo we said we should be able to explain each algorithm in a single breath

## Single breath explanation
![](https://media4.giphy.com/media/l41lWMPkMkfIYr9zW/giphy.gif)


Imagine you have Siri on your phone, and you want Siri to do different things like play music, set a reminder, or send a message. You can talk to Siri and give her commands using your voice.

Now, imagine that you have a special helper that can understand your voice commands and translate them into actions for Siri to perform. This helper knows how to talk to Siri and knows how to execute different commands.

The Command pattern is like this special helper for Siri. It is a design pattern in Java that allows you to encapsulate a request as an object, thereby letting you parameterize different requests with different objects, queue or log requests, and support undoable operations.

In other words, with the Command pattern, you can create different commands as objects and pass them to a receiver object, like Siri, which knows how to execute the commands. This makes it easy to add new commands and modify existing ones without changing the receiver object's code.

For example, you can create a PlayMusicCommand object that knows how to play music on Siri. You can also create a SetReminderCommand object that knows how to set a reminder on Siri. Then, you can pass these commands to Siri, and she will execute them as requested.


###  Real time scenario 🤙🏾
You are building an e-commerce application where customers can place orders for products. Each order can have different statuses, such as "New", "Processing", "Shipped", and "Delivered". Each status change needs to be logged for auditing purposes.

In this scenario, you can use the Command pattern to create a set of commands that represent the status changes for an order. You can create a StatusChangeCommand interface that defines a method to execute the status change, and a OrderStatusChangeLogger class that logs the status change.

### Definition & Pros/Cons

_The Command Design Pattern is a behavioral design pattern that is used to encapsulate a request as an object, thereby allowing you to parameterize clients with different requests, queue or log requests, and support undoable operations.

In this pattern, a request is wrapped under an object as a command and passed to an invoker object. The invoker object looks for the appropriate object that can handle the command and pass the command to the corresponding object which executes it.

This pattern allows you to decouple the requester of the command from the object that performs the action, making it easier to add new commands and change how they are executed without affecting the requester. Additionally, the pattern allows you to build more complex operations by combining simple commands, as well as support undo and redo functionality._

### Pros of decorator Pattern:

* Decoupling: The Command pattern decouples the object that sends the request from the object that receives and executes the command. This separation of concerns can make the code more modular and easier to maintain.

* Flexibility: Because the Command pattern encapsulates a request as an object, it is possible to change the behavior of the request dynamically at runtime. This can make the code more flexible and adaptable to changing requirements.

* Reusability: Commands can be reused across different parts of the application. This can help reduce code duplication and improve code maintainability.

* Undo/Redo: The Command pattern makes it easier to implement undo and redo functionality in an application. Because commands are executed in a sequence, it is possible to simply execute commands in reverse order to undo a series of actions.

* Logging and Auditing: Commands can be logged to provide an audit trail of actions performed in an application. This can be useful for debugging and troubleshooting.


### Cons of decorator Pattern:

* Increased Complexity: Implementing the Command pattern can sometimes lead to increased complexity, especially if the command objects need to interact with many other objects in the system.

* Increased Memory Usage: Because the Command pattern involves creating objects to represent each command, it can sometimes lead to increased memory usage in the application.

* Performance Overhead: The use of command objects can introduce some performance overhead, especially if the commands need to be executed frequently.

* Difficulty in Implementing: Implementing the Command pattern can sometimes be more difficult than other design patterns due to the need to create a separate command object for each operation.

* Not Suitable for Simple Applications: The Command pattern may not be suitable for very simple applications where the overhead of creating and managing command objects is not justified.

### Should you use it ?

Are you looking to decouple the object that sends a request from the object that receives and executes the command? Do you need to support undo/redo functionality? Are you looking to log or audit actions performed in the application? If the answer to any of these questions is yes, then the Command pattern may be a good fit for your project. However, if your application is very simple and does not require these features, then the overhead of implementing the Command pattern may not be justified.
