class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        // Step 1: Create a StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // Step 2: Traverse the string
        int currRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currRow].append(c);

            // Flip direction at top or bottom row
            if (currRow == 0 || currRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move to next row
            currRow += goingDown ? 1 : -1;
        }

        // Step 3: Merge all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
