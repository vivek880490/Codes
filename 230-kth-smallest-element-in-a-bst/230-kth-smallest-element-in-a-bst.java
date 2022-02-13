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
    public int kthSmallest(TreeNode root, int k) {
        
        ArrayList<Integer>al=new ArrayList<>();
        
        solve(root,al);
        Collections.sort(al);
        int ans=al.get(k-1);
        
        return ans;
        
    }
    
    void solve(TreeNode root, ArrayList<Integer>al){
        if(root==null) return;
        
        solve(root.left,al);
        al.add(root.val);
        solve(root.right,al);
        
    }
}