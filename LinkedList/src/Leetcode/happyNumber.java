package LinkedList.src.Leetcode;

public class happyNumber {
    public static int getSum(int n)
    {
        int sum =0;
        while(n != 0)
        {
            int rem = n%10;
            sum = sum + (rem * rem);
            n = n/10;
        }

        return sum;
    }


    public static boolean isHappy(int n) {

        int slow = n;
        int fast = n;
        do{
            slow = getSum(slow);
            fast = getSum(getSum(fast));

            if(slow == 1 || fast == 1)
                return true;

        }while(slow != fast);

        return false;
    }

    public static void main(String[] args) {

        int n1=19;
        int n2=2;

        System.out.println("Is "+n1+" a happy number? "+isHappy(n1));
        System.out.println("Is "+n2+" a happy number? "+isHappy(n2));
    }
}
