// write a java program to sort a numeric & string array
package DSA.Arrays.OneD;
import java.util.Arrays;
public class ArraySorting {
    public static void main(String[] args) {
        int[] number = {1789,2035,1899,1456,2013,1458,2458,1254,1472};
        String[] string = {"Jhon", "Zack", "Alex", "Randy", "Monica"};
        System.out.println("Original number array: "+ Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("Sorted array: "+ Arrays.toString(number));
        System.out.println(); // we use this space between array number and array string

        System.out.println("Original String Array: "+Arrays.toString(string));
        Arrays.sort(string);
        System.out.println("Sorted Array String: "+Arrays.toString(string));

    }
}
