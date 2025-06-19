class Solution {
    public int[][] merge(int[][] intervals) {
        // 1. Sort by Start Time: 
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // 2. Initialize: 
        List<int[]> merged = new ArrayList<>();  // To store the merged intervals
        int[] current = intervals[0];            // Start with the first interval

        // 3. Iterate and Merge: \U0001f6b6‍♀️\U0001f6b6‍♂️
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            // Check for Overlap: \U0001f914
            if (next[0] <= current[1]) {
                // Overlap!  Merge them. \U0001f4aa
                current[1] = Math.max(current[1], next[1]); // Extend the current interval
            } else {
                // No Overlap!  The current interval is complete. ✅
                merged.add(current);         // Add the current interval to the result
                current = next;              // Start a new interval
            }
        }

        // 4. Add the Last Interval: ➕
        merged.add(current);  // Don't forget the last one!

        // 5. Convert to Array: ➡️
        return merged.toArray(new int[merged.size()][]); // Change from List to int[][]
    }
}