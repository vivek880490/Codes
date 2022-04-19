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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        
        TreeNode cur = root;
        
        while(cur != null){
            if(cur.left == null){
               al.add(cur.val);
                cur = cur.right;
            }
            else{
                TreeNode rightnode = solve(cur.left, cur);
                
                if(rightnode.right == null){
                    rightnode.right = cur;
                    cur = cur.left;
                }
                else{
                    rightnode.right = null;
                    al.add(cur.val);
                    cur = cur.right;
                }
            }
        }
        return al;
    }
    
    TreeNode solve(TreeNode left, TreeNode cur){
        
        while(left.right != null && left.right != cur){
            left = left.right;
        }
        return left;
    }
}