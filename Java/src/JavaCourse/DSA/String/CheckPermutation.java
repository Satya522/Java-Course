package src.JavaCourse.DSA.String;

public class CheckPermutation {
    public static boolean isPermutation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int[] charArray = new int[256];
        char x ;
        for(int i=0;i<s1.length();i++){
            x = s1.charAt(i);
            charArray[x]++;
            x = s2.charAt(i);
            charArray[x]--;
        }
  /*      for(int i=0;i< charArray.length;i++){
            if(charArray[i] != 0){
                return false;
            }
        }*/
        for (int i = 0; i < s1.length(); i++) {
            x = s1.charAt(i);
            if(charArray[x] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPermutation("abc","bca"));
        System.out.println(isPermutation("abc","bcad"));
    }
}
