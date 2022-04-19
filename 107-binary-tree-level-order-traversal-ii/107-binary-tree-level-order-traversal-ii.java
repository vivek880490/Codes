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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        
        
        
        Queue<TreeNode>q=new LinkedList<>();
        
        q.add(root);
        
        while(q.size()>0){
            
            int size=q.size();
             ArrayList<Integer>temp=new ArrayList<>();
            
            for(int i=0;i<size;i++){
                
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                
                TreeNode node=q.poll();
                
               
                temp.add(node.val);
            }
            ans.add(0,temp);
        
        }
        return ans;
        
    }
}