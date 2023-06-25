package weeklyContest_351;

public class goodArraysSplit {
    public static boolean checkLeft(int pos, int[] nums)
    {
        int count = 0;
        // check left
        for(int i=0;i<=pos;i++)
        {
            if(nums[i] == 1)
                count += 1;
        }

        if(count == 1)
            return true;
        else
            return false;
    }

    public static boolean checkRight(int pos, int[] nums)
    {
        int count = 0;
        // check right
        for(int i=pos+1;i<nums.length;i++)
        {
            if(nums[i] == 1)
                count += 1;
        }
        if(count == 1)
            return true;
        else
            return false;
    }
    public static int split(int pos, int[] nums)
    {
        if(pos == nums.length-1)
            return 0;


        if(checkLeft(pos, nums) ) {
            if (checkRight(pos, nums))
                return 1;
            else
                return 0;
        }


        int count = 0;



        for(int i=1;i<nums.length;i++)
        {
            System.out.println(i);
            count = count + split(i, nums);
        }









        return count;
    }
    public static int numberOfGoodSubarraySplits(int[] nums) {

        return split(0, nums);

    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1};

        System.out.println(numberOfGoodSubarraySplits(arr));
    }
}
