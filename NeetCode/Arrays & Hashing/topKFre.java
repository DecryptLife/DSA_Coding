class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            hash.merge(nums[i],1,Integer::sum);
        }


        List<Integer>  list = new ArrayList<>(hash.keySet());
        list.sort((a,b) -> hash.get(b)-hash.get(a));
        int[] res = new int[k];
        for(int i =0;i<res.length;i++){
            res[i] = list.get(i);
        }

        return res;
        
    }
}