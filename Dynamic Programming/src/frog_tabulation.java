import java.util.Arrays;

public class frog_tabulation {

    public static void main(String[] args) {
        int[] steps ={30,10,60,50,60,50};
        int[] dp = new int[steps.length];

        dp[0] = 0;

        for(int i=1;i<steps.length;i++){
            int first = dp[i-1] + Math.abs(steps[i] - steps[i-1]);
            int second = Integer.MAX_VALUE;
            if(i > 1)
                second = dp[i-2] + Math.abs(steps[i] - steps[i-2]);

            dp[i] = Math.min(first, second);
        }

        System.out.println(dp[steps.length-1]);
    }
}

