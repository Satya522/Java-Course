package src.JavaCourse.DSA.Recursion;

public class SumofNnumbers {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n= 23;
        System.out.println(sum(n));

    }
}
