class Solution {
    public int maxChunksToSorted(int[] arr) {
        int c=0;
        int ma=0;
        for(int i=0;i<arr.length;i++)
        {
            ma=Math.max(arr[i],ma);
            if(ma==i) c++;


        }
        return c;
    }
}