package JavaQA.Leetcode.Leetcode75;

public class GCDOfStrings {

    public String gcdOfStrings(String str1, String str2) {
        int gcd = gcd(str1.length(), str2.length());
        String candidate = str1.substring(0, gcd);
        if (repeat(candidate, str1.length() / gcd).equals(str1) &&
                repeat(candidate, str2.length() / gcd).equals(str2)) {
            return candidate;
        }
        return "";
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private String repeat(String s, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
       GCDOfStrings gcdOfStrings = new GCDOfStrings();
       String result = gcdOfStrings.gcdOfStrings(str1,str2);
        System.out.println(result);

    }
}
