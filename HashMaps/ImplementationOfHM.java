import java.util.*;

public class ImplementationOfHM {
    static class HashMap<k, v> {
        private class Node {

            k key;
            v val;

            public Node(k key, v val) {
                this.key = key;
                this.val = val;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(k key) {
            int hc = key.hashCode();
            return Math.abs(hc) % 4;
        }

        private int SearchInLL(k key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        public void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N + 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.val);
                }
            }
        }

        public void put(k key, v val) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.val = val;
            } else {
                buckets[bi].add(new Node(key, val));
                n++;
            }
            double lamnbda = (double) n / N;
            if (lamnbda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(k key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public v get(k key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.val;
            } else {
                return null;
            }
        }

        public v remove(k key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].remove(di);
                return node.val;
            } else {
                return null;
            }
        }

        public ArrayList<k> keySet() {
            ArrayList<k> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Inida", 100);
        hm.put("China", 150);
        hm.put("USA", 75);
        hm.put("UK", 50);
        hm.put("Canada", 50);
        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
