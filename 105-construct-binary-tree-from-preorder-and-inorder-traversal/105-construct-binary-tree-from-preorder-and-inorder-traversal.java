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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        int n = preorder.length;
        
        return solve(preorder,0,n-1,inorder,0,n-1);
    }
    
    TreeNode solve(int preorder[],int psi,int pei,int inorder[],int isi,int iei){
        if(isi > iei) return null;
        
        int idx = isi;
        while(preorder[psi]!=inorder[idx]){
            idx++;
        }
        int len = idx-isi;
        
        TreeNode root = new TreeNode(preorder[psi]);
        
        root.left = solve(preorder,psi+1,psi+len,inorder,isi,idx-1);
        root.right = solve(preorder,psi+len+1,pei,inorder,idx+1,iei);
        
        return root;
    }
}