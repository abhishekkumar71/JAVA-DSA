public class findingmax {
    public static void main(String[] args) {
        int[] a = { 112, 45, 667, 54 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("maximum element is:" + max);
    }
}
