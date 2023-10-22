public class series {

    public static Long seriesSum(int i, int j, int k){

        long sum = j;
        j -=1;
        int min = Math.min(i,k);

        while(j >= min){

            if(j >= i && j >= k){
                sum += j*2;
            }
            else sum += j;

            j-=1;
        }

        return sum;
    }
    public static void main(String[] args) {
        int i = 5;
        int j = 9;
        int k = 6;

        System.out.println(seriesSum(i,j,k));
    }
}
