package JavaQA.Leetcode.Leetcode75;
import java.util.Arrays;

public class SuccessfulPairOfSpells {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] pairs = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int j = potions.length - 1;
            while (j >= 0 && (long) spells[i] * potions[j] < success) {
                j--;
            }
            pairs[i] = j + 1;
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
        long success = 7;
        SuccessfulPairOfSpells successfulPairOfSpells = new SuccessfulPairOfSpells();
        int[] pairs = successfulPairOfSpells.successfulPairs(spells, potions, success);
        System.out.println(Arrays.toString(pairs));
    }
}