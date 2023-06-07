public class pattern1 {

    static void generatePattern(int row, int col)
    {
        if(row == 0)
            return;

        if(col < row){
            System.out.print("* ");
            generatePattern(row, col+1);

        }
        else
        {
            System.out.println();
            generatePattern(row-1,0);

        }
    }
    public static void main(String[] args) {

        int row  =4;
        int col = 0;
        generatePattern(row,col);
    }
}
