package src.JavaCourse.DSA.ArrayList;
// Here we use the Collections class to sort the ArrayList
// the Collections class is a utility class that contains static methods for operating on collections
// The Collection class is a member of the Java Collections Framework

//import java.util.*; // You can use this for all packages in the util package of the Java Collections Framework

import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        // Sorting the ArrayList
        Collections.sort(list); // This will sort the Arraylist in ascending order.
        System.out.println(list);

        // Sorting the ArrayList in descending order
        // Collections.sort(list, Collections.reverseOrder()); // use can use This will sort the ArrayList in
        // descending order

        list.sort(Collections.reverseOrder()); // humne pahle hi list ko sort kar diya hai pahle hi isliye hum yaha
        // sort method ka use kar rahe hai Collections class ka use karne ki jarurat nahi hai.
        System.out.println(list);
    }
}
