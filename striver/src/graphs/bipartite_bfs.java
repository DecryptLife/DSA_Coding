package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class bipartite_bfs {

  public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
    adj.get(u).add(v);
    adj.get(v).add(u);
  }


  public static boolean  isBipartite(ArrayList<ArrayList<Integer>> adjList, int V){

    int[] color = new int[V];

    for(int i=0;i<V;i++) color[i] = -1;

    for(int i=0;i<V;i++){
      if(color[i] == -1){
        if(!check(adjList, i, V, color)) return false;
      }
    }

    return true;
    
  }

  public static boolean check(ArrayList<ArrayList<Integer>> adjList, int start, int V, int[] color){
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    color[start] = 0;

    while(!queue.isEmpty()){
      int num = queue.peek();
      queue.remove();
      for(int ele: adjList.get(num)){

        if(color[ele] == -1){
          color[ele] = 1 - color[num];
          queue.add(ele);
        }
        else if (color[ele] == color[num]) return false;
      }
    }
    return true;


  }
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    for (int i = 0; i <= 8; i++) {
      adj.add(new ArrayList<>());
    }

    addEdge(adj, 1,2);
    addEdge(adj,2,3);
    addEdge(adj,2,5);
    addEdge(adj,3,4);
    addEdge(adj,5,4);
    addEdge(adj,4,6);;

    if(isBipartite(adj, adj.size())){
      System.out.println("Bipartite graph");
    }
    else
      System.out.println("Not bipartite");
  }
}
