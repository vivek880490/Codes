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
    int count=0;
    public int pathSum(TreeNode root, int target) {
        if(root == null) return 0;
        
        solve(root,target,0);
        pathSum(root.left,target);
        pathSum(root.right,target);
        
        return count;
    }
    
    void solve(TreeNode root,int target,int cursum){
        if(root==null) return;
        
        cursum+=root.val;
        
        if(cursum==target) count++;
        
        // if(map.containsKey(cursum-target)){
        //     count+=map.get(cursum-target);
        // }
        // map.put(cursum,map.getOrDefault(cursum,0)+1);
        
        solve(root.left,target,cursum);
        solve(root.right,target,cursum);
        //map.put(cursum,map.getOrDefault(cursum,0)-1);
        // return;
        
        
    }
}