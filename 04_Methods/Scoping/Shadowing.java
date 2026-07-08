package Scoping;

public class Shadowing {
    static int x = 90;
    // since this variable is also initialised in the block of class so it will be available for all the
    // blocks , but it has to be static


    public static void main(String[] args) {

        System.out.println(x); // 90
        // As we reinitialised the variable x here with value 40 so the x at upper level will get shadowed

        int x;  //<-- shadowed here

        x = 40; //<- scope will begin when value is intialised

        System.out.println(x); // 40

        // Lower level varibles/objects overrides the upper level objects <- shadowing

    }
}
