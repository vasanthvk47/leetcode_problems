int kthFactor(int n, int k) {
    int l=1;
    for(int i=1;i<=n/2;i++)
    {
       if(n%i==0)
       {
        if(l==k)
        {
            return i;
        }
        ++l;
       }
    }
    printf("%d %d %d",l,k,n);
    if(l==k) return n;
    return -1;
}