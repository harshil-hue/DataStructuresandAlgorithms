package CyclicSort.Questions;

import java.util.*;

public class NumbersDisappearedInArray {
    public static void main() {

        int[] arr = {1,3,4,2,2};
        sort(arr);
         List<Integer> res = new ArrayList<>();
         res = findDisappearedNumbers(arr);
         System.out.println(res);
    }

    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;

            // if the element not at its correct position then swap it
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }

            // if the elements are equal at the pointing index and the correct index,
            // means there are duplicate elements hence ignore them
            else if(arr[i] == arr[correct]){
                i++;
            }

            // if element already in correct position move forward
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


    static List<Integer> findDisappearedNumbers(int[] arr){
        List<Integer> res = new ArrayList<>();

        // if the value is not equal to the value that should be there then ,
        // that value is the missing value in the array

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != i+1){
                res.add(i+1);
            }
        }
        return res;
    }
}
