package src.JavaCourse.DSA.String;
// Test cases
//input:"aaabbc" // Expected Output: a3b2c
//input:"abcd"   // Expected Output: abcd
//input:"zzzzz"  // Expected Output: z5
//input:"!@##$%"// Expected Output: !@#2$%
public class StringCompress {

    public static String compressString(String s) {
         StringBuilder result = new StringBuilder();
         int i=0;
         while(i<s.length()){
             int count = 1;
             while(i+1<s.length() && s.charAt(i) == s.charAt(i+1)){
                 count++;
                 i++;
             }
             result.append(s.charAt(i));
             if(count>1){
                 result.append(count);
             }
             i++;
         }
         return result.toString();

    }
    public static String compressString1(String s) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int count = 1;
            while ( i+1<s.length() && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            result.append(s.charAt(i));
            if(count>1){
                result.append(count);
            }
        }
        return result.toString();

    }
    public static void main(String[] args) {
        String str = "aaabbccdsa";
        String str1 = "abcd";
        System.out.println(compressString1(str1));

    }


}
