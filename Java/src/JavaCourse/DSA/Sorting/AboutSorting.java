/*
Sorting is a fundamental concept in computer science and is the process of arranging data in a particular format. Sorting algorithm specifies the way to arrange data in a particular order. Most common orders are in numerical or lexicographical order.

The importance of sorting lies in the fact that data searching can be optimized to a very high level, if data is stored in a sorted manner. Sorting is also used to represent data in more readable formats.

Here are some of the most common sorting algorithms:

1. **Bubble Sort**:
                  It is a simple comparison-based algorithm in which each pair of adjacent elements is compared and the
          elements are swapped if they are not in order. This algorithm is not suitable for large data sets as its average and worst-case complexity are of Ο(n^2) where n is the number of items.

2. **Selection Sort**:
                     This is also a simple comparison-based algorithm. The idea behind it is to divide the array to two
               parts: sorted and unsorted. Find the smallest element in the unsorted array and swap it with the leftmost unsorted element so it is now part of the sorted array. This continues until all the elements are in the sorted array. The average and worst-case complexity of this algorithm are Ο(n^2), where n is the number of items.

3. **Insertion Sort**:
                     This is a simple comparison-based algorithm. The array is divided into a sorted and an unsorted
                  region. One by one, the unsorted elements are moved and inserted into the sorted region. The average and worst-case complexity of this algorithm are Ο(n^2), where n is the number of items.

4. **Quick Sort**:
                  QuickSort is one of the most efficient sorting algorithms and is based on the partitioning of an array
                of data into smaller arrays. A large array is partitioned into two arrays one of which holds values smaller than the specified value, say pivot, based on which the partition is made and another array holds values greater than the pivot value. QuickSort partitions an array and then calls itself recursively twice to sort the two resulting subarrays. The average and worst-case complexity of this algorithm are Ο(n log n), where n is the number of items.

5. **Merge Sort**:
                 Merge sort is a divide-and-conquer algorithm based on the idea of breaking down a list into several
           sub-lists until each sublist consists of a single element and merging those sublists in a manner that results into a sorted list. The average and worst-case complexity of this algorithm are Ο(n log n), where n is the number of items.

In addition to the sorting algorithms I mentioned earlier, there are several other sorting algorithms commonly used in computer science. Here are a few:

6. **Heap Sort**:
                Heap Sort is a comparison-based sorting algorithm that uses a binary heap data structure. It divides
                its input into a sorted and an unsorted region, and iteratively shrinks the unsorted region by extracting the largest element and moving that to the sorted region. The improvement from bubble sort is that it only makes a pass through the data n times, not n^2 times. The time complexity of this algorithm is Ο(n log n), where n is the number of items.

7. **Shell Sort**:
                 Shell Sort is a generalized version of insertion sort. It allows the exchange of items that are far
              apart. The idea is to arrange the data sequence in a two-dimensional array and sort the columns which are far apart and successively reduce the interval between the columns that are being sorted. The time complexity of this algorithm depends on the gap sequence, with the best known worst-case time complexity being Ο(n log^2 n).

8. **Radix Sort**:
                 Radix Sort is a non-comparative integer sorting algorithm that sorts data with integer keys by
                 grouping keys by the individual digits which share the same significant position and value. The time complexity of this algorithm is Ο(nk), where n is the number of elements and k is the number of digits in the maximum number.

9. **Bucket Sort**:
                 Bucket Sort is a comparison sort algorithm that operates on elements by dividing them into different
            buckets and then sorting these buckets individually. Each bucket is sorted individually using a separate sorting algorithm or by applying the bucket sort algorithm recursively. The time complexity of this algorithm is Ο(n + k), where n is the number of elements and k is the number of buckets.

10. **Counting Sort**:
                     Counting Sort is a sorting algorithm that sorts the elements of an array by counting the number
 of occurrences of each unique element in the array. The count is stored in an auxiliary array and the sorting is done by mapping the count as an index of the auxiliary array. The time complexity of this algorithm is Ο(n + k), where n is the number of elements and k is the range of input.

6. **Tim Sort**:
               Tim Sort is a hybrid stable sorting algorithm, derived from merge sort and insertion sort, designed to
          perform well on many kinds of real-world data. It was implemented by Tim Peters in 2002 for use in the Python programming language. The algorithm finds subsequences of the data that are already ordered, and uses that knowledge to sort the remainder more efficiently. The time complexity of this algorithm is Ο(n log n), where n is the number of items.

Each of these sorting algorithms has its own strengths and weaknesses, and the choice of which to use depends on the specific requirements of the task at hand.
*/
package JavaCourse.DSA.Sorting;
public class AboutSorting {
    public static void main(String[] args) {
        System.out.println("This is all about Sorting Algorithms.");
    }
}
