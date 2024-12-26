import java.util.*;
public class BiPartite {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    /*
     * 
     *         0
     *       /    \
     *     1       2
     *      \     /
     *       3---4
     * 
     * 
     * 
     */
    public static void Create(ArrayList<Edge>[]graph){
      for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
      }
      graph[0].add(new Edge(0, 1));
      graph[0].add(new Edge(0, 2));

      graph[1].add(new Edge(1, 0));
      graph[1].add(new Edge(1, 3));

      graph[2].add(new Edge(2, 0));
      graph[2].add(new Edge(2, 4));

      graph[3].add(new Edge(3, 1));
      graph[3].add(new Edge(3, 4));

      graph[4].add(new Edge(4, 2));
      graph[4].add(new Edge(4, 13));

    }
    public static boolean isBiPartite(ArrayList<Edge>graph[]){
        int col[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            col[i]=-1; //INITIALIZATION
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if (col[i]==-1) {
                q.add(i);
                col[i]=0; //BLUE
                while (!q.isEmpty()) {
                    int curr=q.remove();
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e=graph[curr].get(j);
                        if (col[e.dest]==-1) {

                            int newColour=col[curr]==0?1:0;
                          col[e.dest]=newColour;
                          q.add(e.dest);

                        }
                        else if(col[e.dest]==col[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge>graph[]=new ArrayList[v];
        Create(graph);
        System.out.println(isBiPartite(graph));
    }
}
