import java.util.*;

public class passingArrayinMethod {

    public static void main() {

        int[] arr = {3,6,9,12,15,18,21};
        System.out.println(Arrays.toString(arr));

        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){

        arr[1] = 99;  // modifies the original using duplicate reference of the object "arr"
        arr[3] = 999;

    }
}
