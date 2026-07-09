package LinearSearching.Questions;

import java.util.*;

public class SearchCharacterInString {

    public static void main() {

        String name = "Harshil";
        char target = 'i';

        System.out.println(SearchChar(name , target));



        // we can also search by converting our string to character array

        char[] nameArray = name.toCharArray();

        System.out.println(Arrays.toString(nameArray));

    }

    static boolean SearchChar(String str, char target){

        if(str.length() == 0){
            return false;
        }

        // .charAt(index) return the character in the string at the mentioned index

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
