
Code should be Maintainable, Extendable and modular

Class:
	Class is the blue print / template

Object is the instance of the class

Eg: should be something from swiggy, zomato, amazon

Order is the class:
	OrderID, status are the variables

**OOPS:**
	OOPS is the way of designing the code (usability, modularity)

	Polymorphism
	abstraction
	inheritance
	encapsulation

**Encapsulation:**
bundling data (variables) and methods (functions) that operate on that data into a single unit

1) Data Hiding: Internal object details are hidden from outside interference and misuse.

2) Access Control: You typically use access modifiers like private, protected, and public to control access to class members.

3) Interface Exposure: Only selected methods (getters/setters) are exposed to the outside world to interact with the data.

**Access Modifiers:**
Private: Only in current class

Public: anywhere

protected: accessible in same package

**Abstraction:**
hiding complex implementation details and showing only the essential features of an object or system

Abstraction is achieved in Java using:

	-> Abstract classes (using the abstract keyword)

	-> Interfaces (using the interface keyword)

It promotes loose coupling and code usability.
Users interact with objects through well-defined interfaces.

**Inheritance:**
Inheritance in Java is an object-oriented programming feature that allows a class (child or subclass) to 
acquire properties and behaviors (fields and methods) from another class (parent or superclass).

Key:
extends keyword is used for class inheritance.

_The subclass inherits:_
1) Non-private fields and methods of the superclass.

2) It can override methods to provide specific behavior.

3) Java supports single inheritance (a class can only extend one class).

Types:
✅ 1. Single Inheritance

✅ 2. Multilevel Inheritance

✅ 3. Hierarchical Inheritance

❌ 4. Multiple Inheritance (with classes)

Java does not support multiple inheritance with classes (to avoid the Diamond Problem).
However, it is supported through interfaces.
``
interface Printable {
void print();
}

interface Showable {
void show();
}

class A implements Printable, Showable {
public void print() {
System.out.println("Print");
}

    public void show() {
        System.out.println("Show");
    }
}


``
✅ 5. Hybrid Inheritance
Hybrid Inheritance is a combination of two or more types of inheritance (e.g., multilevel + multiple).

// Interface 1
interface Camera {
void takePhoto();
}

// Interface 2
interface MusicPlayer {
void playMusic();
}

// Base class
class Phone {
void makeCall() {
System.out.println("Making a call...");
}
}

// Subclass that combines features
class SmartPhone extends Phone implements Camera, MusicPlayer {
public void takePhoto() {
System.out.println("Taking a photo...");
}

    public void playMusic() {
        System.out.println("Playing music...");
    }
}



**Polymorphism:** (may forms - different implementation of same)
-> Compile time -> Method Overloading
-> Run time -> Method Overriding

Run time:
A a = new A();// To Call parent class
A a = new B();// To Call Child class

Inside the child class if you want to call parent class, super.func(); can be called


Difference between Abstract class and Interface:

If we need to have some common code to execute then we need to use Abstract class.

Abstract class:
Abstract class have both concrete methods and abstract methods

Interface:
If we need dont have some common code to execute then we need to use Interface.

	    Payment{
			pay()
		}
		
		GPayPayment{
			pay(){ 

			}
		}
		PayTMPayment{
			pay(){
				
			}
		}

Key:
Abstract class can have both abstract and non abstract method

Abstract methods can only present under an abstract class

Final Class -> Cannot be extended

Final Method -> cannot be override

Final variable -> cannot change value

Static Function:
When we create a static function, the function is belong to class - not to objects



