public class Reversingarray {
    public static void reverse(int n[]) {
        int first = 0;
        int last = n.length - 1;
        while (first < last) {
            int temp = n[first];
            n[first] = n[last];
            n[last] = temp;
            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int n[] = { 3, 4, 6, 88, 12, 5 };
        reverse(n);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
