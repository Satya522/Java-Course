package src.JavaQA.NormalProgram;

public class SubArrays {
    public static void subArray(int[] numbers){
        int totalSubarray = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }
                totalSubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total Subarray: "+ totalSubarray);
    }
    public static void main(String[] args) {
        int[] numbers = {2,3,4,5,1,6,8};
        subArray(numbers);
    }
}
