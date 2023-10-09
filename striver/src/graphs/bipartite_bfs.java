package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class bipartite_bfs {

  public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
    adj.get(u).add(v);
    adj.get(v).add(u);
  }


  public static boolean  isBipartite(ArrayList<ArrayList<Integer>> adjList){

    Queue queue = new LinkedList<>();
    boolean[] visited = new boolean[adjList.size()]

    return true;
  }
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    for (int i = 0; i <= 8; i++) {
      adj.add(new ArrayList<>());
    }

    addEdge(adj, 1,2);
    addEdge(adj,2,3);
    addEdge(adj,2,6);
    addEdge(adj,3,4);
    addEdge(adj,4,5);
    addEdge(adj,4,7);
    addEdge(adj,5,6);
    addEdge(adj, 7,8);
  }
}
