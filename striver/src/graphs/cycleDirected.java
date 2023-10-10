package graphs;

import java.util.ArrayList;

public class cycleDirected {

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<adj.size();i++){
            adj.add(i, new ArrayList<>());
        }

        addEdge(adj, 1,2);
        addEdge(adj, 2,3);
        addEdge(adj, 3,4);
        addEdge(adj, 4,5);
        addEdge(adj, 5,6);
        addEdge(adj, 3,7);
        addEdge(adj, 7,5);
        addEdge(adj, 8,2);
        addEdge(adj, 8,9);
        addEdge(adj, 9,10);
        addEdge(adj,10,8);
        
        if(isCycle(adj, adj.size())){
            System.out.println("Cycle exists");
        }
        else
            System.out.println("No cycle exists");
    }
    
}
