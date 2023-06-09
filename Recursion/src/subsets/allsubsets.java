package subsets;

import java.util.ArrayList;

public class allsubsets {

    static void printsubs(String p, String up)
    {
         if(up.isEmpty())
         {
             System.out.println(p);
             return;
         }

         char ch = up.charAt(0);

         printsubs(p+ch, up.substring(1));
         printsubs(p, up.substring(1));

    }

    static ArrayList<String> printArrayList(String p, String up)
    {

        if(up.isEmpty())
        {
            ArrayList<String> subset = new ArrayList<>();
            subset.add(p);
            return subset;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = printArrayList(p+ch, up.substring(1));
        ArrayList<String> right = printArrayList(p, up.substring(1));

        left.addAll(right);

        return left;
    }
    public static void main(String[] args) {
        String s = "abc";

         printsubs("",s);
        System.out.println(printArrayList("",s));
    }
}
