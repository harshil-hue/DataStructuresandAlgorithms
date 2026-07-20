public class example1 {
    public static void main() {
        msg();
    }

    static void msg(){
        System.out.println("Hello World 0");
        msg1();
    }
    static void msg1(){
        msg2();
        // the message 1 will be printed after msg 2-5 because the other messages are calling first before printing
        // message 1
        System.out.println("Hello World 1");
    }
    static void msg2(){
        System.out.println("Hello World 2");
        msg3();
    }
    static void msg3(){
        System.out.println("Hello World 3");
        msg4();
    }
    static void msg4(){
        System.out.println("Hello World 4");
        msg5();
    }
    static void msg5(){
        System.out.println("Hello World 5");
    }

}
