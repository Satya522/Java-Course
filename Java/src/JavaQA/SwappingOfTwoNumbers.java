package JavaQA;

import java.util.Scanner;

public class SwappingOfTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = input.nextInt();

        System.out.println("Enter the second number:");
        int b = input.nextInt();

        System.out.println("before swapping a = " + a + " b = " + b);
        // Swapping
        a = a + b;
        b = a - b;
        a = a - b;


//        Swapping using a temporary variable
//        int temp = a;
//        a = b;
//        b = temp;

        System.out.println("After swapping a = " + a + " b = " + b);
    }
}
