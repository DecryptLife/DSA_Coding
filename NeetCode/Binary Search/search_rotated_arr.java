class Solution {
    public int search(int[] nums, int target) {

        int ub = nums.length-1;
        int lb = 0;

        while(lb <= ub){

            int mid = (ub+lb)/2;

            if(mid < nums.length && nums[mid] == target) return mid;
            
            if(nums[lb] <= nums[mid]){
                if(target >= nums[lb] && target <= nums[mid]){
                    ub = mid - 1;
                }else{
                    lb = mid + 1;
                }
            }else{
                if(target >= nums[mid] && target <= nums[ub]){
                    lb = mid +1;
                }
                else{
                    ub = mid -1;
                }
            } 

        }

        return -1;
        
    }
}