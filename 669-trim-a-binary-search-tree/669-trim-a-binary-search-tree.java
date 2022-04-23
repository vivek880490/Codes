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
    public TreeNode trimBST(TreeNode root, int low, int high) {
      
        return solve(root, low, high);
        
    }
    
    TreeNode solve(TreeNode root, int low, int high){
          if(root == null) return null;
        // agar root hi bara hai to right side me to sab bara hi hoga
        if(root.val > high){
            return solve(root.left, low, high);
        }
        
        // agar root hi chota hai to left side me sab to chota hi hoga
        if(root.val < low){
            return solve(root.right, low, high);
        }
        // dono me se koi condition nahi hua to  left, right dono ko bacha lenge
        root.left = solve(root.left, low, high);
        root.right = solve(root.right, low, high);
        
        return root;
    }
}