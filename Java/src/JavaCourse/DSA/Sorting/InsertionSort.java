package JavaCourse.DSA.Sorting;
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] >curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }
    /**
Sure, let's break down the Insertion Sort algorithm using an example. here is how the algorithm works step by step:

Consider an array `arr = [29, 10, 14, 37, 13]`.

1. **Initialization**: We start with the second element as the first element is considered sorted. So, `i = 1`, `curr = arr[i] = 10`, and `prev = i - 1 = 0`.

2. **Comparison**: We compare `curr` with `arr[prev]`. If `arr[prev] > curr`, we shift `arr[prev]` to the right. In this case, `29 > 10`, so we shift `29` to the right. The array becomes `[29, 29, 14, 37, 13]`.

3. **Update**: We decrement `prev` by 1 to `prev = -1`. Since `prev` is not `>= 0`, we exit the while loop.

4. **Insertion**: We insert `curr` at `prev + 1` position. So, `arr[0] = 10`. The array becomes `[10, 29, 14, 37, 13]`.

5. **Next Iteration**: We move to the next element. Now, `i = 2`, `curr = arr[i] = 14`, and `prev = i - 1 = 1`.

6. **Comparison**: We compare `curr` with `arr[prev]`. Since `29 > 14`, we shift `29` to the right. The array becomes `[10, 29, 29, 37, 13]`.

7. **Update**: We decrement `prev` to `0`. Now, `arr[prev] = 10` which is not greater than `14`, so we exit the while loop.

8. **Insertion**: We insert `curr` at `prev + 1` position. So, `arr[1] = 14`. The array becomes `[10, 14, 29, 37, 13]`.

We continue this process for all elements in the array. After all iterations, the sorted array is `[10, 13, 14, 29, 37]`.

The key idea of Insertion Sort is to divide the array into a sorted and an unsorted region. The sorted region starts with the first element, and with each iteration, one element from the unsorted region is placed into its correct position in the sorted region.
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        insertionSort(arr);
        printArray(arr);
    }
}
