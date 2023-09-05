import java.util.ArrayList;

public class kthPermut {

    public static String getPerms(int n, int k){
        String s = "";
        for(int i=1;i<=n;i++)
            s+=i;

        ArrayList<String> res = new ArrayList<>();

        helper("",s,res);

        return res.get(k-1);
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
        int n=3;
        int k=4;
        System.out.println(getPerms(n,k));
    }
}
