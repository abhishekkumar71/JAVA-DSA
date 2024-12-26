public class firstoccurence {
    public static int first(int arr[], int i, int key) {
        if (arr[i] == key) {
            return i;
        }
        return first(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 9, 3, 5, 6, 8, 5 };
        System.out.println(first(arr, 0, 5));
    }
}
