/*
Bubble Sort is a simple comparison-based sorting algorithm. It works by repeatedly swapping the adjacent elements if they are in the wrong order. Here's a step-by-step explanation:

1. Start from the first element of the array, compare it with the next element, i.e., compare the element at index 0 with the element at index 1.
2. If the first element is greater than the second element, swap them. If not, move to the next pair of elements, i.e., compare the element at index 1 with the element at index 2.
3. Continue this process until the end of the array. At this point, the largest element would have moved to the end of the array.
4. Repeat the process starting from the first element but now until the second last element. Continue this process, reducing the length of the unsorted part of the array by one each time, until no more swaps are needed.

Here's an example of how Bubble Sort works on an array of integers:
*/
package JavaCourse.DSA.Sorting;

public class bubbleSort {

    public static void bubbleSortAlgo(int[] arr) {
        int TotalSwaps = 0;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    TotalSwaps++;
                }
            }
        }
        System.out.println("Total Swaps: " + TotalSwaps);
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,14,12,24,16,19};
        bubbleSortAlgo(arr);
        printArray(arr);
    }
}
/*
In the `main` method, we call the `bubbleSortAlgo` method to sort the array. After sorting, we print the elements of the
 array which are now in ascending order.
 */