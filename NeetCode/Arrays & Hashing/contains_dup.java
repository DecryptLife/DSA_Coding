import java.util.HashSet;
import java.util.Set;

class contains_dup {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int ele: nums){
            if(!set.add(ele)){
                return true;
            }
        }

        return false;
    }
}