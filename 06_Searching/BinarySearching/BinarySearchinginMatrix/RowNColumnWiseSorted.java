package BinarySearching.BinarySearchinginMatrix;

import java.util.Arrays;

public class RowNColumnWiseSorted {

    // as we are moving towards the target element we have to reduce the search space
    // either by eliminating the entire row or column
    public static void main() {
        int[][] mat = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        int[][] mat1 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int target = 10;

        System.out.println(Arrays.toString(Search(mat1,target)));
    }

    static int[] Search(int[][] mat , int target){
        int row = 0;
        int col = mat[0].length - 1;

        while(row < mat.length && col >= 0){

            if(mat[row][col] == target){
                return new int[] {row,col};
            }
            // if the element is greater than the target then all the elements in that column should be greater
            // since it's a sorted matrix so, we are going to eliminate the whole column

            else if(mat[row][col] > target){
                col--;
            }

            // similarly with rows if element is less than the target then it means all the elements in that row
            // should be less than the target element
            // so we will keep searching in the next rows

            else{
                row++;
            }
        }
        return new int[] {-1,-1};
    }
}
