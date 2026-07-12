package BinarySearching;

import java.util.*;
public class BinarySearch {

    // return if the element is present in the array or not using binary searching
    public static void main() {

        int[] arr = {3,65,34,89,91,56,22,72,55,90,100};

        // Binary search needs a sorted array

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int target = 90;

        System.out.println(BinarySearch(arr , target));

    }

    static int BinarySearch(int[] arr , int target){

        if(arr.length == 0){
            return -1;
        }

        int st = 0;
        int end = arr.length - 1;

        while(st <= end){

            // find middle element

            //int mid = (st + end) / 2;

            // might possible that ( st + end ) exceeds the range if int for a larger array

            int mid = st + (end - st) / 2;

            // if middle element is the target element
            if(arr[mid] == target){
                return mid;
            }

            // if middle element is larger than target element then we will search on left side of middle element
            else if(arr[mid] > target){
                end = mid - 1;
            }

            // if middle element is smaller than target element then we will search on right side of middle element
            else{
                st = mid + 1;
            }
        }

        // if element not found
        return -1;
    }


}
