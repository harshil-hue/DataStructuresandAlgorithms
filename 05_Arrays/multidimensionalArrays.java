import java.util.*;

public class multidimensionalArrays {
    public static void main() {
        /*
        datatype[][] variable_name = new datatype[size(rows)][size(columns)]
        [[1,2,3],
         [4,5,6],
         [7,8,9]]
         */

        int[][] squareMatrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] jaggedMatrix = {
                {1,2,3},    // array containing arrays of different sizes
                {4,5},
                {6,7,8,9}
        };


        // multiDimensional array memory allocation
        int[][] arr = new int[3][2];

        Scanner in = new Scanner(System.in);

        // user input for multiDimensional arrays

        // for each row in matrix
        for(int row = 0 ; row < arr.length ; row++){

            // for each column in every row
            for(int col = 0 ; col < arr[row].length ; col++){

                System.out.printf("element of row %d & col %d : ",row+1,col+1);
                arr[row][col] = in.nextInt();

            }
        }

         // for printing the multiDimensional array we use the function .deepToString()
         // .toString() will give the array and inside that array it will give the references of other arrays inside it
        System.out.println(Arrays.deepToString(arr));




        // forEach Loop

        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
        // datatype is also an integer array itself

        //output

        for(int row = 0 ; row < jaggedMatrix.length ; row++){
            for(int col = 0 ; col < jaggedMatrix[row].length ; col++){
                System.out.print(jaggedMatrix[row][col]+" ");
            }
            System.out.println();
        }


    }
}
