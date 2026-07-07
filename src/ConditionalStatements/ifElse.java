package ConditionalStatements;

import java.util.*;

public class ifElse {

    public static void main() {

        /*

        if(bool expression true or false){
               body
        }
        else{
         do this (if condition false)
         }

        */


        Scanner sc = new Scanner(System.in);
        String check = sc.next().toLowerCase();

        if(check.equals("yes")){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("Thankyou");
        }

    }
}
