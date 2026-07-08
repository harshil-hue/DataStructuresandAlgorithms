import java.util.Arrays;
import java.util.Scanner;

public class arrayInput {
    public static void main() {

        Scanner in = new Scanner(System.in);


        // Array of Primitives

        System.out.print("Mention the size of array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        // n or arr.length
        for(int i =0 ; i<n ;  i++){
            System.out.print("Enter element "+i+" : ");
            arr[i] = in.nextInt();
        }



        // for-Each loop : rather than fetching item by index we can directly jump to item

        for(int j: arr){
            System.out.print(j+" "); // here j represents element of the arr
        }


        System.out.println(); // leaves an empty space


        // toString method

        // if an array passed to this method then it get converted into string

        System.out.println(Arrays.toString(arr));
    }
}
