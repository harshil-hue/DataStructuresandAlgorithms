package Questions;

import java.util.*;

public class ReversingArray {
    public static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Mention array length : ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }

        Reverse(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void Reverse(int[] arr){
        int st = 0;
        int end = arr.length-1;

        while(st < end){

            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }
    }
}
