package permutations;

import java.util.ArrayList;

public class stringPerm {

    static void permutations(String p, String up)
    {
        if(up.length() == 0)
        {
            System.out.println(p);
            return;
        }

        for(int i=0;i<p.length()+1;i++)
            permutations(p.substring(0,i)+up.charAt(0)+p.substring(i), up.substring(1));


    }

    public static void main(String[] args) {
        String s = "abc";
        permutations("",s);
    }
}
