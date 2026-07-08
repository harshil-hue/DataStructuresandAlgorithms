package Scoping;

public class methodScope {
    public static void main(String[] args) {

        int a = 4;
        int b = 90;

        // System.out.println(marks); <- not here because it has different scope

    }

    static void total(int marks){
        System.out.println(marks);  // marks can only be accessed here
    }
}
