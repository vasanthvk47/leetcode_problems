/*class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        
        // Total paths = paths starting from root +
        // paths from left subtree +
        // paths from right subtree
        return countFromNode(root, targetSum) 
             + pathSum(root.left, targetSum) 
             + pathSum(root.right, targetSum);
    }

    private int countFromNode(TreeNode node, long target) {
        if (node == null) return 0;
        
        int count = 0;
        if (node.val == target) count++;

        count += countFromNode(node.left, target - node.val);
        count += countFromNode(node.right, target - node.val);

        return count;
    }
}
*/


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
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        HashMap<Long,Integer> mpp = new HashMap<>();
        mpp.put((long)0,1);
        return dfs(root,0,(long)targetSum,mpp);
    }

    int dfs(TreeNode node,long currSum, long targetSum,HashMap<Long,Integer> mpp) {
        if (node == null) return 0;
        
       currSum += node.val;
       int count = mpp.getOrDefault(currSum - targetSum,0);
       mpp.put((long)currSum,mpp.getOrDefault(currSum,0)+1);

        // Add counts from left and right subtrees
        count += dfs(node.left,currSum, targetSum, mpp);
        count += dfs(node.right,currSum, targetSum, mpp);

        // Backtrack
        mpp.put(currSum,mpp.get(currSum)-1);
        if(mpp.get(currSum) == 0){
            mpp.remove(currSum);
        }

        return count;
    }
}