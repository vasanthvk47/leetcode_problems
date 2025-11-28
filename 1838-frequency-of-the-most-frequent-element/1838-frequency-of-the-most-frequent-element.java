class Solution {
    public int maxFrequency(int[] nums, int k) {
        
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int num: nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int length = max - min+1;
        int[] count = new int[length];

        for(int num: nums){
            count[num-min]++;
        }

        int start = 0, sum = 0, ans = 0, cnt = 0, startCnt = count[0];
        for(int i = 0; i < length; i++){
            sum += cnt;
            cnt += count[i];
            while(sum > k){
                while (startCnt == 0) startCnt = count[++start];
                sum -= i - start;
                startCnt--;
                cnt--;
            }
            ans = Math.max(ans, cnt);
        }
        return ans;  
        
    }
}