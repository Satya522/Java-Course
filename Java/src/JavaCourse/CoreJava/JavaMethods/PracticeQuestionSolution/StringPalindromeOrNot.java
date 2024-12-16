package src.JavaCourse.CoreJava.JavaMethods.PracticeQuestionSolution;

public class StringPalindromeOrNot {

    public static boolean isPalindrome(String str){
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }
    public static void main(String[] args) {
       String str = "madam";
       String result = isPalindrome(str) ? "Palindrome" : "Not Palindrome";
       System.out.println(result);

    }
}

 /*
 // Anotheer way to check if a String is palindrome or Not

public class StringPalindromeOrNot {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        if (isPalindrome(str)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is Not a Palindrome");
        }
    }
}

 * */