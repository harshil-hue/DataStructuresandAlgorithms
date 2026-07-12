package BinarySearching;

import java.util.*;

public class OrderAgnosticBinarySearch {

    public static void main() {

        int[] arr = {90 , 85 , 68 , 55 , 41 , 20  , 11 , 4,  1 , 0};

        int target = 1;
        if(arr[0] > arr[arr.length-1]){
            System.out.println(DescendingSearch(arr, target));
        }
        else if (arr[0] == arr[arr.length-1]){
            System.out.println(0);
        }
        else{
            System.out.println(AscendingSearch(arr,target));
        }

    }

    static int DescendingSearch(int[] arr , int target){

        if(arr.length == 0){
            return -1;
        }

        int st = 0 , end = arr.length - 1;

        while(st <= end){
            int mid = st + (end-st)/2;

            if(arr[mid] == target){
                return mid;
            }

            // if middle element is greater than target then search on right side since it's sorted in descending order
            else if(arr[mid] > target){
                st = mid + 1;
            }

            // similarly if smaller than target then search on left side
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    static int AscendingSearch(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }

        int st = 0 , end = arr.length - 1;

        while(st <= end){
            int mid = st + ( end - st ) / 2;

            if(arr[mid] == target){
                return mid;
            }

            else if(arr[mid] > target){
                end = mid - 1;
            }

            else{
                st = mid + 1;
            }
        }
        return -1;
    }
}
