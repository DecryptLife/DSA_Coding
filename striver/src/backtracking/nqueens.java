package backtracking;

import java.util.ArrayList;
import java.util.List;

public class nqueens {

    public static List<List<String>> queens(int n){

        List<List<String>> boards =  new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        int count =0;
        helper(n, visited, new ArrayList<>(), boards,0, count);
        System.out.println(count);
        return boards;
    }

    public static void helper(int n, boolean[][] placed, List<String> inner, List<List<String>> outer, int row, int count)
    {
        if(row == placed.length && n == 0)
        {
            outer.add(new ArrayList<>(inner));
            return;
        }

        for(int i=0;i<placed.length;i++){
            System.out.println("check on "+row+" , "+i);
            if(isValid(row,i,placed)){
                placed[row][i] = true;
                createBoard(inner, i,placed.length);
                helper(n-1, placed,inner, outer, row+1, count);
                placed[row][i] = false;
                inner.remove(inner.size()-1);
            }

        }

    }

    public static void createBoard(List<String> inner, int col,int size){
        String s = "";
        for(int i=0;i<size;i++){
            if(i== col) s+= "Q";
            else s+= ".";

        }
        inner.add(s);
    }

    public static boolean isValid(int row, int col, boolean[][] visited){

        // check vertical
        for(int i=0; i<visited[1].length; i++){
            if(i == row) continue;

            if(visited[i][col]) return false;
        }

        // check horizontal
        for(int i=0;i<visited.length;i++){
            if(i == col)continue;
            if(visited[row][i]) return false;
        }

        // check diagonal \
        int small = Math.min(row, col);
        int row_d =row -  small;
        int col_d =col -  small;

        while(row_d < visited.length && col_d <visited.length){
           if(row_d != row && col_d != col) {
               if(visited[row_d][col_d]) {
                   return false;
               }
           };
           row_d+=1;
           col_d+=1;
        }

        //diagonal 2 /
        row_d = row;
        col_d  =col;
        // up
        while(row_d >=0 && col_d <visited.length){
            if(row_d !=  row && col_d != col)
            {
                if(visited[row_d][col_d])
                    return false;
            }
            row_d -= 1;
            col_d += 1;
        }

        // down

        row_d = row;
        col_d  =col;

        while(row_d < visited.length && col_d >= 0){

            if(row_d != row && col_d != col){
                if(visited[row_d][col_d]) return false;
            }

            row_d+=1;
            col_d-=1;
        }

        System.out.println("Good to place");
        return true;
    }
    public static void main(String[] args) {
        int n = 1;

        System.out.println(queens(n));
    }
}
