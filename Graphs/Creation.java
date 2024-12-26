
/**
 * Creation
 */
import java.util.*;

//ARRAY OF ARRAYLISTS
public class Creation {
    static class Edge {
        int source;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.source = s;
            this.dest = d;
            this.wt = w;

        }
    }

/*           5
    /*    0-----1
     *        /   \
     *   1   /     \3
     *      /    1   \
     *     2---------3
     *    /
     *   /2
     *  4
     * */

     
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] Graph = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            Graph[i] = new ArrayList<>();
        }
        //0 - VERTEX
        Graph[0].add(new Edge(0, 1, 5));

        //1 VERTEX
        Graph[1].add(new Edge(1, 0, 5));
        Graph[1].add(new Edge(1, 2, 1));
        Graph[1].add(new Edge(1, 3, 3));

        //2 VERTEX
        Graph[2].add(new Edge(2, 1, 1));
        Graph[2].add(new Edge(2, 3, 1));
        Graph[2].add(new Edge(2, 4, 2));

        //3 VERTEX
        Graph[3].add(new Edge(3, 1, 3));
        Graph[3].add(new Edge(3, 2, 1));

        //4 VETREX
        Graph[4].add(new Edge(4, 2, 2));

        //2's NEIGHBOUR
        for(int i=0;i<Graph[2].size();i++){
            Edge e=Graph[2].get(i);
            System.out.println(e.dest);
        }
}}