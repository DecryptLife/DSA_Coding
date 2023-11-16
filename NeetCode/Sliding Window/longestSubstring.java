class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        for(int i=0;i<s.length();i++){

            Set<Character> set = new HashSet<>();

            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);

                if(!set.add(ch)){ break;}

            }

            max = Math.max(max,set.size());
        }   

        return max;
    }
}