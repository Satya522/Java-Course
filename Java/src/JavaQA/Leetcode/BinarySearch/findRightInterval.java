package JavaQA.Leetcode.BinarySearch;

import JavaQA.Leetcode.Numbers.HappyNumber;

import java.util.Arrays;
import java.util.HashMap;

public class findRightInterval {

    /*
    // Brute force Approach which has TC=O(n^2) and SC=O(n)
    public int[] FindRightInterval(int[][] intervals){
        int[] result = new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            int min = Integer.MAX_VALUE;
            int index=-1;
            for(int j=0;j<intervals.length;j++){
                if(intervals[j][0]>=intervals[i][1] && min > intervals[j][0]){
                    index = j;
                    min = intervals[j][0];
                }
            }
            result[i]= index;
        }
        return result;
    }
     */

    // Optimized Approach which has TC=O(nlogn) and SC=O(n)
    public int[] FindRightInterval(int[][] intervals){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int[] first = new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            hashMap.put(intervals[i][0],i);
            first[i]= intervals[i][0];
        }
        Arrays.sort(first);
        int[] result = new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            int key = binarySearch(first,intervals[i][1]);
            if( key == first.length)
                result[i] = -1;
            else if(key==0){
                if(intervals[i][1]<=first[0])
                    result[i] = hashMap.get(first[0]);
                else
                    result[i]=-1;
            }else
                result[i] = hashMap.get(first[key]);
        }
        return result;
    }
    public int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else
                end = mid -1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,4},{2,3},{3,4}};
        findRightInterval fr = new findRightInterval();
        int[] result = fr.FindRightInterval(intervals);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
