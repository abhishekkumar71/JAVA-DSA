import java.util.ArrayList;

public class unsortedpairsum {
    public static void pairsum(ArrayList<Integer> list, int target) {
        int bp = 0;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;
        while (lp != rp) {

            if (list.get(lp) + list.get(rp) == target) {
                System.out.println("(" + list.get(lp) + "," + list.get(rp) + ")");
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        if (list.get(lp) + list.get(rp) != target) {
            System.out.println("solution does not exist");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        pairsum(list, target);
    }
}
