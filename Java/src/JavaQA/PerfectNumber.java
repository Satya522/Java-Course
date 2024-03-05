package JavaQA;

import java.util.Scanner;

// Perfect Number: a number whose sum of factors (excluding the number itself) is equal to the nuber us called perfct
// number. for example 6 is a perfect number bcoz 1+2+3=6, 28 is also perfect number because 1+2+4+7+14=28
public class PerfectNumber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check perfect number: ");
        int num = scanner.nextInt();
        perfectNumber(num);
      /*  int sum =0;
        // 1st loop method
        int i=1;
        while(i<=(num/2)){
            if(num%i==0){

                sum +=i;

            }
            i++;

        }

        if(sum==num){
            System.out.println(num+" is a perfect number");
        }
        else {
            System.out.println(num+" is not a perfect number");
         }
            */

    }

    public static void perfectNumber(int num){

        int sum =0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sum +=i;
            }
        }
     if(sum==num){
         System.out.println(num+" is a perfect number");
     }
     else {
         System.out.println(num+" is not a perfect number");
     }
    }
}
