package BubbleSort;

import java.util.*;

public class bubbleSorting {
    public static void main() {
        int[] arr = {1,2,4};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr) {
        // flag to check whether the given array is already sorted or not
        int f = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 1 ; j < arr.length-i ; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    // if there will be any swap in the first pass
                    // flag = 1 , means the array is not sorted before
                    f = 1;
                }
            }

            // if the flag remains 0 then it means while going through the whole array no swaping occur in first pass
            // hence array is already sorted
            if(f == 0){
                break;
            }
        }

    }
}
