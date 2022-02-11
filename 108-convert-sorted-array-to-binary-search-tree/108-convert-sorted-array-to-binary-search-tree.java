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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        if(n==0) return null;
        
        return solve(nums,0,n-1);
    }
    
    TreeNode solve(int [] nums,int l,int h){
        
        if(l>h) return null;

        int mid=(l+h)/2;
        int val=nums[mid];
        TreeNode left=solve(nums,l,mid-1);
        TreeNode right=solve(nums,mid+1,h);
        
        TreeNode node= new TreeNode(val,left,right);
        return node;
    }
}