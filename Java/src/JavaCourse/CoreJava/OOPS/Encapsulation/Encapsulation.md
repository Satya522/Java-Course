## ENCAPSULATION IN JAVA
Encapsulation is a fundamental concept in object-oriented programming (OOP), including Java. It is the mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class are hidden from other classes and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

### Key Points of Encapsulation:

- **Data Hiding**: The main idea behind encapsulation is to hide the implementation details from users. If a data member is private, it means it can only be accessed within the same class. No outside class can access private data members (variables) of other classes.

- **Increased Flexibility**: We can make the variables of the class read-only or write-only depending on our requirement. If we wish to make them read-only, we only provide getter methods. If we wish to make them write-only, we only provide setter methods.

- **Improved Security**: Encapsulation provides control over the data by restricting who can access it. By making the class variables private and providing public setter and getter methods to modify and view the variables' values, the integrity of the data is maintained.

- **Ease of Maintenance**: Encapsulation helps in maintaining the code easily. By encapsulating the details, making changes in the code later is much easier, with minimal impact on other classes.

### Implementing Encapsulation in Java:

1. **Declare the variables of a class as private**.
2. **Provide public setter and getter methods to modify and view the variables' values**.

#### Example:

```java
public class Employee {
    private int id;
    private String name;
    private double salary;

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }
}
```

In this example, the `Employee` class has three private variables: `id`, `name`, and `salary`. The public getter and 
setter methods allow access to these private variables. This is encapsulation, where the actual values are hidden behind
methods that control access in a controlled manner.


### Benefits of Encapsulation:
1. **Data Hiding**: The data is hidden from unauthorized access, improving security.
2. **Flexibility**: The class can have read-only or write-only properties.
3. **Improved Maintainability**: Changes can be made easily without affecting other parts of the program.
4. **Reusability**: Encapsulated code can be reused in other parts of the program or other programs.
5. **Testing and Debugging**: Encapsulation makes it easier to test and debug code.

Encapsulation is a core concept in OOP that promotes a modular approach to software development by hiding internal details
and exposing only necessary information through interfaces. It helps in creating robust, secure, and maintainable code.

### Conclusion:
Encapsulation is an essential concept in Java and other object-oriented programming languages. It allows for data hiding, increased flexibility, improved security, ease of maintenance, and other benefits. By encapsulating data within classes and providing controlled access through methods, developers can create more secure, maintainable, and reusable code.

### Interview Questions on Encapsulation in Java

1. **What is Encapsulation?**
   Encapsulation is one of the four fundamental OOP concepts. It is the technique of wrapping the data (variables) and the code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class are hidden from other classes, and can be accessed only through the methods of their current class.

2. **Why is Encapsulation important in Java?**
   Encapsulation is important because it provides the following benefits:
    - **Data Hiding**: Restricts direct access to data members (fields) of a class.
    - **Increased Flexibility**: Allows the developer to change one part of the code without affecting other parts.
    - **Improved Security**: Provides control over the data by restricting who can access it.
    - **Ease of Maintenance**: Encapsulated code is more flexible and easier to change with new requirements.

3. **How do you achieve Encapsulation in Java?**
   Encapsulation in Java is achieved by:
    - Declaring the class variables as `private`.
    - Providing `public` setter and getter methods to modify and view the variables' values.

4. **What is the difference between Encapsulation and Abstraction?**
   Encapsulation is the mechanism of hiding the data implementation by restricting access to public methods. Abstraction, on the other hand, is the concept of hiding the complex implementation details and showing only the necessary features of the object.

5. **Can you provide an example of Encapsulation in Java?**
   Yes, consider a `Student` class where the student's details are encapsulated.

   ```java
   public class Student {
       private String name;
       private int age;

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public int getAge() {
           return age;
       }

       public void setAge(int age) {
           if(age > 0) {
               this.age = age;
           } else {
               System.out.println("Age cannot be negative or zero.");
           }
       }
   }
   ```

6. **What are the benefits of using setter and getter methods in Encapsulation?**
   The benefits include:
    - **Control**: They allow control over the values. You can check if new values are valid before setting them.
    - **Flexibility**: You can change the value of a private field using the setter method without changing the way the field is used by the classes that use it.
    - **Security**: You can add security checks in setter methods to prevent unauthorized or harmful updates to the field.

7. **Is it possible to achieve Encapsulation without using setter and getter methods?**
   While setter and getter methods are a common way to achieve encapsulation, it's technically possible to achieve encapsulation without them by providing other public methods that offer controlled access to the class's internal state. However, this approach is less common and typically involves more complex operations than simply setting or getting a value.