import java.util.Arrays;

public class frog_dp {

    public static int findMin(int[] dp, int[] steps, int pos)
    {
        if(pos == 0)
        {
            dp[pos] = 0;
            return 0;
        }

        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if(dp[pos] != -1)
            return dp[pos];

        if(pos > 0)
            left = findMin(dp, steps, pos - 1) + Math.abs(steps[pos] - steps[pos-1]);

        if(pos > 1)
            right = findMin(dp, steps, pos-2)+ Math.abs(steps[pos] - steps[pos+2]);

        return dp[pos] = Math.min(left, right);
    }
    public static void main(String[] args) {
        int[] steps ={30,10,60,50,60,50};
        int[] dp = new int[steps.length];

        Arrays.fill(dp, -1);
        System.out.println(findMin(dp,steps,steps.length-1));
    }
}
