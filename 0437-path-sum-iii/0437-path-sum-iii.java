class Solution {
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
