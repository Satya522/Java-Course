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

    public static void bubbleSort(int[] arr) {
        int TotalSwaps = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i- 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    TotalSwaps++;
                }
            }
        }
        System.out.println("Total Swaps: " + TotalSwaps);
    }
/**
let's break down the Bubble Sort algorithm using a more detailed example:

Consider an array `arr = [29, 10, 14, 37, 13]`.

1. **Initialization**: We start with the first element. So, `i = 0`.

2. **Inner Loop & Comparison**: The inner loop starts with `j = 0`. It compares `arr[j]` (which is `29`) with `arr[j + 1]` (which is `10`). Since `29` is greater than `10`, a swap is needed.

3. **Swap**: The code swaps the `j`th element with the `(j + 1)`th element. In our example, `29` and `10` are swapped. The array now looks like this: `[10, 29, 14, 37, 13]`. The `TotalSwaps` counter is incremented by 1.

4. **Continuing the Inner Loop**: The inner loop moves to the next pair of elements (`j=1`), and the process is repeated until the end of the array. At the end of the first pass of the inner loop, the largest element `37` has bubbled up to the end of the array.

5. **Next Iteration**: The outer loop moves to the next element (`i=1`), and the process is repeated until the entire array is sorted. However, with each iteration of the outer loop, the inner loop gets shorter by one, as the end of the array accumulates the largest elements in sorted order.

After all iterations, the sorted array is `[10, 13, 14, 29, 37]` and `TotalSwaps` is `5` (swaps happened during the sorting process).

The key idea of Bubble Sort is to repeatedly swap adjacent elements if they are in the wrong order. This process continues until no more swaps are needed, indicating that the array is sorted.
 */
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,14,12,24,16,19};
        bubbleSort(arr);
        printArray(arr);
    }
}
/*
In the `main` method, we call the `bubbleSortAlgo` method to sort the array. After sorting, we print the elements of the
 array which are now in ascending order.
 */