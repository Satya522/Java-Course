package JavaCourse.DSA.Sorting;

public class CountingSort {
    /*
    The countingSort function is an implementation of the Counting Sort algorithm, which is an integer sorting algorithm.
    It operates by counting the number of objects that have distinct key values, and using arithmetic on those counts to
    determine the positions of each key value in the output sequence.
     */
   public static void countingSort(int[] arr){
       /*
       1.Find the maximum value in the array: The function starts by initializing largest to the smallest possible
       integer value. It then iterates over the array arr, updating largest to be the maximum of largest and the
       current array element. This gives us the maximum value in the array.
        */
         int largest = Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
              largest = Math.max(largest,arr[i]);
         }
         /*
         Initialize the count array: An array count of size largest+1 is created and initialized with zeros. This array
         will hold the count of each number in the array arr. The size is largest+1 because the array is zero-indexed.
          */
         int[] count = new int[largest+1];

       /*
       Count the frequency: The function then iterates over the array arr again, incrementing the count of each number
       in the count array.
        */
       for(int i=0;i<arr.length;i++){
           count[arr[i]]++;
       }

       /*
       Populate the original array: The function initializes a counter j to 0. It then iterates over the count array.
       For each index i, it enters a while loop that continues until count[i] is 0. Inside the loop, it sets arr[j] to i,
       increments j, and decrements count[i]. This effectively places each number in arr in sorted order, as lower
       numbers have lower indices in the count array and are therefore placed in arr first.
        */
       int j=0;
       for(int i=0;i<count.length;i++){
           while (count[i]>0){
               arr[j] = i;
               j++;
               count[i]--;
           }
       }
   }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // this method only printing the value of the array
    public static void main(String[] args) {
        int[] arr = {1,4,1,2,7,5,2,5,8};
       countingSort(arr);
       printArray(arr);
    }
}
/*
   For example, consider the array arr = [1, 4, 1, 2, 7, 5, 2, 5, 8]. The maximum value is 8, so a count array of size 9
   is created. After counting the frequencies, count is [0, 2, 2, 0, 1, 2, 0, 1, 1]. The function then populates arr
   with the numbers 1, 1, 2, 2, 4, 5, 5, 7, 8, which is the sorted version of the original array.
    */