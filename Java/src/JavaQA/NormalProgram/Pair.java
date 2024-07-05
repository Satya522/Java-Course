package src.JavaQA.NormalProgram;

public class Pair {
    public static void countPair(int[] arr){
        int start =0;
        int end = arr.length-1;
        int totalPair =0;
        while(start<=end){
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    totalPair++;
                    start++;
                    end--;
                }
            }
        }
        System.out.println(totalPair);
    }
    public static void main(String[] args) {
        int[] arr ={2,4,6,8,10};
        countPair(arr);


    }
}
