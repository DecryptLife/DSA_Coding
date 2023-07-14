public class fib_optimized {

    public static int fib(int n) {

        int prev2 = 0;
        int prev = 1;
        int curr = 0;

        if(n == 0)
            return prev2;

        if(n == 1)
            return prev;

        for(int i=2;i<=n;i++){
            curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }

        return curr;



    }

    public static void main(String[] args) {
        int n= 7;

        System.out.println("Fibonnaci number at the index: "+n+" is "+ fib(n));
    }
}
