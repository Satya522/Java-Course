package JavaCourse.DSA.Arrays.OneD;


import java.util.Scanner;

public class LargestValueInArray {

    public static int  findLargestValue(int[] array)
    {
        int largestValue = Integer.MIN_VALUE;
        int smallestvalue = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>largestValue)
            {
                largestValue = array[i];
            }
            if (array[i]<smallestvalue)
            {
                smallestvalue=array[i];
            }

        }
        System.out.println("Smallest value in the array is: "+ smallestvalue);
        return largestValue;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        System.out.println("Enter the element of array:");
        for(int i=0;i<sizeOfArray;i++)
        {
            array[i]=scanner.nextInt();

        }
        System.out.println("Largest value in the array is: "+findLargestValue(array));
    }
}
