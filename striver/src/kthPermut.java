import java.util.ArrayList;

public class kthPermut {

    public static ArrayList<String> getPerms(String s){

        ArrayList<String> res = new ArrayList<>();

        helper("",s,res);

        return res;
    }
    public static void helper(String p, String up, ArrayList<String> res){

        if(up.isEmpty()){
            res.add(p);
            return;
        }
        for(int i=0;i<up.length();i++)
        {
            helper(p+up.charAt(i),up.substring(0,i)+up.substring(i+1,up.length()),res);
        }
    }
    public static void main(String[] args) {
        String s = "123";

        System.out.println(getPerms(s));
    }
}
