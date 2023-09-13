package graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class dfs_graphs {

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void print(ArrayList<ArrayList<Integer>> adj){
        for(int i = 1;i<adj.size();i++){
            for(Integer j:adj.get(i)){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited = new boolean[adj.size()];


        ArrayList<Integer> bfs =  new ArrayList<>();
        helper(adj, visited, bfs,1);
        return bfs;
    }

    public static void helper(ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> bfs, int node){

        if(visited[node])
            return;

        if(!visited[node]){
            visited[node] = true;
            bfs.add(node);

            for(Integer i:adj.get(node)){
                helper(adj, visited, bfs, i);
            }
        }



    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<=8;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,2,5);
        addEdge(adj,2,6);
        addEdge(adj,3,4);
        addEdge(adj,3,7);
        addEdge(adj,4,8);
        addEdge(adj,7,8);

        print(adj);

        System.out.println("DFS: "+dfs(adj));
    }
}
