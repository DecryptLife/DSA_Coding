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
        int diagonal = 0;
        if(i<row && j< column)
        {
            right += reachTarget(row,column,i,j+1);
            diagonal += reachTarget(row,column,i+1,j+1);
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

        return right + down +diagonal;


    }
    public static void  path(String path,int row, int column, int i, int j)
    {
        if(row == i && column ==j)
        {
            System.out.println(path);
            return;
        }


        if(i<row && j< column)
        {
            path(path+"V",row,column,i,j+1);
            path(path+"D",row,column,i+1,j+1);
            path(path+"H",row,column,i+1,j);
        }
        else if(i==row && j<column)
        {
            path(path+"V",row,column,i,j+1);
        }
        else if(i<row & j==column)
        {
            path(path+"H",row,column,i+1,j);
        }



    }
    public static void main(String[] args) {

        System.out.println("There are: "+reachTarget(2,2,0,0)+" ways to reach target");
        System.out.println("Paths to get to the target: ");
        path("",2,2,0,0);
    }

}
