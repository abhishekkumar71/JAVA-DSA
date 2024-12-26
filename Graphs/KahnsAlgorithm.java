import java.util.*;
public class KahnsAlgorithm {
    static class Edge{
        int src;
        int dest;
        public Edge(int s ,int d){
            this.src=s;
            this.dest=d;
        }
    }
    /*
     * DIRECTED
     *  
     *    5       4
     *    | \   / |
     *    |   0   |
     *    |       |
     *    3-->2-->1
     * 
     */
    public static void Create(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[5].add(new Edge(5, 2));
        graph[5].add(new Edge(5, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        
    }
    public static void getInDeg(ArrayList<Edge>graph[],int indeg[]){ 

    for(int i=0;i<graph.length;i++){
        int v=i;
      for(int j=0;j<graph[v].size();j++){
        Edge e=graph[v].get(j);
        indeg[e.dest]++;
    }
}
    }
    public static void TopSort(ArrayList<Edge>graph[]){
        Queue<Integer>q=new LinkedList<>();
        int indeg[]=new int[graph.length];
        getInDeg(graph, indeg);
        for(int i=0;i<indeg.length;i++){
            if (indeg[i]==0) {
                q.add(i);
            }}
            while (!q.isEmpty()) {

                int curr=q.remove();
                System.out.print(curr+" ");

                for(int i=0;i<graph[curr].size();i++){
                  Edge e=graph[curr].get(i);
                  indeg[e.dest]--;
                  if (indeg[e.dest]==0) {
                    q.add(e.dest);
                  }
                }
            }
        System.out.println();
    }
public static void main(String[] args) {
    int v=6;
    ArrayList<Edge>graph[]=new ArrayList[v];
    Create(graph);
    TopSort(graph);
}
}
