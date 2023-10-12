package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class kahnAlgo {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){ 
        adj.get(u).add(v);
    }


    public static List<Integer> kahns(ArrayList<ArrayList<Integer>> adj, int size){

        Queue<Integer> queue = new LinkedList<>();
        int[] indeg = new int[size];


        for(int i=0;i<size;i++){
            for(int ele: adj.get(i)){
                indeg[ele] += 1;
            }
        }

        for(int i=0;i<size;i++){
            if(indeg[i] == 0){
                queue.add(i);
            }
        }

        List<Integer> res = new ArrayList<>();

        while(!queue.isEmpty()){
            int num = queue.peek();
            queue.remove();
            res.add(num);

            for(int ele: adj.get(num)){
                indeg[ele] -=1;
                if(indeg[ele] == 0){
                    queue.add(ele);
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<6;i++){
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 5,0);
        addEdge(adj, 5,2);
        addEdge(adj, 2,3);
        addEdge(adj, 3,1);
        addEdge(adj, 4,0);
        addEdge(adj, 4,1);
        

        System.out.println(kahns(adj, 6));
    }
}
