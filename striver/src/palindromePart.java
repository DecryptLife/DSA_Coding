import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class palindromePart {

    public static List<List<String>> partitions(String s){

        List<List<String>> res = new ArrayList<>();

        helper(s, new ArrayList<String>(), res, 0);

        return res;
    }

    public static  void helper(String s, List<String> inner, List<List<String>> outer, int index){

        if(index == s.length()){
            outer.add(new ArrayList<>(inner));
            return;
        }

        for(int i=index;i<s.length();++i){

            if(isPalindrome(s, index, i)) {
                inner.add(s.substring(index,i+1));
                helper(s, inner,outer, index+1);
                inner.remove(inner.size()-1);
            }

        }
    }

    public static boolean isPalindrome(String s, int left, int right ){

        while(left <= right){
            if(s.charAt(left++) != s.charAt(right--))
                return false;
        }

        return true;

    }
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(partitions(s));
    }
}
