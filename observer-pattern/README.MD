
# Observer Pattern

As you remember when we started this repo we said we should be able to explain each algorithm in a single breath

## Single breath explanation
![](https://media.tenor.com/RIIP2uoyfNgAAAAC/subscribe-pink.gif)

The observer pattern is when one thing watches another thing and gets notified when something happens.

It's like a baby monitor: the baby (subject) cries and the parent (observer) gets notified.

In programming, it's when an object (subject) sends a message to a list of other objects (observers) when it changes.

This helps keep things in sync and makes sure everyone knows what's going on.
###  Real time scenario 🤙🏾

A real-time scenario involving videos and the observer pattern could be a video streaming service like YouTube. In this scenario, the video player would be the "subject" and the various components of the user interface, such as the progress bar, playback speed selector, and volume control, would be the "observers".

As the video plays, the subject would notify the observers whenever a change occurs, such as when the video reaches a certain point in time or when the playback speed is adjusted. This would allow the user interface to update in real-time to reflect these changes.

For example, if the user clicks on the progress bar to skip ahead in the video, the subject would notify the observers of the new playback position, and the user interface would update to display the new time and resume playing the video from that point.

Similarly, if the user adjusts the volume or playback speed, the subject would notify the observers of the new settings, and the user interface would update to reflect those changes.

Overall, the observer pattern helps keep the video player and user interface components in sync, ensuring that the user has a seamless and responsive experience while watching videos on the platform.


# Definition & Pros/Cons


The Observer Pattern is a design pattern in software engineering that defines a one-to-many dependency relationship between objects, such that when one object (called the "subject") changes state, all of its dependent objects (called "observers") are notified and updated automatically.

This pattern promotes loose coupling between objects, allowing them to be easily modified and reused without affecting the rest of the system.

The Observer Pattern is commonly used in event-driven systems, user interfaces, and real-time data processing applications where it's important to maintain consistency between multiple objects that rely on the same data.

Pros of the Observer Pattern:

* Promotes loose coupling between objects, allowing for greater flexibility and easier maintenance.
* Supports a one-to-many relationship between objects, allowing multiple observers to be notified of changes to a single subject.
* Enables real-time updates and synchronization between objects, improving system responsiveness and consistency.
* Encourages a modular, reusable design by separating the subject and observer logic into separate classes.
* Allows for new observers to be added or removed at runtime, without affecting the subject or other observers.



Cons of the Observer Pattern:

* Can lead to performance issues when many observers are present, as each observer must be notified of every change to the subject.
* Can result in complex interactions and hard-to-follow code when multiple observers are present, making debugging and maintenance more difficult.
* Requires careful consideration of the order in which observers are notified, as this can affect the behavior of the system.
* Can result in increased memory usage, as each observer must maintain its own copy of the data being observed.
* May not be suitable for all applications, particularly those with a small number of observers or a low frequency of updates.
