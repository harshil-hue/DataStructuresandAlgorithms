package CyclicSort.Questions;

import java.util.*;

public class FirstMissingPositive {
    public static void main() {
        int[] arr = {7,8,9,10,11};
        sort(arr);

        for(int i = 0 ;i < arr.length ; i++){

            // check if all the elements are at their correct index or not
            // if not then the number which should be at the index is the missing number in the given array
            if(arr[i] != i+1){
                System.out.println(i+1);
                return;
            }
        }
        // if all the elements are present from [1,arr.length] then the next positive element will be the smallest
        System.out.println(arr.length+1);
    }

    static void sort(int[] arr){
        int i = 0;

        while(i < arr.length){
            int correct = arr[i] - 1;
            // 3 conditions that an element should pass through
            // 1-> element should be positive
            // 2-> element should be in the range [1 , arr.length]
            // 3-> if element is not at its correct index

            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
