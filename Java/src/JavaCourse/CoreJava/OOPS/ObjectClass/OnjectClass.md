In Java, classes and objects are fundamental concepts that form the basis of object-oriented programming.

### Class
A class in Java is a blueprint from which individual objects are created. It acts as a template that describes the state and behavior that the objects of the class all share. A class can contain fields (variables) and methods to define the behavior of an object.

- **Fields**: Represent the state of an object. They are variables within a class.
- **Methods**: Define the behavior of an object. They are functions within a class that can manipulate the fields or perform operations.

#### Syntax for Declaring a Class
```java
public class ClassName {
    // fields
    int field1;
    String field2;
    
    // methods
    void method1() {
        // method body
    }
    
    void method2() {
        // method body
    }
}
```

### Object
An object is an instance of a class. When a class is defined, no memory is allocated until objects of the class are created.
An object has a state and behavior as defined by its class.

#### Creating an Object
Objects are created from a class using the `new` keyword.

```java
ClassName objectName = new ClassName();
```

After an object is created, you can access its fields and call its methods.

#### Example
Consider a simple class `Pen` and how we create an object of this class.

```java
class Pen {
    String color;
    int tipSize;
    
    void setColor(String newColor) {
        color = newColor;
    }
    
    void setTipSize(int newSize) {
        tipSize = newSize;
    }
}
```

Creating an object of `Pen` and using its methods:

```java
public class Main {
    public static void main(String[] args) {
        Pen myPen = new Pen();
        myPen.setColor("Blue");
        myPen.setTipSize(5);
        
        System.out.println("Pen color: " + myPen.color);
        System.out.println("Pen tip size: " + myPen.tipSize);
    }
}
```

In this example, `Pen` is the class that defines the state (`color`, `tipSize`) and behavior (`setColor`, `setTipSize`). `myPen` is an object of the `Pen` class, and we use this object to set and access the pen's color and tip size.