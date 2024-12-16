package src.JavaCourse.CoreJava.JavaMethods;

public class Factorial {

    public  static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int fact = factorial(4);
        System.out.println(fact);
    }
}
