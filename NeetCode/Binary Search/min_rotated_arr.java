class Solution {
    public int findMin(int[] nums) {
        int ub = nums.length-1;
        int lb = 0;
        int mid = 0;

        int min = Integer.MAX_VALUE;

        if(nums.length == 1) return nums[0];
        while(lb <= ub){
            mid = (ub+lb)/2;
           
           if(nums[lb] < nums[ub]){
               min = Math.min(min, nums[lb]);
               break;
           }
           // find sorted portion and ignore it

           if(nums[lb] <= nums[mid]){

               // store minimum of sorted and ignore it
               min = Math.min(min, nums[lb]);
               lb = mid+1;
           }else{
               min = Math.min(min, nums[mid]);
               ub = mid-1;

           }

        }


        return min;
    }
}