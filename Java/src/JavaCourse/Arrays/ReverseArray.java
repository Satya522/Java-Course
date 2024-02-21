package JavaCourse.Arrays;

import java.util.Scanner;

public class ReverseArray {

    public  static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<size;i++)
        {
            array[i]= scanner.nextInt();
        }
        reverse(array);
        System.out.println("Reversed array: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
