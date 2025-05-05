class Solution {
    public int numTilings(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 5;

        long[] a = new long[n + 1];
        int mod = 1_000_000_007;

        a[0] = 1;
        a[1] = 1;
        a[2] = 2;
        a[3] = 5;

        for (int i = 4; i <= n; i++) {
            a[i] = (2 * a[i - 1] % mod + a[i - 3] % mod) % mod;
        }

        return (int) a[n];
    }
}
