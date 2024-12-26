import java.util.*;

//SIMILAR TO DIJKSTRA
public class PathWithMINeffort {

    static int dx[] = { 0, 1, 0, -1 };
    static int dy[] = { 1, 0, -1, 0 };

    static class Cell implements Comparable<Cell> {
        int x;
        int y;
        int distance;

        public Cell(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }

        @Override
        public int compareTo(Cell c2) {
            return this.distance - c2.distance;
        }
    }

    public static boolean isInsideGrid(int x, int y, int num_row, int num_col) {
        return (x >= 0 && x < num_row && y >= 0 && y < num_col);
    }

    public static int shortestPath(int grid[][]) {
        int num_row = grid.length;
        int num_col = grid.length;
        int dist[][] = new int[num_row][num_col];

        // INTIALISING DISTANCE ARRAY BY INT_MAX
        for (int i = 0; i < num_row; i++) {
            for (int j = 0; j < num_row; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        // INITIAL GRID POSITION VALUE-STARTS FROM [0][0]
        dist[0][0] = grid[0][0];

        PriorityQueue<Cell> pq = new PriorityQueue<>();

        // INSERT SOURCE CELL TO PQ
        pq.add(new Cell(0, 0, dist[0][0]));

        while (!pq.isEmpty()) {
            Cell curr = pq.poll();
            for (int i = 0; i < 4; i++) {
                int curr_row = curr.x + dx[i];
                int curr_col = curr.y + dy[i];

                if (isInsideGrid(curr_row, curr_col, num_row, num_col)) {

                    if (dist[curr_row][curr_col] > dist[curr.x][curr.y] + grid[curr_row][curr_col]) {
                        // INSERT CELL WITH UPDATED DISTANCE
                        dist[curr_row][curr_col] = dist[curr.x][curr.y] + grid[curr_row][curr_col];

                        pq.add(new Cell(curr_row, curr_col, dist[curr_row][curr_col]));
                    }
                }
            }
        }
        return dist[num_row - 1][num_col - 1];
    }

    public static void main(String[] args) {
        int grid[][] = { { 31, 100, 65, 12, 18 },
                { 10, 13, 47, 157, 6 },
                { 100, 113, 174, 11, 33 },
                { 88, 124, 41, 20, 140 },
                { 99, 32, 111, 41, 20 } };
        System.out.println("The shortest path is: " + shortestPath(grid));
    }
}
