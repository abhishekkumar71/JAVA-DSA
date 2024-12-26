//MAJORITY COUNT

public class practice2 {
    public static int majoritycount(int arr[]) {
        int majoritycount = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count += 1;
                }
            }
            if (count > majoritycount) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 2, 2, 2, 2, 2 };
        System.out.println(majoritycount(arr));
    }
}
