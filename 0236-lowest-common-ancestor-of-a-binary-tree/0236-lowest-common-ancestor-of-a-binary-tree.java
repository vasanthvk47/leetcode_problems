/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> l1=new ArrayList<>();
        List<TreeNode> l2=new ArrayList<>();
        boolean a=check(root,p,l1);
        boolean b=check(root,q,l2);
        int n = l1.size()<l2.size() ? l1.size():l2.size();

        for(int i=n-1;i>=0;i--)
        {
            if(l1.get(i)==l2.get(i)) return l1.get(i); 
        }

        return p;
        
    }
    public boolean check(TreeNode root,TreeNode p,List<TreeNode> l1)
    {
        if(root==null) return false;
        if(root==p) { l1.add(root); return true;}
        l1.add(root);
        if(check(root.left,p,l1) || check(root.right,p,l1)) return true;
        l1.remove(l1.size()-1);
        return false;
    }
}