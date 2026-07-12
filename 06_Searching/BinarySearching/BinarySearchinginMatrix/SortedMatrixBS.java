package BinarySearching.BinarySearchinginMatrix;

import java.util.*;

public class SortedMatrixBS {
    public static void main() {

        int[][] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int target = 11;

        System.out.println(Arrays.toString(Search(mat,target)));


    }

    // searching target in the row , between the columns provided

    static int[] binarySearch(int[][] mat , int row , int cStart , int cEnd , int target){

        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;

            if(mat[row][mid] == target){
                return new int[]{row,mid};
            }

            else if(mat[row][mid] > target){
                cEnd = mid-1;
            }
            else{
                cStart = mid+1;
            }
        }
        return new int[]{-1,-1};

    }



    static int[] Search(int[][] mat , int target){

        int rows = mat.length;
        int cols = mat[0].length;

        // check if the matrix is empty
        if(cols == 0){
            return new int[]{-1,-1};
        }

        // there is only one row in the matrix
        // apply simple binary search in that row
        if(rows == 0){
            return binarySearch(mat,0,0,cols-1,target);
        }


        // run the loop till we get the 2 feasible rows

        int rStart = 0;
        int rEnd = rows - 1;
        int midCol = cols / 2;

        while(rStart < (rEnd-1)){

            // if we take only rEnd then it will return only one row

            int mid = rStart + (rEnd - rStart)/2;
            if(mat[mid][midCol] == target){
                return new int[]{mid,midCol};
            }
            if(mat[mid][midCol] < target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }

        // now we have two rows
        // first row index is rStart
        // second row index is rEnd



        // check whether the target is in the middle col of these two rows

        if(mat[rStart][midCol] == target){
            return new int[]{rStart,midCol};
        }

        if(mat[rStart+1][midCol] == target){
            return new int[] {rStart+1 ,midCol};
        }


        // search in 1st half
        if (target <= mat[rStart][midCol - 1]) {
            return binarySearch(mat, rStart, 0, midCol-1, target);
        }
        // search in 2nd half
        if (target >= mat[rStart][midCol + 1] && target <= mat[rStart][cols - 1]) {
            return binarySearch(mat, rStart, midCol + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= mat[rStart + 1][midCol - 1]) {
            return binarySearch(mat, rStart + 1, 0, midCol-1, target);
        } else {
            return binarySearch(mat, rStart + 1, midCol + 1, cols - 1, target);
        }


    }
}
