package JavaCourse.Arrays;
import java.util.Scanner;
public class LinearSearch {

    public static int linearSearch(int[] arr, int search)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == search) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of array:");
        for(int i=0;i<size;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int search = scanner.nextInt();
        int result = linearSearch(arr, search);
        if(result ==-1)
        {
            System.out.println("Element not found!");
        }
        else {
            System.out.println("Element found at index: "+result);
        }

    }
}
