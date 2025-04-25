class Solution {
    public int partitionString(String s) {
        int c[]=new int[26];
        int m=0;
        for(int i=0;i<s.length();i++)
        {
            c[s.charAt(i)-97]++;
            if(c[s.charAt(i)-97]>1) {m++; c=new int[26]; c[s.charAt(i)-97]++;}
            
        }
        return m+1;

    }
}