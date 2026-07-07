package Methods.Questions;

import java.util.*;

public class isPrime {

    public static void main() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean check = isPrime(num);
        System.out.println(check);
    }


    static boolean isPrime(int num){
        if(num <=1){
            return false;
        }
        int c = 2;
        while(c*c < num){
            if(num%c == 0){
                return false;
            }
            c++;
        }

        return c*c>num;
    }

}
