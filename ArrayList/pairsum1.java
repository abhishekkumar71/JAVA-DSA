import java.util.ArrayList;

public class pairsum1 {
    public static void pairsum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println("(" + list.get(i) + "," + list.get(j) + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        int target = 5;
        pairsum(list, target);
    }
}
