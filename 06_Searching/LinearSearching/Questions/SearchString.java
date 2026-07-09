package LinearSearching.Questions;

import java.util.*;

public class SearchString {

    public static void main() {

        Scanner in = new Scanner(System.in);
        String[] arr = {"harshil" , "pulkit" , "nirjala" , "anushka" , "vasu"};


        System.out.print("Enter string : ");
        String target = in.next().toLowerCase();


        System.out.println();
        System.out.println(Search(arr,target));
    }

    static String Search(String[] arr, String target){

        // array empty
        if(arr.length == 0)
            return "Empty Array";

        // searching with loop

        for(String element : arr){
            if(element.equals(target)){
                return "String found";
            }
        }
        return "Not found";


    }
}
