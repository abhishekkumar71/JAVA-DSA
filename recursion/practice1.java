//PRINTING THE INDICES OF A KEY IN AN ARRAY
public class practice1 {
    public static void printind(int key, int arr[], int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == key) {
            System.out.println(index);
        }
        printind(key, arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        printind(2, arr, 0);
    }
}
