package JavaCourse.DSA.Sorting;

public class SelectionSort {
    public static void selectionSortAlgo(int[] arr){
        int TotalSwaps=0;
       for(int i=0;i<arr.length-1;i++){
           int minIndex= i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[minIndex]){
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
    public static  void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        selectionSortAlgo(arr);
        printArray(arr);
    }
}
