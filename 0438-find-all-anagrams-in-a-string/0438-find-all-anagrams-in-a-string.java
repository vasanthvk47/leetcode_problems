// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         List<Integer> anagram_count=new ArrayList<Integer>();
//         for(int i=0;i<s.length()-p.length()+1;i++)
//         {
//             if(isAnagram(s,i,p))
//             {
//                 anagram_count.add(i);
//             }
//         }
//         return anagram_count;
//     }
//     public boolean isAnagram(String s,int i,String p)
//     {
//         int charCount[]=new int[26];

//         for(int k=i;k<i+p.length();k++)
//         {
//             char curr_char = s.charAt(k);
//             charCount[curr_char -'a']++;
//         }

//         for(int k=0;k<p.length();k++)
//         {
//             char curr_char = p.charAt(k);
//             charCount[curr_char -'a']--;
            
//         }

//         for(int k=0;k<26;k++)
//         {
//             if(charCount[k]!=0){
//                 return false;
//             }
//         }
//         return true;

//     }
// }

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26]; // frequency of characters in p
        int[] windowCount = new int[26]; // frequency of current window

        // Fill frequency for p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int windowSize = p.length();
        for (int i = 0; i < s.length(); i++) {
            // Add current char to the window
            windowCount[s.charAt(i) - 'a']++;

            // Remove char that is no longer in the window
            if (i >= windowSize) {
                windowCount[s.charAt(i - windowSize) - 'a']--;
            }

            // Compare window frequency with p's frequency
            if (Arrays.equals(pCount, windowCount)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }
}
