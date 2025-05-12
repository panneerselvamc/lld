**SOLID**:

S -> Single Responsibility Principle

O -> Open Closed Principle

L -> Liskov Substitution Principle

I -> Interface Segregation principle

D -> Dependency Inversion Principle

**SRP**:

SRP is a guideline, it is very subjective.

SRP can be at multiple levels, like
 
SRP at class 

SRP at method

SRT at microservice...,

**Open Closed Principle:**
Open For Extension and Closed for Modification

Once a code is tested and pushed to production, the 
existing code should not be touched

Eg:
Interface: ILogger
Class: ErrorLogger

if we want to add Warning Logger, We can simply extend
it without modifying existing code.

**Liskov Substitution Principle:**
Super class object can be replaced by sub class object

		Class B extends A -> Class B should be having all the features of class A

		employee -> Manager, Supervisor, Director

Example:
Square -> Base, Rectangle -> Derived

		public class Square {
		    int area;

		    public void changeWidth(int x){
		        area = x *x;
		    }
		    public void print(){
		        System.out.println(area);
		    }
		}

		public class Rectangle extends Square{
		    public void changeWidth(int l, int b){
		        area = l * b;
		    }

		}

		rectangle.changeWidth(4); // this will create a wrong input

Correct way:

```
Interface / Abstract class: User
Interface / Abstract class: Partner - has method doKyC

Customer extends User
DeliveryPartner extends Partner
HotelOwner extends Partner
```

**Interface Segregation principle:**
Avoid bigger interface, like above KYC example
have smaller interfaces

**Dependency Inversion Principle:**

-> Main AIM: Loose Coupling

Problem:
```
    NotificationManager{
    if(sms)
        smssender.sendMsg();
    if(whatsapp)
        whatsappsender.sendmsg();
    if(telegram)
        telegram.sendmsg();
    }
NotificationManager should not depend on sms/whatsapp/telegram
```
High level modules should not rely on low level
module

Correct:
```
INotificationManager{
sendMsg();
}
```

