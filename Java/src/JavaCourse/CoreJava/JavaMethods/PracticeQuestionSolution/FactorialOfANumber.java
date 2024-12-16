package src.JavaCourse.CoreJava.JavaMethods.PracticeQuestionSolution;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void factorial(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact *= i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        factorial(num);

    }
}
