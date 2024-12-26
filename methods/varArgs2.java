public class varArgs2 {
    public static int sum(int a, int... arr) {
        int sum = a;
        for (int x : arr) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("sum:" + sum(1));
        System.out.println("sum:" + sum(1, 1, 3, 4));
        System.out.println("sum:" + sum(10, 34, 56, 78));
        System.out.println("sum:" + sum(41, 78, 47, 11, 8));
        System.out.println("sum:" + sum(18, 9, 15, 63, 78, 14));

    }
}
