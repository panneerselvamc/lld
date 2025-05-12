
**HAS - A - RELATIONSHIP:**
It is Subjective


**HAS-A-RELATIONSHIP:**

-> Aggregation(HAS-A)

EG:
Person has bag

-> Composition (PART OF)

EG:
Person has Heart (Person cannot live without heart)


A has B
Can B exist without A

		yes -> Aggregation
		No -> Composition

**UML:**
Unified Modeling Language

--- is a straight line

		A----|> B   A is a B - Inheritance 
		A<>---- B  A has a B, B can exisit Aggregation
		A<..> ---B A has a B, B cant exist without A (part off)

		A ---------- B Bidirectional A & B can call each other (Association )
		A ---------> B A can Call B, B cant call A - User can call payment gateway but payment gateway can t call person

		Ignore above
		------|> Implements
		A ------|> B , A Implements B

		+ public
		- private
		# protected

Reference:
https://github.com/keertipurswani/Swiggy_Zomato/blob/main/Swiggy%20Zomato%20UML.png
```
While writing Box for interface
to show it as a interface
It can be <<IInterfaceName>>
or Name has to be start with I
Or the text has to be italic


TOPMOST: Name
Second: Data members
Last section: methods

+ public
- private
# protected
```

KISS - Keep It Simple Stupid

YAGNI - You Aren't Gonna Need It

DRY - Don't Repeat Yourself

