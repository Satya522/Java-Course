package JavaCourse.DSA.String;
// Palindrome String or numbers wo hote hai jise hum jise hum ulta karke deke ya sidha dekho dono same dikhte hai
// Example:"racecar","noon","madam"
public class Palindrome {

    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n= str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "noor";
        System.out.println(isPalindrome(string));
    }
}
