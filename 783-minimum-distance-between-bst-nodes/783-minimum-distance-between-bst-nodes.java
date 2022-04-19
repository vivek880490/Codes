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
    int min = Integer.MAX_VALUE;
    Integer pre = null;
    
    public int minDiffInBST(TreeNode root) {
        
        solve(root);
        return min;
        
        
        
    }
    
 void solve(TreeNode root){
     if(root == null) return;
     
     solve(root.left);
     
     if(pre != null){
         min = Math.min(min, root.val-pre);
     }
              pre = root.val;

     solve(root.right);
     
 }
}