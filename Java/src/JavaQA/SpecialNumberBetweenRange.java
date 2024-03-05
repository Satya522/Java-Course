package JavaQA;

import java.util.Scanner;

public class SpecialNumberBetweenRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting Number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
        findSpecialNumberBetweenRange(start, end);

    }
    public static void findSpecialNumberBetweenRange(int start,int end){
        for(int num=start;num<=end;num++){
            if(isSpecialNumber(num)){
                System.out.println(num+" is a special number");
            }
        }

    }

    public static boolean isSpecialNumber(int num){
        int sumofFact=0;
        int number=num;
        while(number>0){
            int lastDigit = number%10;
            int fact=1;
            for(int i=1;i<=lastDigit;i++){
                fact *=i;
            }
             sumofFact +=fact;
            number /=10;
        }
        return sumofFact==num;
    }

}
