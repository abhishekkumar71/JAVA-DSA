public class changingarr {
    static void change(int[] arr) { // void
        arr[0] = 45;

    }

    public static void main(String[] args) {
        int[] marks = { 34, 55, 56, 88, 35 };
        change(marks);
        System.out.println("value after changing:" + marks[0]);
    }
}
