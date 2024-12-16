package src.JavaCourse.CoreJava.JavaMethods;
// BinomialCoefficient ==>  nCr = n! / (r! * (n-r)!)
public class BinomialCoefficient {

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *=i;
        }
        return fact;
    }

    public static int binomialCoefficient(int n, int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n-r);

        return nfact / (rfact * nmrfact);
    }

    public static void main(String[] args) {
        int nCr = binomialCoefficient(5, 2);
        System.out.println(nCr);
    }
}
