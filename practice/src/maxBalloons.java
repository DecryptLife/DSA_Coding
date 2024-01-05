public class maxBalloons {
    public int maxNumberOfBalloons(String text) {
        String check = "balloon";
        int[] l_count = new int[27];
        int result = Integer.MAX_VALUE;

        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);

            l_count[(int) ch - 96] += 1;
        }

        l_count[(int)'l' -96] /= 2;
        l_count[(int)'o' -96] /= 2;
        

        for(int i=0;i<check.length();i++){

            result = Math.min(result, l_count[(int)check.charAt(i) - 96]);
        }

        return result;


    }
} maxBalloons {
    
}
