package JavaCourse.DSA.Arrays.OneD;

import java.util.Scanner;

public class PassByReferenceArray {
    public static void update(int marks[]){
        for(int i=0;i< marks.length;i++){
            marks[i] = marks[i]+ 1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks[] = {97,98,99};
        System.out.println("Before change: ");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        update(marks);
        System.out.println("After change: ");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

    }
}
