package JavaCourse.DSA.ArrayList;
/*
ArrayList in Java is a resizable array, which can be found in the java.util package. Unlike a traditional array that is
fixed in size, an ArrayList grows its size automatically when new elements are added to it. It is part of the Java
Collection Framework.

 Here are some key points about ArrayList:

Dynamic Size: ArrayList is dynamic size. It grows automatically when we add elements to it and shrinks when we
remove elements from it.

Order: ArrayList maintains the insertion order, i.e., the order in which elements are added to it.

Null Elements: ArrayList allows null and duplicate elements.

Random Access: ArrayList provides random access to its elements because it implements the RandomAccess interface. This
means we can directly access any element in the ArrayList with its index number.

Non-synchronized: ArrayList is non-synchronized, which means multiple threads can work on ArrayList at the same time.
For a synchronized version, we can use Collections.synchronizedList method
 */
import java.util.ArrayList;

public class aboutArrayList {
    public static void main(String[] args) {
        // create an array list
        ArrayList<String> list = new ArrayList<>();
        /*
        ArrayList -- ek class hai
        <> -- Iske under jo likha hota hai wo data type ka class hota hai
        list -- ek variable hai
         */
        // ArrayList <DataType ka class> hota hai jise hum use directly use karte hai

        // Add elements to ArrayList
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");

        // Display the elements in the ArrayList
        System.out.println("Elements in ArrayList: " + list);

        // Remove an element from ArrayList
        //list.remove("Element2");

        // Display the elements in the ArrayList after removal
        //System.out.println("Elements in ArrayList after removal: " + list);

        // Get an element from ArrayList
        String element = list.get(1);
        System.out.println("Element at index 1: " + element);

        // set element at index
        list.set(1,"element4"); // 1 is index number and element4 is value at stored at index 1
        System.out.println(list);

        //  Contains element
        // ye batata hai ki us list me wo element present hai ya nhi

        // Get the size of the ArrayList
        int size = list.size();
        System.out.println("Size of ArrayList: " + size);
    }
}
