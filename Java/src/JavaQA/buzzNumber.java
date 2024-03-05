package JavaQA;

import java.util.Scanner;

public class buzzNumber {

    public static void checkBuzz(int num){
         if(num % 10 ==7 || num % 7 ==0){
             System.out.println(num + " is a buzz number");
         }
         else {
             System.out.println(num+" is not a buzz number");
         }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check if it a buzz no or not:");
        int num = scanner.nextInt();
        checkBuzz(num);

    }
}
