package JavaCourse.DSA.String;

public class LargestString {
    public  static String largestString(String[] fruits){
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            // we can use normal method to compare two strings
            // if(fruits[i].length()>largest.length()){
            //   largest = fruits[i];

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
