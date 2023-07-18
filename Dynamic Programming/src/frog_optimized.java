import java.util.Arrays;

public class frog_optimized{
    public static void main(String[] args) {
        int[] steps ={30,10,60,50,60,50};
        int[] dp = new int[steps.length];

        int prev1 = 0;
        int prev2 = Integer.MAX_VALUE;

        for(int i=1;i<steps.length;i++){
            int first = prev1 + Math.abs(steps[i] - steps[i-1]);
            int second = Integer.MAX_VALUE;
            if(i > 1)
                second = prev2 + Math.abs(steps[i] - steps[i-2]);

            prev2 = prev1;
            prev1 = Math.min(first, second);
        }

        System.out.println(prev1);
    }
}

