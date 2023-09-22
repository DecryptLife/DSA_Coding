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
        int[][] res = new int[matrix.length][matrix[0].length];
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0)
                    res[i][j] = 0;
                else {
                    res[i][j] = matrix[i][j];
                    getNearest(matrix, res, i, j);
                }
            }
        }

        return res;
    }

    public static void getNearest(int[][] matrix, int[][] res, int row, int col){
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(row, col, 1));


        int drow[] = {1,0,-1,0};
        int dcol[] = {0,1,0,-1};

        while(!queue.isEmpty()){
            int r = queue.peek().row;
            int c = queue.peek().col;
            int step = queue.peek().step;
            queue.remove();

            for(int i=0;i<4;i++){
                int nr = r + drow[i];
                int nc = c + dcol[i];

               if(nr >=0 && nc >=0 && nr < matrix.length && nc < matrix[0].length){
                   if(matrix[nr][nc] == 0) {
                       res[row][col] = step;
                       return;
                   }
                   else {
                       queue.add(new Pair(nr,nc,step+1));
                   }
               }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix ={
                {0,0,0},
                {0,1,0},
                {0,0,0}
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
