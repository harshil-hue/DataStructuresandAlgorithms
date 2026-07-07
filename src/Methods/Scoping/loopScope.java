package Methods.Scoping;

public class loopScope {
    public static void main() {

        for(int i = 0 ; i<6 ; i++){

            int num = 20;
            int main = 90;

        }

        // System.out.println(main);  <- can't be accessed , since for loop has it's own scope
    }
}
