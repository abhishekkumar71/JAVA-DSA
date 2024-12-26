public class insertionsort {
    public static void insertion(int n[]) {
        for (int i = 1; i < n.length; i++) {
            int curr = n[i];
            int prev = i - 1;
            while (prev >= 0 && n[prev] > curr) {
                n[prev + 1] = n[prev];
                prev--;
            }
            n[prev + 1] = curr;
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n[] = { 2, 45, 3, 17, 7 };
        insertion(n);
    }
}
