package graphs;

import java.util.Queue;

public class replaceOX {

    public static char[][] replace(char[][] board){

        int m = board.length;
        int n = board[0].length;

        int[] d_row ={-1,0,1,0};
        int[] d_col ={0,1,0,-1};
        int[][] visited = new int[m][n];

        // first and last row
        for(int i=0;i<n;i++){

            // first row
            if(visited[0][i] == 0 && board[0][i] == 'O'){
                dfs(board, 0, i, d_row,d_col, visited);
            }

            if(visited[m-1][i] == 0 && board[m-1][i] == 'O'){
                dfs(board, m-1, i, d_row,d_col, visited);
            }
        }

        // first and last col
        for(int i=0;i<m;i++){

            // first row
            if(visited[i][0] == 0 && board[i][0] == 'O'){
                dfs(board, 0, i, d_row,d_col, visited);
            }

            if(visited[i][n-1] == 0 && board[i][n-1] == 'O'){
                dfs(board, m-1, i, d_row,d_col, visited);
            }
        }

        for(int i=0;i<board.length;i++){
            for(int j=0; j<n;j++){
                if(board[i][j] == 'O' && visited[i][j] == 0)
                    board[i][j] = 'X';
            }
        }

//        for(int i=0;i<visited.length;i++){
//            for (int j=0;j<visited[0].length;j++){
//                System.out.print(visited[i][j]+ " ");
//            }
//            System.out.println();
//        }

        return board;
    }

    public static void dfs(char[][] board, int row, int col, int[] d_row, int[] d_col, int[][] visited){

        System.out.println("Visited row: "+row+" col: "+col);
       visited[row][col] = 1;

        int m = board.length;
        int n = board[0].length;

        for(int i=0;i<4;i++){
            int r = row + d_row[i];
            int c = col + d_col[i];
            if( r >= 0 && c >=0 && r < m && c < n && board[r][c] == 'O' && visited[r][c] == 0){
                dfs(board, r,c, d_row, d_col, visited);
            }
        }
    }
    public static void main(String[] args) {
        char[][] arr = {
                {'O','X','O','X'},
                {'X','O','X','O'},
                {'X','O','O','X'},
                {'X','O','X','O'},
                {'O','X','O','O'},
        };

        char[][] res = replace(arr);

        for(int i=0;i<res.length;i++){
            for (int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
