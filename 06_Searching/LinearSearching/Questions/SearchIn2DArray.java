package LinearSearching.Questions;

import java.util.*;

public class SearchIn2DArray {
    public static void main() {

        int[][] arr = new int[][]{
                {23,5,21,67},
                {2,87,91,89,67,45},
                {1,76,999,34,22},
                {18,12}
        };

        int target = 91;

        int[] res = Search(arr,target); //result format { row index , column index }

        System.out.println(Arrays.toString(res));

    }

    // the datatype of method(Search) should be an array since it's going to return array

    static int[]  Search(int[][] arr , int target){

        for(int row = 0 ; row  < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                if(arr[row][col] == target){

                    // creating a new object for storing the row index and col index
                    // and return it in the form of array values
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
