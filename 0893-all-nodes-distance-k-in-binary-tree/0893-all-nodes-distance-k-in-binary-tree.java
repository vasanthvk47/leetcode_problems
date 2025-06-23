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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> l=new ArrayList<>();
        markparents(root);

        bfs(target,k,l);

        return l;
    }
    
    Map<TreeNode,TreeNode> map=new HashMap<>();

    public void markparents(TreeNode root)
    {
        if(root == null) return;
        if(root.left!=null)
        {
            map.put(root.left,root);
            markparents(root.left);
        }
        if(root.right!=null)
        {
            map.put(root.right,root);
            markparents(root.right);
        }
    }

    public void bfs(TreeNode target,int k,List<Integer> l)
    {
        Queue<TreeNode> q=new LinkedList<>();
        Set<TreeNode> s=new HashSet<>();
        q.offer(target);
        s.add(target);
        while(!q.isEmpty())
        {
            int n=q.size();
            if(k==0) break;
            for(int i=0;i<n;i++)
            {
                TreeNode current=q.poll();
                if(current.left!=null && !s.contains(current.left))
                {
                    q.offer(current.left);
                    s.add(current.left);
                }
                if(current.right!=null && !s.contains(current.right))
                {
                    q.offer(current.right);
                    s.add(current.right);
                }
                if(map.containsKey(current) && !s.contains(map.get(current)))
                {
                    q.offer(map.get(current));
                    s.add(map.get(current));
                }
                
            }
            k--;
        }
            while(!q.isEmpty())
            {
                l.add(q.poll().val);
            }
    }


}