package src.JavaCourse.CoreJava.JavaMethods.PracticeQuestionSolution;

import java.util.Scanner;

public class PowerOfNumber {
    public static int Power(int base, int exponent){
        int result = 1;
        for(int i=0;i<exponent;i++){
            result *= base;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and exponent:");
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int power = Power(base,exponent);
        System.out.println("Power of "+base+" raised to "+exponent+" is: "+power);

    }
}
