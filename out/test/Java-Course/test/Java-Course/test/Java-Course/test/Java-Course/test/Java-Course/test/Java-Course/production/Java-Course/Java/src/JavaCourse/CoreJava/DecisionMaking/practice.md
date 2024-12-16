### Solve using If or If-else

1. Write a Java program to check if a number is positive, negative, or zero.
```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("The number is Positive");
        }
        if (number < 0) {
            System.out.println("The number is Negative");
        }
        if (number == 0) {
            System.out.println("The number is Zero");
        }
    }
}
```
2. Write a Java program to find the largest of three numbers.
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + "  is the largest number");
        }
        if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number");
        }
        if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3 + " is the largest number");
        }
    }
}
```
3. Write a Java program to check if a year is a leap year or not.
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                }
            }
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}

```
4. Write a Java program to check if a character is a vowel or consonant.
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is a Consonant");
        }
    }
}
```
5. Write a Java program to check if a number is even or odd.
```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if(number%2==0) {
            System.out.println(number + " is Even");
        }else {
            System.out.println(number + " is Odd");
        }
    }
}

```
6. Write a Java program to check if a number is prime or not.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else{
            for(int i=2;i<=number;i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
    }
}
```
7. Write a Java program to check if a number is a palindrome or not.
8. Write a Java program to check if a string is a palindrome or not.
9. Write a Java program to check if a number is divisible by another number (use two numbers as inputs).
10. Write a Java program to calculate the grade of a student based on the mark secured in five subjects (use if else if ladder).
11. Write a Java program to check if a number is a multiple of another number.
12. Write a Java program to check if a number is a perfect square.
13. Write a Java program to check if a number is a perfect cube.
14. Write a Java program to check if a number is Armstrong number or not.
15. Write a Java program to check if a number is a Fibonacci number or not.
16. Write a Java program to check if a number is a factor of another number.
17. Write a Java program to check if a number is a power of another number.
18. Write a Java program to check if a number is within a certain range.
19. Write a Java program to check if a character is uppercase or lowercase.
20. Write a Java program to check if a character is a digit or a letter.
21. Write a Java program to check if a string starts or ends with a certain character.
22. Write a Java program to check if a string contains a certain substring.
23. Write a Java program to check if a number is a binary number.
24. Write a Java program to check if a number is a perfect number or not.
25. Write a Java program to check if a number is a strong number or not.
26. Write a Java program to check if a number is a happy number or not.
27. Write a Java program to check if a number is a duck number or not.
28. Write a Java program to check if a number is a Harshad number or not.
29. Write a Java program to check if a number is a neon number or not.
30. Write a Java program to check if a number is a Pronic number or not.

### Solve using if-else and switch 

1. Write a Java program to check if a number is positive, negative, or zero using `if-else` statement.
2. Write a Java program to find the largest of three numbers using `if-else` statement.
3. Write a Java program to check if a year is a leap year or not using `if-else` statement.
4. Write a Java program to check if a character is a vowel or consonant using `switch` statement.
5. Write a Java program to check if a number is even or odd using ternary operator.
6. Write a Java program to check if a number is prime or not using `if-else` statement.
7. Write a Java program to check if a number is a palindrome or not using `if-else` statement.
8. Write a Java program to check if a string is a palindrome or not using `if-else` statement.
9. Write a Java program to check if a number is divisible by another number (use two numbers as inputs) using `if-else` statement.
10. Write a Java program to calculate the grade of a student based on the mark secured in five subjects using `if-else-if` ladder.
11. Write a Java program to create a simple calculator using `switch` statement.
12. Write a Java program to check if a number is a perfect square using `if-else` statement.
13. Write a Java program to check if a number is a perfect cube using `if-else` statement.
14. Write a Java program to check if a number is Armstrong number or not using `if-else` statement.
15. Write a Java program to check if a number is a Fibonacci number or not using `if-else` statement.
16. Write a Java program to check if a number is a factor of another number using `if-else` statement.
17. Write a Java program to check if a number is a power of another number using `if-else` statement.
18. Write a Java program to check if a number is within a certain range using `if-else` statement.
19. Write a Java program to check if a character is uppercase or lowercase using `if-else` statement.
20. Write a Java program to check if a character is a digit or a letter using `if-else` statement.

### Solve using Ternary Operator

1.  Write a Java program to find the smallest of two numbers using the ternary operator.
2.  Write a Java program to find the largest of two numbers using the ternary operator.
3.  Write a Java program to check if a number is even or odd using the ternary operator.
4.  Write a Java program to check if a character is a vowel or consonant using the ternary operator.
5.  Write a Java program to check if a number is positive, negative, or zero using the ternary operator.
6.  Write a Java program to find the absolute value of a number using the ternary operator.
7.  Write a Java program to check if a year is a leap year or not using the ternary operator.
8.  Write a Java program to check if a number is divisible by another number (use two numbers as inputs) using the ternary operator.
9.  Write a Java program to check if a string starts or ends with a certain character using the ternary operator.
10.  Write a Java program to check if a string contains a certain substring using the ternary operator.

### Solve using Switch case
1. Write a Java program to create a simple calculator using `switch` statement.
2. Write a Java program to check if a character is a vowel or consonant using `switch` statement.
3. Write a Java program to create a menu system where the user can select an option and the program will execute a different block of code depending on the user's choice using `switch` statement.
4. Write a Java program that takes a number from 1 to 7 as input and prints the corresponding day of the week using `switch` statement.
5. Write a Java program that takes a month number (1-12) as input and prints the number of days in that month using `switch` statement.
6. Write a Java program to create a traffic light simulator. The user can input 'R' for red, 'Y' for yellow, and 'G' for green, and the program will print the appropriate action (stop, ready, go) using `switch` statement.
7. Write a Java program that takes a grade (A-F) as input and prints the corresponding score range (90-100, 80-89, etc.) using `switch` statement.
8. Write a Java program that takes a season name as input and prints the corresponding months using `switch` statement.
9. Write a Java program that takes a country code (like 'US', 'IN', 'DE') as input and prints the corresponding country name using `switch` statement.
10. Write a Java program that takes a currency code (like 'USD', 'EUR', 'JPY') as input and prints the corresponding currency symbol using `switch` statement.

### Nested Switch case
1. Write a Java program to create a nested menu system using `switch` statement. The first menu could be for choosing a type of calculation (like arithmetic, trigonometric, logarithmic), and the second menu could be for choosing the specific operation (like addition, subtraction for arithmetic; sine, cosine for trigonometric; natural log, log base 10 for logarithmic).
2. Write a Java program that takes a country code as input and then a state or province code, and prints the corresponding country and state/province name using nested `switch` statement.
3. Write a Java program that takes a vehicle type as input (like car, bike, truck) and then a specific model code, and prints the corresponding vehicle type and model using nested `switch` statement.
4. Write a Java program that takes a university department code as input and then a specific course code, and prints the corresponding department and course name using nested `switch` statement.
5. Write a Java program that takes a main dish code as input and then a specific side dish code, and prints the corresponding main dish and side dish using nested `switch` statement.

### Nested if else
1. Write a Java program to find the largest of three numbers using nested `if-else` statement.
2. Write a Java program to check if a number is positive, negative, or zero using nested `if-else` statement.
3. Write a Java program to check if a year is a leap year or not using nested `if-else` statement.
4. Write a Java program to check if a character is a vowel or consonant using nested `if-else` statement.
5. Write a Java program to check if a number is even or odd using nested `if-else` statement.
6. Write a Java program to check if a number is prime or not using nested `if-else` statement.
7. Write a Java program to check if a number is a palindrome or not using nested `if-else` statement.
8. Write a Java program to check if a string is a palindrome or not using nested `if-else` statement.
9. Write a Java program to check if a number is divisible by another number (use two numbers as inputs) using nested `if-else` statement.
10. Write a Java program to calculate the grade of a student based on the mark secured in five subjects using nested `if-else` statement.
