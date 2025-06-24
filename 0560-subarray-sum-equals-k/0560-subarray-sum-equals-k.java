class Solution {
    public int subarraySum(int[] nums, int k) {
        int c = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // one way to have sum exactly equal k from start
        for (int num : nums) {
            sum += num;
            int needed = sum - k;
            c += map.getOrDefault(needed, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return c;
    }
}