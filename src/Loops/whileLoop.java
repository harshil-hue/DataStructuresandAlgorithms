package Loops;

import java.util.*;

public class whileLoop {

    public static void main(String[] args){

        /*
         while(condition is true){


          execute code

          increment / decrement

         }
         */
        Scanner in = new Scanner(System.in);

        // sum of n natural numbers

        int n = in.nextInt();

        int i = 0;
        int sum = 0;
        while(i <= n){
            sum += i;
            i++;
        }

        System.out.println(sum);

    }
}
