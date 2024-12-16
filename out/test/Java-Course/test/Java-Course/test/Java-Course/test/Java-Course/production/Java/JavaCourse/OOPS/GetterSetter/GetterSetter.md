## GETTER AND SETTER IN JAVA
### Getters and Setters in Java

Getters and setters are fundamental components of the Java programming language used to access and modify the private 
variables of a class. They are a part of Java's encapsulation mechanism.

- **Getter Methods**: These methods are used to retrieve or access the value of private variables. They are also known 
as accessor methods. A getter method for a variable `x` is typically named `getX()`.

- **Setter Methods**: These methods are used to set or modify the value of private variables. They are also known as 
 mutator methods. A setter method for a variable `x` is typically named `setX(value)`.

#### Why Use Getters and Setters?

1. **Encapsulation**: They provide a way to modify and access the values of private variables from outside the class.
2. **Validation**: Setter methods can include validation logic to ensure the data is correct before setting a property.
3. **Flexibility**: They allow the internal representation to be changed without altering the external way of accessing the property.
4. **Readability**: They make the code more readable and maintainable.

#### Example

```java
public class Employee {
    private int id;
    private String name;

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}
```

### Interview Questions on Getters and Setters in Java

1. **What are getters and setters in Java and why are they used?**
    - Getters and setters are methods that provide read and write access to the private variables of a class, 
   respectively. They are used for encapsulation, to ensure data hiding and security, and to add validation logic while setting a value.

2. **Can a class have a setter method without a getter method, or vice versa?**
    - Yes, a class can have either a setter or a getter method independently. This allows for read-only or write-only properties.

3. **How do getters and setters contribute to encapsulation in Java?**
    - They contribute to encapsulation by allowing controlled access to the private fields of a class. This means the 
      internal representation of the class can be protected from direct access, and any access is controlled through 
      these methods.

4. **Is it possible to automatically generate getters and setters in Java?**
    - Yes, most modern IDEs like IntelliJ IDEA and Eclipse provide features to automatically generate getters and setters
   based on the private fields of a class.

5. **What are the best practices for naming getters and setters in Java?**
    - The convention is to use `get` followed by the variable name (with the first letter capitalized) for getters, and 
   `set` followed by the variable name (with the first letter capitalized) for setters. For boolean variables, `is` can
   be used instead of `get`.

6. **Can we use getters and setters for boolean variables?**
    - Yes, for boolean variables, the getter method conventionally starts with `is` instead of `get`. For example, for a boolean variable `alive`, the getter method would be named `isAlive()`.

7. **What is the impact of using public fields directly instead of getters and setters?**
    - Using public fields directly violates the encapsulation principle of OOP, making the class's internal representation
   accessible and modifiable from outside without any control or validation.