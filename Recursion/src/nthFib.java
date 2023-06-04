public class nthFib {

    public static int getNthFib(int n)
    {
        if(n == 1)
            return 1;

        if(n == 0)
            return 0;

        return getNthFib(n-1) + getNthFib(n-2);
    }
    public static void main(String[] args) {

        int n = 6;

        System.out.println("The "+n+"th "+" fibonnaci number is "+getNthFib(n));
    }
}
