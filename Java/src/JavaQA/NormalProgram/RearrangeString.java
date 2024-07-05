package src.JavaQA.NormalProgram;
// https://www.naukri.com/code360/problems/rearrange-string_985247
import java.util.*;

public class RearrangeString {
    public static String rearrangeString(String str) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> countMap.get(b) - countMap.get(a));
        pq.addAll(countMap.keySet());

        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            char current = pq.remove();
            result.append(current);

            countMap.put(current, countMap.get(current) - 1);
            if (countMap.get(current) > 0) {
                pq.add(current);
            }

            if (!pq.isEmpty() && pq.peek() == current) {
                if (pq.size() == 1) {
                    return "NO SOLUTION";
                }
                char next = pq.remove();
                result.append(next);

                countMap.put(next, countMap.get(next) - 1);
                if (countMap.get(next) > 0) {
                    pq.add(next);
                }
                pq.add(current);
            }
        }

        return result.length() == str.length() ? result.toString() : "NO SOLUTION";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();  // Consume the newline left-over
        for (int t = 0; t < T; t++) {
            String str = scanner.nextLine();
            System.out.println(rearrangeString(str));
        }
        scanner.close();
    }
}