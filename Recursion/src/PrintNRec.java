public class PrintNRec {

    public static void main(String args[])
    {
        int size = 10;
        int start = 1;
        printNum(start,size);
    }

    static void printNum(int start, int size)
    {
        if(start == size) {
            System.out.println(start);
            return;
        }

        System.out.println(start);
        printNum(start+1,size);
        System.out.println(start);

    }
}
