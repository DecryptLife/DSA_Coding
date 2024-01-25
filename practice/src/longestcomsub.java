import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        HashSet<String> set = new HashSet<>();

        ArrayList<String> list1 = subs("", text1);

        ArrayList<String> list2 = subs("", text2);

        for(int i=0;i<list1.size();i++){
            set.add(list1.get(i));
        }

        int len_max = 0;

        for(int i=0;i<list2.size();i++){
            String s = list2.get(i);
            if(set.contains(s)){
                len_max = Math.max(len_max, s.length());
            }
        }
        
        return len_max;
    }

    public ArrayList<String> subs(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        } 
        ArrayList<String> left = subs(p+up.charAt(0), up.substring(1));
        ArrayList<String> right = subs(p+"", up.substring(1));

        left.addAll(right);

        return left;

    }
}