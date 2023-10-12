package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class topological_sort {
    

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){ 
        adj.get(u).add(v);
    }


    public static List<Integer> topsort(ArrayList<ArrayList<Integer>> adj, int size){
        Stack<Integer> stack = new Stack<>();
        
        boolean[] visited = new boolean[size];

        for(int i=0;i<size;i++){
            if(!visited[i])
                dfs(adj, visited, stack, size, i);
        }

        List<Integer> res  = new ArrayList<>(size);

        while(!stack.isEmpty()){
            int ele = stack.pop();
            res.add(ele);
        }

        return res;
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> stack, int size, int start){
        visited[start] = true;

        for(int ele: adj.get(start)){
            if(!visited[ele])
                dfs(adj, visited, stack, size, ele);
        }

        stack.push(start);
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
        

        System.out.println(topsort(adj, 6));
    }
}
