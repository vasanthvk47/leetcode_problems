class Solution {
    public int sum(int i,int j,int[] a)
    {
        int s=0;
        for(i=i;i<j;i++) s=s+a[i];
        return s;
    }
    public int countVowelStrings(int n) {
       int []a=new int[5];
       for(int i=0;i<5;i++)
       {
        a[i]=1;
       }
       for(int i=0;i<n;i++)
       {
        if(i==n-1) return sum(0,5,a);
        for(int j=0;j<5;j++)
        a[j]=sum(j,5,a);
       }
       return 0;

    }
}