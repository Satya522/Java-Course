package JavaCourse.Arrays;
public class PairsOfArray{
    public static void Pairs(int[] arr){
        int totalPairs=0;
        for(int i=0;i<arr.length;i++)
        {
            int currentPosition = arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+currentPosition +","+arr[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: "+totalPairs);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Pairs(arr);
    }
}
