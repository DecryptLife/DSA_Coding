import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Disconnected {

    static void BFSOut(ArrayList<ArrayList<Integer>> adj, int s, int v,boolean[] visited)
    {
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);


        while(q.isEmpty() == false)
        {
            int u = q.poll();
            System.out.print(u+" ");
            for(int n:adj.get(u))
            {
                if(visited[n] == false)
                {
                    visited[n] = true;
                    q.add(n);
                }
            }

        }
    }

    static void BFSDis(ArrayList<ArrayList<Integer>> adj, int v)
    {
        boolean[] visited = new boolean[v+1];

        for( int i=0;i<v;i++)
        {
            if(visited[i] == false)
            {
                BFSOut(adj,i,v,visited);
            }
        }
    }


    static void addEdge(ArrayList<ArrayList<Integer>> adj, int s, int v)
    {
        adj.get(s).add(v);
        adj.get(v).add(s);
    }

    // no source given and grpah disconnected
    public static void main(String[] args) {
        int v = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0,1);
        addEdge(adj,0,2);
        addEdge(adj, 1,3);
        addEdge(adj,2,3);

        addEdge(adj,4,5);
        addEdge(adj,4,6);
        addEdge(adj,5,6);

        BFSDis(adj,v);
    }
}
