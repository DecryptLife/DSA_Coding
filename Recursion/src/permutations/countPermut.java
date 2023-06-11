package permutations;

public class countPermut {

    static int count(String p, String up)
        {
        if(up.length() == 0)
        {
//            System.out.println(p);
            return 1;
        }

        int count  = 0;
        for(int i=0;i<p.length()+1;i++)
            count = count + count(p.substring(0,i)+up.charAt(0)+p.substring(i), up.substring(1));

        return count;

    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println("No of permutations: "+count("",s));
    }
}

