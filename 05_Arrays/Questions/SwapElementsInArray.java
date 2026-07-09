package Questions;

import java.util.*;

public class SwapElementsInArray {
    public static void main() {
        int[] arr = {1,99,1,1,1,88,1,1,1};
        swap(arr,1,5); // here arguments are (array , index 1 , index 2) and swap index 1 element with index 2 element
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
