package Methods.Questions;

import java.util.*;

public class changeValue {

    public static void main() {
        int[] arr = {1,4,5,8,3,1};
        // since it's a non-primitive datatype then the value of arr will change internally

        change(arr); // reference passed to the method changed by using call by value
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        // here we are modifying the object not creating a new one
        // strings can't be modified
        nums[0] = 999;
    }
}
