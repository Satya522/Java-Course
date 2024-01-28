# Java-Course
This is all about java (core + Advance)  and as well as Data Structure in java 

## Table of Contents
- [Introduction](#introduction)
- [Java](#java)
  - [Java Introduction](#java-introduction)
  - [Java Features](#java-features)
  - [Java History](#java-history)
  - [Java Environment Setup](#java-environment-setup)
  - [Java Basic Syntax](#java-basic-syntax)
  - [Java Object & Classes](#java-object-&-classes)
  - [Java Basic Datatypes](#Java-Basic-Datatypes)
  - [Java Variable Types](#java-variable-types)
  - [Java Modifier Types](#java-modifier-types)
  - [Java Basic Operators](#java-basic-operators)
  - [Java Loop Control](#java-loop-control)
  - [Java Decision Making](#java-decision-making)
  - [Java Numbers](#java-numbers)
  - [Java Characters](#java-characters)
  - [Java Strings](#java-strings)
  - [Java Arrays](#java-arrays)
  - [Java Date & Time](#java-date-&-time)
  - [Java Regular Expressions](#java-regular-expressions)
  - [Java Methods](#java-methods)
  - [Java Files & I/O](#java-files-&-i/o)
  - [Java Exceptions](#java-exceptions)
  - [Java Inner classes](#java-inner-classes)
  - [Java Inheritance](#java-inheritance)
  - [Java Overriding](#java-overriding)
  - [Java Polymorphism](#java-polymorphism)
  - [Java Abstraction](#java-abstraction)
  - [Java Encapsulation](#java-encapsulation)
  - [Java Interfaces](#java-interfaces)
  - [Java Packages](#java-packages)
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

## Introduction of Java
Java is a high-level programming language originally developed by Sun Microsystems and released in 1995. Java runs on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX. This tutorial gives a complete understanding of Java. This reference will take you through simple and practical approaches while learning Java Programming language.

## Java Features
There are given many features of Java. They are also known as java buzzwords. The Java Features given below are simple and easy to understand.

### Java History
James Gosling initiated Java language project in June 1991 for use in one of his many set-top box projects. The language, initially called Oak after an oak tree that stood outside Gosling's office, also went by the name Green and ended up later being renamed as Java, from a list of random words. Sun released the first public implementation as Java 1.0 in 1995.

### Java Environment Setup
Java programming language uses this environment to run the program. The environment consists of the development tools that allow the programmer to write programs and create files for the program in the text editor.

# Installation of Java
To install Java on your Windows system, you can follow these steps:
 
1. Download the latest Java Development Kit (JDK) from the official Oracle website. Choose the version that suits your needs.

2. Once the download is complete, run the installer.

3. Follow the instructions in the installation wizard. During the installation, you will be asked to set the installation path for the JDK. Make a note of this path.

4. After the installation is complete, you need to set the `JAVA_HOME` environment variable. This tells your system where to find the JDK. To do this, open the System Properties (right-click on Computer in the start menu, or use the System option in the Control Panel). Click on the Advanced system settings link.

5. In the System Properties window, click on the Environment Variables button.

6. In the Environment Variables window, click on the New button in the System variables section.

7. In the New System Variable window, enter `JAVA_HOME` as the variable name and the path to your JDK installation as the variable value, then click OK.

8. Back in the Environment Variables window, scroll down to the System variables section and find the `Path` variable. Select it and click Edit.

9. In the Edit System Variable window, add the path to the `bin` directory of your JDK installation to the end of the variable value, preceded by a semicolon (;). For example, if your JDK is installed in `C:\Program Files\Java\jdk-14.0.1`, you would add `;C:\Program Files\Java\jdk-14.0.1\bin`.

10. Click OK in each open window to confirm the changes.

11. To verify the installation, open a new command prompt and run the command `java -version`. If the installation was successful, this command will print the version of the Java compiler that you installed.

Please note that these instructions are for Windows. The process may vary slightly for other operating systems.

### Java Basic syntax
Java's basic syntax is the set of rules defining how a Java program is written and interpreted. Here are some key points:

1. **Case Sensitivity**: Java is case-sensitive, which means the uppercase and lowercase letters are different. This means `Hello` and `hello` are different in Java.

2. **Class Names**: In Java, all class names should start with an uppercase letter. If several words are used to form the name of the class, the first letter of each inner word should be in uppercase. For example, `MyFirstJavaClass`.

3. **Method Names**: All method names should start with a lowercase letter. If several words are used to form the name of the method, then the first letter of each inner word should be in uppercase. For example, `myMethodName()`.

4. **File Names**: The name of the program file should exactly match the class name. When saving the file, you should save it using the class name and append `.java` to the end of the name. For example, if the class name is `MyFirstJavaClass`, then the file should be saved as `MyFirstJavaClass.java`.

5. **public static void main(String args[])**: Java program processing starts from the `main()` method which is a mandatory part of every Java program.

Here is a simple example of a Java program following these syntax rules:

public class MyFirstJavaProgram {
    /* This is my first java program.
     * This will print 'Hello World' as the output
     */
    public static void main(String []args) {
        System.out.println("Hello World"); // prints Hello World
    }
}

In this example, `MyFirstJavaProgram` is the class name, `main` is the method name, `MyFirstJavaProgram.java` is the file name, and the program starts executing from the `main()` method.

### java-object-&-classes
In Java, everything is an Object. Objects are created from templates known as classes. In Java, an Object is an instance of a class.

Here's a brief explanation for the `java-object-&-classes` section of your README file:


### Java Object & Classes

In Java, everything is an Object. An Object is an instance (or a real-world entity) of a class. A class is a blueprint or prototype from which objects are created. 

#### Class

A class is a group of similar entities. It is a logical entity upon which we can't do anything. It is a template or blueprint from which objects are created. A class in Java can contain:

- Fields
- Methods
- Constructors
- Blocks
- Nested class and interface

Syntax to declare a class:

# java EXAMPLE
class <class_name>{  
    field;  
    method;  
}  

#### Object

An object is an instance of a class. It has state and behavior. The state is represented by attributes of an object (also known as data members or instance variables). The behavior is represented by methods of an object (also known as operations).

An object is created using the 'new' keyword. For example:


ClassName object = new ClassName();

Here, `ClassName` is the name of the class, and `object` is the name of the object we created.

#### Example

Here is an example of a class and an object in Java:

# JAVA PROGRAM
class Dog {
    String breed;
    int age;
    String color;

    void barking() {
    }

    void hungry() {
    }

    void sleeping() {
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.barking();
    }
}


In this example, `Dog` is a class that includes fields (breed, age, color), and methods (barking, hungry, sleeping). `myDog` is an object of the `Dog` class.

This section provides a basic understanding of Java objects and classes. It can be expanded with more details and examples as needed.

### java-basic-data types
In Java, there are eight basic data types, which are divided into two groups:

- Primitive Data Types: byte, short, int, long, float, double, boolean, char
- Non-primitive Data Types: String, Arrays, Classes, Interface, etc.

#### Primitive Data Types

- **byte**: The `byte` data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).

- **short**: The `short` data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).

- **int**: The `int` data type is a 32-bit signed two's complement integer, which has a minimum value of -2^31 and a maximum value of 2^31-1.

- **long**: The `long` data type is a 64-bit two's complement integer. The signed long has a minimum value of -2^63 and a maximum value of 2^63-1.

- **float**: The `float` data type is a single-precision 32-bit IEEE 754 floating point.

- **double**: The `double` data type is a double-precision 64-bit IEEE 754 floating point.

- **boolean**: The `boolean` data type has only two possible values: true and false.

- **char**: The `char` data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).

#### Non-primitive Data Types

- **String**: The `String` data type is a sequence of characters. In Java, strings are immutable.

- **Arrays**: An array is a group of like-typed variables that are referred to by a common name.

- **Classes**: A class is a user defined blueprint or prototype from which objects are created.

- **Interface**: Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body).


### Java Variable Types
A variable is a container that holds values that are used in java program.

In Java, there are three types of variables:

- Local Variables
- Instance Variables
- Static Variables


#### Local Variables

Local variables are declared in methods, constructors, or blocks. They are created when the method, constructor or block is entered and the variable will be destroyed once it exits the method, constructor, or block. Access modifiers cannot be used for local variables.

#### Instance Variables

Instance variables are declared in a class, but outside a method, constructor or any block. When a space is allocated for an object in the heap, a slot for each instance variable value is created. Instance variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed.

#### Static Variables

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
n Java, a modifier is a keyword that you add to those definitions to change their meanings.Java language has a wide variety of modifiers, including the following:

### Java Modifier Types

In Java, there are two types of modifiers:

- Access Modifiers: public, protected, private, and default
- Non-access Modifiers: final, abstract, static, synchronized, volatile, transient, etc.

#### Access Modifiers

- **public**: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

- **protected**: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.

- **private**: The access level of a private modifier is only within the class.

- **default**: The access level of a default modifier is only within the package. By default, all the classes, methods, and fields in a Java program are default if you do not specify any modifier.

#### Non-access Modifiers

- **final**: The `final` keyword is used to restrict the user. The java final keyword can be used in many contexts such as final variable, final method, final class.

- **abstract**: The `abstract` keyword is used to declare abstract class. Abstract class can provide the implementation of interface. It can have abstract and non-abstract methods.

- **static**: The `static` keyword is used mainly for memory management. It can be used with variables, methods, blocks and nested classes.

- **synchronized**: The `synchronized` keyword is used to specify a block of code is synchronized which means that the lock for an object is obtained before executing the code.

- **volatile**: The `volatile` modifier is used to let the JVM know that a thread accessing the variable must always merge its own private copy of the variable with the master copy in the memory.

- **transient**: The `transient` keyword is used in serialization. If you define any data member as transient, it will not be serialized.


This section provides a basic understanding of Java modifier /types. It can be expanded with more details and 
examples as needed.