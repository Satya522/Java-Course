package src.JavaCourse.DSA.String;
// Check if two strings are anagrams of each other

// Two string are anagram of each other if they have same characters but in different order
public class Anagrams {

    public static boolean isAnagram(String str1, String str2){
        // we check if the length of both strings are same or not if not then they can not be anagrams
        if(str1.length() != str2.length()){
            return false;
        }
        // we create an array of 26 length to store the count of each character in the string
        int[] count = new int[26];


        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)-'a']++; // count[str1.charAt(i)-'a']++ why we - 'a'
        }
        for(int i=0;i<str2.length();i++){
            count[str1.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1,str2));

    }
}
