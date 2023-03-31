import java.util.ArrayList;

public class DFS {

    static void DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited)
    {
        visited[s] = true;

        System.out.print(s+" ");

        for(int u: adj.get(s))
        {
            if(visited[u] == false)
            {
                visited[u] = true;
                DFSRec(adj,u,visited);
            }
        }
    }
    static void DFSImp(ArrayList<ArrayList<Integer>> adj, int s, int v)
    {
        boolean[] visited = new boolean[v+1];

        DFSRec(adj, s, visited);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) {
        int v = 7;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);

        for(int i=0;i<v;i++)
            adj.add(new ArrayList<>());

        addEdge(adj, 0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        addEdge(adj,2,3);

        DFSImp(adj,0,7);
    }
}
