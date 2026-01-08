class Solution {
    public static final String phone_no_char[]={
        "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits) {
       ArrayList<String> result=new ArrayList<>();
       if(digits.length()==0) return result;
       backtrack(0,result,digits,new StringBuilder());
       return result;
    }
    public void backtrack(int ind,List<String> l,String d,StringBuilder p)
    {
        if(ind == d.length())
        {
            l.add(p.toString());
            return;
        }
        String s=phone_no_char[d.charAt(ind)-'0'-1];
        for(char c : s.toCharArray())
        {
            p.append(c);
            backtrack(ind+1,l,d,p);
            p.deleteCharAt(p.length()-1);
        }
    }
}
