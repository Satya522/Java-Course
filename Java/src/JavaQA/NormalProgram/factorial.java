package src.JavaQA.NormalProgram;
import java.util.Scanner;
public class factorial {
    static int fact(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int n = scanner.nextInt();
        System.out.println(fact(n));
    }
}
