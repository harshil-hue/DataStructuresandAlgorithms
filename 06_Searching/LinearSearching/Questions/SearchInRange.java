package LinearSearching.Questions;

import java.util.*;

public class SearchInRange {

    // search for a particular target in the given range of indexes

    public static void main() {

        int[] arr = {4,5,3,1,7,8,998,55,53,36,32,24,50,61,722,5332,34};

        System.out.println(LSearch(arr , 2 , 9 , 55));

    }

    static int LSearch(int[] arr , int idx1 , int idx2 , int target){

        if(arr.length == 0)
            return -1;


        for(int i = idx1 ; i < idx2 ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
