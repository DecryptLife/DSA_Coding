public class numrev {

//    static int reverse(int num,int rev)
//    {
//        if(num%10 == num)
//        {
//            return rev + num;
//        }
//        rev =(rev + num%10)*10;
//        return reverse(num/10, rev);
//
//    }

    public static int reverse(int num)
    {
        int digits = (int)(Math.log10(num))+1;

        return helper(num,digits);

    }

    public static int helper(int num, int digits)
    {
        if(num %10 == num)
        {
            return num;
        }

        int rem = num%10;
        return rem * (int) Math.pow(10, (digits - 1))+ helper(num/10, digits -1);
    }
    public static void main(String[] args) {

        int num = 8729;

        System.out.println("Reverse of "+num+" is : "+ reverse(num));
    }
}


