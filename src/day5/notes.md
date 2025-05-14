**DoubleCheckedLockSingleton**
This is used in muti threaded environments

Eg: Pubsub connection to publish event to Google pubsub

**Earlier / Eager Initialization:**

When we create instance while the server comes up
```agsl
if (hotel == null) { // will never be null though we have mutiple threads, because it is created during the server starting
    hotel = new Hotel();
}
return hotel;
```

**LAZY INITIALIZATION:**

We will be creating object only when it is needed

Lazy initialization vs Earlier initialization is depends on the business usecase


**Revising:**

Factory DP :

    -> Encapsulate creation process
    -> Similar objects
    -> Hiding complexity from client

Factory Method:
    
    -> Deligate Creation process to subclasses

Abstract Factory:
    
    -> Family of Similar products

Builder:

    -> Building processes is complex
    -> Config is different

Prototype:
    
    -> Copy exisiting object > creating the new object
    -> Delegate cloning process

Singleton:
    
    -> Creating only one instance
    -> Double checked locking

With this Creational Design pattern completed

**BEHAVIOURAL DESIGN PATTERN:**

Traffic Light:

When Timer Completes

    -> Turn on Vehicle light
    -> Turn off Pedestrian light

When the Timer completes again

    -> Turn off Vehicle light
    -> Turn on Pedestrian light

**Observer design pattern:**

    -> One to Many Dependency
    -> One Subject - Many Observers


```agsl
Subject -------> Observers

Swiggy   -> Customer, Delivery partner, Restaurent
Uber     -> Customer, Rider

```

Observer UML image -> refer image folder

Aggregator relationship -> Observers can exists with out subject


```agsl
for(Observer observer: Observers){
    observer.update(); // Observer is interface / Abstract class
}
```

