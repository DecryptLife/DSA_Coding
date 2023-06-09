import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    static void BFSOut(ArrayList<ArrayList<Integer>> adj,int v, int s)
    {
        boolean[] visited = new boolean[v+1];
        Queue<Integer> q = new LinkedList<>();

        visited[s] = true;
        q.add(s);

        while(q.isEmpty() == false)
        {
            int u = q.poll();

            System.out.print(u+ " ");


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
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj)
    {
        for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                System.out.print(adj.get(i).get(j) + " " );
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int v = 7;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);

        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,3);
        addEdge(adj,2,3);



        printGraph(adj);

        BFSOut(adj,4,0);

    }
}
