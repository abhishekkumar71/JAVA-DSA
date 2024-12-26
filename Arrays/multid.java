//MULTI-DIMENSIONAL ARRAYS
public class multid {
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        arr[0][0] = 66;
        arr[0][1] = 69;
        arr[1][0] = 34;
        arr[1][1] = 44;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
