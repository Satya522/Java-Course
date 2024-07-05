package src.JavaQA.NormalProgram;

public class MaxMin {
    public static void main(String[] args) {
        int [] arr={3,1,56,34,12,9,98,23,4};
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum value is "+min+" Maximum value is "+max);
    }
}
