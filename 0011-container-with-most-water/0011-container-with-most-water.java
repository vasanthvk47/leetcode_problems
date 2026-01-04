class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int max=0;
        while(left<right)
        {
            
            int min=Math.min(height[left] , height[right] );
            if( max < (min* (right-left)) )
                max = min * (right-left);
            if(height[left] > height[right] ) right--;
            else  left++;
        }
        return max;
    }
}