package JavaCourse.DSA.ArrayList;

import java.util.ArrayList;
/*
ArrayList is a class in Java that is present in the java.util package. It provides us dynamic arrays in java.

#Operations of ArrayList:
1. add() - It is used to add element in the ArrayList.
2. remove() - It is used to remove element from the ArrayList.
3. get() - It is used to get element from the ArrayList.
4. set() - It is used to set element in ArrayList.
5. contains() - It is used to check whether the element is present in the ArrayList or not.
6. size() - It is used to get the size of the ArrayList.
 */
public class OperationOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add() element in the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("List: " + list);

        // remove() element from the ArrayList
        list.remove(2);
        System.out.println("List after removing element: "+list);

        // get() element from the ArrayList ==> get basically arraylist ke element ko access karne ke liye use kiya
        // jata hai array ki tarah.
        System.out.println("Element at index 2: "+list.get(2));

        // set() element in the ArrayList ==> set basically arrayList ke element ko update karne ke liye use kiya
        // jata hai.
        list.set(2, 100);
        System.out.println("List after updating element: "+list);

        // contains() element in ArrayList ==> contains basically arrayList me element present hai ya nhi uske liye
        // use kiya jata hai.
        System.out.println("Element present in the List: "+list.contains(100));

        // size() of the ArrayList ==> size basically arrayList me kitne element present hai uska size return karta hai

        System.out.println("Size of the List: "+list.size());


    }
}
