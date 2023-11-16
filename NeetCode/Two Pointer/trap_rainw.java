class Solution {
    public int trap(int[] height) {
        
        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];

        int left = 0;
        int right =0;

        int curr = 0;
        int cap = 0;
        for(int i=0;i<height.length;i++){

            prefix[i] =Math.max(height[i],left);
            left =  prefix[i];
        }
        for(int j=height.length-1;j>0;j--){

            suffix[j] =Math.max(height[j],right);
            right = suffix[j];
        }

        for(int i=0;i<height.length;i++){
            curr = Math.min(prefix[i],suffix[i]) - height[i];

            if(curr > 0)
                cap += curr; 
        }

        return cap;
    }
}