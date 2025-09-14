class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int p1=0,p2=0,c=0;
        for(int i=2;i<=n;i++)
        {
            c=Math.min(cost[i-2]+p1,cost[i-1]+p2);
            p1=p2;
            p2=c;
        }
        return c;
    }
}