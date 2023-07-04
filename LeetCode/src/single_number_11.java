import java.util.HashMap;

public class single_number_11 {

    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(hash.containsKey(nums[i]))
            {
                hash.put(nums[i],hash.get(nums[i])+1);
            }
            else
            {
                hash.put(nums[i],1);
            }
        }

        for(Integer key: hash.keySet()){
            Integer val =  hash.get(key);
            if( val == 1)
                return key;
        }

        return -1;
    }

}
