import java.util.ArrayList;

public class Swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);

        list.add(18);
        list.add(7);
        list.add(34);
        list.add(5);
        System.out.println("ArrayList before swapping:" + list);
        // SWAP
        int temp = list.get(2);
        list.set(2, list.get(3));
        list.set(3, temp);
        System.out.println("ArayList after swapping:" + list);
    }
}
