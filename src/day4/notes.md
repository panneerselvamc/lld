
**Builder Design pattern:**

Desktop

-> HP Desktop

-> Dell Desktop

-> Sony Desktop

For all the desktop - RAM,Processor,Monitor,Keyboard,mouse,printer are madatory

Builder - Abstract class / Interface

buildRam();

buildProcesses();

buildMonitor();



```
Desktop - pojo (ram , storage, brand)

abstract class desktopBuilder - buildRam (abstract), buildStorage (abstract), buildBrand (abstract), build

HPDesktopBuilder extends desktopBuilder -> override and set the values here

DellDesktopBuilder extends desktopBuilder -> override and set the values here

Director -> gets builder ->  it controls the execution process
```

**Prototype Design Pattern:**
Making Available .clone method available - to clone the object

because the client doesnt need to know how its cloned

best way is implementing - implements Cloneable

**Singleton Design pattern:**
Allowing only once to create object
Spring boot by default creates singleton instance not prototype

