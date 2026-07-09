import java.util.*;

public class arrayList {
    public static void main() {

        Scanner in = new Scanner(System.in);

        // providing as much size of array as we want without fixing it before


        //Syntax
        // ArrayList<datatype> variable_name = new ArrayList<>(initial capacity (optional));

        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);


        System.out.println(list.contains(14));


        list.set(2,999);
        System.out.println(list);


        list.remove(1);
        System.out.println(list);


        //get item at any index

        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }



        // Multi-Dimensional ArrayList

        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();

        // initialising

        for(int i = 0 ; i<3 ; i++){
            newList.add(new ArrayList<>());
        }


        // add elements

        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                newList.get(i).add(in.nextInt()); // size get fixed for this because of loop
            }
        }

        System.out.println(newList);
    }
}
