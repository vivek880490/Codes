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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        int n = inorder.length;
        
        return solve(inorder,0,n-1,postorder,0,n-1);
        
        
    }
    
    TreeNode solve(int inorder[],int isi,int iei,int postorder[],int psi,int pei){
        
        if(isi>iei) return null;
        
        int idx = isi;
        
        while(postorder[pei]!=inorder[idx]) idx++;
        
        int len = idx - isi;
        
        TreeNode root = new TreeNode (postorder[pei]);
        
        root.left = solve(inorder,isi,idx-1,postorder,psi,psi+len-1);
        root.right = solve(inorder,idx+1,iei,postorder,psi+len,pei-1);
        
        return root;
    }
}