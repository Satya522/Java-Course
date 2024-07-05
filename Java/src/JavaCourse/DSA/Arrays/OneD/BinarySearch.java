package DSA.Arrays.OneD;

import java.util.Scanner;

import java.util.Arrays;

// 1st way to implement binary search

/*
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        int result = Arrays.binarySearch(arr, key);
        if (result < 0) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
*/
public class BinarySearch {
    public static int binarySearch(int[] arr, int key)
    {
        int start = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]<key)
            {
                start=mid+1;
            }
            else {
                end = mid -1;
            }

        }
        return -1; // return -1 if element not found in array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of array:");
        for (int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int key = scanner.nextInt();
        int result = binarySearch(arr,key);
        if(result == -1){
            System.out.println("Element not found in array!");
        }
        else
        {
            System.out.println("Element found in array at index: "+ result);
        }

    }
}
