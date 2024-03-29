import java.util.HashMap;

public class two_sum {
        public int[] twoSum(int[] nums, int target) {
    
            HashMap<Integer, Integer> sc = new HashMap<>();
    
            for(int i=0;i<nums.length;i++){
                
                if(sc.containsKey(target - nums[i])){
                    return new int[]{sc.get(target-nums[i]), i};
                }
                else{
                    sc.put(nums[i],i);
                }
            }
    
            return new int[]{-1,-1};
        }
    
}
