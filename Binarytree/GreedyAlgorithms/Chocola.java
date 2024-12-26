import java.util.*;

public class Chocola {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer CostVer[] = { 2, 1, 3, 1, 4 };
        Integer CostHor[] = { 4, 1, 2 };
        Arrays.sort(CostHor, Collections.reverseOrder());
        Arrays.sort(CostVer, Collections.reverseOrder());
        int cost = 0;
        int h = 0, v = 0;
        int hp = 1, vp = 1; // VERTICAL PARTS HORIZONTAL PARTS
        while (h < CostHor.length && v < CostVer.length) {
            if (CostVer[v] >= CostHor[h]) {
                cost += (CostVer[v] * hp);
                vp++;
                v++;
            } else {
                cost += (CostHor[h] * vp);
                hp++;
                h++;
            }
        }
        while (h < CostHor.length) {
            cost += (CostHor[h] * vp);
            h++;
            hp++;

        }
        while (v < CostVer.length) {
            cost += (CostVer[v] * hp);
            v++;
            vp++;
        }
        System.out.println("Minimum cost: " + cost);
    }
}
