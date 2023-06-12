package leetcode;

import java.util.ArrayList;
import java.util.List;

public class phoneCombinations {

    static String[] com = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static List<String> combins(String p, String up)
    {
        if(up.isEmpty())
        {
            List<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        }

        int index = up.charAt(0) - '0'-1;

        List<String> preloop = new ArrayList<>();
        for(int i=0;i<com[index].length();i++)
        {
            preloop.addAll(combins(p+com[index].charAt(i),up.substring(1) ));
        }

        return preloop;
    }

    public static void main(String[] args) {

        String digits = "23";

        System.out.println(combins("",digits));


    }
}
