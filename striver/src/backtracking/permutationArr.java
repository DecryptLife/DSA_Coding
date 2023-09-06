package backtracking;

import java.util.ArrayList;
import java.util.List;

public class permutationArr {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res =  new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        helper(0, nums, new ArrayList<Integer>(), res, visited );

        return res;
    }

    public static void helper(int size, int[] nums, List<Integer> inner, List<List<Integer>> outer, boolean[] visited){

        if(size == nums.length){
            outer.add(new ArrayList<Integer>(inner));
            return;
        }

        for(int i=0; i<nums.length;i++){
            if(visited[i]) continue;
            visited[i] = true;
            inner.add(nums[i]);
            helper(size + 1, nums, inner, outer, visited);
            inner.remove(inner.size()-1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(permute(arr));
    }
}
