package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class sudoku {

    public static List<List<String>> solve(String[][] board){

        List<List<String>> res = new ArrayList<>();

        helper(board, new ArrayList<String>(), res, 0, 1,9);

        return res;
    }

    public static  void helper(String[][] board, List<String> inner, List<List<String>> outer,int row, int num, int count){
       if(num == 10){
           return;
       }

       if(row > 0 && row < 9){
           outer.add(new ArrayList<>(inner));
       }
       if(num != 10 && row == 10){
           helper(board, inner,outer, 0, num+1, 9);
       }
        for(int i=0;i<9;i++)
        {
            // if number doesn't exist
            if(Objects.equals(board[row][i], ".")){
                if(posValid(row, i, board, num)){
                    inner.add(""+num);
                    count--;
                }
            }
            // if number already given
            if(Objects.equals(board[row][i], ""+num)){
                count--;
            }

            inner.add(board[row][i]);
            helper(board, inner, outer,row+1, num, count );

        }


    }

    public static boolean posValid(int row, int col,String[][] board, int num){
        //check horizontal
        for(int i=0;i<9;i++){
            if(board[row][i] == ""+num){
                return false;
            }
        }

        //check vertical
        for(int i=0;i<9;i++){
            if(board[i][col] == ""+num){
                return false;
            }
        }

        //check the box
        int row_d = row/3 * 3;
        int col_d = col/3 * 3;


        for(int i=row_d;i<row_d+2;i++){
            for(int j = col_d;j<col_d+2;j++){
                if(board[i][j] == ""+num){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[][] board = {{"5","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"}};

        List<List<String>> res = solve(board);

        System.out.println(res);
    }
}
