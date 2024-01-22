class Solution {
    public int[] findErrorNums(int[] nums) {

        int[] res = new int[2];
        int dup = -1;
        boolean[] check = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            
            if(check[nums[i]-1] == true){
                dup = nums[i];
            }

            check[nums[i] - 1] = true;
        }

        for(int j=0;j<nums.length;j++){
            if(check[j] ==false){
                res[0] = dup;
                res[1] = j+1;
                return res;
            }
        }

        return res;    
    }

}