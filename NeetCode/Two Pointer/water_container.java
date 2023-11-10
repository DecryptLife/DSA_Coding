class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;

        int start = 0;
        int end = height.length-1;

        while(start < end){
            int cap = Math.min(height[start], height[end]) * (end-start);

            max = Math.max(cap, max);

            if(height[start] >= height[end]) end--;
            else start++;
        }

        return max;
    }
}