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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while( q.size()>0){
            TreeNode rem = q.poll();
            
            
            if(rem.left != null){
                if(rem.left.left==null && rem.left.right==null){
                    sum+=rem.left.val;
                }
            }
            if(rem.left != null){
            q.add(rem.left);
            }
            
            if(rem.right != null){
                q.add(rem.right);
            }
            
        }
        
        return sum;
    }
}