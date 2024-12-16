package src.JavaCourse.CoreJava.JavaMethods.PracticeQuestionSolution;
// before this you have to learn GCD of two numbers to understand this code
import java.util.Scanner;

public class LCMofTwoNumber {
    public static int LCM(int num1, int num2){
        int lcm = (num1*num2)/GCDOfTwoNumber.Gcd(num1,num2); // LCM = (num1*num2)/GCD method
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("The LCM of the two numbers is: "+LCM(num1, num2));

    }
}
