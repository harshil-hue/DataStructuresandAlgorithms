package BinarySearching.Questions;

public class MountainArray {
    public static void main() {
        int[] arr = {1,2,3,5,6,4,3,2};
        System.out.println(peakIndexInMountainArray(arr));

    }
    static int peakIndexInMountainArray(int[] arr) {
        int st = 0;
        int end = arr.length - 1;

        while(st < end){

            int mid = st + (end - st) / 2;


            if(arr[mid] > arr[mid+1]){
                // we are in the descending part of the array
                // this might be an  answer (that's why , end != mid - 1)
                // but still have to look on the left side of array
                end = mid;
            }
            else {
                // check on the right side then
                st = mid + 1;
            }

        }
        // in the end , both start & end points to the largest element of the array
        // because of the two checks above

        // start & end always trying to figure out the max element in the array
        // at this point we have gone through each and every element of the array and now st and end both points towards
        // the max element present in this array which is the peak element
        return end;
    }
}
