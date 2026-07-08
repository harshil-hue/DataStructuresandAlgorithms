public class overLoading {

    // if the two functions have the same names but the arguments passed have different datatypes
    // or different number of arguments
    // then they can be treated seperately


    public static void main() {

        fun("Harshil");
        fun(99);

    }

    static void fun(int a){
        System.out.println("Number passed is printed here -> " + a);
    }
    static void fun(String name){
        System.out.println("String passed is printed here -> " + name);
    }
}
