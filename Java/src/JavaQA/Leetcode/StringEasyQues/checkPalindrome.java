package StringEasyQues;

import java.util.Scanner;

public class checkPalindrome {
    public static boolean isPalindrome(String s){
      int left = 0;
      int right = s.length()-1;
      while(left<right){
          if(s.charAt(left) != s.charAt(right)){
              return false;
          }
          left++;
          right--;
      }
      return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}
