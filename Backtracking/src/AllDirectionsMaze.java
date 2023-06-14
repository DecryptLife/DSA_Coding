package Backtracking.src;

import java.util.ArrayList;
import java.util.Arrays;

public class AllDirectionsMaze {
    public static int reachTarget(boolean[][] maze,int row, int column, int i, int j)
    {
        if(row == i && column ==j)
        {
            return 1;
        }
        if(maze[i][j] == true)
            return 0;

        maze[i][j] = true;

        int right = 0;
        int down = 0;
        int left = 0;
        int up = 0;
        int diagonal = 0;
        if(i > 0)
            up += reachTarget(maze,row, column,i-1, j);

        if(j > 0)
            left += reachTarget(maze,row, column,i,j-1);

        if(i<row && j< column)
        {
            right += reachTarget(maze,row,column,i,j+1);
//            diagonal += reachTarget(maze,row,column,i+1,j+1);
            down += reachTarget(maze,row,column,i+1,j);

        }
        else if(i==row && j<column)
        {
            down += reachTarget(maze,row,column,i,j+1);
        }
        else if(i<row & j==column)
        {
            right += reachTarget(maze,row,column,i+1,j);
        }

        // if this cell not visited what happens
        // we change the visited condition back to the previous state
        maze[i][j] = false;

        return right + down +diagonal +up+left;


    }
    public static void  path(String p,boolean[][] maze,int row, int column, int i, int j, int[][] path, int step)
    {
        if(row == i && column ==j)
        {
            path[i][j] = step;
            for(int[] arr: path)
                System.out.println(Arrays.toString(arr));
            System.out.println(p);
            System.out.println();
            return;
        }

        if(maze[i][j])
            return;

        maze[i][j] = true;
        path[i][j] = step;


        if(i > 0)
            path(p+"U",maze,row, column,i-1, j,path, step+1);

        if(j > 0)
            path(p+"L",maze,row, column,i,j-1, path, step+1);

        if(i<row && j< column)
        {
            path(p+"D",maze,row,column,i,j+1,path,step+1);
//            path(path+"D",row,column,i+1,j+1);
            path(p+"R",maze,row,column,i+1,j,path,step+1);
        }
        else if(i==row && j<column)
        {
            path(p+"D",maze,row,column,i,j+1,path,step+1);
        }
        else if(i<row & j==column)
        {
            path(p+"R",maze,row,column,i+1,j,path,step+1);
        }

        maze[i][j] = false;
        path[i][j] = 0;



    }
    public static void main(String[] args) {

        boolean[][] board = {
                {false,false,false},
                {false,false,false},
                {false,false,false},
        };

        int[][] path = new int[board.length][board[0].length];

        System.out.println("There are: "+reachTarget(board,2,2,0,0)+" ways to reach target");
        System.out.println("Paths to get to the target: ");
        path("",board,2,2,0,0, path, 1);
    }
}
