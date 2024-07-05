package src.JavaQA.NormalProgram;

import java.util.Scanner;

public class StrongElement {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int gcdArray(int[] arr, int excludeIndex) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != excludeIndex) {
                result = (result == 0) ? arr[i] : gcd(result, arr[i]);
            }
        }
        return result;
    }

    public static int strongIndices(int[] arr) {
        int totalGcd = gcdArray(arr, -1);
        int strongIndices = 0;
        for (int i = 0; i < arr.length; i++) {
            int gcdWithoutI = gcdArray(arr, i);
            if (gcdWithoutI != totalGcd) {
                strongIndices++;
            }
        }
        return strongIndices;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(strongIndices(arr));
        }
    }
}