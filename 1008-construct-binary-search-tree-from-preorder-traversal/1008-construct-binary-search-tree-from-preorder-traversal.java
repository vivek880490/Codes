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
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        int lr = -(int)1e9+1;
        int rr = (int)1e9-1;
        
        return solve(preorder,lr,rr);
    }
    int idx = 0;
    
    TreeNode solve(int pre[],int lr, int rr){
        
        if(idx >= pre.length || pre[idx] < lr || pre[idx] > rr) return null;
        
        TreeNode root = new TreeNode(pre[idx]);
        idx++;
        
        root.left = solve(pre, lr, root.val);
        
        root.right = solve(pre, root.val, rr);
        
        return root;
        
    }
}