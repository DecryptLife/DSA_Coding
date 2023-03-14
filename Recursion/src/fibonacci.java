public class fibonacci {

    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        calculateFib(0,1,2,5);
    }

    public static void calculateFib(int first,int second, int step, int total)
    {
        if(step == total)
        {
            return;
        }

        int sum = first + second;

        System.out.println(sum);

        calculateFib(second,sum,step+1,total);

    }
}
