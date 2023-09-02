import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combSum2 {
        public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);

            List<List<Integer>> outer = new ArrayList<>();
            helper(candidates, target, 0, outer, new ArrayList<>());

            return outer;
        }

        public static void helper(int[] candidates, int target, int pos, List<List<Integer>> outer, List<Integer> inner){

           if(target == 0)
           {
               outer.add(new ArrayList<>(inner));
               return;
           }

           for(int i= pos;i<candidates.length;i++){
               if(i>pos && candidates[i] == candidates[i-1]) continue;
               if(candidates[i] > target) break;
               inner.add(candidates[i]);
               helper(candidates, target - candidates[i], i+1, outer, inner);
               inner.remove(inner.size() -1);
           }
        }

    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};

        List<List<Integer>> sol = combinationSum2(arr, 8);

        System.out.println(sol);
    }

}
