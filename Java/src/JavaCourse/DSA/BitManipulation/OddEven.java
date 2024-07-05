package src.JavaCourse.DSA.BitManipulation;

public class OddEven {
    public static void oddEven(int n){
        if((n & 1) == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
     oddEven(5);
     oddEven(4);
     oddEven(3);
     oddEven(22);
    }
}
