package JavaCourse.DSA.Arrays.OneD;

public class find2ndSmallestElement {
    public static int find2ndSmallest(int[] arr){
        int sm1=0,sm2=0;
        int n = arr.length;
        if(arr[0]<arr[1]){
            sm1 = arr[0];
            sm2 = arr[1];
        }else{
            sm1 = arr[1];
            sm2 = arr[0];
        }
        for(int i=2;i<n;i++){
            if(arr[i]<sm1){
                sm2 = sm1;
                sm1 = arr[i];
            }
            else if(arr[i]<sm2 && arr[i] != sm1){
                sm2 = arr[i];
            }
        }
        return sm2;
    }
    public static void main(String[] args) {
        int[] arr = {12,13,1,10,34};
        System.out.println(find2ndSmallest(arr));

    }
}
