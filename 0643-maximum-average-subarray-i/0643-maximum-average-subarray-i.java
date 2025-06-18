class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        double m=0;
        for(;i<k;i++)
        m=m+nums[i];
        double m1=m/k;
        int l=0;
        double r=m;
        for(;i<nums.length;i++)
        {
            r=r+nums[i];
            r=r-nums[l];
            double y=r/k;
            m1=Math.max(m1,r/k);
            l++;
        }
        
        return m1;
    }
}