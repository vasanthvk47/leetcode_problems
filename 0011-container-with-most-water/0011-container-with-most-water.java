class Solution {
    public int maxArea(int[] h) {
        int m=0;
        int l=0,r=h.length-1;
        while(l<r)
        {
            int v=Math.min(h[l],h[r]);
            System.out.print(v+" ");
            int dis=r-l;
            v=v*dis;
            m=Math.max(v,m);
            System.out.println(v+" "+dis+" "+m);
            if(h[l]<h[r]) ++l;
            else if(h[l]>h[r]) --r;
            else {++l;--r;}
        }
        return m;
    }
}