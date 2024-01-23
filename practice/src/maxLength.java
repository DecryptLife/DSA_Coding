import java.util.List;

class Solution {
    public int maxLength(List<String> arr) {
        // boolean[] visited = new boolean[arr.size()];
        return helper("", arr,0);
    }

    public int helper(String p, List<String> up, int idx){

        if(!unique(p)) return 0;

        int maxlen = p.length();

        for(int i=idx;i<up.size();i++){

            maxlen = Math.max(maxlen, helper(p+up.get(i), up, i+1));
          

        }

        return maxlen;

    }

    public boolean unique(String str){
        boolean[] check = new boolean[26];

        for(int i=0;i<str.length();i++){
            if(check[str.charAt(i) -'a']) return false;

            check[str.charAt(i) -'a'] = true;
        }

        return true;
    }
}