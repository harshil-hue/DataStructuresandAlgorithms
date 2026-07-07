package Methods.Scoping;

public class blockScope {

    public static void main() {
        int a = 4;
        int b = 5;
        {
            a = 99; // the value of variable defined outside this block can be changed
            int c = 89;
            // this value can't be accessed/used outside this block

        }
        // value of a will get changed to 99 , since it is not creating any new object
        // System.out.println(c);  <-- gives error
    }
}
