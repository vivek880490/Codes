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
    TreeNode head;
    TreeNode pre;
    public TreeNode increasingBST(TreeNode root) {
        
       
        
        solve(root);
        
        return head;
        
    }
    
    void solve(TreeNode root){
        if(root == null) return;
        
        solve(root.left);
        
        if(head == null) {
            head = root;
        }
        else{
            pre.right = root;
        }
        
        pre = root;
        root.left = null;
       
        solve(root.right);
    }
    
    
}