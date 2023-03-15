public class isPowerOfThree {
    public static void main(String[] args) {
        int n1 = 27;
        int n2 = 36;
        int n3 = 0;

        System.out.println("Is "+n1+" power of three?: "+isPowerOfThree(n1));
        System.out.println("Is "+n2+" power of three?: "+isPowerOfThree(n2));
        System.out.println("Is "+n3+" power of three?: "+isPowerOfThree(n3));

    }

    public static boolean isPowerOfThree(int n)
    {
        if(n == 1)
            return true;
        if(n<1 || n%3 != 0)
        {
            return false;
        }

        return isPowerOfThree(n/3);

    }
}
