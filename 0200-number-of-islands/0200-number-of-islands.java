class Solution {
    int n,m;

    public void call(char[][] arr ,int i,int j)
    {
        if(i<0 || j<0 || i>=n || j>=m ||arr[i][j]=='0') return;
        arr[i][j]='0';
         call(arr,i-1,j);
         call(arr,i+1,j);
         call(arr,i,j-1);
         call(arr,i,j+1);
        return;
    }


    public int numIslands(char[][] grid) {
         n=grid.length;m=grid[0].length;
         int c=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    call(grid,i,j);
                    c++;
                }
            }
        }
        return c;
    }
}