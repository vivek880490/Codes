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
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root==null) return null;
        
        if(root.val>key){
           root.left = deleteNode(root.left,key); 
        }
        else if(root.val<key){
            root.right = deleteNode(root.right,key);
        }
        else{
        if(root.left!=null && root.right!=null){
            
            int lmax=max(root.left);
            root.val=lmax;
            root.left=deleteNode(root.left,lmax);
            
        }
            else if(root.left!=null){
                return root.left;
                
            }
            else if(root.right!=null){
                return root.right;
                
            }
            else if(root.left==null && root.right==null){
                return null;
            }
            
        }
        return root;
        
    }
    
    int max(TreeNode node){
        if(node.right!=null){
            return max(node.right);
        }
        else return node.val;
    }
}