import java.util.Scanner;

public class returningValues {
    public static void main() {

        int res = sum();
        System.out.println(res);

        // value get returned by sum() method and res variable points
        // towards the value returned by the method


    }

    static int sum(){


        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();

        int addition = num1 + num2;
        return addition;

        // statement written after return will be an unreachable statement

    }

}

