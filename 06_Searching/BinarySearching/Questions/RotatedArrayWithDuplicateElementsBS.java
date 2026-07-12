package BinarySearching.Questions;

public class RotatedArrayWithDuplicateElementsBS {

    public static void main() {

        int[] arr = {1,1,3,1};
        System.out.println(pivotSearch(arr));

    }

    static int pivotSearch(int[] arr){

        int st = 0;
        int end = arr.length - 1;

        while(st < end){
            int mid = st + (end - st) / 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > st && arr[mid] < arr[mid - 1]){
                return mid-1;
            }

            // for duplicate values , we will ignore the duplicates
            // so , if element middle , start & end are equal then skip the duplicates

            if(arr[mid] == arr[st] && arr[mid] == arr[end]){
                // skip these elements

                // but before skipping these we have to check both whether they are pivots or not

                // check if start element is a pivot

                if(arr[st] > arr[st+1]){
                    return st;
                }
                st++;

                // check if end element is a pivot
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }

            // if left side is sorted , so pivot should be in right

            else if(arr[st] < arr[mid] || (arr[st] == arr[mid] && arr[end] < arr[mid])){
                st = mid +1;
            }

            // else check on the left side

            else{
                end = mid -1;
            }
        }
        return -1;
    }
}
