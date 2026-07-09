import java.util.*;

public class objectArrays {
    public static void main() {

        Scanner in = new Scanner(System.in);
        String[] arr = new String[4];

        for(int i = 0 ; i < arr.length ; i++){
            System.out.printf("Enter value %d : ",i+1);
            arr[i] = in.next();
        }

        System.out.println(Arrays.toString(arr));

        arr[1] = "Harshil";

        System.out.println(Arrays.toString(arr));

    }
}
