package JavaCourse.DSA.Sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class inbuiltSort {
    public static void main(String[] args) {
        //int[] arr = {29, 10, 14, 37, 13};
        Integer[] arr = {29, 10, 14, 37, 13};
        //Arrays.sort(arr);
        // ye array ko sort karega ascending order me value ko print karega like this 10 13 14 29 37
        //agar hme reverse karna to hume
        // Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr, Collections.reverseOrder());// yeh method int arr pe kaam nhi karta iske liye hume Integer[]
        // arr ko banana padega
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
