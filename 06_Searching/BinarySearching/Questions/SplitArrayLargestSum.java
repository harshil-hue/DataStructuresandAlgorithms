package BinarySearching.Questions;

public class SplitArrayLargestSum {

    public static void main() {

        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,3));

    }
    static int splitArray(int[] arr, int k) {

        // initially both the value be zero
        int st = 0;
        int end = 0;

        // st => largest element in the array
        // end => sum of all elements in array
        // to get the feasible range to find solution

        for(int i = 0 ; i < arr.length ; i++){
            st = Math.max(st, arr[i]);
            end += arr[i];
        }

        // now we will apply binary search

        while(st < end){

            // let's say that middle element ->[st , end] be the potential answer
            int mid = st + (end - st)/2;

            // calculate in how many pieces we can divide our array with the max sum

            int sum = 0;
            int pieces = 1;

            // trying to split in array with checking by using middle element

            for(int num : arr){
                if(sum+num > mid){
                    // then the pieces+1 and make a new subArray to store the remaining elements
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }

            if(pieces > k){
                st = mid + 1;
            }
            else{
                end = mid-1;
            }
        }



        // here st == end
        return end;

    }
}
