import java.util.ArrayList;
import java.util.List;

class combSum {
    public static List<List<Integer>>  combinationSum(int[] candidates, int target) {

        List<List<Integer>> sol = new ArrayList<>();
        helper(candidates, target, 0, sol, new ArrayList<>());

        return sol;
    }

    public static void helper(int[] candidates, int target, int pos, List<List<Integer>> sol, List<Integer> inner){


        if(pos == candidates.length)
        {
            if(target == 0){
                sol.add(new ArrayList<>(inner));
            }
            return;
        }

        if(candidates[pos] <= target){
            inner.add(candidates[pos]);
            helper(candidates, target - candidates[pos], pos, sol, inner);
            inner.remove(inner.size()-1);
        }
        helper(candidates, target, pos+1, sol, inner);
    }

    public static void main(String[] args){

        int[] arr = {2,3,6,7};

        List<List<Integer>> res = combinationSum(arr, 7);

        System.out.println(res);
    }
}