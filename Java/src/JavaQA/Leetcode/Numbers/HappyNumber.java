
// https://leetcode.com/problems/happy-number/description/
/*
happy number is a number which eventually reaches 1 when replaced by the sum of the square of each digit.
For example, 19 is a happy number:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
*/

// 1. Use Floyd's Cycle-Finding Algorithm
// 2. We are using two pointers here, the fastRunner and the slowRunner
// 3. The fastRunner moves twice as quickly as the slowRunner
// 4. If the number is a happy number, the slowRunner will eventually reach 1
// 5. If the number is not a happy number, the fastRunner will eventually catch up to the slowRunner, and both runners will be stuck in a cycle
// 6. In the cycle, the fastRunner and slowRunner will keep chasing each other forever
// 7. If the number is a happy number, the fastRunner will eventually reach 1
// 8. If the number is not a happy number, the fastRunner will eventually catch up to the slowRunner, and both runners will be stuck in a cycle
// 9. In the cycle, the fastRunner and slowRunner will keep chasing each other forever
// 10. The time complexity is O(log n)
// 11. The space complexity is O(1)

// Example: 19
// slowRunner = 19
// fastRunner = 82
// slowRunner = 82
// fastRunner = 68
// slowRunner = 68
// fastRunner = 100
// slowRunner = 100
// fastRunner = 1
// Output: true
// Example: 20
// slowRunner = 20
// fastRunner = 4
// slowRunner = 4
// fastRunner = 16
// slowRunner = 16
// fastRunner = 37
// slowRunner = 37
// fastRunner = 58
// slowRunner = 58
// fastRunner = 89
// slowRunner = 89
// fastRunner = 145
// slowRunner = 145
// fastRunner = 42
// slowRunner = 42
// fastRunner = 20
// Output: false

package JavaQA.Leetcode.Numbers;
public class HappyNumber {
    public static boolean isHappy(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }

    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(HappyNumber.isHappy(19)); // Output: true
    }
}

