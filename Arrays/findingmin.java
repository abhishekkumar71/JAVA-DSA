public class findingmin {
    public static void main(String[] args) {
        int[] a = { 112, 45, 667, 54 };
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("minimum value:" + min);
    }
}
