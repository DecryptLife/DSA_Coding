class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[k]+nums[j] == 0)
                    {
                        List<Integer> newList = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                        if(set.add(newList)) res.add(newList);
                    }
                }
            }
        }

        return res;
    }
}