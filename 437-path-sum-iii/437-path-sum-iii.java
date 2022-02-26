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
        
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        
        solve(root,0,target,map);
        
        return count;
    }
    
    void solve(TreeNode root,int cursum,int target,HashMap<Integer,Integer>map){
        if(root==null) return;
        
        cursum+=root.val;
        
        if(map.containsKey(cursum-target)){
            count+=map.get(cursum-target);
        }
        map.put(cursum,map.getOrDefault(cursum,0)+1);
        
        solve(root.left,cursum,target,map);
        solve(root.right,cursum,target,map);
        map.put(cursum,map.getOrDefault(cursum,0)-1);
        return;
        
        
    }
}