class Solution {
    public int minPathSum(int[][] grid) {
     int m=grid.length,n=grid[0].length;
     int [][]arr=new int[m][n];
     return find(grid,m-1,n-1,arr);
        }
    public int find(int[][] grid,int m,int n,int[][] arr)
    {
        if(m==0 && n==0) 
            return grid[0][0];
        else if(m<0 || n<0) return Integer.MAX_VALUE;
        else if(arr[m][n]!=0) return arr[m][n];

        return arr[m][n]=grid[m][n]+ Math.min(find(grid,m-1,n,arr),find(grid,m,n-1,arr));
    }
}