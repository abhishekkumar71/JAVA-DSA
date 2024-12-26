//FINDING IF AN ARRAY IS SORTED OR NOT
public class practice4 {
    public static void main(String[] args) {
        int[] a = { 112, 34, 56, 71 };
        boolean sorted = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("array is sorted");
        } else {
            System.out.println("array is not sorted");
        }
    }
}
