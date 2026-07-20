package Questions;

public class binarySearch {
    public static void main() {
        int[] arr = {3,4,5,6,7,8,9};
        int target = 9;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    // we passed both the variables st & end because when we are going to call the function itself
    // then the size of the array should be reduced so to specify the size of reduced array we have to pass
    // st & end index where we have to search
    static int search(int[] arr , int target , int st , int end) {

        if (st > end) {
            return -1;
        }

        int mid = st + (end - st) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (target < arr[mid]) {

            // make sure to return the result of the function call if it has a return type
            return search(arr, target, st, mid - 1);
        }
        else {
            return search(arr, target, mid + 1, end);
        }
    }

}
