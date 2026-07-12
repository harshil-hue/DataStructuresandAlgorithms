package BinarySearching.Questions;

public class CeilingAndFloorOfGivenNumber {

    public static void main() {


        int[] arr = {2,3,5,9,14,16,18};

        int target = 15;

        System.out.println(Ceiling(arr , target));
        System.out.println(Floor(arr , target));
    }

    static int Ceiling(int[] arr , int target){

        if(target > arr[arr.length - 1]){
            return -1;
        }

        int st = 0;
        int end = arr.length - 1;

        int res;

        while(st <= end){

            int mid = st + (end-st)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                st = mid +1;
            }
        }

        // When the while condition violated , then the start element will be the next greater element close to target
        return arr[st%arr.length];
    }

    static int Floor(int[] arr , int target){

        if(target < arr[0]){
            return -1;
        }

        int st = 0;
        int end = arr.length - 1;

        int res;

        while(st <= end){

            int mid = st + (end-st)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                st = mid +1;
            }
        }
        // When the while condition violated , then the end element will be the smaller element closer to target
        return arr[end];


    }
}
