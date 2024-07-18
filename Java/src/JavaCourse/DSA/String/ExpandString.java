package src.JavaCourse.DSA.String;
/*
Given a string str of type "3(ab)4(cd)", the task is to expand it to be "abababcdcdcdcd"
where integers are from the range[1,9]
Input: str = "3(ab)4(cd)"
output: abababcdcdcdcd"
input: str = "2(kl)3(ap)"
output: klklklapapap
*
*/
public class ExpandString {
    public static void expandString(String str){
        int length = str.length();
        int i,j,k;
        StringBuilder output = new StringBuilder();
        for ( i = 0; i < length; i++) {
            char ch = str.charAt(i);
            int num = ch-'0';
            StringBuilder temp = new StringBuilder();
            for( j=i+2; str.charAt(j) != ')'; j++){
                temp.append(str.charAt(j));
            }
            for ( k = 1; k <= num; k++) {
                output.append(temp);
            }
            i = j;
        }
        System.out.println(output);
    }
    public static void main(String[] args) {
         expandString("3(ab)4(cd)");
    }
}





