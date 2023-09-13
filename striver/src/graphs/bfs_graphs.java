package graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs_graphs {

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj){

        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> bfs = new ArrayList<>(adj.size());

        queue.add(1);
        visited[1] = true;

        while(!queue.isEmpty()){
            int num = queue.poll();
            bfs.add(num);

            for(Integer i:adj.get(num)){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        return bfs;
    }



    static void printGraph(ArrayList<ArrayList<Integer>> adj)
    {
        for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                System.out.print(adj.get(i).get(j) + " " );
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int nodes = 9;
        ArrayList<ArrayList<Integer>> adjList =  new ArrayList<>(nodes+1);

        for(int i=0;i<=nodes;i++){
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList, 1,2);
        addEdge(adjList, 1,6);
        addEdge(adjList, 2,3);
        addEdge(adjList, 2,4);
        addEdge(adjList, 4,5);
        addEdge(adjList, 5,8);
        addEdge(adjList, 6,7);
        addEdge(adjList, 6,9);
        addEdge(adjList, 7,8);


        printGraph(adjList);

        ArrayList<Integer> bfs = bfs(adjList);
        System.out.println(bfs);
    }
}
