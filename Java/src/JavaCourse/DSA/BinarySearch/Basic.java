package src.JavaCourse.DSA.BinarySearch;

public class Basic {
    public static void main(String[] args) {
        /*
        Binary Search: It is a searching algorithm that finds the position of a target value within a sorted array.
        1. It compares the target value to the middle element of the array.
        2. If the target value is equal to middle element, then the position is returned.
        3. If the target value is less than the middle element, then the search continues in the lower half of the array.
        4. If the target value is greater than the middle element, then the search continues in the upper half of the array.
        5. This process continues until the target value is found or the remaining array is empty.

        Time Complexity: O(log n)
        Space Complexity: O(1)

        Binary Search can only be applied on a sorted array.

        */


        /*
        this is basically pseudocode for bs
        int binarySearch(int arr[], int x) {
            int low = 0, high = arr.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == x) return mid;
                else if (arr[mid] < x) low = mid + 1;
                else high = mid - 1;
            }
            return -1;
        }

        */

    }
}
