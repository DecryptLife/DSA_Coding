package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetNoDups {

    public static void main(String[] args) {
        int[] arr = {1,2,2};


        List<List<Integer>> res = subsNoDups(arr);

        System.out.println(res);
    }

    public static List<List<Integer>> subsNoDups(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        helper(0, arr, outer, new ArrayList<>());
        return outer;
    }

    public static void helper(int index,  int[] arr, List<List<Integer>> outer, List<Integer> inner){
        outer.add(new ArrayList<>(inner));
        for(int i=index;i<arr.length;i++)
        {
            if(i!=index && arr[i] == arr[i-1]) continue;
            inner.add(arr[i]);
            helper(i+1, arr, outer, inner);
            inner.remove(inner.size() -1);
        }
    }


}
