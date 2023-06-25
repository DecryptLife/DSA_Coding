package weeklyContest_351;

public class beautifulPair {

    class Solution {

        public boolean coprime(int num1, int num2)
        {

            while(num1/10 >0)
                num1 = num1/10;

            num2 = num2%10;

            int small = 0;
            if(num1 < num2)
                small = num1;
            else
                small = num2;

            int div = 0;
            for(int i=1;i<=small;i++)
            {
                if(num1%i==0 && num2%i ==0)
                    div++;
            }

            if(div == 1)
                return true;
            else
                return false;
        }

        public int countBeautifulPairs(int[] nums) {
            int count =0;
            for(int i=0;i<nums.length;i++)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    if(coprime(nums[i], nums[j]))
                    {
                        // System.out.println(nums[i],nums[j]);
                        count++;

                    }
                }
            }

            return count;
        }
    }
}
