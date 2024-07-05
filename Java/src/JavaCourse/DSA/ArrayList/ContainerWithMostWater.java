package src.JavaCourse.DSA.ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {

    public static int StoreWater(ArrayList<Integer> height){
        // brute force method
        // TC = O(n^2)
        int mwt =0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht= Math.min(height.get(i),height.get(j));
                int width = j-i;
                int currWt = ht*width;
                mwt = Math.max(mwt,currWt);
            }
        }
        return mwt;
    }

    public static int StoredWaterOptimized(ArrayList<Integer> height){
        // Optimized Method ( Two Pointer Approach)
        // TC = O(n)
        int mwt = 0;
        int leftPointer=0;
        int rightPointer=height.size()-1;
        while(leftPointer<rightPointer){
            int ht = Math.min(height.get(leftPointer),height.get(rightPointer));
            int width = rightPointer-leftPointer;
            int currWt = ht*width;
            mwt = Math.max(mwt,currWt);
            if(height.get(leftPointer)<height.get(rightPointer)){
                leftPointer++;
            }
            else{
                rightPointer--;
            }
        }
        return mwt;

    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
       // System.out.println(StoreWater(height));
        System.out.println(StoredWaterOptimized(height));
    }
}
