package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    private final int V;
    private final LinkedList[] adj;
    public Graph(int v){
        V=v;
        adj= new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
    }

    public void bfs(int v){
        boolean[] visited = new boolean[V];
        visited[v]=true;
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        while(!q.isEmpty()){
            int data = q.poll();
            System.out.print(data+"->");
            LinkedList<Integer> list = adj[data];
            for(int node : list){
                if(!visited[node]){
                    visited[node] = true;
                    q.add(node);
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 6;
        Graph graph = new Graph(v);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 1);
        graph.addEdge(4, 1);
        graph.addEdge(3, 1);
        graph.addEdge(5, 4);
        graph.addEdge(5, 3);
        graph.bfs(0);

    }
}
