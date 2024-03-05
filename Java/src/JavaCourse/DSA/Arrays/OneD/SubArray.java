
/*
Question1: What is a subarray in java?
                             -->A subarray in Java is a contiguous part of a parent array. It's a smaller array
that is derived from a larger array,where the elements are in the same order as they are in the original array.

For example, if we have an array `arr = {1, 2, 3, 4, 5}`, a subarray could be `{2, 3, 4}`
which starts from the second element and ends at the fourth element of the original array.

In Java, you can create a subarray by using the `Arrays.copyOfRange` method. Here is an example:

*/



package JavaCourse.DSA.Arrays.OneD;
import java.util.Arrays;
public class SubArray {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        int[] subArray = Arrays.copyOfRange(arr, 1, 4); // This will create a subarray from index 1 (inclusive) to 4 (exclusive)
        System.out.println(Arrays.toString(subArray)); // This will print [2, 3, 4]
        //  In this example, `Arrays.copyOfRange(arr, 1,4)` creates a new array that contains elements from the second element
        //  (index 1) to the fourth element (index 3) of the original array.The second parameter is inclusive and the
        //  third parameter is exclusive.
    }
}



/*
Question: What are some other methods to create a subarray in Java?

Answer: In Java, there are several ways to create a subarray apart from using Arrays.copyOfRange method.
Here are a few methods:

1:Using System.arraycopy:
                        This method copies a source array from a specific beginning position to the destination
                        array from the mentioned position.
*/
/*
package JavaCourse.Arrays;
import java.util.Arrays;
public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] subArray = new int[3];
        System.arraycopy(arr, 1, subArray, 0, 3);
        for (int i : subArray) {
            System.out.print(i + " ");

//In this example, System.arraycopy(arr, 1, subArray, 0, 3) copies elements from the second element (index 1) to the fourth
//element (index 3) of the original array into the subArray.
        }
    }
}
*/

/*
2.Using Arrays.stream and IntStream.range:
                                         This method uses Java 8's Stream API to create a subarray.
/*
import java.util.Arrays;
import java.util.stream.IntStream;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] subArray = Arrays.stream(arr, 1, 4).toArray();
        System.out.println(Arrays.toString(subArray)); // This will print [2, 3, 4]

//In this example, Arrays.stream(arr, 1, 4).toArray() creates a new array that contains elements
//from the second element (index 1) to the fourth element (index 3) of the original array.

   }
}
*/


/*
3.Using for loop:
                This is a traditional way of creating a subarray by iterating over the elements of the original array.

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] subArray = new int[3];
        for (int i = 0; i < 3; i++) {
            subArray[i] = arr[i + 1];
        }
        for (int i : subArray) {
            System.out.print(i + " ");
        }
    }
}

//In this example, the for loop iterates over the elements of the original array starting from the second element
//(index 1) to the fourth element (index 3) and copies them into the subArray.

*/

/*
Question: What are the use cases of subArrays in java ?
Answer: SubArrays are used in various programming problem and algorithms to solve problem efficiently.
Here are some use cases of SubArrays in java:

1.Divide and Conquer Algorithms:
                                Subarrays are often used in divide and conquer algorithms, where a problem is divided
 into smaller subproblems (subarrays), solved individually, and then combined to form the solution of the original problem. Examples of such algorithms include Quick Sort, Merge Sort, and Binary Search.

2.Sliding Window Problems:
                         In problems related to arrays where you need to consider a subset of elements for a certain
 operation, subarrays are used. For example, finding the maximum sum of 'k' consecutive elements in an array.

3.Dynamic Programming Problems:
                              In dynamic programming, subarrays are used to store intermediate results for larger
problems. For example, in the problem of finding the longest increasing subsequence in an array, we often use a subarray to store the longest increasing subsequence found so far.
Data Segmentation: Subarrays can be used to segment data. For instance, if you have an array of data and you want to process or analyze a specific segment of that data, you can create a subarray for that segment.

4.Matrix Operations:
                   When dealing with matrices (2D arrays), subarrays can be used to represent rows or columns, or
submatrices within the larger matrix. This is useful in many mathematical and image processing operations.
 */