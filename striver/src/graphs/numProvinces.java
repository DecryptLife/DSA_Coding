package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class numProvinces {

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

    public static int findNumProv(ArrayList<ArrayList<Integer>> adj){

        boolean[] visited = new boolean[adj.size()];

        int count = 0;

//        for(int i=1;i<adj.size();i++){
//
//            if(!visited[i])
//                count++;
//
//            for(Integer j: adj.get(i)){
//                if(!visited[j])
//                    visited[j] =  true;
//            }
//
//        }

        for(int i=1;i<adj.size();i++){
            if(!visited[i]){
                count++;
                bfs(adj, visited, i);
            }
        }




        return count;

    }
    public static void bfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited,int node){

        Queue<Integer> queue = new LinkedList<>();

        queue.add(node);
        visited[node] = true;

        while(!queue.isEmpty()){
            int num = queue.poll();

            for(Integer i:adj.get(num)){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<=8;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj,1,2);
        addEdge(adj,2,3);

        addEdge(adj, 4,5);
        addEdge(adj, 5,6);

        addEdge(adj,7,8);

        print(adj);

        findNumProv(adj);

        System.out.println("Num of provinces: "+findNumProv(adj));
    }
}
