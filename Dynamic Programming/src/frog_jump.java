public class frog_jump {


    public static int findMin(int[] steps, int pos)
    {
        if(pos == 0)
        {
            return 0;
        }


        int right = Integer.MAX_VALUE;
        int left  = Integer.MAX_VALUE;
        if(pos > 0)
            left = findMin(steps, pos-1) + Math.abs(steps[pos] - steps[pos-1]);
        if(pos > 1)
            right  = findMin(steps, pos-2) + Math.abs(steps[pos] - steps[pos-2]);

        return Math.min(left, right);
    }
    public static void main(String[] args) {
        int[] steps ={30,10,60,50,60,50};

        System.out.println(findMin(steps,steps.length-1));

    }
}
