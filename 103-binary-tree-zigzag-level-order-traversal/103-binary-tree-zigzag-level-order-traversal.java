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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>>al=new ArrayList<>();
        
        if(root==null) return al;
        
        Queue<TreeNode>q=new LinkedList<>();
        
        q.add(root);
        boolean flag=true;
        while(q.size()>0){
            
            int size=q.size();
            
            ArrayList<Integer>ans=new ArrayList<>();
            
            //int index=i;
            for(int i=0;i<size;i++){
                
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                
                if(flag==true) ans.add(q.remove().val);
                else ans.add(0,q.remove().val);
                
                
            }
            flag=!flag;
            al.add(ans);
            
        }
        return al;
        
    }
}