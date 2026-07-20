package Questions;

public class BitNumber {

    public static void main() {
        int num = 10110110;
        System.out.println(Bit(num , 5));
    }
    static int Bit(int binary , int n){
        int mask = 1<<(n-1);
        return binary & mask;
    }
}
