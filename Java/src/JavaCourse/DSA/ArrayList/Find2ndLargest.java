package src.JavaCourse.DSA.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Find2ndLargest {
    public static Integer find2ndLargest(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        // store the value of the array in the list
        for(int value: arr){
            list.add(value);
        }
        //sort the unique list
        Collections.sort(list);
        //find the 2nd largest element
         Integer secondLargest = list.get(list.size()-2);
        return secondLargest;

    }

    public static void main(String[] args) {
        int[] arr = {10,30,20,10,20,50,40};
        System.out.println(find2ndLargest(arr));
    }
}
