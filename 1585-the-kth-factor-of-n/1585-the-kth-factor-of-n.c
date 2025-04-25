int kthFactor(int n, int k) {
    int l=1;
    for(int i=1;i<=n;i++)
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
    return -1;
}