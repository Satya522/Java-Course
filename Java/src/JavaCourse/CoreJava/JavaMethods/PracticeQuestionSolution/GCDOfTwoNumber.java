package src.JavaCourse.CoreJava.JavaMethods.PracticeQuestionSolution;

import java.util.Scanner;

public class GCDOfTwoNumber {
    public static int Gcd(int num1, int num2){
        if(num2 == 0){
            return num1;
        }
        return Gcd(num2, num1%num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("The GCD of the two numbers is: "+Gcd(num1, num2));
    }
}
