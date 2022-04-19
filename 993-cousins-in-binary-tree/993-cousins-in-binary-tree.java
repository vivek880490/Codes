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
    public boolean isCousins(TreeNode root, int x, int y) {
        int a[] = new int[2];
        int b[] = new int[2];
        parent(root, x,-1,a,0);
        parent(root,y,-1,b,0);
        
        if(a[0] != b[0] && a[1] == b[1]) return true;
        return false;
        
        
        
        
        
    }
    
    void parent(TreeNode root, int x, int parent, int ans[], int depth){
        
        if(root == null) return;
        
        if(root.val == x){
            ans[0] = parent;
            ans[1] = depth;
        }
        else{
            parent(root.left, x, root.val, ans, depth+1);
            parent(root.right, x, root.val, ans, depth+1);
        }
    }
}