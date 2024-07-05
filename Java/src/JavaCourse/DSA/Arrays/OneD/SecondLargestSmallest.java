package src.JavaCourse.DSA.Arrays.OneD;

import java.util.Arrays;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        int []arr={1,9,4,8,10,5,6};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1]) {
                System.out.println("Second Smallest: "+arr[i + 1]);
                break;
            }
        }
        for(int i=arr.length-1;i>0;i--)
        {
            if(arr[i-1]!=arr[i]) {
                System.out.println(arr[i-1]);
                break;
            }
        }
    }
}
