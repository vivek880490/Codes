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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        
        int n = preorder.length;
        
        return solve(preorder,0,n-1,postorder,0,n-1);
        
        
        
    }
    
    TreeNode solve(int pre[], int pres, int pree, int post[], int pos, int poe){
        if(pres > pree) return null;
        
        TreeNode root = new TreeNode(pre[pres]);
        
        if(pres == pree) return root;
        
        int idx = pos;
        
        while(post[idx] != pre[pres+1]) idx++;
        
        int tnel = idx-pos+1;
        
        root.left = solve(pre,pres+1,pres+tnel,post,pos,idx);
        root.right = solve(pre,pres+tnel+1,pree,post,idx+1,poe-1);
        
        return root;
    }
}