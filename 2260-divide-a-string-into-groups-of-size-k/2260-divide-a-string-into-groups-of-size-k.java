class Solution {
    public String[] divideString(String s, int k, char fill) {
        ArrayList<String> parts = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (sb.length() == k) {
                parts.add(sb.toString());
                sb.setLength(0);  // clear the builder
            }
        }

        if (sb.length() != 0) {
            while (sb.length() < k) {
                sb.append(fill);
            }
            parts.add(sb.toString());
        }

        return parts.toArray(new String[0]);
    }
}
