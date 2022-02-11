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
        
        int n=preorder.length;
        return solve(preorder,0,n-1,inorder,0,n-1);
        
    }
    
    TreeNode solve(int preorder[],int psi,int pei,int inorder[],int isi,int iei){
        
        if(isi>iei){
            return null;
        }
        
        int idx=isi;
        while(preorder[psi]!=inorder[idx]){
            idx++;
        }
        
        int colst=idx-isi;
        
        TreeNode node=new TreeNode(preorder[psi]);
        
        node.left=solve(preorder,psi+1,psi+colst,inorder,isi,idx-1);
        node.right=solve(preorder,psi+colst+1,pei,inorder,idx+1,iei);
        
        return node;
        
    }
    
    
}