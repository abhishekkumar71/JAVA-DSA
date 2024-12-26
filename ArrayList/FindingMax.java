import java.util.ArrayList;

public class FindingMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(45);
        list.add(71);
        list.add(18);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if (list.get(i)>max) {
            // max=list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("The Maximum element:" + max);

    }
}