package leetcode;

public class diceThrow {


    public static int combos(int n, int k, int target)
    {

        if(n == 0)
        {
            if(target == 0)
                return 1;
            else
                return 0;

        }


        int count = 0;
        for(int i = 1;i<=k;i++)
        {
            count = count + combos(n-1,k,target-i);
        }

        return count;
    }
    public static void main(String[] args) {

        int n =2;
        int k =6;
        int target = 7;

        System.out.println("Combinations: "+combos(n,k,target));
    }
}
