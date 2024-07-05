package src.JavaCourse.DSA.String;

import java.util.Scanner;

public class reverseAstring {
    public static String reversedString(String string){
        String reverse = "";
        for(int i=string.length()-1;i>=0;i--){
            reverse += string.charAt(i);
        }
        return reverse;
    }

    public static String reversedStringUsingStringBuilder(String str){
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string: ");
        String string = scanner.nextLine();
        System.out.println("Reverse string is: "+reversedString(string));
        System.out.println(reversedStringUsingStringBuilder(string));
    }
}
