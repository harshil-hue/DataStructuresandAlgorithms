package Methods;

import java.util.*;

public class variableArguments {

    // VarArgs of variable arguments , when we don't know about the number of inputs given

    public static void main() {

        fun(2,5,6,5,2,99,44);
        // as many arguments can be passed as we want and this get stored in array v in fun()

        multiple(3,4,56,4,2,4,5,6,3,2,1);
    }


    // (int ...v)  <-- array of integers
    // (char ...v)  <-- array of characters

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a , int b , int ...arr){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(arr));
    }
}
