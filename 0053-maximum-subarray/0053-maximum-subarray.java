class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int left=0,right=0,end=nums.length;
        int sum=0;
        while(right<end)
        {
            sum+=nums[right];

           if(sum>max)
           {
            max=sum;
           }

           if(sum<0)
           {
            left=right+1;
            sum=0;
           }
           right++;
        }
        return max;
    }
}