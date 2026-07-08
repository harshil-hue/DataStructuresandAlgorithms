import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        // directly
        int[] arr = {11,22,33,44,55};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arr));



        char[] characters;  // declaration of array named characters which can store only characters
        // characters is getting defined in the stack memory


        // Initialisation
        characters = new char[5]; // actual memory creation (object actually created in heap memory)

        characters[0] = 'H';
        characters[1] = 'N';
        characters[2] = 'P';
        characters[3] = 'A';
        characters[4] = 'V';

        System.out.println(Arrays.toString(characters));



        // ByDefault a reference variable has null value

        String[] newStringArray = new String[5];
        System.out.println(newStringArray[0]); // null

        String[] newIntegerArray = new String[5];
        System.out.println(newIntegerArray[0]); // 0

    }
}
