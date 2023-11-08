class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);

        int count = 1;
        int gc = 1;
        if(!(nums.length>0)) return 0;
        int prev = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] == prev) continue;
            if(!(nums[i]-1 == prev)){
                gc = Math.max(count, gc);
                count=0;
            }
            count++;
            prev = nums[i];
        }

        return Math.max(gc, count);
        
    }
}