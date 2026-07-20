package CyclicSort;

import java.util.*;

public class cyclicSort {
    public static void main() {

        // array should be start from 1 to N
        // no skipped elements

        int[] arr = {4,3,2,7,8,2,3,1};;
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr , i , correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
