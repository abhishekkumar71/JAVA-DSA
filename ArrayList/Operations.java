import java.util.ArrayList;

/**
 * Operations
 */
public class Operations {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // TO ADD ELEMENTS
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.add(2, 10);
        System.out.println(list);

        // TO GET ELEMENT

        System.out.println(list.get(0));

        // TO REMOVE
        list.remove(2);
        System.out.println("ArrayList after deletion");
        System.out.println(list);

        // SET ELEMENT AT INDEX
        list.set(3, 14);
        System.out.println(list);

        // CONTAINS ELEMENT
        System.out.println(list.contains(2)); // TRUE
        System.out.println(list.contains(16)); // FALSE

        // ***********SIZE OF ARRAY LIST **************//
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}