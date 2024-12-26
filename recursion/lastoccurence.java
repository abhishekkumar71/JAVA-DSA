public class lastoccurence {
    public static int last(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int found = last(arr, key, i + 1);
        if (arr[i] == key && found == -1) {
            return i;
        }
        return found;

    }

    public static void main(String[] args) {
        int arr[] = { 12, 3, 5, 6, 7, 10, 2, 5, 4 };
        System.out.println(last(arr, 5, 0));
    }
}
