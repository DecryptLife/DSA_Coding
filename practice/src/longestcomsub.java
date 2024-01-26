class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n = text1.length();
        int m = text2.length();

        return subs(n-1,m-1, text1, text2);
    }

    public int subs(int i, int j, String s1, String s2){

        if(i<0 || j<0) return 0;

        if(s1.charAt(i) == s2.charAt(j)){
            return 1 + subs(i-1,j-1, s1, s2);
        }

        return Math.max(subs(i-1,j, s1, s2), subs(i,j-1, s1, s2));
    }
}