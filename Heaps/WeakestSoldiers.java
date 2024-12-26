import java.util.*;

public class WeakestSoldiers {
    static class Row implements Comparable<Row> {
        int soldiers;
        int idx;

        public Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldiers == r2.soldiers) {
                return this.idx - r2.idx;
            } else {
                return this.soldiers - r2.soldiers;
            }
        }

    }

    public static void main(String[] args) {

        PriorityQueue<Row> pq = new PriorityQueue<>();

        int army[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements: ");
        for (int i = 0; i < army.length; i++) {
            for (int j = 0; j < army.length; j++) {
                army[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < army.length; i++) {
            for (int j = 0; j < army.length; j++) {
                System.out.print(army[i][j] + " ");
            }
            System.out.println();
        }

        int k = 2;
        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("R" + pq.remove().idx);
        }
    }
}
