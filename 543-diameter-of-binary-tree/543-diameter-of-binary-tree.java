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
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return res-1;
    }
    
    int solve(TreeNode root){
        if(root == null) return 0;
        
        int l = solve(root.left);
        int r = solve(root.right);
        
        int temp = 1 + Math.max(l,r);
        
        int ans = Math.max(1+l+r,temp);
        
        res = Math.max(res, ans);
        
        
        return temp;
    }
}