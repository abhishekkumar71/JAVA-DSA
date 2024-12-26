import java.util.*;

public class InsertionInHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // ADD CHILD AT LAST INDEX
            arr.add(data);

            int x = arr.size() - 1; // CHILD'S INDEX

            int par = (x - 1) / 2; // PARENT'S INDEX

            while (arr.get(x) < arr.get(par)) {

                // SWAP
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                // UPDATE INDICES
                x = par;
                par = (x - 1) / 2;
            }
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);
        heap.add(10);
        heap.add(1);

        for (int i = 0; i < heap.arr.size(); i++) {
            System.out.print(heap.arr.get(i) + " ");
        }
    }
}
