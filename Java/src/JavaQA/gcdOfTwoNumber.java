package JavaQA;

import java.util.Scanner;

public class gcdOfTwoNumber {
  /*
  // this is the brute force approach to find the gcd of two numbers, the complexity of this approach is O(min(a,b))
  which is not good for the larger numbers example a=1000000 and b=1000000 then the time complexity will be 1000000
  time which is not good, so we will use the Euclidean algorithm to find the gcd of numbers.
    static  int gcd(int a, int b){
        int min =0;
        if(a>b){
            min=b;
        }else{
            min = a;
        }
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
*/
    /*
    2.Euclidean Method
    Euclidean Algorithm:
    1.find the largest number
    2.replace the larger number by the difference between the larger and smaller number
    3.repeat step 1 and step 2 until both numbers are equal
    4.return any one number,which is GCD.
     */
    static int EuclidGcd(int a,int b){
        while(a!=b){
            if(a>b){
                a = a-b;
            }else{
                b= b-a;
            }
        }
        return a;  // both value are equal so you will return a or b
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //System.out.println(gcd(a,b));
        System.out.println(EuclidGcd(a,b));
    }
}
