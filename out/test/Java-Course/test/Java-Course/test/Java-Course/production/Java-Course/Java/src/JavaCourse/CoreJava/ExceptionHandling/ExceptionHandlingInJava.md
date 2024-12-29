## Exception Handling in Java
In Java, an exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. It is a way to handle errors or other exceptional events that occur during the execution of a program.  
Key Points:
1. Exception: An unexpected event that occurs during program execution.
2. Disrupts Normal Flow: When an exception occurs, the normal flow of the program is interrupted.
3. Handling Exceptions: Java provides a robust mechanism to handle exceptions, ensuring the program can continue or 
   terminate gracefully.

An exception can occur for many reasons. some of them are:
- A user has entered invalid data.
- A file that needs to be opened cannot be found.
- A network connection has been lost in the middle of communications or the JVM has run out of memory.
- These exceptions are caused by user error, programmer error, or physical resources that have failed.
- When an exception occurs, the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended.

###  Types of Exceptions
There are mainly two types of exceptions:
1. Java runtime exceptions (unchecked exceptions)
2. Java IO exceptions (checked exceptions)

### Java runtime exceptions (unchecked exceptions)
- These are exceptions that occur at runtime and are not checked at compile time.
- These exceptions are ignored at the time of compilation.
- These exceptions occur because of bad programming.
- These are also called unchecked exceptions.
- Example: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.
- These exceptions are subclasses of RuntimeException.
- It is not mandatory to handle these exceptions.

### Java IO exceptions (checked exceptions)
- These are exceptions that occur at compile time.
- These exceptions are checked at compile time.
- If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using throws keyword.
- Example: IOException, SQLException, etc.
- These exceptions are subclasses of Exception.
- It is mandatory to handle these exceptions.
- If we don't handle these exceptions, the program will not compile.
- If we handle these exceptions, the code will be executed without any issue.
- It is recommended to handle these exceptions.


### Exception Handling Keywords
1. try
2. catch
3. finally
4. throw
5. throws
6. assert

### try block

- The try block is used to enclose the code that might throw an exception.
- It must be followed by either catch or finally block or both.
- The try block must be followed by either catch or finally block or both.
- The try block cannot be used alone.
- The try block can be followed by multiple catch blocks.
- The try block can be followed by only one finally block.
- The try block can be followed by only one finally block.
- The try block must be followed by either catch or finally block or both.
- The try block cannot be used alone.
- The try block can be followed by multiple catch blocks.

