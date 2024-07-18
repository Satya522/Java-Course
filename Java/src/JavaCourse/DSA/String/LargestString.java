package src.JavaCourse.DSA.String;

public class LargestString {
    public  static String largestString(String[] fruits){
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            // we will compare string lexicographically
            // lexico: apple > banana > kiwi > mango > grapes
            // compareTo() method will compare two strings lexicographically
            // if string is greater than 0 then it will return 1
            // if string is smaller than 0 then it will return -1
            // if string is equal to 0 then it will return 0
            if(largest.compareTo(fruits[i])<0){
                largest= fruits[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
     String[] fruits = {"apple","banana","mango","kiwi","grapes"};
        System.out.println(largestString(fruits));
    }
}
