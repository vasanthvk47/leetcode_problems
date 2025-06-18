class Pair{
    int value,index;
    public Pair(int v,int i)
    {
        this.value=v;
        this.index=i;
    }
}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Pair p[]=new Pair[nums.length];
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            p[i]=new Pair(nums[i],i);
        }
        Arrays.sort(p,(a,b) -> Integer.compare(a.value,b.value));
        int l=0,r=n-1;
        while(l!=r)
        {
            if(target == p[l].value + p[r].value) 
                return new int[] {p[l].index,p[r].index};
            else if(target < p[l].value + p[r].value)
                --r;
            else
                l++;
        }
        return new int[]{};
    }
}