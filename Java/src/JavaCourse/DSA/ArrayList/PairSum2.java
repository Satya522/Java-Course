package src.JavaCourse.DSA.ArrayList;
// find if any pair in a Sorted and Rotated ArrayList has a target sum.
// list =[11,15,6,8,9,10] target = 16

import  java.util.ArrayList;
public class PairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(PairSumOptimized(list, target));
    }

    public static boolean PairSumOptimized(ArrayList<Integer> list, int target){
        // 2 pointer approach   // TC = O(n)
        // list should be sorted and rotated
        // if not sorted the list using Collections.sort(list;
        int pivot = findPivot(list);
        int lp = (pivot+1)%list.size();
        int rp = pivot;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }else if(list.get(lp)+list.get(rp) > target){
                rp = (rp-1+list.size())%list.size();
            }else{
                lp = (lp+1)%list.size();
            }
        }
        return false;

    }

    public static int findPivot(ArrayList<Integer> list){
        int start = 0;
        int end = list.size()-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && list.get(mid)>list.get(mid+1)){
                return mid;
            }
            if(mid>start && list.get(mid)<list.get(mid-1)){
                return mid-1;
            }
            if(list.get(start)>=list.get(mid)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
