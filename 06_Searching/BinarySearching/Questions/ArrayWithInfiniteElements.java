package BinarySearching.Questions;

public class ArrayWithInfiniteElements {

    // Here , the point we are going to use is that we don't know the size of array
    // hence we can not use arr.length function

    public static void main() {

        int[] arr = {1,2,3,4,5,6,7,8,9,11,22,33,44,55,56,66,77,88,89};

        System.out.println(Range(arr , 22));

    }

    // finding the ideal range in which our target should lie

    static int Range(int[] arr , int target){

        // starting with first two elements (array size - 2)
        // we are going to double the size of the box until we will find the ideal range
        int st = 0;
        int end = 1;

        // if target element is less that the end index element it means element came in range
        while(target > arr[end]){
            int newSt = end + 1;
            // next element from the end becomes the starting element

            // for end range as we are doubling the size of the box
            // end = previousEnd + (boxSize)*2;

            end = end + (end-st+1)*2;
            st = newSt;
        }
        return binarySearch(arr,target,st,end);
    }

    // when we found the ideal range then simply apply binary search

    static int binarySearch(int[] arr , int target , int st , int end){

        while(st <= end){

            int mid = st + (end - st) / 2;

            if(arr[mid] == target){
                return mid;
            }

            else if(arr[mid] > target){
                end = mid - 1;
            }

            else{
                st = mid + 1;
            }
        }
        return -1;
    }
}
