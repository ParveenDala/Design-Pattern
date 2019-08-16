# Design-Pattern
Java design pattern

Strategy: Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime. One of the best example of strategy pattern is Collections.sort() method that takes Comparator parameter. Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways.  

Observer: Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.  

Decorator: The decorator design pattern allows us to dynamically add functionality and behavior to an object without affecting the behavior of other existing objects in the same class. We use inheritance to extend the behavior of the class. This takes place at compile time, and all of the instances of that class get the extended behavior.
