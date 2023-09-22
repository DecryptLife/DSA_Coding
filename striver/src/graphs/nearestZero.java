package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class nearestZero {

    static class Pair{
        int row;
        int col;

        int step;

        Pair(int row, int col, int step){
            this.row = row;
            this.col = col;
            this.step = step;
        }
    }
    public static int[][] nearest(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] res = new int[m][n];
        boolean[][] visited = new boolean[m][n];

        Queue<Pair> queue = new LinkedList<>();

        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0) {
                    queue.add(new Pair(i,j,0));
                    visited[i][j] = true;
                    res[i][j]=0;
                }
            }
        }

        int drow[] = {1,0,-1,0};
        int dcol[] = {0,1,0,-1};

        while(!queue.isEmpty()){
            int r = queue.peek().row;
            int c = queue.peek().col;
            int step =  queue.peek().step;
            res[r][c] = step;
            queue.remove();

            for(int i=0;i<4;i++){
                int nr = r + drow[i];
                int nc = c + dcol[i];

                if(nr >= 0 && nc >= 0 && nr < m && nc < n && !visited[nr][nc]){
                    queue.add(new Pair(nr,nc, step+1));
                    visited[nr][nc] = true;
                }
            }

        }

        return res;
    }


    public static void main(String[] args) {
        int[][] matrix ={
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };

        int[][] res = nearest(matrix);

        for(int i=0;i<matrix.length;i++){
            for (int j = 0;j<matrix[0].length;j++){
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
