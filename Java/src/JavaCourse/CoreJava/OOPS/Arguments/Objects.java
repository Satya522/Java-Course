package src.JavaCourse.CoreJava.OOPS.Arguments;

import java.util.ArrayList;

public class Objects {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(4);
        System.out.println("Before increment the value of myList is: "+myList);
        increment(myList);  // myList is actual arguments
        System.out.println("After increment the value of myList is: "+myList);
    }
    public static void increment(ArrayList<Integer> myList) {
        myList = new ArrayList<>();
        myList.add(3);
        myList.add(5);
    }
}
