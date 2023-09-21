package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class rottenOrange {

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
    public static int rotTime(int[][] matrix){

        Queue<Pair> queue =  new LinkedList<>();

        int[][] visited = new int[matrix.length][matrix[0].length];
        int cFresh = 0;
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){

                if(matrix[row][col] == 2){
                    queue.add(new Pair(row,col, 0));
                    visited[row][col] = 2;
                }
                else{
                    visited[row][col] = 0;
                }

                if(matrix[row][col] == 1)
                    cFresh +=1;
            }
        }

        int tm = 0;
        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};
        int count = 0;

        while(!queue.isEmpty()){
            int r = queue.peek().row;
            int c = queue.peek().col;
            int st = queue.peek().step;
            tm = Math.max(tm,st);
            queue.remove();


            for(int i=0;i<4;i++){
                int nr = r +drow[i];
                int nc = c +dcol[i];

                if(nr >= 0 && nc >= 0 && nr < matrix.length && nc < matrix[0].length &&
                        visited[nr][nc] == 0 && matrix[nr][nc] == 1)
                {
                    queue.add(new Pair(nr,nc,st+1));
                    visited[nr][nc] = 2;
                    count++;
                }
            }
        }

        // check if all oranges rotten
        if(count != cFresh) return -1;
        return tm;
    }


    public static void main(String[] args) {

        int[][] matrix = {
                {0,1,2},
                {0,1,1},
                {2,1,1}
        };

        System.out.println("Time needed to rot: "+rotTime(matrix));
    }
}
