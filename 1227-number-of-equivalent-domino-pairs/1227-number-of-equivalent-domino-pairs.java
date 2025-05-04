class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int c=0,p=1;
        boolean arr[]=new boolean[dominoes.length];
        for (int i=0;i<dominoes.length -1 ;i++)
        {
            int a=dominoes[i][0],b=dominoes[i][1];
            p=1;
            if(!arr[i])
            for(int j=i+1;j<dominoes.length;j++)
            {
                if(  (a== dominoes[j][0] && b==dominoes[j][1] ) || (a==dominoes[j][1] && b==dominoes[j][0]) )
                {
                    p++;
                    arr[j]=true;
                }
                 
            }
            System.out.println(a+" "+b+" "+p+" ");
            c=c+((p*(p-1))/2);
        }
         return c;
    }
}