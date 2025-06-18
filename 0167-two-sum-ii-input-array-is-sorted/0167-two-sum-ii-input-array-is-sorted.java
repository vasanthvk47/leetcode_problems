class Solution {
    public int[] twoSum(int[] n, int target) {
        int l=0,r=n.length-1;
        while(l!=r)
        {
            if(n[l]+n[r] == target) return new int[]{l+1,r+1};
            else if(n[l]+n[r] > target) --r;
            else ++l;
        }
        return new int[]{};
    }
}