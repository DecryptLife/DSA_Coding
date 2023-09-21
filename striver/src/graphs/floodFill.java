package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class floodFill {


    static class Pair{
        int row;
        int col;

        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public static int[][] fill(int[][] matrix, int sr, int sc, int color){
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] visited = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                visited[i][j] = matrix[i][j];
            }
        }
        int val = matrix[sr][sc];
        Queue<Pair> queue =  new LinkedList<>();
        queue.add(new Pair(sr,sc));

        visited[sr][sc] = color;

        int drow[] = {1,0,-1,0};
        int dcol[]= {0,1,0,-1};
        while(!queue.isEmpty()){

            int r = queue.peek().row;
            int c = queue.peek().col;
            queue.remove();


            for(int i=0;i<4;i++){
                int nr = r +drow[i];
                int nc = c + dcol[i];

                if(nr >= 0 && nc >= 0 && nr < m && nc < n && visited[nr][nc] != 2
                        && matrix[nr][nc] == val){
                    queue.add(new Pair(nr,nc));
                    visited[nr][nc] = color;
                }

            }
        }

        return visited;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };
        int sr = 1;
        int sc = 1;
        int color = 2;

        int[][] res = fill(matrix, sr, sc, color);

        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }


}
