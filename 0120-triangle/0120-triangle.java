class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int dp[]=new int[t.size()];
        int n=t.size();
        for(int i=0;i<n;i++)
        {
            dp[i]=t.get(n-1).get(i);
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                dp[j]=t.get(i).get(j)+Math.min(dp[j],dp[j+1]);
            }
        }
        return dp[0];
    }
   
}