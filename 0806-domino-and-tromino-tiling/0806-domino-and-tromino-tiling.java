class Solution {
    public int numTilings(int n) {
        if(n>2){
                long a[]=new long[n];
                a[0]=1;a[1]=2;a[2]=5;
                for(int i=4;i<=n;i++)
                {
                    a[i-1]=(((a[i-2]*2)+a[i-4]) %1000000007);
                }
             return ((int)(((a[n-1]))));
        }
        else
        {
            return n;
        }
    }
}