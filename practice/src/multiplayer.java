public class multiplayer {

    public static int findDiff(int[] numSeq, int n){
        int start = 0;
        int end = n-1;
        boolean reversed = false;
        int pos = 0;
        int step = 0;
        int[] scores = new int[2];
        while(step < n){

            if(!reversed){
                pos = start;

                if(step%2 == 0) scores[0]+= numSeq[pos];
                else scores[1] += numSeq[pos];


                start+=1;
            }else{
                pos = end;

                if(step%2 == 0) scores[0]+= numSeq[pos];
                else scores[1] += numSeq[pos];

                
                end-=1;
            }

            if(numSeq[pos]%2 == 0) reversed = true;

            step+=1;
        }

        return scores[0] - scores[1];
    }
    public static void main(String[] args) {
        int[] numSeq = {3,6,2,3,5};
        int n = 5;

        System.out.println(findDiff(numSeq,n));
    }
}
