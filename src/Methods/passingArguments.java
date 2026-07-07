package Methods;

import java.util.*;

public class passingArguments {
    public static void main(String[] args){

        int num1 , num2 , pro;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();
        pro = product(num1,num2);
        System.out.println("Product of two number becomes "+pro);

    }

    // passing the values when the method is called in main function

    static int product(int a , int b){
       return a*b;
    }
}
