
// Question: Write a Java program to iterate through all elements in an array list.
package JavaCourse.DSA.ArrayList.W3R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IterateArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Red");
        stringArrayList.add("Green");
        stringArrayList.add("Orange");
        stringArrayList.add("White");
        stringArrayList.add("Black");
        // print the list
        for(String color: stringArrayList){
            System.out.println(color);
        }

    }
}
