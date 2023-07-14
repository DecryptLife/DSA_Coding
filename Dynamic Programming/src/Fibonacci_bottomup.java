public class Fibonacci_bottomup {

    public static int fib(int n)
    {
        int[] vals = new int[n+1];

        if(n ==0)
            return 0;

        if(n==1)
            return 1;

        vals[0] = 0;
        vals[1] = 1;


        for(int i=2;i<=n;i++)
        {
            vals[i] = vals[i-1] +vals[i-2];
        }

        return vals[vals.length -1];

    }
    public static void main(String[] args) {
        int n= 7;

        System.out.println("Fibonnaci number at the index: "+n+" is "+ fib(n));
    }
}
