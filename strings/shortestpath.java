public class shortestpath {
    public static void getpath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'E') {
                x += 1;
            } else if (path.charAt(i) == 'W') {
                x -= 1;
            } else if (path.charAt(i) == 'N') {
                y += 1;
            } else if (path.charAt(i) == 'S') {
                y -= 1;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        System.out.println(Math.sqrt(x2 + y2));

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        getpath(path);
    }
}
