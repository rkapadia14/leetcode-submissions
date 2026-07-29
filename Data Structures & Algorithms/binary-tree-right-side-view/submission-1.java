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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root==null)
            return list;
        
        q.offer(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            int lastValue =0;
            for(int i =0;i<size;i++)
            {
                TreeNode n1 = q.poll();
                lastValue = n1.val;
                if(n1.left!=null)
                    q.offer(n1.left);
                if(n1.right!=null)
                    q.offer(n1.right);
                
            }
            list.add(lastValue);
        }
        return list;

        
    }
}
