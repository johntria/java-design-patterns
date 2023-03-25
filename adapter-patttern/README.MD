
# Adapter Design Pattern

As you remember when we started this repo we said we should be able to explain each algorithm in a single breath

## Single breath explanation
![](https://media4.giphy.com/media/ra9CXD3se9q5a/giphy.gif)


Imagine you have a phone charger that only works with a specific type of phone. But you just bought a new phone that uses a different type of charger. Instead of buying a whole new charger, you can use an adapter that plugs into the charger and has a slot for your new phone's plug. That way, you can still charge your phone with the old charger, thanks to the adapter.

Similarly, in software design, if you have two different systems or components that are incompatible, you can create an adapter that sits in between them, and makes the necessary translations and adjustments, so that they can communicate and work together.

In summary, an adapter is a connector that allows different things to work together, by adapting them to each other. It's like a translator, that helps two systems communicate and understand each other, even if they speak different "languages".

###  Real time scenario 🤙🏾
Let's say you have an e-commerce website that uses a payment gateway to process payments from customers. Your website is integrated with a popular payment gateway that requires customers to enter their credit card information and billing address to complete a transaction.

However, you have recently decided to expand your website's reach by offering alternative payment methods, such as PayPal and Apple Pay. These payment methods use a different format for their payment information than the payment gateway you are currently using.

To integrate these new payment methods into your website, you can use the adapter design pattern. You can create an adapter for each alternative payment method that translates the payment information from the alternative payment method format to the format expected by the payment gateway.

In this scenario, the adapter acts as a bridge between your website and the alternative payment method, allowing them to work together even though they have different formats. The adapter translates the payment information from the alternative payment method into the format expected by the payment gateway, allowing your website to process payments seamlessly regardless of the payment method used by the customer.

### Definition & Pros/Cons

_The Adapter Design Pattern is a structural design pattern that allows two incompatible interfaces to work together by creating a bridge between them. It acts as a compatibility layer that translates the communication between two different components so that they can communicate effectively._

_The pattern is commonly used when you have an existing application or component that expects one interface, but you need to integrate it with a new component that has a different interface. Instead of modifying the existing application or component, you can create an adapter that adapts the new component's interface to the interface expected by the existing application or component._

_In summary, the adapter design pattern helps to solve the problem of how to make two incompatible interfaces work together by creating an adapter that acts as a bridge between them._

### Pros of adapter Pattern:

* Improves code reusability: By using the adapter pattern, you can reuse existing code without modifying it. This can save a lot of development time and effort, as you can adapt different components to work together without having to write new code from scratch.

* Simplifies system design: The adapter pattern can simplify the overall system design by separating the concerns of different components. The adapter acts as a bridge between the components, so each component can focus on its specific functionality without worrying about the details of the other component's interface.

* Provides flexibility: The adapter pattern can provide flexibility by allowing you to add or remove components without affecting the rest of the system. You can easily swap out components or add new ones as needed, as long as they are compatible with the adapter interface.

* Encourages modularity: The adapter pattern encourages modularity by breaking down the system into smaller, more manageable components. Each component can be tested and developed independently, which can make it easier to maintain and extend the system over time.

* Improves scalability: The adapter pattern can improve the scalability of the system by allowing you to add new components without having to modify existing code. This can make it easier to scale the system up to handle larger volumes of data or users.


### Cons of adapter Pattern:

* Adds complexity: Adding an adapter layer to a system can add complexity, especially if you need to create multiple adapters to work with different components. This can make the system harder to understand, debug, and maintain over time.

* Can impact performance: The adapter pattern can introduce additional overhead into the system, especially if the adapter needs to perform complex translations or conversions. This can impact the overall performance of the system and slow down processing times.

* May introduce new bugs: Any time you add a new layer to a system, you run the risk of introducing new bugs or errors. If the adapter is not implemented correctly, it could cause unexpected behavior or errors in the system.

*  May require additional testing: Adding an adapter layer to a system can require additional testing to ensure that it is working correctly. This can increase the time and effort required to develop and maintain the system.

Can be overused: While the adapter pattern can be a useful tool, it can also be overused. If you find yourself creating adapters for every new component or interface, it may be a sign that the system design needs to be reevaluated.


### Should you use it ?

Do you need to integrate two components or interfaces that have incompatible interfaces? Go for it !

Do you need to reuse existing code without modifying it? Go for it !
 
Will the adapter pattern simplify the overall system design? Go for it !

Will it provide flexibility, modularity, or scalability benefits to your system? Go for it !