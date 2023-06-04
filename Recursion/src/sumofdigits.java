public class sumofdigits {

    static int printdigitsum(int num)
    {
        if(num == 0)
            return 0;


        return printdigitsum(num/10)+num%10;
    }
    public static void main(String[] args) {
        int num = 217;
        int sum = 0;

        System.out.println("Sum of digits of "+num+" : " + printdigitsum(num));
    }
}
