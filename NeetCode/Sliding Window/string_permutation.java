class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int left = 0;
        int right = s1.length();

        if(s1.length() > s2.length()) return false;
    
        int[] data = new int[26];
        int[] test = new int[26];

        for(char ch: s1.toCharArray()) data[ch - 'a']++;

        for(int i=0;i<s1.length();i++) test[s2.charAt(i) - 'a']++;


        while(left + right < s2.length()){

            // check if equal
            if(permutation(data,test)) return true;

            test[s2.charAt(left+right) - 'a']++;
            test[s2.charAt(left)-'a']--;

            left++;
        }

        return permutation(test,data);
    }

    public boolean permutation(int[] data, int[] test){

        for(int i=0;i<26;i++){
            if(data[i] != test[i]){
                return false;
            }
        }

        return true;
    }
}