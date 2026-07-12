package BinarySearching.Questions;

public class RotatedBinarySearch {

    public static void main() {

        int[] arr = {5,1,3};
        int pivot = pivot(arr);
        System.out.println(pivot);
    }

    // finding the pivot in our array

    static int pivot(int[] arr) {

        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            // 4 cases will be applied here

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > st && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            if (arr[mid] <= arr[st]){

                end = mid - 1;

            }
            else{

                st = mid + 1;
            }

        }
        return -1;
    }
}
