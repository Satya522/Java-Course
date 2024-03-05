package JavaQA;

import java.util.Scanner;

public class PerfectNumberBetweenRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
        findPerfectNumbers(start, end);
    }

    public static void findPerfectNumbers(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (isPerfectNumber(num)) {
                System.out.println(num + " is a perfect number");
            }
        }
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}