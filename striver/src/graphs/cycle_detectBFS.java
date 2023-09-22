package graphs;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class cycle_detectBFS {

    static class Node{
        int curr;
        int source;

        public Node(int curr, int source){
            this.curr = curr;
            this.source = source;
        }
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static boolean detect(ArrayList<ArrayList<Integer>> adj){

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(1,-1));
        boolean visited[] = new boolean[adj.size()];
        visited[1]= true;

        while(!queue.isEmpty()){
            int curr = queue.peek().curr;
            int source = queue.peek().source;
            queue.remove();

            for(Integer ele: adj.get(curr)){
                if(ele != source ){
                    if(!visited[ele])
                    {
                        visited[ele] = true;
                        queue.add(new Node(ele, curr));
                    }
                    else
                        return true;
                }
            }
        }


//        queue.add(new Node());


        return false;
    }
    public static void main(String[] args) {

        int nodes = 7;
        ArrayList<ArrayList<Integer>> adjList =  new ArrayList<>(nodes+1);

        for(int i=0;i<=nodes;i++){
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList, 1,2);
        addEdge(adjList, 1,3);
        addEdge(adjList, 2,5);
        addEdge(adjList, 3,4);
        addEdge(adjList, 3,6);
        addEdge(adjList, 5,7);

        System.out.println(adjList);

         if(detect(adjList))
             System.out.println("Cycle exists");
         else
             System.out.println("No cycle");


    }
}
