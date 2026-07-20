package Questions;

public class fibonacciSeries {

    public static void main() {
        int n = 50;

//        System.out.print(fibo(n) + " ");
        System.out.println(formulaFib(n));
    }

    static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    static int formulaFib(int n){
        int res = (int)((Math.pow(((1 + Math.sqrt(5)))/2,n) / Math.sqrt(5)));
        return res;
    }
}
