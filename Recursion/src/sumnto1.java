public class sumnto1 {

    static int printsum(int n)
    {
        if(n <= 1)
            return 1;

        return n + printsum(n-1);
    }
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Sum of first "+n+" numbers: "+printsum(n));
    }
}
