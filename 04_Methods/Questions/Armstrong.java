package Questions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(isArmstrong(num)){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }

    static boolean isArmstrong(int num){
        int temp = num , pow = 0 , sum = 0;

        while(num>0){
            pow++;
            num = num/10;
        }

        num = temp;

        while(num>0){
            int digit = num%10;
            int x = 1;
            for(int i = 0 ; i < pow ; i++){
                x *= digit;
            }
            sum += x;
            num = num/10;
        }


        return temp == sum;
    }
}
