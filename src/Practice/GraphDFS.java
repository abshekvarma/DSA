package Practice;

import java.util.*;
import java.util.LinkedList;
import java.util.Stack;

public class GraphDFS {

    private final int V;
    private final LinkedList[] adj;
    public GraphDFS(int v){
        V=v;
        adj= new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }
    }

    public void insertEdge(int v, int w){
        adj[v].add(w);
    }

    public void dfs(int v){
        boolean[] visited = new boolean[V];
        Stack<Integer> s = new Stack<>();
        s.push(v);
        while(!s.isEmpty()){
            int data = s.pop();
            if(!visited[data]){
                System.out.print(data+"->");
                visited[data]=true;
            }
            LinkedList<Integer> list = adj[data];
            Collections.reverse(list);
            for(int node : list){
                if(!visited[node]){
                    s.push(node);
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 8;
        GraphDFS graph = new GraphDFS(v);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(0, 3);
        graph.insertEdge(1, 3);
        graph.insertEdge(2, 4);
        graph.insertEdge(3, 5);
        graph.insertEdge(3, 6);
        graph.insertEdge(4, 7);
        graph.insertEdge(4, 5);
        graph.insertEdge(5, 2);
        graph.dfs(0);

    }
}
