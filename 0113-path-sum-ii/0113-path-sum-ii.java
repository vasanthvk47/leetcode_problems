/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        sum(root,targetSum,list,curr);
        return list;
    }
    public void sum(TreeNode root,int target,List<List<Integer>> list,List<Integer> curr)
    {
        if(root==null) return;
        curr.add(root.val);
        if(root.left == null && root.right == null && target==root.val){
            
            list.add(new ArrayList<>(curr));
            
        }
        else
        {
            
            sum(root.left,target-root.val,list,curr);
            sum(root.right,target-root.val,list,curr);
        }
        curr.remove(curr.size()-1);
    }
}