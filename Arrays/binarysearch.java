public class binarysearch {

    public static int Binary_Search(int arr[], int key) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;

            } else if (arr[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 10, 16, 24 };
        int key = 16;
        System.out.println("Element found at index:" + Binary_Search(arr, key));
    }
}