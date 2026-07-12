package BinarySearching.Questions;

public class RotationsInSortedArray {

    public static void main() {
        int[] arr = {1,1,3,1};

        int rotations = pivotSearch(arr)+1;
        System.out.println(rotations);
    }

    // no. of rotations in the array will be => pivot(index) + 1

    static int pivotSearch(int[] arr){
        int st = 0;
        int end = arr.length-1;

        while(st < end){
            int mid = st + (end - st) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(mid > st && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            if(arr[mid] == arr[st] && arr[mid] == arr[end]){
                if(arr[st] > arr[st+1]){
                    return st;
                }
                st++;
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }

            else if(arr[st] < arr[mid] || (arr[st] == arr[mid] && arr[end] < arr[mid])){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
