int kthFactor(int n, int k) {
    int factors[1000]; 
    int count = 0;
    for (int i = 1; i <= n; ++i) {
        if (n % i == 0) {
            factors[count++] = i;
            if (count == k)
                return i; 
        }
    }
    return -1;
}
