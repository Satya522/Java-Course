package src.JavaCourse.DSA.ArrayList;

import java.util.ArrayList;

public class pairSum1 {

    public static boolean PairSum(ArrayList<Integer> list, int target){
        // Brute force method  // TC = O(n^2)
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j <list.size(); j++) {
                if((list.get(i)+list.get(j)) == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean PairSumOptimized(ArrayList<Integer> list, int target){
        // 2 pointer approach   // TC = O(n)
        // list should be sorted
        // if not sorted the list using Collections.sort(list;
        int lp =0;
        int rp = list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }else if(list.get(lp)+list.get(rp) > target){
                rp--;

            }else{
                lp++;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 4;
        System.out.println(PairSumOptimized(list, target));

    }
}
