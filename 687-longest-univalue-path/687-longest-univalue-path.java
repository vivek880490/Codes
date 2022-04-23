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
    int len = 0;
    public int longestUnivaluePath(TreeNode root) {
        len = 0;
        if(root == null) return 0;
        
        solve(root, root.val);
        
        return len;
    }
    
    int solve(TreeNode root, int val){
        if(root == null) return 0;
        
        int left = solve(root.left, root.val);
        int right = solve(root.right, root.val);
        
        len = Math.max(len, left + right);
        
        if(val == root.val) return Math.max(left, right)+1;
        
        return 0;
    }
}