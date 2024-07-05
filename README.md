# Welcome to Java-Course
This course covers Core Java, Advanced Java, and Data Structures and Algorithms in Java.

## Table of Contents

### Core Java
- [Java Introduction](#java-introduction)
- [Java Features](#java-features)
- [Java History](#java-history)
- [Java Environment Setup](#java-environment-setup)
- [Java Basic Syntax](#java-basic-syntax)
- [Java Basic Data Types](#Java-Basic-Datatypes)
- [Java Variable Types](#java-variable-types)
- [Java Modifier Types](#java-modifier-types)
- [Java Basic Operators](#java-basic-operators)
- [Java Loop Control](#java-loop-control)
- [Java Decision-Making](#java-decision-making)
- [Java Numbers](#java-numbers)
- [Java Characters](#java-characters)
- [Java Strings](#java-strings)
- [Java Arrays](#java-arrays)
- [Java Date & Time](#java-date-&-time)
- [Java Regular Expressions](#java-regular-expressions)
- [Java Methods](#java-methods)
- [Java Files & I/O](#java-files-&-i/o)
- [Java Exceptions](#java-exceptions)

#### OOPs Concepts
- [Java Object & Classes](#java-object-&-classes)
- [Java Inheritance](#java-inheritance)
- [Java Overriding](#java-overriding)
- [Java Polymorphism](#java-polymorphism)
- [Java Abstraction](#java-abstraction)
- [Java Encapsulation](#java-encapsulation)
- [Java Interfaces](#java-interfaces)

### Java Packages
- [Java Packages](#java-packages)

### Advanced Java
- [Java Data Structures](#java-data-structures)
- [Java Collections](#java-collections)
- [Java Generics](#java-generics)
- [Java Serialization](#java-serialization)
- [Java Networking](#java-networking)
- [Java Sending Email](#java-sending-email)
- [Java Multithreading](#java-multithreading)
- [Java Applet Basics](#java-applet-basics)
- [Java Documentation](#java-documentation)
- [Java Internationalization](#java-internationalization)

### Data Structures and Algorithms in Java
- [Arrays](#arrays)
- [Linked Lists](#linked-lists)
- [Stacks](#stacks)
- [Queues](#queues)
- [Trees](#trees)
- [Binary Trees](#binary-trees)
- [Binary Search Trees](#binary-search-trees)
- [Heaps](#heaps)
- [Graphs](#graphs)
- [Hashing](#hashing)
- [Sorting Algorithms](#sorting-algorithms)
- [Searching Algorithms](#searching-algorithms)
- [Dynamic Programming](#dynamic-programming)
- [Greedy Algorithms](#greedy-algorithms)
- [Divide and Conquer](#divide-and-conquer)
- [Backtracking](#backtracking)
- [String Algorithms](#string-algorithms)
- [Graph Algorithms](#graph-algorithms)
- [Geometric Algorithms](#geometric-algorithms)
- [Mathematical Algorithms](#mathematical-algorithms)
- [Randomized Algorithms](#randomized-algorithms)
- 
## 1.Introduction of Java
Java is a high-level programming language originally developed by Sun Microsystems and released in 1995. Java runs 
on a variety of platforms, such as Windows, macOS, and the various versions of UNIX. This tutorial gives a complete understanding of Java. This reference will take you through simple and practical approaches while learning Java Programming language.

## Java Features

1. **Simple**: Java is easy to learn and its syntax is clear and concise. It is based on C++ (so easier for programmers who know C++).

2. **Object-Oriented**: In Java, everything is an Object which has some data and behavior. Java can be easily extended as it is based on the Object model.

3. **Platform Independent**: Unlike other programming languages such as C, C++ etc. which are compiled into platform specific machines. Java is guaranteed to be write-once, run-anywhere language.

4. **Secured**: After compilation, Java code is converted into bytecode. This bytecode is not platform specific, and it is secured because bytecode is completely different from native machine code.

5. **Robust**: Java makes an effort to eliminate error-prone codes by emphasizing mainly on compile time error checking and runtime checking.

6. **Architecture-neutral**: There are no implementation dependent features (for example, the size of primitive types is set).

7. **Portable**: Java byte code can be carried to any platform. No implementation dependent features. Everything related to storage is predefined, example: size of primitive data types

8. **Dynamic**: Java is considered to be more dynamic than C or C++ since it is designed to adapt to an evolving environment. Java programs can carry an extensive amount of run-time information that can be used to verify and resolve accesses to objects at run-time.

9. **High Performance**: Java is an interpreted language, so it will never be as fast as a compiled language like C or C++. But, Java enables high performance with the use of just-in-time compiler.

10. **Distributed**: Java is designed for the distributed environment of the internet, because it handles TCP/IP protocols. It also includes the concept of the stub and skeleton.

11. **Multi-threaded**: With Java's multithreaded feature it is possible to write programs that can do many tasks simultaneously. The benefit of multithreading is that it utilizes the same memory and other resources to execute multiple threads at the same time, like While typing, grammatical errors are checked along.

## Java History
James Gosling initiated Java language project in June 1991 for use in one of his many set-top box projects. The language, initially called Oak after an oak tree that stood outside Gosling's office, also went by the name Green and ended up later being renamed as Java, from a list of random words. Sun released the first public implementation as Java 1.0 in 1995.

## Java Environment Setup
Java programming language uses this environment to run the program. The environment consists of the development tools that allow the programmer to write programs and create files for the program in the text editor.

## Installation of Java Development Kit (JDK)

1. **Download JDK**: Visit the official Oracle download page [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) and download the appropriate JDK version based on your operating system.

2. **Install JDK**: Run the downloaded installer and follow the instructions to install JDK on your machine.

## Setting up an Integrated Development Environment (IDE)

1. **Download IntelliJ IDEA**: Visit the official JetBrains download page [here](https://www.jetbrains.com/idea/download/) and download the appropriate version of IntelliJ IDEA based on your operating system and requirements (Community or Ultimate).

2. **Install IntelliJ IDEA**: Run the downloaded installer and follow the instructions to install IntelliJ IDEA on your machine.

## Configuring Environment Variables

1. **Set JAVA_HOME**:

 - **Windows**:
  - Right-click on 'My Computer' and select 'Properties'.
  - Click on 'Advanced System Settings'.
  - Click on 'Environment Variables'.
  - Click on 'New' under System variables.
  - Enter 'JAVA_HOME' as variable name and the path to your Java JDK directory as variable value (e.g., C:\Program Files\Java\jdk-11.0.1).

 - **macOS/Linux**:
  - Open Terminal.
  - Open .bash_profile file (or .bashrc file) in a text editor.
  - Add the following line at the end of the file: `export JAVA_HOME=/Library/Java/Home` (replace the path with your actual JDK path).
  - Save and close the file.
  - Run the following command to reload the profile: `source ~/.bash_profile` (or `source ~/.bashrc`).

1. **Update System PATH**:

 - **Windows**:
  - Follow the same steps as setting JAVA_HOME until you reach 'Environment Variables'.
  - Under 'System Variables', find the 'Path' variable, select it and click on 'Edit'.
  - In the 'Variable value' field, append the following: `;%JAVA_HOME%\bin`.

 - **macOS/Linux**:
  - Open Terminal.
  - Open .bash_profile file (or .bashrc file) in a text editor.
  - Add the following line at the end of the file: `export PATH=$PATH:$JAVA_HOME/bin`.
  - Save and close the file.
  - Run the following command to reload the profile: `source ~/.bash_profile` (or `source ~/.bashrc`).

After following these steps, you should have JDK installed, your IDE set up, and environment variables configured correctly.


## Java Basic syntax
Java's basic syntax is the set of rules defining how a Java program is written and interpreted. Here are some key points:

1. **Case Sensitivity**: Java is case-sensitive, which means the uppercase and lowercase letters are different. This means `Hello` and `hello` are different in Java.

2. **Class Names**: In Java, all class names should start with an uppercase letter. If several words are used to form the name of the class, the first letter of each inner word should be in uppercase. For example, `MyFirstJavaClass`.

3. **Method Names**: All method names should start with a lowercase letter. If several words are used to form the name of the method, then the first letter of each inner word should be in uppercase. For example, `myMethodName()`.

4. **File Names**: The name of the program file should exactly match the class name. When saving the file, you should save it using the class name and append `.java` to the end of the name. For example, if the class name is `MyFirstJavaClass`, then the file should be saved as `MyFirstJavaClass.java`.

5. **public static void main(String args[])**: Java program processing starts from the `main()` method which is a mandatory part of every Java program.

Here is a simple example of a Java program following these syntax rules:

```java
public class MyFirstJavaProgram {
    /* This is my first java program.
     * This will print 'Hello World' as the output
     */
    public static void main(String []args) {
        System.out.println("Hello World"); // prints Hello World
    }
}
```
In this example, `MyFirstJavaProgram` is the class name, `main` is the method name, `MyFirstJavaProgram.java` is the file name, and the program starts executing from the `main()` method.

## Java Data Types
In Java, there are eight basic data types, which are divided into two groups:

- Primitive Data Types: byte, short, int, long, float, double, boolean, char
- Non-primitive Data Types: String, Arrays, Classes, Interface, etc.

## 1.Primitive Data Types

- **byte**: The `byte` data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).

- **short**: The `short` data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).

- **int**: The `int` data type is a 32-bit signed two's complement integer, which has a minimum value of -2^31 and a maximum value of 2^31-1.

- **long**: The `long` data type is a 64-bit two's complement integer. The signed long has a minimum value of -2^63 and a maximum value of 2^63-1.

- **float**: The `float` data type is a single-precision 32-bit IEEE 754 floating point.

- **double**: The `double` data type is a double-precision 64-bit IEEE 754 floating point.

- **boolean**: The `boolean` data type has only two possible values: true and false.

- **char**: The `char` data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).

## Non-primitive Data Types

- **String**: The `String` data type is a sequence of characters. In Java, strings are immutable.

- **Arrays**: An array is a group of like-typed variables that are referred to by a common name.

- **Classes**: A class is a user defined blueprint or prototype from which objects are created.

- **Interface**: Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, nobody).


## Java Variable Types
A variable is a container that holds values that are used in java program.

In Java, there are three types of variables:

- Local Variables
- Instance Variables
- Static Variables


### Local Variables

Local variables are declared in methods, constructors, or blocks. They are created when the method, constructor or block is entered and the variable will be destroyed once it exits the method, constructor, or block. Access modifiers cannot be used for local variables.

### Instance Variables

Instance variables are declared in a class, but outside a method, constructor or any block. When a space is allocated for an object in the heap, a slot for each instance variable value is created. Instance variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed.

### Static Variables

Static variables are also known as Class variables. These variables are declared similarly as instance variables, the difference is that static variables are declared using the `static` keyword within a class outside any method constructor or block.

Here is an example of these variable types in Java:

```java
public class VariableTypes {
    // instance variable
    public String instanceVar = "I am an instance variable";

    // static variable
    public static String staticVar = "I am a static variable";

    public void method() {
        // local variable
        String localVar = "I am a local variable";
        System.out.println(localVar);
    }

    public static void main(String[] args) {
        VariableTypes obj = new VariableTypes();
        obj.method();
        System.out.println(obj.instanceVar);
        System.out.println(VariableTypes.staticVar);
    }
}
```
In this example, `localVar` is a local variable, `instanceVar` is an instance variable, and `staticVar` is a static variable.

# Modifier
In Java, a modifier is a keyword that you add to those definitions to change their meanings.Java language has a wide 
variety of modifiers, including the following:

## Java Modifier Types

In Java, there are two types of modifiers:

- Access Modifiers: public, protected, private, and default
- Non-access Modifiers: final, abstract, static, synchronized, volatile, transient, etc.

### Access Modifiers

- **public**: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

- **protected**: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.

- **private**: The access level of a private modifier is only within the class.

- **default**: The access level of a default modifier is only within the package. By default, all the classes, methods, and fields in a Java program are default if you do not specify any modifier.

### Non-access Modifiers

- **final**: The `final` keyword is used to restrict the user. The java final keyword can be used in many contexts such as final variable, final method, final class.

- **abstract**: The `abstract` keyword is used to declare abstract class. Abstract class can provide the implementation of interface. It can have abstract and non-abstract methods.

- **static**: The `static` keyword is used mainly for memory management. It can be used with variables, methods, blocks and nested classes.

- **synchronized**: The `synchronized` keyword is used to specify a block of code is synchronized which means that the lock for an object is obtained before executing the code.

- **volatile**: The `volatile` modifier is used to let the JVM know that a thread accessing the variable must always merge its own private copy of the variable with the master copy in the memory.

- **transient**: The `transient` keyword is used in serialization. If you define any data member as transient, it will not be serialized.


This section provides a basic understanding of Java modifier /types. It can be expanded with more details and examples as needed.

## JAVA BASIC OPERATORS

Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result.

Java provides a rich set of operators to manipulate variables. We can divide all the Java operators into the following groups:

- Arithmetic Operators
- Relational Operators
- Logical Operators
- Bitwise Operators
- Assignment Operators
- Misc Operators

### 1.Arithmetic Operators

Arithmetic operators are used in mathematical expressions in the same way that they are used in algebra. The following table lists the arithmetic operators:

- **+**: Adds two operands.
- **-**: Subtracts second operand from the first.
- **'*'**: Multiplies both operands.
- **/**: Divides numerator by de-numerator.
- **%**: Modulus Operator and remainder of after an integer division.

### 2.Relational Operators

There are following relational operators supported by Java language. All these operators return boolean value.

- **==**: Checks if the values of two operands are equal or not, if yes then condition becomes true.
- **!=**: Checks if the values of two operands are equal or not, if values are not equal then condition becomes true.
- **>:**: Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true.
- **<**: Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true.
- **>=**: Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true.
- **<=**: Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true.

### Logical Operators

There are following logical operators supported by Java language.

- **&&**: Called Logical AND operator. If both the operands are non-zero, then the condition becomes true.
- **||**: Called Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true.
- **!**: Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true, then Logical NOT operator will make false.

### 3.Bitwise Operators

Bitwise operator works on bits and performs bit-by-bit operation.

- **&**: Binary AND Operator copies a bit to the result if it exists in both operands.
- **|**: Binary OR Operator copies a bit if it exists in either operand.
- **^**: Binary XOR Operator copies the bit if it is set in one operand but not both.
- **~**: Binary Ones Complement Operator is unary and has the effect of 'flipping' bits.
- **<<**: Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand.
- **>>**: Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.
- **>>>**: Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros.

### 4.Assignment Operators

There are following assignment operators supported by Java language:

- **=**: Simple assignment operator. Assigns values from right side operands to left side operand.
- **+=**: Add AND assignment operator. It adds right operand to the left operand and assign the result to left operand.
- **-=**: Subtract AND assignment operator. It subtracts right operand from the left operand and assign the result to left operand.
- *****=: Multiply AND assignment operator. It multiplies right operand with the left operand and assign the result to left operand.
- **/=**: Divide AND assignment operator. It divides left operand with the right operand and assign the result to left operand.
- **%=**: Modulus AND assignment operator. It takes modulus using two operands and assign the result to left operand.
- **<<=**: Left shift AND assignment operator.
- **>>=**: Right shift AND assignment operator.
- **&=**: Bitwise AND assignment operator.
- **^=**: bitwise exclusive OR and assignment operator.
- **|=**: bitwise inclusive OR and assignment operator.

### Misc Operators

There are few other operators supported by Java Language.

- **?:**: Conditional Operator. It is also known as the ternary operator. This operator consists of three operands and is used to evaluate Boolean expressions. The goal of the operator is to decide, which value should be assigned to the variable.
- **instanceof**: The `instanceof` operator is used to check whether the object is an instance of the specified type (class or subclass or interface).

## Java Loop Control
In Java, loops are used to execute a set of statements repeatedly until a particular condition is satisfied. In programming languages, loops are used to execute a set of statements repeatedly until a particular condition is satisfied. Loops are used to execute a set of statements repeatedly until a particular condition is satisfied. The following types of loops are available in Java:

- for loop
- while loop
- do-while loop
- for-each loop

### for loop

The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop.

The syntax of for loop is:
```java
for(initialization;condition;incr/decr){  
//code to be executed  
}  
```
### while loop

The Java while loop is used to iterate a part of the program several times. If the number of iteration is not fixed, it is recommended to use while loop.

The syntax of while loop is:
```java
while(condition){  
//code to be executed  
}  
```
### do-while loop

The Java do-while loop is used to iterate a part of the program several times. If the number of iteration is not fixed, and you must have to execute the loop at least once, it is recommended to use do-while loop.

The syntax of do-while loop is:
```java
do{  
//code to be executed  
}while(condition);  

```
### for-each loop

Java provides a new method forEach() to iterate the elements. It is defined in Iterable and Stream interfaces. It is a default method defined in the Iterable interface. Collection classes which extends Iterable interface can use forEach loop to iterate elements.

The syntax of for-each loop is:

for(data_type variable : array | collection){  
//code to be executed  
}  

## Java Decision-Making
Decision-making is about deciding the order of execution of statements based on certain conditions or repeat a group 
of statements until certain specified conditions are met. In Java, decision-making can be implemented using the following statements:

- if statement
- if-else statement
- nested if statement
- switch statement

## if statement

The Java if statement is used to test the condition. It checks boolean condition: true or false. There are various types of if statement in Java.

## if-else statement

The Java if-else statement also tests the condition. It executes the if block if condition is true otherwise else block is executed.

## nested if statement

The Java nested if statement represents the if block within another if block. Here, the inner if block condition executes only when outer if block condition is true.

## switch statement

A switch statement allows a variable to be tested for equality against a list of values. Each value is called a case, and the variable being switched on is checked for each case.

The syntax of switch statement is:
```java
switch(expression){  
case value1:  
 //code to be executed;  
 break;  
case value2:  
 //code to be executed;  
 break;  
...  
default:   
 //code to be executed if all cases are not matched;  
}  

```

## Java Numbers
In Java, there are four types of numbers:

- Integer
- Floating-point
- Character
- Boolean

## Integer

Integer literals are integer values represented directly in the code without any special notation. Java supports four types of integer literals:

- Decimal: Base 10, whose digits consists of the numbers 0 through 9; this is the number system you use every day
- Hexadecimal: Base 16, whose digits consist of the numbers 0 through 9 and the letters A through F
- Octal: Base 8, whose digits consists of the numbers 0 through 7; this is not used often
- Binary: Base 2, whose digits consists of the numbers 0 and 1 (you can create binary literals in Java SE 7 and later)

## Floating-point

Floating-point literals are defined using decimal numbers or scientific notation.

## Character

Character literals are represented by single quotes. Character literals are enclosed in single quotes, such as 'A' or 'c':

## Boolean

A boolean literal can have any of the two values: true or false.

## Java Characters
In Java, a character is represented by the `char` data type. The `char` data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).

The char data type is used to store characters. For example, `char letter = 'A';`.

## Java Strings
In Java, a string is a sequence of characters. For example, `String str = "Hello World";`.

Strings are objects of type String, so they can be created using the String keyword and assigned to a variable of 
the same type. String objects are immutable which means that a constant cannot be changed once it has been created.

## Java Arrays 
In Java, an array is a group of like-typed variables that are referred to by a common name. Arrays in Java work differently than they do in C/C++. Following are some important point about Java arrays.

- In Java all arrays are dynamically allocated.(discussed below)
- Since arrays are objects in Java, we can find their length using the object property length. This is different from C/C++ where we find length using sizeof.
- A Java array variable can also be declared like other variables with [] after the data type.

## Declaring Array Variables

To use an array in a program, you must declare a variable to reference the array, and you must specify the type of array the variable can reference. Here is the syntax for declaring an array variable:

```java
dataType[] arrayRefVar;   // preferred way.
// or
dataType arrayRefVar[];  // works but not preferred way.
```
Note: The style `dataType[] arrayRefVar` is preferred. The style `dataType arrayRefVar[]` comes from the C/C++ language and was adopted in Java to accommodate C/C++ programmers.

## Creating Arrays

You can create an array by using the new operator with the following syntax:

```java
arrayRefVar = new dataType[arraySize];
```
The above statement does two things:

- It creates an array using new dataType[arraySize].
- It assigns the reference of the newly created array to the variable arrayRefVar.

Declaring an array variable, creating an array, and assigning the reference of the array to the variable can be combined in one statement, as shown below:

```java
dataType[] arrayRefVar = new dataType[arraySize];
```
Alternatively, you can create arrays as follows:

```java
dataType[] arrayRefVar = {value0, value1, ..., valuek};
```
The array elements are accessed through the index. Array indices are 0-based; that is, they start from 0 to arrayRefVar.length-1.

```java
dataType[] arrayRefVar = new dataType[arraySize];
```
The above statement does two things:

- It creates an array using new dataType[arraySize].
- It assigns the reference of the newly created array to the variable arrayRefVar.

Declaring an array variable, creating an array, and assigning the reference of the array to the variable can be combined in one statement, as shown below:

```java
dataType[] arrayRefVar = new dataType[arraySize];
```
Alternatively, you can create arrays as follows:

```java
dataType[] arrayRefVar = {value0, value1, ..., valuek};
```
The array elements are accessed through the index. Array indices are 0-based; that is, they start from 0 to arrayRefVar.length-1.

## Array Examples

Here are some examples of declaring, creating, and initializing arrays:

```java

int[] intArray = new int[10];
char[] charArray = new char[10];
byte[] byteArray = new byte[10];
short[] shortArray = new short[10];
long[] longArray = new long[10];
float[] floatArray = new float[10];
double[] doubleArray = new double[10];
boolean[] booleanArray = new boolean[10];
String[] stringArray = new String[10];
```
Alternatively, you can also create arrays as follows:

```java
int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
char[] charArray = new char[]{ 'a', 'b', 'c', 'd' };
```
You can also declare an array of arrays (also known as a multidimensional array) by using two or more sets of square brackets, such as String[][] names. Each element, therefore, must be accessed by a corresponding number of index values.

Here is an example of a two-dimensional array:

```java
int[][] intArray = new int[10][20];
```

## Java Date & Time

In Java, the `java.util` package contains classes for date and time manipulation. These classes provide a platform-independent and comprehensive date and time model that can be used for a wide range of application.

### Date

The `java.util.Date` class represents date and time in java. It provides constructors and methods to deal with date and time in java.

The `java.util` package provides the `Date` class available in java.util package, this class encapsulates the current date and time.

The `Date` class supports two constructors as shown in the following table.

| Constructor          | Description                                                                          

| `Date( )`            | This constructor initializes the object with the current date and time.               

| `Date(long millisec)`| This constructor accepts an argument that equals the number of milliseconds that have elapsed since midnight, January 1, 1970. |

## Java Methods
In Java, a method is a set of code which is referred to by name and can be called (invoked) at any point in a program simply by utilizing the method's name.

#### Declaring Methods

The method declaration provides information about the method name, return type, and parameters. The method body contains the code to be executed.

The following method prints the string "Hello World!" to the console:

```java

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
In this example, `public` is an access modifier, `static` is a keyword that indicates that the method can be accessed without creating an instance of the class, `void` indicates that the method has no return value, `main` is the name of the method, and `String[] args` declares a parameter named args, which is an array of instances of the class String.

#### Calling Methods

You can call a method by its name. Following is an example of a method call:

```java

public class Main {
    public static void main(String[] args) {
        myMethod();
    }

    static void myMethod() {
        System.out.println("Hello World!");
    }
}
```
In this example, the method `myMethod()` is called from the `main()` method.

## Method Parameters

Information can be passed to methods as parameter. Parameters act as variables inside the method.

The following example has a method that takes a String called fname as parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name:

```java

public class Main {
    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }

    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }
}
```
#### Return Values

A method can return a value. For example, the following method returns the sum of its two parameters:

```java

public class Main {
    public static void main(String[] args) {
        int x = myMethod(5, 3);
        System.out.println(x);
    }

    static int myMethod(int x, int y) {
        return x + y;
    }
}
```
#### Method Overloading

Java allows method overloading, that is, methods within the same class that share the same name, as long as their parameter declarations are different.

## Recursion

In Java, a method that calls itself is known as a recursive method. And, this technique is known as recursion.

```java

public class Main {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
```
## Passing Parameters by Value

In Java, parameters of primitive data type are passed into methods by value. This means that when a method returns, the passed-in parameter still exists and retains its original value.

## Passing Parameters by Reference

In Java, parameters of reference data type are passed into methods by value. This means that when a method returns, the passed-in reference still references the same object as before. However, the values of the object's fields can be changed in the method, if they have the proper access level.

### Java Files and I/O

The java.io package contains nearly every class you might ever need to perform input and output (I/O) in Java. All these streams represent an input source and an output destination. The stream in the java.io package supports many data such as primitives, object, localized characters, etc.

### Stream

A stream can be defined as a sequence of data. There are two kinds of Streams −

- **InPutStream**: The InputStream is used to read data from a source.
- **OutPutStream**: The OutputStream is used for writing data to a destination.

### Byte Streams

Java byte streams are used to perform input and output of 8-bit bytes. Though there are many classes related to byte streams but the most frequently used classes are, `FileInputStream` and `FileOutputStream`. Following is an example which makes use of these two classes to copy an input file into an output file:

```java

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
```
### Character Streams

Java Byte streams are used to perform input and output of 8-bit bytes, whereas Java Character streams are used to perform input and output for 16-bit unicode. Though there are many classes related to character streams but the most frequently used classes are, `FileReader` and `FileWriter`. Following is an example which makes use of these two classes to copy an input file into an output file:

```java

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
```
#### Buffered Streams

Java byte streams are used to perform input and output of 8-bit bytes. Though there are many classes related to byte streams but the most frequently used classes are, `BufferedInputStream` and `BufferedOutputStream`. Following is an example which makes use of these two classes to copy an input file into an output file:

```java

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        try {
            in = new BufferedInputStream(new FileInputStream("input.txt"));
            out = new BufferedOutputStream(new FileOutputStream("output.txt"));

            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
```
#### Standard Streams

All the programming languages provide support for standard I/O where the user's program can take input from a keyboard and then produce an output on the computer screen. Java provides the following three standard streams:

- **Standard Input**: This is used to feed the data to user's program and usually a keyboard is used as standard input stream and represented as `System.in`.
- **Standard Output**: This is used to output the data produced by the user's program and usually a computer screen is used for standard output stream and represented as `System.out`.
- **Standard Error**: This is used to output the error data produced by the user's program and usually a computer screen is used for standard error stream and represented as `System.err`.

#### File

The `java.io.File` class is an abstract representation of file and directory pathnames.

#### File Class Constructors

The File class contains four constructors that you can use to create a File object.

| Constructor                    | Description                                                                            
| File(String pathname)          | Creates a File object by converting the given pathname string into an abstract pathname. 
| File(String parent, String child) | Creates a new File instance from a parent pathname string and a child pathname string. 
| File(File parent, String child)   | Creates a new File instance from a parent abstract pathname and a child pathname string. 
| File(URI uri)                     | Creates a new File instance by converting the given file: URI into an abstract pathname. 

#### File Class Methods

The File class defines the following methods for finding out about a file or directory:

| Method                       | Description                                                                            
| canExecute()                 | Tests whether the application can execute the file denoted by this abstract pathname.


| canRead()                    | Tests whether the application can read the file denoted by this abstract pathname. 


| canWrite()                   | Tests whether the application can modify the file denoted by this abstract pathname. 


| compareTo(File pathname)     | Compares two abstract pathnames lexicographically.                               


| createNewFile()              | Atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.


| delete()                     | Deletes the file or directory denoted by this abstract pathname.                   


| equals(Object obj)           | Tests this abstract pathname for equality with the given object.                  


| exists()                     | Tests whether the file or directory denoted by this abstract pathname exists.     


| getAbsolutePath()            | Returns the absolute pathname string of this abstract pathname.                    


| getCanonicalFile()           | Returns the canonical form of this abstract pathname.                              


| getCanonicalPath()           | Returns the canonical pathname string of this abstract pathname.                   


| getName()                    | Returns the name of the file or directory denoted by this abstract pathname.       


| getParent()                  | Returns the pathname string of this abstract pathname's parent, or null if this pathname does not name a parent directory. 


| getParentFile()              | Returns the abstract pathname of this abstract pathname's parent, or null if this pathname does not name a parent directory. 


| getPath()                    | Converts this abstract pathname into a pathname string.                             


| hashCode()                   | Computes a hash code for this abstract pathname.                                  


| isAbsolute()                 | Tests whether this abstract pathname is absolute.                                   


| isDirectory()                | Tests whether the file denoted by this abstract pathname is a directory.           


| isFile()                     | Tests whether the file denoted by this abstract pathname is a normal file.         


| isHidden()                   | Tests whether the file named by this abstract pathname is a hidden file.           


| lastModified()               | Returns the time that the file denoted by this abstract pathname was last modified.  


| length()                     | Returns the length of the file denoted by this abstract pathname.                       


| list()                       | Returns an array of strings naming the files and directories in the directory denoted by this abstract pathname. 


| list(FilenameFilter filter)  | Returns an array of strings naming the files and directories in the directory 
denoted by this abstract pathname that satisfy the specified filter.


| listFiles()                  | Returns an array of abstract pathnames denoting the files in the directory denoted by this abstract pathname. 


| listFiles(FileFilter filter) | Returns an array of abstract pathnames denoting the files and directories in the directory denoted by this abstract pathname that satisfy the specified filter. 


| listFiles(FilenameFilter filter) | Returns an array of abstract pathnames denoting the files and directories in the directory denoted by this abstract pathname that satisfy the specified filter. 


| mkdir()                      | Creates the directory named by this abstract pathname.                               


| mkdirs()                     | Creates the directory named by this abstract pathname, including any necessary but nonexistent parent directories. 


| renameTo(File dest)          | Renames the file denoted by this abstract pathname.                                


| setExecutable(boolean executable) | A convenience method to set the owner's execute permission for this abstract pathname. 


| setExecutable(boolean executable, boolean ownerOnly) | A convenience method to set the owner's or everybody's execute permission for this abstract pathname. 


| setLastModified(long time)   | Sets the last-modified time of the file or directory named by this abstract pathname.   


| setReadable(boolean readable) | A convenience method to set the owner's read permission for this abstract pathname.   


| setReadable(boolean readable, boolean ownerOnly) | A convenience method to set the owner's or everybody's read permission for this abstract pathname. 


| setReadOnly()                | Marks the file or directory named by this abstract pathname so that only read operations are allowed. 


| setWritable(boolean writable) | A convenience method to set the owner's write permission for this abstract pathname. 


| setWritable(boolean writable, boolean ownerOnly) | A convenience method to set the owner's or everybody's write permission for this abstract pathname. 


| toPath()                     | Returns a java.nio.file.Path object constructed from the this abstract path.       


| toString()                   | Returns the pathname string of this abstract pathname.                                 


| toURI()                      | Constructs a file: URI that represents this abstract pathname.                     


| toURL()                      | Deprecated. This method does not automatically escape characters that are illegal in URLs. It is recommended that new code convert an abstract pathname into a URL by first converting it into a URI, via the toURI method, and then converting the URI into a URL via the URI.toURL method. 


| static File[] listRoots()    | List the available filesystem roots.                                                   

### File Class Example

```java

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\MyName\\Documents\\filename.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not found!");
        }
    }
}
```
### File Class Example

```java

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\MyName\\Documents\\filename.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not found!");
        }
    }
}
```
### File Class Example

```java

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\MyName\\Documents\\filename.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not found!");
        }
    }
}
```
#### File Class Example

```java

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\MyName\\Documents\\filename.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not found!");
        }
    }
}
```
#### File Class Example

```java

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\MyName\\Documents\\filename.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not found!");
        }
    }
}
```
#### File Class Example

```java

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\MyName\\Documents\\filename.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not found!");
        }
    }
}
```
#### File Class Example

```java

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\MyName\\Documents\\filename.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not found!");
        }
    }
}
```
#### File Class Example

```java

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\MyName\\Documents\\filename.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not found!");
        }
    }
}
```

## Java Exceptions

In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.

### Exception Handling

Java provides a robust and object-oriented solution to handle exception scenarios known as Java Exception Handling. The core advantage of exception handling is to maintain the normal flow of the application. An exception normally disrupts the normal flow of the application that is why we use exception handling.

### Exception Hierarchy

All exception classes are subtypes of the `java.lang.Exception` class. The exception class is a subclass of the Throwable class. Other than the exception class, there is another subclass called Error which is derived from the Throwable class.

Errors are abnormal conditions that happen in case of severe failures, these are not handled by the Java programs. Errors are generated to indicate errors generated by the runtime environment. Example: JVM is out of memory. Normally, programs cannot recover from errors.

Exceptions are conditions that occur because of bad input or human error etc. e.g. FileNotFoundException will be thrown if the specified file does not exist. Exceptions can be handled by using `try-catch` block in Java. Exceptions are divided into two categories:

- **Checked Exceptions**: The classes that extend Throwable class except RuntimeException and Error are known as checked exceptions e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.
- **Unchecked Exceptions**: The classes that extend RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

### Catching Exceptions

The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

The try and catch keywords come in pairs:

```java

try {
  //  Block of code to try
}
catch(Exception e) {
  //  Block of code to handle errors
}
```
### Multiple Catch Blocks

A try block can be followed by one or more catch blocks. Each catch block must contain a different exception handler. When an exception occurs in the try block, the corresponding catch block that handles that particular exception executes. Here is an example that demonstrates this:

```java

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
```
### The finally Keyword

The finally statement lets you execute code, after try...catch, regardless of the result.

```java

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
```
### Throw

The throw statement allows you to create a custom error. The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.

The exception type chosen determines the type of exception that is thrown. Here is an example of throwing an exception when trying to access an array element that does not exist:

```java

import java.io.*;

public class Main {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(15); // Set age to 15 (which is below 18...)
    }
}
```
### Throws

The throws keyword indicates that a method may throw an exception. It gives an information to the programmer that there may occur an exception so it is better for the programmer to provide the exception handling code so that normal flow can be maintained.

### Java Finally

The finally keyword is used to create a block of code that follows a try block. A finally block of code always executes, whether or not an exception has occurred.

Using a finally block allows you to run any cleanup-type statements that you want to execute, no matter what happens in the protected code.

A finally block appears at the end of the catch blocks and has the following syntax:

```java

finally {
  // Block of code to be executed
}
```
## Java Try with Resources

Java provides a new feature called try-with-resources. This feature enables us to declare resources to be used in a try block with the assurance that the resources will be closed when after the execution of that block.

The try-with-resources statement is a try statement that declares one or more resources. The resource is as an object that must be closed after finishing the program. The try-with-resources statement ensures that each resource is closed at the end of the statement execution.

Any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable, can be used as a resource.

The try-with-resources statement is available since Java 7. Following is the syntax of try-with-resources statement.

```java

try(declaration) {
   // Body of catch
}
```
#### Java Custom Exception

In Java, it is also possible to define custom exceptions. In fact, you can create as many custom exception classes as you wish and use them to throw exceptions whenever you like, or to have your methods throw them. Creating your own exception classes enables you to treat exceptions of your own type just like the standard Java exceptions.

All exceptions must be a child of Throwable.

If you want to write a checked exception that is automatically enforced by the Handle or Declare Rule, you need to extend the Exception class.

If you want to write a runtime exception, you need to extend the RuntimeException class.

#### Java Exception Handling Keywords

| Keyword   | Description                                                                            
| try       | The "try" keyword is used to specify a block where we should place exception code. The try block must be followed by either catch or finally. It means, we can't use try block alone. 
| catch     | The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.
| finally   | The "finally" block is used to execute the important code of the program. It is executed whether an exception is handled or not. 
| throw     | The "throw" keyword is used to throw an exception. 
| throws    | The "throws" keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with method signature. 
| finally   | The "finally" keyword is used to execute the important code of the program. It is executed whether an exception is handled or not. 

### Java Lambda Expressions

Lambda expression is a new and important feature of Java which was included in Java SE 8. It provides a clear and concise way to represent one method interface using an expression. It is very useful in collection library in case of iterating, filtering etc. It enables to treat functionality as a method argument, or code as data.

#### Lambda Expression Syntax

```java

(parameters) -> expression
or
(parameters) -> { statements; }
```
#### Java Lambda Expression Example

```java

interface Drawable {
    public void draw();
}

public class Main {
    public static void main(String[] args) {
        int width = 10;

        //without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
    }
}
```
#### Java Lambda Expression Example

```java

interface Drawable {
    public void draw();
}

public class Main {
    public static void main(String[] args) {
        int width = 10;

        //with lambda
        Drawable d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
```
#### Java Lambda Expression Example

```java

interface Sayable {
    public String say(String name);
}

public class Main {
    public static void main(String[] args) {

        // Lambda expression with single parameter.
        Sayable s1 = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(s1.say("Sonoo"));

        // You can omit function parentheses    
        Sayable s2 = name -> {
            return "Hello, " + name;
        };
        System.out.println(s2.say("Sonoo"));
    }
}
```
#### Java Lambda Expression Example

```java

interface Addable {
    int add(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        // Lambda expression with multiple arguments.
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Lambda expression with return keyword.
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(100, 200));
    }
}
```
#### Java Lambda Expression Example

```java

interface Addable {
    int add(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        // Lambda expression without return keyword.
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Lambda expression with return keyword.
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(100, 200));
    }
}
```
#### Java Lambda Expression Example

```java

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach((n) -> System.out.println(n));
    }
}
```
#### Java Lambda Expression Example

```java

interface Addable {
    int add(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Multiple parameters with data type in lambda expression
        Addable ad2 = (int a, int b) -> (a + b);
        System.out.println(ad2.add(100, 200));
    }
}
```
#### Java Lambda Expression Example

```java

interface Sayable {
    String say(String message);
}

public class Main {
    public static void main(String[] args) {

        // You can pass multiple statements in lambda expression    
        Sayable person = (message) -> {
            String str1 = "I would like to say, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("time is precious."));
    }
}
```
#### Java Lambda Expression Example

```java

interface Addable {
    int add(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        // Multiple parameters with data type in lambda expression
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(100, 200));
    }
}
```
#### Java Lambda Expression Example

```java

interface Sayable {
    String say(String message);
}

public class Main {
    public static void main(String[] args) {

        // Lambda expression without return keyword.
        Sayable person = (message) -> {
            String str1 = "I would like to say, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("time is precious."));
    }
}
```
#### Java Lambda Expression Example

```java

interface Sayable {
    String say();
}

public class Main {
    public static void main(String[] args) {

        // You can omit function parentheses    
        Sayable person = () -> {
            return "I have nothing to say.";
        };
        System.out.println(person.say());
    }
}
```
#### Java Lambda Expression Example

```java

interface Sayable {
    String say();
}

public class Main {
    public static void main(String[] args) {

        // You can omit function parentheses    
        Sayable person = () -> "I have nothing to say.";
        System.out.println(person.say());
    }
}
```
#### Java Lambda Expression Example

```java

interface Sayable {
    String say();
}

public class Main {
    public static void main(String[] args) {

        // You can omit function parentheses    
        Sayable person = () -> "I have nothing to say.";
        System.out.println(person.say());
    }
}
```
#### Java Lambda Expression Example

```java

interface Sayable {
    String say();
}

public class Main {
    public static void main(String[] args) {

        // You can omit function parentheses    
        Sayable person = () -> "I have nothing to say.";
        System.out.println(person.say());
    }
}
```
#### Java Lambda Expression Example

```java

interface Sayable {
    String say();
}

public class Main {
    public static void main(String[] args) {

        // You can omit function parentheses    
        Sayable person = () -> "I have nothing to say.";
        System.out.println(person.say());
    }
}
```
#### Java Lambda Expression Example

```java

interface Sayable {
    String say();
}

public class Main {
    public static void main(String[] args) {

        // You can omit function parentheses    
        Sayable person = () -> "I have nothing to say.";
        System.out.println(person.say());
    }
}
```
#### Java Lambda Expression Example

```java

interface Sayable {
    String say();
}

public class Main {
    public static void main(String[] args) {

        // You can omit function parentheses    
        Sayable person = () -> "I have nothing to say.";
        System.out.println(person.say());
    }
}
```
#### Java Lambda Expression Example

```java

interface Sayable {
    void say();
}

public class Main {
    public static void main(String[] args) {

        // You can pass multiple statements in lambda expression    
        Sayable person = () -> {
            System.out.println("I have nothing to say.");
            System.out.println("This is another line of code.");
        };
        person.say();
    }
}
```
#### Java Lambda Expression Example

```java

interface Addable {
    int add(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Multiple parameters with data type in lambda expression
        Addable ad2 = (int a, int b) -> (a + b);
        System.out.println(ad2.add(100, 200));
    }
}
```
#### Java Lambda Expression Example

```java

interface Sayable {
    String say();
}

public class Main {
    public static void main(String[] args) {

        // You can pass multiple statements in lambda expression    
        Sayable person = () -> {
            String str1 = "I have nothing to say.";
            String str2 = str1 + "This is another line of code.";
            return str2;
        };
        System.out.println(person.say());
    }
}
```
#### Java Lambda Expression Example

```java

interface Addable {
    int add(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Multiple parameters with data type in lambda expression
        Addable ad2 = (int a, int b) -> (a + b);
        System.out.println(ad2.add(100, 200));
    }
}
```
#### Java Lambda Expression Example

```java

interface Addable {
    int add(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Multiple parameters with data type in lambda expression
        Addable ad2 = (int a, int b) -> (a + b);
        System.out.println(ad2.add(100, 200));
    }
}
```
#### Java Lambda Expression Example

```java

interface Drawable {
    public void draw();
}

public class Main {
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Drawable d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
```
#### Java Lambda Expression Example

```java

interface Drawable {
    public void draw();
}

public class Main {
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Drawable d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
```
#### Java Lambda Expression Example

```java

interface Drawable {
    public void draw();
}

public class Main {
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Drawable d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
```
#### Java Lambda Expression Example

```java

interface Drawable {
    public void draw();
}

public class Main {
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Drawable d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
```
#### Java Lambda Expression Example

```java

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach((n) -> System.out.println(n));
    }
}
```
#### Java Lambda Expression Example

```java

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach((n) -> System.out.println(n));
    }
}
```
#### Java Lambda Expression Example

```java

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach((n) -> System.out.println(n));
    }
}
```
#### Java Lambda Expression Example

```java

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach((n) -> System.out.println(n));
    }
}
```
#### Java Lambda Expression Example

```java

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach((n) -> System.out.println(n));
    }
}
```
#### Java Lambda Expression Example

```java

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach((n) -> System.out.println(n));
    }
}
```

### Java Date and Time

Java provides the Date class available in java.util package, this class encapsulates the current date and time.

The Date class supports two constructors as shown in the following table.

| Constructor                    | Description                                                                            
| Date()                         | This constructor initializes the object with the current date and time. 


| Date(long millisec)            | This constructor accepts an argument that equals the number of milliseconds that have elapsed since midnight, January 1, 1970. 

## Getting Current Date and Time

The `java.util` package contains three classes to represent date and time. These classes are `java.util.Date`, `java.util.Calendar` and `java.util.TimeZone`.

The `java.util.Date` class represents date and time in java. It provides constructors and methods to deal with date and time in java.

The `java.util.Date` class implements Serializable, Cloneable and Comparable interface. It is inherited by java.sql.Date, java.sql.Time and java.sql.Timestamp interfaces.

#### Java Date and Time Example

```java

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
    }
}
```
#### Java Date and Time Example

```java

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
    }
}
```
#### Java Date and Time Example

```java

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
    }
}
```
#### Java Date and Time Example

```java

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
    }
}
```
#### Java Date and Time Example

```java

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
    }
}
```
#### Java Date and Time Example

```java

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
    }
}
```
#### Java Date and Time Example

```java

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
    }
}
```

### Java Regular Expressions

A regular expression is a special sequence of characters that helps you match or find other strings or sets of strings, using a specialized syntax held in a pattern. They can be used to search, edit, or manipulate text and data.

#### Java Regex

The `java.util.regex` package primarily consists of the following three classes −

- **Pattern Class**: A `Pattern` object is a compiled representation of a regular expression. The `Pattern` class provides no public constructors. To create a pattern, you must first invoke one of its public static `compile()` methods, which will then return a `Pattern` object. These methods accept a regular expression as the first argument.
- **Matcher Class**: A `Matcher` object is the engine that interprets the pattern and performs match operations against an input string. Like the `Pattern` class, `Matcher` defines no public constructors. You obtain a `Matcher` object by invoking the `matcher()` method on a `Pattern` object.
- **PatternSyntaxException**: A `PatternSyntaxException` object is an unchecked exception that indicates a syntax error in a regular expression pattern.

#### Java Regex Example

```java

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        // 1st way  
        Pattern p = Pattern.compile(".s");//. represents single character  
        Matcher m = p.matcher("as");
        boolean b = m.matches();

        // 2nd way  
        boolean b2 = Pattern.compile(".s").matcher("as").matches();

        // 3rd way  
        boolean b3 = Pattern.matches(".s", "as");

        System.out.println(b + " " + b2 + " " + b3);
    }
}
```
#### Java Regex Example

```java

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
    }
}
```
#### Java Regex Example

```java

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("? quantifier ....");
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  

        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  

        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)  
    }
}
```

### Java Inner Classes

A class i.e. created inside a method is called local inner class in java. If you want to invoke the methods of local inner class, you must instantiate this class inside the method.

#### Java Local Inner Class Example

```java

public class Main {
    private int data = 30;//instance variable

    void display() {
        class Local {
            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.display();
    }
}
```
#### Java Local Inner Class Example

```java

public class Main {
    private int data = 30;//instance variable

    void display() {
        class Local {
            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.display();
    }
}
```
#### Java Local Inner Class Example

```java

public class Main {
    private int data = 30;//instance variable

    void display() {
        class Local {
            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.display();
    }
}
```
#### Java Local Inner Class Example

```java

public class Main {
    private int data = 30;//instance variable

    void display() {
        class Local {
            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.display();
    }
}
```
#### Java Local Inner Class Example

```java

public class Main {
    private int data = 30;//instance variable

    void display() {
        class Local {
            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.display();
    }
}
```
#### Java Local Inner Class Example

```java

public class Main {
    private int data = 30;//instance variable

    void display() {
        class Local {
            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.display();
    }
}
```

## Java Inheritance

Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another. With the use of inheritance the information is made manageable in a hierarchical order.

The class which inherits the properties of other is known as subclass (derived class, child class) and the class whose properties are inherited is known as superclass (base class, parent class).

The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.

Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

#### Why use inheritance in Java

For Method Overriding (so runtime polymorphism can be achieved).
For Code Reusability.

#### Java Inheritance Example

```java

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
```
#### Java Inheritance Example

```java

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
```
#### Java Inheritance Example

```java

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
```
#### Java Inheritance Example

```java

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
```
#### Java Inheritance Example

```java

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
```
#### Java Inheritance Example

```java

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
```

## Java Polymorphism

Polymorphism in Java is a concept by which we can perform a single action in different ways.

Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.

There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. We can perform polymorphism in java by method overloading and method overriding.

If you overload static method in Java, it is the example of compile time polymorphism. Here, we will focus on runtime polymorphism in java.

#### Runtime Polymorphism in Java

Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.

In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.

Let's first understand the upcasting before Runtime Polymorphism.

#### Upcasting in Java

When reference variable of Parent class refers to the object of Child class, it is known as upcasting. For example:

```java

class A {
}

class B extends A {
}

class C extends A {
}

class D {
    public static void main(String args[]) {
        A a = new B();
        A a2 = new C();
    }
}
```
#### Java Runtime Polymorphism Example

```java

class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
    }
}
```
#### Java Runtime Polymorphism Example

```java

class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
    }
}
```
### Java Runtime Polymorphism Example

```java

class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
    }
}
```
### Java Runtime Polymorphism Example

```java

class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
    }
}
```
#### Java Runtime Polymorphism Example

```java

class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
    }
}
```
#### Java Runtime Polymorphism Example

```java

class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
    }
}
```

## Java Abstraction

Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.

Abstraction lets you focus on what the object does instead of how it does it.

Ways to achieve Abstraction

There are two ways to achieve abstraction in java

Abstract class (0 to 100%)
Interface (100%)

#### Abstract class in Java

A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.

#### Points to Remember

- An abstract class must be declared with an abstract keyword.
- It can have abstract and non-abstract methods.
- It cannot be instantiated.
- It can have constructors and static methods also.
- It can have final methods which will force the subclass not to change the body of the method.

## Abstract class in Java Example

```java

abstract class Bike {
    abstract void run();
}

class Honda4 extends Bike {
    void run() {
        System.out.println("running safely..");
    }

    public static void main(String args[]) {
        Bike obj = new Honda4();
        obj.run();
    }
}
```
## Abstract class in Java Example

```java

abstract class Bike {
    abstract void run();
}

class Honda4 extends Bike {
    void run() {
        System.out.println("running safely..");
    }

    public static void main(String args[]) {
        Bike obj = new Honda4();
        obj.run();
    }
}
```
#### Abstract class in Java Example

```java

abstract class Bike {
    abstract void run();
}

class Honda4 extends Bike {
    void run() {
        System.out.println("running safely..");
    }

    public static void main(String args[]) {
        Bike obj = new Honda4();
        obj.run();
    }
}
```
#### Abstract class in Java Example

```java

abstract class Bike {
    abstract void run();
}

class Honda4 extends Bike {
    void run() {
        System.out.println("running safely..");
    }

    public static void main(String args[]) {
        Bike obj = new Honda4();
        obj.run();
    }
}
```
#### Abstract class in Java Example

```java

abstract class Bike {
    abstract void run();
}

class Honda4 extends Bike {
    void run() {
        System.out.println("running safely..");
    }

    public static void main(String args[]) {
        Bike obj = new Honda4();
        obj.run();
    }
}
```
#### Abstract class in Java Example

```java

abstract class Bike {
    abstract void run();
}

class Honda4 extends Bike {
    void run() {
        System.out.println("running safely..");
    }

    public static void main(String args[]) {
        Bike obj = new Honda4();
        obj.run();
    }
}
```

### Java Encapsulation

Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.

The Java Bean class is the example of a fully encapsulated class.

#### Java Encapsulation Example

```java

public class Main {
    private String name;

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
}
```
#### Java Encapsulation Example

```java

public class Main {
    private String name;

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
}
```
#### Java Encapsulation Example

```java

public class Main {
    private String name;

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
}
```
#### Java Encapsulation Example

```java

public class Main {
    private String name;

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
}
```
#### Java Encapsulation Example

```java

public class Main {
    private String name;

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
}
```
#### Java Encapsulation Example

```java

public class Main {
    private String name;

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
}
```

### Java Packages

A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

Built-in Packages (packages from the Java API)
User-defined Packages (create your own packages)
To use a package, we need to use the `import` keyword. It is placed at the top of the source file. Import also helps to improve the readability of the source code.

#### Built-in Packages

The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment.

The library contains components for managing input, database programming, and much much more. The complete list can be found at Oracles website: https://docs.oracle.com/javase/8/docs/api/.

#### User-defined Packages

To create your own package, you need to understand that Java uses a file system directory to store them. Just like folders on your computer, packages are used to store Java classes.

For example, suppose we have created a package named `package_name`, this will require us to create a new folder with the name `package_name` and place all the Java source files inside that folder.

#### Creating a Package

To create a package, you choose a name for the package (naming conventions are discussed later in this text) and put a `package` statement with that name at the top of every source file that contains the classes, interfaces, enumerations, and annotation types that you want to include in the package.

The `package` statement should be the first line in the source file. There can be only one package statement in each source file, and it applies to all types in the file.

#### Example

```java

package mypack;

class A {
    public void msg() {
        System.out.println("Hello");
    }
}
``` 
#### Example

```java

package mypack;

class A {
    public void msg() {
        System.out.println("Hello");
    }
}
``` 
#### Example

```java

package mypack;

class A {
    public void msg() {
        System.out.println("Hello");
    }
}
``` 
#### Example

```java

package mypack;

class A {
    public void msg() {
        System.out.println("Hello");
    }
}
``` 
#### Example

```java

package mypack;

class A {
    public void msg() {
        System.out.println("Hello");
    }
}
``` 
#### Example

```java

package mypack;

class A {
    public void msg() {
        System.out.println("Hello");
    }
}
``` 

### Java Interface

In Java, an interface can be defined as a contract between objects on how to communicate with each other. Interfaces play a vital role when it comes to the concept of inheritance.

An interface defines the methods, a deriving class (subclass) should use. But the implementation of the methods is totally up to the subclass.

#### Why use interfaces?

- It is used to achieve total abstraction.
- Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance .
- It is also used to achieve loose coupling.

#### Java Interface Example

```java

interface Printable {
    void print();
}

class A6 implements Printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        A6 obj = new A6();
        obj.print();
    }
}
```
#### Java Interface Example

```java

interface Printable {
    void print();
}

class A6 implements Printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        A6 obj = new A6();
        obj.print();
    }
}
```
#### Java Interface Example

```java

interface Printable {
    void print();
}

class A6 implements Printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        A6 obj = new A6();
        obj.print();
    }
}
```
#### Java Interface Example

```java

interface Printable {
    void print();
}

class A6 implements Printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        A6 obj = new A6();
        obj.print();
    }
}
``` 

### Java Enum

An enum is a special type of data type which is basically a collection (set) of constants. Enum is a keyword which is used to declare an enum datatype.

Enums were introduced in Java 5.0.

Enum Constants

Enum constants are implicitly static and final and can not be changed once created.

#### Java Enum Example

```java

enum Season { WINTER, SPRING, SUMMER, FALL }

public class Main {
    public static void main(String[] args) {
        for (Season s : Season.values())
            System.out.println(s);
    }
}
```
#### Java Enum Example

```java

enum Season { WINTER, SPRING, SUMMER, FALL }

public class Main {
    public static void main(String[] args) {
        for (Season s : Season.values())
            System.out.println(s);
    }
}
```
#### Java Enum Example

```java

enum Season { WINTER, SPRING, SUMMER, FALL }

public class Main {
    public static void main(String[] args) {
        for (Season s : Season.values())
            System.out.println(s);
    }
}
```
#### Java Enum Example

```java

enum Season { WINTER, SPRING, SUMMER, FALL }

public class Main {
    public static void main(String[] args) {
        for (Season s : Season.values())
            System.out.println(s);
    }
}
```
#### Java Enum Example

```java

enum Season { WINTER, SPRING, SUMMER, FALL }

public class Main {
    public static void main(String[] args) {
        for (Season s : Season.values())
            System.out.println(s);
    }
}
``` 

### Java File Handling

Java File class represents the files and directory pathnames in an abstract manner. This class is used for creation of files and directories, file searching, file deletion, etc.

The File class is an abstract representation of file and directory pathname. A pathname can be either absolute or relative.

#### Java File Handling Example

```java

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = null;
        File f1 = null;
        boolean bool = false;
        boolean bool1 = false;

        try {
            // create new file
            f = new File("test.txt");
            f1 = new File("test1.txt");

            // returns true if the file exists
            bool = f.exists();

            // returns true if the file exists
            bool1 = f1.exists();

            // prints
            System.out.println("File exists: " + bool);
            System.out.println("File exists: " + bool1);
        } catch (Exception e) {
            // if any I/O error occurs
            e.printStackTrace();
        }
    }
}
``` 
#### Java File Handling Example

```java

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = null;
        File f1 = null;
        boolean bool = false;
        boolean bool1 = false;

        try {
            // create new file
            f = new File("test.txt");
            f1 = new File("test1.txt");

            // returns true if the file exists
            bool = f.exists();

            // returns true if the file exists
            bool1 = f1.exists();

            // prints
            System.out.println("File exists: " + bool);
            System.out.println("File exists: " + bool1);
        } catch (Exception e) {
            // if any I/O error occurs
            e.printStackTrace();
        }
    }
}
``` 
#### Java File Handling Example

```java

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = null;
        File f1 = null;
        boolean bool = false;
        boolean bool1 = false;

        try {
            // create new file
            f = new File("test.txt");
            f1 = new File("test1.txt");

            // returns true if the file exists
            bool = f.exists();

            // returns true if the file exists
            bool1 = f1.exists();

            // prints
            System.out.println("File exists: " + bool);
            System.out.println("File exists: " + bool1);
        } catch (Exception e) {
            // if any I/O error occurs
            e.printStackTrace();
        }
    }
}
``` 
#### Java File Handling Example

```java

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = null;
        File f1 = null;
        boolean bool = false;
        boolean bool1 = false;

        try {
            // create new file
            f = new File("test.txt");
            f1 = new File("test1.txt");

            // returns true if the file exists
            bool = f.exists();

            // returns true if the file exists
            bool1 = f1.exists();

            // prints
            System.out.println("File exists: " + bool);
            System.out.println("File exists: " + bool1);
        } catch (Exception e) {
            // if any I/O error occurs
            e.printStackTrace();
        }
    }
}
``` 
#### Java File Handling Example

```java

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = null;
        File f1 = null;
        boolean bool = false;
        boolean bool1 = false;

        try {
            // create new file
            f = new File("test.txt");
            f1 = new File("test1.txt");

            // returns true if the file exists
            bool = f.exists();

            // returns true if the file exists
            bool1 = f1.exists();

            // prints
            System.out.println("File exists: " + bool);
            System.out.println("File exists: " + bool1);
        } catch (Exception e) {
            // if any I/O error occurs
            e.printStackTrace();
        }
    }
}
``` 
#### Java File Handling Example

```java

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = null;
        File f1 = null;
        boolean bool = false;
        boolean bool1 = false;

        try {
            // create new file
            f = new File("test.txt");
            f1 = new File("test1.txt");

            // returns true if the file exists
            bool = f.exists();

            // returns true if the file exists
            bool1 = f1.exists();

            // prints
            System.out.println("File exists: " + bool);
            System.out.println("File exists: " + bool1);
        } catch (Exception e) {
            // if any I/O error occurs
         
        }
    }
}
```

### Java Generics
