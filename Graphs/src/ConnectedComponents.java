import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponents {
    static void BFSOut(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);

        visited[s] = true;

        while(q.isEmpty() == false)
        {
            int u = q.poll();

            for(int n: adj.get(u))
            {
                if(visited[n] == false)
                {
                    visited[n] = true;
                    q.add(n);
                }
            }

        }
    }
    static int BFSDis(ArrayList<ArrayList<Integer>> adj, int v)
    {
        boolean[] visited = new boolean[v+1];

        int count =0;
        for(int i=0;i<v;i++)
        {
            if(visited[i] == false)
            {
                BFSOut(adj, i, visited);
                count++;
            }
        }

        return count;
    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args) {
        int v = 9;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<v;i++)
            adj.add(new ArrayList<>());

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);

        addEdge(adj,3,4);

        addEdge(adj,5,6);
        addEdge(adj,5,7);
        addEdge(adj,7,8);

        int count =  BFSDis(adj, v);
        System.out.println("No of connected components: "+count);

    }
}
