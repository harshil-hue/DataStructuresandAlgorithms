package LinearSearching.Questions;

public class MinimumValueInArray {

    public static void main() {

        int[] arr = {1,22,334,55,7,0,7,5,22,4,67,53};

        System.out.println(minValue(arr));
    }

    static int minValue(int[] arr){

        int min = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
