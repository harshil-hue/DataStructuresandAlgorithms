package SelectionSort;

import java.util.*;

public class selectionSort {

    public static void main() {
        int[] arr = {3,5,1,2};
        selectionSort(arr);

    }

    static void selectionSort(int[] arr){

        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++){

            // taking the value at required last index
            int lastIndex = arr.length-i-1;

            // finding the max value from the given array
            int maxIndex = getMaxIndex(arr,0,lastIndex);

            // swapping the max value from the value at last index
            swap(arr,maxIndex,lastIndex);
    }
    }

    // Finding the max value from the subarray given
    static int getMaxIndex(int[] arr , int st , int end){
        int max = st;
        for(int i  = st ; i <= end ; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    // swapping max element from the required last index to place the value at its correct index
    static void swap(int[] arr , int max , int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

}
