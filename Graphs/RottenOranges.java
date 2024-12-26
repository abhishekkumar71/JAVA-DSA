import java.util.*;

public class RottenOranges {
    public static int OrangesRotting(int arr[][]) {
        int freshOranges = 0;
        Queue<Integer> q = new LinkedList<>();
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    freshOranges++;
                } else if (arr[i][j] == 2) {
                    q.add(i * m + j);
                }
            }
        }
        if (freshOranges == 0) {
            return 0;
        }
        int level = 0;
        int dir[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        while (!q.isEmpty()) {
            boolean newRotten = false;
            int size = q.size();
            for (int k = 0; k < size; k++) {

                int RottenOranges = q.remove();
                int i = RottenOranges / m;
                int j = RottenOranges % m;
                for (int dirs[] : dir) {
                    int newRow = dirs[0] + i;
                    int newCol = dirs[1] + j;

                    if (newRow >= 0 && newCol >= 0 && newRow < n && newCol < m && arr[newRow][newCol] == 1) {
                        arr[newRow][newCol] = 2;
                        freshOranges--;
                        q.add(newRow * m + newCol);
                        newRotten = true;
                    }
                }
            }
            if (newRotten) {
                level++;
            }
        }
        if (freshOranges == 0) {
            return level;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[][] = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
        System.out.println(OrangesRotting(arr));
    }
}
