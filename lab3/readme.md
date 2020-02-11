# Abstract Class

A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body).

>Points to Remember
- Abstract classes doesnot provide full abstraction.
- The class which have abstract method must also be a abstract class.
- A abstract class cannot have an object of it.
- Abstract methods must be override in the inherited classes

# Inheritance

An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.

>Points to remember
- Interface gives full abstraction
- Multiple inheritance is possible in Interface
- Multiple implementaion is also possible
- can have default or static method

# Variable

A Java variable is a piece of memory that can contain a data value. A variable thus has a data type.

>Types of variable (According to declaration place)

- Instance Variable
	- The variable that is declared inside a class but outside method is called instance variable
	- It can have a default value.

- Static variable
	- The variable that is declared with static keyword is known as static variable
	- They are created only once, i.e only single copy of that variable is created
	- Static method must have static variable

- Local Variable
	- The variable that is declared inside a method is known as local variable
	- They doesnot get default values
	- They cannot be used outside the method boundary