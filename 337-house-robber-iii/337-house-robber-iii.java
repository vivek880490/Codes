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
        int arr[]=solve(root);
        
       
        
        return Math.max(arr[0],arr[1]);
        
        
    }
   
    
    int [] solve(TreeNode root){
        if(root==null) return new int[2];
         int left[]=solve(root.left);
        int right[]=solve(root.right);
         int nums[]=new int[2];
        nums[0] =  left[1]+root.val+right[1];
        
        nums[1]= Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        
        return nums;
    }

}