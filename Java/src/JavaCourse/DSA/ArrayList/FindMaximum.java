package src.JavaCourse.DSA.ArrayList;

import java.util.ArrayList;

public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(3);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
//            if(list.get(i)>max){
//                max = list.get(i);
//            }
            // or we can use Math.max() method
            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum element in the List: "+max);
    }
}
