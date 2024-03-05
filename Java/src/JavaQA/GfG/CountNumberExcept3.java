package JavaQA.GfG;
import java.util.Scanner;
public class CountNumberExcept3 {
    static long count(long n){

    long count = 0;
        for(int i = 1; i <= n; i++) {
            if (!Integer.toString(i).contains("3")) {
                count++;
            }
        }
        return count;
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        System.out.println(count(N));
    }
}
