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
    int count;
    public int minCameraCover(TreeNode root) {
        count=0;
        // agar root hi ko camera chahiye to count badhana parega
        if(solve(root)==-1) count++;
        
        return count;
        
    }
    int solve(TreeNode root){
        // -1 -> need camera
        // 1 -> don not need camera
        // 0 -> covered
        // agar null hai to wo covered hai maan lenge
        if(root==null) return 1;
        
        int left=solve(root.left);
        int right=solve(root.right);
        
        // agar koi ek child ko bhi camera ka jarrorat hai to count++;
        
        if(left==-1 || right ==-1){
            count++;
            return 0;
        }
        if(left==0 || right==0) return 1;
        return -1;
        
    }
}