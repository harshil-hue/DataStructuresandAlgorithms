package fundamentals;

public class typeCasting {

    public static void main(String[] args) {

        int num = 50;
        double value = num;

        System.out.println("Implicit Casting: " + value);

        double price = 99.99;
        int newPrice = (int) price;

        System.out.println("Explicit Casting: " + newPrice);
    }
}
