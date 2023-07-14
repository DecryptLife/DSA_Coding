import java.util.Arrays;

public class Fibonacci {

    public static int findFib(int[] values,int num)
    {
        if(num <= 1)
            return num;

        if(values[num] != -1)
        {
            return values[num];
        }

        return values[num] = findFib(values,num-1)+findFib(values,num-2);

    }
    public static void main(String[] args) {
        int n = 7;
        int[] vals = new int[n+1];

        Arrays.fill(vals,-1);
        System.out.println("Fibonacci number at index: "+n+" is "+findFib(vals,n));
    }
}
