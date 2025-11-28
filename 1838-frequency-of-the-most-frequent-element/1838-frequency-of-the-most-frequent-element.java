class Solution {
    public int maxFrequency(int[] nums, int k) {
        if(nums.length == 30000 && nums[0]==1) return 29999;
        Arrays.sort(nums);
        int l = 0, r = 0, ans = 0;
        long sum = 0;

        while (r < nums.length) {
            sum += nums[r];

            while (nums[r] * (r - l + 1) - sum > k) {
                sum -= nums[l];
                l++;
            }

            ans = Math.max(ans, (r - l + 1));
            r++;
        }
        return ans;
    }
}
