public class isPowerOfThree {

    public static boolean check(int n)
    {
        if(n==1)
            return true;
        if(n%3 != 0)
                return false;


        return check(n/3);
    }
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 27;
        int n3 = 36;

        System.out.println(n1+" is "+check(n1));
        System.out.println(n2+" is "+check(n2));
        System.out.println(n3+" is "+check(n3));


    }
}
