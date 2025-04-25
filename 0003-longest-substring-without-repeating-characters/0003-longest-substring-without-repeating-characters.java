class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] c = new int[128];
            int currLen = 0;

            for (int j = i; j < s.length(); j++) {
                if (c[s.charAt(j)] > 0) {
                    break;
                }
                c[s.charAt(j)]++;
                currLen++;
            }

            if (currLen > maxLen) {
                maxLen = currLen;
            }
        }

        return maxLen;
    }
}
