package leetcode;

public class validSudoku {

    public static boolean isValid(char[][] board, int row,int col)
    {

        if(row >= board.length ) {
            return true;
        }

        if(col == board[0].length)
            return isValid(board, row+1,0);


        if(board[row][col] != '.' && !check(board,row,col)) {
            System.out.println("false at: "+ row+":"+col);
            return false;
        }



        return isValid(board,row,col+1);

    }

    public static boolean check(char[][] board, int row, int col)
    {
        char num = board[row][col];
        // horizontal check (row fixed, col changes)
        for(int i=0;i<board.length && i != col;i++)
        {
            if(board[row][i] == num)
                return false;
        }

        //vertical check
        for(int i=0;i<board.length && i != row;i++)
        {
            if(board[i][col] == num)
                return false;
        }

        // check the 3*3 box

        for(int i=row/3*3;i < row/3*3+3;i++)
        {
            for(int j= col/3*3; j < col/3*3+3;j++)
            {
                if(!(i==row && j == col))
                {

                    if(num == board[i][j]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'},
        };

        char[][] board2 = {
                {'.','.','.','.','5','.','.','1','.'},
                {'.','4','.','3','.','.','.','.','.'},
                {'.','.','.','.','.','3','.','.','1'},
                {'8','.','.','.','.','.','.','2','.'},
                {'.','.','2','.','7','.','.','.','.'},
                {'.','1','5','.','.','.','.','.','.'},
                {'.','.','.','.','.','2','.','.','.'},
                {'.','2','.','9','.','.','.','.','.'},
                {'.','.','4','.','.','.','.','.','.'},
        };

        System.out.println(isValid(board, 0,0));
    }

}
