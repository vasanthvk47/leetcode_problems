class Solution {
    public String convert(String s, int numRows) {
        int n=1,i=0,f=0;
        int arr[]=new int[s.length()];
        while(i<s.length())
        {
            arr[i]=n;
            if(n==numRows){
                f=0;
            }
            if(n==1)
            {
                f=1;
            }
            if(f==0 && n!=1) --n;
            else if(f==1 && numRows!=1) ++n;
            i++;
        }
        for( i=0;i<s.length();i++)
        System.out.println(arr[i]+" ");
        String s1="";
        n=1;
        while(n<=numRows)
        {
             i=0;
            while(i<s.length())
            {
                if(arr[i]==n) s1=s1+s.charAt(i);
                ++i;
            }
            n++;
        }
        return s1;
    }
    
}