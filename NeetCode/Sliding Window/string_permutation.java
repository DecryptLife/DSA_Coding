class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int left = 0;
        int right = s1.length();
        String sub = "";
        char[] s1_arr = s1.toCharArray();
        char[] sub_arr = new char[right];
        Arrays.sort(s1_arr);

        while(left + right <= s2.length()){

            sub = s2.substring(left,left+right);
            sub_arr = sub.toCharArray();
            Arrays.sort(sub_arr);
            boolean check = true;
            for(int i=0;i<s1.length();i++){
                if(s1_arr[i] != sub_arr[i]){
                    check = false;
                    break;
                }
            }

            if(check) return true;

            left++;

        }

        return false;
    }
}