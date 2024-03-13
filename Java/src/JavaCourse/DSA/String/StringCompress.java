package JavaCourse.DSA.String;
// Test cases
//input:"aaabbc" // Expected Output: a3b2c1
//input:"abcd"   // Expected Output: a1b1c1d1
//input:"zzzzz"  // Expected Output: z5
//input:"!@##$%"// Expected Output: !1@1#2$1%1
public class StringCompress {

    public static String compressString(String input) {
         StringBuilder result = new StringBuilder();
         int count = 1;
         for(int i=0;i<input.length();i++){
             if(i+1<input.length() && input.charAt(i) == input.charAt(i+1)){
                 count++;
             }
             else{
                 result.append(input.charAt(i)).append(count);
                 count =1;
             }
         }
         return result.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compressString(str));

    }


}
