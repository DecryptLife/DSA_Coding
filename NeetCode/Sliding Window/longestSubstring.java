class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        Set<Character> set = new HashSet<>();
        int left = 0;

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            while(!set.add(ch)){
                max = Math.max(max,set.size());
                set.remove(s.charAt(left));
                left++;
            }

            

        }

        return Math.max(set.size(), max);
    }
}