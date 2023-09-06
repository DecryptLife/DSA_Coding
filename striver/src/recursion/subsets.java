package recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class subsets {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1);

        ArrayList<Integer> subset = new ArrayList<>();
       helper(0,0,arr.size(), arr,subset);
        Collections.sort(subset);
        System.out.println(subset);
    }


    public static void helper(int index, int sum, int N, ArrayList<Integer> arr, ArrayList<Integer> subs){

        if(index == N)
        {
            subs.add(sum);
            return;
        }
      helper(index+1, sum + arr.get(index), N , arr, subs);
      helper(index+1, sum, N, arr, subs);

    }
}
