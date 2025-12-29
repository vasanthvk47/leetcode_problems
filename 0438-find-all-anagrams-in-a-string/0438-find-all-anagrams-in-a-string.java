class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagram_count=new ArrayList<Integer>();
        for(int i=0;i<s.length()-p.length()+1;i++)
        {
            if(isAnagram(s,i,p))
            {
                anagram_count.add(i);
            }
        }
        return anagram_count;
    }
    public boolean isAnagram(String s,int i,String p)
    {
        int charCount[]=new int[26];

        for(int k=i;k<i+p.length();k++)
        {
            char curr_char = s.charAt(k);
            charCount[curr_char -'a']++;
        }

        for(int k=0;k<p.length();k++)
        {
            char curr_char = p.charAt(k);
            charCount[curr_char -'a']--;
            
        }

        for(int k=0;k<26;k++)
        {
            if(charCount[k]!=0){
                return false;
            }
        }
        return true;

    }
}