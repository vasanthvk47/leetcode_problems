class Solution {
    public void rev(int [][] m,int n,int p)
    {
        int u=n;
        for(int i=0;i<n/2;i++)
        {
            int t=m[p][i];
            m[p][i]=m[p][u-1];
            m[p][u-1]=t;
            --u;

        }
    }
    public void rotate(int[][] m) {
        int y=1;
        for(int i=0;i<m.length;i++)
        {

            for(int j=y;j<m[0].length;j++)
            {
                int t=m[i][j];
                    m[i][j]=m[j][i];
                    m[j][i]=t;
            }
            ++y;
        }
        for(int i=0;i<m.length;i++)
        {
            rev(m,m[0].length,i);
        }
    }
}