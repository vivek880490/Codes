/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    
    
        List<Integer> ans = new ArrayList<>();
        
        solve(root, target.val, k, ans);
        return ans;
        
    }
    
    
    void kdown(TreeNode root, int k, TreeNode block, List<Integer> ans){
        
        if(root == null || k < 0 || root == block) return;
        
        if(k == 0){
            ans.add(root.val);
            return;
        }
        
        kdown(root.left, k-1, block, ans);
        kdown(root.right, k-1, block, ans);
        
    }
    
    int solve(TreeNode root, int target, int k, List<Integer> ans){
        
        if(root == null) return -1;
        
        if(root.val == target){
            kdown(root, k - 0, null, ans);
            return 1;
        }
        
        int ld = solve(root.left, target, k, ans);
        
        if(ld != -1){
            kdown(root, k-ld, root.left, ans);
            return ld+1;
        }
        
        int rd = solve(root.right, target, k, ans);
        
        if(rd != -1){
            kdown(root, k-rd, root.right, ans);
            return rd+1;
        }
        
        return -1;
    }
}