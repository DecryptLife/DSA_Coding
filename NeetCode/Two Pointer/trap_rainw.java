class Solution {
    public int trap(int[] height) {
        
        int left = 0;
        int right = 0;
        int water = 0;
        int cap = 0;
        for(int i=0;i<height.length;i++){

            left =0;
            right =0;
            // left max
            for(int j=0;j<i;j++){
                left = Math.max(height[j], left);
            }

            // right max
            for(int k=height.length-1;k>i;k--){
                right = Math.max(height[k], right);
            }

            
            water = Math.min(left, right) - height[i];
            if(water > 0) cap+= water;



        }   

        return cap;
    }
}