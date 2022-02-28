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
    
    public class pair{
        int f=-1;
        int b=-1;
        int max=0;
    }
    public int longestZigZag(TreeNode root) {
        pair ans=solve(root);
        return ans.max;
        
    }
    
    pair solve(TreeNode root){
        
        if(root==null) return new pair();
        
        
        pair left=solve(root.left);
        pair right=solve(root.right);
        
        pair myans=new pair();
        
        myans.max=Math.max(Math.max(left.max,right.max),Math.max(left.b,right.f)+1);
        
        myans.f=left.b+1;
        myans.b=right.f+1;
        
        return myans;
    }
}