
public class mergesort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int ei) {
        int mid = si + (ei - si) / 2;
        if (si >= ei) {
            return;
        }
        mergesort(arr, si, mid); // (si+ei)/2  left part
        mergesort(arr, mid + 1, ei);// right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // left(0,3)=4 variables right(4,6)=3
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;

        }

        // LEFT PART
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // RIGHT PART
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 9, 3, 5, 2, 8 };
        mergesort(arr, 0, arr.length - 1);

        print(arr);

    }
}