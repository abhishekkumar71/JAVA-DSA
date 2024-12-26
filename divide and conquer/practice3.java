//MAJORITY COUNT
public class practice3 {
    public static int countInRange(int arr[], int lo, int hi, int num) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int majorityelements(int arr[], int lo, int hi) {
        if (lo == hi) {
            return arr[lo];
        }
        int mid = (hi - lo) / 2 + lo;
        int left = majorityelements(arr, lo, mid);
        int right = majorityelements(arr, mid + 1, hi);
        if (left == right) {
            return left;
        }
        int leftcount = countInRange(arr, lo, hi, left);
        int rightcount = countInRange(arr, lo, hi, right);
        return leftcount > rightcount ? left : right;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 1, 2, 2, 1, 1, 1, 1 };
        System.out.println(majorityelements(arr, 0, arr.length - 1));
    }

}