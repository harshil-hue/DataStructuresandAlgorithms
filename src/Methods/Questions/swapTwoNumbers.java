package Methods.Questions;

public class swapTwoNumbers {

    // here we cannot swap the two values by using method by directly passing the value
    // concept of pass by reference is used here
    // but there is no reference passing in java

    public static void main(String[] args){

        int a = 2;
        int b = 8;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);


    }
}
