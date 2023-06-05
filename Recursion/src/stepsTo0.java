//Input: num = 14
//        Output: 6
//        Explanation:
//        Step 1) 14 is even; divide by 2 and obtain 7.
//        Step 2) 7 is odd; subtract 1 and obtain 6.
//        Step 3) 6 is even; divide by 2 and obtain 3.
//        Step 4) 3 is odd; subtract 1 and obtain 2.
//        Step 5) 2 is even; divide by 2 and obtain 1.
//        Step 6) 1 is odd; subtract 1 and obtain 0.
public class stepsTo0 {

    static int steps(int num)
    {
        return helper(num,0);
    }

    static int helper(int num, int steps)
    {
            if(num == 0)
                return steps;

            if(num % 2 == 0)
                return helper(num/2, steps+1);
            else
                return helper(num-1, steps+1);

    }

    public static void main(String[] args) {
        int n1 = 14;
        int n2 = 8;
        int n3 = 123;


        System.out.println("Number of steps for "+n1+" to reach 0: "+ steps(n1));
        System.out.println("Number of steps for "+n2+" to reach 0: "+ steps(n2));
        System.out.println("Number of steps for "+n3+" to reach 0: "+ steps(n3));

    }
}
