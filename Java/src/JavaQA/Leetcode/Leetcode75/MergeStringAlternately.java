package JavaQA.Leetcode.Leetcode75;
//https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
public class MergeStringAlternately {
    public static String mergeAlternately(String word1, String word2){
        StringBuilder sb = new StringBuilder();
        int i=0,j=0;
        while(i<word1.length() && j<word2.length()){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        while(i<word1.length()){
            sb.append(word1.charAt(i++));
        }
        while (j<word2.length()){
            sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
       String word1 = "abc";
       String word2 = "pqr";
       String result = mergeAlternately(word1,word2);
        System.out.println(result);

    }
}
