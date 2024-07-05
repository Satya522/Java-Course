package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class SpecialNumber {

    public static void findSpecialNumber(int num){
        int sumOfFact=0;
        int number = num;
        while(number>0){
            int lastDigit = number%10;
            int fact=1;
            // factorial logic
            for(int i=1;i<=lastDigit;i++)
            {
                fact *=i;
            }
            sumOfFact +=fact;
            number /=10;
        }
        if(num==sumOfFact){
            System.out.println(num+" is a special number.");
        }
        else {
            System.out.println(num+" is not a special number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check special number: ");
        int num = scanner.nextInt();
        findSpecialNumber(num);
    }
}