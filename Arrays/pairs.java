public class pairs {
    public static void Pairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int next = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + next + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        Pairs(arr);
    }
}
