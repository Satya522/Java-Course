package src.JavaCourse.DSA.String;
// https://www.naukri.com/code360/problems/split-string_3744737?0=s&1=e&2=a&3=r&4=c&5=h&6=%3D&7=s&8=t&9=r&10=i&11=n&12=g&interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class SplitString {
    public static boolean splitString(String string){
        String vowels = "aeiouAEIOU";
        int mid = string.length()/2;
        String firstHalf = string.substring(0, mid);
        String secondHalf = string.substring(mid);
        int countVowelFirst = 0;
        int countVowelSecond = 0;
        for (int i = 0; i <firstHalf.length(); i++) {
            if(vowels.indexOf(firstHalf.charAt(i)) != -1){
                countVowelFirst++;
            }
        }
        for (int i = 0; i <secondHalf.length(); i++) {
            if(vowels.indexOf(secondHalf.charAt(i)) != -1){
                countVowelSecond++;
            }
        }
        return countVowelFirst == countVowelSecond;

    }

    public static void main(String[] args) {
        String string = "codingninjas";
        // Expected output is true
        //String string = "helloworld";
        // Expected output is false
        /*
        Explanation:
         For the first test case, ‘str’= ‘codingninjas’, when we split this string we get, ‘coding’ and ‘ninjas’ which
         both contain 2 vowels each. Hence the answer is ‘True’.

         For the second test case, ‘str’= ‘helloworld’, when we split this string we get ‘hello and ‘world’, which
         contain 2 and 1 vowels respectively. Hence the answer is ‘False’.
         */
        System.out.println(splitString(string));

    }
}
