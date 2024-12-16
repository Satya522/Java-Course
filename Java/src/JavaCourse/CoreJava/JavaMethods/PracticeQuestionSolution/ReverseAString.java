package src.JavaCourse.CoreJava.JavaMethods.PracticeQuestionSolution;

public class ReverseAString {
    public static String reverseString(String str){
        String reverse = "";
        for(int i=str.length()-1; i>=0;i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverseString(str));
    }
}

// We can also use the StringBuilder class or StringBuffer class to reverse a string.
// we can use reverse() method to reverse a String.