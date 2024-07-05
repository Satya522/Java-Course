package src.JavaCourse.DSA.Recursion;

public class NthFibonacci {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int fibn = fib1+fib2;
        return fibn;
    }
    public static void main(String[] args) {
        int n = 25;  /*iska range hai may be 1 ...... 20 to 30*/
        System.out.println(fib(n));
    }
}
/*
// agar hme 30 se jada bada fibonacci sum nikalana hai to hume BigInteger class ka use karna padega

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int n = 500;
        BigInteger[] fib = new BigInteger[n+1];
        BigInteger sum = sumFibonacci(n, fib);
        System.out.println("The sum of the first " + n + " Fibonacci numbers is: " + sum);
    }

    public static BigInteger sumFibonacci(int n, BigInteger[] fib) {
        if (n <= 0) {
            return BigInteger.ZERO;
        } else if (n == 1) {
            fib[n] = BigInteger.ONE;
            return BigInteger.ONE;
        } else if (fib[n] != null) {
            return fib[n];
        } else {
            fib[n] = sumFibonacci(n - 1, fib).add(sumFibonacci(n - 2, fib));
            return fib[n];
        }
    }
}
* */