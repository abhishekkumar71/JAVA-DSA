public class selectionsort {
    public static void selection(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n.length; j++) {
                if (n[min] > n[j]) {
                    min = j;

                }

            }
            int temp = n[min];
            n[min] = n[i];
            n[i] = temp;

        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n[] = { 17, 3, 8, 7, 333, 45 };
        selection(n);
    }
}
