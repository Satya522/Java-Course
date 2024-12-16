package JavaCourse.CoreJava.JavaMethods;

public class AboutMethods {
    public static void main(String[] args) {
        /*
        Methods ==> A method is a block of code which only runs when it is called.
        you can pass data, known as parameters, into a methods

        Function ==> WhenEver we create a method outside the class then it is called as function in Java. but if we
        create a method inside the class then it is called as method in Java.

        Syntax:
        <Access Modifier> <Return Type> <Method Name>(Parameter List) {
            // Method Body
        }

        Return Type ==> The return type is the data type of the value the method returns. if the method does not return
        a value, its return type is void.

        Access Modifier ==> It specifies the access type of the method. In Java, it is possible to specify the access
        for a method. If we don't use any access modifier, it will be treated as default by default.

        Method Name ==> This is the method name. The method signature consists of the method name and the parameter list.

        Parameter List ==> This is the list of parameters that the method takes. It is optional to have parameters in
        the method.

        Method Body ==> The method body is the block of code that the method executes. It is enclosed in braces.


        Types of Methods:
        1. User-Defined Method
        2. Predefined Method

        User-Defined Method ==> The method which is created by the user is called as User-Defined Method. We can create
        a method inside the class and outside the class.

        // Example of User-Defined Method
        int a = 10;
        int b = 20;
        int c = add(a, b);
        System.out.println("Sum of a and b is: " + c);

        public static int add(int a, int b) {
            return a + b;
        }


        Predefined Method ==> The method which is already defined in the Java Library is called as Predefined Method.

        // Example of Predefined Method
        int a = 10;
        int b = 20;
        int c = Math.addExact(a, b);
        System.out.println("Sum of a and b is: " + c);


        Note: We can call the User-Defined Method anywhere in the class but we can call the Predefined Method only in the
        class where it is defined.

       Parameters: A parameter is like a placeholder. When a method is invoked, you pass a value to the parameter. This
       value is referred to as actual parameter or argument. The parameter list refers to the type, order, and number of
       the parameters of a method. Parameters are optional; that is, a method may contain no parameters.

       Syntax:
       <Data Type> <Parameter Name>

       Method Overloading: When a class has two or more methods by the same name but different parameters, it is known
       as method overloading. It is different from overriding. In overriding, a method has the same method name, type, and
       parameters.

       Method Overloading Rules:
       1. Number of parameters.
       2. Data type of parameters.
       3. Sequence of Data type of parameters.

       // Example of Method Overloading
       public static void add(int a, int b) {
           System.out.println("Sum of a and b is: " + (a + b));
       }

       public static void add(int a, int b, int c) {
           System.out.println("Sum of a, b and c is: " + (a + b + c));
       }

       public static void add(int a, double b) {
           System.out.println("Sum of a and b is: " + (a + b));
       }

       public static void main(String[] args) {
           add(10, 20);
           add(10, 20, 30);
           add(10, 20.5);
       }

       Note: We can not overload the method by changing the return type of the method.

       Method Overriding: If a subclass provides a specific implementation of a method that is already provided by its
       parent class, it is known as Method Overriding. It is used for runtime polymorphism and to provide the specific
       implementation of the method.

       Method Overriding Rules:
       1. The method must have the same name as in the parent class.
       2. The method must have the same parameter as in the parent class.
       3. There must be an IS-A relationship (inheritance).

 ### Additional Notes on Java Methods

1. **Method Overloading**: We can overload methods in Java, which means creating multiple methods with the same name but different parameters.
    ```java
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
    ```

2. **Method Inside Another Method**: We can create a method inside another method in Java using local classes or lambda expressions.
    ```java
    public void outerMethod() {
        class InnerMethod {
            void inner() {
                System.out.println("Inner method");
            }
        }
        InnerMethod inner = new InnerMethod();
        inner.inner();
    }
    ```

3. **Method Inside Constructor**: We can create a method inside a constructor using local classes or lambda expressions.
    ```java
    public class Example {
        public Example() {
            class ConstructorMethod {
                void method() {
                    System.out.println("Method inside constructor");
                }
            }
            ConstructorMethod cm = new ConstructorMethod();
            cm.method();
        }
    }
    ```

4. **Method Inside Static Block**: We can create a method inside a static block using local classes or lambda expressions.
    ```java
    public class Example {
        static {
            class StaticBlockMethod {
                void method() {
                    System.out.println("Method inside static block");
                }
            }
            StaticBlockMethod sbm = new StaticBlockMethod();
            sbm.method();
        }
    }
    ```

5. **Method Inside Instance Block**: We can create a method inside an instance block using local classes or lambda expressions.
    ```java
    public class Example {
        {
            class InstanceBlockMethod {
                void method() {
                    System.out.println("Method inside instance block");
                }
            }
            InstanceBlockMethod ibm = new InstanceBlockMethod();
            ibm.method();
        }
    }
    ```

6. **Method Inside Interface**: We can create default and static methods inside an interface.
    ```java
    interface ExampleInterface {
        default void defaultMethod() {
            System.out.println("Default method in interface");
        }

        static void staticMethod() {
            System.out.println("Static method in interface");
        }
    }
    ```

7. **Method Inside Abstract Class**: We can create both abstract and concrete methods inside an abstract class.
    ```java
    abstract class ExampleAbstract {
        abstract void abstractMethod();

        void concreteMethod() {
            System.out.println("Concrete method in abstract class");
        }
    }
    ```

8. **Method Inside Enum**: We can create methods inside an enum.
    ```java
    enum ExampleEnum {
        INSTANCE;

        void enumMethod() {
            System.out.println("Method inside enum");
        }
    }
    ```

         */

        System.out.println("this is all about method in java");
    }
}
