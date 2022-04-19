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
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        return solve(root, low, high);
        
    }
    
    int solve(TreeNode root, int l, int h){
        if(root == null) return 0;
        
        solve(root.left, l, h);
        
        if(root.val >= l && root.val <= h){
            sum += root.val;
        }
        
        solve(root.right, l, h);
        
        return sum;
    }
    
}