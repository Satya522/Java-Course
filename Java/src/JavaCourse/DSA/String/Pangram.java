package src.JavaCourse.DSA.String;
// Pangram is a sentence containing every letter in the english alphabet.
public class Pangram {
    public static boolean isPangram(String str){
        if(str.length()<26){
            return false;
        }
        boolean[] result = new boolean[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int index;
            if(ch>='A' && ch<='Z'){
                 index = ch-'A';
            } else if (ch>='a' && ch<='z') {
                 index = ch-'a';
            }else {
                continue;
            }
            result[index] = true;
        }
        for(boolean x: result){
            if(x == false){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
//        String str = "The quick brown fox jumps over the lazy dog";
          String str = "geeks for geeks";
          System.out.println(isPangram(str));

    }
}
