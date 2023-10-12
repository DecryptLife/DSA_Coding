package graphs;

import java.util.ArrayList;
import java.util.List;

public class safeStatesDFS {
    
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){ 
        adj.get(u).add(v);
    }


    public static List<Integer> displaySafe(ArrayList<ArrayList<Integer>> adjList, int size){
        boolean[] visited = new boolean[size];
        boolean[] path = new boolean[size];
        boolean[] check = new boolean[size];

        for(int i=0;i<size;i++){
            if(!visited[i]){
                checkDFS(adjList, size, i, visited, path, check);
            }
        }

        List<Integer> safe = new ArrayList<>();
        for(int i=0;i<size;i++){
            if(!path[i])
                safe.add(i);
        }

        return safe;
    }

    public static boolean checkDFS(ArrayList<ArrayList<Integer>> adjList, int size, int start, boolean[] visited, boolean[] path, boolean[] check){

        visited[start] = true;
        path[start] = true;
        check[start] = false;
        for(int ele:adjList.get(start)){
            if(!visited[ele])
            {
                if(checkDFS(adjList, size, ele, visited, path, check)) return true;
            }
            else if(path[ele]) return true;
            
        }

        check[start] = true;
        path[start] = false;

        return false;
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
        addEdge(adj, 4, 2);
        addEdge(adj,4,6);
        addEdge(adj,5,6);
        addEdge(adj,6,7);
        addEdge(adj,8,1);
        addEdge(adj,8,9);
        addEdge(adj,9,10);
        addEdge(adj,10,8);
        addEdge(adj,11,9);

        System.out.println(displaySafe(adj,adj.size()));
    }
}
