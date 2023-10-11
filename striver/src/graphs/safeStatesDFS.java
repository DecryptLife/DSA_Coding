package graphs;

import java.util.ArrayList;

public class safeStatesDFS {
    
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }


    public static void main(String[] args) {
         
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<12;i++){
            adj.add(new ArrayList<>());
        }

        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,3,4);
        addEdge(adj,3,5);
        addEdge(adj,4,6);
        addEdge(adj,5,6);
        addEdge(adj,6,7);
        addEdge(adj,8,1);
        addEdge(adj,8,9);
        addEdge(adj,9,10);
        addEdge(adj,10,8);
        addEdge(adj,11,9);
    }
}
