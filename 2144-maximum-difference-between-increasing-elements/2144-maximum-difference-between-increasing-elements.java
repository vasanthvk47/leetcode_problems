class Solution {
    public int maximumDifference(int[] nums) {
        int c=-1,n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]> nums[i] && c<(nums[j]-nums[i])) c=nums[j]-nums[i];
            }
        }
        return c;
    }
}