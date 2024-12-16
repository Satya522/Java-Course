<h1> Leetcode Question Answer</h1>
<h2> Binary Search </h2>
<h3> Explained by: Satyendra Kumar </h3>
<h4> Question:https </h4>
<p> 
    Given a sorted array of integers, return the index of the given key. Return -1 if not found.
</p>
<h4> Answer: </h4>
<p> 
    <b> Solution 1: </b> 
    <br>
    <b> Approach: </b> Binary Search
    <br>
    <b> Time Complexity: </b> O(log n)
    <br>
    <b> Space Complexity: </b> O(1)
    <br>
    <b> Code: </b> 
    <br>
    ```java
    public int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == key) return mid;
            else if(arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    ```
    <br>
    <b> Solution 2: </b> 
    <br>
    <b> Approach: </b> Binary Search
    <br>
    <b> Time Complexity: </b> O(log n)
    <br>
    <b> Space Complexity: </b> O(1)
    <br>
    <b> Code: </b> 
    <br>
    ```java
    public int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == key) return mid;
            else if(arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    ```
    <br>
</p>
```