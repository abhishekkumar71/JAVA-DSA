public class printingreverse {
    public static void main(String[] args) {
        int marks[] = { 34, 56, 72, 94, 89 };
        System.out.println(marks.length);
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
    }
}
