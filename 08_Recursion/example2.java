public class example2 {
    public static void main() {

        printNumbers(0);
    }
    static void printNumbers(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        printNumbers(n+1);
        System.out.println(n);
    }
}
