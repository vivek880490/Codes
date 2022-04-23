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
    int ans = 0;
    public int maxAncestorDiff(TreeNode root) {
        
        
        if(root == null) return ans;
        
        solve(root);
        
        return ans;
    }
    
    int[] solve(TreeNode root){
        if(root == null) return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE};
        
        int left[] = solve(root.left);
        
        int right[] = solve(root.right);
        
        int leftmin = left[0];
        int rightmin = right[0];
        
        int min = Math.min(root.val, Math.min(leftmin, rightmin));
        
        
        int leftmax = left[1];
        int rightmax = right[1];
        
        int max = Math.max(root.val, Math.max(leftmax, rightmax));
        
        ans = Math.max((max - root.val), Math.max((root.val-min), ans));
        
        return new int[]{min, max};
    }
}