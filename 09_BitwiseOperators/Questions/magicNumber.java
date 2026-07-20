package Questions;

public class magicNumber {
    public static void main() {

        int n = 6;

        int ans = 0;
        int base = 5;

        while(n > 0){
            int last = n & 1;
            n = (n>>1);
            ans += base*last;
            base *= 5;
        }
        
        System.out.println(ans);
    }
}
