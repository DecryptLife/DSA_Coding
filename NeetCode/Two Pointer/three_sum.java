class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        HashMap<Integer,Integer> hash = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        int sum = 0;
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                sum = -(nums[i]+nums[j]);

                if(hash.containsKey(sum)){
                    int index = hash.get(sum);
                    List<Integer> newList = new ArrayList<>(Arrays.asList(nums[i], sum, nums[j]));

                    if((index != i || index != j )&& set.add(newList)) res.add(newList);
                }

                hash.put(nums[j], j);
            }
            hash = new HashMap<>();
        }

        return res;
    }
}