package InsertionSort;

import java.util.*;

public class insertionSort {
    public static void main() {

        int[] arr = {-2,-4,1,0,-8,43};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        // outer loop will be running (N-1) times
        // where N is length of array
        for(int i = 0 ; i < arr.length - 1; i++){

            // the j loop is opposite as it is checking the element till the starting
            // is the element is at its correct position or not
            // if the element is on its correct position then the loop will get break

            for(int j = i+1 ; j > 0 ; j--){

                // if the element before the pointed the element is smaller,
                // then the elements will get swap with each other

                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                // if element is at its correct position then the inner loop will break

                else{
                    break;
                }
            }
            // we are not checking for the remaining elements on the left side since they are already sorted
        }
    }
}
