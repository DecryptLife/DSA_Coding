class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                //check horizontal
                if((board[i][j] !=  '.')&& (!checkVertical(board, board[i][j], i, j) || !checkHorizontal(board, board[i][j], i, j) || !checkBox(board, board[i][j], i, j))) {
                     return false;
                }
            }
        }

        return true;
    }

    public boolean checkVertical(char[][] board, char ch, int row, int col){

        for(int i=0;i <board.length;i++){
            if(i!=row && board[i][col] == ch) return false;
        }
        return true;
    }

    public boolean checkHorizontal(char[][] board, char ch, int row, int col){

        for(int i=0;i <board.length;i++){
            if(i!=col && board[row][i] == ch) return false;
        }
        return true;
    }

    public boolean checkBox(char[][] board, char ch, int row, int col){
        int rm = row / 3 * 3;
        int cm = col / 3 * 3;

        for(int i=rm;i<rm+3;i++){
            for(int j=cm;j<cm+3;j++){
                if(i!=row && j!=col && board[i][j] == ch) return false;
            }
        }

        return true;
    }
}