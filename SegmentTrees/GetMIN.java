import java.util.*;

public class GetMIN {
    public static int tree[];

    public static void init(int n) {
        tree = new int[4 * n];
    }

    public static void Construct(int arr[], int i, int start, int end) {
        if (start == end) {
            tree[i] = arr[start];
            return;
        }
        int mid = (start + end) / 2;
        Construct(arr, 2 * i + 1, start, mid);
        Construct(arr, 2 * i + 2, mid + 1, end);
        tree[i] = Math.min(tree[2 * i + 1], tree[2 * i + 2]);
    }

    public static void Print() {
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
    }

    public static int getMin(int arr[], int i, int si, int sj, int qi, int qj, int n) {
        if (si > qj || sj < qi) {
            return Integer.MAX_VALUE;
        } else if (si >= qi && sj <= qj) {
            return tree[i];
        } else {
            int mid = (si + sj) / 2;
            int left = getMin(arr, 2 * i + 1, si, mid, qi, qj, n);
            int right = getMin(arr, 2 * i + 2, mid + 1, sj, qi, qj, n);
            return Math.min(left, right);
        }
    }

    public static void Update(int arr[], int idx, int newVal, int n) {
        arr[idx] = newVal;
        UpdateUtil(0, 0, n - 1, idx, newVal);
    }

    public static void UpdateUtil(int i, int si, int sj, int idx, int newVal) {
        if (idx < si || idx > sj) {
            return;
        }
        tree[i] = Math.min(tree[i], newVal);
        if (si != sj) {
            int mid = (si + sj) / 2;
            UpdateUtil(2 * i + 1, si, mid, idx, newVal);
            UpdateUtil(2 * i + 2, mid + 1, sj, idx, newVal);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, -1, 2, 17, 1, 3, 2, 4 };
        int n = arr.length;
        init(n);
        Construct(arr, 0, 0, n - 1);
        Print();
        System.out.println("The min element:" + getMin(arr, 0, 0, n - 1, 2, 5, n));
        Update(arr, 2, -3, n);
        Print();
        System.out.println("The min element:" + getMin(arr, 0, 0, n - 1, 2, 5, n));
    }
}
