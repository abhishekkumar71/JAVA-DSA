public class bubblesort {
    public static void bubble(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }

            }

        }
        for (int j = 0; j < n.length; j++) {
            System.out.print(n[j] + " ");
        }
    }

    public static void main(String[] args) {
        int n[] = { 43, 5, 7, 18, 3, 17 };
        bubble(n);
    }
}