package JavaQA;

import java.util.Scanner;

public class duckNumber {
    public static void checkDuckNumber(int num){
        while(num >0){
            if(num %10==0){
                System.out.println(num + " is a duck number");
                return;
            }
            num /=10;

        }
        System.out.print(num + " is not a duck number");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check if it a duck no or not:");
        int num = scanner.nextInt();
        checkDuckNumber(num);

    }
}
