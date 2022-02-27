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
    public int rob(TreeNode root) {
        int [] ans=solve(root);
        
        return Math.max(ans[0],ans[1]);
        
    }
    
    int [] solve(TreeNode root){
        if(root==null) return new int[2];
        
        int left[]=solve(root.left);
        int right[]=solve(root.right);
        
        int me[]=new int[2];
        //with roberry
        me[0] = left[1]+ root.val + right[1];
        //without robbery
        me[1] = Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        return me;
        }
}