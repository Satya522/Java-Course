package src.JavaCourse.DSA.Sorting;
public class SelectionSort {
    public static void selectionSort(int[] arr){
        int TotalSwaps=0;
       for(int i=0;i<arr.length-1;i++){
           int minIndex= i;
           for(int j=i+1;j<arr.length;j++){
              if(arr[minIndex]>arr[j]){
                  minIndex=j;
              }
           }
           if(minIndex!=0){
               int temp = arr[i];
               arr[i]=arr[minIndex];
               arr[minIndex]=temp;
               TotalSwaps++;
           }
       }
        System.out.println("Total number of Swaps: "+TotalSwaps);
    }
    /**
     * Let's break down the selection algorithm using example. how the algorithm works step by step:
Consider an array `arr = [29, 10, 14, 37, 13]`.
1. **Initialization**: We start with the first element. So, `i = 0`, and `minValue = i = 0`.
2. **Inner Loop & Comparison**: The inner loop starts with `j = i + 1 = 1`. It compares `arr[minValue]` (which is `29`) with `arr[j]` (which is `10`). Since `10` is smaller, `minValue` is updated to `1`.
3. **Finding Minimum**: The inner loop continues to the next element, `14`, and compares it with `arr[minValue]` (which is `10`). Since `14` is larger, `minValue` remains `1`. This process continues for all elements in the array. At the end of the first pass of the inner loop, `minValue` points to the smallest element in the array.
4. **Swap**: If `minValue` is not equal to `i`, it means the smallest element is not at its correct position. So, the code swaps the `i`th element with the `minValue`th element. In our example, `29` and `10` are swapped. The array now looks like this: `[10, 29, 14, 37, 13]`. The `TotalSwaps` counter is incremented by 1.
5. **Next Iteration**: The outer loop moves to the next element (`i=1`), and the process is repeated until the entire array is sorted.
After all iterations, the sorted array is `[10, 13, 14, 29, 37]` and `TotalSwaps` is `2` (swaps happened during the first and second iterations of the outer loop).

The key idea of Selection Sort is to divide the array into a sorted and an unsorted region. The sorted region starts with the first element, and with each iteration, the smallest element from the unsorted region is selected and swapped with the first element of the unsorted region, thereby extending the sorted region by one element.
     */
    public static  void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        selectionSort(arr);
        printArray(arr);
    }
}
