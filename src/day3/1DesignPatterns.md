**Design pattern:**

design pattern is a template , commonly used in daily work

-> Creational Design pattern (object create)

-> Structural design pattern

-> Behavioural Design pattern (how are classes related to each other)

**Singleton** – Ensures a class has only one instance and provides a global point of access to it.

**Factory Method** – Creates objects without specifying the exact class to create.

**Abstract Factory** – Produces families of related or dependent objects without specifying their concrete classes.

**Builder** – Separates the construction of a complex object from its representation.

**Prototype** – Creates new objects by copying an existing object, known as the prototype.

**1) Simple Factory Design Pattern:**

	Use case:
		Object creation - whenever we need to create object
		Creating Similar type of Object

	Car for rent:
		Luxury
		Economy
		SUV

	Order:
		DineIn
		TakeOut
		Delivery
	Netflix -video:
		Movie
		TV shows
		Documentries
	

	Above all are orders - their difference is going to be in slight

	if(carType ==SUV) createSuv
	if(carType ==luxury) createLuxury
	if(carType ==Economy) createEconomy


Simple Factory pattern uses If Else to create Logger

Factory method pattern uses no if-else - multiple factory is created

Abstract factory pattern - creates if-else for factory

**Another Example:**
```
Vehicle - CAR, BIKE

CAR: HONDA,SUZUKI

BIKE:HONDA,SUZUKI
```
**Another Example:**
```
Client - BUTTON, TEXTBOX

BUTTON: MAC BUTTON,WINDOWS BUTTON

TEXTBOX:MAC TEXTBOX, WINDOWS TEXTBOX
```
**CODE**:
```
GUIFactory{
}

MACFactory{
}

WindowsFactory{
}

```

