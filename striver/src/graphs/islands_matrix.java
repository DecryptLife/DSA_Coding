package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class islands_matrix {

    static class Pair{
        int first;
        int second;

        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    public static  void bfs(int row, int col, boolean[][] visited, int[][] matrix){
        visited[row][col] = true;

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(row, col));

        while(!queue.isEmpty()){
            int ro = queue.peek().first;
            int co = queue.peek().second;
            queue.remove();

            for(int ri=-1; ri<=1; ri++){
                for(int ci =-1;ci<=1;ci++){
                    int r_pos = ro+ri;
                    int c_pos = co+ci;

                    if(r_pos>=0 && c_pos >=0 && r_pos<matrix.length && c_pos < matrix[0].length
                        && matrix[r_pos][c_pos] == 1 && !visited[r_pos][c_pos]) {
                        visited[r_pos][c_pos] = true;
                        queue.add(new Pair(r_pos, c_pos));
                    }
                }
            }
        }


    }
    public static int checkIslands(int[][] matrix){

        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int count = 0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j] == 1 && !visited[i][j]){
                    //check all directions
                    count++;
                    bfs(i, j, visited, matrix);
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {

        int[][] matrix = {
                {0,1,1,0},
                {0,1,1,0},
                {0,0,1,0},
                {0,0,0,0},
                {1,1,0,1}
        };

        System.out.println("No fo islands: "+checkIslands(matrix));
    }
}
