public class skipWord {

    static String skipWord(String s, String skip)
    {
        return helper(s, skip, 0);

    }

    static String helper(String s, String skip, int index)
    {

        if((index + skip.length()) > s.length())
            return s;


        if(s.substring(index,index+skip.length()).equals(skip))
            s = s.substring(0,index) + s.substring(index+skip.length());


        return helper(s, skip, index+1);
    }
    public static void main(String[] args) {
        String s = "something something something";

        String skip = "thing";

        System.out.println("Removing str from string: "+ skipWord(s, skip));
    }
}
