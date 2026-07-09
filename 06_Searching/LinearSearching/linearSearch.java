package LinearSearching;

public class linearSearch {

    public static void main() {

        int[] arr = {18,3,53,67,33,9,92,89};

        System.out.println(Search1(arr,444));
        System.out.println(Search2(arr,9));


    }


    //search in the array : if found return element
    // otherwise return -1 (if not found)

    static int Search2(int[] arr , int target){

        // if array is empty
        if(arr.length == 0)
            return -1;

        // searching using loop

        for(int element : arr){
            if(element == target){
                return element;
            }
        }

        return -1;


    }



    //search in the array : if found return its index value
    // otherwise return -1 (if not found)

    static int Search1(int[] arr , int target){

        // if array is empty
        if(arr.length == 0)
            return -1;

        // searching using loop

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target) {
                return i;
            }

        }

        // this return will execute if none of the return statements above executed
        // hence the target is not found in the array
        return -1;


    }

}
