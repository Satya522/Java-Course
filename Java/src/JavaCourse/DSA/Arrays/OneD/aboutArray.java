package DSA.Arrays.OneD;

public class aboutArray {
    public static void main(String[] args) {
        // Array is a collection of similar data types and stored in contiguous memory locations.
        // Array is a fixed size data structure.
        // Array is a reference data type.
        // Array can store primitive data types as well as object data types.Arrays is a static data structure.

        // Declaration of Array
        //dataType arrName[] = new dataType[size];
        int arr[] = new int[5];
        // or
        int[] arr1 = new int[5];

        // Initialization of array
        int arr2[] = {1,2,3,4,5};
        // or
        int[] arr3 = {1,2,3,4,5};

        // Accessing elements of array
        System.out.println(arr2[0]); // 1
        System.out.println(arr2[4]); // 5

        // Array length
        System.out.println(arr2.length); // 5
    }
}
