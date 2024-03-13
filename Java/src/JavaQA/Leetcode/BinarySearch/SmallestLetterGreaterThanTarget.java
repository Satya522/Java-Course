package JavaQA.Leetcode.BinarySearch;

public class SmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target){
        int start =0;
        int end = letters.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(letters[mid]<=target){
                start = mid+1;
            }else {
                end = mid-1;
            }

        }
        return letters[start%letters.length]; // letters[start%letters.length] is used to wrap around the array
    }

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        char result = nextGreatestLetter(letters,target);
        System.out.println(result);
    }
}
