package src.JavaQA.NormalProgram;

public class CompareTwoStrings {
    public static void main(String[] args) {
        String s1 = "This is Example1";
        String s2 = "This is Example2";
        int result = s1.compareTo(s2);
        if(result<0){
            System.out.println("s1 is less than s2");
        }else if(result==0){
            System.out.println("s1 is equal to s2");
        }
        else {
            System.out.println("s1 is greater than s2");
        }
    }
}
