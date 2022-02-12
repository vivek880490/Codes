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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer>al=new ArrayList<>();
        if(root==null) return al;
        
        Queue<TreeNode>q=new LinkedList<>();
        
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            
            for(int i=0;i<size;i++){
                if(i==0) al.add(q.peek().val);
                if(q.peek().right!=null) q.add(q.peek().right);
                if(q.peek().left!=null) q.add(q.peek().left);
                q.poll();
                
            }
        }
        return al;
    }
}