package graphs;

import java.util.ArrayList;

public class cycleDetectDFS {

    public static boolean cycleDFS(ArrayList<ArrayList<Integer>> adjList){

        boolean[] visited = new boolean[adjList.size()];

        return helper(adjList, visited, 1,-1);
    }

    public static boolean helper(ArrayList<ArrayList<Integer>> adjList, boolean[] visited, int curr, int parent){

        for(Integer ele: adjList.get(curr)){
            if(ele != parent){
                if(!visited[ele]){
                    visited[ele] = true;
                    helper(adjList, visited, ele, curr);
                }
                else
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v){

        adjList.get(u).add(v);
        adjList.get(v).add(u);

    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i=0;i<=7;i++){
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList,1,2);
        addEdge(adjList,1,3);
        addEdge(adjList,2,5);
        addEdge(adjList,3,4);
        addEdge(adjList,3,6);
        addEdge(adjList,5,7);
        addEdge(adjList,6,7);

        if(cycleDFS(adjList))
            System.out.println("Cycle detected");
        else
            System.out.println("No cycle detected");
    }
}
