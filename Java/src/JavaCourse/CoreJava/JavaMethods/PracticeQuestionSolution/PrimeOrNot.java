package src.JavaCourse.CoreJava.JavaMethods.PracticeQuestionSolution;

import java.util.Scanner;

public class PrimeOrNot {
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is prime or not: ");
        int num = sc.nextInt();

        String result = isPrime(num) ? (num + " is a prime number.") : (num + " is not a prime number.");
        System.out.println(result);

    }
}


// you can also check between a range of number if they are prime or not
// you can check PrimeInRange.java file for that