package recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class kthPermut {

    public static String getPerms(int n, int k) {
        int fact = 1;

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1;i<n;i++){
            fact = fact * i;
            numbers.add(fact);
        }

        numbers.add(n);
        String ans = "";
        k = k-1;
        while(true){
            ans = ans + numbers.get(k/fact);
            numbers.remove(k/fact);
            if(numbers.isEmpty())
            {
                break;
            }

            k = k % fact;
            fact =  fact/numbers.size();
        }

        return ans;
    }
    public static void main(String[] args) {
        int n=3;
        int k=3;
        System.out.println(getPerms(n,k));
    }
}
