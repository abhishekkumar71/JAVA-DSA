public class practice {
    public static void bubblesort(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] < n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionsort(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n.length; j++) {
                if (n[min] < n[j]) {
                    min = j;
                }

            }
            int temp = n[min];
            n[min] = n[i];
            n[i] = temp;

        }
    }

    public static void insertionsort(int n[]) {
        for (int i = 1; i < n.length; i++) {
            int curr = n[i];
            int prev = i - 1;
            while (prev >= 0 && n[prev] < curr) {
                n[prev + 1] = n[prev];
                prev--;
            }
            n[prev + 1] = curr;
        }
    }

    public static void countingsort(int n[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            max = Math.max(max, n[i]);
        }
        int count[] = new int[max + 1];
        for (int i = 0; i < n.length; i++) {
            count[n[i]]++;
        }
        int j = 0;
        for (int i = count.length-1; i >= 0; i--) {
            while (count[i] > 0) {
                n[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print(int n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n[] = { 1, 10, 7, 18, 12, 3 };
        // bubblesort(n);
        // selectionsort(n);
       // insertionsort(n);
       countingsort(n);
        print(n);
    }
}
