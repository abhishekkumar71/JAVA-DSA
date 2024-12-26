import java.util.*;
public class PrintAllPathsFromSrcToDest {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void Create(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[0].add(new Edge(0, 3));

    }
    public static void PrintAllPath(ArrayList<Edge>graph[],int src,int tar,String path){
        if (src==tar) {
            System.out.println(path+tar);
            return;
        }
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            PrintAllPath(graph, e.dest, tar, path+src);
        }
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>graph[]=new ArrayList[v];
        Create(graph);
        PrintAllPath(graph, 5, 1, "");
    }
}
