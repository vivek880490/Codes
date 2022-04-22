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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        
        List<TreeNode> ans = new ArrayList<>();
        
        solve(ans, root, new HashMap<>());
        return ans;
    }
    
    String solve(List<TreeNode> ans, TreeNode root, HashMap<String,Integer>map){
        if(root == null) return "#";
        
        String hash = root.val +","+solve(ans, root.left,map)+","+solve(ans, root.right, map);
        
        map.put(hash, map.getOrDefault(hash,0)+1);
        
        if(map.get(hash) == 2) ans.add(root);
        
        return hash;
    }
}