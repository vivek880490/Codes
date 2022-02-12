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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>>res=new ArrayList<>();
        
        List<Integer>ans=new ArrayList<>();
        
        solve(root,res,ans,targetSum);
        return res;
        
    }
    
    void solve(TreeNode root, List<List<Integer>>res,List<Integer>ans,int target){
        
        if(root==null) return;
        
        if(root.left==null && root.right==null){
            if(target-root.val==0){
                ArrayList<Integer>temp=new ArrayList<>(ans);
                temp.add(root.val);
                res.add(temp);
            }
        }
        
        
        ans.add(root.val);
        solve(root.left,res,ans,target-root.val);
        solve(root.right,res,ans,target-root.val);
        
        ans.remove(ans.size()-1);
    }
}