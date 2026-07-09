package Questions;

import java.util.*;

public class MaxValueInGivenRange {
    public static void main() {

        Scanner in = new Scanner(System.in);

        // pass arguments (arr , index 1 , index 2) <- index 1 & 2 shows the range to search between
        int[] arr = {1,22,3,445,22,87,998,7,55,43,56,7};

        System.out.println(maxValue(arr,2,7));
    }

    static int maxValue(int[] arr , int st , int ed){
        int maxValue = arr[st];

        for(int i = st ; i < ed ; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
