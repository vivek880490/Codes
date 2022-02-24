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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(t==null) return true;
        if(s==null) return t==null;
        
        if(same(s,t)) return true;
        
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
    
    boolean same(TreeNode s,TreeNode t){
        if(s==null) return t==null;
        
        if(s!=null && t!=null && s.val==t.val){
            return same(s.left,t.left) && same(s.right,t.right);
        }
        else{
            return false;
        }
    }
}