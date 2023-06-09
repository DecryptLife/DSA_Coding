public class removeChar {

    static String remove(String str)
    {
        return helper(str,0);
    }

    static String helper(String str, int index)
    {
        if(index>str.length())
            return str;

        if(str.charAt(index) ==  'a')
            str = str.substring(0,index) + str.substring(index+1,str.length());

        return helper(str,index+1);
    }


    public static void main(String[] args) {
        String s = "banana";

        System.out.println(s + " after removal: "+remove(s));
    }
}
