package Methods;

import java.util.*;
public class SumofTwoNumbers {
    public static void main() {

        sum();  // method will be called two times
        sum();

    }

    static void sum(){

        // block of code that we can use repeatdly in main function
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of two number becomes: "+sum);

    }
    /*
    return_type name(arguments){
    body
    return statement;
    }
     */
}
