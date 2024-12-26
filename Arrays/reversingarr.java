public class reversingarr {
    public static void main(String[] args) {
        int[] a = { 34, 54, 6, 14 };
        int l = a.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i = 0; i < n; i++) {
            temp = a[i];
            a[i] = a[l - 1 - i];
            a[l - 1 - i] = temp;

        }
        for (int element : a) {
            System.out.print(element + " ");

        }
    }
}
