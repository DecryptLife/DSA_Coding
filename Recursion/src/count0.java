public class count0 {

    static int getCount(int num, int count)
    {
        if(num%10 == num)
            return count;

        if(num%10 == 0)
            count+=1;

        return getCount(num/10, count);
    }

    public static void main(String[] args) {
        int num = 201080;

        System.out.println("Number of 0's in "+num+" is "+getCount(num,0));
    }
}
