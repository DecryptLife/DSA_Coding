package Backtracking.src;

public class Maze {

    public static int reachTarget(int row, int column, int i, int j)
    {
        if(row == i && column ==j)
        {
            return 1;
        }

        int right = 0;
        int down = 0;
        if(i<row && j< column)
        {
            right += reachTarget(row,column,i,j+1);
            down += reachTarget(row,column,i+1,j);
        }
        else if(i==row && j<column)
        {
            down += reachTarget(row,column,i,j+1);
        }
        else if(i<row & j==column)
        {
            right += reachTarget(row,column,i+1,j);
        }

        return right + down;


    }
    public static void main(String[] args) {

        System.out.println("There are: "+reachTarget(2,2,0,0)+" ways to reach target");
    }

}
