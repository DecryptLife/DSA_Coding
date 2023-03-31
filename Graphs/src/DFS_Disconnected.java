import java.util.ArrayList;

public class DFS_Disconnected {

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
    static void DFSDis(ArrayList<ArrayList<Integer>> adj, int v)
    {
        boolean[] visited = new boolean[v+1];

        for(int i=0;i<v;i++)
        {
            if(visited[i] == false)
            {
                DFSRec(adj,i,visited);
            }
        }
    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args) {
        int v = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<v;i++)
            adj.add(new ArrayList<>());

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);

        addEdge(adj,3,4);

        DFSDis(adj,v);
    }
}
